package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class Ri {
    public final SparseArray a;
    public Fr b;

    public Ri(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(Fr fr, int i, int i2) {
        int iA = fr.a(i);
        SparseArray sparseArray = this.a;
        Ri ri = sparseArray == null ? null : (Ri) sparseArray.get(iA);
        if (ri == null) {
            ri = new Ri(1);
            sparseArray.put(fr.a(i), ri);
        }
        if (i2 > i) {
            ri.a(fr, i + 1, i2);
        } else {
            ri.b = fr;
        }
    }
}
