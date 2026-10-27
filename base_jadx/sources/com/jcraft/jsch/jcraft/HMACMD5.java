package com.jcraft.jsch.jcraft;

import com.jcraft.jsch.MAC;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class HMACMD5 extends HMAC implements MAC {
    private static final String name = "hmac-md5";

    public HMACMD5() {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.err.println(e);
            messageDigest = null;
        }
        setH(messageDigest);
    }

    @Override // com.jcraft.jsch.jcraft.HMAC, com.jcraft.jsch.MAC
    public /* bridge */ /* synthetic */ void doFinal(byte[] bArr, int i) {
        super.doFinal(bArr, i);
    }

    @Override // com.jcraft.jsch.jcraft.HMAC, com.jcraft.jsch.MAC
    public /* bridge */ /* synthetic */ int getBlockSize() {
        return super.getBlockSize();
    }

    @Override // com.jcraft.jsch.MAC
    public String getName() {
        return name;
    }

    @Override // com.jcraft.jsch.jcraft.HMAC, com.jcraft.jsch.MAC
    public /* bridge */ /* synthetic */ void init(byte[] bArr) {
        super.init(bArr);
    }

    @Override // com.jcraft.jsch.jcraft.HMAC, com.jcraft.jsch.MAC
    public /* bridge */ /* synthetic */ void update(int i) {
        super.update(i);
    }

    @Override // com.jcraft.jsch.jcraft.HMAC, com.jcraft.jsch.MAC
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
    }
}
