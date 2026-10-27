package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z3 implements Cloneable {
    public int a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public Drawable o;
    public int p;
    public boolean t;
    public Resources.Theme u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean z;
    public float b = 1.0f;
    public C0317k9 c = C0317k9.d;
    public Uk d = Uk.c;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public InterfaceC0171fg l = Va.b;
    public boolean n = true;
    public C0544rk q = new C0544rk();
    public C0222h5 r = new C0222h5();
    public Class s = Object.class;
    public boolean y = true;

    public static boolean f(int i, int i2) {
        return (i & i2) != 0;
    }

    public Z3 a(Z3 z3) {
        if (this.v) {
            return clone().a(z3);
        }
        if (f(z3.a, 2)) {
            this.b = z3.b;
        }
        if (f(z3.a, 262144)) {
            this.w = z3.w;
        }
        if (f(z3.a, 1048576)) {
            this.z = z3.z;
        }
        if (f(z3.a, 4)) {
            this.c = z3.c;
        }
        if (f(z3.a, 8)) {
            this.d = z3.d;
        }
        if (f(z3.a, 16)) {
            this.e = z3.e;
            this.f = 0;
            this.a &= -33;
        }
        if (f(z3.a, 32)) {
            this.f = z3.f;
            this.e = null;
            this.a &= -17;
        }
        if (f(z3.a, 64)) {
            this.g = z3.g;
            this.h = 0;
            this.a &= -129;
        }
        if (f(z3.a, 128)) {
            this.h = z3.h;
            this.g = null;
            this.a &= -65;
        }
        if (f(z3.a, 256)) {
            this.i = z3.i;
        }
        if (f(z3.a, 512)) {
            this.k = z3.k;
            this.j = z3.j;
        }
        if (f(z3.a, 1024)) {
            this.l = z3.l;
        }
        if (f(z3.a, 4096)) {
            this.s = z3.s;
        }
        if (f(z3.a, 8192)) {
            this.o = z3.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (f(z3.a, 16384)) {
            this.p = z3.p;
            this.o = null;
            this.a &= -8193;
        }
        if (f(z3.a, 32768)) {
            this.u = z3.u;
        }
        if (f(z3.a, 65536)) {
            this.n = z3.n;
        }
        if (f(z3.a, 131072)) {
            this.m = z3.m;
        }
        if (f(z3.a, 2048)) {
            this.r.putAll(z3.r);
            this.y = z3.y;
        }
        if (f(z3.a, 524288)) {
            this.x = z3.x;
        }
        if (!this.n) {
            this.r.clear();
            int i = this.a;
            this.m = false;
            this.a = i & (-133121);
            this.y = true;
        }
        this.a |= z3.a;
        this.q.b.i(z3.q.b);
        k();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Z3 clone() {
        try {
            Z3 z3 = (Z3) super.clone();
            C0544rk c0544rk = new C0544rk();
            z3.q = c0544rk;
            c0544rk.b.i(this.q.b);
            C0222h5 c0222h5 = new C0222h5();
            z3.r = c0222h5;
            c0222h5.putAll(this.r);
            z3.t = false;
            z3.v = false;
            return z3;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final Z3 c(Class cls) {
        if (this.v) {
            return clone().c(cls);
        }
        this.s = cls;
        this.a |= 4096;
        k();
        return this;
    }

    public final Z3 d(C0317k9 c0317k9) {
        if (this.v) {
            return clone().d(c0317k9);
        }
        this.c = c0317k9;
        this.a |= 4;
        k();
        return this;
    }

    public final boolean e(Z3 z3) {
        return Float.compare(z3.b, this.b) == 0 && this.f == z3.f && Qr.b(this.e, z3.e) && this.h == z3.h && Qr.b(this.g, z3.g) && this.p == z3.p && Qr.b(this.o, z3.o) && this.i == z3.i && this.j == z3.j && this.k == z3.k && this.m == z3.m && this.n == z3.n && this.w == z3.w && this.x == z3.x && this.c.equals(z3.c) && this.d == z3.d && this.q.equals(z3.q) && this.r.equals(z3.r) && this.s.equals(z3.s) && Qr.b(this.l, z3.l) && Qr.b(this.u, z3.u);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Z3) {
            return e((Z3) obj);
        }
        return false;
    }

    public final Z3 g(L9 l9, AbstractC0683w4 abstractC0683w4) {
        if (this.v) {
            return clone().g(l9, abstractC0683w4);
        }
        l(L9.g, l9);
        return p(abstractC0683w4, false);
    }

    public final Z3 h(int i, int i2) {
        if (this.v) {
            return clone().h(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        k();
        return this;
    }

    public int hashCode() {
        float f = this.b;
        char[] cArr = Qr.a;
        return Qr.h(Qr.h(Qr.h(Qr.h(Qr.h(Qr.h(Qr.h(Qr.g(this.x ? 1 : 0, Qr.g(this.w ? 1 : 0, Qr.g(this.n ? 1 : 0, Qr.g(this.m ? 1 : 0, Qr.g(this.k, Qr.g(this.j, Qr.g(this.i ? 1 : 0, Qr.h(Qr.g(this.p, Qr.h(Qr.g(this.h, Qr.h(Qr.g(this.f, Qr.g(Float.floatToIntBits(f), 17)), this.e)), this.g)), this.o)))))))), this.c), this.d), this.q), this.r), this.s), this.l), this.u);
    }

    public final Z3 i() {
        Uk uk = Uk.d;
        if (this.v) {
            return clone().i();
        }
        this.d = uk;
        this.a |= 8;
        k();
        return this;
    }

    public final Z3 j(C0483pk c0483pk) {
        if (this.v) {
            return clone().j(c0483pk);
        }
        this.q.b.remove(c0483pk);
        k();
        return this;
    }

    public final void k() {
        if (this.t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final Z3 l(C0483pk c0483pk, Object obj) {
        if (this.v) {
            return clone().l(c0483pk, obj);
        }
        Ud.k(c0483pk);
        Ud.k(obj);
        this.q.b.put(c0483pk, obj);
        k();
        return this;
    }

    public final Z3 m(InterfaceC0171fg interfaceC0171fg) {
        if (this.v) {
            return clone().m(interfaceC0171fg);
        }
        this.l = interfaceC0171fg;
        this.a |= 1024;
        k();
        return this;
    }

    public final Z3 n() {
        if (this.v) {
            return clone().n();
        }
        this.i = false;
        this.a |= 256;
        k();
        return this;
    }

    public final Z3 o(Resources.Theme theme) {
        if (this.v) {
            return clone().o(theme);
        }
        this.u = theme;
        if (theme != null) {
            this.a |= 32768;
            return l(Pm.b, theme);
        }
        this.a &= -32769;
        return j(Pm.b);
    }

    public final Z3 p(InterfaceC0182fr interfaceC0182fr, boolean z) {
        if (this.v) {
            return clone().p(interfaceC0182fr, z);
        }
        R9 r9 = new R9(interfaceC0182fr, z);
        q(Bitmap.class, interfaceC0182fr, z);
        q(Drawable.class, r9, z);
        q(BitmapDrawable.class, r9, z);
        q(Id.class, new Kd(interfaceC0182fr), z);
        k();
        return this;
    }

    public final Z3 q(Class cls, InterfaceC0182fr interfaceC0182fr, boolean z) {
        if (this.v) {
            return clone().q(cls, interfaceC0182fr, z);
        }
        Ud.k(interfaceC0182fr);
        this.r.put(cls, interfaceC0182fr);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.y = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        k();
        return this;
    }

    public final Z3 r() {
        if (this.v) {
            return clone().r();
        }
        this.z = true;
        this.a |= 1048576;
        k();
        return this;
    }
}
