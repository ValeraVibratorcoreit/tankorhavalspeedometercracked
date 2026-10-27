package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Up extends AbstractC0390mk {
    public int l;
    public int m = -1;
    public final /* synthetic */ SwipeDismissBehavior n;

    public Up(SwipeDismissBehavior swipeDismissBehavior) {
        this.n = swipeDismissBehavior;
    }

    @Override // defpackage.AbstractC0390mk
    public final void A(View view, int i) {
        this.m = i;
        this.l = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.n;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final void B(int i) {
        this.n.getClass();
    }

    @Override // defpackage.AbstractC0390mk
    public final void C(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.n;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float fAbs = Math.abs(i - this.l);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // defpackage.AbstractC0390mk
    public final void D(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.m = -1;
        int width = view.getWidth();
        boolean z = true;
        SwipeDismissBehavior swipeDismissBehavior = this.n;
        if (f != 0.0f) {
            WeakHashMap weakHashMap = Gs.a;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.l;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.l;
                if (left < i2) {
                    i = this.l - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.l - width;
            }
        } else {
            if (Math.abs(view.getLeft() - this.l) < Math.round(view.getWidth() * swipeDismissBehavior.e)) {
                i = this.l;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.l;
                if (left < i2) {
                    i = this.l - width;
                } else {
                    i = i2 + width;
                }
            } else {
                i = this.l - width;
            }
        }
        if (swipeDismissBehavior.a.o(i, view.getTop())) {
            RunnableC0248i0 runnableC0248i0 = new RunnableC0248i0(swipeDismissBehavior, view, z);
            WeakHashMap weakHashMap2 = Gs.a;
            view.postOnAnimation(runnableC0248i0);
        }
    }

    @Override // defpackage.AbstractC0390mk
    public final boolean L(View view, int i) {
        int i2 = this.m;
        return (i2 == -1 || i2 == i) && this.n.r(view);
    }

    @Override // defpackage.AbstractC0390mk
    public final int e(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = Gs.a;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.n.d;
        if (i2 == 0) {
            if (z) {
                width = this.l - view.getWidth();
                width2 = this.l;
            } else {
                width = this.l;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.l - view.getWidth();
            width2 = view.getWidth() + this.l;
        } else if (z) {
            width = this.l;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.l - view.getWidth();
            width2 = this.l;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.AbstractC0390mk
    public final int f(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.AbstractC0390mk
    public final int o(View view) {
        return view.getWidth();
    }
}
