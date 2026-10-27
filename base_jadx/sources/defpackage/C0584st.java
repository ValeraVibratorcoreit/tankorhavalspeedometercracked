package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: st, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0584st {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0584st c0584st = (C0584st) arrayList.get(i);
                if (this.e == c0584st.b) {
                    c(this.c, c0584st);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(Qg qg, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0686w7 c0686w7 = (C0686w7) ((C0655v7) arrayList.get(0)).T;
        qg.t();
        c0686w7.b(qg, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0655v7) arrayList.get(i2)).b(qg, false);
        }
        if (i == 0 && c0686w7.z0 > 0) {
            Br.e(c0686w7, qg, arrayList, 0);
        }
        if (i == 1 && c0686w7.A0 > 0) {
            Br.e(c0686w7, qg, arrayList, 1);
        }
        try {
            qg.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0655v7 c0655v7 = (C0655v7) arrayList.get(i3);
            C0429ns c0429ns = new C0429ns();
            new WeakReference(c0655v7);
            Qg.n(c0655v7.I);
            Qg.n(c0655v7.J);
            Qg.n(c0655v7.K);
            Qg.n(c0655v7.L);
            Qg.n(c0655v7.M);
            this.d.add(c0429ns);
        }
        if (i == 0) {
            iN = Qg.n(c0686w7.I);
            iN2 = Qg.n(c0686w7.K);
            qg.t();
        } else {
            iN = Qg.n(c0686w7.J);
            iN2 = Qg.n(c0686w7.L);
            qg.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, C0584st c0584st) {
        for (C0655v7 c0655v7 : this.a) {
            ArrayList arrayList = c0584st.a;
            if (!arrayList.contains(c0655v7)) {
                arrayList.add(c0655v7);
            }
            int i2 = c0584st.b;
            if (i == 0) {
                c0655v7.n0 = i2;
            } else {
                c0655v7.o0 = i2;
            }
        }
        this.e = c0584st.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.b);
        sb.append("] <");
        String string = sb.toString();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            string = string + " " + ((C0655v7) it.next()).h0;
        }
        return Vo.f(string, " >");
    }
}
