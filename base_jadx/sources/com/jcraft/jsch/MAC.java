package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface MAC {
    void doFinal(byte[] bArr, int i);

    int getBlockSize();

    String getName();

    void init(byte[] bArr);

    void update(int i);

    void update(byte[] bArr, int i, int i2);
}
