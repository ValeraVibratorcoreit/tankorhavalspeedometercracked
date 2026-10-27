package com.jcraft.jsch;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairRSA extends KeyPair {
    private static final byte[] begin = Util.str2byte("-----BEGIN RSA PRIVATE KEY-----");
    private static final byte[] end = Util.str2byte("-----END RSA PRIVATE KEY-----");
    private static final byte[] sshrsa = Util.str2byte("ssh-rsa");
    private byte[] c_array;
    private byte[] ep_array;
    private byte[] eq_array;
    private int key_size;
    private byte[] n_array;
    private byte[] p_array;
    private byte[] prv_array;
    private byte[] pub_array;
    private byte[] q_array;

    public KeyPairRSA(JSch jSch) {
        this(jSch, null, null, null);
    }

    public static KeyPair fromSSHAgent(JSch jSch, Buffer buffer) throws JSchException {
        byte[][] bytes = buffer.getBytes(8, "invalid key format");
        KeyPairRSA keyPairRSA = new KeyPairRSA(jSch, bytes[1], bytes[2], bytes[3]);
        keyPairRSA.c_array = bytes[4];
        keyPairRSA.p_array = bytes[5];
        keyPairRSA.q_array = bytes[6];
        keyPairRSA.publicKeyComment = new String(bytes[7]);
        keyPairRSA.vendor = 0;
        return keyPairRSA;
    }

    private byte[] getCArray() {
        if (this.c_array == null) {
            this.c_array = new BigInteger(this.q_array).modInverse(new BigInteger(this.p_array)).toByteArray();
        }
        return this.c_array;
    }

    private byte[] getEPArray() {
        if (this.ep_array == null) {
            this.ep_array = new BigInteger(this.prv_array).mod(new BigInteger(this.p_array).subtract(BigInteger.ONE)).toByteArray();
        }
        return this.ep_array;
    }

    private byte[] getEQArray() {
        if (this.eq_array == null) {
            this.eq_array = new BigInteger(this.prv_array).mod(new BigInteger(this.q_array).subtract(BigInteger.ONE)).toByteArray();
        }
        return this.eq_array;
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
        buffer.putString(sshrsa);
        buffer.putString(this.n_array);
        buffer.putString(this.pub_array);
        buffer.putString(this.prv_array);
        buffer.putString(getCArray());
        buffer.putString(this.p_array);
        buffer.putString(this.q_array);
        buffer.putString(Util.str2byte(this.publicKeyComment));
        int length = buffer.getLength();
        byte[] bArr = new byte[length];
        buffer.getByte(bArr, 0, length);
        return bArr;
    }

    @Override // com.jcraft.jsch.KeyPair
    public void generate(int i) throws JSchException {
        this.key_size = i;
        try {
            KeyPairGenRSA keyPairGenRSA = (KeyPairGenRSA) Class.forName(JSch.getConfig("keypairgen.rsa")).newInstance();
            keyPairGenRSA.init(i);
            this.pub_array = keyPairGenRSA.getE();
            this.prv_array = keyPairGenRSA.getD();
            this.n_array = keyPairGenRSA.getN();
            this.p_array = keyPairGenRSA.getP();
            this.q_array = keyPairGenRSA.getQ();
            this.ep_array = keyPairGenRSA.getEP();
            this.eq_array = keyPairGenRSA.getEQ();
            this.c_array = keyPairGenRSA.getC();
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
        return 2;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getKeyTypeName() {
        return sshrsa;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPrivateKey() {
        int iCountLength = countLength(this.c_array.length) + countLength(this.eq_array.length) + countLength(this.ep_array.length) + countLength(this.q_array.length) + countLength(this.p_array.length) + countLength(this.prv_array.length) + countLength(this.pub_array.length) + countLength(this.n_array.length) + countLength(1) + 3 + this.n_array.length + 1 + this.pub_array.length + 1 + this.prv_array.length + 1 + this.p_array.length + 1 + this.q_array.length + 1 + this.ep_array.length + 1 + this.eq_array.length + 1 + this.c_array.length;
        byte[] bArr = new byte[countLength(iCountLength) + 1 + iCountLength];
        writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeSEQUENCE(bArr, 0, iCountLength), new byte[1]), this.n_array), this.pub_array), this.prv_array), this.p_array), this.q_array), this.ep_array), this.eq_array), this.c_array);
        return bArr;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPublicKeyBlob() {
        byte[] publicKeyBlob = super.getPublicKeyBlob();
        if (publicKeyBlob != null) {
            return publicKeyBlob;
        }
        byte[] bArr = this.pub_array;
        if (bArr == null) {
            return null;
        }
        return Buffer.fromBytes(new byte[][]{sshrsa, bArr, this.n_array}).buffer;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getSignature(byte[] bArr) {
        try {
            SignatureRSA signatureRSA = (SignatureRSA) Class.forName(JSch.getConfig("signature.rsa")).newInstance();
            signatureRSA.init();
            signatureRSA.setPrvKey(this.prv_array, this.n_array);
            signatureRSA.update(bArr);
            return Buffer.fromBytes(new byte[][]{sshrsa, signatureRSA.sign()}).buffer;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public Signature getVerifier() {
        try {
            SignatureRSA signatureRSA = (SignatureRSA) Class.forName(JSch.getConfig("signature.rsa")).newInstance();
            signatureRSA.init();
            if (this.pub_array == null && this.n_array == null && getPublicKeyBlob() != null) {
                Buffer buffer = new Buffer(getPublicKeyBlob());
                buffer.getString();
                this.pub_array = buffer.getString();
                this.n_array = buffer.getString();
            }
            signatureRSA.setPubKey(this.pub_array, this.n_array);
            return signatureRSA;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public boolean parse(byte[] bArr) {
        int i;
        try {
            int i2 = this.vendor;
            if (i2 == 2) {
                Buffer buffer = new Buffer(bArr);
                buffer.skip(bArr.length);
                try {
                    byte[][] bytes = buffer.getBytes(4, "");
                    this.prv_array = bytes[0];
                    this.p_array = bytes[1];
                    this.q_array = bytes[2];
                    this.c_array = bytes[3];
                    getEPArray();
                    getEQArray();
                    return true;
                } catch (JSchException unused) {
                    return false;
                }
            }
            if (i2 == 1) {
                if (bArr[0] == 48) {
                    return false;
                }
                Buffer buffer2 = new Buffer(bArr);
                this.pub_array = buffer2.getMPIntBits();
                this.prv_array = buffer2.getMPIntBits();
                this.n_array = buffer2.getMPIntBits();
                buffer2.getMPIntBits();
                this.p_array = buffer2.getMPIntBits();
                this.q_array = buffer2.getMPIntBits();
                if (this.n_array != null) {
                    this.key_size = new BigInteger(this.n_array).bitLength();
                }
                getEPArray();
                getEQArray();
                getCArray();
                return true;
            }
            byte b = bArr[1];
            if ((b & 128) != 0) {
                int i3 = b & 127;
                i = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    int i5 = i + 1;
                    byte b2 = bArr[i];
                    i = i5;
                    i3 = i4;
                }
            } else {
                i = 2;
            }
            if (bArr[i] != 2) {
                return false;
            }
            int i6 = i + 1;
            int i7 = i + 2;
            int i8 = bArr[i6];
            int i9 = i8 & 255;
            if ((i8 & 128) != 0) {
                int i10 = i8 & 127;
                i9 = 0;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    int i12 = (i9 << 8) + (bArr[i7] & 255);
                    i7++;
                    i9 = i12;
                    i10 = i11;
                }
            }
            int i13 = i7 + i9;
            int i14 = i13 + 1;
            int i15 = i13 + 2;
            int i16 = bArr[i14];
            int i17 = i16 & 255;
            if ((i16 & 128) != 0) {
                int i18 = i16 & 127;
                i17 = 0;
                while (true) {
                    int i19 = i18 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    int i20 = (i17 << 8) + (bArr[i15] & 255);
                    i15++;
                    i17 = i20;
                    i18 = i19;
                }
            }
            byte[] bArr2 = new byte[i17];
            this.n_array = bArr2;
            System.arraycopy(bArr, i15, bArr2, 0, i17);
            int i21 = i15 + i17;
            int i22 = i21 + 1;
            int i23 = i21 + 2;
            int i24 = bArr[i22];
            int i25 = i24 & 255;
            if ((i24 & 128) != 0) {
                int i26 = i24 & 127;
                i25 = 0;
                while (true) {
                    int i27 = i26 - 1;
                    if (i26 <= 0) {
                        break;
                    }
                    int i28 = (i25 << 8) + (bArr[i23] & 255);
                    i23++;
                    i25 = i28;
                    i26 = i27;
                }
            }
            byte[] bArr3 = new byte[i25];
            this.pub_array = bArr3;
            System.arraycopy(bArr, i23, bArr3, 0, i25);
            int i29 = i23 + i25;
            int i30 = i29 + 1;
            int i31 = i29 + 2;
            int i32 = bArr[i30];
            int i33 = i32 & 255;
            if ((i32 & 128) != 0) {
                int i34 = i32 & 127;
                i33 = 0;
                while (true) {
                    int i35 = i34 - 1;
                    if (i34 <= 0) {
                        break;
                    }
                    int i36 = (i33 << 8) + (bArr[i31] & 255);
                    i31++;
                    i33 = i36;
                    i34 = i35;
                }
            }
            byte[] bArr4 = new byte[i33];
            this.prv_array = bArr4;
            System.arraycopy(bArr, i31, bArr4, 0, i33);
            int i37 = i31 + i33;
            int i38 = i37 + 1;
            int i39 = i37 + 2;
            int i40 = bArr[i38];
            int i41 = i40 & 255;
            if ((i40 & 128) != 0) {
                int i42 = i40 & 127;
                i41 = 0;
                while (true) {
                    int i43 = i42 - 1;
                    if (i42 <= 0) {
                        break;
                    }
                    int i44 = (i41 << 8) + (bArr[i39] & 255);
                    i39++;
                    i41 = i44;
                    i42 = i43;
                }
            }
            byte[] bArr5 = new byte[i41];
            this.p_array = bArr5;
            System.arraycopy(bArr, i39, bArr5, 0, i41);
            int i45 = i39 + i41;
            int i46 = i45 + 1;
            int i47 = i45 + 2;
            int i48 = bArr[i46];
            int i49 = i48 & 255;
            if ((i48 & 128) != 0) {
                int i50 = i48 & 127;
                i49 = 0;
                while (true) {
                    int i51 = i50 - 1;
                    if (i50 <= 0) {
                        break;
                    }
                    int i52 = (i49 << 8) + (bArr[i47] & 255);
                    i47++;
                    i49 = i52;
                    i50 = i51;
                }
            }
            byte[] bArr6 = new byte[i49];
            this.q_array = bArr6;
            System.arraycopy(bArr, i47, bArr6, 0, i49);
            int i53 = i47 + i49;
            int i54 = i53 + 1;
            int i55 = i53 + 2;
            int i56 = bArr[i54];
            int i57 = i56 & 255;
            if ((i56 & 128) != 0) {
                int i58 = i56 & 127;
                i57 = 0;
                while (true) {
                    int i59 = i58 - 1;
                    if (i58 <= 0) {
                        break;
                    }
                    int i60 = (i57 << 8) + (bArr[i55] & 255);
                    i55++;
                    i57 = i60;
                    i58 = i59;
                }
            }
            byte[] bArr7 = new byte[i57];
            this.ep_array = bArr7;
            System.arraycopy(bArr, i55, bArr7, 0, i57);
            int i61 = i55 + i57;
            int i62 = i61 + 1;
            int i63 = i61 + 2;
            int i64 = bArr[i62];
            int i65 = i64 & 255;
            if ((i64 & 128) != 0) {
                int i66 = i64 & 127;
                i65 = 0;
                while (true) {
                    int i67 = i66 - 1;
                    if (i66 <= 0) {
                        break;
                    }
                    int i68 = (i65 << 8) + (bArr[i63] & 255);
                    i63++;
                    i65 = i68;
                    i66 = i67;
                }
            }
            byte[] bArr8 = new byte[i65];
            this.eq_array = bArr8;
            System.arraycopy(bArr, i63, bArr8, 0, i65);
            int i69 = i63 + i65;
            int i70 = i69 + 1;
            int i71 = i69 + 2;
            int i72 = bArr[i70];
            int i73 = i72 & 255;
            if ((i72 & 128) != 0) {
                int i74 = i72 & 127;
                i73 = 0;
                while (true) {
                    int i75 = i74 - 1;
                    if (i74 <= 0) {
                        break;
                    }
                    int i76 = (i73 << 8) + (bArr[i71] & 255);
                    i71++;
                    i73 = i76;
                    i74 = i75;
                }
            }
            byte[] bArr9 = new byte[i73];
            this.c_array = bArr9;
            System.arraycopy(bArr, i71, bArr9, 0, i73);
            if (this.n_array != null) {
                this.key_size = new BigInteger(this.n_array).bitLength();
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public KeyPairRSA(JSch jSch, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(jSch);
        this.key_size = 1024;
        this.n_array = bArr;
        this.pub_array = bArr2;
        this.prv_array = bArr3;
        if (bArr != null) {
            this.key_size = new BigInteger(bArr).bitLength();
        }
    }
}
