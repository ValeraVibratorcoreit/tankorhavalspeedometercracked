package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public interface SocketFactory {
    Socket createSocket(String str, int i);

    InputStream getInputStream(Socket socket);

    OutputStream getOutputStream(Socket socket);
}
