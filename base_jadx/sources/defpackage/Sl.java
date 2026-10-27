package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class Sl {
    public Nl a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(AbstractC0361lm abstractC0361lm) {
        RecyclerView recyclerView;
        int i = abstractC0361lm.j;
        if (abstractC0361lm.g() || (i & 4) != 0 || (recyclerView = abstractC0361lm.r) == null) {
            return;
        }
        recyclerView.F(abstractC0361lm);
    }

    public abstract boolean a(AbstractC0361lm abstractC0361lm, AbstractC0361lm abstractC0361lm2, Ej ej, Ej ej2);

    public void c(AbstractC0361lm abstractC0361lm) {
        d(abstractC0361lm);
    }

    public final void d(AbstractC0361lm abstractC0361lm) {
        Nl nl = this.a;
        if (nl != null) {
            boolean z = true;
            abstractC0361lm.o(true);
            if (abstractC0361lm.h != null && abstractC0361lm.i == null) {
                abstractC0361lm.h = null;
            }
            abstractC0361lm.i = null;
            if ((abstractC0361lm.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = nl.a;
            recyclerView.d0();
            K2 k2 = recyclerView.e;
            Nl nl2 = (Nl) k2.b;
            RecyclerView recyclerView2 = nl2.a;
            View view = abstractC0361lm.a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                k2.O(view);
            } else {
                O5 o5 = (O5) k2.c;
                if (o5.d(iIndexOfChild)) {
                    o5.g(iIndexOfChild);
                    k2.O(view);
                    nl2.h(iIndexOfChild);
                } else {
                    z = false;
                }
            }
            if (z) {
                AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
                C0085cm c0085cm = recyclerView.b;
                c0085cm.j(abstractC0361lmI);
                c0085cm.g(abstractC0361lmI);
            }
            recyclerView.e0(!z);
            if (z || !abstractC0361lm.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void e(AbstractC0361lm abstractC0361lm);

    public abstract void f();

    public abstract boolean g();
}
