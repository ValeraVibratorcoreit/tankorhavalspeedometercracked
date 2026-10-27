package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0392mm extends C0740y {
    public final C0423nm d;
    public final WeakHashMap e = new WeakHashMap();

    public C0392mm(C0423nm c0423nm) {
        this.d = c0423nm;
    }

    @Override // defpackage.C0740y
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0740y c0740y = (C0740y) this.e.get(view);
        return c0740y != null ? c0740y.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.C0740y
    public final L b(View view) {
        C0740y c0740y = (C0740y) this.e.get(view);
        return c0740y != null ? c0740y.b(view) : super.b(view);
    }

    @Override // defpackage.C0740y
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0740y c0740y = (C0740y) this.e.get(view);
        if (c0740y != null) {
            c0740y.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.C0740y
    public final void d(View view, J j) {
        C0423nm c0423nm = this.d;
        boolean zL = c0423nm.d.L();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = j.a;
        if (!zL) {
            RecyclerView recyclerView = c0423nm.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().V(view, j);
                C0740y c0740y = (C0740y) this.e.get(view);
                if (c0740y != null) {
                    c0740y.d(view, j);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.C0740y
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0740y c0740y = (C0740y) this.e.get(view);
        if (c0740y != null) {
            c0740y.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.C0740y
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0740y c0740y = (C0740y) this.e.get(viewGroup);
        return c0740y != null ? c0740y.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.C0740y
    public final boolean g(View view, int i, Bundle bundle) {
        C0423nm c0423nm = this.d;
        if (!c0423nm.d.L()) {
            RecyclerView recyclerView = c0423nm.d;
            if (recyclerView.getLayoutManager() != null) {
                C0740y c0740y = (C0740y) this.e.get(view);
                if (c0740y != null) {
                    if (c0740y.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                C0085cm c0085cm = recyclerView.getLayoutManager().b.b;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.C0740y
    public final void h(View view, int i) {
        C0740y c0740y = (C0740y) this.e.get(view);
        if (c0740y != null) {
            c0740y.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.C0740y
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0740y c0740y = (C0740y) this.e.get(view);
        if (c0740y != null) {
            c0740y.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
