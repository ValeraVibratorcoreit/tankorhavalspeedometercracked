package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface DH {
    void checkRange();

    byte[] getE();

    byte[] getK();

    void init();

    void setF(byte[] bArr);

    void setG(byte[] bArr);

    void setP(byte[] bArr);
}
