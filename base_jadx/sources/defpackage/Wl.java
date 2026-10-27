package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Wl {
    public K2 a;
    public RecyclerView b;
    public final C0426np c;
    public final C0426np d;
    public Pg e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public Wl() {
        Ul ul = new Ul(this, 0);
        Ul ul2 = new Ul(this, 1);
        this.c = new C0426np(ul);
        this.d = new C0426np(ul2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((Xl) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((Xl) view.getLayoutParams()).a.b();
    }

    public static Vl I(Context context, AttributeSet attributeSet, int i, int i2) {
        Vl vl = new Vl();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0576sl.a, i, i2);
        vl.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        vl.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        vl.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        vl.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return vl;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        Xl xl = (Xl) view.getLayoutParams();
        Rect rect = xl.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) xl).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) xl).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) xl).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) xl).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        Rect rect = ((Xl) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        Ol adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = Gs.a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(C0085cm c0085cm, C0269im c0269im) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.k == null || !e()) {
            return 1;
        }
        return this.b.k.a();
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((Xl) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.j;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iO = recyclerView.e.o();
            for (int i2 = 0; i2 < iO; i2++) {
                recyclerView.e.n(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iO = recyclerView.e.o();
            for (int i2 = 0; i2 < iO; i2++) {
                recyclerView.e.n(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q(RecyclerView recyclerView) {
    }

    public abstract void R(RecyclerView recyclerView);

    public abstract View S(View view, int i, C0085cm c0085cm, C0269im c0269im);

    public void T(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        C0085cm c0085cm = recyclerView.b;
        C0269im c0269im = recyclerView.c0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        Ol ol = this.b.k;
        if (ol != null) {
            accessibilityEvent.setItemCount(ol.a());
        }
    }

    public void U(C0085cm c0085cm, C0269im c0269im, View view, J j) {
        j.h(I.a(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
    }

    public final void V(View view, J j) {
        AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
        if (abstractC0361lmI == null || abstractC0361lmI.i() || ((ArrayList) this.a.d).contains(abstractC0361lmI.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        U(recyclerView.b, recyclerView.c0, view, j);
    }

    public void W(int i, int i2) {
    }

    public void X() {
    }

    public void Y(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    public final void b(View view, int i, boolean z) {
        int iB;
        AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
        if (z || abstractC0361lmI.i()) {
            Fo fo = (Fo) this.b.f.b;
            Ns nsA = (Ns) fo.getOrDefault(abstractC0361lmI, null);
            if (nsA == null) {
                nsA = Ns.a();
                fo.put(abstractC0361lmI, nsA);
            }
            nsA.a |= 1;
        } else {
            this.b.f.n(abstractC0361lmI);
        }
        Xl xl = (Xl) view.getLayoutParams();
        if (abstractC0361lmI.q() || abstractC0361lmI.j()) {
            if (abstractC0361lmI.j()) {
                abstractC0361lmI.n.j(abstractC0361lmI);
            } else {
                abstractC0361lmI.j &= -33;
            }
            this.a.e(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.b) {
                K2 k2 = this.a;
                int iIndexOfChild = ((Nl) k2.b).a.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    iB = -1;
                } else {
                    O5 o5 = (O5) k2.c;
                    if (o5.d(iIndexOfChild)) {
                        iB = -1;
                    } else {
                        iB = iIndexOfChild - o5.b(iIndexOfChild);
                    }
                }
                if (i == -1) {
                    i = this.a.o();
                }
                if (iB == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.y());
                }
                if (iB != i) {
                    Wl wl = this.b.l;
                    View viewU = wl.u(iB);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + wl.b.toString());
                    }
                    wl.u(iB);
                    wl.a.i(iB);
                    Xl xl2 = (Xl) viewU.getLayoutParams();
                    AbstractC0361lm abstractC0361lmI2 = RecyclerView.I(viewU);
                    if (abstractC0361lmI2.i()) {
                        Fo fo2 = (Fo) wl.b.f.b;
                        Ns nsA2 = (Ns) fo2.getOrDefault(abstractC0361lmI2, null);
                        if (nsA2 == null) {
                            nsA2 = Ns.a();
                            fo2.put(abstractC0361lmI2, nsA2);
                        }
                        nsA2.a = 1 | nsA2.a;
                    } else {
                        wl.b.f.n(abstractC0361lmI2);
                    }
                    wl.a.e(viewU, i, xl2, abstractC0361lmI2.i());
                }
            } else {
                this.a.d(view, i, false);
                xl.c = true;
                Pg pg = this.e;
                if (pg != null && pg.e) {
                    pg.b.getClass();
                    AbstractC0361lm abstractC0361lmI3 = RecyclerView.I(view);
                    if ((abstractC0361lmI3 != null ? abstractC0361lmI3.b() : -1) == pg.a) {
                        pg.f = view;
                    }
                }
            }
        }
        if (xl.d) {
            abstractC0361lmI.a.invalidate();
            xl.d = false;
        }
    }

    public abstract void b0(C0085cm c0085cm, C0269im c0269im);

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public abstract void c0(C0269im c0269im);

    public abstract boolean d();

    public void d0(Parcelable parcelable) {
    }

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(Xl xl) {
        return xl != null;
    }

    public void f0(int i) {
    }

    public void g0() {
        m0();
    }

    public void h(int i, int i2, C0269im c0269im, Bd bd) {
    }

    public final void h0(C0085cm c0085cm) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).p()) {
                View viewU = u(iV);
                k0(iV);
                c0085cm.f(viewU);
            }
        }
    }

    public void i(int i, Bd bd) {
    }

    public final void i0(C0085cm c0085cm) {
        ArrayList arrayList;
        int size = c0085cm.a.size();
        int i = size - 1;
        while (true) {
            arrayList = c0085cm.a;
            if (i < 0) {
                break;
            }
            View view = ((AbstractC0361lm) arrayList.get(i)).a;
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(view);
            if (!abstractC0361lmI.p()) {
                abstractC0361lmI.o(false);
                if (abstractC0361lmI.k()) {
                    this.b.removeDetachedView(view, false);
                }
                Sl sl = this.b.H;
                if (sl != null) {
                    sl.e(abstractC0361lmI);
                }
                abstractC0361lmI.o(true);
                AbstractC0361lm abstractC0361lmI2 = RecyclerView.I(view);
                abstractC0361lmI2.n = null;
                abstractC0361lmI2.o = false;
                abstractC0361lmI2.j &= -33;
                c0085cm.g(abstractC0361lmI2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0085cm.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int j(C0269im c0269im);

    public final void j0(View view, C0085cm c0085cm) {
        K2 k2 = this.a;
        Nl nl = (Nl) k2.b;
        int iIndexOfChild = nl.a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((O5) k2.c).g(iIndexOfChild)) {
                k2.O(view);
            }
            nl.h(iIndexOfChild);
        }
        c0085cm.f(view);
    }

    public abstract int k(C0269im c0269im);

    public final void k0(int i) {
        if (u(i) != null) {
            K2 k2 = this.a;
            int iX = k2.x(i);
            Nl nl = (Nl) k2.b;
            View childAt = nl.a.getChildAt(iX);
            if (childAt == null) {
                return;
            }
            if (((O5) k2.c).g(iX)) {
                k2.O(childAt);
            }
            nl.h(iX);
        }
    }

    public abstract int l(C0269im c0269im);

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    public boolean l0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iE = E();
        int iG = G();
        int iF = this.n - F();
        int iD = this.o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iE;
        int iMin = Math.min(0, i);
        int i2 = top - iG;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iF;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iD);
        if (C() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iE2 = E();
                int iG2 = G();
                int iF2 = this.n - F();
                int iD2 = this.o - D();
                Rect rect2 = this.b.h;
                y(rect2, focusedChild);
                if (rect2.left - i4 < iF2 && rect2.right - i4 > iE2 && rect2.top - i5 < iD2 && rect2.bottom - i5 > iG2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                    } else {
                        recyclerView.c0(i4, i5, false);
                    }
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.c0(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    public abstract int m(C0269im c0269im);

    public final void m0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int n(C0269im c0269im);

    public abstract int n0(int i, C0085cm c0085cm, C0269im c0269im);

    public abstract int o(C0269im c0269im);

    public abstract void o0(int i);

    public final void p(C0085cm c0085cm) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(viewU);
            if (!abstractC0361lmI.p()) {
                if (!abstractC0361lmI.g() || abstractC0361lmI.i() || this.b.k.b) {
                    u(iV);
                    this.a.i(iV);
                    c0085cm.h(viewU);
                    this.b.f.n(abstractC0361lmI);
                } else {
                    k0(iV);
                    c0085cm.g(abstractC0361lmI);
                }
            }
        }
    }

    public abstract int p0(int i, C0085cm c0085cm, C0269im c0269im);

    public View q(int i) {
        int iV = v();
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            AbstractC0361lm abstractC0361lmI = RecyclerView.I(viewU);
            if (abstractC0361lmI != null && abstractC0361lmI.b() == i && !abstractC0361lmI.p() && (this.b.c0.g || !abstractC0361lmI.i())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract Xl r();

    public final void r0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.s0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.s0;
        }
    }

    public Xl s(Context context, AttributeSet attributeSet) {
        return new Xl(context, attributeSet);
    }

    public void s0(Rect rect, int i, int i2) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = Gs.a;
        this.b.setMeasuredDimension(g(i, iF, recyclerView.getMinimumWidth()), g(i2, iD, this.b.getMinimumHeight()));
    }

    public Xl t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof Xl) {
            return new Xl((Xl) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new Xl((ViewGroup.MarginLayoutParams) layoutParams) : new Xl(layoutParams);
    }

    public final void t0(int i, int i2) {
        int iV = v();
        if (iV == 0) {
            this.b.n(i, i2);
            return;
        }
        int i3 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            Rect rect = this.b.h;
            y(rect, viewU);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.h.set(i6, i4, i3, i5);
        s0(this.b.h, i, i2);
    }

    public final View u(int i) {
        K2 k2 = this.a;
        if (k2 != null) {
            return k2.n(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.e;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final int v() {
        K2 k2 = this.a;
        if (k2 != null) {
            return k2.o();
        }
        return 0;
    }

    public final boolean v0(View view, int i, int i2, Xl xl) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) xl).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) xl).height)) ? false : true;
    }

    public boolean w0() {
        return false;
    }

    public int x(C0085cm c0085cm, C0269im c0269im) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.k == null || !d()) {
            return 1;
        }
        return this.b.k.a();
    }

    public final boolean x0(View view, int i, int i2, Xl xl) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) xl).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) xl).height)) ? false : true;
    }

    public void y(Rect rect, View view) {
        RecyclerView.J(rect, view);
    }

    public abstract void y0(RecyclerView recyclerView, int i);

    public final void z0(Pg pg) {
        Pg pg2 = this.e;
        if (pg2 != null && pg != pg2 && pg2.e) {
            pg2.i();
        }
        this.e = pg;
        RecyclerView recyclerView = this.b;
        RunnableC0330km runnableC0330km = recyclerView.W;
        runnableC0330km.g.removeCallbacks(runnableC0330km);
        runnableC0330km.c.abortAnimation();
        if (pg.h) {
            Log.w("RecyclerView", "An instance of " + pg.getClass().getSimpleName() + " was started more than once. Each instance of" + pg.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        pg.b = recyclerView;
        pg.c = this;
        int i = pg.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.c0.a = i;
        pg.e = true;
        pg.d = true;
        pg.f = recyclerView.l.q(i);
        pg.b.W.a();
        pg.h = true;
    }
}
