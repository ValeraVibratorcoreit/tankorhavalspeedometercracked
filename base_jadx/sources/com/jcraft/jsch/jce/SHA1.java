package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class SHA1 implements HASH {
    MessageDigest md;

    @Override // com.jcraft.jsch.HASH
    public byte[] digest() {
        return this.md.digest();
    }

    @Override // com.jcraft.jsch.HASH
    public int getBlockSize() {
        return 20;
    }

    @Override // com.jcraft.jsch.HASH
    public void init() {
        try {
            this.md = MessageDigest.getInstance("SHA-1");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override // com.jcraft.jsch.HASH
    public void update(byte[] bArr, int i, int i2) {
        this.md.update(bArr, i, i2);
    }
}
