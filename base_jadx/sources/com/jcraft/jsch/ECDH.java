package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface ECDH {
    byte[] getQ();

    byte[] getSecret(byte[] bArr, byte[] bArr2);

    void init(int i);

    boolean validate(byte[] bArr, byte[] bArr2);
}
