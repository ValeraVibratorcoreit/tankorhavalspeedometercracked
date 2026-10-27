package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.Ts;
import defpackage.Vo;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends Ts {
    public boolean c;
    public int d;
    public int e;
    public int f;
    public VelocityTracker g;

    public AppBarLayout$BaseBehavior() {
        this.d = -1;
        this.f = -1;
    }

    @Override // defpackage.L7
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i = this.d;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.e) > this.f) {
                this.e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.d = -1;
        motionEvent.getX();
        motionEvent.getY();
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.Ts, defpackage.L7
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final void m(View view, Parcelable parcelable) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final Parcelable n(View view) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final boolean o(View view, int i, int i2) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final void p(View view, View view2, int i) {
        Vo.m(view);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // defpackage.L7
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                this.e = (int) motionEvent.getY(iFindPointerIndex);
                Vo.l(view);
                throw null;
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.d = motionEvent.getPointerId(i);
                    this.e = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return this.c;
        }
        VelocityTracker velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.g.computeCurrentVelocity(1000);
            this.g.getYVelocity(this.d);
            Vo.l(view);
            throw null;
        }
        this.c = false;
        this.d = -1;
        VelocityTracker velocityTracker3 = this.g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.g = null;
        }
        velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.c;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.d = -1;
        this.f = -1;
    }
}
