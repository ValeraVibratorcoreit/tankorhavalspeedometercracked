package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Bt extends Br implements InterfaceC0001a0 {
    public static final AccelerateInterpolator H = new AccelerateInterpolator();
    public static final DecelerateInterpolator I = new DecelerateInterpolator();
    public boolean A;
    public Xs B;
    public boolean C;
    public boolean D;
    public final C0801zt E;
    public final C0801zt F;
    public final Vi G;
    public Context j;
    public Context k;
    public ActionBarOverlayLayout l;
    public ActionBarContainer m;
    public InterfaceC0563s8 n;
    public ActionBarContextView o;
    public final View p;
    public boolean q;
    public At r;
    public At s;
    public InterfaceC0463p0 t;
    public boolean u;
    public final ArrayList v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public Bt(Activity activity, boolean z) {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.x = true;
        this.A = true;
        this.E = new C0801zt(this, 0);
        this.F = new C0801zt(this, 1);
        this.G = new Vi(this);
        View decorView = activity.getWindow().getDecorView();
        C0(decorView);
        if (z) {
            return;
        }
        this.p = decorView.findViewById(R.id.content);
    }

    public final void B0(boolean z) {
        Ws wsI;
        Ws wsI2;
        if (z) {
            if (!this.z) {
                this.z = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.l;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                E0(false);
            }
        } else if (this.z) {
            this.z = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.l;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            E0(false);
        }
        if (!this.m.isLaidOut()) {
            if (z) {
                ((C0028ar) this.n).a.setVisibility(4);
                this.o.setVisibility(0);
                return;
            } else {
                ((C0028ar) this.n).a.setVisibility(0);
                this.o.setVisibility(8);
                return;
            }
        }
        if (z) {
            C0028ar c0028ar = (C0028ar) this.n;
            wsI = Gs.a(c0028ar.a);
            wsI.a(0.0f);
            wsI.c(100L);
            wsI.d(new Zq(c0028ar, 4));
            wsI2 = this.o.i(200L, 0);
        } else {
            C0028ar c0028ar2 = (C0028ar) this.n;
            Ws wsA = Gs.a(c0028ar2.a);
            wsA.a(1.0f);
            wsA.c(200L);
            wsA.d(new Zq(c0028ar2, 0));
            wsI = this.o.i(100L, 8);
            wsI2 = wsA;
        }
        Xs xs = new Xs();
        ArrayList arrayList = xs.a;
        arrayList.add(wsI);
        View view = (View) wsI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) wsI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(wsI2);
        xs.b();
    }

    @Override // defpackage.Br
    public final Context C() {
        if (this.k == null) {
            TypedValue typedValue = new TypedValue();
            this.j.getTheme().resolveAttribute(ru.zinovin.tankspeedometer.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.k = new ContextThemeWrapper(this.j, i);
            } else {
                this.k = this.j;
            }
        }
        return this.k;
    }

    public final void C0(View view) {
        InterfaceC0563s8 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ru.zinovin.tankspeedometer.R.id.decor_content_parent);
        this.l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ru.zinovin.tankspeedometer.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0563s8) {
            wrapper = (InterfaceC0563s8) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.n = wrapper;
        this.o = (ActionBarContextView) view.findViewById(ru.zinovin.tankspeedometer.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ru.zinovin.tankspeedometer.R.id.action_bar_container);
        this.m = actionBarContainer;
        InterfaceC0563s8 interfaceC0563s8 = this.n;
        if (interfaceC0563s8 == null || this.o == null || actionBarContainer == null) {
            throw new IllegalStateException(Bt.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C0028ar) interfaceC0563s8).a.getContext();
        this.j = context;
        if ((((C0028ar) this.n).b & 4) != 0) {
            this.q = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.n.getClass();
        D0(context.getResources().getBoolean(ru.zinovin.tankspeedometer.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.j.obtainStyledAttributes(null, AbstractC0700wl.a, ru.zinovin.tankspeedometer.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.l;
            if (!actionBarOverlayLayout2.g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.D = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.m;
            WeakHashMap weakHashMap = Gs.a;
            AbstractC0676vs.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void D0(boolean z) {
        if (z) {
            this.m.setTabContainer(null);
            ((C0028ar) this.n).getClass();
        } else {
            ((C0028ar) this.n).getClass();
            this.m.setTabContainer(null);
        }
        this.n.getClass();
        ((C0028ar) this.n).a.setCollapsible(false);
        this.l.setHasNonEmbeddedTabs(false);
    }

    public final void E0(boolean z) {
        boolean z2 = this.z || !this.y;
        View view = this.p;
        Vi vi = this.G;
        if (!z2) {
            if (this.A) {
                this.A = false;
                Xs xs = this.B;
                if (xs != null) {
                    xs.a();
                }
                int i = this.w;
                C0801zt c0801zt = this.E;
                if (i != 0 || (!this.C && !z)) {
                    c0801zt.a();
                    return;
                }
                this.m.setAlpha(1.0f);
                this.m.setTransitioning(true);
                Xs xs2 = new Xs();
                float f = -this.m.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.m.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                Ws wsA = Gs.a(this.m);
                wsA.e(f);
                View view2 = (View) wsA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(vi != null ? new C0134ea(vi, view2) : null);
                }
                boolean z3 = xs2.e;
                ArrayList arrayList = xs2.a;
                if (!z3) {
                    arrayList.add(wsA);
                }
                if (this.x && view != null) {
                    Ws wsA2 = Gs.a(view);
                    wsA2.e(f);
                    if (!xs2.e) {
                        arrayList.add(wsA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = H;
                boolean z4 = xs2.e;
                if (!z4) {
                    xs2.c = accelerateInterpolator;
                }
                if (!z4) {
                    xs2.b = 250L;
                }
                if (!z4) {
                    xs2.d = c0801zt;
                }
                this.B = xs2;
                xs2.b();
                return;
            }
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        Xs xs3 = this.B;
        if (xs3 != null) {
            xs3.a();
        }
        this.m.setVisibility(0);
        int i2 = this.w;
        C0801zt c0801zt2 = this.F;
        if (i2 == 0 && (this.C || z)) {
            this.m.setTranslationY(0.0f);
            float f2 = -this.m.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.m.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.m.setTranslationY(f2);
            Xs xs4 = new Xs();
            Ws wsA3 = Gs.a(this.m);
            wsA3.e(0.0f);
            View view3 = (View) wsA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(vi != null ? new C0134ea(vi, view3) : null);
            }
            boolean z5 = xs4.e;
            ArrayList arrayList2 = xs4.a;
            if (!z5) {
                arrayList2.add(wsA3);
            }
            if (this.x && view != null) {
                view.setTranslationY(f2);
                Ws wsA4 = Gs.a(view);
                wsA4.e(0.0f);
                if (!xs4.e) {
                    arrayList2.add(wsA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = I;
            boolean z6 = xs4.e;
            if (!z6) {
                xs4.c = decelerateInterpolator;
            }
            if (!z6) {
                xs4.b = 250L;
            }
            if (!z6) {
                xs4.d = c0801zt2;
            }
            this.B = xs4;
            xs4.b();
        } else {
            this.m.setAlpha(1.0f);
            this.m.setTranslationY(0.0f);
            if (this.x && view != null) {
                view.setTranslationY(0.0f);
            }
            c0801zt2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.l;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = Gs.a;
            AbstractC0614ts.c(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.Br
    public final void K() {
        D0(this.j.getResources().getBoolean(ru.zinovin.tankspeedometer.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.Br
    public final boolean R(int i, KeyEvent keyEvent) {
        MenuC0604ti menuC0604ti;
        At at = this.r;
        if (at == null || (menuC0604ti = at.d) == null) {
            return false;
        }
        menuC0604ti.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC0604ti.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.Br
    public final void j0(boolean z) {
        if (this.q) {
            return;
        }
        k0(z);
    }

    @Override // defpackage.Br
    public final boolean k() {
        Tq tq;
        InterfaceC0563s8 interfaceC0563s8 = this.n;
        if (interfaceC0563s8 == null || (tq = ((C0028ar) interfaceC0563s8).a.M) == null || tq.b == null) {
            return false;
        }
        Tq tq2 = ((C0028ar) interfaceC0563s8).a.M;
        C0759yi c0759yi = tq2 == null ? null : tq2.b;
        if (c0759yi == null) {
            return true;
        }
        c0759yi.collapseActionView();
        return true;
    }

    @Override // defpackage.Br
    public final void k0(boolean z) {
        int i = z ? 4 : 0;
        C0028ar c0028ar = (C0028ar) this.n;
        int i2 = c0028ar.b;
        this.q = true;
        c0028ar.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.Br
    public final void l0(boolean z) {
        Xs xs;
        this.C = z;
        if (z || (xs = this.B) == null) {
            return;
        }
        xs.a();
    }

    @Override // defpackage.Br
    public final void m0(String str) {
        C0028ar c0028ar = (C0028ar) this.n;
        c0028ar.g = true;
        c0028ar.h = str;
        if ((c0028ar.b & 8) != 0) {
            Toolbar toolbar = c0028ar.a;
            toolbar.setTitle(str);
            if (c0028ar.g) {
                Gs.k(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.Br
    public final void p(boolean z) {
        if (z == this.u) {
            return;
        }
        this.u = z;
        ArrayList arrayList = this.v;
        if (arrayList.size() <= 0) {
            return;
        }
        Vo.l(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.Br
    public final void p0(CharSequence charSequence) {
        C0028ar c0028ar = (C0028ar) this.n;
        if (c0028ar.g) {
            return;
        }
        c0028ar.h = charSequence;
        if ((c0028ar.b & 8) != 0) {
            Toolbar toolbar = c0028ar.a;
            toolbar.setTitle(charSequence);
            if (c0028ar.g) {
                Gs.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.Br
    public final AbstractC0494q0 q0(C0096d2 c0096d2) {
        At at = this.r;
        if (at != null) {
            at.a();
        }
        this.l.setHideOnContentScrollEnabled(false);
        this.o.e();
        At at2 = new At(this, this.o.getContext(), c0096d2);
        MenuC0604ti menuC0604ti = at2.d;
        menuC0604ti.w();
        try {
            boolean zC = at2.e.c(at2, menuC0604ti);
            menuC0604ti.v();
            if (!zC) {
                return null;
            }
            this.r = at2;
            at2.g();
            this.o.c(at2);
            B0(true);
            return at2;
        } catch (Throwable th) {
            menuC0604ti.v();
            throw th;
        }
    }

    @Override // defpackage.Br
    public final int v() {
        return ((C0028ar) this.n).b;
    }

    public Bt(Dialog dialog) {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.x = true;
        this.A = true;
        this.E = new C0801zt(this, 0);
        this.F = new C0801zt(this, 1);
        this.G = new Vi(this);
        C0(dialog.getWindow().getDecorView());
    }
}
