package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Zj implements InterfaceC0107dd, Ad, Serializable, InterfaceC0785zd {
    public transient Zj a;
    public final Object b;
    public final Class c = C0021ak.class;
    public final String d = "updateEnabledCallbacks";
    public final String e = "updateEnabledCallbacks()V";
    public final boolean f = false;
    public final int g = 0;
    public final int h = 0;
    public final /* synthetic */ int i;

    public Zj(Object obj, int i) {
        this.i = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0107dd
    public final Object a() {
        switch (this.i) {
            case 0:
                ((C0021ak) this.b).d();
                break;
            default:
                ((C0021ak) this.b).d();
                break;
        }
        return C0473pa.m;
    }

    @Override // defpackage.Ad
    public final int b() {
        return this.g;
    }

    public final X5 d() {
        Class cls = this.c;
        if (cls == null) {
            return null;
        }
        if (!this.f) {
            return AbstractC0485pm.a(cls);
        }
        AbstractC0485pm.a.getClass();
        return new C0606tk(cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Zj) {
            Zj zj = (Zj) obj;
            return this.d.equals(zj.d) && this.e.equals(zj.e) && this.h == zj.h && this.g == zj.g && Tf.b(this.b, zj.b) && Tf.b(d(), zj.d());
        }
        if (!(obj instanceof Zj)) {
            return false;
        }
        Zj zj2 = this.a;
        if (zj2 == null) {
            AbstractC0485pm.a.getClass();
            this.a = this;
            zj2 = this;
        }
        return obj.equals(zj2);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (d() == null ? 0 : d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        Zj zj = this.a;
        if (zj == null) {
            AbstractC0485pm.a.getClass();
            this.a = this;
            zj = this;
        }
        if (zj != this) {
            return zj.toString();
        }
        String str = this.d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : Vo.g("function ", str, " (Kotlin reflection is not available)");
    }
}
