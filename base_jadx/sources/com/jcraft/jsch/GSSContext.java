package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface GSSContext {
    void create(String str, String str2);

    void dispose();

    byte[] getMIC(byte[] bArr, int i, int i2);

    byte[] init(byte[] bArr, int i, int i2);

    boolean isEstablished();
}
