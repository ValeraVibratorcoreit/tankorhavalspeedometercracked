package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0721xb {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public C0721xb(int i, int i2, byte[] bArr) {
        this(i, i2, bArr, -1L);
    }

    public static C0721xb a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Bb.C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C0721xb(4, 1, byteBufferWrap.array());
    }

    public static C0721xb b(C0783zb c0783zb, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Bb.C[5]]);
        byteBufferWrap.order(byteOrder);
        C0783zb c0783zb2 = new C0783zb[]{c0783zb}[0];
        byteBufferWrap.putInt((int) c0783zb2.a);
        byteBufferWrap.putInt((int) c0783zb2.b);
        return new C0721xb(5, 1, byteBufferWrap.array());
    }

    public static C0721xb c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[Bb.C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C0721xb(3, 1, byteBufferWrap.array());
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof C0783zb[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0783zb[] c0783zbArr = (C0783zb[]) objG;
        if (c0783zbArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0783zb c0783zb = c0783zbArr[0];
        return c0783zb.a / c0783zb.b;
    }

    public final int e(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof C0783zb[])) {
            return null;
        }
        C0783zb[] c0783zbArr = (C0783zb[]) objG;
        while (i < c0783zbArr.length) {
            sb.append(c0783zbArr[i].a);
            sb.append('/');
            sb.append(c0783zbArr[i].b);
            i++;
            if (i != c0783zbArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.io.Serializable, zb[]] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.io.Serializable, zb[]] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        C0690wb c0690wb;
        InputStream inputStream;
        byte b;
        int length = 0;
        byte[] bArr = this.d;
        InputStream inputStream2 = null;
        try {
            try {
                c0690wb = new C0690wb(bArr);
                try {
                    c0690wb.b = byteOrder;
                    int i = this.a;
                    int i2 = this.b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                String str = new String(bArr, Bb.L);
                                try {
                                    c0690wb.close();
                                    break;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                            }
                            return str2;
                        case 2:
                        case 7:
                            if (i2 >= Bb.D.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = Bb.D;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            try {
                                while (length < i2) {
                                    byte b2 = bArr[length];
                                    if (b2 == 0) {
                                        String string = sb.toString();
                                        c0690wb.close();
                                        return string;
                                    }
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                c0690wb.close();
                                break;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            String string2 = sb.toString();
                            return string2;
                        case 3:
                            ?? r15 = new int[i2];
                            while (length < i2) {
                                r15[length] = c0690wb.readUnsignedShort();
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                            }
                            return r15;
                        case 4:
                            ?? r16 = new long[i2];
                            while (length < i2) {
                                r16[length] = ((long) c0690wb.readInt()) & 4294967295L;
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e5) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                            }
                            return r16;
                        case 5:
                            ?? r17 = new C0783zb[i2];
                            while (length < i2) {
                                r17[length] = new C0783zb(((long) c0690wb.readInt()) & 4294967295L, ((long) c0690wb.readInt()) & 4294967295L);
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                            return r17;
                        case 8:
                            ?? r18 = new int[i2];
                            while (length < i2) {
                                r18[length] = c0690wb.readShort();
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e7) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                            }
                            return r18;
                        case 9:
                            ?? r19 = new int[i2];
                            while (length < i2) {
                                r19[length] = c0690wb.readInt();
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            }
                            return r19;
                        case 10:
                            ?? r110 = new C0783zb[i2];
                            while (length < i2) {
                                r110[length] = new C0783zb(c0690wb.readInt(), c0690wb.readInt());
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e9) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                            }
                            return r110;
                        case 11:
                            ?? r111 = new double[i2];
                            while (length < i2) {
                                r111[length] = c0690wb.readFloat();
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return r111;
                        case 12:
                            ?? r112 = new double[i2];
                            while (length < i2) {
                                r112[length] = c0690wb.readDouble();
                                length++;
                            }
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return r112;
                        default:
                            try {
                                c0690wb.close();
                                break;
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (c0690wb != null) {
                        try {
                            c0690wb.close();
                        } catch (IOException e14) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                    }
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            c0690wb = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + Bb.B[this.a] + ", data length:" + this.d.length + ")";
    }

    public C0721xb(int i, int i2, byte[] bArr, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }
}
