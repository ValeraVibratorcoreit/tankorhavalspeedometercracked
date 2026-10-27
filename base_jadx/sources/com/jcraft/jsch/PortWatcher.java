package com.jcraft.jsch;

import defpackage.Vo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
class PortWatcher implements Runnable {
    private static InetAddress anyLocalAddress;
    private static Vector pool = new Vector();
    InetAddress boundaddress;
    int connectTimeout = 0;
    String host;
    int lport;
    int rport;
    Session session;
    ServerSocket ss;
    Runnable thread;

    static {
        anyLocalAddress = null;
        try {
            anyLocalAddress = InetAddress.getByName("0.0.0.0");
        } catch (UnknownHostException unused) {
        }
    }

    public PortWatcher(Session session, String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) {
        int localPort;
        this.session = session;
        this.lport = i;
        this.host = str2;
        this.rport = i2;
        try {
            InetAddress byName = InetAddress.getByName(str);
            this.boundaddress = byName;
            ServerSocket serverSocket = serverSocketFactory == null ? new ServerSocket(i, 0, this.boundaddress) : serverSocketFactory.createServerSocket(i, 0, byName);
            this.ss = serverSocket;
            if (i != 0 || (localPort = serverSocket.getLocalPort()) == -1) {
                return;
            }
            this.lport = localPort;
        } catch (Exception e) {
            throw new JSchException("PortForwardingL: local port " + str + ":" + i + " cannot be bound.", e);
        }
    }

    public static PortWatcher addPort(Session session, String str, int i, String str2, int i2, ServerSocketFactory serverSocketFactory) throws UnknownHostException {
        String strNormalize = normalize(str);
        if (getPort(session, strNormalize, i) == null) {
            PortWatcher portWatcher = new PortWatcher(session, strNormalize, i, str2, i2, serverSocketFactory);
            pool.addElement(portWatcher);
            return portWatcher;
        }
        throw new JSchException("PortForwardingL: local port " + strNormalize + ":" + i + " is already registered.");
    }

    public static void delPort(Session session, String str, int i) throws IOException {
        String strNormalize = normalize(str);
        PortWatcher port = getPort(session, strNormalize, i);
        if (port != null) {
            port.delete();
            pool.removeElement(port);
            return;
        }
        throw new JSchException("PortForwardingL: local port " + strNormalize + ":" + i + " is not registered.");
    }

    public static PortWatcher getPort(Session session, String str, int i) throws UnknownHostException {
        try {
            InetAddress byName = InetAddress.getByName(str);
            synchronized (pool) {
                for (int i2 = 0; i2 < pool.size(); i2++) {
                    try {
                        PortWatcher portWatcher = (PortWatcher) pool.elementAt(i2);
                        if (portWatcher.session == session && portWatcher.lport == i) {
                            InetAddress inetAddress = anyLocalAddress;
                            if (inetAddress == null || !portWatcher.boundaddress.equals(inetAddress)) {
                                if (portWatcher.boundaddress.equals(byName)) {
                                }
                            }
                            return portWatcher;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        } catch (UnknownHostException e) {
            throw new JSchException(Vo.g("PortForwardingL: invalid address ", str, " specified."), e);
        }
    }

    public static String[] getPortForwarding(Session session) {
        int i;
        Vector vector = new Vector();
        synchronized (pool) {
            for (int i2 = 0; i2 < pool.size(); i2++) {
                try {
                    PortWatcher portWatcher = (PortWatcher) pool.elementAt(i2);
                    if (portWatcher.session == session) {
                        vector.addElement(portWatcher.lport + ":" + portWatcher.host + ":" + portWatcher.rport);
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

    private static String normalize(String str) {
        if (str == null) {
            return str;
        }
        if (str.length() == 0 || str.equals("*")) {
            return "0.0.0.0";
        }
        return str.equals("localhost") ? "127.0.0.1" : str;
    }

    public void delete() throws IOException {
        this.thread = null;
        try {
            ServerSocket serverSocket = this.ss;
            if (serverSocket != null) {
                serverSocket.close();
            }
            this.ss = null;
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        this.thread = this;
        while (this.thread != null) {
            try {
                Socket socketAccept = this.ss.accept();
                socketAccept.setTcpNoDelay(true);
                InputStream inputStream = socketAccept.getInputStream();
                OutputStream outputStream = socketAccept.getOutputStream();
                ChannelDirectTCPIP channelDirectTCPIP = new ChannelDirectTCPIP();
                channelDirectTCPIP.init();
                channelDirectTCPIP.setInputStream(inputStream);
                channelDirectTCPIP.setOutputStream(outputStream);
                this.session.addChannel(channelDirectTCPIP);
                channelDirectTCPIP.setHost(this.host);
                channelDirectTCPIP.setPort(this.rport);
                channelDirectTCPIP.setOrgIPAddress(socketAccept.getInetAddress().getHostAddress());
                channelDirectTCPIP.setOrgPort(socketAccept.getPort());
                channelDirectTCPIP.connect(this.connectTimeout);
            } catch (Exception unused) {
            }
        }
        delete();
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public static void delPort(Session session) {
        synchronized (pool) {
            try {
                PortWatcher[] portWatcherArr = new PortWatcher[pool.size()];
                int i = 0;
                for (int i2 = 0; i2 < pool.size(); i2++) {
                    PortWatcher portWatcher = (PortWatcher) pool.elementAt(i2);
                    if (portWatcher.session == session) {
                        portWatcher.delete();
                        portWatcherArr[i] = portWatcher;
                        i++;
                    }
                }
                for (int i3 = 0; i3 < i; i3++) {
                    pool.removeElement(portWatcherArr[i3]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
