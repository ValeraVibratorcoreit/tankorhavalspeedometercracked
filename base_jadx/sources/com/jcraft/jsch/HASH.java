package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface HASH {
    byte[] digest();

    int getBlockSize();

    void init();

    void update(byte[] bArr, int i, int i2);
}
