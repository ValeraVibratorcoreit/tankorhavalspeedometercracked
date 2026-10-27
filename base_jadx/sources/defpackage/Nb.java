package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Nb extends C0455on {
    public final HashMap e = new HashMap();

    @Override // defpackage.C0455on
    public final C0362ln a(Object obj) {
        return (C0362ln) this.e.get(obj);
    }

    @Override // defpackage.C0455on
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.e.remove(obj);
        return objB;
    }

    public final Object c(Object obj, Object obj2) {
        C0362ln c0362lnA = a(obj);
        if (c0362lnA != null) {
            return c0362lnA.b;
        }
        HashMap map = this.e;
        C0362ln c0362ln = new C0362ln(obj, obj2);
        this.d++;
        C0362ln c0362ln2 = this.b;
        if (c0362ln2 == null) {
            this.a = c0362ln;
            this.b = c0362ln;
        } else {
            c0362ln2.c = c0362ln;
            c0362ln.d = c0362ln2;
            this.b = c0362ln;
        }
        map.put(obj, c0362ln);
        return null;
    }
}
