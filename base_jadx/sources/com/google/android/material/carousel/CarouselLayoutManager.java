package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.AbstractC0233hg;
import defpackage.AbstractC0638ul;
import defpackage.C0085cm;
import defpackage.C0174fj;
import defpackage.C0269im;
import defpackage.C0473pa;
import defpackage.C0622u5;
import defpackage.C0653v5;
import defpackage.C0684w5;
import defpackage.InterfaceC0239hm;
import defpackage.Vo;
import defpackage.Wl;
import defpackage.Xl;
import java.util.List;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends Wl implements InterfaceC0239hm {
    public final C0174fj p;
    public C0684w5 q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        C0174fj c0174fj = new C0174fj();
        new C0653v5();
        this.r = new View.OnLayoutChangeListener() { // from class: s5
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.a;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0591t5(carouselLayoutManager, 0));
            }
        };
        this.p = c0174fj;
        m0();
        G0(0);
    }

    public static C0473pa D0(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((AbstractC0233hg) list.get(i5)).getClass();
            float fAbs = Math.abs(0.0f - f);
            if (0.0f <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (0.0f > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (0.0f <= f5) {
                f5 = 0.0f;
                i2 = i5;
            }
            if (0.0f > f3) {
                f3 = 0.0f;
                i4 = i5;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C0473pa((AbstractC0233hg) list.get(i), (AbstractC0233hg) list.get(i3));
    }

    public final float B0(int i) {
        this.q.d();
        throw null;
    }

    public final int C0() {
        return E0() ? this.n : this.o;
    }

    public final boolean E0() {
        return this.q.a == 0;
    }

    public final boolean F0() {
        return E0() && C() == 1;
    }

    public final void G0(int i) {
        C0684w5 c0684w5;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Vo.e(i, "invalid orientation:"));
        }
        c(null);
        C0684w5 c0684w6 = this.q;
        if (c0684w6 == null || i != c0684w6.a) {
            if (i == 0) {
                c0684w5 = new C0684w5(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0684w5 = new C0684w5(this, 0);
            }
            this.q = c0684w5;
            m0();
        }
    }

    @Override // defpackage.Wl
    public final boolean L() {
        return true;
    }

    @Override // defpackage.Wl
    public final void Q(RecyclerView recyclerView) {
        C0174fj c0174fj = this.p;
        Context context = recyclerView.getContext();
        float dimension = c0174fj.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0174fj.a = dimension;
        float dimension2 = c0174fj.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0174fj.b = dimension2;
        g0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.Wl
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    @Override // defpackage.Wl
    public final View S(View view, int i, C0085cm c0085cm, C0269im c0269im) {
        byte b;
        if (v() == 0) {
            return null;
        }
        int i2 = this.q.a;
        if (i == 1) {
            b = -1;
        } else if (i == 2) {
            b = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                    } else if (i2 == 1) {
                        b = 1;
                    }
                    b = -2147483648;
                } else if (i2 != 0) {
                    b = -2147483648;
                } else if (F0()) {
                    b = -1;
                } else {
                    b = 1;
                }
            } else if (i2 == 1) {
                b = -1;
            } else {
                b = -2147483648;
            }
        } else if (i2 != 0) {
            b = -2147483648;
        } else if (F0()) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (Wl.H(view) == 0) {
                return null;
            }
            int iH = Wl.H(u(0)) - 1;
            if (iH < 0 || iH >= B()) {
                return u(F0() ? v() - 1 : 0);
            }
            B0(iH);
            View view2 = c0085cm.i(Long.MAX_VALUE, iH).a;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        if (Wl.H(view) == B() - 1) {
            return null;
        }
        int iH2 = Wl.H(u(v() - 1)) + 1;
        if (iH2 < 0 || iH2 >= B()) {
            return u(F0() ? 0 : v() - 1);
        }
        B0(iH2);
        View view3 = c0085cm.i(Long.MAX_VALUE, iH2).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.Wl
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(Wl.H(u(0)));
            accessibilityEvent.setToIndex(Wl.H(u(v() - 1)));
        }
    }

    @Override // defpackage.Wl
    public final void W(int i, int i2) {
        B();
    }

    @Override // defpackage.Wl
    public final void Z(int i, int i2) {
        B();
    }

    @Override // defpackage.InterfaceC0239hm
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.Wl
    public final void b0(C0085cm c0085cm, C0269im c0269im) {
        if (c0269im.b() <= 0 || C0() <= 0.0f) {
            h0(c0085cm);
        } else {
            F0();
            View view = c0085cm.i(Long.MAX_VALUE, 0).a;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // defpackage.Wl
    public final void c0(C0269im c0269im) {
        if (v() == 0) {
            return;
        }
        Wl.H(u(0));
    }

    @Override // defpackage.Wl
    public final boolean d() {
        return E0();
    }

    @Override // defpackage.Wl
    public final boolean e() {
        return !E0();
    }

    @Override // defpackage.Wl
    public final int j(C0269im c0269im) {
        v();
        return 0;
    }

    @Override // defpackage.Wl
    public final int k(C0269im c0269im) {
        return 0;
    }

    @Override // defpackage.Wl
    public final int l(C0269im c0269im) {
        return 0;
    }

    @Override // defpackage.Wl
    public final boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.Wl
    public final int m(C0269im c0269im) {
        v();
        return 0;
    }

    @Override // defpackage.Wl
    public final int n(C0269im c0269im) {
        return 0;
    }

    @Override // defpackage.Wl
    public final int n0(int i, C0085cm c0085cm, C0269im c0269im) {
        if (!E0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0085cm.i(Long.MAX_VALUE, 0).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.Wl
    public final int o(C0269im c0269im) {
        return 0;
    }

    @Override // defpackage.Wl
    public final void o0(int i) {
    }

    @Override // defpackage.Wl
    public final int p0(int i, C0085cm c0085cm, C0269im c0269im) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0085cm.i(Long.MAX_VALUE, 0).a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.Wl
    public final Xl r() {
        return new Xl(-2, -2);
    }

    @Override // defpackage.Wl
    public final void y(Rect rect, View view) {
        RecyclerView.J(rect, view);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.Wl
    public final void y0(RecyclerView recyclerView, int i) {
        C0622u5 c0622u5 = new C0622u5(this, recyclerView.getContext(), 0);
        c0622u5.a = i;
        z0(c0622u5);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0653v5();
        this.r = new View.OnLayoutChangeListener() { // from class: s5
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                CarouselLayoutManager carouselLayoutManager = this.a;
                carouselLayoutManager.getClass();
                if (i3 == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
                    return;
                }
                view.post(new RunnableC0591t5(carouselLayoutManager, 0));
            }
        };
        this.p = new C0174fj();
        m0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.c);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m0();
            G0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
