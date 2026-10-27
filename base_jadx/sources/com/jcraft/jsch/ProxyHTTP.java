package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class ProxyHTTP implements Proxy {
    private static int DEFAULTPORT = 80;
    private InputStream in;
    private OutputStream out;
    private String passwd;
    private String proxy_host;
    private int proxy_port;
    private Socket socket;
    private String user;

    public ProxyHTTP(String str) {
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
        int i3;
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
            this.out.write(Util.str2byte("CONNECT " + str + ":" + i + " HTTP/1.0\r\n"));
            if (this.user != null && this.passwd != null) {
                byte[] bArrStr2byte = Util.str2byte(this.user + ":" + this.passwd);
                byte[] base64 = Util.toBase64(bArrStr2byte, 0, bArrStr2byte.length);
                this.out.write(Util.str2byte("Proxy-Authorization: Basic "));
                this.out.write(base64);
                this.out.write(Util.str2byte("\r\n"));
            }
            this.out.write(Util.str2byte("\r\n"));
            this.out.flush();
            StringBuffer stringBuffer = new StringBuffer();
            int iIndexOf = 0;
            while (iIndexOf >= 0) {
                iIndexOf = this.in.read();
                if (iIndexOf == 13) {
                    iIndexOf = this.in.read();
                    if (iIndexOf == 10) {
                        break;
                    }
                } else {
                    stringBuffer.append((char) iIndexOf);
                }
            }
            if (iIndexOf < 0) {
                throw new IOException();
            }
            String string = stringBuffer.toString();
            String strSubstring = "Unknow reason";
            int i4 = -1;
            try {
                iIndexOf = string.indexOf(32);
                int i5 = iIndexOf + 1;
                int iIndexOf2 = string.indexOf(32, i5);
                i4 = Integer.parseInt(string.substring(i5, iIndexOf2));
                strSubstring = string.substring(iIndexOf2 + 1);
            } catch (Exception unused) {
            }
            if (i4 != 200) {
                throw new IOException("proxy error: " + strSubstring);
            }
            do {
                i3 = 0;
                while (iIndexOf >= 0) {
                    iIndexOf = this.in.read();
                    if (iIndexOf == 13) {
                        iIndexOf = this.in.read();
                        if (iIndexOf == 10) {
                            break;
                        }
                    } else {
                        i3++;
                    }
                }
                if (iIndexOf < 0) {
                    throw new IOException();
                }
            } while (i3 != 0);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            try {
                Socket socket = this.socket;
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception unused2) {
            }
            throw new JSchException("ProxyHTTP: " + e2.toString(), e2);
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

    public ProxyHTTP(String str, int i) {
        this.proxy_host = str;
        this.proxy_port = i;
    }
}
