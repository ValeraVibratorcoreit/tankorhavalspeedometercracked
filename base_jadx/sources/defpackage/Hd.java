package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Hd implements Cloneable {
    public C0387mh a;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hd clone() {
        try {
            return (Hd) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof Hd) {
            return Qr.b(this.a, ((Hd) obj).a);
        }
        return false;
    }

    public final int c() {
        C0387mh c0387mh = this.a;
        if (c0387mh != null) {
            return c0387mh.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Hd) && b(obj);
    }

    public final int hashCode() {
        return c();
    }
}
