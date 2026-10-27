package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0423nm extends C0740y {
    public final RecyclerView d;
    public final C0392mm e;

    public C0423nm(RecyclerView recyclerView) {
        this.d = recyclerView;
        C0392mm c0392mm = this.e;
        if (c0392mm != null) {
            this.e = c0392mm;
        } else {
            this.e = new C0392mm(this);
        }
    }

    @Override // defpackage.C0740y
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.L()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // defpackage.C0740y
    public final void d(View view, J j) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = j.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.L() || recyclerView.getLayoutManager() == null) {
            return;
        }
        Wl layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        C0085cm c0085cm = recyclerView2.b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
            j.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
            j.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C0269im c0269im = recyclerView2.c0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(c0085cm, c0269im), layoutManager.x(c0085cm, c0269im), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.C0740y
    public final boolean g(View view, int i, Bundle bundle) {
        int iG;
        int iE;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.L() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        Wl layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        C0085cm c0085cm = recyclerView2.b;
        if (i == 4096) {
            iG = recyclerView2.canScrollVertically(1) ? (layoutManager.o - layoutManager.G()) - layoutManager.D() : 0;
            if (layoutManager.b.canScrollHorizontally(1)) {
                iE = (layoutManager.n - layoutManager.E()) - layoutManager.F();
            } else {
                iE = 0;
            }
        } else if (i != 8192) {
            iE = 0;
            iG = 0;
        } else {
            iG = recyclerView2.canScrollVertically(-1) ? -((layoutManager.o - layoutManager.G()) - layoutManager.D()) : 0;
            if (layoutManager.b.canScrollHorizontally(-1)) {
                iE = -((layoutManager.n - layoutManager.E()) - layoutManager.F());
            } else {
                iE = 0;
            }
        }
        if (iG == 0 && iE == 0) {
            return false;
        }
        layoutManager.b.c0(iE, iG, true);
        return true;
    }
}
