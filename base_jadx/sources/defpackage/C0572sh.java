package defpackage;

/* JADX INFO: renamed from: sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0572sh implements Mk {
    public final C0603th a;
    public int b;
    public Class c;

    public C0572sh(C0603th c0603th) {
        this.a = c0603th;
    }

    @Override // defpackage.Mk
    public final void a() {
        this.a.a(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0572sh)) {
            return false;
        }
        C0572sh c0572sh = (C0572sh) obj;
        return this.b == c0572sh.b && this.c == c0572sh.c;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
