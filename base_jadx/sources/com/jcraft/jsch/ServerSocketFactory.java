package com.jcraft.jsch;

import java.net.InetAddress;
import java.net.ServerSocket;

/* JADX INFO: loaded from: classes.dex */
public interface ServerSocketFactory {
    ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress);
}
