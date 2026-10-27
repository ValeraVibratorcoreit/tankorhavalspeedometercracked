package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0611tp extends Di implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final MenuC0604ti c;
    public final C0512qi d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final Ji i;
    public final ViewTreeObserverOnGlobalLayoutListenerC0310k2 j;
    public final ViewOnAttachStateChangeListenerC0715x5 k;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public Ki o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public int t = 0;
    public boolean u;

    public ViewOnKeyListenerC0611tp(int i, int i2, MenuC0604ti menuC0604ti, Context context, View view, boolean z) {
        int i3 = 3;
        this.j = new ViewTreeObserverOnGlobalLayoutListenerC0310k2(this, i3);
        this.k = new ViewOnAttachStateChangeListenerC0715x5(this, i3);
        this.b = context;
        this.c = menuC0604ti;
        this.e = z;
        this.d = new C0512qi(menuC0604ti, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new Ji(context, null, i, i2);
        menuC0604ti.b(this, context);
    }

    @Override // defpackage.Co
    public final boolean a() {
        return !this.q && this.i.z.isShowing();
    }

    @Override // defpackage.Li
    public final void b(MenuC0604ti menuC0604ti, boolean z) {
        if (menuC0604ti != this.c) {
            return;
        }
        dismiss();
        Ki ki = this.o;
        if (ki != null) {
            ki.b(menuC0604ti, z);
        }
    }

    @Override // defpackage.Li
    public final boolean c() {
        return false;
    }

    @Override // defpackage.Co
    public final void dismiss() {
        if (a()) {
            this.i.dismiss();
        }
    }

    @Override // defpackage.Co
    public final void e() {
        View view;
        if (a()) {
            return;
        }
        if (this.q || (view = this.m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.n = view;
        Ji ji = this.i;
        ji.z.setOnDismissListener(this);
        ji.p = this;
        ji.y = true;
        ji.z.setFocusable(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        ji.o = view2;
        ji.l = this.t;
        boolean z2 = this.r;
        Context context = this.b;
        C0512qi c0512qi = this.d;
        if (!z2) {
            this.s = Di.m(c0512qi, context, this.f);
            this.r = true;
        }
        ji.p(this.s);
        ji.z.setInputMethodMode(2);
        Rect rect = this.a;
        ji.x = rect != null ? new Rect(rect) : null;
        ji.e();
        C0073ca c0073ca = ji.c;
        c0073ca.setOnKeyListener(this);
        if (this.u) {
            MenuC0604ti menuC0604ti = this.c;
            if (menuC0604ti.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0073ca, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0604ti.m);
                }
                frameLayout.setEnabled(false);
                c0073ca.addHeaderView(frameLayout, null, false);
            }
        }
        ji.m(c0512qi);
        ji.e();
    }

    @Override // defpackage.Li
    public final void f(Ki ki) {
        this.o = ki;
    }

    @Override // defpackage.Li
    public final void h() {
        this.r = false;
        C0512qi c0512qi = this.d;
        if (c0512qi != null) {
            c0512qi.notifyDataSetChanged();
        }
    }

    @Override // defpackage.Co
    public final C0073ca i() {
        return this.i.c;
    }

    @Override // defpackage.Li
    public final boolean k(Np np) {
        if (np.hasVisibleItems()) {
            View view = this.n;
            Fi fi = new Fi(this.g, this.h, np, this.b, view, this.e);
            Ki ki = this.o;
            fi.i = ki;
            Di di = fi.j;
            if (di != null) {
                di.f(ki);
            }
            boolean zU = Di.u(np);
            fi.h = zU;
            Di di2 = fi.j;
            if (di2 != null) {
                di2.o(zU);
            }
            fi.k = this.l;
            this.l = null;
            this.c.c(false);
            Ji ji = this.i;
            int width = ji.f;
            int iF = ji.f();
            if ((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                width += this.m.getWidth();
            }
            if (!fi.b()) {
                if (fi.f != null) {
                    fi.d(width, iF, true, true);
                }
            }
            Ki ki2 = this.o;
            if (ki2 != null) {
                ki2.u(np);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.Di
    public final void l(MenuC0604ti menuC0604ti) {
    }

    @Override // defpackage.Di
    public final void n(View view) {
        this.m = view;
    }

    @Override // defpackage.Di
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.Di
    public final void p(int i) {
        this.t = i;
    }

    @Override // defpackage.Di
    public final void q(int i) {
        this.i.f = i;
    }

    @Override // defpackage.Di
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // defpackage.Di
    public final void s(boolean z) {
        this.u = z;
    }

    @Override // defpackage.Di
    public final void t(int i) {
        this.i.l(i);
    }
}
