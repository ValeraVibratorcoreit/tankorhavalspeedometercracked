package com.jcraft.jsch;

import java.io.InputStream;
import java.io.PipedOutputStream;
import java.net.Socket;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class ChannelForwardedTCPIP extends Channel {
    private static final int LOCAL_MAXIMUM_PACKET_SIZE = 16384;
    private static final int LOCAL_WINDOW_SIZE_MAX = 131072;
    private static final int TIMEOUT = 10000;
    private static Vector pool = new Vector();
    private Socket socket = null;
    private ForwardedTCPIPDaemon daemon = null;
    private Config config = null;

    public static abstract class Config {
        String address_to_bind;
        int allocated_rport;
        int rport;
        Session session;
        String target;
    }

    public static class ConfigDaemon extends Config {
        Object[] arg;
    }

    public static class ConfigLHost extends Config {
        SocketFactory factory;
        int lport;
    }

    public ChannelForwardedTCPIP() {
        setLocalWindowSizeMax(LOCAL_WINDOW_SIZE_MAX);
        setLocalWindowSize(LOCAL_WINDOW_SIZE_MAX);
        setLocalPacketSize(LOCAL_MAXIMUM_PACKET_SIZE);
        this.io = new IO();
        this.connected = true;
    }

    public static void addPort(Session session, String str, int i, int i2, String str2, int i3, SocketFactory socketFactory) {
        String strNormalize = normalize(str);
        synchronized (pool) {
            try {
                if (getPort(session, strNormalize, i) != null) {
                    throw new JSchException("PortForwardingR: remote port " + i + " is already registered.");
                }
                ConfigLHost configLHost = new ConfigLHost();
                configLHost.session = session;
                configLHost.rport = i;
                configLHost.allocated_rport = i2;
                configLHost.target = str2;
                configLHost.lport = i3;
                configLHost.address_to_bind = strNormalize;
                configLHost.factory = socketFactory;
                pool.addElement(configLHost);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void delPort(ChannelForwardedTCPIP channelForwardedTCPIP) {
        Session session;
        Config config;
        try {
            session = channelForwardedTCPIP.getSession();
        } catch (JSchException unused) {
            session = null;
        }
        if (session == null || (config = channelForwardedTCPIP.config) == null) {
            return;
        }
        delPort(session, config.rport);
    }

    private static Config getPort(Session session, String str, int i) {
        int i2;
        synchronized (pool) {
            for (int i3 = 0; i3 < pool.size(); i3++) {
                try {
                    Config config = (Config) pool.elementAt(i3);
                    if (config.session == session && (((i2 = config.rport) == i || (i2 == 0 && config.allocated_rport == i)) && (str == null || config.address_to_bind.equals(str)))) {
                        return config;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    public static String[] getPortForwarding(Session session) {
        int i;
        Vector vector = new Vector();
        synchronized (pool) {
            for (int i2 = 0; i2 < pool.size(); i2++) {
                try {
                    Config config = (Config) pool.elementAt(i2);
                    if (config instanceof ConfigDaemon) {
                        vector.addElement(config.allocated_rport + ":" + config.target + ":");
                    } else {
                        vector.addElement(config.allocated_rport + ":" + config.target + ":" + ((ConfigLHost) config).lport);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String[] strArr = new String[vector.size()];
        for (i = 0; i < vector.size(); i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static String normalize(String str) {
        if (str == null) {
            return "localhost";
        }
        return (str.length() == 0 || str.equals("*")) ? "" : str;
    }

    private void setSocketFactory(SocketFactory socketFactory) {
        Config config = this.config;
        if (config == null || !(config instanceof ConfigLHost)) {
            return;
        }
        ((ConfigLHost) config).factory = socketFactory;
    }

    @Override // com.jcraft.jsch.Channel
    public void getData(Buffer buffer) {
        Session session;
        setRecipient(buffer.getInt());
        setRemoteWindowSize(buffer.getUInt());
        setRemotePacketSize(buffer.getInt());
        byte[] string = buffer.getString();
        int i = buffer.getInt();
        buffer.getString();
        buffer.getInt();
        try {
            session = getSession();
        } catch (JSchException unused) {
            session = null;
        }
        Config port = getPort(session, Util.byte2str(string), i);
        this.config = port;
        if (port == null) {
            this.config = getPort(session, null, i);
        }
        if (this.config == null && JSch.getLogger().isEnabled(3)) {
            JSch.getLogger().log(3, "ChannelForwardedTCPIP: " + Util.byte2str(string) + ":" + i + " is not registered.");
        }
    }

    public int getRemotePort() {
        Config config = this.config;
        if (config != null) {
            return config.rport;
        }
        return 0;
    }

    @Override // com.jcraft.jsch.Channel, java.lang.Runnable
    public void run() {
        IO io;
        InputStream inputStream;
        try {
            Config config = this.config;
            if (config instanceof ConfigDaemon) {
                ConfigDaemon configDaemon = (ConfigDaemon) config;
                this.daemon = (ForwardedTCPIPDaemon) Class.forName(configDaemon.target).newInstance();
                PipedOutputStream pipedOutputStream = new PipedOutputStream();
                this.io.setInputStream(new Channel.PassiveInputStream(pipedOutputStream, 32768), false);
                this.daemon.setChannel(this, getInputStream(), pipedOutputStream);
                this.daemon.setArg(configDaemon.arg);
                new Thread(this.daemon).start();
            } else {
                ConfigLHost configLHost = (ConfigLHost) config;
                SocketFactory socketFactory = configLHost.factory;
                Socket socketCreateSocket = socketFactory == null ? Util.createSocket(configLHost.target, configLHost.lport, TIMEOUT) : socketFactory.createSocket(configLHost.target, configLHost.lport);
                this.socket = socketCreateSocket;
                socketCreateSocket.setTcpNoDelay(true);
                this.io.setInputStream(this.socket.getInputStream());
                this.io.setOutputStream(this.socket.getOutputStream());
            }
            sendOpenConfirmation();
            this.thread = Thread.currentThread();
            Buffer buffer = new Buffer(this.rmpsize);
            Packet packet = new Packet(buffer);
            try {
                Session session = getSession();
                while (this.thread != null && (io = this.io) != null && (inputStream = io.in) != null) {
                    byte[] bArr = buffer.buffer;
                    int i = inputStream.read(bArr, 14, bArr.length - 142);
                    if (i > 0) {
                        packet.reset();
                        buffer.putByte((byte) 94);
                        buffer.putInt(this.recipient);
                        buffer.putInt(i);
                        buffer.skip(i);
                        synchronized (this) {
                            try {
                                if (!this.close) {
                                    session.write(packet, this, i);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        break;
                    }
                    eof();
                    break;
                }
            } catch (Exception unused) {
            }
            disconnect();
        } catch (Exception unused2) {
            sendOpenFailure(1);
            this.close = true;
            disconnect();
        }
    }

    public static void delPort(Session session, int i) {
        delPort(session, null, i);
    }

    public static void delPort(Session session, String str, int i) {
        synchronized (pool) {
            try {
                Config port = getPort(session, normalize(str), i);
                if (port == null) {
                    port = getPort(session, null, i);
                }
                if (port == null) {
                    return;
                }
                pool.removeElement(port);
                if (str == null) {
                    str = port.address_to_bind;
                }
                if (str == null) {
                    str = "0.0.0.0";
                }
                Buffer buffer = new Buffer(100);
                Packet packet = new Packet(buffer);
                try {
                    packet.reset();
                    buffer.putByte((byte) 80);
                    buffer.putString(Util.str2byte("cancel-tcpip-forward"));
                    buffer.putByte((byte) 0);
                    buffer.putString(Util.str2byte(str));
                    buffer.putInt(i);
                    session.write(packet);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void addPort(Session session, String str, int i, int i2, String str2, Object[] objArr) {
        String strNormalize = normalize(str);
        synchronized (pool) {
            try {
                if (getPort(session, strNormalize, i) != null) {
                    throw new JSchException("PortForwardingR: remote port " + i + " is already registered.");
                }
                ConfigDaemon configDaemon = new ConfigDaemon();
                configDaemon.session = session;
                configDaemon.rport = i;
                configDaemon.allocated_rport = i;
                configDaemon.target = str2;
                configDaemon.arg = objArr;
                configDaemon.address_to_bind = strNormalize;
                pool.addElement(configDaemon);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void delPort(Session session) {
        int[] iArr;
        int i;
        int i2;
        synchronized (pool) {
            try {
                iArr = new int[pool.size()];
                i2 = 0;
                for (int i3 = 0; i3 < pool.size(); i3++) {
                    Config config = (Config) pool.elementAt(i3);
                    if (config.session == session) {
                        iArr[i2] = config.rport;
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (i = 0; i < i2; i++) {
            delPort(session, iArr[i]);
        }
    }
}
