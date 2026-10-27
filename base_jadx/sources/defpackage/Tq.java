package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Tq implements Li {
    public MenuC0604ti a;
    public C0759yi b;
    public final /* synthetic */ Toolbar c;

    public Tq(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.Li
    public final void b(MenuC0604ti menuC0604ti, boolean z) {
    }

    @Override // defpackage.Li
    public final boolean c() {
        return false;
    }

    @Override // defpackage.Li
    public final boolean d(C0759yi c0759yi) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0254i6) {
            ((Ai) ((InterfaceC0254i6) callback)).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        c0759yi.C = false;
        c0759yi.n.p(false);
        toolbar.w();
        return true;
    }

    @Override // defpackage.Li
    public final boolean g(C0759yi c0759yi) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0759yi.getActionView();
        toolbar.i = actionView;
        this.b = c0759yi;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Uq uqH = Toolbar.h();
            uqH.a = (toolbar.n & 112) | 8388611;
            uqH.b = 2;
            toolbar.i.setLayoutParams(uqH);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Uq) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0759yi.C = true;
        c0759yi.n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0254i6) {
            ((Ai) ((InterfaceC0254i6) callback)).a.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.Li
    public final void h() {
        if (this.b != null) {
            MenuC0604ti menuC0604ti = this.a;
            if (menuC0604ti != null) {
                int size = menuC0604ti.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            d(this.b);
        }
    }

    @Override // defpackage.Li
    public final void j(Context context, MenuC0604ti menuC0604ti) {
        C0759yi c0759yi;
        MenuC0604ti menuC0604ti2 = this.a;
        if (menuC0604ti2 != null && (c0759yi = this.b) != null) {
            menuC0604ti2.d(c0759yi);
        }
        this.a = menuC0604ti;
    }

    @Override // defpackage.Li
    public final boolean k(Np np) {
        return false;
    }
}
