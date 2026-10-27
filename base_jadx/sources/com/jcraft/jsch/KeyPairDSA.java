package com.jcraft.jsch;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairDSA extends KeyPair {
    private static final byte[] begin = Util.str2byte("-----BEGIN DSA PRIVATE KEY-----");
    private static final byte[] end = Util.str2byte("-----END DSA PRIVATE KEY-----");
    private static final byte[] sshdss = Util.str2byte("ssh-dss");
    private byte[] G_array;
    private byte[] P_array;
    private byte[] Q_array;
    private int key_size;
    private byte[] prv_array;
    private byte[] pub_array;

    public KeyPairDSA(JSch jSch) {
        this(jSch, null, null, null, null, null);
    }

    public static KeyPair fromSSHAgent(JSch jSch, Buffer buffer) throws JSchException {
        byte[][] bytes = buffer.getBytes(7, "invalid key format");
        KeyPairDSA keyPairDSA = new KeyPairDSA(jSch, bytes[1], bytes[2], bytes[3], bytes[4], bytes[5]);
        keyPairDSA.publicKeyComment = new String(bytes[6]);
        keyPairDSA.vendor = 0;
        return keyPairDSA;
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
        buffer.putString(sshdss);
        buffer.putString(this.P_array);
        buffer.putString(this.Q_array);
        buffer.putString(this.G_array);
        buffer.putString(this.pub_array);
        buffer.putString(this.prv_array);
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
            KeyPairGenDSA keyPairGenDSA = (KeyPairGenDSA) Class.forName(JSch.getConfig("keypairgen.dsa")).newInstance();
            keyPairGenDSA.init(i);
            this.P_array = keyPairGenDSA.getP();
            this.Q_array = keyPairGenDSA.getQ();
            this.G_array = keyPairGenDSA.getG();
            this.pub_array = keyPairGenDSA.getY();
            this.prv_array = keyPairGenDSA.getX();
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
        return 1;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getKeyTypeName() {
        return sshdss;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPrivateKey() {
        int iCountLength = countLength(this.prv_array.length) + countLength(this.pub_array.length) + countLength(this.G_array.length) + countLength(this.Q_array.length) + countLength(this.P_array.length) + countLength(1) + 3 + this.P_array.length + 1 + this.Q_array.length + 1 + this.G_array.length + 1 + this.pub_array.length + 1 + this.prv_array.length;
        byte[] bArr = new byte[countLength(iCountLength) + 1 + iCountLength];
        writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeINTEGER(bArr, writeSEQUENCE(bArr, 0, iCountLength), new byte[1]), this.P_array), this.Q_array), this.G_array), this.pub_array), this.prv_array);
        return bArr;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getPublicKeyBlob() {
        byte[] publicKeyBlob = super.getPublicKeyBlob();
        if (publicKeyBlob != null) {
            return publicKeyBlob;
        }
        byte[] bArr = this.P_array;
        if (bArr == null) {
            return null;
        }
        return Buffer.fromBytes(new byte[][]{sshdss, bArr, this.Q_array, this.G_array, this.pub_array}).buffer;
    }

    @Override // com.jcraft.jsch.KeyPair
    public byte[] getSignature(byte[] bArr) {
        try {
            SignatureDSA signatureDSA = (SignatureDSA) Class.forName(JSch.getConfig("signature.dss")).newInstance();
            signatureDSA.init();
            signatureDSA.setPrvKey(this.prv_array, this.P_array, this.Q_array, this.G_array);
            signatureDSA.update(bArr);
            return Buffer.fromBytes(new byte[][]{sshdss, signatureDSA.sign()}).buffer;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public Signature getVerifier() {
        try {
            SignatureDSA signatureDSA = (SignatureDSA) Class.forName(JSch.getConfig("signature.dss")).newInstance();
            signatureDSA.init();
            if (this.pub_array == null && this.P_array == null && getPublicKeyBlob() != null) {
                Buffer buffer = new Buffer(getPublicKeyBlob());
                buffer.getString();
                this.P_array = buffer.getString();
                this.Q_array = buffer.getString();
                this.G_array = buffer.getString();
                this.pub_array = buffer.getString();
            }
            signatureDSA.setPubKey(this.pub_array, this.P_array, this.Q_array, this.G_array);
            return signatureDSA;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.jcraft.jsch.KeyPair
    public boolean parse(byte[] bArr) {
        int i;
        try {
            int i2 = this.vendor;
            if (i2 == 1) {
                if (bArr[0] == 48) {
                    return false;
                }
                Buffer buffer = new Buffer(bArr);
                buffer.getInt();
                this.P_array = buffer.getMPIntBits();
                this.G_array = buffer.getMPIntBits();
                this.Q_array = buffer.getMPIntBits();
                this.pub_array = buffer.getMPIntBits();
                this.prv_array = buffer.getMPIntBits();
                if (this.P_array != null) {
                    this.key_size = new BigInteger(this.P_array).bitLength();
                }
                return true;
            }
            if (i2 == 2) {
                Buffer buffer2 = new Buffer(bArr);
                buffer2.skip(bArr.length);
                try {
                    this.prv_array = buffer2.getBytes(1, "")[0];
                    return true;
                } catch (JSchException unused) {
                    return false;
                }
            }
            if (bArr[0] != 48) {
                return false;
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
            this.P_array = bArr2;
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
            this.Q_array = bArr3;
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
            this.G_array = bArr4;
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
            this.pub_array = bArr5;
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
            this.prv_array = bArr6;
            System.arraycopy(bArr, i47, bArr6, 0, i49);
            if (this.P_array != null) {
                this.key_size = new BigInteger(this.P_array).bitLength();
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public KeyPairDSA(JSch jSch, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(jSch);
        this.key_size = 1024;
        this.P_array = bArr;
        this.Q_array = bArr2;
        this.G_array = bArr3;
        this.pub_array = bArr4;
        this.prv_array = bArr5;
        if (bArr != null) {
            this.key_size = new BigInteger(bArr).bitLength();
        }
    }
}
