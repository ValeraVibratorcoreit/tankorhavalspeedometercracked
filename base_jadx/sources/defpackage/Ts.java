package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ts extends L7 {
    public Bd a;
    public int b = 0;

    public Ts() {
    }

    @Override // defpackage.L7
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            Bd bd = new Bd();
            bd.d = view;
            this.a = bd;
        }
        Bd bd2 = this.a;
        View view2 = (View) bd2.d;
        bd2.a = view2.getTop();
        bd2.b = view2.getLeft();
        this.a.b();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        Bd bd3 = this.a;
        if (bd3.c != i2) {
            bd3.c = i2;
            bd3.b();
        }
        this.b = 0;
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    public Ts(int i) {
    }
}
