package com.jcraft.jsch;

import ipc.fdbus.Fdbus;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public abstract class Channel implements Runnable {
    static final int SSH_MSG_CHANNEL_OPEN_CONFIRMATION = 91;
    static final int SSH_MSG_CHANNEL_OPEN_FAILURE = 92;
    static final int SSH_MSG_CHANNEL_WINDOW_ADJUST = 93;
    static final int SSH_OPEN_ADMINISTRATIVELY_PROHIBITED = 1;
    static final int SSH_OPEN_CONNECT_FAILED = 2;
    static final int SSH_OPEN_RESOURCE_SHORTAGE = 4;
    static final int SSH_OPEN_UNKNOWN_CHANNEL_TYPE = 3;
    static int index;
    private static Vector pool = new Vector();
    int id;
    private Session session;
    volatile int recipient = -1;
    protected byte[] type = Util.str2byte("foo");
    volatile int lwsize_max = 1048576;
    volatile int lwsize = this.lwsize_max;
    volatile int lmpsize = 16384;
    volatile long rwsize = 0;
    volatile int rmpsize = 0;
    IO io = null;
    Thread thread = null;
    volatile boolean eof_local = false;
    volatile boolean eof_remote = false;
    volatile boolean close = false;
    volatile boolean connected = false;
    volatile boolean open_confirmation = false;
    volatile int exitstatus = -1;
    volatile int reply = 0;
    volatile int connectTimeout = 0;
    int notifyme = 0;

    public Channel() {
        synchronized (pool) {
            int i = index;
            index = i + 1;
            this.id = i;
            pool.addElement(this);
        }
    }

    public static void del(Channel channel) {
        synchronized (pool) {
            pool.removeElement(channel);
        }
    }

    public static void disconnect(Session session) {
        Channel[] channelArr;
        int i;
        int i2;
        synchronized (pool) {
            channelArr = new Channel[pool.size()];
            i2 = 0;
            for (int i3 = 0; i3 < pool.size(); i3++) {
                try {
                    Channel channel = (Channel) pool.elementAt(i3);
                    if (channel.session == session) {
                        int i4 = i2 + 1;
                        try {
                            channelArr[i2] = channel;
                        } catch (Exception unused) {
                        }
                        i2 = i4;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (i = 0; i < i2; i++) {
            channelArr[i].disconnect();
        }
    }

    public static Channel getChannel(String str) {
        if (str.equals("session")) {
            return new ChannelSession();
        }
        if (str.equals("shell")) {
            return new ChannelShell();
        }
        if (str.equals("exec")) {
            return new ChannelExec();
        }
        if (str.equals("x11")) {
            return new ChannelX11();
        }
        if (str.equals("auth-agent@openssh.com")) {
            return new ChannelAgentForwarding();
        }
        if (str.equals("direct-tcpip")) {
            return new ChannelDirectTCPIP();
        }
        if (str.equals("forwarded-tcpip")) {
            return new ChannelForwardedTCPIP();
        }
        if (str.equals("sftp")) {
            return new ChannelSftp();
        }
        if (str.equals("subsystem")) {
            return new ChannelSubsystem();
        }
        return null;
    }

    public synchronized void addRemoteWindowSize(long j) {
        this.rwsize += j;
        if (this.notifyme > 0) {
            notifyAll();
        }
    }

    public void close() {
        if (this.close) {
            return;
        }
        this.close = true;
        this.eof_remote = true;
        this.eof_local = true;
        int recipient = getRecipient();
        if (recipient == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.reset();
            buffer.putByte((byte) 97);
            buffer.putInt(recipient);
            synchronized (this) {
                try {
                    getSession().write(packet);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public void connect() throws JSchException {
        connect(0);
    }

    public void eof() {
        if (this.eof_local) {
            return;
        }
        this.eof_local = true;
        int recipient = getRecipient();
        if (recipient == -1) {
            return;
        }
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.reset();
            buffer.putByte((byte) 96);
            buffer.putInt(recipient);
            synchronized (this) {
                try {
                    if (!this.close) {
                        getSession().write(packet);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public void eof_remote() {
        this.eof_remote = true;
        try {
            this.io.out_close();
        } catch (NullPointerException unused) {
        }
    }

    public Packet genChannelOpenPacket() {
        Buffer buffer = new Buffer(100);
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 90);
        buffer.putString(this.type);
        buffer.putInt(this.id);
        buffer.putInt(this.lwsize);
        buffer.putInt(this.lmpsize);
        return packet;
    }

    public void getData(Buffer buffer) {
        setRecipient(buffer.getInt());
        setRemoteWindowSize(buffer.getUInt());
        setRemotePacketSize(buffer.getInt());
    }

    public int getExitStatus() {
        return this.exitstatus;
    }

    public InputStream getExtInputStream() {
        int i;
        try {
            i = Integer.parseInt(getSession().getConfig("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        MyPipedInputStream myPipedInputStream = new MyPipedInputStream(this, 32768, i);
        this.io.setExtOutputStream(new PassiveOutputStream(myPipedInputStream, 32768 < i), false);
        return myPipedInputStream;
    }

    public int getId() {
        return this.id;
    }

    public InputStream getInputStream() {
        int i;
        try {
            i = Integer.parseInt(getSession().getConfig("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        MyPipedInputStream myPipedInputStream = new MyPipedInputStream(this, 32768, i);
        this.io.setOutputStream(new PassiveOutputStream(myPipedInputStream, 32768 < i), false);
        return myPipedInputStream;
    }

    public OutputStream getOutputStream() {
        return new OutputStream() { // from class: com.jcraft.jsch.Channel.1
            private int dataLen = 0;
            private Buffer buffer = null;
            private Packet packet = null;
            private boolean closed = false;
            byte[] b = new byte[1];

            private synchronized void init() {
                Buffer buffer = new Buffer(Channel.this.rmpsize);
                this.buffer = buffer;
                this.packet = new Packet(buffer);
                if (this.buffer.buffer.length - 142 <= 0) {
                    this.buffer = null;
                    this.packet = null;
                    throw new IOException("failed to initialize the channel.");
                }
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (this.packet == null) {
                    try {
                        init();
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (this.closed) {
                    return;
                }
                if (this.dataLen > 0) {
                    flush();
                }
                this.eof();
                this.closed = true;
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                if (this.closed) {
                    throw new IOException("Already closed");
                }
                if (this.dataLen == 0) {
                    return;
                }
                this.packet.reset();
                this.buffer.putByte((byte) 94);
                this.buffer.putInt(Channel.this.recipient);
                this.buffer.putInt(this.dataLen);
                this.buffer.skip(this.dataLen);
                try {
                    int i = this.dataLen;
                    this.dataLen = 0;
                    synchronized (this) {
                        try {
                            if (!this.close) {
                                Channel.this.getSession().write(this.packet, this, i);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    close();
                    throw new IOException(e.toString());
                }
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
                byte[] bArr = this.b;
                bArr[0] = (byte) i;
                write(bArr, 0, 1);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (this.packet == null) {
                    init();
                }
                if (!this.closed) {
                    byte[] bArr2 = this.buffer.buffer;
                    int length = bArr2.length;
                    while (i2 > 0) {
                        int i3 = this.dataLen;
                        int i4 = i2 > (length - (i3 + 14)) + Fdbus.FDB_ST_UNKNOWN ? (length - (i3 + 14)) + Fdbus.FDB_ST_UNKNOWN : i2;
                        if (i4 <= 0) {
                            flush();
                        } else {
                            System.arraycopy(bArr, i, bArr2, i3 + 14, i4);
                            this.dataLen += i4;
                            i += i4;
                            i2 -= i4;
                        }
                    }
                    return;
                }
                throw new IOException("Already closed");
            }
        };
    }

    public int getRecipient() {
        return this.recipient;
    }

    public Session getSession() throws JSchException {
        Session session = this.session;
        if (session != null) {
            return session;
        }
        throw new JSchException("session is not available");
    }

    public void init() {
    }

    public boolean isClosed() {
        return this.close;
    }

    public boolean isConnected() {
        Session session = this.session;
        return session != null && session.isConnected() && this.connected;
    }

    public boolean isEOF() {
        return this.eof_remote;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void sendChannelOpen() throws InterruptedException, JSchException {
        Session session = getSession();
        if (!session.isConnected()) {
            throw new JSchException("session is down");
        }
        session.write(genChannelOpenPacket());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.connectTimeout;
        int i = j != 0 ? 1 : 2000;
        synchronized (this) {
            while (getRecipient() == -1 && session.isConnected() && i > 0) {
                try {
                    if (j <= 0 || System.currentTimeMillis() - jCurrentTimeMillis <= j) {
                        long j2 = j == 0 ? 10L : j;
                        try {
                            this.notifyme = 1;
                            wait(j2);
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            this.notifyme = 0;
                            throw th;
                        }
                        this.notifyme = 0;
                        i--;
                    } else {
                        i = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (!session.isConnected()) {
            throw new JSchException("session is down");
        }
        if (getRecipient() == -1) {
            throw new JSchException("channel is not opened.");
        }
        if (!this.open_confirmation) {
            throw new JSchException("channel is not opened.");
        }
        this.connected = true;
    }

    public void sendOpenConfirmation() throws InterruptedException {
        Buffer buffer = new Buffer(100);
        Packet packet = new Packet(buffer);
        packet.reset();
        buffer.putByte((byte) 91);
        buffer.putInt(getRecipient());
        buffer.putInt(this.id);
        buffer.putInt(this.lwsize);
        buffer.putInt(this.lmpsize);
        getSession().write(packet);
    }

    public void sendOpenFailure(int i) {
        try {
            Buffer buffer = new Buffer(100);
            Packet packet = new Packet(buffer);
            packet.reset();
            buffer.putByte((byte) 92);
            buffer.putInt(getRecipient());
            buffer.putInt(i);
            buffer.putString(Util.str2byte("open failed"));
            buffer.putString(Util.empty);
            getSession().write(packet);
        } catch (Exception unused) {
        }
    }

    public void sendSignal(String str) {
        RequestSignal requestSignal = new RequestSignal();
        requestSignal.setSignal(str);
        requestSignal.request(getSession(), this);
    }

    public void setExitStatus(int i) {
        this.exitstatus = i;
    }

    public void setExtOutputStream(OutputStream outputStream) {
        this.io.setExtOutputStream(outputStream, false);
    }

    public void setInputStream(InputStream inputStream) {
        this.io.setInputStream(inputStream, false);
    }

    public void setLocalPacketSize(int i) {
        this.lmpsize = i;
    }

    public void setLocalWindowSize(int i) {
        this.lwsize = i;
    }

    public void setLocalWindowSizeMax(int i) {
        this.lwsize_max = i;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.io.setOutputStream(outputStream, false);
    }

    public synchronized void setRecipient(int i) {
        this.recipient = i;
        if (this.notifyme > 0) {
            notifyAll();
        }
    }

    public void setRemotePacketSize(int i) {
        this.rmpsize = i;
    }

    public synchronized void setRemoteWindowSize(long j) {
        this.rwsize = j;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void setXForwarding(boolean z) {
    }

    public void start() {
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write_ext(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.io.put_ext(bArr, i, i2);
        } catch (NullPointerException unused) {
        }
    }

    public void connect(int i) throws JSchException {
        this.connectTimeout = i;
        try {
            sendChannelOpen();
            start();
        } catch (Exception e) {
            this.connected = false;
            disconnect();
            if (!(e instanceof JSchException)) {
                throw new JSchException(e.toString(), e);
            }
            throw ((JSchException) e);
        }
    }

    public void setExtOutputStream(OutputStream outputStream, boolean z) {
        this.io.setExtOutputStream(outputStream, z);
    }

    public void setInputStream(InputStream inputStream, boolean z) {
        this.io.setInputStream(inputStream, z);
    }

    public void setOutputStream(OutputStream outputStream, boolean z) {
        this.io.setOutputStream(outputStream, z);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.io.put(bArr, i, i2);
        } catch (NullPointerException unused) {
        }
    }

    public class MyPipedInputStream extends PipedInputStream {
        private int BUFFER_SIZE;
        private int max_buffer_size;

        public MyPipedInputStream() {
            this.BUFFER_SIZE = 1024;
            this.max_buffer_size = 1024;
        }

        private int freeSpace() {
            int length = ((PipedInputStream) this).out;
            int i = ((PipedInputStream) this).in;
            if (length < i) {
                length = ((PipedInputStream) this).buffer.length;
            } else {
                if (i >= length) {
                    return 0;
                }
                if (i == -1) {
                    return ((PipedInputStream) this).buffer.length;
                }
            }
            return length - i;
        }

        public synchronized void checkSpace(int i) {
            int i2;
            try {
                int iFreeSpace = freeSpace();
                if (iFreeSpace < i) {
                    byte[] bArr = ((PipedInputStream) this).buffer;
                    int length = bArr.length - iFreeSpace;
                    int length2 = bArr.length;
                    while (length2 - length < i) {
                        length2 *= 2;
                    }
                    int i3 = this.max_buffer_size;
                    if (length2 > i3) {
                        length2 = i3;
                    }
                    if (length2 - length < i) {
                        return;
                    }
                    byte[] bArr2 = new byte[length2];
                    int i4 = ((PipedInputStream) this).out;
                    int i5 = ((PipedInputStream) this).in;
                    if (i4 < i5) {
                        byte[] bArr3 = ((PipedInputStream) this).buffer;
                        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                    } else if (i5 < i4) {
                        if (i5 != -1) {
                            System.arraycopy(((PipedInputStream) this).buffer, 0, bArr2, 0, i5);
                            byte[] bArr4 = ((PipedInputStream) this).buffer;
                            int i6 = ((PipedInputStream) this).out;
                            System.arraycopy(bArr4, i6, bArr2, length2 - (bArr4.length - i6), bArr4.length - i6);
                            ((PipedInputStream) this).out = length2 - (((PipedInputStream) this).buffer.length - ((PipedInputStream) this).out);
                        }
                    } else if (i5 == i4) {
                        byte[] bArr5 = ((PipedInputStream) this).buffer;
                        System.arraycopy(bArr5, 0, bArr2, 0, bArr5.length);
                        ((PipedInputStream) this).in = ((PipedInputStream) this).buffer.length;
                    }
                    ((PipedInputStream) this).buffer = bArr2;
                } else if (((PipedInputStream) this).buffer.length == iFreeSpace && iFreeSpace > (i2 = this.BUFFER_SIZE)) {
                    int i7 = iFreeSpace / 2;
                    if (i7 >= i2) {
                        i2 = i7;
                    }
                    ((PipedInputStream) this).buffer = new byte[i2];
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void updateReadSide() {
            if (available() != 0) {
                return;
            }
            ((PipedInputStream) this).out = 0;
            byte[] bArr = ((PipedInputStream) this).buffer;
            ((PipedInputStream) this).in = 1;
            bArr[0] = 0;
            read();
        }

        public MyPipedInputStream(int i) {
            this.BUFFER_SIZE = 1024;
            this.max_buffer_size = 1024;
            ((PipedInputStream) this).buffer = new byte[i];
            this.BUFFER_SIZE = i;
            this.max_buffer_size = i;
        }

        public MyPipedInputStream(Channel channel, int i, int i2) {
            this(i);
            this.max_buffer_size = i2;
        }

        public MyPipedInputStream(PipedOutputStream pipedOutputStream) {
            super(pipedOutputStream);
            this.BUFFER_SIZE = 1024;
            this.max_buffer_size = 1024;
        }

        public MyPipedInputStream(PipedOutputStream pipedOutputStream, int i) {
            super(pipedOutputStream);
            this.BUFFER_SIZE = 1024;
            this.max_buffer_size = 1024;
            ((PipedInputStream) this).buffer = new byte[i];
            this.BUFFER_SIZE = i;
        }
    }

    public class PassiveInputStream extends MyPipedInputStream {
        PipedOutputStream out;

        public PassiveInputStream(PipedOutputStream pipedOutputStream, int i) {
            super(pipedOutputStream, i);
            this.out = pipedOutputStream;
        }

        @Override // java.io.PipedInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            PipedOutputStream pipedOutputStream = this.out;
            if (pipedOutputStream != null) {
                pipedOutputStream.close();
            }
            this.out = null;
        }

        public PassiveInputStream(PipedOutputStream pipedOutputStream) {
            super(pipedOutputStream);
            this.out = pipedOutputStream;
        }
    }

    public class PassiveOutputStream extends PipedOutputStream {
        private MyPipedInputStream _sink;

        public PassiveOutputStream(PipedInputStream pipedInputStream, boolean z) {
            super(pipedInputStream);
            this._sink = null;
            if (z && (pipedInputStream instanceof MyPipedInputStream)) {
                this._sink = (MyPipedInputStream) pipedInputStream;
            }
        }

        @Override // java.io.PipedOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            MyPipedInputStream myPipedInputStream = this._sink;
            if (myPipedInputStream != null) {
                myPipedInputStream.checkSpace(1);
            }
            super.write(i);
        }

        @Override // java.io.PipedOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            MyPipedInputStream myPipedInputStream = this._sink;
            if (myPipedInputStream != null) {
                myPipedInputStream.checkSpace(i2);
            }
            super.write(bArr, i, i2);
        }
    }

    public void disconnect() {
        try {
            synchronized (this) {
                if (!this.connected) {
                    del(this);
                    return;
                }
                this.connected = false;
                close();
                this.eof_local = true;
                this.eof_remote = true;
                this.thread = null;
                try {
                    IO io = this.io;
                    if (io != null) {
                        io.close();
                    }
                } catch (Exception unused) {
                }
                del(this);
            }
        } catch (Throwable th) {
            del(this);
            throw th;
        }
    }

    public static Channel getChannel(int i, Session session) {
        synchronized (pool) {
            for (int i2 = 0; i2 < pool.size(); i2++) {
                try {
                    Channel channel = (Channel) pool.elementAt(i2);
                    if (channel.id == i && channel.session == session) {
                        return channel;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }
}
