package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Nl {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ Nl(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(G0 g0) {
        int i = g0.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.l.W(g0.b, g0.d);
            return;
        }
        if (i == 2) {
            recyclerView.l.Z(g0.b, g0.d);
        } else if (i == 4) {
            recyclerView.l.a0(g0.b, g0.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.l.Y(g0.b, g0.d);
        }
    }

    public AbstractC0361lm b(int i) {
        RecyclerView recyclerView = this.a;
        int iA = recyclerView.e.A();
        AbstractC0361lm abstractC0361lm = null;
        for (int i2 = 0; i2 < iA; i2++) {
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(recyclerView.e.z(i2));
            if (abstractC0361lmI != null && !abstractC0361lmI.i() && abstractC0361lmI.c == i) {
                if (!recyclerView.e.E(abstractC0361lmI.a)) {
                    abstractC0361lm = abstractC0361lmI;
                    break;
                }
                abstractC0361lm = abstractC0361lmI;
            }
        }
        if (abstractC0361lm == null || recyclerView.e.E(abstractC0361lm.a)) {
            return null;
        }
        return abstractC0361lm;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iA = recyclerView.e.A();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iA; i6++) {
            View viewZ = recyclerView.e.z(i6);
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(viewZ);
            if (abstractC0361lmI != null && !abstractC0361lmI.p() && (i4 = abstractC0361lmI.c) >= i && i4 < i5) {
                abstractC0361lmI.a(2);
                abstractC0361lmI.a(1024);
                ((Xl) viewZ.getLayoutParams()).c = true;
            }
        }
        C0085cm c0085cm = recyclerView.b;
        ArrayList arrayList = c0085cm.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList.get(size);
            if (abstractC0361lm != null && (i3 = abstractC0361lm.c) >= i && i3 < i5) {
                abstractC0361lm.a(2);
                c0085cm.e(size);
            }
        }
        recyclerView.g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iA = recyclerView.e.A();
        for (int i3 = 0; i3 < iA; i3++) {
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(recyclerView.e.z(i3));
            if (abstractC0361lmI != null && !abstractC0361lmI.p() && abstractC0361lmI.c >= i) {
                abstractC0361lmI.m(i2, false);
                recyclerView.c0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.b.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList.get(i4);
            if (abstractC0361lm != null && abstractC0361lm.c >= i) {
                abstractC0361lm.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iA = recyclerView.e.A();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iA; i11++) {
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(recyclerView.e.z(i11));
            if (abstractC0361lmI != null && (i9 = abstractC0361lmI.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    abstractC0361lmI.m(i2 - i, false);
                } else {
                    abstractC0361lmI.m(i5, false);
                }
                recyclerView.c0.f = true;
            }
        }
        C0085cm c0085cm = recyclerView.b;
        c0085cm.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = c0085cm.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList.get(i12);
            if (abstractC0361lm != null && (i8 = abstractC0361lm.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0361lm.m(i2 - i, false);
                } else {
                    abstractC0361lm.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public void f(AbstractC0361lm abstractC0361lm, Ej ej, Ej ej2) {
        boolean zH;
        RecyclerView recyclerView = this.a;
        recyclerView.getClass();
        abstractC0361lm.o(false);
        E8 e8 = (E8) recyclerView.H;
        if (ej != null) {
            e8.getClass();
            int i = ej.a;
            int i2 = ej2.a;
            if (i == i2 && ej.b == ej2.b) {
                e8.m(abstractC0361lm);
                abstractC0361lm.a.setAlpha(0.0f);
                e8.i.add(abstractC0361lm);
                zH = true;
            } else {
                zH = e8.h(abstractC0361lm, i, ej.b, i2, ej2.b);
            }
        } else {
            e8.m(abstractC0361lm);
            abstractC0361lm.a.setAlpha(0.0f);
            e8.i.add(abstractC0361lm);
            zH = true;
        }
        if (zH) {
            recyclerView.T();
        }
    }

    public void g(AbstractC0361lm abstractC0361lm, Ej ej, Ej ej2) {
        boolean zH;
        RecyclerView recyclerView = this.a;
        recyclerView.b.j(abstractC0361lm);
        recyclerView.f(abstractC0361lm);
        abstractC0361lm.o(false);
        E8 e8 = (E8) recyclerView.H;
        e8.getClass();
        int i = ej.a;
        int i2 = ej.b;
        View view = abstractC0361lm.a;
        int left = ej2 == null ? view.getLeft() : ej2.a;
        int top = ej2 == null ? view.getTop() : ej2.b;
        if (abstractC0361lm.i() || (i == left && i2 == top)) {
            e8.m(abstractC0361lm);
            e8.h.add(abstractC0361lm);
            zH = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zH = e8.h(abstractC0361lm, i, i2, left, top);
        }
        if (zH) {
            recyclerView.T();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
