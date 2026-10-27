package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.E;
import defpackage.Gs;
import defpackage.Ks;
import defpackage.L7;
import defpackage.Up;
import defpackage.Vi;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends L7 {
    public Ks a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public final float e = 0.5f;
    public float f = 0.0f;
    public float g = 0.5f;
    public final Up h = new Up(this);

    @Override // defpackage.L7
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (!zO) {
            return false;
        }
        if (this.a == null) {
            this.a = new Ks(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return !this.c && this.a.p(motionEvent);
    }

    @Override // defpackage.L7
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = Gs.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            Gs.g(view, 1048576);
            Gs.e(view, 0);
            if (r(view)) {
                Gs.h(view, E.j, new Vi(this));
            }
        }
        return false;
    }

    @Override // defpackage.L7
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
