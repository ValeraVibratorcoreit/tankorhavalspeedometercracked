package defpackage;

/* JADX INFO: renamed from: cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0086cn {
    public T1 a;
    public EnumC0268il b;
    public String d;
    public C0446oe e;
    public Jl g;
    public C0117dn h;
    public C0117dn i;
    public C0117dn j;
    public long k;
    public long l;
    public C0566sb m;
    public int c = -1;
    public Ya f = new Ya(1);

    public static void b(C0117dn c0117dn, String str) {
        if (c0117dn != null) {
            if (c0117dn.g != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c0117dn.h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c0117dn.i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c0117dn.j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final C0117dn a() {
        int i = this.c;
        if (!(i >= 0)) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        T1 t1 = this.a;
        if (t1 == null) {
            throw new IllegalStateException("request == null".toString());
        }
        EnumC0268il enumC0268il = this.b;
        if (enumC0268il == null) {
            throw new IllegalStateException("protocol == null".toString());
        }
        String str = this.d;
        if (str != null) {
            return new C0117dn(t1, enumC0268il, str, i, this.e, this.f.b(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null".toString());
    }
}
