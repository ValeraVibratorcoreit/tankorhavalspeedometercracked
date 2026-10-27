package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public class FdbusDeserializer {
    private final byte[] mBuffer;
    private int mBufferPos = 0;
    private boolean mError = false;

    public FdbusDeserializer(byte[] bArr) {
        this.mBuffer = bArr;
    }

    private <T> T createParcelable(Class<T> cls) {
        try {
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    private double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    private float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    private int readRaw8() {
        int i = this.mBufferPos;
        int i2 = i + 1;
        byte[] bArr = this.mBuffer;
        if (i2 > bArr.length) {
            this.mError = true;
            return 0;
        }
        this.mBufferPos = i + 1;
        return bArr[i];
    }

    private void readRawBytes(byte[] bArr) {
        int i = this.mBufferPos;
        int length = bArr.length + i;
        byte[] bArr2 = this.mBuffer;
        if (length > bArr2.length) {
            this.mError = true;
        } else {
            System.arraycopy(bArr2, i, bArr, 0, bArr.length);
            this.mBufferPos += bArr.length;
        }
    }

    private int readRawLittleEndian16() {
        int i = this.mBufferPos;
        int i2 = i + 2;
        byte[] bArr = this.mBuffer;
        if (i2 > bArr.length) {
            this.mError = true;
            return 0;
        }
        int i3 = i + 1;
        this.mBufferPos = i3;
        byte b = bArr[i];
        this.mBufferPos = i + 2;
        return ((bArr[i3] & 255) << 8) | (b & 255);
    }

    private int readRawLittleEndian32() {
        int i = this.mBufferPos;
        int i2 = i + 4;
        byte[] bArr = this.mBuffer;
        if (i2 > bArr.length) {
            this.mError = true;
            return 0;
        }
        int i3 = i + 1;
        this.mBufferPos = i3;
        byte b = bArr[i];
        int i4 = i + 2;
        this.mBufferPos = i4;
        byte b2 = bArr[i3];
        int i5 = i + 3;
        this.mBufferPos = i5;
        byte b3 = bArr[i4];
        this.mBufferPos = i + 4;
        int i6 = (b2 & 255) << 8;
        return ((bArr[i5] & 255) << 24) | i6 | (b & 255) | ((b3 & 255) << 16);
    }

    private long readRawLittleEndian64() {
        int i = this.mBufferPos;
        int i2 = i + 8;
        byte[] bArr = this.mBuffer;
        if (i2 > bArr.length) {
            this.mError = true;
            return 0L;
        }
        int i3 = i + 1;
        this.mBufferPos = i3;
        byte b = bArr[i];
        int i4 = i + 2;
        this.mBufferPos = i4;
        byte b2 = bArr[i3];
        int i5 = i + 3;
        this.mBufferPos = i5;
        byte b3 = bArr[i4];
        int i6 = i + 4;
        this.mBufferPos = i6;
        byte b4 = bArr[i5];
        int i7 = i + 5;
        this.mBufferPos = i7;
        byte b5 = bArr[i6];
        int i8 = i + 6;
        this.mBufferPos = i8;
        byte b6 = bArr[i7];
        int i9 = i + 7;
        this.mBufferPos = i9;
        byte b7 = bArr[i8];
        this.mBufferPos = i + 8;
        return ((bArr[i9] & 255) << 56) | ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48);
    }

    private String readString() {
        int rawLittleEndian16 = readRawLittleEndian16();
        int i = this.mBufferPos;
        int i2 = i + rawLittleEndian16;
        byte[] bArr = this.mBuffer;
        if (i2 > bArr.length || rawLittleEndian16 <= 0 || bArr[(i + rawLittleEndian16) - 1] != 0) {
            String str = new String();
            this.mError = true;
            return str;
        }
        String str2 = new String(bArr, i, rawLittleEndian16 - 1);
        this.mBufferPos += rawLittleEndian16;
        return str2;
    }

    public int arrayLength() {
        return readRawLittleEndian16();
    }

    public byte[] getBuffer() {
        return this.mBuffer;
    }

    public int getPosition() {
        return this.mBufferPos;
    }

    public boolean isAtEnd() {
        return this.mBufferPos == this.mBuffer.length;
    }

    public <T> FdbusParcelable out(Class<T> cls) {
        FdbusParcelable fdbusParcelable = (FdbusParcelable) createParcelable(cls);
        if (fdbusParcelable != null) {
            fdbusParcelable.deserialize(this);
        }
        return fdbusParcelable;
    }

    public int out16() {
        return readRawLittleEndian16();
    }

    public int[] out16A() {
        int rawLittleEndian16 = readRawLittleEndian16();
        int[] iArr = new int[rawLittleEndian16];
        for (int i = 0; i < rawLittleEndian16; i++) {
            int rawLittleEndian17 = readRawLittleEndian16();
            if (this.mError) {
                break;
            }
            iArr[i] = rawLittleEndian17;
        }
        return iArr;
    }

    public int out32() {
        return readRawLittleEndian32();
    }

    public int[] out32A() {
        int rawLittleEndian16 = readRawLittleEndian16();
        int[] iArr = new int[rawLittleEndian16];
        for (int i = 0; i < rawLittleEndian16; i++) {
            int rawLittleEndian32 = readRawLittleEndian32();
            if (this.mError) {
                break;
            }
            iArr[i] = rawLittleEndian32;
        }
        return iArr;
    }

    public long out64() {
        return readRawLittleEndian64();
    }

    public long[] out64A() {
        int rawLittleEndian16 = readRawLittleEndian16();
        long[] jArr = new long[rawLittleEndian16];
        for (int i = 0; i < rawLittleEndian16; i++) {
            long rawLittleEndian64 = readRawLittleEndian64();
            if (this.mError) {
                break;
            }
            jArr[i] = rawLittleEndian64;
        }
        return jArr;
    }

    public int out8() {
        return readRaw8();
    }

    public int[] out8A() {
        int rawLittleEndian16 = readRawLittleEndian16();
        int[] iArr = new int[rawLittleEndian16];
        for (int i = 0; i < rawLittleEndian16; i++) {
            int raw8 = readRaw8();
            if (this.mError) {
                break;
            }
            iArr[i] = raw8;
        }
        return iArr;
    }

    public byte[] outBA() {
        byte[] bArr;
        if (this.mError) {
            return new byte[0];
        }
        try {
            bArr = new byte[readRawLittleEndian32()];
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return new byte[0];
        }
        readRawBytes(bArr);
        return bArr;
    }

    public byte[][] outBAA() {
        byte[][] bArr;
        if (this.mError) {
            return new byte[][]{new byte[0]};
        }
        int rawLittleEndian16 = readRawLittleEndian16();
        try {
            bArr = new byte[][]{new byte[rawLittleEndian16]};
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return new byte[][]{new byte[0]};
        }
        for (int i = 0; i < rawLittleEndian16; i++) {
            bArr[i] = outBA();
        }
        return bArr;
    }

    public boolean outBool() {
        return readRaw8() != 0;
    }

    public boolean[] outBoolA() {
        int rawLittleEndian16 = readRawLittleEndian16();
        boolean[] zArr = new boolean[rawLittleEndian16];
        for (int i = 0; i < rawLittleEndian16; i++) {
            boolean z = readRaw8() != 0;
            if (this.mError) {
                break;
            }
            zArr[i] = z;
        }
        return zArr;
    }

    public String outS() {
        return readString();
    }

    public String[] outSA() {
        int rawLittleEndian16 = readRawLittleEndian16();
        String[] strArr = new String[rawLittleEndian16];
        for (int i = 0; i < rawLittleEndian16; i++) {
            String string = readString();
            if (this.mError) {
                break;
            }
            strArr[i] = string;
        }
        return strArr;
    }

    public <T> T[] out(T[] tArr, Class<T> cls) {
        Object objCreateParcelable;
        for (int i = 0; i < tArr.length && (objCreateParcelable = createParcelable(cls)) != null; i++) {
            ((FdbusParcelable) objCreateParcelable).deserialize(this);
            tArr[i] = objCreateParcelable;
        }
        return tArr;
    }
}
