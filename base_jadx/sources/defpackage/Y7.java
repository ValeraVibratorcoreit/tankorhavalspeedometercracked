package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Y7 implements InterfaceC0171fg {
    public final InterfaceC0171fg b;
    public final InterfaceC0171fg c;

    public Y7(InterfaceC0171fg interfaceC0171fg, InterfaceC0171fg interfaceC0171fg2) {
        this.b = interfaceC0171fg;
        this.c = interfaceC0171fg2;
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (!(obj instanceof Y7)) {
            return false;
        }
        Y7 y7 = (Y7) obj;
        return this.b.equals(y7.b) && this.c.equals(y7.c);
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
