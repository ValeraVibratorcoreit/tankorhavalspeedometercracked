package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Vc {
    public final C0096d2 a;
    public final C0296jj b;
    public final AbstractComponentCallbacksC0784zc c;
    public boolean d = false;
    public int e = -1;

    public Vc(C0096d2 c0096d2, C0296jj c0296jj, AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        this.a = c0096d2;
        this.b = c0296jj;
        this.c = abstractComponentCallbacksC0784zc;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0784zc);
        }
        Bundle bundle = abstractComponentCallbacksC0784zc.b;
        abstractComponentCallbacksC0784zc.t.L();
        abstractComponentCallbacksC0784zc.a = 3;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.s();
        if (!abstractComponentCallbacksC0784zc.C) {
            throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0784zc);
        }
        View view = abstractComponentCallbacksC0784zc.E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0784zc.b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0784zc.c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0784zc.c = null;
            }
            if (abstractComponentCallbacksC0784zc.E != null) {
                abstractComponentCallbacksC0784zc.N.d.e(abstractComponentCallbacksC0784zc.d);
                abstractComponentCallbacksC0784zc.d = null;
            }
            abstractComponentCallbacksC0784zc.C = false;
            abstractComponentCallbacksC0784zc.F(bundle2);
            if (!abstractComponentCallbacksC0784zc.C) {
                throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0784zc.E != null) {
                abstractComponentCallbacksC0784zc.N.c(EnumC0602tg.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0784zc.b = null;
        Oc oc = abstractComponentCallbacksC0784zc.t;
        oc.E = false;
        oc.F = false;
        oc.L.g = false;
        oc.t(4);
        this.a.q(false);
    }

    public final void b() {
        View view;
        View view2;
        C0296jj c0296jj = this.b;
        c0296jj.getClass();
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        ViewGroup viewGroup = abstractComponentCallbacksC0784zc.D;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0296jj.a;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0784zc);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = (AbstractComponentCallbacksC0784zc) arrayList.get(i);
                if (abstractComponentCallbacksC0784zc2.D == viewGroup && (view2 = abstractComponentCallbacksC0784zc2.E) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc3 = (AbstractComponentCallbacksC0784zc) arrayList.get(iIndexOf);
                if (abstractComponentCallbacksC0784zc3.D == viewGroup && (view = abstractComponentCallbacksC0784zc3.E) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        abstractComponentCallbacksC0784zc.D.addView(abstractComponentCallbacksC0784zc.E, iIndexOfChild);
    }

    public final void c() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0784zc);
        }
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = abstractComponentCallbacksC0784zc.g;
        Vc vc = null;
        C0296jj c0296jj = this.b;
        if (abstractComponentCallbacksC0784zc2 != null) {
            Vc vc2 = (Vc) ((HashMap) c0296jj.b).get(abstractComponentCallbacksC0784zc2.e);
            if (vc2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0784zc + " declared target fragment " + abstractComponentCallbacksC0784zc.g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0784zc.h = abstractComponentCallbacksC0784zc.g.e;
            abstractComponentCallbacksC0784zc.g = null;
            vc = vc2;
        } else {
            String str = abstractComponentCallbacksC0784zc.h;
            if (str != null && (vc = (Vc) ((HashMap) c0296jj.b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0784zc);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(Vo.h(sb, abstractComponentCallbacksC0784zc.h, " that does not belong to this FragmentManager!"));
            }
        }
        if (vc != null) {
            vc.k();
        }
        Oc oc = abstractComponentCallbacksC0784zc.r;
        abstractComponentCallbacksC0784zc.s = oc.t;
        abstractComponentCallbacksC0784zc.u = oc.v;
        C0096d2 c0096d2 = this.a;
        c0096d2.w(false);
        ArrayList arrayList = abstractComponentCallbacksC0784zc.Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc3 = ((C0660vc) it.next()).a;
            abstractComponentCallbacksC0784zc3.P.d();
            Tf.o(abstractComponentCallbacksC0784zc3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0784zc.t.b(abstractComponentCallbacksC0784zc.s, abstractComponentCallbacksC0784zc.c(), abstractComponentCallbacksC0784zc);
        abstractComponentCallbacksC0784zc.a = 0;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.u(abstractComponentCallbacksC0784zc.s.k);
        if (!abstractComponentCallbacksC0784zc.C) {
            throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0784zc.r.m.iterator();
        while (it2.hasNext()) {
            ((Sc) it2.next()).a();
        }
        Oc oc2 = abstractComponentCallbacksC0784zc.t;
        oc2.E = false;
        oc2.F = false;
        oc2.L.g = false;
        oc2.t(0);
        c0096d2.r(false);
    }

    public final int d() {
        C0118dp c0118dp;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (abstractComponentCallbacksC0784zc.r == null) {
            return abstractComponentCallbacksC0784zc.a;
        }
        int iMin = this.e;
        int iOrdinal = abstractComponentCallbacksC0784zc.L.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0784zc.m) {
            if (abstractComponentCallbacksC0784zc.n) {
                iMin = Math.max(this.e, 2);
                View view = abstractComponentCallbacksC0784zc.E;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, abstractComponentCallbacksC0784zc.a) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0784zc.k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0784zc.D;
        if (viewGroup != null) {
            O8 o8F = O8.f(viewGroup, abstractComponentCallbacksC0784zc.j().E());
            o8F.getClass();
            C0118dp c0118dpD = o8F.d(abstractComponentCallbacksC0784zc);
            i = c0118dpD != null ? c0118dpD.b : 0;
            Iterator it = o8F.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0118dp = null;
                    break;
                }
                c0118dp = (C0118dp) it.next();
                if (c0118dp.c.equals(abstractComponentCallbacksC0784zc) && !c0118dp.f) {
                    break;
                }
            }
            if (c0118dp != null && (i == 0 || i == 1)) {
                i = c0118dp.b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0784zc.l) {
            iMin = abstractComponentCallbacksC0784zc.r() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0784zc.F && abstractComponentCallbacksC0784zc.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0784zc);
        }
        return iMin;
    }

    public final void e() {
        Parcelable parcelable;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0784zc);
        }
        if (abstractComponentCallbacksC0784zc.J) {
            Bundle bundle = abstractComponentCallbacksC0784zc.b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0784zc.t.R(parcelable);
                Oc oc = abstractComponentCallbacksC0784zc.t;
                oc.E = false;
                oc.F = false;
                oc.L.g = false;
                oc.t(1);
            }
            abstractComponentCallbacksC0784zc.a = 1;
            return;
        }
        C0096d2 c0096d2 = this.a;
        c0096d2.x(false);
        Bundle bundle2 = abstractComponentCallbacksC0784zc.b;
        abstractComponentCallbacksC0784zc.t.L();
        abstractComponentCallbacksC0784zc.a = 1;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.M.a(new Kl(abstractComponentCallbacksC0784zc, 3));
        abstractComponentCallbacksC0784zc.P.e(bundle2);
        abstractComponentCallbacksC0784zc.v(bundle2);
        abstractComponentCallbacksC0784zc.J = true;
        if (abstractComponentCallbacksC0784zc.C) {
            abstractComponentCallbacksC0784zc.M.e(EnumC0602tg.ON_CREATE);
            c0096d2.s(false);
        } else {
            throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String resourceName;
        int i = 2;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (abstractComponentCallbacksC0784zc.m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0784zc);
        }
        LayoutInflater layoutInflaterZ = abstractComponentCallbacksC0784zc.z(abstractComponentCallbacksC0784zc.b);
        ViewGroup viewGroup = abstractComponentCallbacksC0784zc.D;
        if (viewGroup == null) {
            int i2 = abstractComponentCallbacksC0784zc.w;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0784zc + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0784zc.r.u.N(i2);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0784zc.o) {
                        try {
                            resourceName = abstractComponentCallbacksC0784zc.k().getResourceName(abstractComponentCallbacksC0784zc.w);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0784zc.w) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0784zc);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Xc xc = Yc.a;
                    Yc.b(new Tc(abstractComponentCallbacksC0784zc, "Attempting to add fragment " + abstractComponentCallbacksC0784zc + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Yc.a(abstractComponentCallbacksC0784zc).getClass();
                }
            }
        }
        abstractComponentCallbacksC0784zc.D = viewGroup;
        abstractComponentCallbacksC0784zc.G(layoutInflaterZ, viewGroup, abstractComponentCallbacksC0784zc.b);
        View view = abstractComponentCallbacksC0784zc.E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0784zc.E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0784zc);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0784zc.y) {
                abstractComponentCallbacksC0784zc.E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0784zc.E;
            WeakHashMap weakHashMap = Gs.a;
            if (view2.isAttachedToWindow()) {
                AbstractC0614ts.c(abstractComponentCallbacksC0784zc.E);
            } else {
                View view3 = abstractComponentCallbacksC0784zc.E;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0715x5(view3, i));
            }
            abstractComponentCallbacksC0784zc.E(abstractComponentCallbacksC0784zc.E);
            abstractComponentCallbacksC0784zc.t.t(2);
            this.a.C(false);
            int visibility = abstractComponentCallbacksC0784zc.E.getVisibility();
            abstractComponentCallbacksC0784zc.e().j = abstractComponentCallbacksC0784zc.E.getAlpha();
            if (abstractComponentCallbacksC0784zc.D != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0784zc.E.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0784zc.e().k = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0784zc);
                    }
                }
                abstractComponentCallbacksC0784zc.E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0784zc.a = 2;
    }

    public final void g() {
        boolean z;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcH;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0784zc);
        }
        boolean z2 = abstractComponentCallbacksC0784zc.l && !abstractComponentCallbacksC0784zc.r();
        C0296jj c0296jj = this.b;
        if (z2) {
        }
        if (!z2) {
            Rc rc = (Rc) c0296jj.d;
            if (!((rc.b.containsKey(abstractComponentCallbacksC0784zc.e) && rc.e) ? rc.f : true)) {
                String str = abstractComponentCallbacksC0784zc.h;
                if (str != null && (abstractComponentCallbacksC0784zcH = c0296jj.h(str)) != null && abstractComponentCallbacksC0784zcH.A) {
                    abstractComponentCallbacksC0784zc.g = abstractComponentCallbacksC0784zcH;
                }
                abstractComponentCallbacksC0784zc.a = 0;
                return;
            }
        }
        Bc bc = abstractComponentCallbacksC0784zc.s;
        if (bc instanceof Ss) {
            z = ((Rc) c0296jj.d).f;
        } else {
            Context context = bc.k;
            z = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((Rc) c0296jj.d).c(abstractComponentCallbacksC0784zc);
        }
        abstractComponentCallbacksC0784zc.t.k();
        abstractComponentCallbacksC0784zc.M.e(EnumC0602tg.ON_DESTROY);
        abstractComponentCallbacksC0784zc.a = 0;
        abstractComponentCallbacksC0784zc.J = false;
        abstractComponentCallbacksC0784zc.C = true;
        this.a.t(false);
        for (Vc vc : c0296jj.o()) {
            if (vc != null) {
                String str2 = abstractComponentCallbacksC0784zc.e;
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = vc.c;
                if (str2.equals(abstractComponentCallbacksC0784zc2.h)) {
                    abstractComponentCallbacksC0784zc2.g = abstractComponentCallbacksC0784zc;
                    abstractComponentCallbacksC0784zc2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0784zc.h;
        if (str3 != null) {
            abstractComponentCallbacksC0784zc.g = c0296jj.h(str3);
        }
        c0296jj.t(this);
    }

    public final void h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0784zc);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0784zc.D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0784zc.E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0784zc.t.t(1);
        if (abstractComponentCallbacksC0784zc.E != null) {
            C0014ad c0014ad = abstractComponentCallbacksC0784zc.N;
            c0014ad.e();
            if (c0014ad.c.c.compareTo(EnumC0633ug.c) >= 0) {
                abstractComponentCallbacksC0784zc.N.c(EnumC0602tg.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0784zc.a = 1;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.x();
        if (!abstractComponentCallbacksC0784zc.C) {
            throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onDestroyView()");
        }
        C0057bp c0057bp = ((C0234hh) new Vi(abstractComponentCallbacksC0784zc.d(), C0234hh.c).e(C0234hh.class)).b;
        if (c0057bp.c > 0) {
            Vo.l(c0057bp.b[0]);
            throw null;
        }
        abstractComponentCallbacksC0784zc.p = false;
        this.a.D(false);
        abstractComponentCallbacksC0784zc.D = null;
        abstractComponentCallbacksC0784zc.E = null;
        abstractComponentCallbacksC0784zc.N = null;
        abstractComponentCallbacksC0784zc.O.e(null);
        abstractComponentCallbacksC0784zc.n = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0784zc);
        }
        abstractComponentCallbacksC0784zc.a = -1;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.y();
        if (!abstractComponentCallbacksC0784zc.C) {
            throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onDetach()");
        }
        Oc oc = abstractComponentCallbacksC0784zc.t;
        if (!oc.G) {
            oc.k();
            abstractComponentCallbacksC0784zc.t = new Oc();
        }
        this.a.u(false);
        abstractComponentCallbacksC0784zc.a = -1;
        abstractComponentCallbacksC0784zc.s = null;
        abstractComponentCallbacksC0784zc.u = null;
        abstractComponentCallbacksC0784zc.r = null;
        if (!abstractComponentCallbacksC0784zc.l || abstractComponentCallbacksC0784zc.r()) {
            Rc rc = (Rc) this.b.d;
            boolean z = true;
            if (rc.b.containsKey(abstractComponentCallbacksC0784zc.e) && rc.e) {
                z = rc.f;
            }
            if (!z) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0784zc);
        }
        abstractComponentCallbacksC0784zc.o();
    }

    public final void j() {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (abstractComponentCallbacksC0784zc.m && abstractComponentCallbacksC0784zc.n && !abstractComponentCallbacksC0784zc.p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0784zc);
            }
            abstractComponentCallbacksC0784zc.G(abstractComponentCallbacksC0784zc.z(abstractComponentCallbacksC0784zc.b), null, abstractComponentCallbacksC0784zc.b);
            View view = abstractComponentCallbacksC0784zc.E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0784zc.E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0784zc);
                if (abstractComponentCallbacksC0784zc.y) {
                    abstractComponentCallbacksC0784zc.E.setVisibility(8);
                }
                abstractComponentCallbacksC0784zc.E(abstractComponentCallbacksC0784zc.E);
                abstractComponentCallbacksC0784zc.t.t(2);
                this.a.C(false);
                abstractComponentCallbacksC0784zc.a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0296jj c0296jj = this.b;
        boolean z = this.d;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (z) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0784zc);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = abstractComponentCallbacksC0784zc.a;
                if (iD == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC0784zc.l && !abstractComponentCallbacksC0784zc.r()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0784zc);
                        }
                        ((Rc) c0296jj.d).c(abstractComponentCallbacksC0784zc);
                        c0296jj.t(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0784zc);
                        }
                        abstractComponentCallbacksC0784zc.o();
                    }
                    if (abstractComponentCallbacksC0784zc.I) {
                        if (abstractComponentCallbacksC0784zc.E != null && (viewGroup = abstractComponentCallbacksC0784zc.D) != null) {
                            O8 o8F = O8.f(viewGroup, abstractComponentCallbacksC0784zc.j().E());
                            if (abstractComponentCallbacksC0784zc.y) {
                                o8F.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0784zc);
                                }
                                o8F.a(3, 1, this);
                            } else {
                                o8F.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0784zc);
                                }
                                o8F.a(2, 1, this);
                            }
                        }
                        Oc oc = abstractComponentCallbacksC0784zc.r;
                        if (oc != null && abstractComponentCallbacksC0784zc.k && Oc.G(abstractComponentCallbacksC0784zc)) {
                            oc.D = true;
                        }
                        abstractComponentCallbacksC0784zc.I = false;
                        abstractComponentCallbacksC0784zc.t.n();
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0784zc.a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0784zc.n = false;
                            abstractComponentCallbacksC0784zc.a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0784zc);
                            }
                            if (abstractComponentCallbacksC0784zc.E != null && abstractComponentCallbacksC0784zc.c == null) {
                                p();
                            }
                            if (abstractComponentCallbacksC0784zc.E != null && (viewGroup2 = abstractComponentCallbacksC0784zc.D) != null) {
                                O8 o8F2 = O8.f(viewGroup2, abstractComponentCallbacksC0784zc.j().E());
                                o8F2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0784zc);
                                }
                                o8F2.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0784zc.a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            abstractComponentCallbacksC0784zc.a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0784zc.E != null && (viewGroup3 = abstractComponentCallbacksC0784zc.D) != null) {
                                O8 o8F3 = O8.f(viewGroup3, abstractComponentCallbacksC0784zc.j().E());
                                int iB = Vo.b(abstractComponentCallbacksC0784zc.E.getVisibility());
                                o8F3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0784zc);
                                }
                                o8F3.a(iB, 2, this);
                            }
                            abstractComponentCallbacksC0784zc.a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            abstractComponentCallbacksC0784zc.a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0784zc);
        }
        abstractComponentCallbacksC0784zc.t.t(5);
        if (abstractComponentCallbacksC0784zc.E != null) {
            abstractComponentCallbacksC0784zc.N.c(EnumC0602tg.ON_PAUSE);
        }
        abstractComponentCallbacksC0784zc.M.e(EnumC0602tg.ON_PAUSE);
        abstractComponentCallbacksC0784zc.a = 6;
        abstractComponentCallbacksC0784zc.C = true;
        this.a.v(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        Bundle bundle = abstractComponentCallbacksC0784zc.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0784zc.c = abstractComponentCallbacksC0784zc.b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0784zc.d = abstractComponentCallbacksC0784zc.b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0784zc.b.getString("android:target_state");
        abstractComponentCallbacksC0784zc.h = string;
        if (string != null) {
            abstractComponentCallbacksC0784zc.i = abstractComponentCallbacksC0784zc.b.getInt("android:target_req_state", 0);
        }
        boolean z = abstractComponentCallbacksC0784zc.b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0784zc.G = z;
        if (z) {
            return;
        }
        abstractComponentCallbacksC0784zc.F = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0784zc);
        }
        C0722xc c0722xc = abstractComponentCallbacksC0784zc.H;
        View view = c0722xc == null ? null : c0722xc.k;
        if (view != null) {
            if (view == abstractComponentCallbacksC0784zc.E) {
                zRequestFocus = view.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(abstractComponentCallbacksC0784zc);
                    sb.append(" resulting in focused view ");
                    sb.append(abstractComponentCallbacksC0784zc.E.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == abstractComponentCallbacksC0784zc.E) {
                            zRequestFocus = view.requestFocus();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(abstractComponentCallbacksC0784zc);
                                sb2.append(" resulting in focused view ");
                                sb2.append(abstractComponentCallbacksC0784zc.E.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC0784zc.e().k = null;
        abstractComponentCallbacksC0784zc.t.L();
        abstractComponentCallbacksC0784zc.t.y(true);
        abstractComponentCallbacksC0784zc.a = 7;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.A();
        if (!abstractComponentCallbacksC0784zc.C) {
            throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onResume()");
        }
        Fg fg = abstractComponentCallbacksC0784zc.M;
        EnumC0602tg enumC0602tg = EnumC0602tg.ON_RESUME;
        fg.e(enumC0602tg);
        if (abstractComponentCallbacksC0784zc.E != null) {
            abstractComponentCallbacksC0784zc.N.c.e(enumC0602tg);
        }
        Oc oc = abstractComponentCallbacksC0784zc.t;
        oc.E = false;
        oc.F = false;
        oc.L.g = false;
        oc.t(7);
        this.a.y(false);
        abstractComponentCallbacksC0784zc.b = null;
        abstractComponentCallbacksC0784zc.c = null;
        abstractComponentCallbacksC0784zc.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        Uc uc = new Uc(abstractComponentCallbacksC0784zc);
        if (abstractComponentCallbacksC0784zc.a <= -1 || uc.m != null) {
            uc.m = abstractComponentCallbacksC0784zc.b;
        } else {
            Bundle bundle = new Bundle();
            abstractComponentCallbacksC0784zc.B(bundle);
            abstractComponentCallbacksC0784zc.P.f(bundle);
            bundle.putParcelable("android:support:fragments", abstractComponentCallbacksC0784zc.t.S());
            this.a.z(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (abstractComponentCallbacksC0784zc.E != null) {
                p();
            }
            if (abstractComponentCallbacksC0784zc.c != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0784zc.c);
            }
            if (abstractComponentCallbacksC0784zc.d != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", abstractComponentCallbacksC0784zc.d);
            }
            if (!abstractComponentCallbacksC0784zc.G) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0784zc.G);
            }
            uc.m = bundle;
            if (abstractComponentCallbacksC0784zc.h != null) {
                if (bundle == null) {
                    uc.m = new Bundle();
                }
                uc.m.putString("android:target_state", abstractComponentCallbacksC0784zc.h);
                int i = abstractComponentCallbacksC0784zc.i;
                if (i != 0) {
                    uc.m.putInt("android:target_req_state", i);
                }
            }
        }
    }

    public final void p() {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (abstractComponentCallbacksC0784zc.E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0784zc + " with view " + abstractComponentCallbacksC0784zc.E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0784zc.E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0784zc.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0784zc.N.d.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0784zc.d = bundle;
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0784zc);
        }
        abstractComponentCallbacksC0784zc.t.L();
        abstractComponentCallbacksC0784zc.t.y(true);
        abstractComponentCallbacksC0784zc.a = 5;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.C();
        if (!abstractComponentCallbacksC0784zc.C) {
            throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onStart()");
        }
        Fg fg = abstractComponentCallbacksC0784zc.M;
        EnumC0602tg enumC0602tg = EnumC0602tg.ON_START;
        fg.e(enumC0602tg);
        if (abstractComponentCallbacksC0784zc.E != null) {
            abstractComponentCallbacksC0784zc.N.c.e(enumC0602tg);
        }
        Oc oc = abstractComponentCallbacksC0784zc.t;
        oc.E = false;
        oc.F = false;
        oc.L.g = false;
        oc.t(5);
        this.a.A(false);
    }

    public final void r() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (zIsLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0784zc);
        }
        Oc oc = abstractComponentCallbacksC0784zc.t;
        oc.F = true;
        oc.L.g = true;
        oc.t(4);
        if (abstractComponentCallbacksC0784zc.E != null) {
            abstractComponentCallbacksC0784zc.N.c(EnumC0602tg.ON_STOP);
        }
        abstractComponentCallbacksC0784zc.M.e(EnumC0602tg.ON_STOP);
        abstractComponentCallbacksC0784zc.a = 4;
        abstractComponentCallbacksC0784zc.C = false;
        abstractComponentCallbacksC0784zc.D();
        if (abstractComponentCallbacksC0784zc.C) {
            this.a.B(false);
            return;
        }
        throw new Op("Fragment " + abstractComponentCallbacksC0784zc + " did not call through to super.onStop()");
    }

    public Vc(C0096d2 c0096d2, C0296jj c0296jj, ClassLoader classLoader, Jc jc, Uc uc) {
        this.a = c0096d2;
        this.b = c0296jj;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcA = jc.a(uc.a);
        Bundle bundle = uc.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0784zcA.L(bundle);
        abstractComponentCallbacksC0784zcA.e = uc.b;
        abstractComponentCallbacksC0784zcA.m = uc.c;
        abstractComponentCallbacksC0784zcA.o = true;
        abstractComponentCallbacksC0784zcA.v = uc.d;
        abstractComponentCallbacksC0784zcA.w = uc.e;
        abstractComponentCallbacksC0784zcA.x = uc.f;
        abstractComponentCallbacksC0784zcA.A = uc.g;
        abstractComponentCallbacksC0784zcA.l = uc.h;
        abstractComponentCallbacksC0784zcA.z = uc.i;
        abstractComponentCallbacksC0784zcA.y = uc.k;
        abstractComponentCallbacksC0784zcA.L = EnumC0633ug.values()[uc.l];
        Bundle bundle2 = uc.m;
        if (bundle2 != null) {
            abstractComponentCallbacksC0784zcA.b = bundle2;
        } else {
            abstractComponentCallbacksC0784zcA.b = new Bundle();
        }
        this.c = abstractComponentCallbacksC0784zcA;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0784zcA);
        }
    }

    public Vc(C0096d2 c0096d2, C0296jj c0296jj, AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc, Uc uc) {
        this.a = c0096d2;
        this.b = c0296jj;
        this.c = abstractComponentCallbacksC0784zc;
        abstractComponentCallbacksC0784zc.c = null;
        abstractComponentCallbacksC0784zc.d = null;
        abstractComponentCallbacksC0784zc.q = 0;
        abstractComponentCallbacksC0784zc.n = false;
        abstractComponentCallbacksC0784zc.k = false;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = abstractComponentCallbacksC0784zc.g;
        abstractComponentCallbacksC0784zc.h = abstractComponentCallbacksC0784zc2 != null ? abstractComponentCallbacksC0784zc2.e : null;
        abstractComponentCallbacksC0784zc.g = null;
        Bundle bundle = uc.m;
        if (bundle != null) {
            abstractComponentCallbacksC0784zc.b = bundle;
        } else {
            abstractComponentCallbacksC0784zc.b = new Bundle();
        }
    }
}
