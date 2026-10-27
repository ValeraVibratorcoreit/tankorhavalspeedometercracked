package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0662ve extends C0655v7 {
    public C0655v7[] q0 = new C0655v7[4];
    public int r0 = 0;

    public final void R(int i, C0584st c0584st, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            C0655v7 c0655v7 = this.q0[i2];
            ArrayList arrayList2 = c0584st.a;
            if (!arrayList2.contains(c0655v7)) {
                arrayList2.add(c0655v7);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            F4.z(this.q0[i3], i, arrayList, c0584st);
        }
    }

    public void S() {
    }
}
