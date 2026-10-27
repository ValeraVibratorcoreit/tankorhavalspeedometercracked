package defpackage;

/* JADX INFO: renamed from: re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0538re {
    public static final C0129e5 d;
    public static final C0129e5 e;
    public static final C0129e5 f;
    public static final C0129e5 g;
    public static final C0129e5 h;
    public static final C0129e5 i;
    public final int a;
    public final C0129e5 b;
    public final C0129e5 c;

    static {
        C0129e5 c0129e5 = C0129e5.d;
        d = C0473pa.t(":");
        e = C0473pa.t(":status");
        f = C0473pa.t(":method");
        g = C0473pa.t(":path");
        h = C0473pa.t(":scheme");
        i = C0473pa.t(":authority");
    }

    public C0538re(C0129e5 c0129e5, C0129e5 c0129e6) {
        Tf.j("name", c0129e5);
        Tf.j("value", c0129e6);
        this.b = c0129e5;
        this.c = c0129e6;
        this.a = c0129e6.b() + c0129e5.b() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0538re)) {
            return false;
        }
        C0538re c0538re = (C0538re) obj;
        return Tf.b(this.b, c0538re.b) && Tf.b(this.c, c0538re.c);
    }

    public final int hashCode() {
        C0129e5 c0129e5 = this.b;
        int iHashCode = (c0129e5 != null ? c0129e5.hashCode() : 0) * 31;
        C0129e5 c0129e6 = this.c;
        return iHashCode + (c0129e6 != null ? c0129e6.hashCode() : 0);
    }

    public final String toString() {
        return this.b.i() + ": " + this.c.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0538re(String str, String str2) {
        this(C0473pa.t(str), C0473pa.t(str2));
        Tf.j("name", str);
        Tf.j("value", str2);
        C0129e5 c0129e5 = C0129e5.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0538re(C0129e5 c0129e5, String str) {
        this(c0129e5, C0473pa.t(str));
        Tf.j("name", c0129e5);
        Tf.j("value", str);
        C0129e5 c0129e6 = C0129e5.d;
    }
}
