package com.jcraft.jsch.jce;

import com.jcraft.jsch.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class BlowfishCBC implements Cipher {
    private static final int bsize = 16;
    private static final int ivsize = 8;
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
    public void init(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2.length > 8) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArr2, 0, bArr3, 0, 8);
            bArr2 = bArr3;
        }
        if (bArr.length > bsize) {
            byte[] bArr4 = new byte[bsize];
            System.arraycopy(bArr, 0, bArr4, 0, bsize);
            bArr = bArr4;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "Blowfish");
        this.cipher = javax.crypto.Cipher.getInstance("Blowfish/CBC/NoPadding");
        synchronized (javax.crypto.Cipher.class) {
            this.cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
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
