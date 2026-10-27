package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
class ChannelX11 extends Channel {
    private static final int LOCAL_MAXIMUM_PACKET_SIZE = 16384;
    private static final int LOCAL_WINDOW_SIZE_MAX = 131072;
    private static final int TIMEOUT = 10000;
    static byte[] cookie = null;
    private static byte[] cookie_hex = null;
    private static String host = "127.0.0.1";
    private static int port = 6000;
    private static Hashtable faked_cookie_pool = new Hashtable();
    private static Hashtable faked_cookie_hex_pool = new Hashtable();
    private static byte[] table = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    private boolean init = true;
    private Socket socket = null;
    private byte[] cache = new byte[0];

    public ChannelX11() {
        setLocalWindowSizeMax(LOCAL_WINDOW_SIZE_MAX);
        setLocalWindowSize(LOCAL_WINDOW_SIZE_MAX);
        setLocalPacketSize(LOCAL_MAXIMUM_PACKET_SIZE);
        this.type = Util.str2byte("x11");
        this.connected = true;
    }

    private byte[] addCache(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.cache;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        byte[] bArr4 = this.cache;
        if (bArr4.length > 0) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        this.cache = bArr3;
        return bArr3;
    }

    private static boolean equals(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] getFakedCookie(Session session) {
        byte[] bArr;
        int i;
        synchronized (faked_cookie_hex_pool) {
            try {
                bArr = (byte[]) faked_cookie_hex_pool.get(session);
                if (bArr == null) {
                    Random random = Session.random;
                    byte[] bArr2 = new byte[16];
                    synchronized (random) {
                        random.fill(bArr2, 0, 16);
                    }
                    faked_cookie_pool.put(session, bArr2);
                    bArr = new byte[32];
                    for (i = 0; i < 16; i++) {
                        int i2 = i * 2;
                        byte[] bArr3 = table;
                        bArr[i2] = bArr3[(bArr2[i] >>> 4) & 15];
                        bArr[i2 + 1] = bArr3[bArr2[i] & 15];
                    }
                    faked_cookie_hex_pool.put(session, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public static void removeFakedCookie(Session session) {
        synchronized (faked_cookie_hex_pool) {
            faked_cookie_hex_pool.remove(session);
            faked_cookie_pool.remove(session);
        }
    }

    public static int revtable(byte b) {
        int i = 0;
        while (true) {
            byte[] bArr = table;
            if (i >= bArr.length) {
                return 0;
            }
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
    }

    public static void setCookie(String str) {
        cookie_hex = Util.str2byte(str);
        cookie = new byte[16];
        for (int i = 0; i < 16; i++) {
            int i2 = i * 2;
            cookie[i] = (byte) (((revtable(cookie_hex[i2]) << 4) & 240) | (revtable(cookie_hex[i2 + 1]) & 15));
        }
    }

    public static void setHost(String str) {
        host = str;
    }

    public static void setPort(int i) {
        port = i;
    }

    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    public void run() {
        IO io;
        InputStream inputStream;
        try {
            Socket socketCreateSocket = Util.createSocket(host, port, TIMEOUT);
            this.socket = socketCreateSocket;
            socketCreateSocket.setTcpNoDelay(true);
            IO io2 = new IO();
            this.io = io2;
            io2.setInputStream(this.socket.getInputStream());
            this.io.setOutputStream(this.socket.getOutputStream());
            sendOpenConfirmation();
            this.thread = Thread.currentThread();
            Buffer buffer = new Buffer(this.rmpsize);
            Packet packet = new Packet(buffer);
            while (this.thread != null && (io = this.io) != null && (inputStream = io.in) != null) {
                try {
                    byte[] bArr = buffer.buffer;
                    int i = inputStream.read(bArr, 14, bArr.length - 142);
                    if (i <= 0) {
                        eof();
                        break;
                    }
                    if (this.close) {
                        break;
                    }
                    packet.reset();
                    buffer.putByte((byte) 94);
                    buffer.putInt(this.recipient);
                    buffer.putInt(i);
                    buffer.skip(i);
                    getSession().write(packet, this, i);
                } catch (Exception unused) {
                }
            }
            disconnect();
        } catch (Exception unused2) {
            sendOpenFailure(1);
            this.close = true;
            disconnect();
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (!this.init) {
            this.io.put(bArr, i, i2);
            return;
        }
        try {
            Session session = getSession();
            byte[] bArrAddCache = addCache(bArr, i, i2);
            int length = bArrAddCache.length;
            if (length < 9) {
                return;
            }
            int i3 = ((bArrAddCache[6] & 255) * 256) + (bArrAddCache[7] & 255);
            int i4 = ((bArrAddCache[8] & 255) * 256) + (bArrAddCache[9] & 255);
            byte b = bArrAddCache[0];
            if ((b & 255) != 66 && (b & 255) == 108) {
                i3 = ((i3 << 8) & 65280) | ((i3 >>> 8) & 255);
                i4 = ((i4 << 8) & 65280) | ((i4 >>> 8) & 255);
            }
            int i5 = (-i3) & 3;
            if (length < i3 + 12 + i5 + i4) {
                return;
            }
            byte[] bArr3 = new byte[i4];
            int i6 = 12 + i3 + i5;
            System.arraycopy(bArrAddCache, i6, bArr3, 0, i4);
            synchronized (faked_cookie_pool) {
                bArr2 = (byte[]) faked_cookie_pool.get(session);
            }
            if (equals(bArr3, bArr2)) {
                byte[] bArr4 = cookie;
                if (bArr4 != null) {
                    System.arraycopy(bArr4, 0, bArrAddCache, i6, i4);
                }
            } else {
                this.thread = null;
                eof();
                this.io.close();
                disconnect();
            }
            this.init = false;
            this.io.put(bArrAddCache, 0, length);
            this.cache = null;
        } catch (JSchException e) {
            throw new IOException(e.toString());
        }
    }
}
