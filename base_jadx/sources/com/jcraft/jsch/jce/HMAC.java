package com.jcraft.jsch.jce;

import com.jcraft.jsch.MAC;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
abstract class HMAC implements MAC {
    protected String algorithm;
    protected int bsize;
    private Mac mac;
    protected String name;
    private final byte[] tmp = new byte[4];

    @Override // com.jcraft.jsch.MAC
    public void doFinal(byte[] bArr, int i) {
        try {
            this.mac.doFinal(bArr, i);
        } catch (ShortBufferException e) {
            System.err.println(e);
        }
    }

    @Override // com.jcraft.jsch.MAC
    public int getBlockSize() {
        return this.bsize;
    }

    @Override // com.jcraft.jsch.MAC
    public String getName() {
        return this.name;
    }

    @Override // com.jcraft.jsch.MAC
    public void init(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        int length = bArr.length;
        int i = this.bsize;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, this.algorithm);
        Mac mac = Mac.getInstance(this.algorithm);
        this.mac = mac;
        mac.init(secretKeySpec);
    }

    @Override // com.jcraft.jsch.MAC
    public void update(int i) {
        byte[] bArr = this.tmp;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        update(bArr, 0, 4);
    }

    @Override // com.jcraft.jsch.MAC
    public void update(byte[] bArr, int i, int i2) {
        this.mac.update(bArr, i, i2);
    }
}
