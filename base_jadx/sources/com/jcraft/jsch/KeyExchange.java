package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeyExchange {
    static final int PROPOSAL_COMP_ALGS_CTOS = 6;
    static final int PROPOSAL_COMP_ALGS_STOC = 7;
    static final int PROPOSAL_ENC_ALGS_CTOS = 2;
    static final int PROPOSAL_ENC_ALGS_STOC = 3;
    static final int PROPOSAL_KEX_ALGS = 0;
    static final int PROPOSAL_LANG_CTOS = 8;
    static final int PROPOSAL_LANG_STOC = 9;
    static final int PROPOSAL_MAC_ALGS_CTOS = 4;
    static final int PROPOSAL_MAC_ALGS_STOC = 5;
    static final int PROPOSAL_MAX = 10;
    static final int PROPOSAL_SERVER_HOST_KEY_ALGS = 1;
    public static final int STATE_END = 0;
    static String enc_c2s = "blowfish-cbc";
    static String enc_s2c = "blowfish-cbc";
    static String kex = "diffie-hellman-group1-sha1";
    static String lang_c2s = "";
    static String lang_s2c = "";
    static String mac_c2s = "hmac-md5";
    static String mac_s2c = "hmac-md5";
    static String server_host_key = "ssh-rsa,ssh-dss";
    protected Session session = null;
    protected HASH sha = null;
    protected byte[] K = null;
    protected byte[] H = null;
    protected byte[] K_S = null;
    protected final int RSA = 0;
    protected final int DSS = 1;
    protected final int ECDSA = 2;
    private int type = 0;
    private String key_alg_name = "";

    public static String[] guess(byte[] bArr, byte[] bArr2) {
        String[] strArr = new String[PROPOSAL_MAX];
        Buffer buffer = new Buffer(bArr);
        buffer.setOffSet(17);
        Buffer buffer2 = new Buffer(bArr2);
        buffer2.setOffSet(17);
        if (JSch.getLogger().isEnabled(1)) {
            for (int i = 0; i < PROPOSAL_MAX; i++) {
                JSch.getLogger().log(1, "kex: server: " + Util.byte2str(buffer.getString()));
            }
            for (int i2 = 0; i2 < PROPOSAL_MAX; i2++) {
                JSch.getLogger().log(1, "kex: client: " + Util.byte2str(buffer2.getString()));
            }
            buffer.setOffSet(17);
            buffer2.setOffSet(17);
        }
        for (int i3 = 0; i3 < PROPOSAL_MAX; i3++) {
            byte[] string = buffer.getString();
            byte[] string2 = buffer2.getString();
            int i4 = 0;
            int i5 = 0;
            while (i4 < string2.length) {
                while (i4 < string2.length && string2[i4] != 44) {
                    i4++;
                }
                if (i5 == i4) {
                    return null;
                }
                String strByte2str = Util.byte2str(string2, i5, i4 - i5);
                int i6 = 0;
                int i7 = 0;
                while (i6 < string.length) {
                    while (i6 < string.length && string[i6] != 44) {
                        i6++;
                    }
                    if (i7 == i6) {
                        return null;
                    }
                    if (strByte2str.equals(Util.byte2str(string, i7, i6 - i7))) {
                        strArr[i3] = strByte2str;
                        break;
                    }
                    i7 = i6 + 1;
                    i6 = i7;
                }
                i5 = i4 + 1;
                i4 = i5;
            }
            if (i4 == 0) {
                strArr[i3] = "";
            } else if (strArr[i3] == null) {
                return null;
            }
        }
        if (JSch.getLogger().isEnabled(1)) {
            JSch.getLogger().log(1, "kex: server->client " + strArr[3] + " " + strArr[5] + " " + strArr[7]);
            JSch.getLogger().log(1, "kex: client->server " + strArr[2] + " " + strArr[4] + " " + strArr[6]);
        }
        return strArr;
    }

    public String getFingerPrint() {
        HASH hash;
        try {
            hash = (HASH) Class.forName(this.session.getConfig("md5")).newInstance();
        } catch (Exception e) {
            System.err.println("getFingerPrint: " + e);
            hash = null;
        }
        return Util.getFingerPrint(hash, getHostKey());
    }

    public byte[] getH() {
        return this.H;
    }

    public HASH getHash() {
        return this.sha;
    }

    public byte[] getHostKey() {
        return this.K_S;
    }

    public byte[] getK() {
        return this.K;
    }

    public String getKeyAlgorithName() {
        return this.key_alg_name;
    }

    public String getKeyType() {
        int i = this.type;
        if (i == 1) {
            return "DSA";
        }
        return i == 0 ? "RSA" : "ECDSA";
    }

    public abstract int getState();

    public abstract void init(Session session, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public abstract boolean next(Buffer buffer);

    public byte[] normalize(byte[] bArr) {
        if (bArr.length <= 1 || bArr[0] != 0 || (bArr[1] & 128) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return normalize(bArr2);
    }

    public boolean verify(String str, byte[] bArr, int i, byte[] bArr2) {
        SignatureECDSA signatureECDSA;
        SignatureDSA signatureDSA;
        SignatureRSA signatureRSA;
        SignatureECDSA signatureECDSA2 = null;
        SignatureRSA signatureRSA2 = null;
        SignatureDSA signatureDSA2 = null;
        if (str.equals("ssh-rsa")) {
            this.type = 0;
            this.key_alg_name = str;
            int i2 = i + 3;
            int i3 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216)) | ((bArr[i + 2] << 8) & 65280);
            int i4 = i + 4;
            int i5 = i3 | (bArr[i2] & 255);
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr, i4, bArr3, 0, i5);
            int i6 = i4 + i5;
            int i7 = ((bArr[i6 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i6] << 24)) | (65280 & (bArr[i6 + 2] << 8)) | (bArr[i6 + 3] & 255);
            byte[] bArr4 = new byte[i7];
            System.arraycopy(bArr, i6 + 4, bArr4, 0, i7);
            try {
                signatureRSA = (SignatureRSA) Class.forName(this.session.getConfig("signature.rsa")).newInstance();
                try {
                    signatureRSA.init();
                } catch (Exception e) {
                    e = e;
                    signatureRSA2 = signatureRSA;
                    System.err.println(e);
                    signatureRSA = signatureRSA2;
                }
            } catch (Exception e2) {
                e = e2;
            }
            signatureRSA.setPubKey(bArr3, bArr4);
            signatureRSA.update(this.H);
            boolean zVerify = signatureRSA.verify(bArr2);
            if (!JSch.getLogger().isEnabled(1)) {
                return zVerify;
            }
            JSch.getLogger().log(1, "ssh_rsa_verify: signature " + zVerify);
            return zVerify;
        }
        if (!str.equals("ssh-dss")) {
            if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
                System.err.println("unknown alg");
                return false;
            }
            this.type = 2;
            this.key_alg_name = str;
            int i8 = i + 3;
            int i9 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216)) | ((bArr[i + 2] << 8) & 65280);
            int i10 = i + 4;
            int i11 = i9 | (bArr[i8] & 255);
            System.arraycopy(bArr, i10, new byte[i11], 0, i11);
            int i12 = i10 + i11;
            int i13 = (65280 & (bArr[i12 + 2] << 8)) | (16711680 & (bArr[i12 + 1] << 16)) | ((-16777216) & (bArr[i12] << 24)) | (bArr[i12 + 3] & 255);
            int i14 = i12 + 5;
            int i15 = (i13 - 1) / 2;
            byte[] bArr5 = new byte[i15];
            System.arraycopy(bArr, i14, bArr5, 0, i15);
            byte[] bArr6 = new byte[i15];
            System.arraycopy(bArr, i14 + i15, bArr6, 0, i15);
            try {
                signatureECDSA = (SignatureECDSA) Class.forName(this.session.getConfig(str)).newInstance();
                try {
                    signatureECDSA.init();
                } catch (Exception e3) {
                    e = e3;
                    signatureECDSA2 = signatureECDSA;
                    System.err.println(e);
                    signatureECDSA = signatureECDSA2;
                }
            } catch (Exception e4) {
                e = e4;
            }
            signatureECDSA.setPubKey(bArr5, bArr6);
            signatureECDSA.update(this.H);
            return signatureECDSA.verify(bArr2);
        }
        this.type = 1;
        this.key_alg_name = str;
        int i16 = i + 3;
        int i17 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216)) | ((bArr[i + 2] << 8) & 65280);
        int i18 = i + 4;
        int i19 = i17 | (bArr[i16] & 255);
        byte[] bArr7 = new byte[i19];
        System.arraycopy(bArr, i18, bArr7, 0, i19);
        int i20 = i18 + i19;
        int i21 = i20 + 3;
        int i22 = ((bArr[i20 + 1] << 16) & 16711680) | ((bArr[i20] << 24) & (-16777216)) | ((bArr[i20 + 2] << 8) & 65280);
        int i23 = i20 + 4;
        int i24 = i22 | (bArr[i21] & 255);
        byte[] bArr8 = new byte[i24];
        System.arraycopy(bArr, i23, bArr8, 0, i24);
        int i25 = i23 + i24;
        int i26 = i25 + 3;
        int i27 = ((bArr[i25 + 1] << 16) & 16711680) | ((bArr[i25] << 24) & (-16777216)) | ((bArr[i25 + 2] << 8) & 65280);
        int i28 = i25 + 4;
        int i29 = i27 | (bArr[i26] & 255);
        byte[] bArr9 = new byte[i29];
        System.arraycopy(bArr, i28, bArr9, 0, i29);
        int i30 = i28 + i29;
        int i31 = ((bArr[i30 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i30] << 24)) | (65280 & (bArr[i30 + 2] << 8)) | (bArr[i30 + 3] & 255);
        byte[] bArr10 = new byte[i31];
        System.arraycopy(bArr, i30 + 4, bArr10, 0, i31);
        try {
            signatureDSA = (SignatureDSA) Class.forName(this.session.getConfig("signature.dss")).newInstance();
            try {
                signatureDSA.init();
            } catch (Exception e5) {
                e = e5;
                signatureDSA2 = signatureDSA;
                System.err.println(e);
                signatureDSA = signatureDSA2;
            }
        } catch (Exception e6) {
            e = e6;
        }
        signatureDSA.setPubKey(bArr10, bArr7, bArr8, bArr9);
        signatureDSA.update(this.H);
        boolean zVerify2 = signatureDSA.verify(bArr2);
        if (!JSch.getLogger().isEnabled(1)) {
            return zVerify2;
        }
        JSch.getLogger().log(1, "ssh_dss_verify: signature " + zVerify2);
        return zVerify2;
    }
}
