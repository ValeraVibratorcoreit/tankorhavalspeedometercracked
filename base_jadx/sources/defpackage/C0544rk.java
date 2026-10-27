package defpackage;

import java.security.MessageDigest;

/* JADX INFO: renamed from: rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0544rk implements InterfaceC0171fg {
    public final C0222h5 b = new C0222h5();

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C0222h5 c0222h5 = this.b;
            if (i >= c0222h5.c) {
                return;
            }
            C0483pk c0483pk = (C0483pk) c0222h5.h(i);
            Object objL = this.b.l(i);
            InterfaceC0452ok interfaceC0452ok = c0483pk.b;
            if (c0483pk.d == null) {
                c0483pk.d = c0483pk.c.getBytes(InterfaceC0171fg.a);
            }
            interfaceC0452ok.e(c0483pk.d, objL, messageDigest);
            i++;
        }
    }

    public final Object c(C0483pk c0483pk) {
        C0222h5 c0222h5 = this.b;
        return c0222h5.containsKey(c0483pk) ? c0222h5.getOrDefault(c0483pk, null) : c0483pk.a;
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (obj instanceof C0544rk) {
            return this.b.equals(((C0544rk) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
