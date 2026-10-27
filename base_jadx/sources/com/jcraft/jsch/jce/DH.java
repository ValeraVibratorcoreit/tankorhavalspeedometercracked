package com.jcraft.jsch.jce;

import com.jcraft.jsch.JSchException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class DH implements com.jcraft.jsch.DH {
    BigInteger K;
    byte[] K_array;
    BigInteger e;
    byte[] e_array;
    BigInteger f;
    BigInteger g;
    private KeyAgreement myKeyAgree;
    private KeyPairGenerator myKpairGen;
    BigInteger p;

    @Override // com.jcraft.jsch.DH
    public void checkRange() {
    }

    @Override // com.jcraft.jsch.DH
    public byte[] getE() throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.e == null) {
            this.myKpairGen.initialize(new DHParameterSpec(this.p, this.g));
            KeyPair keyPairGenerateKeyPair = this.myKpairGen.generateKeyPair();
            this.myKeyAgree.init(keyPairGenerateKeyPair.getPrivate());
            BigInteger y = ((DHPublicKey) keyPairGenerateKeyPair.getPublic()).getY();
            this.e = y;
            this.e_array = y.toByteArray();
        }
        return this.e_array;
    }

    @Override // com.jcraft.jsch.DH
    public byte[] getK() throws InvalidKeySpecException, InvalidKeyException {
        if (this.K == null) {
            this.myKeyAgree.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.f, this.p, this.g)), true);
            byte[] bArrGenerateSecret = this.myKeyAgree.generateSecret();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            this.K = bigInteger;
            bigInteger.toByteArray();
            this.K_array = bArrGenerateSecret;
        }
        return this.K_array;
    }

    @Override // com.jcraft.jsch.DH
    public void init() {
        this.myKpairGen = KeyPairGenerator.getInstance("DH");
        this.myKeyAgree = KeyAgreement.getInstance("DH");
    }

    @Override // com.jcraft.jsch.DH
    public void setF(byte[] bArr) {
        setF(new BigInteger(1, bArr));
    }

    @Override // com.jcraft.jsch.DH
    public void setG(byte[] bArr) {
        setG(new BigInteger(1, bArr));
    }

    @Override // com.jcraft.jsch.DH
    public void setP(byte[] bArr) {
        setP(new BigInteger(1, bArr));
    }

    private void checkRange(BigInteger bigInteger) throws JSchException {
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = this.p.subtract(bigInteger2);
        if (bigInteger2.compareTo(bigInteger) >= 0 || bigInteger.compareTo(bigIntegerSubtract) >= 0) {
            throw new JSchException("invalid DH value");
        }
    }

    public void setF(BigInteger bigInteger) {
        this.f = bigInteger;
    }

    public void setG(BigInteger bigInteger) {
        this.g = bigInteger;
    }

    public void setP(BigInteger bigInteger) {
        this.p = bigInteger;
    }
}
