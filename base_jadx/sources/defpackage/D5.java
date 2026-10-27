package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class D5 {
    public static final D5 c;
    public final Set a;
    public final AbstractC0390mk b;

    static {
        ArrayList arrayList = new ArrayList();
        Set setSingleton = Ua.a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                setSingleton = new LinkedHashSet(Jh.s0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    setSingleton.add(it.next());
                }
            } else {
                setSingleton = Collections.singleton(arrayList.get(0));
                Tf.i("singleton(element)", setSingleton);
            }
        }
        c = new D5(setSingleton, null);
    }

    public D5(Set set, AbstractC0390mk abstractC0390mk) {
        Tf.j("pins", set);
        this.a = set;
        this.b = abstractC0390mk;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D5) {
            D5 d5 = (D5) obj;
            if (Tf.b(d5.a, this.a) && Tf.b(d5.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        AbstractC0390mk abstractC0390mk = this.b;
        return iHashCode + (abstractC0390mk != null ? abstractC0390mk.hashCode() : 0);
    }
}
