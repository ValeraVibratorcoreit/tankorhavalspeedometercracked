package com.jcraft.jsch.jce;

import com.jcraft.jsch.ECDH;
import com.jcraft.jsch.JSchException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public class ECDHN implements ECDH {
    private static BigInteger three;
    private static BigInteger two;
    byte[] Q_array;
    private KeyAgreement myKeyAgree;
    ECPublicKey publicKey;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerAdd = bigInteger.add(bigInteger);
        two = bigIntegerAdd;
        three = bigIntegerAdd.add(bigInteger);
    }

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

    private byte[] toPoint(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + 1 + bArr2.length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        return bArr3;
    }

    @Override // com.jcraft.jsch.ECDH
    public byte[] getQ() {
        return this.Q_array;
    }

    @Override // com.jcraft.jsch.ECDH
    public byte[] getSecret(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.myKeyAgree.doPhase(KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2)), this.publicKey.getParams())), true);
        return this.myKeyAgree.generateSecret();
    }

    @Override // com.jcraft.jsch.ECDH
    public void init(int i) throws NoSuchAlgorithmException, InvalidKeyException, JSchException, InvalidAlgorithmParameterException {
        this.myKeyAgree = KeyAgreement.getInstance("ECDH");
        KeyPairGenECDSA keyPairGenECDSA = new KeyPairGenECDSA();
        keyPairGenECDSA.init(i);
        this.publicKey = keyPairGenECDSA.getPublicKey();
        this.Q_array = toPoint(keyPairGenECDSA.getR(), keyPairGenECDSA.getS());
        this.myKeyAgree.init(keyPairGenECDSA.getPrivateKey());
    }

    @Override // com.jcraft.jsch.ECDH
    public boolean validate(byte[] bArr, byte[] bArr2) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        if (new ECPoint(bigInteger, bigInteger2).equals(ECPoint.POINT_INFINITY)) {
            return false;
        }
        EllipticCurve curve = this.publicKey.getParams().getCurve();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        BigInteger bigIntegerSubtract = p.subtract(BigInteger.ONE);
        if (bigInteger.compareTo(bigIntegerSubtract) > 0 || bigInteger2.compareTo(bigIntegerSubtract) > 0) {
            return false;
        }
        return bigInteger2.modPow(two, p).equals(bigInteger.multiply(curve.getA()).add(curve.getB()).add(bigInteger.modPow(three, p)).mod(p));
    }
}
