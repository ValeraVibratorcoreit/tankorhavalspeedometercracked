package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface KeyPairGenECDSA {
    byte[] getD();

    byte[] getR();

    byte[] getS();

    void init(int i);
}
