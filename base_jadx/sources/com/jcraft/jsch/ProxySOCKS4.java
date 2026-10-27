package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public class ProxySOCKS4 implements Proxy {
    private static int DEFAULTPORT = 1080;
    private InputStream in;
    private OutputStream out;
    private String passwd;
    private String proxy_host;
    private int proxy_port;
    private Socket socket;
    private String user;

    public ProxySOCKS4(String str) {
        int i = DEFAULTPORT;
        if (str.indexOf(58) != -1) {
            try {
                String strSubstring = str.substring(0, str.indexOf(58));
                try {
                    i = Integer.parseInt(str.substring(str.indexOf(58) + 1));
                } catch (Exception unused) {
                }
                str = strSubstring;
            } catch (Exception unused2) {
            }
        }
        this.proxy_host = str;
        this.proxy_port = i;
    }

    public static int getDefaultPort() {
        return DEFAULTPORT;
    }

    @Override // com.jcraft.jsch.Proxy
    public void close() {
        try {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                inputStream.close();
            }
            OutputStream outputStream = this.out;
            if (outputStream != null) {
                outputStream.close();
            }
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (Exception unused) {
        }
        this.in = null;
        this.out = null;
        this.socket = null;
    }

    @Override // com.jcraft.jsch.Proxy
    public void connect(SocketFactory socketFactory, String str, int i, int i2) throws JSchException {
        try {
            if (socketFactory == null) {
                Socket socketCreateSocket = Util.createSocket(this.proxy_host, this.proxy_port, i2);
                this.socket = socketCreateSocket;
                this.in = socketCreateSocket.getInputStream();
                this.out = this.socket.getOutputStream();
            } else {
                Socket socketCreateSocket2 = socketFactory.createSocket(this.proxy_host, this.proxy_port);
                this.socket = socketCreateSocket2;
                this.in = socketFactory.getInputStream(socketCreateSocket2);
                this.out = socketFactory.getOutputStream(this.socket);
            }
            if (i2 > 0) {
                this.socket.setSoTimeout(i2);
            }
            this.socket.setTcpNoDelay(true);
            byte[] bArr = new byte[1024];
            int length = 4;
            bArr[0] = 4;
            bArr[1] = 1;
            bArr[2] = (byte) (i >>> 8);
            bArr[3] = (byte) (i & 255);
            try {
                byte[] address = InetAddress.getByName(str).getAddress();
                int i3 = 0;
                while (i3 < address.length) {
                    int i4 = length + 1;
                    bArr[length] = address[i3];
                    i3++;
                    length = i4;
                }
                String str2 = this.user;
                if (str2 != null) {
                    System.arraycopy(Util.str2byte(str2), 0, bArr, length, this.user.length());
                    length += this.user.length();
                }
                bArr[length] = 0;
                this.out.write(bArr, 0, length + 1);
                int i5 = 0;
                while (i5 < 8) {
                    int i6 = this.in.read(bArr, i5, 8 - i5);
                    if (i6 <= 0) {
                        throw new JSchException("ProxySOCKS4: stream is closed");
                    }
                    i5 += i6;
                }
                if (bArr[0] != 0) {
                    throw new JSchException("ProxySOCKS4: server returns VN " + ((int) bArr[0]));
                }
                if (bArr[1] == 90) {
                    return;
                }
                try {
                    this.socket.close();
                } catch (Exception unused) {
                }
                throw new JSchException("ProxySOCKS4: server returns CD " + ((int) bArr[1]));
            } catch (UnknownHostException e) {
                throw new JSchException("ProxySOCKS4: " + e.toString(), e);
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            try {
                Socket socket = this.socket;
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception unused2) {
            }
            throw new JSchException("ProxySOCKS4: " + e3.toString());
        }
    }

    @Override // com.jcraft.jsch.Proxy
    public InputStream getInputStream() {
        return this.in;
    }

    @Override // com.jcraft.jsch.Proxy
    public OutputStream getOutputStream() {
        return this.out;
    }

    @Override // com.jcraft.jsch.Proxy
    public Socket getSocket() {
        return this.socket;
    }

    public void setUserPasswd(String str, String str2) {
        this.user = str;
        this.passwd = str2;
    }

    public ProxySOCKS4(String str, int i) {
        this.proxy_host = str;
        this.proxy_port = i;
    }
}
