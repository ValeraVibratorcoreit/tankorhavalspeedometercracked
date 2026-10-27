package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Lj implements InterfaceC0171fg {
    public final Object b;

    public Lj(Object obj) {
        Ud.l("Argument must not be null", obj);
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(InterfaceC0171fg.a));
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (obj instanceof Lj) {
            return this.b.equals(((Lj) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
