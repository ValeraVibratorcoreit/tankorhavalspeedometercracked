package com.jcraft.jsch.jce;

import com.jcraft.jsch.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class ARCFOUR128 implements Cipher {
    private static final int bsize = 16;
    private static final int ivsize = 8;
    private static final int skip = 1536;
    private javax.crypto.Cipher cipher;

    @Override // com.jcraft.jsch.Cipher
    public int getBlockSize() {
        return bsize;
    }

    @Override // com.jcraft.jsch.Cipher
    public int getIVSize() {
        return 8;
    }

    @Override // com.jcraft.jsch.Cipher
    public void init(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > bsize) {
            byte[] bArr3 = new byte[bsize];
            System.arraycopy(bArr, 0, bArr3, 0, bsize);
            bArr = bArr3;
        }
        try {
            this.cipher = javax.crypto.Cipher.getInstance("RC4");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "RC4");
            synchronized (javax.crypto.Cipher.class) {
                this.cipher.init(i == 0 ? 1 : 2, secretKeySpec);
            }
            byte[] bArr4 = new byte[1];
            for (int i2 = 0; i2 < skip; i2++) {
                this.cipher.update(bArr4, 0, 1, bArr4, 0);
            }
        } catch (Exception e) {
            this.cipher = null;
            throw e;
        }
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean isCBC() {
        return false;
    }

    @Override // com.jcraft.jsch.Cipher
    public void update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.cipher.update(bArr, i, i2, bArr2, i3);
    }
}
