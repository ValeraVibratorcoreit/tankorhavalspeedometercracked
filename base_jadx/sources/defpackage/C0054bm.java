package defpackage;

import android.util.SparseArray;

/* JADX INFO: renamed from: bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0054bm {
    public SparseArray a;
    public int b;

    public final C0023am a(int i) {
        SparseArray sparseArray = this.a;
        C0023am c0023am = (C0023am) sparseArray.get(i);
        if (c0023am != null) {
            return c0023am;
        }
        C0023am c0023am2 = new C0023am();
        sparseArray.put(i, c0023am2);
        return c0023am2;
    }
}
