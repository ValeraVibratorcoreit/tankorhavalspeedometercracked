package defpackage;

/* JADX INFO: renamed from: tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606tk implements X5 {
    public final Class a;

    public C0606tk(Class cls) {
        Tf.j("jClass", cls);
        this.a = cls;
    }

    @Override // defpackage.X5
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0606tk) {
            if (Tf.b(this.a, ((C0606tk) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
