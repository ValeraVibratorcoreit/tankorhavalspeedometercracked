package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0761yk implements Serializable {
    public final Object a;
    public final Object b;

    public C0761yk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0761yk)) {
            return false;
        }
        C0761yk c0761yk = (C0761yk) obj;
        return Tf.b(this.a, c0761yk.a) && Tf.b(this.b, c0761yk.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
