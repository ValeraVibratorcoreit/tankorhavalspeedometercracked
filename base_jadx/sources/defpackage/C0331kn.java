package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0331kn extends AbstractC0424nn implements Iterator {
    public C0362ln a;
    public C0362ln b;
    public final /* synthetic */ int c;

    public C0331kn(C0362ln c0362ln, C0362ln c0362ln2, int i) {
        this.c = i;
        this.a = c0362ln2;
        this.b = c0362ln;
    }

    @Override // defpackage.AbstractC0424nn
    public final void a(C0362ln c0362ln) {
        C0362ln c0362lnC = null;
        if (this.a == c0362ln && c0362ln == this.b) {
            this.b = null;
            this.a = null;
        }
        C0362ln c0362ln2 = this.a;
        if (c0362ln2 == c0362ln) {
            this.a = b(c0362ln2);
        }
        C0362ln c0362ln3 = this.b;
        if (c0362ln3 == c0362ln) {
            C0362ln c0362ln4 = this.a;
            if (c0362ln3 != c0362ln4 && c0362ln4 != null) {
                c0362lnC = c(c0362ln3);
            }
            this.b = c0362lnC;
        }
    }

    public final C0362ln b(C0362ln c0362ln) {
        switch (this.c) {
            case 0:
                return c0362ln.d;
            default:
                return c0362ln.c;
        }
    }

    public final C0362ln c(C0362ln c0362ln) {
        switch (this.c) {
            case 0:
                return c0362ln.c;
            default:
                return c0362ln.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0362ln c0362ln = this.b;
        C0362ln c0362ln2 = this.a;
        this.b = (c0362ln == c0362ln2 || c0362ln2 == null) ? null : c(c0362ln);
        return c0362ln;
    }
}
