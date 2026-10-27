package com.jcraft.jsch.jce;

import com.jcraft.jsch.JSchException;
import defpackage.Vo;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGenECDSA implements com.jcraft.jsch.KeyPairGenECDSA {
    byte[] d;
    ECParameterSpec params;
    ECPrivateKey prvKey;
    ECPublicKey pubKey;
    byte[] r;
    byte[] s;

    private void bzero(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private byte[] chop0(byte[] bArr) {
        if (bArr[0] != 0 || (bArr[1] & 128) == 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        bzero(bArr);
        return bArr2;
    }

    private byte[] insert0(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        bzero(bArr);
        return bArr2;
    }

    @Override // com.jcraft.jsch.KeyPairGenECDSA
    public byte[] getD() {
        return this.d;
    }

    public ECPrivateKey getPrivateKey() {
        return this.prvKey;
    }

    public ECPublicKey getPublicKey() {
        return this.pubKey;
    }

    @Override // com.jcraft.jsch.KeyPairGenECDSA
    public byte[] getR() {
        return this.r;
    }

    @Override // com.jcraft.jsch.KeyPairGenECDSA
    public byte[] getS() {
        return this.s;
    }

    @Override // com.jcraft.jsch.KeyPairGenECDSA
    public void init(int i) throws NoSuchAlgorithmException, JSchException, InvalidAlgorithmParameterException {
        String str;
        if (i == 256) {
            str = "secp256r1";
        } else if (i == 384) {
            str = "secp384r1";
        } else {
            if (i != 521) {
                throw new JSchException(Vo.e(i, "unsupported key size: "));
            }
            str = "secp521r1";
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec(str));
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            this.prvKey = (ECPrivateKey) keyPairGenKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenKeyPair.getPublic();
            this.pubKey = eCPublicKey;
            this.params = eCPublicKey.getParams();
            this.d = this.prvKey.getS().toByteArray();
            ECPoint w = this.pubKey.getW();
            this.r = w.getAffineX().toByteArray();
            byte[] byteArray = w.getAffineY().toByteArray();
            this.s = byteArray;
            byte[] bArr = this.r;
            if (bArr.length == byteArray.length && ((i == 256 && bArr.length == 32) || ((i == 384 && bArr.length == 48) || (i == 521 && bArr.length == 66)))) {
                break;
            }
        }
        byte[] bArr2 = this.d;
        if (bArr2.length < this.r.length) {
            this.d = insert0(bArr2);
        }
    }
}
