package com.jcraft.jsch.jce;

import com.jcraft.jsch.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class AES256CBC implements Cipher {
    private static final int bsize = 32;
    private static final int ivsize = 16;
    private javax.crypto.Cipher cipher;

    @Override // com.jcraft.jsch.Cipher
    public int getBlockSize() {
        return bsize;
    }

    @Override // com.jcraft.jsch.Cipher
    public int getIVSize() {
        return ivsize;
    }

    @Override // com.jcraft.jsch.Cipher
    public void init(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > ivsize) {
            byte[] bArr3 = new byte[ivsize];
            System.arraycopy(bArr2, 0, bArr3, 0, ivsize);
            bArr2 = bArr3;
        }
        if (bArr.length > bsize) {
            byte[] bArr4 = new byte[bsize];
            System.arraycopy(bArr, 0, bArr4, 0, bsize);
            bArr = bArr4;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.cipher = javax.crypto.Cipher.getInstance("AES/CBC/NoPadding");
            synchronized (javax.crypto.Cipher.class) {
                this.cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
            }
        } catch (Exception e) {
            this.cipher = null;
            throw e;
        }
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean isCBC() {
        return true;
    }

    @Override // com.jcraft.jsch.Cipher
    public void update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.cipher.update(bArr, i, i2, bArr2, i3);
    }
}
