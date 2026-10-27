package com.jcraft.jsch.jce;

import com.jcraft.jsch.ECDH;
import com.jcraft.jsch.JSchException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class ECDH384 extends ECDHN implements ECDH {
    public void init() throws NoSuchAlgorithmException, InvalidKeyException, JSchException, InvalidAlgorithmParameterException {
        super.init(384);
    }
}
