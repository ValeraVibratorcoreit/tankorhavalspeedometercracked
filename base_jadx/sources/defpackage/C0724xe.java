package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0724xe {
    public final Bl b;
    public int e;
    public int f;
    public int g = 4096;
    public final ArrayList a = new ArrayList();
    public C0538re[] c = new C0538re[8];
    public int d = 7;

    public C0724xe(Ve ve) {
        this.b = new Bl(ve);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.c.length;
            while (true) {
                length--;
                i2 = this.d;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0538re c0538re = this.c[length];
                Tf.f(c0538re);
                int i4 = c0538re.a;
                i -= i4;
                this.f -= i4;
                this.e--;
                i3++;
            }
            C0538re[] c0538reArr = this.c;
            System.arraycopy(c0538reArr, i2 + 1, c0538reArr, i2 + 1 + i3, this.e);
            this.d += i3;
        }
        return i3;
    }

    public final C0129e5 b(int i) throws IOException {
        if (i >= 0) {
            C0538re[] c0538reArr = AbstractC0786ze.a;
            if (i <= c0538reArr.length - 1) {
                return c0538reArr[i].b;
            }
        }
        int length = this.d + 1 + (i - AbstractC0786ze.a.length);
        if (length >= 0) {
            C0538re[] c0538reArr2 = this.c;
            if (length < c0538reArr2.length) {
                C0538re c0538re = c0538reArr2[length];
                Tf.f(c0538re);
                return c0538re.b;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0538re c0538re) {
        this.a.add(c0538re);
        int i = this.g;
        int i2 = c0538re.a;
        if (i2 > i) {
            C0538re[] c0538reArr = this.c;
            AbstractC0158f3.S(c0538reArr, 0, c0538reArr.length);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            return;
        }
        a((this.f + i2) - i);
        int i3 = this.e + 1;
        C0538re[] c0538reArr2 = this.c;
        if (i3 > c0538reArr2.length) {
            C0538re[] c0538reArr3 = new C0538re[c0538reArr2.length * 2];
            System.arraycopy(c0538reArr2, 0, c0538reArr3, c0538reArr2.length, c0538reArr2.length);
            this.d = this.c.length - 1;
            this.c = c0538reArr3;
        }
        int i4 = this.d;
        this.d = i4 - 1;
        this.c[i4] = c0538re;
        this.e++;
        this.f += i2;
    }

    public final C0129e5 d() {
        int i;
        Bl bl = this.b;
        byte b = bl.readByte();
        byte[] bArr = Rr.a;
        int i2 = b & 255;
        int i3 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i2, 127);
        if (!z) {
            return bl.g(jE);
        }
        L4 l4 = new L4();
        int[] iArr = Cif.a;
        Tf.j("source", bl);
        C0068c5 c0068c5 = Cif.c;
        C0068c5 c0068c6 = c0068c5;
        int i4 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = bl.readByte();
            byte[] bArr2 = Rr.a;
            i3 = (i3 << 8) | (b2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                int i5 = i4 - 8;
                C0068c5[] c0068c5Arr = (C0068c5[]) c0068c6.c;
                Tf.f(c0068c5Arr);
                c0068c6 = c0068c5Arr[(i3 >>> i5) & 255];
                Tf.f(c0068c6);
                if (((C0068c5[]) c0068c6.c) == null) {
                    l4.G(c0068c6.a);
                    i4 -= c0068c6.b;
                    c0068c6 = c0068c5;
                } else {
                    i4 = i5;
                }
            }
        }
        while (i4 > 0) {
            C0068c5[] c0068c5Arr2 = (C0068c5[]) c0068c6.c;
            Tf.f(c0068c5Arr2);
            C0068c5 c0068c7 = c0068c5Arr2[(i3 << (8 - i4)) & 255];
            Tf.f(c0068c7);
            if (((C0068c5[]) c0068c7.c) != null || (i = c0068c7.b) > i4) {
                break;
            }
            l4.G(c0068c7.a);
            i4 -= i;
            c0068c6 = c0068c5;
        }
        return l4.g(l4.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.b.readByte();
            byte[] bArr = Rr.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
