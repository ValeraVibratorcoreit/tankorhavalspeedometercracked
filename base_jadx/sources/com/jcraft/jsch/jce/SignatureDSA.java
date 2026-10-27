package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes.dex */
public class SignatureDSA implements com.jcraft.jsch.SignatureDSA {
    KeyFactory keyFactory;
    Signature signature;

    @Override // com.jcraft.jsch.Signature
    public void init() {
        this.signature = Signature.getInstance("SHA1withDSA");
        this.keyFactory = KeyFactory.getInstance("DSA");
    }

    public byte[] normalize(byte[] bArr) {
        if (bArr.length <= 1 || bArr[0] != 0 || (bArr[1] & 128) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return normalize(bArr2);
    }

    @Override // com.jcraft.jsch.SignatureDSA
    public void setPrvKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.signature.initSign(this.keyFactory.generatePrivate(new DSAPrivateKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // com.jcraft.jsch.SignatureDSA
    public void setPubKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.signature.initVerify(this.keyFactory.generatePublic(new DSAPublicKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // com.jcraft.jsch.Signature
    public byte[] sign() throws SignatureException {
        byte[] bArrSign = this.signature.sign();
        int i = bArrSign[3] & 255;
        byte[] bArr = new byte[i];
        System.arraycopy(bArrSign, 4, bArr, 0, i);
        int i2 = bArrSign[i + 5] & 255;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArrSign, i + 6, bArr2, 0, i2);
        byte[] bArr3 = new byte[40];
        int i3 = i > 20 ? 1 : 0;
        int i4 = i > 20 ? 0 : 20 - i;
        if (i > 20) {
            i = 20;
        }
        System.arraycopy(bArr, i3, bArr3, i4, i);
        int i5 = i2 > 20 ? 1 : 0;
        int i6 = i2 > 20 ? 20 : 40 - i2;
        if (i2 > 20) {
            i2 = 20;
        }
        System.arraycopy(bArr2, i5, bArr3, i6, i2);
        return bArr3;
    }

    @Override // com.jcraft.jsch.Signature
    public void update(byte[] bArr) throws SignatureException {
        this.signature.update(bArr);
    }

    @Override // com.jcraft.jsch.Signature
    public boolean verify(byte[] bArr) {
        Buffer buffer = new Buffer(bArr);
        if (new String(buffer.getString()).equals("ssh-dss")) {
            int i = buffer.getInt();
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, buffer.getOffSet(), bArr2, 0, i);
            bArr = bArr2;
        }
        byte[] bArr3 = new byte[20];
        System.arraycopy(bArr, 0, bArr3, 0, 20);
        byte[] bArrNormalize = normalize(bArr3);
        byte[] bArr4 = new byte[20];
        System.arraycopy(bArr, 20, bArr4, 0, 20);
        byte[] bArrNormalize2 = normalize(bArr4);
        byte b = (bArrNormalize[0] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte b2 = (bArrNormalize2[0] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte[] bArr5 = new byte[bArrNormalize.length + bArrNormalize2.length + 6 + b + b2];
        bArr5[0] = 48;
        byte length = (byte) (bArrNormalize.length + bArrNormalize2.length + 4);
        bArr5[1] = length;
        byte b3 = (byte) (length + b);
        bArr5[1] = b3;
        bArr5[1] = (byte) (b3 + b2);
        bArr5[2] = 2;
        byte length2 = (byte) bArrNormalize.length;
        bArr5[3] = length2;
        bArr5[3] = (byte) (length2 + b);
        System.arraycopy(bArrNormalize, 0, bArr5, b + 4, bArrNormalize.length);
        bArr5[bArr5[3] + 4] = 2;
        bArr5[bArr5[3] + 5] = (byte) bArrNormalize2.length;
        int i2 = bArr5[3] + 5;
        bArr5[i2] = (byte) (bArr5[i2] + b2);
        System.arraycopy(bArrNormalize2, 0, bArr5, bArr5[3] + 6 + b2, bArrNormalize2.length);
        return this.signature.verify(bArr5);
    }
}
