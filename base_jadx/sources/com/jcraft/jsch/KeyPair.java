package com.jcraft.jsch;

import defpackage.Vo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public abstract class KeyPair {
    public static final int DSA = 1;
    public static final int ECDSA = 3;
    public static final int ERROR = 0;
    public static final int RSA = 2;
    public static final int UNKNOWN = 4;
    static final int VENDOR_FSECURE = 1;
    static final int VENDOR_OPENSSH = 0;
    static final int VENDOR_PKCS8 = 3;
    static final int VENDOR_PUTTY = 2;
    private Cipher cipher;
    private HASH hash;
    JSch jsch;
    private byte[] passphrase;
    private Random random;
    private static final byte[] cr = Util.str2byte("\n");
    static byte[][] header = {Util.str2byte("Proc-Type: 4,ENCRYPTED"), Util.str2byte("DEK-Info: DES-EDE3-CBC,")};
    private static byte[] space = Util.str2byte(" ");
    private static final String[] header1 = {"PuTTY-User-Key-File-2: ", "Encryption: ", "Comment: ", "Public-Lines: "};
    private static final String[] header2 = {"Private-Lines: "};
    private static final String[] header3 = {"Private-MAC: "};
    int vendor = 0;
    protected String publicKeyComment = "no comment";
    protected boolean encrypted = false;
    protected byte[] data = null;
    private byte[] iv = null;
    private byte[] publickeyblob = null;

    public class ASN1 {
        byte[] buf;
        int length;
        int start;

        public ASN1(KeyPair keyPair, byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        private int getLength(int[] iArr) {
            int i = iArr[0];
            int i2 = i + 1;
            byte b = this.buf[i];
            int i3 = b & 255;
            if ((b & 128) != 0) {
                int i4 = b & 127;
                i3 = 0;
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    i3 = (this.buf[i2] & 255) + (i3 << 8);
                    i4 = i5;
                    i2++;
                }
            }
            iArr[0] = i2;
            return i3;
        }

        public byte[] getContent() {
            int[] iArr = {this.start + 1};
            int length = getLength(iArr);
            byte[] bArr = new byte[length];
            System.arraycopy(this.buf, iArr[0], bArr, 0, length);
            return bArr;
        }

        public ASN1[] getContents() {
            byte[] bArr = this.buf;
            int i = this.start;
            byte b = bArr[i];
            int[] iArr = {i + 1};
            int length = getLength(iArr);
            if (b == 5) {
                return new ASN1[0];
            }
            int i2 = iArr[0];
            Vector vector = new Vector();
            while (length > 0) {
                int i3 = i2 + 1;
                iArr[0] = i3;
                int length2 = getLength(iArr);
                int i4 = iArr[0];
                int i5 = i4 - i3;
                vector.addElement(KeyPair.this.new ASN1(this.buf, i2, i5 + 1 + length2));
                i2 = i4 + length2;
                length = ((length - 1) - i5) - length2;
            }
            ASN1[] asn1Arr = new ASN1[vector.size()];
            for (int i6 = 0; i6 < vector.size(); i6++) {
                asn1Arr[i6] = (ASN1) vector.elementAt(i6);
            }
            return asn1Arr;
        }

        public int getType() {
            return this.buf[this.start] & 255;
        }

        public boolean isINTEGER() {
            return getType() == 2;
        }

        public boolean isOBJECT() {
            return getType() == 6;
        }

        public boolean isOCTETSTRING() {
            return getType() == 4;
        }

        public boolean isSEQUENCE() {
            return getType() == 48;
        }

        public ASN1(byte[] bArr, int i, int i2) throws ASN1Exception {
            this.buf = bArr;
            this.start = i;
            this.length = i2;
            if (i + i2 > bArr.length) {
                throw KeyPair.this.new ASN1Exception();
            }
        }
    }

    public class ASN1Exception extends Exception {
        public ASN1Exception() {
        }
    }

    public KeyPair(JSch jSch) {
        this.jsch = jSch;
    }

    private static byte a2b(byte b) {
        return (byte) ((48 > b || b > 57) ? b - 87 : b - 48);
    }

    private static byte b2a(byte b) {
        return (byte) ((b < 0 || b > 9) ? b + 55 : b + 48);
    }

    private byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArrGenKey = genKey(bArr2, bArr3);
            this.cipher.init(1, bArrGenKey, bArr3);
            Util.bzero(bArrGenKey);
            byte[] bArr4 = new byte[bArr.length];
            this.cipher.update(bArr, 0, bArr.length, bArr4, 0);
            return bArr4;
        } catch (Exception unused) {
            return null;
        }
    }

    private byte[] encrypt(byte[] bArr, byte[][] bArr2, byte[] bArr3) {
        if (bArr3 == null) {
            return bArr;
        }
        if (this.cipher == null) {
            this.cipher = genCipher();
        }
        int iVSize = this.cipher.getIVSize();
        byte[] bArr4 = new byte[iVSize];
        bArr2[0] = bArr4;
        if (this.random == null) {
            this.random = genRandom();
        }
        this.random.fill(bArr4, 0, iVSize);
        byte[] bArrGenKey = genKey(bArr3, bArr4);
        int iVSize2 = this.cipher.getIVSize();
        int length = ((bArr.length / iVSize2) + 1) * iVSize2;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length2 = iVSize2 - (bArr.length % iVSize2);
        for (int i = length - 1; length - length2 <= i; i--) {
            bArr5[i] = (byte) length2;
        }
        try {
            this.cipher.init(0, bArrGenKey, bArr4);
            this.cipher.update(bArr5, 0, length, bArr5, 0);
        } catch (Exception unused) {
        }
        Util.bzero(bArrGenKey);
        return bArr5;
    }

    private Cipher genCipher() {
        try {
            this.cipher = (Cipher) Class.forName(JSch.getConfig("3des-cbc")).newInstance();
        } catch (Exception unused) {
        }
        return this.cipher;
    }

    private HASH genHash() {
        try {
            HASH hash = (HASH) Class.forName(JSch.getConfig("md5")).newInstance();
            this.hash = hash;
            hash.init();
        } catch (Exception unused) {
        }
        return this.hash;
    }

    public static KeyPair genKeyPair(JSch jSch, int i) {
        return genKeyPair(jSch, i, 1024);
    }

    private Random genRandom() {
        if (this.random == null) {
            try {
                this.random = (Random) Class.forName(JSch.getConfig("random")).newInstance();
            } catch (Exception e) {
                System.err.println("connect: random " + e);
            }
        }
        return this.random;
    }

    public static KeyPair load(JSch jSch, String str) {
        String strF = Vo.f(str, ".pub");
        if (!new File(strF).exists()) {
            strF = null;
        }
        return load(jSch, str, strF);
    }

    public static KeyPair loadPPK(JSch jSch, byte[] bArr) throws JSchException {
        KeyPair keyPairDSA;
        Buffer buffer = new Buffer(bArr);
        Hashtable hashtable = new Hashtable();
        while (parseHeader(buffer, hashtable)) {
        }
        String str = (String) hashtable.get("PuTTY-User-Key-File-2");
        if (str == null) {
            return null;
        }
        byte[] lines = parseLines(buffer, Integer.parseInt((String) hashtable.get("Public-Lines")));
        while (parseHeader(buffer, hashtable)) {
        }
        byte[] lines2 = parseLines(buffer, Integer.parseInt((String) hashtable.get("Private-Lines")));
        while (parseHeader(buffer, hashtable)) {
        }
        byte[] bArrFromBase64 = Util.fromBase64(lines2, 0, lines2.length);
        byte[] bArrFromBase65 = Util.fromBase64(lines, 0, lines.length);
        if (str.equals("ssh-rsa")) {
            Buffer buffer2 = new Buffer(bArrFromBase65);
            buffer2.skip(bArrFromBase65.length);
            buffer2.getByte(new byte[buffer2.getInt()]);
            byte[] bArr2 = new byte[buffer2.getInt()];
            buffer2.getByte(bArr2);
            byte[] bArr3 = new byte[buffer2.getInt()];
            buffer2.getByte(bArr3);
            keyPairDSA = new KeyPairRSA(jSch, bArr3, bArr2, null);
        } else {
            if (!str.equals("ssh-dss")) {
                return null;
            }
            Buffer buffer3 = new Buffer(bArrFromBase65);
            buffer3.skip(bArrFromBase65.length);
            buffer3.getByte(new byte[buffer3.getInt()]);
            byte[] bArr4 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr4);
            byte[] bArr5 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr5);
            byte[] bArr6 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr6);
            byte[] bArr7 = new byte[buffer3.getInt()];
            buffer3.getByte(bArr7);
            keyPairDSA = new KeyPairDSA(jSch, bArr4, bArr5, bArr6, bArr7, null);
        }
        keyPairDSA.encrypted = !hashtable.get("Encryption").equals("none");
        keyPairDSA.vendor = 2;
        keyPairDSA.publicKeyComment = (String) hashtable.get("Comment");
        if (!keyPairDSA.encrypted) {
            keyPairDSA.data = bArrFromBase64;
            keyPairDSA.parse(bArrFromBase64);
        } else {
            if (!Session.checkCipher(JSch.getConfig("aes256-cbc"))) {
                throw new JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
            }
            try {
                Cipher cipher = (Cipher) Class.forName(JSch.getConfig("aes256-cbc")).newInstance();
                keyPairDSA.cipher = cipher;
                keyPairDSA.iv = new byte[cipher.getIVSize()];
                keyPairDSA.data = bArrFromBase64;
            } catch (Exception unused) {
                throw new JSchException("The cipher 'aes256-cbc' is required, but it is not available.");
            }
        }
        return keyPairDSA;
    }

    private static boolean parseHeader(Buffer buffer, Hashtable hashtable) {
        String str;
        String str2;
        byte b;
        byte[] bArr = buffer.buffer;
        int i = buffer.index;
        int i2 = i;
        while (true) {
            str = null;
            if (i2 >= bArr.length || (b = bArr[i2]) == 13) {
                str2 = null;
                break;
            }
            if (b == 58) {
                str2 = new String(bArr, i, i2 - i);
                i = i2 + 1;
                if (i >= bArr.length || bArr[i] != 32) {
                    break;
                    break;
                }
                i = i2 + 2;
                break;
            }
            i2++;
        }
        if (str2 == null) {
            return false;
        }
        for (int i3 = i; i3 < bArr.length; i3++) {
            if (bArr[i3] == 13) {
                str = new String(bArr, i, i3 - i);
                i = i3 + 1;
                if (i >= bArr.length || bArr[i] != 10) {
                    break;
                    break;
                }
                i = i3 + 2;
                break;
            }
        }
        if (str != null) {
            hashtable.put(str2, str);
            buffer.index = i;
        }
        return str != null;
    }

    private static byte[] parseLines(Buffer buffer, int i) {
        byte[] bArr;
        byte[] bArr2 = buffer.buffer;
        int i2 = buffer.index;
        byte[] bArr3 = null;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                break;
            }
            int i4 = i2;
            while (bArr2.length > i4) {
                int i5 = i4 + 1;
                if (bArr2[i4] == 13) {
                    if (bArr3 == null) {
                        int i6 = (i5 - i2) - 1;
                        bArr = new byte[i6];
                        System.arraycopy(bArr2, i2, bArr, 0, i6);
                    } else {
                        bArr = new byte[((bArr3.length + i5) - i2) - 1];
                        System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                        System.arraycopy(bArr2, i2, bArr, bArr3.length, (i5 - i2) - 1);
                        for (int i7 = 0; i7 < bArr3.length; i7++) {
                            bArr3[i7] = 0;
                        }
                    }
                    i4 = i5;
                    bArr3 = bArr;
                    break;
                }
                i4 = i5;
            }
            if (bArr2[i4] == 10) {
                i4++;
            }
            i2 = i4;
            i = i3;
        }
        if (bArr3 != null) {
            buffer.index = i2;
        }
        return bArr3;
    }

    public void copy(KeyPair keyPair) {
        this.publickeyblob = keyPair.publickeyblob;
        this.vendor = keyPair.vendor;
        this.publicKeyComment = keyPair.publicKeyComment;
        this.cipher = keyPair.cipher;
    }

    public int countLength(int i) {
        int i2 = 1;
        if (i <= 127) {
            return 1;
        }
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }

    public void dispose() {
        Util.bzero(this.passphrase);
    }

    public void finalize() {
        dispose();
    }

    public abstract byte[] forSSHAgent();

    public synchronized byte[] genKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        try {
            if (this.cipher == null) {
                this.cipher = genCipher();
            }
            if (this.hash == null) {
                this.hash = genHash();
            }
            int blockSize = this.cipher.getBlockSize();
            bArr3 = new byte[blockSize];
            int blockSize2 = this.hash.getBlockSize();
            int i = ((blockSize / blockSize2) * blockSize2) + (blockSize % blockSize2 == 0 ? 0 : blockSize2);
            byte[] bArr4 = new byte[i];
            try {
                int i2 = this.vendor;
                byte[] bArrDigest = null;
                if (i2 == 0) {
                    int length = 0;
                    while (length + blockSize2 <= i) {
                        if (bArrDigest != null) {
                            this.hash.update(bArrDigest, 0, bArrDigest.length);
                        }
                        this.hash.update(bArr, 0, bArr.length);
                        HASH hash = this.hash;
                        int length2 = 8;
                        if (bArr2.length <= 8) {
                            length2 = bArr2.length;
                        }
                        hash.update(bArr2, 0, length2);
                        bArrDigest = this.hash.digest();
                        System.arraycopy(bArrDigest, 0, bArr4, length, bArrDigest.length);
                        length += bArrDigest.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i2 == 1) {
                    int length3 = 0;
                    while (length3 + blockSize2 <= i) {
                        if (bArrDigest != null) {
                            this.hash.update(bArrDigest, 0, bArrDigest.length);
                        }
                        this.hash.update(bArr, 0, bArr.length);
                        bArrDigest = this.hash.digest();
                        System.arraycopy(bArrDigest, 0, bArr4, length3, bArrDigest.length);
                        length3 += bArrDigest.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i2 == 2) {
                    HASH hash2 = (HASH) Class.forName(JSch.getConfig("sha-1")).newInstance();
                    byte[] bArr5 = new byte[4];
                    bArr3 = new byte[40];
                    for (int i3 = 0; i3 < 2; i3++) {
                        hash2.init();
                        bArr5[3] = (byte) i3;
                        hash2.update(bArr5, 0, 4);
                        hash2.update(bArr, 0, bArr.length);
                        System.arraycopy(hash2.digest(), 0, bArr3, i3 * 20, 20);
                    }
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bArr3;
    }

    public abstract void generate(int i);

    public abstract byte[] getBegin();

    public abstract byte[] getEnd();

    public String getFingerPrint() {
        if (this.hash == null) {
            this.hash = genHash();
        }
        byte[] publicKeyBlob = getPublicKeyBlob();
        if (publicKeyBlob == null) {
            return null;
        }
        return Util.getFingerPrint(this.hash, publicKeyBlob);
    }

    public abstract int getKeySize();

    public abstract int getKeyType();

    public abstract byte[] getKeyTypeName();

    public abstract byte[] getPrivateKey();

    public byte[] getPublicKeyBlob() {
        return this.publickeyblob;
    }

    public String getPublicKeyComment() {
        return this.publicKeyComment;
    }

    public abstract byte[] getSignature(byte[] bArr);

    public abstract Signature getVerifier();

    public boolean isEncrypted() {
        return this.encrypted;
    }

    public abstract boolean parse(byte[] bArr);

    public void setPassphrase(String str) {
        if (str == null || str.length() == 0) {
            setPassphrase((byte[]) null);
        } else {
            setPassphrase(Util.str2byte(str));
        }
    }

    public void setPublicKeyComment(String str) {
        this.publicKeyComment = str;
    }

    public int writeDATA(byte[] bArr, byte b, int i, byte[] bArr2) {
        bArr[i] = b;
        int iWriteLength = writeLength(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, iWriteLength, bArr2.length);
        return iWriteLength + bArr2.length;
    }

    public int writeINTEGER(byte[] bArr, int i, byte[] bArr2) {
        bArr[i] = 2;
        int iWriteLength = writeLength(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, iWriteLength, bArr2.length);
        return iWriteLength + bArr2.length;
    }

    public int writeLength(byte[] bArr, int i, int i2) {
        int iCountLength = countLength(i2) - 1;
        if (iCountLength == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        int i4 = i + 1;
        bArr[i] = (byte) (iCountLength | 128);
        int i5 = i4 + iCountLength;
        while (iCountLength > 0) {
            bArr[(i4 + iCountLength) - 1] = (byte) (i2 & 255);
            i2 >>>= 8;
            iCountLength--;
        }
        return i5;
    }

    public int writeOCTETSTRING(byte[] bArr, int i, byte[] bArr2) {
        bArr[i] = 4;
        int iWriteLength = writeLength(bArr, i + 1, bArr2.length);
        System.arraycopy(bArr2, 0, bArr, iWriteLength, bArr2.length);
        return iWriteLength + bArr2.length;
    }

    public void writePrivateKey(OutputStream outputStream) {
        writePrivateKey(outputStream, (byte[]) null);
    }

    public void writePublicKey(OutputStream outputStream, String str) {
        byte[] publicKeyBlob = getPublicKeyBlob();
        byte[] base64 = Util.toBase64(publicKeyBlob, 0, publicKeyBlob.length);
        try {
            outputStream.write(getKeyTypeName());
            outputStream.write(space);
            outputStream.write(base64, 0, base64.length);
            outputStream.write(space);
            outputStream.write(Util.str2byte(str));
            outputStream.write(cr);
        } catch (Exception unused) {
        }
    }

    public void writeSECSHPublicKey(OutputStream outputStream, String str) {
        byte[] publicKeyBlob = getPublicKeyBlob();
        int i = 0;
        byte[] base64 = Util.toBase64(publicKeyBlob, 0, publicKeyBlob.length);
        try {
            outputStream.write(Util.str2byte("---- BEGIN SSH2 PUBLIC KEY ----"));
            byte[] bArr = cr;
            outputStream.write(bArr);
            outputStream.write(Util.str2byte("Comment: \"" + str + "\""));
            outputStream.write(bArr);
            while (i < base64.length) {
                int length = 70;
                if (base64.length - i < 70) {
                    length = base64.length - i;
                }
                outputStream.write(base64, i, length);
                outputStream.write(cr);
                i += length;
            }
            outputStream.write(Util.str2byte("---- END SSH2 PUBLIC KEY ----"));
            outputStream.write(cr);
        } catch (Exception unused) {
        }
    }

    public int writeSEQUENCE(byte[] bArr, int i, int i2) {
        bArr[i] = 48;
        return writeLength(bArr, i + 1, i2);
    }

    public static KeyPair genKeyPair(JSch jSch, int i, int i2) {
        KeyPair keyPairECDSA;
        if (i == 1) {
            keyPairECDSA = new KeyPairDSA(jSch);
        } else if (i == 2) {
            keyPairECDSA = new KeyPairRSA(jSch);
        } else {
            keyPairECDSA = i == 3 ? new KeyPairECDSA(jSch) : null;
        }
        if (keyPairECDSA != null) {
            keyPairECDSA.generate(i2);
        }
        return keyPairECDSA;
    }

    public void writePrivateKey(OutputStream outputStream, byte[] bArr) {
        if (bArr == null) {
            bArr = this.passphrase;
        }
        byte[] privateKey = getPrivateKey();
        byte[][] bArr2 = new byte[1][];
        byte[] bArrEncrypt = encrypt(privateKey, bArr2, bArr);
        if (bArrEncrypt != privateKey) {
            Util.bzero(privateKey);
        }
        int i = 0;
        byte[] bArr3 = bArr2[0];
        byte[] base64 = Util.toBase64(bArrEncrypt, 0, bArrEncrypt.length);
        try {
            outputStream.write(getBegin());
            byte[] bArr4 = cr;
            outputStream.write(bArr4);
            if (bArr != null) {
                outputStream.write(header[0]);
                outputStream.write(bArr4);
                outputStream.write(header[1]);
                for (int i2 = 0; i2 < bArr3.length; i2++) {
                    outputStream.write(b2a((byte) ((bArr3[i2] >>> 4) & 15)));
                    outputStream.write(b2a((byte) (bArr3[i2] & 15)));
                }
                byte[] bArr5 = cr;
                outputStream.write(bArr5);
                outputStream.write(bArr5);
            }
            while (i < base64.length) {
                int i3 = i + 64;
                if (i3 >= base64.length) {
                    outputStream.write(base64, i, base64.length - i);
                    outputStream.write(cr);
                    break;
                } else {
                    outputStream.write(base64, i, 64);
                    outputStream.write(cr);
                    i = i3;
                }
            }
            outputStream.write(getEnd());
            outputStream.write(cr);
        } catch (Exception unused) {
        }
    }

    public void setPassphrase(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.passphrase = bArr;
    }

    public boolean decrypt(String str) {
        if (str != null && str.length() != 0) {
            return decrypt(Util.str2byte(str));
        }
        return !this.encrypted;
    }

    public void writePublicKey(String str, String str2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        writePublicKey(fileOutputStream, str2);
        fileOutputStream.close();
    }

    public boolean decrypt(byte[] bArr) {
        boolean z = this.encrypted;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        byte[] bArrDecrypt = decrypt(this.data, bArr2, this.iv);
        Util.bzero(bArr2);
        if (parse(bArrDecrypt)) {
            this.encrypted = false;
        }
        return !this.encrypted;
    }

    public void writeSECSHPublicKey(String str, String str2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        writeSECSHPublicKey(fileOutputStream, str2);
        fileOutputStream.close();
    }

    public static KeyPair load(JSch jSch, String str, String str2) throws JSchException {
        byte[] bArrFromFile;
        try {
            byte[] bArrFromFile2 = Util.fromFile(str);
            try {
                bArrFromFile = Util.fromFile(str2 == null ? Vo.f(str, ".pub") : str2);
            } catch (IOException e) {
                if (str2 != null) {
                    throw new JSchException(e.toString(), e);
                }
                bArrFromFile = null;
            }
            try {
                return load(jSch, bArrFromFile2, bArrFromFile);
            } finally {
                Util.bzero(bArrFromFile2);
            }
        } catch (IOException e2) {
            throw new JSchException(e2.toString(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v117 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v67, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:249:0x03d0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static com.jcraft.jsch.KeyPair load(com.jcraft.jsch.JSch r20, byte[] r21, byte[] r22) {
        /*
            Method dump skipped, instruction units count: 1793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.KeyPair.load(com.jcraft.jsch.JSch, byte[], byte[]):com.jcraft.jsch.KeyPair");
    }

    public void writePrivateKey(String str) throws IOException {
        writePrivateKey(str, (byte[]) null);
    }

    public void writePrivateKey(String str, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        writePrivateKey(fileOutputStream, bArr);
        fileOutputStream.close();
    }
}
