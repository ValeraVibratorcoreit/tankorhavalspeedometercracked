package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Cn {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public Cn f;
    public Cn g;

    public Cn() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final Cn a() {
        Cn cn = this.f;
        if (cn == this) {
            cn = null;
        }
        Cn cn2 = this.g;
        Tf.f(cn2);
        cn2.f = this.f;
        Cn cn3 = this.f;
        Tf.f(cn3);
        cn3.g = this.g;
        this.f = null;
        this.g = null;
        return cn;
    }

    public final void b(Cn cn) {
        Tf.j("segment", cn);
        cn.g = this;
        cn.f = this.f;
        Cn cn2 = this.f;
        Tf.f(cn2);
        cn2.g = cn;
        this.f = cn;
    }

    public final Cn c() {
        this.d = true;
        return new Cn(this.a, this.b, this.c, true);
    }

    public final void d(Cn cn, int i) {
        Tf.j("sink", cn);
        if (!cn.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = cn.c;
        int i3 = i2 + i;
        byte[] bArr = cn.a;
        if (i3 > 8192) {
            if (cn.d) {
                throw new IllegalArgumentException();
            }
            int i4 = cn.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0158f3.P(bArr, 0, i4, bArr, i2);
            cn.c -= cn.b;
            cn.b = 0;
        }
        int i5 = cn.c;
        int i6 = this.b;
        AbstractC0158f3.P(this.a, i5, i6, bArr, i6 + i);
        cn.c += i;
        this.b += i;
    }

    public Cn(byte[] bArr, int i, int i2, boolean z) {
        Tf.j("data", bArr);
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
