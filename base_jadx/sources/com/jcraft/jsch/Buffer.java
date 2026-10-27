package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public class Buffer {
    byte[] buffer;
    int index;
    int s;
    final byte[] tmp;

    public Buffer(int i) {
        this.tmp = new byte[4];
        this.buffer = new byte[i];
        this.index = 0;
        this.s = 0;
    }

    public static Buffer fromBytes(byte[][] bArr) {
        int length = bArr.length * 4;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        Buffer buffer = new Buffer(length);
        for (byte[] bArr3 : bArr) {
            buffer.putString(bArr3);
        }
        return buffer;
    }

    public void checkFreeSize(int i) {
        int i2 = this.index;
        int i3 = i + i2 + 128;
        byte[] bArr = this.buffer;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (length >= i3) {
                i3 = length;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.buffer = bArr2;
        }
    }

    public int getByte() {
        byte[] bArr = this.buffer;
        int i = this.s;
        this.s = i + 1;
        return bArr[i] & 255;
    }

    public byte[][] getBytes(int i, String str) throws JSchException {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = getInt();
            if (getLength() < i3) {
                throw new JSchException(str);
            }
            byte[] bArr2 = new byte[i3];
            bArr[i2] = bArr2;
            getByte(bArr2);
        }
        return bArr;
    }

    public byte getCommand() {
        return this.buffer[5];
    }

    public int getInt() {
        return ((getShort() << 16) & (-65536)) | (getShort() & 65535);
    }

    public int getLength() {
        return this.index - this.s;
    }

    public long getLong() {
        return ((((long) getInt()) & 4294967295L) << 32) | (4294967295L & ((long) getInt()));
    }

    public byte[] getMPInt() {
        int i = getInt();
        if (i < 0 || i > 8192) {
            i = 8192;
        }
        byte[] bArr = new byte[i];
        getByte(bArr, 0, i);
        return bArr;
    }

    public byte[] getMPIntBits() {
        int i = (getInt() + 7) / 8;
        byte[] bArr = new byte[i];
        getByte(bArr, 0, i);
        if ((bArr[0] & 128) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, 0, bArr2, 1, i);
        return bArr2;
    }

    public int getOffSet() {
        return this.s;
    }

    public int getShort() {
        return ((getByte() << 8) & 65280) | (getByte() & 255);
    }

    public byte[] getString() {
        int i = getInt();
        if (i < 0 || i > 262144) {
            i = 262144;
        }
        byte[] bArr = new byte[i];
        getByte(bArr, 0, i);
        return bArr;
    }

    public long getUInt() {
        return (((((((long) getByte()) << 8) & 65280) | ((long) (getByte() & 255))) << 16) & (-65536)) | ((((((long) getByte()) << 8) & 65280) | ((long) (getByte() & 255))) & 65535);
    }

    public void putByte(byte b) {
        byte[] bArr = this.buffer;
        int i = this.index;
        this.index = i + 1;
        bArr[i] = b;
    }

    public void putInt(int i) {
        byte[] bArr = this.tmp;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        System.arraycopy(bArr, 0, this.buffer, this.index, 4);
        this.index += 4;
    }

    public void putLong(long j) {
        byte[] bArr = this.tmp;
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        System.arraycopy(bArr, 0, this.buffer, this.index, 4);
        byte[] bArr2 = this.tmp;
        bArr2[0] = (byte) (j >>> 24);
        bArr2[1] = (byte) (j >>> 16);
        bArr2[2] = (byte) (j >>> 8);
        bArr2[3] = (byte) j;
        System.arraycopy(bArr2, 0, this.buffer, this.index + 4, 4);
        this.index += 8;
    }

    public void putMPInt(byte[] bArr) {
        int length = bArr.length;
        if ((bArr[0] & 128) != 0) {
            putInt(length + 1);
            putByte((byte) 0);
        } else {
            putInt(length);
        }
        putByte(bArr);
    }

    public void putPad(int i) {
        while (i > 0) {
            byte[] bArr = this.buffer;
            int i2 = this.index;
            this.index = i2 + 1;
            bArr[i2] = 0;
            i--;
        }
    }

    public void putString(byte[] bArr) {
        putString(bArr, 0, bArr.length);
    }

    public void reset() {
        this.index = 0;
        this.s = 0;
    }

    public void rewind() {
        this.s = 0;
    }

    public void setOffSet(int i) {
        this.s = i;
    }

    public void shift() {
        int i = this.s;
        if (i == 0) {
            return;
        }
        byte[] bArr = this.buffer;
        System.arraycopy(bArr, i, bArr, 0, this.index - i);
        this.index -= this.s;
        this.s = 0;
    }

    public void skip(int i) {
        this.index += i;
    }

    public void getByte(byte[] bArr) {
        getByte(bArr, 0, bArr.length);
    }

    public void putByte(byte[] bArr) {
        putByte(bArr, 0, bArr.length);
    }

    public void putString(byte[] bArr, int i, int i2) {
        putInt(i2);
        putByte(bArr, i, i2);
    }

    public void getByte(byte[] bArr, int i, int i2) {
        System.arraycopy(this.buffer, this.s, bArr, i, i2);
        this.s += i2;
    }

    public void putByte(byte[] bArr, int i, int i2) {
        System.arraycopy(bArr, i, this.buffer, this.index, i2);
        this.index += i2;
    }

    public byte[] getString(int[] iArr, int[] iArr2) {
        int i = getInt();
        iArr[0] = getByte(i);
        iArr2[0] = i;
        return this.buffer;
    }

    public int getByte(int i) {
        int i2 = this.s;
        this.s = i + i2;
        return i2;
    }

    public Buffer(byte[] bArr) {
        this.tmp = new byte[4];
        this.buffer = bArr;
        this.index = 0;
        this.s = 0;
    }

    public Buffer() {
        this(20480);
    }
}
