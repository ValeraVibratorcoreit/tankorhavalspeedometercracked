package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.AbstractC0190g4;
import defpackage.C0473pa;
import defpackage.L;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final C0473pa i;

    public BaseTransientBottomBar$Behavior() {
        C0473pa c0473pa = new C0473pa(16);
        this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.i = c0473pa;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.L7
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.i.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (L.b == null) {
                    L.b = new L(4);
                }
                synchronized (L.b.a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (L.b == null) {
                L.b = new L(4);
            }
            synchronized (L.b.a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.i.getClass();
        return view instanceof AbstractC0190g4;
    }
}
