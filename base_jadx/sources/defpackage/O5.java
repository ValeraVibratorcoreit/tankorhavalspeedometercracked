package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class O5 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public O5(P4 p4) {
        this.a = 1;
        Tf.j("source", p4);
        this.c = p4;
        this.b = 262144;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        O5 o5 = (O5) this.c;
        if (o5 != null) {
            o5.a(i - 64);
        }
    }

    public int b(int i) {
        O5 o5 = (O5) this.c;
        if (o5 == null) {
            return i >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + o5.b(i - 64);
    }

    public void c() {
        if (((O5) this.c) == null) {
            this.c = new O5();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        c();
        return ((O5) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((O5) this.c).e(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            i(i);
        } else {
            a(i);
        }
        if (z2 || ((O5) this.c) != null) {
            c();
            ((O5) this.c).e(0, z2);
        }
    }

    public C0569se f() {
        Ya ya = new Ya(1);
        while (true) {
            String strH = ((P4) this.c).h(this.b);
            this.b -= (long) strH.length();
            if (strH.length() == 0) {
                return ya.b();
            }
            int iI0 = Mp.I0(strH, ':', 1, false, 4);
            if (iI0 != -1) {
                String strSubstring = strH.substring(0, iI0);
                Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
                String strSubstring2 = strH.substring(iI0 + 1);
                Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring2);
                ya.a(strSubstring, strSubstring2);
            } else if (strH.charAt(0) == ':') {
                String strSubstring3 = strH.substring(1);
                Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring3);
                ya.a("", strSubstring3);
            } else {
                ya.a("", strH);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((O5) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        O5 o5 = (O5) this.c;
        if (o5 != null) {
            if (o5.d(0)) {
                i(63);
            }
            ((O5) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        O5 o5 = (O5) this.c;
        if (o5 != null) {
            o5.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((O5) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((O5) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((O5) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public O5() {
        this.a = 0;
        this.b = 0L;
    }
}
