package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC0340l1;
import defpackage.Br;
import defpackage.L7;
import defpackage.Vo;
import defpackage.Y;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends L7 {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public ViewPropertyAnimator h;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public int g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.L7
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = Br.h0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = Br.h0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = Br.i0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0340l1.d);
        this.e = Br.i0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0340l1.c);
        return false;
    }

    @Override // defpackage.L7
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.a;
        if (i > 0) {
            if (this.g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                Vo.l(it.next());
                throw null;
            }
            this.h = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new Y(this, 3));
            return;
        }
        if (i >= 0 || this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            Vo.l(it2.next());
            throw null;
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new Y(this, 3));
    }

    @Override // defpackage.L7
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
