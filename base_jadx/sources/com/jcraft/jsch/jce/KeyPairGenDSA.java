package com.jcraft.jsch.jce;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGenDSA implements com.jcraft.jsch.KeyPairGenDSA {
    byte[] g;
    byte[] p;
    byte[] q;
    byte[] x;
    byte[] y;

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getG() {
        return this.g;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getP() {
        return this.p;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getQ() {
        return this.q;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getX() {
        return this.x;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public byte[] getY() {
        return this.y;
    }

    @Override // com.jcraft.jsch.KeyPairGenDSA
    public void init(int i) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(i, new SecureRandom());
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
        PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
        this.x = ((DSAPrivateKey) privateKey).getX().toByteArray();
        this.y = ((DSAPublicKey) publicKey).getY().toByteArray();
        DSAParams params = ((DSAKey) privateKey).getParams();
        this.p = params.getP().toByteArray();
        this.q = params.getQ().toByteArray();
        this.g = params.getG().toByteArray();
    }
}
