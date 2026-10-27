package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public class FdbusSerializer {
    private static final int EXPANSION_BLOCK_SIZE = 2000;
    private int mBufferPos = 0;
    private byte[] mBuffer = new byte[EXPANSION_BLOCK_SIZE];

    private void expandBuffer(int i) {
        int i2 = this.mBufferPos;
        int i3 = i2 + i;
        byte[] bArr = this.mBuffer;
        if (i3 <= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[i2 + i + EXPANSION_BLOCK_SIZE];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.mBuffer = bArr2;
    }

    private void writeRaw8(int i) {
        expandBuffer(1);
        byte[] bArr = this.mBuffer;
        int i2 = this.mBufferPos;
        this.mBufferPos = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    private void writeRawBytes(byte[] bArr, int i) {
        expandBuffer(i);
        System.arraycopy(bArr, 0, this.mBuffer, this.mBufferPos, i);
        this.mBufferPos += i;
    }

    private void writeRawLittleEndian16(int i) {
        expandBuffer(2);
        byte[] bArr = this.mBuffer;
        int i2 = this.mBufferPos;
        int i3 = i2 + 1;
        this.mBufferPos = i3;
        bArr[i2] = (byte) (i & 255);
        this.mBufferPos = i2 + 2;
        bArr[i3] = (byte) ((i >> 8) & 255);
    }

    private void writeRawLittleEndian32(int i) {
        expandBuffer(4);
        byte[] bArr = this.mBuffer;
        int i2 = this.mBufferPos;
        int i3 = i2 + 1;
        this.mBufferPos = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.mBufferPos = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.mBufferPos = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.mBufferPos = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    private void writeRawLittleEndian64(long j) {
        expandBuffer(8);
        byte[] bArr = this.mBuffer;
        int i = this.mBufferPos;
        int i2 = i + 1;
        this.mBufferPos = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.mBufferPos = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.mBufferPos = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.mBufferPos = i5;
        bArr[i4] = (byte) ((j >> 24) & 255);
        int i6 = i + 5;
        this.mBufferPos = i6;
        bArr[i5] = (byte) ((j >> 32) & 255);
        int i7 = i + 6;
        this.mBufferPos = i7;
        bArr[i6] = (byte) ((j >> 40) & 255);
        int i8 = i + 7;
        this.mBufferPos = i8;
        bArr[i7] = (byte) ((j >> 48) & 255);
        this.mBufferPos = i + 8;
        bArr[i8] = (byte) ((j >> 56) & 255);
    }

    private void writeString(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (Exception unused) {
            bytes = new byte[0];
        }
        writeRawLittleEndian16(bytes.length + 1);
        writeRawBytes(bytes);
        writeRaw8(0);
    }

    public byte[] export() {
        int i = this.mBufferPos;
        byte[] bArr = new byte[i];
        System.arraycopy(this.mBuffer, 0, bArr, 0, i);
        return bArr;
    }

    public byte[] getBuffer() {
        return this.mBuffer;
    }

    public int getPosition() {
        return this.mBufferPos;
    }

    public void in(byte[] bArr, int i) {
        writeRawLittleEndian32(i);
        writeRawBytes(bArr, i);
    }

    public void in16(int i) {
        writeRawLittleEndian16(i);
    }

    public void in32(int i) {
        writeRawLittleEndian32(i);
    }

    public void in64(long j) {
        writeRawLittleEndian64(j);
    }

    public void in8(int i) {
        writeRaw8(i);
    }

    public void inBool(boolean z) {
        writeRaw8(z ? 1 : 0);
    }

    public void inS(String str) {
        writeString(str);
    }

    public void in16(int[] iArr) {
        writeRawLittleEndian16(iArr.length);
        for (int i : iArr) {
            writeRawLittleEndian16(i);
        }
    }

    public void in32(int[] iArr) {
        writeRawLittleEndian16(iArr.length);
        for (int i : iArr) {
            writeRawLittleEndian32(i);
        }
    }

    public void in64(long[] jArr) {
        writeRawLittleEndian16(jArr.length);
        for (long j : jArr) {
            writeRawLittleEndian64(j);
        }
    }

    public void in8(int[] iArr) {
        writeRawLittleEndian16(iArr.length);
        for (int i : iArr) {
            writeRaw8(i);
        }
    }

    public void inBool(boolean[] zArr) {
        writeRawLittleEndian16(zArr.length);
        for (boolean z : zArr) {
            writeRaw8(z ? 1 : 0);
        }
    }

    public void inS(String[] strArr) {
        writeRawLittleEndian16(strArr.length);
        for (String str : strArr) {
            writeString(str);
        }
    }

    public void in(byte[] bArr) {
        in(bArr, bArr.length);
    }

    private void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, bArr.length);
    }

    public void in(byte[][] bArr) {
        writeRawLittleEndian16(bArr.length);
        for (byte[] bArr2 : bArr) {
            in(bArr2);
        }
    }

    public void in(FdbusParcelable fdbusParcelable) {
        fdbusParcelable.serialize(this);
    }

    public void in(FdbusParcelable[] fdbusParcelableArr) {
        writeRawLittleEndian16(fdbusParcelableArr.length);
        for (FdbusParcelable fdbusParcelable : fdbusParcelableArr) {
            fdbusParcelable.serialize(this);
        }
    }
}
