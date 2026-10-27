package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Pf extends Nf {
    public static final Pf d = new Pf(1, 0, 1);

    @Override // defpackage.Nf
    public final boolean equals(Object obj) {
        if (obj instanceof Pf) {
            if (!isEmpty() || !((Pf) obj).isEmpty()) {
                Pf pf = (Pf) obj;
                if (this.a == pf.a) {
                    if (this.b == pf.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.Nf
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.Nf
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.Nf
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
