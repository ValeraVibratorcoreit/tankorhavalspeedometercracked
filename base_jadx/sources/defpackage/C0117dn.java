package defpackage;

import java.io.Closeable;

/* JADX INFO: renamed from: dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117dn implements Closeable {
    public final T1 a;
    public final EnumC0268il b;
    public final String c;
    public final int d;
    public final C0446oe e;
    public final C0569se f;
    public final Jl g;
    public final C0117dn h;
    public final C0117dn i;
    public final C0117dn j;
    public final long k;
    public final long l;
    public final C0566sb m;

    public C0117dn(T1 t1, EnumC0268il enumC0268il, String str, int i, C0446oe c0446oe, C0569se c0569se, Jl jl, C0117dn c0117dn, C0117dn c0117dn2, C0117dn c0117dn3, long j, long j2, C0566sb c0566sb) {
        Tf.j("request", t1);
        Tf.j("protocol", enumC0268il);
        Tf.j("message", str);
        this.a = t1;
        this.b = enumC0268il;
        this.c = str;
        this.d = i;
        this.e = c0446oe;
        this.f = c0569se;
        this.g = jl;
        this.h = c0117dn;
        this.i = c0117dn2;
        this.j = c0117dn3;
        this.k = j;
        this.l = j2;
        this.m = c0566sb;
    }

    public static String n(C0117dn c0117dn, String str) {
        c0117dn.getClass();
        String strA = c0117dn.f.a(str);
        if (strA != null) {
            return strA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Jl jl = this.g;
        if (jl == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        jl.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + ((C0201gf) this.a.c) + '}';
    }

    public final boolean w() {
        int i = this.d;
        return 200 <= i && 299 >= i;
    }

    public final C0086cn x() {
        C0086cn c0086cn = new C0086cn();
        c0086cn.a = this.a;
        c0086cn.b = this.b;
        c0086cn.c = this.d;
        c0086cn.d = this.c;
        c0086cn.e = this.e;
        c0086cn.f = this.f.c();
        c0086cn.g = this.g;
        c0086cn.h = this.h;
        c0086cn.i = this.i;
        c0086cn.j = this.j;
        c0086cn.k = this.k;
        c0086cn.l = this.l;
        c0086cn.m = this.m;
        return c0086cn;
    }
}
