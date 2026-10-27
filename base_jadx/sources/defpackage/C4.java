package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class C4 extends AbstractC0390mk {
    public final /* synthetic */ int l;
    public final /* synthetic */ L7 m;

    public /* synthetic */ C4(L7 l7, int i) {
        this.l = i;
        this.m = l7;
    }

    @Override // defpackage.AbstractC0390mk
    public final void B(int i) {
        switch (this.l) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final void C(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.l) {
            case 0:
                ((BottomSheetBehavior) this.m).u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.r0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.e(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    Vo.l(it.next());
                    throw null;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    @Override // defpackage.AbstractC0390mk
    public final void D(View view, float f, float f2) {
        switch (this.l) {
            case 0:
                int i = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.b) {
                        i = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        if (top <= bottomSheetBehavior.E) {
                            i = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() > (bottomSheetBehavior.x() + bottomSheetBehavior.T) / 2) {
                            i = 5;
                        } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i = 3;
                        }
                    } else {
                        i = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.b) {
                        int i2 = bottomSheetBehavior.E;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i = 3;
                            }
                        } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                            i = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                } else if (bottomSheetBehavior.b) {
                    i = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) >= Math.abs(top3 - bottomSheetBehavior.G)) {
                        i = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.E(view, i, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                int i3 = 3;
                if (!sideSheetBehavior.a.M(f)) {
                    if (sideSheetBehavior.a.k0(view, f)) {
                        if (sideSheetBehavior.a.Q(f, f2) || sideSheetBehavior.a.P(view)) {
                            i3 = 5;
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.a.s()) >= Math.abs(left - sideSheetBehavior.a.t())) {
                            i3 = 5;
                        }
                    } else {
                        i3 = 5;
                    }
                }
                sideSheetBehavior.t(view, i3, true);
                break;
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final boolean L(View view, int i) {
        WeakReference weakReference;
        switch (this.l) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                int i2 = bottomSheetBehavior.L;
                if (i2 == 1 || bottomSheetBehavior.a0) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.Y == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.V;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.U;
                return weakReference3 != null && weakReference3.get() == view;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final int e(View view, int i) {
        switch (this.l) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                return Td.f(i, sideSheetBehavior.a.y(), sideSheetBehavior.a.x());
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final int f(View view, int i) {
        switch (this.l) {
            case 0:
                return Td.f(i, ((BottomSheetBehavior) this.m).x(), p());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.AbstractC0390mk
    public int o(View view) {
        switch (this.l) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.m;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.o(view);
        }
    }

    @Override // defpackage.AbstractC0390mk
    public int p() {
        switch (this.l) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.m;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.p();
        }
    }
}
