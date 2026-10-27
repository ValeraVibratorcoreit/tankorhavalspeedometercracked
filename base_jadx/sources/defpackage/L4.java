package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class L4 implements P4, O4, Cloneable, ByteChannel {
    public Cn a;
    public long b;

    public final String A(long j, Charset charset) throws EOFException {
        Tf.j("charset", charset);
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Cn cn = this.a;
        Tf.f(cn);
        int i = cn.b;
        if (((long) i) + j > cn.c) {
            return new String(z(j), charset);
        }
        int i2 = (int) j;
        String str = new String(cn.a, i, i2, charset);
        int i3 = cn.b + i2;
        cn.b = i3;
        this.b -= j;
        if (i3 == cn.c) {
            this.a = cn.a();
            Dn.a(cn);
        }
        return str;
    }

    public final C0129e5 B(int i) {
        if (i == 0) {
            return C0129e5.d;
        }
        Td.d(this.b, 0L, i);
        Cn cn = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Tf.f(cn);
            int i5 = cn.c;
            int i6 = cn.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            cn = cn.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Cn cn2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            Tf.f(cn2);
            bArr[i7] = cn2.a;
            i2 += cn2.c - cn2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = cn2.b;
            cn2.d = true;
            i7++;
            cn2 = cn2.f;
        }
        return new En(bArr, iArr);
    }

    public final Cn C(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Cn cn = this.a;
        if (cn == null) {
            Cn cnB = Dn.b();
            this.a = cnB;
            cnB.g = cnB;
            cnB.f = cnB;
            return cnB;
        }
        Cn cn2 = cn.g;
        Tf.f(cn2);
        if (cn2.c + i <= 8192 && cn2.e) {
            return cn2;
        }
        Cn cnB2 = Dn.b();
        cn2.b(cnB2);
        return cnB2;
    }

    public final void D(C0129e5 c0129e5) {
        Tf.j("byteString", c0129e5);
        c0129e5.j(this, c0129e5.b());
    }

    public final void E(byte[] bArr, int i, int i2) {
        Tf.j("source", bArr);
        long j = i2;
        Td.d(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Cn cnC = C(1);
            int iMin = Math.min(i3 - i, 8192 - cnC.c);
            int i4 = i + iMin;
            AbstractC0158f3.P(bArr, cnC.c, i, cnC.a, i4);
            cnC.c += iMin;
            i = i4;
        }
        this.b += j;
    }

    public final void F(Xo xo) {
        Tf.j("source", xo);
        while (xo.f(this, 8192) != -1) {
        }
    }

    public final void G(int i) {
        Cn cnC = C(1);
        int i2 = cnC.c;
        cnC.c = i2 + 1;
        cnC.a[i2] = (byte) i;
        this.b++;
    }

    public final void H(long j) {
        if (j == 0) {
            G(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Cn cnC = C(i);
        int i2 = cnC.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            cnC.a[i3] = M4.a[(int) (15 & j)];
            j >>>= 4;
        }
        cnC.c += i;
        this.b += (long) i;
    }

    public final void I(int i) {
        Cn cnC = C(4);
        int i2 = cnC.c;
        byte[] bArr = cnC.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        cnC.c = i2 + 4;
        this.b += 4;
    }

    public final void J(int i) {
        Cn cnC = C(2);
        int i2 = cnC.c;
        byte[] bArr = cnC.a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        cnC.c = i2 + 2;
        this.b += 2;
    }

    public final void K(String str) {
        Tf.j("string", str);
        L(str, 0, str.length());
    }

    public final void L(String str, int i, int i2) {
        Tf.j("string", str);
        if (i < 0) {
            throw new IllegalArgumentException(Vo.e(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                Cn cnC = C(1);
                int i3 = cnC.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = cnC.a;
                bArr[i + i3] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = cnC.c;
                int i6 = (i3 + i4) - i5;
                cnC.c = i5 + i6;
                this.b += (long) i6;
                i = i4;
            } else {
                if (cCharAt < 2048) {
                    Cn cnC2 = C(2);
                    int i7 = cnC2.c;
                    byte[] bArr2 = cnC2.a;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    cnC2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    Cn cnC3 = C(3);
                    int i8 = cnC3.c;
                    byte[] bArr3 = cnC3.a;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    cnC3.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        G(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Cn cnC4 = C(4);
                        int i11 = cnC4.c;
                        byte[] bArr4 = cnC4.a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        cnC4.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void M(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            G(i);
            return;
        }
        if (i < 2048) {
            Cn cnC = C(2);
            int i3 = cnC.c;
            byte[] bArr = cnC.a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            cnC.c = i3 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && 57343 >= i) {
            G(63);
            return;
        }
        if (i < 65536) {
            Cn cnC2 = C(3);
            int i4 = cnC2.c;
            byte[] bArr2 = cnC2.a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            cnC2.c = i4 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            Cn cnC3 = C(4);
            int i5 = cnC3.c;
            byte[] bArr3 = cnC3.a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            cnC3.c = i5 + 4;
            this.b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = Tf.a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.P4
    public final void a(long j) throws EOFException {
        while (j > 0) {
            Cn cn = this.a;
            if (cn == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, cn.c - cn.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = cn.b + iMin;
            cn.b = i;
            if (i == cn.c) {
                this.a = cn.a();
                Dn.a(cn);
            }
        }
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return Jq.d;
    }

    @Override // defpackage.O4
    public final O4 c(byte[] bArr) {
        E(bArr, 0, bArr.length);
        return this;
    }

    public final Object clone() {
        L4 l4 = new L4();
        if (this.b != 0) {
            Cn cn = this.a;
            Tf.f(cn);
            Cn cnC = cn.c();
            l4.a = cnC;
            cnC.g = cnC;
            cnC.f = cnC;
            for (Cn cn2 = cn.f; cn2 != cn; cn2 = cn2.f) {
                Cn cn3 = cnC.g;
                Tf.f(cn3);
                Tf.f(cn2);
                cn3.b(cn2.c());
            }
            l4.b = this.b;
        }
        return l4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.Mo
    public final void close() {
    }

    @Override // defpackage.Mo
    public final void d(L4 l4, long j) {
        Cn cnB;
        Tf.j("source", l4);
        if (l4 == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        Td.d(l4.b, 0L, j);
        while (j > 0) {
            Cn cn = l4.a;
            Tf.f(cn);
            int i = cn.c;
            Cn cn2 = l4.a;
            Tf.f(cn2);
            long j2 = i - cn2.b;
            int i2 = 0;
            if (j < j2) {
                Cn cn3 = this.a;
                Cn cn4 = cn3 != null ? cn3.g : null;
                if (cn4 != null && cn4.e) {
                    if ((((long) cn4.c) + j) - ((long) (cn4.d ? 0 : cn4.b)) <= 8192) {
                        Cn cn5 = l4.a;
                        Tf.f(cn5);
                        cn5.d(cn4, (int) j);
                        l4.b -= j;
                        this.b += j;
                        return;
                    }
                }
                Cn cn6 = l4.a;
                Tf.f(cn6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > cn6.c - cn6.b) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    cnB = cn6.c();
                } else {
                    cnB = Dn.b();
                    int i4 = cn6.b;
                    AbstractC0158f3.P(cn6.a, 0, i4, cnB.a, i4 + i3);
                }
                cnB.c = cnB.b + i3;
                cn6.b += i3;
                Cn cn7 = cn6.g;
                Tf.f(cn7);
                cn7.b(cnB);
                l4.a = cnB;
            }
            Cn cn8 = l4.a;
            Tf.f(cn8);
            long j3 = cn8.c - cn8.b;
            l4.a = cn8.a();
            Cn cn9 = this.a;
            if (cn9 == null) {
                this.a = cn8;
                cn8.g = cn8;
                cn8.f = cn8;
            } else {
                Cn cn10 = cn9.g;
                Tf.f(cn10);
                cn10.b(cn8);
                Cn cn11 = cn8.g;
                if (cn11 == cn8) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                Tf.f(cn11);
                if (cn11.e) {
                    int i5 = cn8.c - cn8.b;
                    Cn cn12 = cn8.g;
                    Tf.f(cn12);
                    int i6 = 8192 - cn12.c;
                    Cn cn13 = cn8.g;
                    Tf.f(cn13);
                    if (!cn13.d) {
                        Cn cn14 = cn8.g;
                        Tf.f(cn14);
                        i2 = cn14.b;
                    }
                    if (i5 <= i6 + i2) {
                        Cn cn15 = cn8.g;
                        Tf.f(cn15);
                        cn8.d(cn15, i5);
                        cn8.a();
                        Dn.a(cn8);
                    }
                }
            }
            l4.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    @Override // defpackage.O4
    public final /* bridge */ /* synthetic */ O4 e(long j) {
        H(j);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L4) {
                long j = this.b;
                L4 l4 = (L4) obj;
                if (j == l4.b) {
                    if (j != 0) {
                        Cn cn = this.a;
                        Tf.f(cn);
                        Cn cn2 = l4.a;
                        Tf.f(cn2);
                        int i = cn.b;
                        int i2 = cn2.b;
                        long j2 = 0;
                        while (j2 < this.b) {
                            long jMin = Math.min(cn.c - i, cn2.c - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = cn.a[i];
                                int i4 = i2 + 1;
                                if (b == cn2.a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == cn.c) {
                                Cn cn3 = cn.f;
                                Tf.f(cn3);
                                i = cn3.b;
                                cn = cn3;
                            }
                            if (i2 == cn2.c) {
                                cn2 = cn2.f;
                                Tf.f(cn2);
                                i2 = cn2.b;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) {
        Tf.j("sink", l4);
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        l4.d(this, j);
        return j;
    }

    @Override // defpackage.O4, defpackage.Mo, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.P4
    public final C0129e5 g(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C0129e5(z(j));
        }
        C0129e5 c0129e5B = B((int) j);
        a(j);
        return c0129e5B;
    }

    @Override // defpackage.P4
    public final String h(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jX = x(b, 0L, j2);
        if (jX != -1) {
            return M4.a(this, jX);
        }
        if (j2 < this.b && w(j2 - 1) == ((byte) 13) && w(j2) == b) {
            return M4.a(this, j2);
        }
        L4 l4 = new L4();
        n(l4, 0L, Math.min(32, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + l4.g(l4.b).c() + (char) 8230);
    }

    public final int hashCode() {
        Cn cn = this.a;
        if (cn == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = cn.c;
            for (int i3 = cn.b; i3 < i2; i3++) {
                i = (i * 31) + cn.a[i3];
            }
            cn = cn.f;
            Tf.f(cn);
        } while (cn != this.a);
        return i;
    }

    @Override // defpackage.O4
    public final /* bridge */ /* synthetic */ O4 i(int i) {
        J(i);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.O4
    public final /* bridge */ /* synthetic */ O4 j(int i) {
        I(i);
        return this;
    }

    @Override // defpackage.P4
    public final String k() {
        return h(Long.MAX_VALUE);
    }

    @Override // defpackage.P4
    public final void l(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.O4
    public final /* bridge */ /* synthetic */ O4 m(String str) {
        K(str);
        return this;
    }

    public final void n(L4 l4, long j, long j2) {
        Tf.j("out", l4);
        Td.d(this.b, j, j2);
        if (j2 == 0) {
            return;
        }
        l4.b += j2;
        Cn cn = this.a;
        while (true) {
            Tf.f(cn);
            long j3 = cn.c - cn.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            cn = cn.f;
        }
        while (j2 > 0) {
            Tf.f(cn);
            Cn cnC = cn.c();
            int i = cnC.b + ((int) j);
            cnC.b = i;
            cnC.c = Math.min(i + ((int) j2), cnC.c);
            Cn cn2 = l4.a;
            if (cn2 == null) {
                cnC.g = cnC;
                cnC.f = cnC;
                l4.a = cnC;
            } else {
                Cn cn3 = cn2.g;
                Tf.f(cn3);
                cn3.b(cnC);
            }
            j2 -= (long) (cnC.c - cnC.b);
            cn = cn.f;
            j = 0;
        }
    }

    @Override // defpackage.P4
    public final L4 o() {
        return this;
    }

    @Override // defpackage.P4
    public final boolean p() {
        return this.b == 0;
    }

    @Override // defpackage.O4
    public final /* bridge */ /* synthetic */ O4 q(int i) {
        G(i);
        return this;
    }

    @Override // defpackage.O4
    public final /* bridge */ /* synthetic */ O4 r(C0129e5 c0129e5) {
        D(c0129e5);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        Tf.j("sink", byteBuffer);
        Cn cn = this.a;
        if (cn == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), cn.c - cn.b);
        byteBuffer.put(cn.a, cn.b, iMin);
        int i = cn.b + iMin;
        cn.b = i;
        this.b -= (long) iMin;
        if (i == cn.c) {
            this.a = cn.a();
            Dn.a(cn);
        }
        return iMin;
    }

    @Override // defpackage.P4
    public final byte readByte() {
        if (this.b == 0) {
            throw new EOFException();
        }
        Cn cn = this.a;
        Tf.f(cn);
        int i = cn.b;
        int i2 = cn.c;
        int i3 = i + 1;
        byte b = cn.a[i];
        this.b--;
        if (i3 == i2) {
            this.a = cn.a();
            Dn.a(cn);
        } else {
            cn.b = i3;
        }
        return b;
    }

    @Override // defpackage.P4
    public final int readInt() throws EOFException {
        if (this.b < 4) {
            throw new EOFException();
        }
        Cn cn = this.a;
        Tf.f(cn);
        int i = cn.b;
        int i2 = cn.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = cn.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.b -= 4;
        if (i5 == i2) {
            this.a = cn.a();
            Dn.a(cn);
        } else {
            cn.b = i5;
        }
        return i6;
    }

    @Override // defpackage.P4
    public final short readShort() throws EOFException {
        if (this.b < 2) {
            throw new EOFException();
        }
        Cn cn = this.a;
        Tf.f(cn);
        int i = cn.b;
        int i2 = cn.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = cn.a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = cn.a();
            Dn.a(cn);
        } else {
            cn.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.P4
    public final long s() throws EOFException {
        int i;
        if (this.b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            Cn cn = this.a;
            Tf.f(cn);
            int i3 = cn.b;
            int i4 = cn.c;
            while (i3 < i4) {
                byte b = cn.a[i3];
                byte b2 = (byte) 48;
                if (b < b2 || b > ((byte) 57)) {
                    byte b3 = (byte) 97;
                    if ((b < b3 || b > ((byte) 102)) && (b < (b3 = (byte) 65) || b > ((byte) 70))) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        char[] cArr = Tf.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = (b - b3) + 10;
                } else {
                    i = b - b2;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    L4 l4 = new L4();
                    l4.H(j);
                    l4.G(b);
                    throw new NumberFormatException("Number too large: ".concat(l4.A(l4.b, L5.a)));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.a = cn.a();
                Dn.a(cn);
            } else {
                cn.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.a != null);
        this.b -= (long) i2;
        return j;
    }

    @Override // defpackage.P4
    public final String t(Charset charset) {
        return A(this.b, charset);
    }

    public final String toString() {
        long j = this.b;
        if (j <= Integer.MAX_VALUE) {
            return B((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    @Override // defpackage.P4
    public final int u(C0514qk c0514qk) throws EOFException {
        Tf.j("options", c0514qk);
        int iB = M4.b(this, c0514qk, false);
        if (iB == -1) {
            return -1;
        }
        a(c0514qk.a[iB].b());
        return iB;
    }

    @Override // defpackage.P4
    public final InputStream v() {
        return new K4(this, 0);
    }

    public final byte w(long j) {
        Td.d(this.b, j, 1L);
        Cn cn = this.a;
        if (cn == null) {
            Tf.f(null);
            throw null;
        }
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                cn = cn.g;
                Tf.f(cn);
                j2 -= (long) (cn.c - cn.b);
            }
            return cn.a[(int) ((((long) cn.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = cn.c;
            int i2 = cn.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return cn.a[(int) ((((long) i2) + j) - j3)];
            }
            cn = cn.f;
            Tf.f(cn);
            j3 = j4;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        Tf.j("source", byteBuffer);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            Cn cnC = C(1);
            int iMin = Math.min(i, 8192 - cnC.c);
            byteBuffer.get(cnC.a, cnC.c, iMin);
            i -= iMin;
            cnC.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    public final long x(byte b, long j, long j2) {
        Cn cn;
        long j3 = 0;
        if (!(0 <= j && j2 >= j)) {
            throw new IllegalArgumentException(("size=" + this.b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (cn = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                cn = cn.g;
                Tf.f(cn);
                j4 -= (long) (cn.c - cn.b);
            }
            while (j4 < j2) {
                int iMin = (int) Math.min(cn.c, (((long) cn.b) + j2) - j4);
                for (int i = (int) ((((long) cn.b) + j) - j4); i < iMin; i++) {
                    if (cn.a[i] == b) {
                        return ((long) (i - cn.b)) + j4;
                    }
                }
                j4 += (long) (cn.c - cn.b);
                cn = cn.f;
                Tf.f(cn);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (cn.c - cn.b)) + j3;
            if (j5 > j) {
                break;
            }
            cn = cn.f;
            Tf.f(cn);
            j3 = j5;
        }
        while (j3 < j2) {
            int iMin2 = (int) Math.min(cn.c, (((long) cn.b) + j2) - j3);
            for (int i2 = (int) ((((long) cn.b) + j) - j3); i2 < iMin2; i2++) {
                if (cn.a[i2] == b) {
                    return ((long) (i2 - cn.b)) + j3;
                }
            }
            j3 += (long) (cn.c - cn.b);
            cn = cn.f;
            Tf.f(cn);
            j = j3;
        }
        return -1L;
    }

    public final int y(byte[] bArr, int i, int i2) {
        Tf.j("sink", bArr);
        Td.d(bArr.length, i, i2);
        Cn cn = this.a;
        if (cn == null) {
            return -1;
        }
        int iMin = Math.min(i2, cn.c - cn.b);
        int i3 = cn.b;
        AbstractC0158f3.P(cn.a, i, i3, bArr, i3 + iMin);
        int i4 = cn.b + iMin;
        cn.b = i4;
        this.b -= (long) iMin;
        if (i4 != cn.c) {
            return iMin;
        }
        this.a = cn.a();
        Dn.a(cn);
        return iMin;
    }

    public final byte[] z(long j) throws EOFException {
        int i = 0;
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i2 = (int) j;
        byte[] bArr = new byte[i2];
        while (i < i2) {
            int iY = y(bArr, i, i2 - i);
            if (iY == -1) {
                throw new EOFException();
            }
            i += iY;
        }
        return bArr;
    }
}
