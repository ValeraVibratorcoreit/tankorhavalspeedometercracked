package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.Bd;
import defpackage.C0077ce;
import defpackage.C0085cm;
import defpackage.C0096d2;
import defpackage.C0269im;
import defpackage.Gs;
import defpackage.I;
import defpackage.J;
import defpackage.Lg;
import defpackage.Mg;
import defpackage.Ng;
import defpackage.Vo;
import defpackage.Wl;
import defpackage.Xl;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final C0096d2 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new C0096d2(19);
        this.L = new Rect();
        m1(Wl.I(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final boolean A0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(C0269im c0269im, Ng ng, Bd bd) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = ng.d) >= 0 && i < c0269im.b() && i2 > 0; i3++) {
            bd.a(ng.d, Math.max(0, ng.g));
            this.K.getClass();
            i2--;
            ng.d += ng.e;
        }
    }

    @Override // defpackage.Wl
    public final int J(C0085cm c0085cm, C0269im c0269im) {
        if (this.p == 0) {
            return this.F;
        }
        if (c0269im.b() < 1) {
            return 0;
        }
        return i1(c0269im.b() - 1, c0085cm, c0269im) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View O0(C0085cm c0085cm, C0269im c0269im, int i, int i2, int i3) {
        H0();
        int iK = this.r.k();
        int iG = this.r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewU = u(i);
            int iH = Wl.H(viewU);
            if (iH >= 0 && iH < i3 && j1(iH, c0085cm, c0269im) == 0) {
                if (((Xl) viewU.getLayoutParams()).a.i()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0126  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r23, int r24, defpackage.C0085cm r25, defpackage.C0269im r26) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, cm, im):android.view.View");
    }

    @Override // defpackage.Wl
    public final void U(C0085cm c0085cm, C0269im c0269im, View view, J j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0077ce)) {
            V(view, j);
            return;
        }
        C0077ce c0077ce = (C0077ce) layoutParams;
        int iI1 = i1(c0077ce.a.b(), c0085cm, c0269im);
        if (this.p == 0) {
            j.h(I.a(false, c0077ce.e, c0077ce.f, iI1, 1));
        } else {
            j.h(I.a(false, iI1, 1, c0077ce.e, c0077ce.f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(C0085cm c0085cm, C0269im c0269im, Ng ng, Mg mg) {
        int i;
        int i2;
        int i3;
        int iD;
        int iE;
        int iD2;
        int i4;
        int iW;
        int iW2;
        ?? r8;
        int i5;
        View viewB;
        int iJ = this.r.j();
        boolean z = iJ != 1073741824;
        int i6 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            n1();
        }
        boolean z2 = ng.e == 1;
        int iJ1 = this.F;
        if (!z2) {
            iJ1 = j1(ng.d, c0085cm, c0269im) + k1(ng.d, c0085cm, c0269im);
        }
        int i7 = 0;
        while (i7 < this.F && (i5 = ng.d) >= 0 && i5 < c0269im.b() && iJ1 > 0) {
            int i8 = ng.d;
            int iK1 = k1(i8, c0085cm, c0269im);
            if (iK1 > this.F) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iK1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            iJ1 -= iK1;
            if (iJ1 < 0 || (viewB = ng.b(c0085cm)) == null) {
                break;
            }
            this.H[i7] = viewB;
            i7++;
        }
        if (i7 == 0) {
            mg.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = this.H[i];
            C0077ce c0077ce = (C0077ce) view.getLayoutParams();
            int iK2 = k1(Wl.H(view), c0085cm, c0269im);
            c0077ce.f = iK2;
            c0077ce.e = i9;
            i9 += iK2;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.H[i11];
            if (ng.k != null) {
                r8 = 0;
                r8 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.K(view2));
            }
            l1(view2, iJ, r8);
            int iC = this.r.c(view2);
            if (iC > i10) {
                i10 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((C0077ce) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z) {
            f1(Math.max(Math.round(f * this.F), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.H[i12];
                l1(view3, 1073741824, true);
                int iC2 = this.r.c(view3);
                if (iC2 > i10) {
                    i10 = iC2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.H[i13];
            if (this.r.c(view4) != i10) {
                C0077ce c0077ce2 = (C0077ce) view4.getLayoutParams();
                Rect rect2 = c0077ce2.b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0077ce2).topMargin + ((ViewGroup.MarginLayoutParams) c0077ce2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0077ce2).leftMargin + ((ViewGroup.MarginLayoutParams) c0077ce2).rightMargin;
                int iH1 = h1(c0077ce2.e, c0077ce2.f);
                if (this.p == 1) {
                    iW2 = Wl.w(false, iH1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c0077ce2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iW = Wl.w(false, iH1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c0077ce2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (x0(view4, iW2, iW, (Xl) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        mg.a = i10;
        if (this.p != 1) {
            if (ng.f == -1) {
                int i16 = ng.b;
                iE = i16 - i10;
                iD = i16;
            } else {
                int i17 = ng.b;
                iD = i17 + i10;
                iE = i17;
            }
            iD2 = 0;
            i4 = 0;
        } else if (ng.f == -1) {
            int i18 = ng.b;
            iE = 0;
            iD = 0;
            i4 = i18 - i10;
            iD2 = i18;
        } else {
            i4 = ng.b;
            iD2 = i4 + i10;
            iE = 0;
            iD = 0;
        }
        for (int i19 = 0; i19 < i7; i19++) {
            View view5 = this.H[i19];
            C0077ce c0077ce3 = (C0077ce) view5.getLayoutParams();
            if (this.p != 1) {
                int iG = G() + this.G[c0077ce3.e];
                i4 = iG;
                iD2 = this.r.d(view5) + iG;
            } else if (T0()) {
                int iE2 = E() + this.G[this.F - c0077ce3.e];
                iD = iE2;
                iE = iE2 - this.r.d(view5);
            } else {
                iE = E() + this.G[c0077ce3.e];
                iD = this.r.d(view5) + iE;
            }
            Wl.N(view5, iE, i4, iD, iD2);
            if (c0077ce3.a.i() || c0077ce3.a.l()) {
                mg.c = true;
            }
            mg.d = view5.hasFocusable() | mg.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(C0085cm c0085cm, C0269im c0269im, Lg lg, int i) {
        n1();
        if (c0269im.b() > 0 && !c0269im.g) {
            boolean z = i == 1;
            int iJ1 = j1(lg.b, c0085cm, c0269im);
            if (z) {
                while (iJ1 > 0) {
                    int i2 = lg.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    lg.b = i3;
                    iJ1 = j1(i3, c0085cm, c0269im);
                }
            } else {
                int iB = c0269im.b() - 1;
                int i4 = lg.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iJ2 = j1(i5, c0085cm, c0269im);
                    if (iJ2 <= iJ1) {
                        break;
                    }
                    i4 = i5;
                    iJ1 = iJ2;
                }
                lg.b = i4;
            }
        }
        g1();
    }

    @Override // defpackage.Wl
    public final void W(int i, int i2) {
        C0096d2 c0096d2 = this.K;
        c0096d2.N();
        ((SparseIntArray) c0096d2.c).clear();
    }

    @Override // defpackage.Wl
    public final void X() {
        C0096d2 c0096d2 = this.K;
        c0096d2.N();
        ((SparseIntArray) c0096d2.c).clear();
    }

    @Override // defpackage.Wl
    public final void Y(int i, int i2) {
        C0096d2 c0096d2 = this.K;
        c0096d2.N();
        ((SparseIntArray) c0096d2.c).clear();
    }

    @Override // defpackage.Wl
    public final void Z(int i, int i2) {
        C0096d2 c0096d2 = this.K;
        c0096d2.N();
        ((SparseIntArray) c0096d2.c).clear();
    }

    @Override // defpackage.Wl
    public final void a0(int i, int i2) {
        C0096d2 c0096d2 = this.K;
        c0096d2.N();
        ((SparseIntArray) c0096d2.c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final void b0(C0085cm c0085cm, C0269im c0269im) {
        boolean z = c0269im.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                C0077ce c0077ce = (C0077ce) u(i).getLayoutParams();
                int iB = c0077ce.a.b();
                sparseIntArray2.put(iB, c0077ce.f);
                sparseIntArray.put(iB, c0077ce.e);
            }
        }
        super.b0(c0085cm, c0269im);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.b1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final void c0(C0269im c0269im) {
        super.c0(c0269im);
        this.E = false;
    }

    @Override // defpackage.Wl
    public final boolean f(Xl xl) {
        return xl instanceof C0077ce;
    }

    public final void f1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final void g1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int h1(int i, int i2) {
        if (this.p != 1 || !T0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int i1(int i, C0085cm c0085cm, C0269im c0269im) {
        boolean z = c0269im.g;
        C0096d2 c0096d2 = this.K;
        if (!z) {
            int i2 = this.F;
            c0096d2.getClass();
            return C0096d2.M(i, i2);
        }
        int iB = c0085cm.b(i);
        if (iB != -1) {
            int i3 = this.F;
            c0096d2.getClass();
            return C0096d2.M(iB, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int j1(int i, C0085cm c0085cm, C0269im c0269im) {
        boolean z = c0269im.g;
        C0096d2 c0096d2 = this.K;
        if (!z) {
            int i2 = this.F;
            c0096d2.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = c0085cm.b(i);
        if (iB != -1) {
            int i4 = this.F;
            c0096d2.getClass();
            return iB % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final int k(C0269im c0269im) {
        return E0(c0269im);
    }

    public final int k1(int i, C0085cm c0085cm, C0269im c0269im) {
        boolean z = c0269im.g;
        C0096d2 c0096d2 = this.K;
        if (!z) {
            c0096d2.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0085cm.b(i) != -1) {
            c0096d2.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final int l(C0269im c0269im) {
        return F0(c0269im);
    }

    public final void l1(View view, int i, boolean z) {
        int iW;
        int iW2;
        C0077ce c0077ce = (C0077ce) view.getLayoutParams();
        Rect rect = c0077ce.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0077ce).topMargin + ((ViewGroup.MarginLayoutParams) c0077ce).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0077ce).leftMargin + ((ViewGroup.MarginLayoutParams) c0077ce).rightMargin;
        int iH1 = h1(c0077ce.e, c0077ce.f);
        if (this.p == 1) {
            iW2 = Wl.w(false, iH1, i, i3, ((ViewGroup.MarginLayoutParams) c0077ce).width);
            iW = Wl.w(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) c0077ce).height);
        } else {
            int iW3 = Wl.w(false, iH1, i, i2, ((ViewGroup.MarginLayoutParams) c0077ce).height);
            int iW4 = Wl.w(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) c0077ce).width);
            iW = iW3;
            iW2 = iW4;
        }
        Xl xl = (Xl) view.getLayoutParams();
        if (z ? x0(view, iW2, iW, xl) : v0(view, iW2, iW, xl)) {
            view.measure(iW2, iW);
        }
    }

    public final void m1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(Vo.e(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.N();
        m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final int n(C0269im c0269im) {
        return E0(c0269im);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final int n0(int i, C0085cm c0085cm, C0269im c0269im) {
        n1();
        g1();
        return super.n0(i, c0085cm, c0269im);
    }

    public final void n1() {
        int iD;
        int iG;
        if (this.p == 1) {
            iD = this.n - F();
            iG = E();
        } else {
            iD = this.o - D();
            iG = G();
        }
        f1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final int o(C0269im c0269im) {
        return F0(c0269im);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final int p0(int i, C0085cm c0085cm, C0269im c0269im) {
        n1();
        g1();
        return super.p0(i, c0085cm, c0269im);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.Wl
    public final Xl r() {
        return this.p == 0 ? new C0077ce(-2, -1) : new C0077ce(-1, -2);
    }

    @Override // defpackage.Wl
    public final Xl s(Context context, AttributeSet attributeSet) {
        C0077ce c0077ce = new C0077ce(context, attributeSet);
        c0077ce.e = -1;
        c0077ce.f = 0;
        return c0077ce;
    }

    @Override // defpackage.Wl
    public final void s0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.s0(rect, i, i2);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = Gs.a;
            iG2 = Wl.g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iG = Wl.g(i, iArr[iArr.length - 1] + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = Gs.a;
            iG = Wl.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iG2 = Wl.g(i2, iArr2[iArr2.length - 1] + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.Wl
    public final Xl t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0077ce c0077ce = new C0077ce((ViewGroup.MarginLayoutParams) layoutParams);
            c0077ce.e = -1;
            c0077ce.f = 0;
            return c0077ce;
        }
        C0077ce c0077ce2 = new C0077ce(layoutParams);
        c0077ce2.e = -1;
        c0077ce2.f = 0;
        return c0077ce2;
    }

    @Override // defpackage.Wl
    public final int x(C0085cm c0085cm, C0269im c0269im) {
        if (this.p == 1) {
            return this.F;
        }
        if (c0269im.b() < 1) {
            return 0;
        }
        return i1(c0269im.b() - 1, c0085cm, c0269im) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new C0096d2(19);
        this.L = new Rect();
        m1(i);
    }
}
