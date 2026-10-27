package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class En extends C0129e5 {
    public final transient byte[][] e;
    public final transient int[] f;

    public En(byte[][] bArr, int[] iArr) {
        super(C0129e5.d.c);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.C0129e5
    public final String a() {
        throw null;
    }

    @Override // defpackage.C0129e5
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.C0129e5
    public final String c() {
        return new C0129e5(k()).c();
    }

    @Override // defpackage.C0129e5
    public final byte[] d() {
        return k();
    }

    @Override // defpackage.C0129e5
    public final byte e(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        Td.d(iArr[length], i, 1L);
        int iC = Td.C(this, i);
        return bArr[iC][(i - (iC == 0 ? 0 : iArr[iC - 1])) + iArr[bArr.length + iC]];
    }

    @Override // defpackage.C0129e5
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0129e5) {
            C0129e5 c0129e5 = (C0129e5) obj;
            if (c0129e5.b() == b() && g(c0129e5, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.C0129e5
    public final boolean f(int i, int i2, byte[] bArr, int i3) {
        Tf.j("other", bArr);
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iC = Td.C(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = iC == 0 ? 0 : iArr[iC - 1];
            int i6 = iArr[iC] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iC];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!Td.a(bArr2[iC], (i - i5) + i7, i2, bArr, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iC++;
        }
        return true;
    }

    @Override // defpackage.C0129e5
    public final boolean g(C0129e5 c0129e5, int i) {
        Tf.j("other", c0129e5);
        if (b() - i < 0) {
            return false;
        }
        int iC = Td.C(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i4 = iC == 0 ? 0 : iArr[iC - 1];
            int i5 = iArr[iC] - i4;
            byte[][] bArr = this.e;
            int i6 = iArr[bArr.length + iC];
            int iMin = Math.min(i, i5 + i4) - i2;
            if (!c0129e5.f(i3, (i2 - i4) + i6, bArr[iC], iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iC++;
        }
        return true;
    }

    @Override // defpackage.C0129e5
    public final C0129e5 h() {
        return new C0129e5(k()).h();
    }

    @Override // defpackage.C0129e5
    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    @Override // defpackage.C0129e5
    public final void j(L4 l4, int i) {
        Tf.j("buffer", l4);
        int iC = Td.C(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iC == 0 ? 0 : iArr[iC - 1];
            int i4 = iArr[iC] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iC];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            Cn cn = new Cn(bArr[iC], i6, i6 + iMin, true);
            Cn cn2 = l4.a;
            if (cn2 == null) {
                cn.g = cn;
                cn.f = cn;
                l4.a = cn;
            } else {
                Cn cn3 = cn2.g;
                Tf.f(cn3);
                cn3.b(cn);
            }
            i2 += iMin;
            iC++;
        }
        l4.b += (long) b();
    }

    public final byte[] k() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC0158f3.P(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.C0129e5
    public final String toString() {
        return new C0129e5(k()).toString();
    }
}
