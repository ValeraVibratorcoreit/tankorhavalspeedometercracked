package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0455on implements Iterable {
    public C0362ln a;
    public C0362ln b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public C0362ln a(Object obj) {
        C0362ln c0362ln = this.a;
        while (c0362ln != null && !c0362ln.a.equals(obj)) {
            c0362ln = c0362ln.c;
        }
        return c0362ln;
    }

    public Object b(Object obj) {
        C0362ln c0362lnA = a(obj);
        if (c0362lnA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0424nn) it.next()).a(c0362lnA);
            }
        }
        C0362ln c0362ln = c0362lnA.d;
        if (c0362ln != null) {
            c0362ln.c = c0362lnA.c;
        } else {
            this.a = c0362lnA.c;
        }
        C0362ln c0362ln2 = c0362lnA.c;
        if (c0362ln2 != null) {
            c0362ln2.d = c0362ln;
        } else {
            this.b = c0362ln;
        }
        c0362lnA.c = null;
        c0362lnA.d = null;
        return c0362lnA.b;
    }

    public final boolean equals(Object obj) {
        C0331kn c0331kn;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0455on)) {
            return false;
        }
        C0455on c0455on = (C0455on) obj;
        if (this.d != c0455on.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0455on.iterator();
        while (true) {
            c0331kn = (C0331kn) it;
            if (!c0331kn.hasNext()) {
                break;
            }
            C0331kn c0331kn2 = (C0331kn) it2;
            if (!c0331kn2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0331kn.next();
            Object next = c0331kn2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c0331kn.hasNext() || ((C0331kn) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C0331kn c0331kn = (C0331kn) it;
            if (!c0331kn.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0331kn.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0331kn c0331kn = new C0331kn(this.a, this.b, 0);
        this.c.put(c0331kn, Boolean.FALSE);
        return c0331kn;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0331kn c0331kn = (C0331kn) it;
            if (!c0331kn.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0331kn.next()).toString());
            if (c0331kn.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
