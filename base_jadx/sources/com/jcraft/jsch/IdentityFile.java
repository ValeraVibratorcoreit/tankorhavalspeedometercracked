package com.jcraft.jsch;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
class IdentityFile implements Identity {
    private String identity;
    private JSch jsch;
    private KeyPair kpair;

    private IdentityFile(JSch jSch, String str, KeyPair keyPair) {
        this.jsch = jSch;
        this.identity = str;
        this.kpair = keyPair;
    }

    public static IdentityFile newInstance(String str, String str2, JSch jSch) {
        return new IdentityFile(jSch, str, KeyPair.load(jSch, str, str2));
    }

    @Override // com.jcraft.jsch.Identity
    public void clear() {
        this.kpair.dispose();
        this.kpair = null;
    }

    @Override // com.jcraft.jsch.Identity
    public boolean decrypt() {
        throw new RuntimeException("not implemented");
    }

    @Override // com.jcraft.jsch.Identity
    public String getAlgName() {
        byte[] keyTypeName = this.kpair.getKeyTypeName();
        try {
            return new String(keyTypeName, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(keyTypeName);
        }
    }

    public KeyPair getKeyPair() {
        return this.kpair;
    }

    @Override // com.jcraft.jsch.Identity
    public String getName() {
        return this.identity;
    }

    @Override // com.jcraft.jsch.Identity
    public byte[] getPublicKeyBlob() {
        return this.kpair.getPublicKeyBlob();
    }

    @Override // com.jcraft.jsch.Identity
    public byte[] getSignature(byte[] bArr) {
        return this.kpair.getSignature(bArr);
    }

    @Override // com.jcraft.jsch.Identity
    public boolean isEncrypted() {
        return this.kpair.isEncrypted();
    }

    @Override // com.jcraft.jsch.Identity
    public boolean setPassphrase(byte[] bArr) {
        return this.kpair.decrypt(bArr);
    }

    public static IdentityFile newInstance(String str, byte[] bArr, byte[] bArr2, JSch jSch) {
        return new IdentityFile(jSch, str, KeyPair.load(jSch, bArr, bArr2));
    }
}
