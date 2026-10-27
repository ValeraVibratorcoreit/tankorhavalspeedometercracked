package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairECDSA extends KeyPair {
    private int key_size;
    private byte[] name;
    private byte[] prv_array;
    private byte[] r_array;
    private byte[] s_array;
    private static byte[][] oids = {new byte[]{6, 8, 42, -122, 72, -50, 61, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};
    private static String[] names = {"nistp256", "nistp384", "nistp521"};
    private static final byte[] begin = Util.str2byte("-----BEGIN EC PRIVATE KEY-----");
    private static final byte[] end = Util.str2byte("-----END EC PRIVATE KEY-----");

    public KeyPairECDSA(JSch jSch) {
        this(jSch, null, null, null, null);
    }

    public static byte[][] fromPoint(byte[] bArr) {
        int i = 0;
        while (bArr[i] != 4) {
            i++;
        }
        int i2 = i + 1;
        int length = (bArr.length - i2) / 2;
        byte[] bArr2 = new byte[length];
        int length2 = (bArr.length - i2) / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, i2, bArr2, 0, length);
        System.arraycopy(bArr, i2 + length, bArr3, 0, length2);
        return new byte[][]{bArr2, bArr3};
    }

    public static KeyPair fromSSHAgent(JSch jSch, Buffer buffer) throws JSchException {
        byte[][] bytes = buffer.getBytes(5, "invalid key format");
        byte[] bArr = bytes[1];
        byte[][] bArrFromPoint = fromPoint(bytes[2]);
        KeyPairECDSA keyPairECDSA = new KeyPairECDSA(jSch, bArr, bArrFromPoint[0], bArrFromPoint[1], bytes[3]);
        keyPairECDSA.publicKeyComment = new String(bytes[4]);
        keyPairECDSA.vendor = 0;
        return keyPairECDSA;
    }

    public static byte[] toPoint(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + 1 + bArr2.length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        return bArr3;
    }

    @Override // com.jcraft.jsch.KeyPair
    public void dispose() {
        super.dispose();
        Util.bzero(this.prv_array);
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] forSSHAgent() throws JSchException {
        if (isEncrypted()) {
            throw new JSchException("key is encrypted.");
        }
        Buffer buffer = new Buffer();
        buffer.putString(Util.str2byte("ecdsa-sha2-".concat(new String(this.name))));
        buffer.putString(this.name);
        buffer.putString(toPoint(this.r_array, this.s_array));
        buffer.putString(this.prv_array);
        buffer.putString(Util.str2byte(this.publicKeyComment));
        int length = buffer.getLength();
        byte[] bArr = new byte[length];
        buffer.getByte(bArr, 0, length);
        return bArr;
    }

    @Override // com.jcraft.jsch.KeyPair
    public void generate(int i) throws JSchException {
        char c;
        this.key_size = i;
        try {
            KeyPairGenECDSA keyPairGenECDSA = (KeyPairGenECDSA) Class.forName(JSch.getConfig("keypairgen.ecdsa")).newInstance();
            keyPairGenECDSA.init(i);
            this.prv_array = keyPairGenECDSA.getD();
            this.r_array = keyPairGenECDSA.getR();
            this.s_array = keyPairGenECDSA.getS();
            String[] strArr = names;
            byte[] bArr = this.prv_array;
            if (bArr.length >= 64) {
                c = 2;
            } else {
                c = bArr.length >= 48 ? (char) 1 : (char) 0;
            }
            this.name = Util.str2byte(strArr[c]);
        } catch (Exception e) {
            throw new JSchException(e.toString(), e);
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getBegin() {
        return begin;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getEnd() {
        return end;
    }

    @Override // com.jcraft.jsch.KeyPair
    public int getKeySize() {
        return this.key_size;
    }

    @Override // com.jcraft.jsch.KeyPair
    public int getKeyType() {
        return 3;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getKeyTypeName() {
        return Util.str2byte("ecdsa-sha2-".concat(new String(this.name)));
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPrivateKey() {
        char c;
        byte[] bArr = {1};
        byte[][] bArr2 = oids;
        byte[] bArr3 = this.r_array;
        if (bArr3.length >= 64) {
            c = 2;
        } else {
            c = bArr3.length >= 48 ? (char) 1 : (char) 0;
        }
        byte[] bArr4 = bArr2[c];
        byte[] point = toPoint(bArr3, this.s_array);
        int i = ((point.length + 1) & 128) == 0 ? 3 : 4;
        int length = point.length + i;
        byte[] bArr5 = new byte[length];
        System.arraycopy(point, 0, bArr5, i, point.length);
        bArr5[0] = 3;
        if (i == 3) {
            bArr5[1] = (byte) (point.length + 1);
        } else {
            bArr5[1] = -127;
            bArr5[2] = (byte) (point.length + 1);
        }
        int iCountLength = countLength(length) + countLength(bArr4.length) + countLength(this.prv_array.length) + countLength(1) + 3 + this.prv_array.length + 1 + bArr4.length + 1 + length;
        byte[] bArr6 = new byte[countLength(iCountLength) + 1 + iCountLength];
        writeDATA(bArr6, (byte) -95, writeDATA(bArr6, (byte) -96, writeOCTETSTRING(bArr6, writeINTEGER(bArr6, writeSEQUENCE(bArr6, 0, iCountLength), bArr), this.prv_array), bArr4), bArr5);
        return bArr6;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPublicKeyBlob() {
        byte[] publicKeyBlob = super.getPublicKeyBlob();
        if (publicKeyBlob != null) {
            return publicKeyBlob;
        }
        if (this.r_array == null) {
            return null;
        }
        byte[] bArrStr2byte = Util.str2byte("ecdsa-sha2-".concat(new String(this.name)));
        byte[] bArr = this.name;
        byte[] bArr2 = this.r_array;
        byte[][] bArr3 = {bArrStr2byte, bArr, new byte[bArr2.length + 1 + this.s_array.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.s_array;
        System.arraycopy(bArr5, 0, bArr3[2], this.r_array.length + 1, bArr5.length);
        return Buffer.fromBytes(bArr3).buffer;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getSignature(byte[] bArr) {
        try {
            SignatureECDSA signatureECDSA = (SignatureECDSA) Class.forName(JSch.getConfig("ecdsa-sha2-".concat(new String(this.name)))).newInstance();
            signatureECDSA.init();
            signatureECDSA.setPrvKey(this.prv_array);
            signatureECDSA.update(bArr);
            return Buffer.fromBytes(new byte[][]{Util.str2byte("ecdsa-sha2-".concat(new String(this.name))), signatureECDSA.sign()}).buffer;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public Signature getVerifier() {
        try {
            SignatureECDSA signatureECDSA = (SignatureECDSA) Class.forName(JSch.getConfig("ecdsa-sha2-".concat(new String(this.name)))).newInstance();
            signatureECDSA.init();
            if (this.r_array == null && this.s_array == null && getPublicKeyBlob() != null) {
                Buffer buffer = new Buffer(getPublicKeyBlob());
                buffer.getString();
                buffer.getString();
                byte[][] bArrFromPoint = fromPoint(buffer.getString());
                this.r_array = bArrFromPoint[0];
                this.s_array = bArrFromPoint[1];
            }
            signatureECDSA.setPubKey(this.r_array, this.s_array);
            return signatureECDSA;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public boolean parse(byte[] bArr) {
        int i;
        int i2;
        try {
            int i3 = this.vendor;
            if (i3 == 1 || i3 == 2 || bArr[0] != 48) {
                return false;
            }
            byte b = bArr[1];
            if ((b & 128) != 0) {
                int i4 = b & 127;
                i = 2;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    i = i6;
                    i4 = i5;
                }
            } else {
                i = 2;
            }
            if (bArr[i] != 2) {
                return false;
            }
            int i7 = i + 1;
            int i8 = i + 2;
            int i9 = bArr[i7];
            int i10 = i9 & 255;
            if ((i9 & 128) != 0) {
                int i11 = i9 & 127;
                i10 = 0;
                while (true) {
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        break;
                    }
                    int i13 = (i10 << 8) + (bArr[i8] & 255);
                    i8++;
                    i10 = i13;
                    i11 = i12;
                }
            }
            int i14 = i8 + i10;
            int i15 = i14 + 1;
            int i16 = i14 + 2;
            int i17 = bArr[i15];
            int i18 = i17 & 255;
            if ((i17 & 128) != 0) {
                int i19 = i17 & 127;
                i18 = 0;
                while (true) {
                    int i20 = i19 - 1;
                    if (i19 <= 0) {
                        break;
                    }
                    int i21 = (i18 << 8) + (bArr[i16] & 255);
                    i16++;
                    i18 = i21;
                    i19 = i20;
                }
            }
            byte[] bArr2 = new byte[i18];
            this.prv_array = bArr2;
            System.arraycopy(bArr, i16, bArr2, 0, i18);
            int i22 = i16 + i18;
            int i23 = i22 + 1;
            int i24 = i22 + 2;
            int i25 = bArr[i23];
            int i26 = i25 & 255;
            if ((i25 & 128) != 0) {
                int i27 = i25 & 127;
                i26 = 0;
                while (true) {
                    int i28 = i27 - 1;
                    if (i27 <= 0) {
                        break;
                    }
                    int i29 = (i26 << 8) + (bArr[i24] & 255);
                    i24++;
                    i26 = i29;
                    i27 = i28;
                }
            }
            byte[] bArr3 = new byte[i26];
            System.arraycopy(bArr, i24, bArr3, 0, i26);
            int i30 = i24 + i26;
            int i31 = 0;
            while (true) {
                byte[][] bArr4 = oids;
                if (i31 >= bArr4.length) {
                    break;
                }
                if (Util.array_equals(bArr4[i31], bArr3)) {
                    this.name = Util.str2byte(names[i31]);
                    break;
                }
                i31++;
            }
            int i32 = i30 + 1;
            int i33 = i30 + 2;
            int i34 = bArr[i32];
            int i35 = i34 & 255;
            if ((i34 & 128) != 0) {
                int i36 = i34 & 127;
                i35 = 0;
                while (true) {
                    int i37 = i36 - 1;
                    if (i36 <= 0) {
                        break;
                    }
                    int i38 = (i35 << 8) + (bArr[i33] & 255);
                    i33++;
                    i35 = i38;
                    i36 = i37;
                }
            }
            byte[] bArr5 = new byte[i35];
            System.arraycopy(bArr, i33, bArr5, 0, i35);
            byte[][] bArrFromPoint = fromPoint(bArr5);
            this.r_array = bArrFromPoint[0];
            this.s_array = bArrFromPoint[1];
            byte[] bArr6 = this.prv_array;
            if (bArr6 != null) {
                if (bArr6.length >= 64) {
                    i2 = 521;
                } else {
                    i2 = bArr6.length >= 48 ? 384 : 256;
                }
                this.key_size = i2;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public KeyPairECDSA(JSch jSch, byte[] bArr) {
        this(jSch, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            if (Util.array_equals(bArr2, Util.str2byte("nistp384"))) {
                this.key_size = 384;
                this.name = bArr2;
            }
            if (Util.array_equals(bArr2, Util.str2byte("nistp521"))) {
                this.key_size = 521;
                this.name = bArr2;
            }
        }
    }

    public KeyPairECDSA(JSch jSch, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(jSch);
        this.name = Util.str2byte(names[0]);
        int i = 256;
        this.key_size = 256;
        if (bArr != null) {
            this.name = bArr;
        }
        this.r_array = bArr2;
        this.s_array = bArr3;
        this.prv_array = bArr4;
        if (bArr4 != null) {
            if (bArr4.length >= 64) {
                i = 521;
            } else if (bArr4.length >= 48) {
                i = 384;
            }
            this.key_size = i;
        }
    }
}
