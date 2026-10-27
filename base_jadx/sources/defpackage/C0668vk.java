package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0668vk extends Yl {
    public RecyclerView a;
    public final So b = new So(this);
    public C0575sk c;
    public C0575sk d;

    public static int b(View view, AbstractC0658va abstractC0658va) {
        return ((abstractC0658va.c(view) / 2) + abstractC0658va.e(view)) - ((abstractC0658va.l() / 2) + abstractC0658va.k());
    }

    public static View c(Wl wl, AbstractC0658va abstractC0658va) {
        int iV = wl.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (abstractC0658va.l() / 2) + abstractC0658va.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = wl.u(i2);
            int iAbs = Math.abs(((abstractC0658va.c(viewU) / 2) + abstractC0658va.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final int[] a(Wl wl, View view) {
        int[] iArr = new int[2];
        if (wl.d()) {
            iArr[0] = b(view, d(wl));
        } else {
            iArr[0] = 0;
        }
        if (wl.e()) {
            iArr[1] = b(view, e(wl));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final AbstractC0658va d(Wl wl) {
        C0575sk c0575sk = this.d;
        if (c0575sk == null || ((Wl) c0575sk.b) != wl) {
            this.d = new C0575sk(wl, 0);
        }
        return this.d;
    }

    public final AbstractC0658va e(Wl wl) {
        C0575sk c0575sk = this.c;
        if (c0575sk == null || ((Wl) c0575sk.b) != wl) {
            this.c = new C0575sk(wl, 1);
        }
        return this.c;
    }

    public final void f() {
        Wl layoutManager;
        View viewC;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.e()) {
            viewC = c(layoutManager, e(layoutManager));
        } else {
            viewC = layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        }
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i = iArrA[0];
        if (i == 0 && iArrA[1] == 0) {
            return;
        }
        this.a.c0(i, iArrA[1], false);
    }
}
