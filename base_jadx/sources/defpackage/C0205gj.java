package defpackage;

/* JADX INFO: renamed from: gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205gj {
    public Class a;
    public Class b;
    public Class c;

    public C0205gj(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0205gj.class != obj.getClass()) {
            return false;
        }
        C0205gj c0205gj = (C0205gj) obj;
        return this.a.equals(c0205gj.a) && this.b.equals(c0205gj.b) && Qr.b(this.c, c0205gj.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Class cls = this.c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
