package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118dp {
    public int a;
    public int b;
    public final AbstractComponentCallbacksC0784zc c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final Vc h;

    public C0118dp(int i, int i2, Vc vc, C0529r5 c0529r5) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = abstractComponentCallbacksC0784zc;
        c0529r5.b(new Vi(this));
        this.h = vc;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        HashSet hashSet = this.e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((C0529r5) it.next()).a();
        }
    }

    public final void b() {
        if (!this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int iO = Vo.o(i2);
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.c;
        if (iO == 0) {
            if (this.a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0784zc + " mFinalState = " + Vo.s(this.a) + " -> " + Vo.s(i) + ". ");
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iO == 1) {
            if (this.a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0784zc + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + Vo.r(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (iO != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0784zc + " mFinalState = " + Vo.s(this.a) + " -> REMOVED. mLifecycleImpact  = " + Vo.r(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        Vc vc = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
                View viewJ = abstractComponentCallbacksC0784zc.J();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewJ.findFocus() + " on view " + viewJ + " for Fragment " + abstractComponentCallbacksC0784zc);
                }
                viewJ.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc2 = vc.c;
        View viewFindFocus = abstractComponentCallbacksC0784zc2.E.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC0784zc2.e().k = viewFindFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0784zc2);
            }
        }
        View viewJ2 = this.c.J();
        if (viewJ2.getParent() == null) {
            vc.b();
            viewJ2.setAlpha(0.0f);
        }
        if (viewJ2.getAlpha() == 0.0f && viewJ2.getVisibility() == 0) {
            viewJ2.setVisibility(4);
        }
        C0722xc c0722xc = abstractComponentCallbacksC0784zc2.H;
        viewJ2.setAlpha(c0722xc == null ? 1.0f : c0722xc.j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + Vo.s(this.a) + "} {mLifecycleImpact = " + Vo.r(this.b) + "} {mFragment = " + this.c + "}";
    }
}
