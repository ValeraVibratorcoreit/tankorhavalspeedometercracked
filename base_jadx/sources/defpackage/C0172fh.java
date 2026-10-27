package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0172fh {
    public final Nk a;
    public final List b;
    public final String c;

    public C0172fh(Class cls, Class cls2, Class cls3, List list, K2 k2) {
        this.a = k2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Im a(int i, int i2, Q0 q0, InterfaceC0132e8 interfaceC0132e8, C0544rk c0544rk) {
        Nk nk = this.a;
        Object objB = nk.b();
        Ud.l("Argument must not be null", objB);
        List list = (List) objB;
        try {
            List list2 = this.b;
            int size = list2.size();
            Im imA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    imA = ((C0502q8) list2.get(i3)).a(i, i2, q0, interfaceC0132e8, c0544rk);
                } catch (Xd e) {
                    list.add(e);
                }
                if (imA != null) {
                    break;
                }
            }
            if (imA != null) {
                nk.a(list);
                return imA;
            }
            throw new Xd(this.c, new ArrayList(list));
        } catch (Throwable th) {
            nk.a(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
