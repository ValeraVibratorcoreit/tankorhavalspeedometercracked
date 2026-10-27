package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0377m7 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public C0377m7(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(C0655v7 c0655v7, C0343l4 c0343l4) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i;
        int iMakeMeasureSpec3;
        boolean z;
        int measuredWidth;
        int baseline;
        int i2;
        if (c0655v7 == null) {
            return;
        }
        if (c0655v7.g0 == 8) {
            c0343l4.e = 0;
            c0343l4.f = 0;
            c0343l4.g = 0;
            return;
        }
        if (c0655v7.T == null) {
            return;
        }
        int i3 = c0343l4.a;
        int i4 = c0343l4.b;
        int i5 = c0343l4.c;
        int i6 = c0343l4.d;
        int i7 = this.b + this.c;
        int i8 = this.d;
        View view = (View) c0655v7.f0;
        int iO = Vo.o(i3);
        C0224h7 c0224h7 = c0655v7.K;
        C0224h7 c0224h8 = c0655v7.I;
        if (iO == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iO == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
        } else if (iO == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            boolean z2 = c0655v7.r == 1;
            int i9 = c0343l4.j;
            if (i9 == 1 || i9 == 2) {
                boolean z3 = view.getMeasuredHeight() == c0655v7.k();
                if (c0343l4.j == 2 || !z2 || ((z2 && z3) || c0655v7.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0655v7.q(), 1073741824);
                }
            }
        } else if (iO != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i10 = this.f;
            int i11 = c0224h8 != null ? c0224h8.g : 0;
            if (c0224h7 != null) {
                i11 += c0224h7.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i8 + i11, -1);
        }
        int iO2 = Vo.o(i4);
        if (iO2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (iO2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
        } else if (iO2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            boolean z4 = c0655v7.s == 1;
            int i12 = c0343l4.j;
            if (i12 == 1 || i12 == 2) {
                boolean z5 = view.getMeasuredWidth() == c0655v7.q();
                if (c0343l4.j == 2 || !z4 || ((z4 && z5) || c0655v7.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0655v7.k(), 1073741824);
                }
            }
        } else if (iO2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i13 = this.g;
            int i14 = c0224h8 != null ? c0655v7.J.g : 0;
            if (c0224h7 != null) {
                i14 += c0655v7.L.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, i7 + i14, -1);
        }
        C0686w7 c0686w7 = (C0686w7) c0655v7.T;
        ConstraintLayout constraintLayout = this.h;
        if (c0686w7 != null && Tf.p(constraintLayout.i, 256) && view.getMeasuredWidth() == c0655v7.q() && view.getMeasuredWidth() < c0686w7.q() && view.getMeasuredHeight() == c0655v7.k() && view.getMeasuredHeight() < c0686w7.k() && view.getBaseline() == c0655v7.a0 && !c0655v7.z() && a(c0655v7.G, iMakeMeasureSpec, c0655v7.q()) && a(c0655v7.H, iMakeMeasureSpec2, c0655v7.k())) {
            c0343l4.e = c0655v7.q();
            c0343l4.f = c0655v7.k();
            c0343l4.g = c0655v7.a0;
            return;
        }
        boolean z6 = i3 == 3;
        boolean z7 = i4 == 3;
        boolean z8 = i4 == 4 || i4 == 1;
        boolean z9 = i3 == 4 || i3 == 1;
        boolean z10 = z6 && c0655v7.W > 0.0f;
        boolean z11 = z7 && c0655v7.W > 0.0f;
        if (view == null) {
            return;
        }
        C0346l7 c0346l7 = (C0346l7) view.getLayoutParams();
        int i15 = c0343l4.j;
        if (i15 != 1 && i15 != 2 && z6 && c0655v7.r == 0 && z7 && c0655v7.s == 0) {
            z = false;
            measuredWidth = 0;
            i2 = -1;
            baseline = 0;
            iMax = 0;
        } else {
            if ((view instanceof AbstractC0461ot) && (c0655v7 instanceof C0075cc)) {
                ((AbstractC0461ot) view).j((C0075cc) c0655v7, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c0655v7.G = iMakeMeasureSpec;
            c0655v7.H = iMakeMeasureSpec2;
            c0655v7.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i16 = c0655v7.u;
            int iMax2 = i16 > 0 ? Math.max(i16, measuredWidth2) : measuredWidth2;
            int i17 = c0655v7.v;
            if (i17 > 0) {
                iMax2 = Math.min(i17, iMax2);
            }
            int i18 = c0655v7.x;
            iMax = i18 > 0 ? Math.max(i18, measuredHeight) : measuredHeight;
            int i19 = iMakeMeasureSpec;
            int i20 = c0655v7.y;
            if (i20 > 0) {
                iMax = Math.min(i20, iMax);
            }
            if (!Tf.p(constraintLayout.i, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * c0655v7.W) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / c0655v7.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i = 1073741824;
                    iMakeMeasureSpec3 = i19;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                c0655v7.G = iMakeMeasureSpec3;
                c0655v7.H = iMakeMeasureSpec2;
                z = false;
                c0655v7.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i2 = -1;
        }
        boolean z12 = baseline != i2 ? true : z;
        if (measuredWidth != c0343l4.c || iMax != c0343l4.d) {
            z = true;
        }
        c0343l4.i = z;
        boolean z13 = c0346l7.c0 ? true : z12;
        if (z13 && baseline != -1 && c0655v7.a0 != baseline) {
            c0343l4.i = true;
        }
        c0343l4.e = measuredWidth;
        c0343l4.f = iMax;
        c0343l4.h = z13;
        c0343l4.g = baseline;
    }
}
