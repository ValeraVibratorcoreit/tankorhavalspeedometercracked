package com.jcraft.jsch.jce;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.SignatureECDSA;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes.dex */
public abstract class SignatureECDSAN implements SignatureECDSA {
    KeyFactory keyFactory;
    Signature signature;

    private void bzero(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private byte[] chop0(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        bzero(bArr);
        return bArr2;
    }

    private byte[] insert0(byte[] bArr) {
        if ((bArr[0] & 128) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        bzero(bArr);
        return bArr2;
    }

    public abstract String getName();

    @Override // com.jcraft.jsch.Signature
    public void init() {
        String str;
        String name = getName();
        if (name.equals("ecdsa-sha2-nistp384")) {
            str = "SHA384withECDSA";
        } else {
            str = name.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA";
        }
        this.signature = Signature.getInstance(str);
        this.keyFactory = KeyFactory.getInstance("EC");
    }

    @Override // com.jcraft.jsch.SignatureECDSA
    public void setPrvKey(byte[] bArr) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrInsert0 = insert0(bArr);
        if (bArrInsert0.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrInsert0.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.signature.initSign(this.keyFactory.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrInsert0), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // com.jcraft.jsch.SignatureECDSA
    public void setPubKey(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException {
        String str;
        byte[] bArrInsert0 = insert0(bArr);
        byte[] bArrInsert1 = insert0(bArr2);
        if (bArrInsert0.length >= 64) {
            str = "secp521r1";
        } else {
            str = bArrInsert0.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.signature.initVerify(this.keyFactory.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrInsert0), new BigInteger(1, bArrInsert1)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // com.jcraft.jsch.Signature
    public byte[] sign() throws SignatureException {
        byte[] bArrSign = this.signature.sign();
        if (bArrSign[0] != '0') {
            return bArrSign;
        }
        int i = bArrSign[1];
        int i2 = 3;
        if (i + 2 != bArrSign.length && ((i & 128) == 0 || (bArrSign[2] & 255) + 3 != bArrSign.length)) {
            return bArrSign;
        }
        if ((i & 128) != 0 && (bArrSign[2] & 255) + 3 == bArrSign.length) {
            i2 = 4;
        }
        int i3 = bArrSign[i2];
        byte[] bArr = new byte[i3];
        int i4 = bArrSign[i2 + 2 + i3];
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArrSign, i2 + 1, bArr, 0, i3);
        System.arraycopy(bArrSign, i2 + 3 + bArrSign[i2], bArr2, 0, i4);
        byte[] bArrChop0 = chop0(bArr);
        byte[] bArrChop1 = chop0(bArr2);
        Buffer buffer = new Buffer();
        buffer.putMPInt(bArrChop0);
        buffer.putMPInt(bArrChop1);
        byte[] bArr3 = new byte[buffer.getLength()];
        buffer.setOffSet(0);
        buffer.getByte(bArr3);
        return bArr3;
    }

    @Override // com.jcraft.jsch.Signature
    public void update(byte[] bArr) throws SignatureException {
        this.signature.update(bArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    @Override // com.jcraft.jsch.Signature
    public boolean verify(byte[] bArr) {
        byte[] bArrInsert0;
        byte[] bArrInsert1;
        byte[] bArr2;
        if (bArr[0] == 48) {
            byte b = bArr[1];
            if (b + 2 != bArr.length && ((b & 128) == 0 || (bArr[2] & 255) + 3 != bArr.length)) {
                Buffer buffer = new Buffer(bArr);
                buffer.getString();
                buffer.getInt();
                byte[] mPInt = buffer.getMPInt();
                byte[] mPInt2 = buffer.getMPInt();
                bArrInsert0 = insert0(mPInt);
                bArrInsert1 = insert0(mPInt2);
                if (bArrInsert0.length < 64) {
                    bArr2 = new byte[bArrInsert0.length + 6 + bArrInsert1.length];
                    bArr2[0] = 48;
                    bArr2[1] = (byte) (bArrInsert0.length + 4 + bArrInsert1.length);
                    bArr2[2] = 2;
                    bArr2[3] = (byte) bArrInsert0.length;
                    System.arraycopy(bArrInsert0, 0, bArr2, 4, bArrInsert0.length);
                    bArr2[bArrInsert0.length + 4] = 2;
                    bArr2[bArrInsert0.length + 5] = (byte) bArrInsert1.length;
                    System.arraycopy(bArrInsert1, 0, bArr2, bArrInsert0.length + 6, bArrInsert1.length);
                } else {
                    bArr2 = new byte[bArrInsert0.length + 6 + bArrInsert1.length + 1];
                    bArr2[0] = 48;
                    bArr2[1] = -127;
                    bArr2[2] = (byte) (bArrInsert0.length + 4 + bArrInsert1.length);
                    bArr2[3] = 2;
                    bArr2[4] = (byte) bArrInsert0.length;
                    System.arraycopy(bArrInsert0, 0, bArr2, 5, bArrInsert0.length);
                    bArr2[bArrInsert0.length + 5] = 2;
                    bArr2[bArrInsert0.length + 6] = (byte) bArrInsert1.length;
                    System.arraycopy(bArrInsert1, 0, bArr2, bArrInsert0.length + 7, bArrInsert1.length);
                }
                bArr = bArr2;
            }
        } else {
            Buffer buffer2 = new Buffer(bArr);
            buffer2.getString();
            buffer2.getInt();
            byte[] mPInt3 = buffer2.getMPInt();
            byte[] mPInt4 = buffer2.getMPInt();
            bArrInsert0 = insert0(mPInt3);
            bArrInsert1 = insert0(mPInt4);
            if (bArrInsert0.length < 64) {
                bArr2 = new byte[bArrInsert0.length + 6 + bArrInsert1.length];
                bArr2[0] = 48;
                bArr2[1] = (byte) (bArrInsert0.length + 4 + bArrInsert1.length);
                bArr2[2] = 2;
                bArr2[3] = (byte) bArrInsert0.length;
                System.arraycopy(bArrInsert0, 0, bArr2, 4, bArrInsert0.length);
                bArr2[bArrInsert0.length + 4] = 2;
                bArr2[bArrInsert0.length + 5] = (byte) bArrInsert1.length;
                System.arraycopy(bArrInsert1, 0, bArr2, bArrInsert0.length + 6, bArrInsert1.length);
            } else {
                bArr2 = new byte[bArrInsert0.length + 6 + bArrInsert1.length + 1];
                bArr2[0] = 48;
                bArr2[1] = -127;
                bArr2[2] = (byte) (bArrInsert0.length + 4 + bArrInsert1.length);
                bArr2[3] = 2;
                bArr2[4] = (byte) bArrInsert0.length;
                System.arraycopy(bArrInsert0, 0, bArr2, 5, bArrInsert0.length);
                bArr2[bArrInsert0.length + 5] = 2;
                bArr2[bArrInsert0.length + 6] = (byte) bArrInsert1.length;
                System.arraycopy(bArrInsert1, 0, bArr2, bArrInsert0.length + 7, bArrInsert1.length);
            }
            bArr = bArr2;
        }
        return this.signature.verify(bArr);
    }
}
