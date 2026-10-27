package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: renamed from: lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0350lb implements InterfaceC0171fg {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final InterfaceC0171fg g;
    public final Map h;
    public final C0544rk i;
    public int j;

    public C0350lb(Object obj, InterfaceC0171fg interfaceC0171fg, int i, int i2, C0222h5 c0222h5, Class cls, Class cls2, C0544rk c0544rk) {
        Ud.l("Argument must not be null", obj);
        this.b = obj;
        Ud.l("Signature must not be null", interfaceC0171fg);
        this.g = interfaceC0171fg;
        this.c = i;
        this.d = i2;
        Ud.l("Argument must not be null", c0222h5);
        this.h = c0222h5;
        Ud.l("Resource class must not be null", cls);
        this.e = cls;
        Ud.l("Transcode class must not be null", cls2);
        this.f = cls2;
        Ud.l("Argument must not be null", c0544rk);
        this.i = c0544rk;
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0350lb)) {
            return false;
        }
        C0350lb c0350lb = (C0350lb) obj;
        return this.b.equals(c0350lb.b) && this.g.equals(c0350lb.g) && this.d == c0350lb.d && this.c == c0350lb.c && this.h.equals(c0350lb.h) && this.e.equals(c0350lb.e) && this.f.equals(c0350lb.f) && this.i.equals(c0350lb.i);
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
