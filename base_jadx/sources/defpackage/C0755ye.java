package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0755ye {
    public boolean b;
    public int f;
    public int g;
    public final L4 i;
    public final boolean h = true;
    public int a = Integer.MAX_VALUE;
    public int c = 4096;
    public C0538re[] d = new C0538re[8];
    public int e = 7;

    public C0755ye(L4 l4) {
        this.i = l4;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0538re c0538re = this.d[length];
                Tf.f(c0538re);
                i -= c0538re.a;
                int i4 = this.g;
                C0538re c0538re2 = this.d[length];
                Tf.f(c0538re2);
                this.g = i4 - c0538re2.a;
                this.f--;
                i3++;
                length--;
            }
            C0538re[] c0538reArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(c0538reArr, i5, c0538reArr, i5 + i3, this.f);
            C0538re[] c0538reArr2 = this.d;
            int i6 = this.e + 1;
            Arrays.fill(c0538reArr2, i6, i6 + i3, (Object) null);
            this.e += i3;
        }
    }

    public final void b(C0538re c0538re) {
        int i = this.c;
        int i2 = c0538re.a;
        if (i2 > i) {
            C0538re[] c0538reArr = this.d;
            AbstractC0158f3.S(c0538reArr, 0, c0538reArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i2) - i);
        int i3 = this.f + 1;
        C0538re[] c0538reArr2 = this.d;
        if (i3 > c0538reArr2.length) {
            C0538re[] c0538reArr3 = new C0538re[c0538reArr2.length * 2];
            System.arraycopy(c0538reArr2, 0, c0538reArr3, c0538reArr2.length, c0538reArr2.length);
            this.e = this.d.length - 1;
            this.d = c0538reArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = c0538re;
        this.f++;
        this.g += i2;
    }

    public final void c(C0129e5 c0129e5) throws EOFException {
        Tf.j("data", c0129e5);
        boolean z = this.h;
        L4 l4 = this.i;
        if (z) {
            int[] iArr = Cif.a;
            int iB = c0129e5.b();
            long j = 0;
            for (int i = 0; i < iB; i++) {
                byte bE = c0129e5.e(i);
                byte[] bArr = Rr.a;
                j += (long) Cif.b[bE & 255];
            }
            if (((int) ((j + ((long) 7)) >> 3)) < c0129e5.b()) {
                L4 l5 = new L4();
                int[] iArr2 = Cif.a;
                int iB2 = c0129e5.b();
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < iB2; i3++) {
                    byte bE2 = c0129e5.e(i3);
                    byte[] bArr2 = Rr.a;
                    int i4 = bE2 & 255;
                    int i5 = Cif.a[i4];
                    byte b = Cif.b[i4];
                    j2 = (j2 << b) | ((long) i5);
                    i2 += b;
                    while (i2 >= 8) {
                        i2 -= 8;
                        l5.G((int) (j2 >> i2));
                    }
                }
                if (i2 > 0) {
                    l5.G((int) ((255 >>> i2) | (j2 << (8 - i2))));
                }
                C0129e5 c0129e5G = l5.g(l5.b);
                e(c0129e5G.b(), 127, 128);
                l4.D(c0129e5G);
                return;
            }
        }
        e(c0129e5.b(), 127, 0);
        l4.D(c0129e5);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.b) {
            int i = this.a;
            if (i < this.c) {
                e(i, 31, 32);
            }
            this.b = false;
            this.a = Integer.MAX_VALUE;
            e(this.c, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0538re c0538re = (C0538re) arrayList.get(i2);
            C0129e5 c0129e5H = c0538re.b.h();
            Integer num = (Integer) AbstractC0786ze.b.get(c0129e5H);
            C0129e5 c0129e5 = c0538re.c;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 <= length2 && 7 >= length2) {
                    C0538re[] c0538reArr = AbstractC0786ze.a;
                    if (Tf.b(c0538reArr[iIntValue].c, c0129e5)) {
                        length = length2;
                    } else if (Tf.b(c0538reArr[length2].c, c0129e5)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = length2;
                    length2 = -1;
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.d.length;
                for (int i3 = this.e + 1; i3 < length3; i3++) {
                    C0538re c0538re2 = this.d[i3];
                    Tf.f(c0538re2);
                    if (Tf.b(c0538re2.b, c0129e5H)) {
                        C0538re c0538re3 = this.d[i3];
                        Tf.f(c0538re3);
                        if (Tf.b(c0538re3.c, c0129e5)) {
                            length2 = AbstractC0786ze.a.length + (i3 - this.e);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.e) + AbstractC0786ze.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.i.G(64);
                c(c0129e5H);
                c(c0129e5);
                b(c0538re);
            } else {
                C0129e5 c0129e6 = C0538re.d;
                c0129e5H.getClass();
                Tf.j("prefix", c0129e6);
                if (c0129e5H.g(c0129e6, c0129e6.b()) && (!Tf.b(C0538re.i, c0129e5H))) {
                    e(length, 15, 0);
                    c(c0129e5);
                } else {
                    e(length, 63, 64);
                    c(c0129e5);
                    b(c0538re);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        L4 l4 = this.i;
        if (i < i2) {
            l4.G(i | i3);
            return;
        }
        l4.G(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            l4.G(128 | (i4 & 127));
            i4 >>>= 7;
        }
        l4.G(i4);
    }
}
