package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0393mn extends AbstractC0424nn implements Iterator {
    public C0362ln a;
    public boolean b = true;
    public final /* synthetic */ C0455on c;

    public C0393mn(C0455on c0455on) {
        this.c = c0455on;
    }

    @Override // defpackage.AbstractC0424nn
    public final void a(C0362ln c0362ln) {
        C0362ln c0362ln2 = this.a;
        if (c0362ln == c0362ln2) {
            C0362ln c0362ln3 = c0362ln2.d;
            this.a = c0362ln3;
            this.b = c0362ln3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        C0362ln c0362ln = this.a;
        return (c0362ln == null || c0362ln.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            C0362ln c0362ln = this.a;
            this.a = c0362ln != null ? c0362ln.c : null;
        }
        return this.a;
    }
}
