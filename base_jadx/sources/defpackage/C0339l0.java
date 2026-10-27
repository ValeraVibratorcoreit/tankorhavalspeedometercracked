package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0339l0 implements Li {
    public final Context a;
    public Context b;
    public MenuC0604ti c;
    public final LayoutInflater d;
    public Ki e;
    public Ni h;
    public C0277j0 i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public C0186g0 s;
    public C0186g0 t;
    public RunnableC0248i0 u;
    public C0217h0 v;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray r = new SparseBooleanArray();
    public final C0308k0 w = new C0308k0(this, 0);

    public C0339l0(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(C0759yi c0759yi, View view, ViewGroup viewGroup) {
        Mi mi;
        View actionView = c0759yi.getActionView();
        if (actionView == null || c0759yi.e()) {
            if (view instanceof Mi) {
                mi = (Mi) view;
            } else {
                mi = (Mi) this.d.inflate(this.g, viewGroup, false);
            }
            mi.c(c0759yi);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) mi;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
            if (this.v == null) {
                this.v = new C0217h0(this);
            }
            actionMenuItemView.setPopupCallback(this.v);
            actionView = (View) mi;
        }
        actionView.setVisibility(c0759yi.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0401n0)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.Li
    public final void b(MenuC0604ti menuC0604ti, boolean z) {
        e();
        C0186g0 c0186g0 = this.t;
        if (c0186g0 != null && c0186g0.b()) {
            c0186g0.j.dismiss();
        }
        Ki ki = this.e;
        if (ki != null) {
            ki.b(menuC0604ti, z);
        }
    }

    @Override // defpackage.Li
    public final boolean c() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        MenuC0604ti menuC0604ti = this.c;
        if (menuC0604ti != null) {
            arrayListL = menuC0604ti.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = this.p;
        int i3 = this.o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C0759yi c0759yi = (C0759yi) arrayListL.get(i4);
            int i7 = c0759yi.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.q && c0759yi.C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C0759yi c0759yi2 = (C0759yi) arrayListL.get(i9);
            int i11 = c0759yi2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = c0759yi2.b;
            if (z3) {
                View viewA = a(c0759yi2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c0759yi2.g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = a(c0759yi2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            C0759yi c0759yi3 = (C0759yi) arrayListL.get(i13);
                            if (c0759yi3.b == i12) {
                                if (c0759yi3.f()) {
                                    i8++;
                                }
                                c0759yi3.g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    c0759yi2.g(z5);
                } else {
                    c0759yi2.g(false);
                }
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return z;
    }

    @Override // defpackage.Li
    public final boolean d(C0759yi c0759yi) {
        return false;
    }

    public final boolean e() {
        Object obj;
        RunnableC0248i0 runnableC0248i0 = this.u;
        if (runnableC0248i0 != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0248i0);
            this.u = null;
            return true;
        }
        C0186g0 c0186g0 = this.s;
        if (c0186g0 == null) {
            return false;
        }
        if (c0186g0.b()) {
            c0186g0.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.Li
    public final void f(Ki ki) {
        this.e = ki;
    }

    @Override // defpackage.Li
    public final boolean g(C0759yi c0759yi) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Li
    public final void h() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC0604ti menuC0604ti = this.c;
            if (menuC0604ti != null) {
                menuC0604ti.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0759yi c0759yi = (C0759yi) arrayListL.get(i2);
                    if (c0759yi.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0759yi itemData = childAt instanceof Mi ? ((Mi) childAt).getItemData() : null;
                        View viewA = a(c0759yi, childAt, viewGroup);
                        if (c0759yi != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.h).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        MenuC0604ti menuC0604ti2 = this.c;
        if (menuC0604ti2 != null) {
            menuC0604ti2.i();
            ArrayList arrayList2 = menuC0604ti2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0790zi actionProviderVisibilityListenerC0790zi = ((C0759yi) arrayList2.get(i3)).A;
            }
        }
        MenuC0604ti menuC0604ti3 = this.c;
        if (menuC0604ti3 != null) {
            menuC0604ti3.i();
            arrayList = menuC0604ti3.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C0759yi) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.i == null) {
                this.i = new C0277j0(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0277j0 c0277j0 = this.i;
                actionMenuView.getClass();
                C0401n0 c0401n0J = ActionMenuView.j();
                c0401n0J.a = true;
                actionMenuView.addView(c0277j0, c0401n0J);
            }
        } else {
            C0277j0 c0277j1 = this.i;
            if (c0277j1 != null) {
                Object parent = c0277j1.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    public final boolean i() {
        C0186g0 c0186g0 = this.s;
        return c0186g0 != null && c0186g0.b();
    }

    @Override // defpackage.Li
    public final void j(Context context, MenuC0604ti menuC0604ti) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = menuC0604ti;
        Resources resources = context.getResources();
        if (!this.m) {
            this.l = true;
        }
        int i = 2;
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.p = i;
        int measuredWidth = this.n;
        if (this.l) {
            if (this.i == null) {
                C0277j0 c0277j0 = new C0277j0(this, this.a);
                this.i = c0277j0;
                if (this.k) {
                    c0277j0.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Li
    public final boolean k(Np np) {
        boolean z;
        if (!np.hasVisibleItems()) {
            return false;
        }
        Np np2 = np;
        while (true) {
            MenuC0604ti menuC0604ti = np2.z;
            if (menuC0604ti == this.c) {
                break;
            }
            np2 = (Np) menuC0604ti;
        }
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof Mi) && ((Mi) childAt).getItemData() == np2.A) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        np.A.getClass();
        int size = np.f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = np.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C0186g0 c0186g0 = new C0186g0(this, this.b, np, view);
        this.t = c0186g0;
        c0186g0.h = z;
        Di di = c0186g0.j;
        if (di != null) {
            di.o(z);
        }
        C0186g0 c0186g1 = this.t;
        if (!c0186g1.b()) {
            if (c0186g1.f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0186g1.d(0, 0, false, false);
        }
        Ki ki = this.e;
        if (ki != null) {
            ki.u(np);
        }
        return true;
    }

    public final boolean l() {
        MenuC0604ti menuC0604ti;
        if (!this.l || i() || (menuC0604ti = this.c) == null || this.h == null || this.u != null) {
            return false;
        }
        menuC0604ti.i();
        if (menuC0604ti.j.isEmpty()) {
            return false;
        }
        RunnableC0248i0 runnableC0248i0 = new RunnableC0248i0(this, 0, new C0186g0(this, this.b, this.c, this.i));
        this.u = runnableC0248i0;
        ((View) this.h).post(runnableC0248i0);
        return true;
    }
}
