package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class ProxySOCKS5 implements Proxy {
    private static int DEFAULTPORT = 1080;
    private InputStream in;
    private OutputStream out;
    private String passwd;
    private String proxy_host;
    private int proxy_port;
    private Socket socket;
    private String user;

    public ProxySOCKS5(String str) {
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

    private void fill(InputStream inputStream, byte[] bArr, int i) throws IOException, JSchException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 <= 0) {
                throw new JSchException("ProxySOCKS5: stream is closed");
            }
            i2 += i3;
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (r10[1] == 0) goto L25;
     */
    @Override // com.jcraft.jsch.Proxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void connect(com.jcraft.jsch.SocketFactory r10, java.lang.String r11, int r12, int r13) throws com.jcraft.jsch.JSchException {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ProxySOCKS5.connect(com.jcraft.jsch.SocketFactory, java.lang.String, int, int):void");
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

    public ProxySOCKS5(String str, int i) {
        this.proxy_host = str;
        this.proxy_port = i;
    }
}
