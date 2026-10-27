package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface Signature {
    void init();

    byte[] sign();

    void update(byte[] bArr);

    boolean verify(byte[] bArr);
}
