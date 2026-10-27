package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.jcraft.jsch.SftpATTRS;
import defpackage.AbstractC0090cr;
import defpackage.AbstractC0258ia;
import defpackage.AbstractC0299jm;
import defpackage.AbstractC0361lm;
import defpackage.AbstractC0576sl;
import defpackage.AbstractC0658va;
import defpackage.AbstractC0676vs;
import defpackage.AbstractC0769ys;
import defpackage.Bd;
import defpackage.Bj;
import defpackage.C0023am;
import defpackage.C0054bm;
import defpackage.C0085cm;
import defpackage.C0146em;
import defpackage.C0177fm;
import defpackage.C0269im;
import defpackage.C0423nm;
import defpackage.C0426np;
import defpackage.C0511qh;
import defpackage.C0622u5;
import defpackage.C0668vk;
import defpackage.Dd;
import defpackage.E8;
import defpackage.Ej;
import defpackage.Fo;
import defpackage.G0;
import defpackage.Gs;
import defpackage.H0;
import defpackage.Hs;
import defpackage.InterfaceC0116dm;
import defpackage.InterfaceC0239hm;
import defpackage.K2;
import defpackage.Ml;
import defpackage.Nl;
import defpackage.Ns;
import defpackage.O5;
import defpackage.Ol;
import defpackage.Pg;
import defpackage.Qb;
import defpackage.Ql;
import defpackage.Rl;
import defpackage.RunnableC0330km;
import defpackage.RunnableC0524r0;
import defpackage.Sl;
import defpackage.Tl;
import defpackage.Wl;
import defpackage.Xl;
import defpackage.Yl;
import defpackage.Zl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] s0 = {R.attr.nestedScrollingEnabled};
    public static final Class[] t0;
    public static final Ml u0;
    public int A;
    public int B;
    public Rl C;
    public EdgeEffect D;
    public EdgeEffect E;
    public EdgeEffect F;
    public EdgeEffect G;
    public Sl H;
    public int I;
    public int J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public Yl Q;
    public final int R;
    public final int S;
    public final float T;
    public final float U;
    public boolean V;
    public final RunnableC0330km W;
    public final C0146em a;
    public Dd a0;
    public final C0085cm b;
    public final Bd b0;
    public C0177fm c;
    public final C0269im c0;
    public final H0 d;
    public Zl d0;
    public final K2 e;
    public ArrayList e0;
    public final C0426np f;
    public boolean f0;
    public boolean g;
    public boolean g0;
    public final Rect h;
    public final Nl h0;
    public final Rect i;
    public boolean i0;
    public final RectF j;
    public C0423nm j0;
    public Ol k;
    public final int[] k0;
    public Wl l;
    public Bj l0;
    public final ArrayList m;
    public final int[] m0;
    public final ArrayList n;
    public final int[] n0;
    public Qb o;
    public final int[] o0;
    public boolean p;
    public final ArrayList p0;
    public boolean q;
    public final RunnableC0524r0 q0;
    public boolean r;
    public final Nl r0;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final AccessibilityManager x;
    public boolean y;
    public boolean z;

    static {
        Class cls = Integer.TYPE;
        t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        u0 = new Ml(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    public static AbstractC0361lm I(View view) {
        if (view == null) {
            return null;
        }
        return ((Xl) view.getLayoutParams()).a;
    }

    public static void J(Rect rect, View view) {
        Xl xl = (Xl) view.getLayoutParams();
        Rect rect2 = xl.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) xl).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) xl).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) xl).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) xl).bottomMargin);
    }

    private Bj getScrollingChildHelper() {
        if (this.l0 == null) {
            this.l0 = new Bj(this);
        }
        return this.l0;
    }

    public static void j(AbstractC0361lm abstractC0361lm) {
        WeakReference weakReference = abstractC0361lm.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0361lm.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0361lm.b = null;
        }
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    public final boolean B(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Qb qb = (Qb) arrayList.get(i);
            int i2 = qb.v;
            if (i2 == 1) {
                boolean zE = qb.e(motionEvent.getX(), motionEvent.getY());
                boolean zD = qb.d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zE || zD)) {
                    if (zD) {
                        qb.w = 1;
                        qb.p = (int) motionEvent.getX();
                    } else if (zE) {
                        qb.w = 2;
                        qb.m = (int) motionEvent.getY();
                    }
                    qb.g(2);
                    z = true;
                } else {
                    z = false;
                }
            } else if (i2 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z && action != 3) {
                this.o = qb;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int iO = this.e.o();
        if (iO == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        for (int i3 = 0; i3 < iO; i3++) {
            AbstractC0361lm abstractC0361lmI = I(this.e.n(i3));
            if (!abstractC0361lmI.p()) {
                int iB = abstractC0361lmI.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i2) {
                    i2 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final AbstractC0361lm E(int i) {
        AbstractC0361lm abstractC0361lm = null;
        if (this.y) {
            return null;
        }
        int iA = this.e.A();
        for (int i2 = 0; i2 < iA; i2++) {
            AbstractC0361lm abstractC0361lmI = I(this.e.z(i2));
            if (abstractC0361lmI != null && !abstractC0361lmI.i() && F(abstractC0361lmI) == i) {
                if (!this.e.E(abstractC0361lmI.a)) {
                    return abstractC0361lmI;
                }
                abstractC0361lm = abstractC0361lmI;
            }
        }
        return abstractC0361lm;
    }

    public final int F(AbstractC0361lm abstractC0361lm) {
        if (abstractC0361lm.d(524) || !abstractC0361lm.f()) {
            return -1;
        }
        H0 h0 = this.d;
        int i = abstractC0361lm.c;
        ArrayList arrayList = (ArrayList) h0.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            G0 g0 = (G0) arrayList.get(i2);
            int i3 = g0.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = g0.b;
                    if (i4 <= i) {
                        int i5 = g0.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = g0.b;
                    if (i6 == i) {
                        i = g0.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (g0.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (g0.b <= i) {
                i += g0.d;
            }
        }
        return i;
    }

    public final long G(AbstractC0361lm abstractC0361lm) {
        return this.k.b ? abstractC0361lm.e : abstractC0361lm.c;
    }

    public final AbstractC0361lm H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect K(View view) {
        Xl xl = (Xl) view.getLayoutParams();
        boolean z = xl.c;
        Rect rect = xl.b;
        if (!z) {
            return rect;
        }
        if (this.c0.g && (xl.a.l() || xl.a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.h;
            rect2.set(0, 0, 0, 0);
            ((Tl) arrayList.get(i)).a(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        xl.c = false;
        return rect;
    }

    public final boolean L() {
        return !this.r || this.y || this.d.h();
    }

    public final boolean M() {
        return this.A > 0;
    }

    public final void N(int i) {
        if (this.l == null) {
            return;
        }
        setScrollState(2);
        this.l.o0(i);
        awakenScrollBars();
    }

    public final void O() {
        int iA = this.e.A();
        for (int i = 0; i < iA; i++) {
            ((Xl) this.e.z(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.b.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Xl xl = (Xl) ((AbstractC0361lm) arrayList.get(i2)).a.getLayoutParams();
            if (xl != null) {
                xl.c = true;
            }
        }
    }

    public final void P(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iA = this.e.A();
        for (int i4 = 0; i4 < iA; i4++) {
            AbstractC0361lm abstractC0361lmI = I(this.e.z(i4));
            if (abstractC0361lmI != null && !abstractC0361lmI.p()) {
                int i5 = abstractC0361lmI.c;
                C0269im c0269im = this.c0;
                if (i5 >= i3) {
                    abstractC0361lmI.m(-i2, z);
                    c0269im.f = true;
                } else if (i5 >= i) {
                    abstractC0361lmI.a(8);
                    abstractC0361lmI.m(-i2, z);
                    abstractC0361lmI.c = i - 1;
                    c0269im.f = true;
                }
            }
        }
        C0085cm c0085cm = this.b;
        ArrayList arrayList = c0085cm.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList.get(size);
            if (abstractC0361lm != null) {
                int i6 = abstractC0361lm.c;
                if (i6 >= i3) {
                    abstractC0361lm.m(-i2, z);
                } else if (i6 >= i) {
                    abstractC0361lm.a(8);
                    c0085cm.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void Q() {
        this.A++;
    }

    public final void R(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A - 1;
        this.A = i2;
        if (i2 < 1) {
            this.A = 0;
            if (z) {
                int i3 = this.w;
                this.w = 0;
                if (i3 != 0 && (accessibilityManager = this.x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList.get(size);
                    if (abstractC0361lm.a.getParent() == this && !abstractC0361lm.p() && (i = abstractC0361lm.q) != -1) {
                        WeakHashMap weakHashMap = Gs.a;
                        abstractC0361lm.a.setImportantForAccessibility(i);
                        abstractC0361lm.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void S(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.J = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.N = x;
            this.L = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.O = y;
            this.M = y;
        }
    }

    public final void T() {
        if (this.i0 || !this.p) {
            return;
        }
        WeakHashMap weakHashMap = Gs.a;
        postOnAnimation(this.q0);
        this.i0 = true;
    }

    public final void U() {
        boolean z;
        if (this.y) {
            H0 h0 = this.d;
            h0.o((ArrayList) h0.c);
            h0.o((ArrayList) h0.d);
            if (this.z) {
                this.l.X();
            }
        }
        if (this.H == null || !this.l.A0()) {
            this.d.d();
        } else {
            this.d.m();
        }
        boolean z2 = this.f0 || this.g0;
        boolean z3 = this.r && this.H != null && ((z = this.y) || z2 || this.l.f) && (!z || this.k.b);
        C0269im c0269im = this.c0;
        c0269im.j = z3;
        c0269im.k = z3 && z2 && !this.y && this.H != null && this.l.A0();
    }

    public final void V(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int iA = this.e.A();
        for (int i = 0; i < iA; i++) {
            AbstractC0361lm abstractC0361lmI = I(this.e.z(i));
            if (abstractC0361lmI != null && !abstractC0361lmI.p()) {
                abstractC0361lmI.a(6);
            }
        }
        O();
        C0085cm c0085cm = this.b;
        ArrayList arrayList = c0085cm.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList.get(i2);
            if (abstractC0361lm != null) {
                abstractC0361lm.a(6);
                abstractC0361lm.a(1024);
            }
        }
        Ol ol = c0085cm.h.k;
        if (ol == null || !ol.b) {
            c0085cm.d();
        }
    }

    public final void W(AbstractC0361lm abstractC0361lm, Ej ej) {
        abstractC0361lm.j &= -8193;
        boolean z = this.c0.h;
        C0426np c0426np = this.f;
        if (z && abstractC0361lm.l() && !abstractC0361lm.i() && !abstractC0361lm.p()) {
            ((C0511qh) c0426np.c).e(G(abstractC0361lm), abstractC0361lm);
        }
        Fo fo = (Fo) c0426np.b;
        Ns nsA = (Ns) fo.getOrDefault(abstractC0361lm, null);
        if (nsA == null) {
            nsA = Ns.a();
            fo.put(abstractC0361lm, nsA);
        }
        nsA.b = ej;
        nsA.a |= 4;
    }

    public final void X(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof Xl) {
            Xl xl = (Xl) layoutParams;
            if (!xl.c) {
                int i = rect.left;
                Rect rect2 = xl.b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.l.l0(this, view, this.h, !this.r, view2 == null);
    }

    public final void Y() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        f0(0);
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.G.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = Gs.a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:36:0x0106 A[DONT_INVERT, PHI: r4
      0x0106: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:34:0x00ed, B:32:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    public final boolean Z(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        m();
        Ol ol = this.k;
        int[] iArr = this.o0;
        if (ol != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            a0(i, i2, iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i3 = i7;
            i4 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.m.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i3, i4, i5, i6, this.m0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z2 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.N;
        int[] iArr2 = this.m0;
        int i14 = iArr2[0];
        this.N = i13 - i14;
        int i15 = this.O;
        int i16 = iArr2[1];
        this.O = i15 - i16;
        int[] iArr3 = this.n0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f = i10;
                float y = motionEvent.getY();
                float f2 = i12;
                if (f < 0.0f) {
                    v();
                    AbstractC0258ia.a(this.D, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    if (f > 0.0f) {
                        w();
                        AbstractC0258ia.a(this.F, f / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f2 < 0.0f) {
                        x();
                        AbstractC0258ia.a(this.E, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        u();
                        AbstractC0258ia.a(this.G, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z || f != 0.0f || f2 != 0.0f) {
                        WeakHashMap weakHashMap = Gs.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (z) {
                        WeakHashMap weakHashMap2 = Gs.a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = Gs.a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f2 < 0.0f) {
                    x();
                    AbstractC0258ia.a(this.E, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    u();
                    AbstractC0258ia.a(this.G, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z) {
                    WeakHashMap weakHashMap4 = Gs.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = Gs.a;
                    postInvalidateOnAnimation();
                }
                z = true;
                if (z) {
                    WeakHashMap weakHashMap6 = Gs.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = Gs.a;
                    postInvalidateOnAnimation();
                }
            }
            l(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            t(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i3 == 0 && i4 == 0) ? false : true;
    }

    public final void a0(int i, int i2, int[] iArr) {
        AbstractC0361lm abstractC0361lm;
        K2 k2 = this.e;
        d0();
        Q();
        int i3 = AbstractC0090cr.a;
        Trace.beginSection("RV Scroll");
        C0269im c0269im = this.c0;
        z(c0269im);
        C0085cm c0085cm = this.b;
        int iN0 = i != 0 ? this.l.n0(i, c0085cm, c0269im) : 0;
        int iP0 = i2 != 0 ? this.l.p0(i2, c0085cm, c0269im) : 0;
        Trace.endSection();
        int iO = k2.o();
        for (int i4 = 0; i4 < iO; i4++) {
            View viewN = k2.n(i4);
            AbstractC0361lm abstractC0361lmH = H(viewN);
            if (abstractC0361lmH != null && (abstractC0361lm = abstractC0361lmH.i) != null) {
                int left = viewN.getLeft();
                int top = viewN.getTop();
                View view = abstractC0361lm.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        e0(false);
        if (iArr != null) {
            iArr[0] = iN0;
            iArr[1] = iP0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        Wl wl = this.l;
        if (wl != null) {
            wl.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(int i) {
        Pg pg;
        if (this.u) {
            return;
        }
        setScrollState(0);
        RunnableC0330km runnableC0330km = this.W;
        runnableC0330km.g.removeCallbacks(runnableC0330km);
        runnableC0330km.c.abortAnimation();
        Wl wl = this.l;
        if (wl != null && (pg = wl.e) != null) {
            pg.i();
        }
        Wl wl2 = this.l;
        if (wl2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            wl2.o0(i);
            awakenScrollBars();
        }
    }

    public final void c0(int i, int i2, boolean z) {
        Wl wl = this.l;
        if (wl == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.u) {
            return;
        }
        if (!wl.d()) {
            i = 0;
        }
        if (!this.l.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().h(i3, 1);
        }
        this.W.b(i, i2, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof Xl) && this.l.f((Xl) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        Wl wl = this.l;
        if (wl != null && wl.d()) {
            return this.l.j(this.c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        Wl wl = this.l;
        if (wl != null && wl.d()) {
            return this.l.k(this.c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        Wl wl = this.l;
        if (wl != null && wl.d()) {
            return this.l.l(this.c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        Wl wl = this.l;
        if (wl != null && wl.e()) {
            return this.l.m(this.c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        Wl wl = this.l;
        if (wl != null && wl.e()) {
            return this.l.n(this.c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        Wl wl = this.l;
        if (wl != null && wl.e()) {
            return this.l.o(this.c0);
        }
        return 0;
    }

    public final void d0() {
        int i = this.s + 1;
        this.s = i;
        if (i != 1 || this.u) {
            return;
        }
        this.t = false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((Tl) arrayList.get(i)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.D;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.E;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.F;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.H == null || arrayList.size() <= 0 || !this.H.g()) ? z : true) {
            WeakHashMap weakHashMap = Gs.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(boolean z) {
        if (this.s < 1) {
            this.s = 1;
        }
        if (!z && !this.u) {
            this.t = false;
        }
        if (this.s == 1) {
            if (z && this.t && !this.u && this.l != null && this.k != null) {
                o();
            }
            if (!this.u) {
                this.t = false;
            }
        }
        this.s--;
    }

    public final void f(AbstractC0361lm abstractC0361lm) {
        View view = abstractC0361lm.a;
        boolean z = view.getParent() == this;
        this.b.j(H(view));
        if (abstractC0361lm.k()) {
            this.e.e(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.e.d(view, -1, true);
            return;
        }
        K2 k2 = this.e;
        int iIndexOfChild = ((Nl) k2.b).a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((O5) k2.c).i(iIndexOfChild);
            k2.D(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(int i) {
        getScrollingChildHelper().i(i);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0195  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewS;
        int i2;
        byte b;
        boolean z;
        this.l.getClass();
        boolean z2 = true;
        boolean z3 = (this.k == null || this.l == null || M() || this.u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C0269im c0269im = this.c0;
        C0085cm c0085cm = this.b;
        if (z3 && (i == 2 || i == 1)) {
            if (this.l.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.l.d()) {
                z = focusFinder.findNextFocus(this, view, (this.l.C() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                m();
                if (A(view) == null) {
                    return null;
                }
                d0();
                this.l.S(view, i, c0085cm, c0269im);
                e0(false);
            }
            viewS = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z3) {
                m();
                if (A(view) == null) {
                    return null;
                }
                d0();
                viewS = this.l.S(view, i, c0085cm, c0269im);
                e0(false);
            } else {
                viewS = viewFindNextFocus;
            }
        }
        if (viewS != null && !viewS.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            X(viewS, null);
            return view;
        }
        if (viewS == null || viewS == this) {
            z2 = false;
        } else if (A(viewS) == null) {
            z2 = false;
        } else if (view != null && A(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.h;
            rect.set(0, 0, width, height);
            int width2 = viewS.getWidth();
            int height2 = viewS.getHeight();
            Rect rect2 = this.i;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewS, rect2);
            int i3 = this.l.C() == 1 ? -1 : 1;
            int i4 = rect.left;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i + y());
                                }
                                if (b <= 0) {
                                    z2 = false;
                                }
                            } else if (i2 <= 0) {
                                z2 = false;
                            }
                        } else if (b >= 0) {
                            z2 = false;
                        }
                    } else if (i2 >= 0) {
                        z2 = false;
                    }
                } else if (b <= 0 && (b != 0 || i2 * i3 < 0)) {
                    z2 = false;
                }
            } else if (b >= 0 && (b != 0 || i2 * i3 > 0)) {
                z2 = false;
            }
        }
        return z2 ? viewS : super.focusSearch(view, i);
    }

    public final void g(Tl tl) {
        Wl wl = this.l;
        if (wl != null) {
            wl.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(tl);
        O();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Wl wl = this.l;
        if (wl != null) {
            return wl.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Wl wl = this.l;
        if (wl != null) {
            return wl.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Ol getAdapter() {
        return this.k;
    }

    @Override // android.view.View
    public int getBaseline() {
        Wl wl = this.l;
        if (wl == null) {
            return super.getBaseline();
        }
        wl.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.g;
    }

    public C0423nm getCompatAccessibilityDelegate() {
        return this.j0;
    }

    public Rl getEdgeEffectFactory() {
        return this.C;
    }

    public Sl getItemAnimator() {
        return this.H;
    }

    public int getItemDecorationCount() {
        return this.m.size();
    }

    public Wl getLayoutManager() {
        return this.l;
    }

    public int getMaxFlingVelocity() {
        return this.S;
    }

    public int getMinFlingVelocity() {
        return this.R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public Yl getOnFlingListener() {
        return this.Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.V;
    }

    public C0054bm getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.I;
    }

    public final void h(Zl zl) {
        if (this.e0 == null) {
            this.e0 = new ArrayList();
        }
        this.e0.add(zl);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (M()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int iA = this.e.A();
        for (int i = 0; i < iA; i++) {
            AbstractC0361lm abstractC0361lmI = I(this.e.z(i));
            if (!abstractC0361lmI.p()) {
                abstractC0361lmI.d = -1;
                abstractC0361lmI.g = -1;
            }
        }
        C0085cm c0085cm = this.b;
        ArrayList arrayList = c0085cm.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0361lm abstractC0361lm = (AbstractC0361lm) arrayList.get(i2);
            abstractC0361lm.d = -1;
            abstractC0361lm.g = -1;
        }
        ArrayList arrayList2 = c0085cm.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0361lm abstractC0361lm2 = (AbstractC0361lm) arrayList2.get(i3);
            abstractC0361lm2.d = -1;
            abstractC0361lm2.g = -1;
        }
        ArrayList arrayList3 = c0085cm.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC0361lm abstractC0361lm3 = (AbstractC0361lm) c0085cm.b.get(i4);
                abstractC0361lm3.d = -1;
                abstractC0361lm3.g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.D.onRelease();
            zIsFinished = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.F.onRelease();
            zIsFinished |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.E.onRelease();
            zIsFinished |= this.E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.G.onRelease();
            zIsFinished |= this.G.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = Gs.a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        H0 h0 = this.d;
        if (!this.r || this.y) {
            int i = AbstractC0090cr.a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (h0.h()) {
            h0.getClass();
            if (h0.h()) {
                int i2 = AbstractC0090cr.a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = Gs.a;
        setMeasuredDimension(Wl.g(i, paddingRight, getMinimumWidth()), Wl.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0327  */
    /* JADX WARN: Code duplicated, block: B:174:0x036d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0370  */
    /* JADX WARN: Code duplicated, block: B:182:0x0387  */
    /* JADX WARN: Code duplicated, block: B:184:0x038f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0394  */
    /* JADX WARN: Code duplicated, block: B:190:0x039c  */
    /* JADX WARN: Code duplicated, block: B:193:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:196:0x03ad A[LOOP:4: B:189:0x039a->B:196:0x03ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:202:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c8 A[LOOP:5: B:198:0x03b6->B:205:0x03c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x03cb A[EDGE_INSN: B:241:0x03cb->B:206:0x03cb BREAK  A[LOOP:5: B:198:0x03b6->B:205:0x03c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [lm] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    public final void o() {
        long j;
        ?? r10;
        int i;
        int iB;
        int i2;
        int iMin;
        AbstractC0361lm abstractC0361lmE;
        View view;
        AbstractC0361lm abstractC0361lmE2;
        View view2;
        int i3;
        View viewFindViewById;
        ArrayList arrayList;
        boolean z;
        Ej ej;
        int i4;
        boolean zH;
        if (this.k == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C0269im c0269im = this.c0;
        c0269im.i = false;
        if (c0269im.d == 1) {
            p();
            this.l.q0(this);
            q();
        } else {
            H0 h0 = this.d;
            if ((((ArrayList) h0.d).isEmpty() || ((ArrayList) h0.c).isEmpty()) && this.l.n == getWidth() && this.l.o == getHeight()) {
                this.l.q0(this);
            } else {
                this.l.q0(this);
                q();
            }
        }
        c0269im.a(4);
        d0();
        Q();
        c0269im.d = 1;
        boolean z2 = c0269im.j;
        View view3 = null;
        Long l = null;
        C0085cm c0085cm = this.b;
        C0426np c0426np = this.f;
        if (z2) {
            int iO = this.e.o() - 1;
            while (iO >= 0) {
                AbstractC0361lm abstractC0361lmI = I(this.e.n(iO));
                if (!abstractC0361lmI.p()) {
                    long jG = G(abstractC0361lmI);
                    this.H.getClass();
                    Ej ej2 = new Ej();
                    ej2.a(abstractC0361lmI);
                    AbstractC0361lm abstractC0361lm = (AbstractC0361lm) ((C0511qh) c0426np.c).d(jG, l);
                    if (abstractC0361lm == null || abstractC0361lm.p()) {
                        c0426np.a(abstractC0361lmI, ej2);
                    } else {
                        Fo fo = (Fo) c0426np.b;
                        Ns ns = (Ns) fo.getOrDefault(abstractC0361lm, l);
                        boolean z3 = (ns == null || (ns.a & 1) == 0) ? false : true;
                        Ns ns2 = (Ns) fo.getOrDefault(abstractC0361lmI, l);
                        boolean z4 = (ns2 == null || (ns2.a & 1) == 0) ? false : true;
                        if (z3 && abstractC0361lm == abstractC0361lmI) {
                            c0426np.a(abstractC0361lmI, ej2);
                        } else {
                            Ej ejM = c0426np.m(abstractC0361lm, 4);
                            c0426np.a(abstractC0361lmI, ej2);
                            Ej ejM2 = c0426np.m(abstractC0361lmI, 8);
                            if (ejM == null) {
                                int iO2 = this.e.o();
                                for (int i5 = 0; i5 < iO2; i5++) {
                                    AbstractC0361lm abstractC0361lmI2 = I(this.e.n(i5));
                                    if (abstractC0361lmI2 != abstractC0361lmI && G(abstractC0361lmI2) == jG) {
                                        Ol ol = this.k;
                                        if (ol == null || !ol.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC0361lmI2 + " \n View Holder 2:" + abstractC0361lmI + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC0361lmI2 + " \n View Holder 2:" + abstractC0361lmI + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0361lm + " cannot be found but it is necessary for " + abstractC0361lmI + y());
                            } else {
                                abstractC0361lm.o(false);
                                if (z3) {
                                    f(abstractC0361lm);
                                }
                                if (abstractC0361lm != abstractC0361lmI) {
                                    if (z4) {
                                        f(abstractC0361lmI);
                                    }
                                    abstractC0361lm.h = abstractC0361lmI;
                                    f(abstractC0361lm);
                                    c0085cm.j(abstractC0361lm);
                                    abstractC0361lmI.o(false);
                                    abstractC0361lmI.i = abstractC0361lm;
                                }
                                if (this.H.a(abstractC0361lm, abstractC0361lmI, ejM, ejM2)) {
                                    T();
                                }
                            }
                        }
                    }
                }
                iO--;
                l = null;
            }
            Fo fo2 = (Fo) c0426np.b;
            for (int i6 = fo2.c - 1; i6 >= 0; i6--) {
                AbstractC0361lm abstractC0361lm2 = (AbstractC0361lm) fo2.h(i6);
                Ns ns3 = (Ns) fo2.j(i6);
                int i7 = ns3.a;
                int i8 = i7 & 3;
                Nl nl = this.r0;
                if (i8 == 3) {
                    RecyclerView recyclerView = nl.a;
                    recyclerView.l.j0(abstractC0361lm2.a, recyclerView.b);
                } else if ((i7 & 1) != 0) {
                    Ej ej3 = ns3.b;
                    if (ej3 == null) {
                        RecyclerView recyclerView2 = nl.a;
                        recyclerView2.l.j0(abstractC0361lm2.a, recyclerView2.b);
                    } else {
                        nl.g(abstractC0361lm2, ej3, ns3.c);
                    }
                } else if ((i7 & 14) == 14) {
                    nl.f(abstractC0361lm2, ns3.b, ns3.c);
                } else {
                    if ((i7 & 12) == 12) {
                        Ej ej4 = ns3.b;
                        Ej ej5 = ns3.c;
                        nl.getClass();
                        abstractC0361lm2.o(false);
                        RecyclerView recyclerView3 = nl.a;
                        if (!recyclerView3.y) {
                            E8 e8 = (E8) recyclerView3.H;
                            e8.getClass();
                            int i9 = ej4.a;
                            int i10 = ej5.a;
                            if (i9 == i10 && ej4.b == ej5.b) {
                                e8.d(abstractC0361lm2);
                                zH = false;
                            } else {
                                zH = e8.h(abstractC0361lm2, i9, ej4.b, i10, ej5.b);
                            }
                            if (zH) {
                                recyclerView3.T();
                            }
                        } else if (recyclerView3.H.a(abstractC0361lm2, abstractC0361lm2, ej4, ej5)) {
                            recyclerView3.T();
                        }
                    } else {
                        if ((i7 & 4) != 0) {
                            ej = null;
                            nl.g(abstractC0361lm2, ns3.b, null);
                        } else {
                            ej = null;
                            if ((i7 & 8) != 0) {
                                nl.f(abstractC0361lm2, ns3.b, ns3.c);
                            }
                        }
                        i4 = 0;
                    }
                    ns3.a = i4;
                    ns3.b = ej;
                    ns3.c = ej;
                    Ns.d.a(ns3);
                }
                i4 = 0;
                ej = null;
                ns3.a = i4;
                ns3.b = ej;
                ns3.c = ej;
                Ns.d.a(ns3);
            }
            view3 = null;
        }
        this.l.i0(c0085cm);
        c0269im.b = c0269im.e;
        this.y = false;
        this.z = false;
        c0269im.j = false;
        c0269im.k = false;
        this.l.f = false;
        ArrayList arrayList2 = c0085cm.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        Wl wl = this.l;
        if (wl.k) {
            wl.j = 0;
            wl.k = false;
            c0085cm.k();
        }
        this.l.c0(c0269im);
        R(true);
        e0(false);
        ((Fo) c0426np.b).clear();
        ((C0511qh) c0426np.c).a();
        int[] iArr = this.k0;
        int i11 = iArr[0];
        int i12 = iArr[1];
        C(iArr);
        if ((iArr[0] == i11 && iArr[1] == i12) ? false : true) {
            t(0, 0);
        }
        if (this.V && this.k != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = c0269im.m;
                if (j == -1) {
                    r10 = view3;
                } else {
                    r10 = view3;
                }
                if (r10 != 0) {
                    arrayList = (ArrayList) this.e.d;
                    view = r10.a;
                    if (!arrayList.contains(view)) {
                        if (this.e.o() > 0) {
                            i = c0269im.l;
                            if (i == -1) {
                                i = 0;
                            }
                            iB = c0269im.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    abstractC0361lmE2 = E(i2);
                                    if (abstractC0361lmE2 != null) {
                                        view2 = abstractC0361lmE2.a;
                                        if (view2.hasFocusable()) {
                                            view3 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    abstractC0361lmE = E(iMin);
                                    if (abstractC0361lmE == null) {
                                        break;
                                        break;
                                    }
                                    view = abstractC0361lmE.a;
                                    if (view.hasFocusable()) {
                                        view3 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.e.o() > 0) {
                        i = c0269im.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = c0269im.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                abstractC0361lmE2 = E(i2);
                                if (abstractC0361lmE2 != null) {
                                    view2 = abstractC0361lmE2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC0361lmE = E(iMin);
                                if (abstractC0361lmE == null) {
                                    break;
                                    break;
                                }
                                view = abstractC0361lmE.a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.e.o() > 0) {
                    i = c0269im.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = c0269im.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            abstractC0361lmE2 = E(i2);
                            if (abstractC0361lmE2 != null) {
                                view2 = abstractC0361lmE2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC0361lmE = E(iMin);
                            if (abstractC0361lmE == null) {
                                break;
                                break;
                            }
                            view = abstractC0361lmE.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i3 = c0269im.n;
                    if (i3 != -1) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            } else if (((ArrayList) this.e.d).contains(getFocusedChild())) {
                j = c0269im.m;
                if (j == -1 && (z = this.k.b) && z) {
                    int iA = this.e.A();
                    r10 = view3;
                    int i13 = 0;
                    while (i13 < iA) {
                        AbstractC0361lm abstractC0361lmI3 = I(this.e.z(i13));
                        if (abstractC0361lmI3 != null && !abstractC0361lmI3.i() && abstractC0361lmI3.e == j) {
                            if (!((ArrayList) this.e.d).contains(abstractC0361lmI3.a)) {
                                r10 = abstractC0361lmI3;
                                break;
                            }
                            r10 = abstractC0361lmI3;
                        }
                        i13++;
                        r10 = r10;
                    }
                } else {
                    r10 = view3;
                }
                if (r10 != 0) {
                    arrayList = (ArrayList) this.e.d;
                    view = r10.a;
                    if (!arrayList.contains(view) && view.hasFocusable()) {
                        view3 = view;
                        break;
                    }
                    if (this.e.o() > 0) {
                        i = c0269im.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = c0269im.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                abstractC0361lmE2 = E(i2);
                                if (abstractC0361lmE2 != null) {
                                    view2 = abstractC0361lmE2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                abstractC0361lmE = E(iMin);
                                if (abstractC0361lmE == null) {
                                    break;
                                }
                                view = abstractC0361lmE.a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.e.o() > 0) {
                    i = c0269im.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = c0269im.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            abstractC0361lmE2 = E(i2);
                            if (abstractC0361lmE2 != null) {
                                view2 = abstractC0361lmE2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            abstractC0361lmE = E(iMin);
                            if (abstractC0361lmE == null) {
                                break;
                                break;
                            }
                            view = abstractC0361lmE.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i3 = c0269im.n;
                    if (i3 != -1 && (viewFindViewById = view3.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            }
        }
        c0269im.m = -1L;
        c0269im.l = -1;
        c0269im.n = -1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.A = 0;
        this.p = true;
        this.r = this.r && !isLayoutRequested();
        Wl wl = this.l;
        if (wl != null) {
            wl.g = true;
            wl.Q(this);
        }
        this.i0 = false;
        ThreadLocal threadLocal = Dd.e;
        Dd dd = (Dd) threadLocal.get();
        this.a0 = dd;
        if (dd == null) {
            Dd dd2 = new Dd();
            dd2.a = new ArrayList();
            dd2.d = new ArrayList();
            this.a0 = dd2;
            WeakHashMap weakHashMap = Gs.a;
            Display display = getDisplay();
            if (isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            Dd dd3 = this.a0;
            dd3.c = (long) (1.0E9f / refreshRate);
            threadLocal.set(dd3);
        }
        this.a0.a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Pg pg;
        super.onDetachedFromWindow();
        Sl sl = this.H;
        if (sl != null) {
            sl.f();
        }
        setScrollState(0);
        RunnableC0330km runnableC0330km = this.W;
        runnableC0330km.g.removeCallbacks(runnableC0330km);
        runnableC0330km.c.abortAnimation();
        Wl wl = this.l;
        if (wl != null && (pg = wl.e) != null) {
            pg.i();
        }
        this.p = false;
        Wl wl2 = this.l;
        if (wl2 != null) {
            wl2.g = false;
            wl2.R(this);
        }
        this.p0.clear();
        removeCallbacks(this.q0);
        this.f.getClass();
        while (Ns.d.b() != null) {
        }
        Dd dd = this.a0;
        if (dd != null) {
            dd.a.remove(this);
            this.a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Tl) arrayList.get(i)).b(canvas, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.l != null && !this.u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.l.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.l.d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.l.e()) {
                    f = -axisValue2;
                } else if (this.l.d()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                Z((int) (axisValue * this.T), (int) (f * this.U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.u) {
            return false;
        }
        this.o = null;
        if (B(motionEvent)) {
            Y();
            setScrollState(0);
            return true;
        }
        Wl wl = this.l;
        if (wl == null) {
            return false;
        }
        boolean zD = wl.d();
        boolean zE = this.l.e();
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.v) {
                this.v = false;
            }
            this.J = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.N = x;
            this.L = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.O = y;
            this.M = y;
            if (this.I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                f0(1);
            }
            int[] iArr = this.n0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zD;
            if (zE) {
                i = (zD ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i, 0);
        } else if (actionMasked == 1) {
            this.K.clear();
            f0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.J);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.I != 1) {
                int i2 = x2 - this.L;
                int i3 = y2 - this.M;
                if (!zD || Math.abs(i2) <= this.P) {
                    z = false;
                } else {
                    this.N = x2;
                    z = true;
                }
                if (zE && Math.abs(i3) > this.P) {
                    this.O = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            Y();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.J = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.N = x3;
            this.L = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.O = y3;
            this.M = y3;
        } else if (actionMasked == 6) {
            S(motionEvent);
        }
        return this.I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = AbstractC0090cr.a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Wl wl = this.l;
        if (wl == null) {
            n(i, i2);
            return;
        }
        boolean zL = wl.L();
        C0269im c0269im = this.c0;
        if (!zL) {
            if (this.q) {
                this.l.b.n(i, i2);
                return;
            }
            if (c0269im.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Ol ol = this.k;
            if (ol != null) {
                c0269im.e = ol.a();
            } else {
                c0269im.e = 0;
            }
            d0();
            this.l.b.n(i, i2);
            e0(false);
            c0269im.g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.l.b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.k == null) {
            return;
        }
        if (c0269im.d == 1) {
            p();
        }
        this.l.r0(i, i2);
        c0269im.i = true;
        q();
        this.l.t0(i, i2);
        if (this.l.w0()) {
            this.l.r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0269im.i = true;
            q();
            this.l.t0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0177fm)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0177fm c0177fm = (C0177fm) parcelable;
        this.c = c0177fm;
        super.onRestoreInstanceState(c0177fm.a);
        Wl wl = this.l;
        if (wl == null || (parcelable2 = this.c.c) == null) {
            return;
        }
        wl.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0177fm c0177fm = new C0177fm(super.onSaveInstanceState());
        C0177fm c0177fm2 = this.c;
        if (c0177fm2 != null) {
            c0177fm.c = c0177fm2.c;
        } else {
            Wl wl = this.l;
            if (wl != null) {
                c0177fm.c = wl.e0();
            } else {
                c0177fm.c = null;
            }
        }
        return c0177fm;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.G = null;
        this.E = null;
        this.F = null;
        this.D = null;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x035f  */
    /* JADX WARN: Code duplicated, block: B:255:0x041e  */
    /* JADX WARN: Code duplicated, block: B:257:0x0422 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x0424  */
    /* JADX WARN: Code duplicated, block: B:261:0x0454  */
    /* JADX WARN: Code duplicated, block: B:263:0x0476  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa A[PHI: r0
      0x01fa: PHI (r0v51 int) = (r0v38 int), (r0v55 int) binds: [B:90:0x01e3, B:94:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zB;
        RecyclerView recyclerView;
        int i;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        RecyclerView recyclerView2;
        RunnableC0330km runnableC0330km;
        RecyclerView recyclerView3;
        Interpolator interpolator;
        Ml ml;
        int minFlingVelocity;
        boolean z;
        AbstractC0658va abstractC0658vaD;
        int iH;
        PointF pointFA;
        int i2;
        boolean z2;
        if (this.u || this.v) {
            return false;
        }
        Qb qb = this.o;
        if (qb == null) {
            zB = motionEvent.getAction() == 0 ? false : B(motionEvent);
        } else {
            if (qb.v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean zE = qb.e(motionEvent.getX(), motionEvent.getY());
                    boolean zD = qb.d(motionEvent.getX(), motionEvent.getY());
                    if (zE || zD) {
                        if (zD) {
                            qb.w = 1;
                            qb.p = (int) motionEvent.getX();
                        } else if (zE) {
                            qb.w = 2;
                            qb.m = (int) motionEvent.getY();
                        }
                        qb.g(2);
                    }
                } else if (motionEvent.getAction() == 1 && qb.v == 2) {
                    qb.m = 0.0f;
                    qb.p = 0.0f;
                    qb.g(1);
                    qb.w = 0;
                } else if (motionEvent.getAction() == 2 && qb.v == 2) {
                    qb.h();
                    int i3 = qb.w;
                    int i4 = qb.b;
                    if (i3 == 1) {
                        float x = motionEvent.getX();
                        int[] iArr = qb.y;
                        iArr[0] = i4;
                        int i5 = qb.q - i4;
                        iArr[1] = i5;
                        float fMax = Math.max(i4, Math.min(i5, x));
                        if (Math.abs(qb.o - fMax) >= 2.0f) {
                            int iF = Qb.f(qb.p, fMax, iArr, qb.s.computeHorizontalScrollRange(), qb.s.computeHorizontalScrollOffset(), qb.q);
                            if (iF != 0) {
                                qb.s.scrollBy(iF, 0);
                            }
                            qb.p = fMax;
                        }
                    }
                    if (qb.w == 2) {
                        float y = motionEvent.getY();
                        int[] iArr2 = qb.x;
                        iArr2[0] = i4;
                        int i6 = qb.r - i4;
                        iArr2[1] = i6;
                        float fMax2 = Math.max(i4, Math.min(i6, y));
                        if (Math.abs(qb.l - fMax2) >= 2.0f) {
                            int iF2 = Qb.f(qb.m, fMax2, iArr2, qb.s.computeVerticalScrollRange(), qb.s.computeVerticalScrollOffset(), qb.r);
                            if (iF2 != 0) {
                                qb.s.scrollBy(0, iF2);
                            }
                            qb.m = fMax2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.o = null;
            }
            zB = true;
        }
        if (zB) {
            Y();
            setScrollState(0);
            return true;
        }
        Wl wl = this.l;
        if (wl == null) {
            return false;
        }
        boolean zD2 = wl.d();
        boolean zE2 = this.l.e();
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.n0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.J);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.J + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    int iMax = this.N - x2;
                    int iMax2 = this.O - y2;
                    if (this.I != 1) {
                        if (zD2) {
                            iMax = iMax > 0 ? Math.max(0, iMax - this.P) : Math.min(0, iMax + this.P);
                            if (iMax != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        if (zE2) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.P) : Math.min(0, iMax2 + this.P);
                            if (iMax2 != 0) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                    int i7 = iMax;
                    int i8 = iMax2;
                    if (this.I == 1) {
                        int[] iArr4 = this.o0;
                        iArr4[0] = 0;
                        iArr4[1] = 0;
                        boolean zR = r(zD2 ? i7 : 0, zE2 ? i8 : 0, iArr4, this.m0, 0);
                        int[] iArr5 = this.m0;
                        if (zR) {
                            i7 -= iArr4[0];
                            i8 -= iArr4[1];
                            iArr3[0] = iArr3[0] + iArr5[0];
                            iArr3[1] = iArr3[1] + iArr5[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i9 = i7;
                        int i10 = i8;
                        this.N = x2 - iArr5[0];
                        this.O = y2 - iArr5[1];
                        if (Z(zD2 ? i9 : 0, zE2 ? i10 : 0, motionEvent)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        Dd dd = this.a0;
                        if (dd != null && (i9 != 0 || i10 != 0)) {
                            dd.a(this, i9, i10);
                        }
                    }
                } else if (actionMasked == 3) {
                    Y();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.J = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.N = x3;
                    this.L = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.O = y3;
                    this.M = y3;
                } else if (actionMasked == 6) {
                    S(motionEvent);
                }
                recyclerView = this;
            } else {
                this.K.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.K;
                int i11 = this.S;
                velocityTracker.computeCurrentVelocity(1000, i11);
                float f = zD2 ? -this.K.getXVelocity(this.J) : 0.0f;
                float f2 = zE2 ? -this.K.getYVelocity(this.J) : 0.0f;
                if (f == 0.0f && f2 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent3 = motionEventObtain;
                } else {
                    int i12 = (int) f;
                    int i13 = (int) f2;
                    Wl wl2 = this.l;
                    if (wl2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
                        if (!this.u) {
                            int iD = wl2.d();
                            boolean zE3 = this.l.e();
                            int i14 = this.R;
                            if (iD == 0 || Math.abs(i12) < i14) {
                                i12 = 0;
                            }
                            if (!zE3 || Math.abs(i13) < i14) {
                                i13 = 0;
                            }
                            if (i12 != 0 || i13 != 0) {
                                float f3 = i12;
                                float f4 = i13;
                                if (!dispatchNestedPreFling(f3, f4)) {
                                    boolean z3 = iD != 0 || zE3;
                                    dispatchNestedFling(f3, f4, z3);
                                    Yl yl = this.Q;
                                    if (yl != null) {
                                        C0668vk c0668vk = (C0668vk) yl;
                                        Wl layoutManager = c0668vk.a.getLayoutManager();
                                        if (layoutManager == 0 || c0668vk.a.getAdapter() == null || ((Math.abs(i13) <= (minFlingVelocity = c0668vk.a.getMinFlingVelocity()) && Math.abs(i12) <= minFlingVelocity) || !((z = layoutManager instanceof InterfaceC0239hm)))) {
                                            motionEvent3 = motionEventObtain;
                                            if (z3) {
                                                if (zE3) {
                                                    iD = (iD == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().h(iD, 1);
                                                int i15 = -i11;
                                                int iMax3 = Math.max(i15, Math.min(i12, i11));
                                                int iMax4 = Math.max(i15, Math.min(i13, i11));
                                                runnableC0330km = this.W;
                                                recyclerView3 = runnableC0330km.g;
                                                recyclerView3.setScrollState(2);
                                                runnableC0330km.b = 0;
                                                runnableC0330km.a = 0;
                                                interpolator = runnableC0330km.d;
                                                ml = u0;
                                                if (interpolator != ml) {
                                                    runnableC0330km.d = ml;
                                                    runnableC0330km.c = new OverScroller(recyclerView3.getContext(), ml);
                                                }
                                                runnableC0330km.c.fling(0, 0, iMax3, iMax4, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE);
                                                runnableC0330km.a();
                                            } else {
                                                recyclerView2 = this;
                                            }
                                        } else {
                                            C0622u5 c0622u5 = !z ? null : new C0622u5(c0668vk, c0668vk.a.getContext(), 1);
                                            if (c0622u5 == null) {
                                                motionEvent3 = motionEventObtain;
                                            } else {
                                                int iB = layoutManager.B();
                                                if (iB != 0) {
                                                    if (layoutManager.e()) {
                                                        abstractC0658vaD = c0668vk.e(layoutManager);
                                                    } else {
                                                        abstractC0658vaD = layoutManager.d() ? c0668vk.d(layoutManager) : null;
                                                    }
                                                    if (abstractC0658vaD == null) {
                                                        motionEvent3 = motionEventObtain;
                                                    } else {
                                                        int iV = layoutManager.v();
                                                        motionEvent3 = motionEventObtain;
                                                        int i16 = Integer.MIN_VALUE;
                                                        int i17 = Integer.MAX_VALUE;
                                                        int i18 = 0;
                                                        View view = null;
                                                        View view2 = null;
                                                        while (i18 < iV) {
                                                            int i19 = iV;
                                                            View viewU = layoutManager.u(i18);
                                                            if (viewU != null) {
                                                                int iB2 = C0668vk.b(viewU, abstractC0658vaD);
                                                                if (iB2 <= 0 && iB2 > i16) {
                                                                    i16 = iB2;
                                                                    view2 = viewU;
                                                                }
                                                                if (iB2 >= 0 && iB2 < i17) {
                                                                    i17 = iB2;
                                                                    view = viewU;
                                                                }
                                                            }
                                                            i18++;
                                                            iV = i19;
                                                        }
                                                        boolean z4 = !layoutManager.d() ? i13 <= 0 : i12 <= 0;
                                                        if (z4 && view != null) {
                                                            iH = Wl.H(view);
                                                        } else if (z4 || view2 == null) {
                                                            if (z4) {
                                                                view = view2;
                                                            }
                                                            if (view != null) {
                                                                int iH2 = ((z && (pointFA = ((InterfaceC0239hm) layoutManager).a(layoutManager.B() - 1)) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == z4 ? -1 : 1) + Wl.H(view);
                                                                if (iH2 >= 0 && iH2 < iB) {
                                                                    iH = iH2;
                                                                }
                                                            }
                                                        } else {
                                                            iH = Wl.H(view2);
                                                        }
                                                    }
                                                    iH = -1;
                                                } else {
                                                    motionEvent3 = motionEventObtain;
                                                    iH = -1;
                                                }
                                                if (iH != -1) {
                                                    c0622u5.a = iH;
                                                    layoutManager.z0(c0622u5);
                                                }
                                            }
                                            if (z3) {
                                                if (zE3) {
                                                    iD = (iD == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().h(iD, 1);
                                                int i110 = -i11;
                                                int iMax5 = Math.max(i110, Math.min(i12, i11));
                                                int iMax6 = Math.max(i110, Math.min(i13, i11));
                                                runnableC0330km = this.W;
                                                recyclerView3 = runnableC0330km.g;
                                                recyclerView3.setScrollState(2);
                                                runnableC0330km.b = 0;
                                                runnableC0330km.a = 0;
                                                interpolator = runnableC0330km.d;
                                                ml = u0;
                                                if (interpolator != ml) {
                                                    runnableC0330km.d = ml;
                                                    runnableC0330km.c = new OverScroller(recyclerView3.getContext(), ml);
                                                }
                                                runnableC0330km.c.fling(0, 0, iMax5, iMax6, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE);
                                                runnableC0330km.a();
                                            } else {
                                                recyclerView2 = this;
                                            }
                                        }
                                    } else {
                                        motionEvent3 = motionEventObtain;
                                        if (z3) {
                                            if (zE3) {
                                                iD = (iD == true ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().h(iD, 1);
                                            int i111 = -i11;
                                            int iMax7 = Math.max(i111, Math.min(i12, i11));
                                            int iMax8 = Math.max(i111, Math.min(i13, i11));
                                            runnableC0330km = this.W;
                                            recyclerView3 = runnableC0330km.g;
                                            recyclerView3.setScrollState(2);
                                            runnableC0330km.b = 0;
                                            runnableC0330km.a = 0;
                                            interpolator = runnableC0330km.d;
                                            ml = u0;
                                            if (interpolator != ml) {
                                                runnableC0330km.d = ml;
                                                runnableC0330km.c = new OverScroller(recyclerView3.getContext(), ml);
                                            }
                                            runnableC0330km.c.fling(0, 0, iMax7, iMax8, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE);
                                            runnableC0330km.a();
                                        } else {
                                            recyclerView2 = this;
                                        }
                                    }
                                }
                                i2 = 0;
                            }
                        }
                        Y();
                        motionEvent2 = motionEvent3;
                    }
                    recyclerView2 = this;
                    motionEvent3 = motionEventObtain;
                    i2 = 0;
                }
                recyclerView2.setScrollState(i2);
                Y();
                motionEvent2 = motionEvent3;
            }
            motionEvent2.recycle();
            return true;
        }
        recyclerView = this;
        recyclerView.J = motionEvent.getPointerId(0);
        int x4 = (int) (motionEvent.getX() + 0.5f);
        recyclerView.N = x4;
        recyclerView.L = x4;
        int y4 = (int) (motionEvent.getY() + 0.5f);
        recyclerView.O = y4;
        recyclerView.M = y4;
        if (zE2) {
            i = zD2;
            i = (zD2 ? 1 : 0) | 2;
        }
        i = zD2;
        getScrollingChildHelper().h(i, 0);
        motionEvent2 = motionEventObtain;
        recyclerView.K.addMovement(motionEvent2);
        motionEvent2.recycle();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    public final void p() {
        View viewA;
        int iF;
        Ns ns;
        C0269im c0269im = this.c0;
        c0269im.a(1);
        z(c0269im);
        c0269im.i = false;
        d0();
        C0426np c0426np = this.f;
        ((Fo) c0426np.b).clear();
        C0511qh c0511qh = (C0511qh) c0426np.c;
        c0511qh.a();
        Q();
        U();
        View focusedChild = (this.V && hasFocus() && this.k != null) ? getFocusedChild() : null;
        AbstractC0361lm abstractC0361lmH = (focusedChild == null || (viewA = A(focusedChild)) == null) ? null : H(viewA);
        if (abstractC0361lmH == null) {
            c0269im.m = -1L;
            c0269im.l = -1;
            c0269im.n = -1;
        } else {
            c0269im.m = this.k.b ? abstractC0361lmH.e : -1L;
            if (this.y) {
                iF = -1;
            } else if (abstractC0361lmH.i()) {
                iF = abstractC0361lmH.d;
            } else {
                RecyclerView recyclerView = abstractC0361lmH.r;
                if (recyclerView == null) {
                    iF = -1;
                } else {
                    iF = recyclerView.F(abstractC0361lmH);
                }
            }
            c0269im.l = iF;
            View focusedChild2 = abstractC0361lmH.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c0269im.n = id;
        }
        c0269im.h = c0269im.j && this.g0;
        this.g0 = false;
        this.f0 = false;
        c0269im.g = c0269im.k;
        c0269im.e = this.k.a();
        C(this.k0);
        boolean z = c0269im.j;
        Fo fo = (Fo) c0426np.b;
        if (z) {
            int iO = this.e.o();
            for (int i = 0; i < iO; i++) {
                AbstractC0361lm abstractC0361lmI = I(this.e.n(i));
                if (!abstractC0361lmI.p() && (!abstractC0361lmI.g() || this.k.b)) {
                    Sl sl = this.H;
                    Sl.b(abstractC0361lmI);
                    abstractC0361lmI.c();
                    sl.getClass();
                    Ej ej = new Ej();
                    ej.a(abstractC0361lmI);
                    Ns nsA = (Ns) fo.getOrDefault(abstractC0361lmI, null);
                    if (nsA == null) {
                        nsA = Ns.a();
                        fo.put(abstractC0361lmI, nsA);
                    }
                    nsA.b = ej;
                    nsA.a |= 4;
                    if (c0269im.h && abstractC0361lmI.l() && !abstractC0361lmI.i() && !abstractC0361lmI.p() && !abstractC0361lmI.g()) {
                        c0511qh.e(G(abstractC0361lmI), abstractC0361lmI);
                    }
                }
            }
        }
        if (c0269im.k) {
            int iA = this.e.A();
            for (int i2 = 0; i2 < iA; i2++) {
                AbstractC0361lm abstractC0361lmI2 = I(this.e.z(i2));
                if (!abstractC0361lmI2.p() && abstractC0361lmI2.d == -1) {
                    abstractC0361lmI2.d = abstractC0361lmI2.c;
                }
            }
            boolean z2 = c0269im.f;
            c0269im.f = false;
            this.l.b0(this.b, c0269im);
            c0269im.f = z2;
            for (int i3 = 0; i3 < this.e.o(); i3++) {
                AbstractC0361lm abstractC0361lmI3 = I(this.e.n(i3));
                if (!abstractC0361lmI3.p() && ((ns = (Ns) fo.getOrDefault(abstractC0361lmI3, null)) == null || (ns.a & 4) == 0)) {
                    Sl.b(abstractC0361lmI3);
                    boolean zD = abstractC0361lmI3.d(8192);
                    Sl sl2 = this.H;
                    abstractC0361lmI3.c();
                    sl2.getClass();
                    Ej ej2 = new Ej();
                    ej2.a(abstractC0361lmI3);
                    if (zD) {
                        W(abstractC0361lmI3, ej2);
                    } else {
                        Ns nsA2 = (Ns) fo.getOrDefault(abstractC0361lmI3, null);
                        if (nsA2 == null) {
                            nsA2 = Ns.a();
                            fo.put(abstractC0361lmI3, nsA2);
                        }
                        nsA2.a |= 2;
                        nsA2.b = ej2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        R(true);
        e0(false);
        c0269im.d = 2;
    }

    public final void q() {
        d0();
        Q();
        C0269im c0269im = this.c0;
        c0269im.a(6);
        this.d.d();
        c0269im.e = this.k.a();
        c0269im.c = 0;
        c0269im.g = false;
        this.l.b0(this.b, c0269im);
        c0269im.f = false;
        this.c = null;
        c0269im.j = c0269im.j && this.H != null;
        c0269im.d = 4;
        R(true);
        e0(false);
    }

    public final boolean r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC0361lm abstractC0361lmI = I(view);
        if (abstractC0361lmI != null) {
            if (abstractC0361lmI.k()) {
                abstractC0361lmI.j &= -257;
            } else if (!abstractC0361lmI.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC0361lmI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        Pg pg = this.l.e;
        if ((pg == null || !pg.e) && !M() && view2 != null) {
            X(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.l.l0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Qb) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s != 0 || this.u) {
            this.t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        Wl wl = this.l;
        if (wl == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.u) {
            return;
        }
        boolean zD = wl.d();
        boolean zE = this.l.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i2 = 0;
            }
            Z(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!M()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0423nm c0423nm) {
        this.j0 = c0423nm;
        Gs.j(this, c0423nm);
    }

    public void setAdapter(Ol ol) {
        setLayoutFrozen(false);
        Ol ol2 = this.k;
        C0146em c0146em = this.a;
        if (ol2 != null) {
            ol2.a.unregisterObserver(c0146em);
            this.k.getClass();
        }
        Sl sl = this.H;
        if (sl != null) {
            sl.f();
        }
        Wl wl = this.l;
        C0085cm c0085cm = this.b;
        if (wl != null) {
            wl.h0(c0085cm);
            this.l.i0(c0085cm);
        }
        c0085cm.a.clear();
        c0085cm.d();
        H0 h0 = this.d;
        h0.o((ArrayList) h0.c);
        h0.o((ArrayList) h0.d);
        Ol ol3 = this.k;
        this.k = ol;
        if (ol != null) {
            ol.a.registerObserver(c0146em);
        }
        Ol ol4 = this.k;
        c0085cm.a.clear();
        c0085cm.d();
        C0054bm c0054bmC = c0085cm.c();
        if (ol3 != null) {
            c0054bmC.b--;
        }
        if (c0054bmC.b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c0054bmC.a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C0023am) sparseArray.valueAt(i)).a.clear();
                i++;
            }
        }
        if (ol4 != null) {
            c0054bmC.b++;
        }
        this.c0.f = true;
        V(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(Ql ql) {
        if (ql == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.g) {
            this.G = null;
            this.E = null;
            this.F = null;
            this.D = null;
        }
        this.g = z;
        super.setClipToPadding(z);
        if (this.r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(Rl rl) {
        rl.getClass();
        this.C = rl;
        this.G = null;
        this.E = null;
        this.F = null;
        this.D = null;
    }

    public void setHasFixedSize(boolean z) {
        this.q = z;
    }

    public void setItemAnimator(Sl sl) {
        Sl sl2 = this.H;
        if (sl2 != null) {
            sl2.f();
            this.H.a = null;
        }
        this.H = sl;
        if (sl != null) {
            sl.a = this.h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0085cm c0085cm = this.b;
        c0085cm.e = i;
        c0085cm.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(Wl wl) {
        Nl nl;
        Pg pg;
        if (wl == this.l) {
            return;
        }
        setScrollState(0);
        RunnableC0330km runnableC0330km = this.W;
        runnableC0330km.g.removeCallbacks(runnableC0330km);
        runnableC0330km.c.abortAnimation();
        Wl wl2 = this.l;
        if (wl2 != null && (pg = wl2.e) != null) {
            pg.i();
        }
        Wl wl3 = this.l;
        C0085cm c0085cm = this.b;
        if (wl3 != null) {
            Sl sl = this.H;
            if (sl != null) {
                sl.f();
            }
            this.l.h0(c0085cm);
            this.l.i0(c0085cm);
            c0085cm.a.clear();
            c0085cm.d();
            if (this.p) {
                Wl wl4 = this.l;
                wl4.g = false;
                wl4.R(this);
            }
            this.l.u0(null);
            this.l = null;
        } else {
            c0085cm.a.clear();
            c0085cm.d();
        }
        K2 k2 = this.e;
        ((O5) k2.c).h();
        ArrayList arrayList = (ArrayList) k2.d;
        int size = arrayList.size() - 1;
        while (true) {
            nl = (Nl) k2.b;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            nl.getClass();
            AbstractC0361lm abstractC0361lmI = I(view);
            if (abstractC0361lmI != null) {
                int i = abstractC0361lmI.p;
                RecyclerView recyclerView = nl.a;
                if (recyclerView.M()) {
                    abstractC0361lmI.q = i;
                    recyclerView.p0.add(abstractC0361lmI);
                } else {
                    WeakHashMap weakHashMap = Gs.a;
                    abstractC0361lmI.a.setImportantForAccessibility(i);
                }
                abstractC0361lmI.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = nl.a;
        int childCount = recyclerView2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.l = wl;
        if (wl != null) {
            if (wl.b != null) {
                throw new IllegalArgumentException("LayoutManager " + wl + " is already attached to a RecyclerView:" + wl.b.y());
            }
            wl.u0(this);
            if (this.p) {
                Wl wl5 = this.l;
                wl5.g = true;
                wl5.Q(this);
            }
        }
        c0085cm.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        Bj scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = Gs.a;
            AbstractC0676vs.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(Yl yl) {
        this.Q = yl;
    }

    @Deprecated
    public void setOnScrollListener(Zl zl) {
        this.d0 = zl;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.V = z;
    }

    public void setRecycledViewPool(C0054bm c0054bm) {
        C0085cm c0085cm = this.b;
        C0054bm c0054bm2 = c0085cm.g;
        if (c0054bm2 != null) {
            c0054bm2.b--;
        }
        c0085cm.g = c0054bm;
        if (c0054bm == null || c0085cm.h.getAdapter() == null) {
            return;
        }
        c0085cm.g.b++;
    }

    public void setRecyclerListener(InterfaceC0116dm interfaceC0116dm) {
    }

    public void setScrollState(int i) {
        Pg pg;
        if (i == this.I) {
            return;
        }
        this.I = i;
        if (i != 2) {
            RunnableC0330km runnableC0330km = this.W;
            runnableC0330km.g.removeCallbacks(runnableC0330km);
            runnableC0330km.c.abortAnimation();
            Wl wl = this.l;
            if (wl != null && (pg = wl.e) != null) {
                pg.i();
            }
        }
        Wl wl2 = this.l;
        if (wl2 != null) {
            wl2.f0(i);
        }
        Zl zl = this.d0;
        if (zl != null) {
            zl.a(this, i);
        }
        ArrayList arrayList = this.e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Zl) this.e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0299jm abstractC0299jm) {
        this.b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        Pg pg;
        if (z != this.u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.u = false;
                if (this.t && this.l != null && this.k != null) {
                    requestLayout();
                }
                this.t = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.u = true;
            this.v = true;
            setScrollState(0);
            RunnableC0330km runnableC0330km = this.W;
            runnableC0330km.g.removeCallbacks(runnableC0330km);
            runnableC0330km.c.abortAnimation();
            Wl wl = this.l;
            if (wl == null || (pg = wl.e) == null) {
                return;
            }
            pg.i();
        }
    }

    public final void t(int i, int i2) {
        this.B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        Zl zl = this.d0;
        if (zl != null) {
            zl.b(this, i, i2);
        }
        ArrayList arrayList = this.e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Zl) this.e0.get(size)).b(this, i, i2);
            }
        }
        this.B--;
    }

    public final void u() {
        if (this.G != null) {
            return;
        }
        this.C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.G = edgeEffect;
        if (this.g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.D != null) {
            return;
        }
        this.C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.D = edgeEffect;
        if (this.g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.F != null) {
            return;
        }
        this.C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.E != null) {
            return;
        }
        this.C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.E = edgeEffect;
        if (this.g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.k + ", layout:" + this.l + ", context:" + getContext();
    }

    public final void z(C0269im c0269im) {
        if (getScrollState() != 2) {
            c0269im.getClass();
            return;
        }
        OverScroller overScroller = this.W.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0269im.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code duplicated, block: B:80:0x03b1  */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException {
        int i2;
        char c;
        boolean z;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        this.a = new C0146em(this);
        this.b = new C0085cm(this);
        this.f = new C0426np();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new RectF();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.s = 0;
        this.y = false;
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = new Rl();
        E8 e8 = new E8();
        e8.a = null;
        e8.b = new ArrayList();
        e8.c = 120L;
        e8.d = 120L;
        e8.e = 250L;
        e8.f = 250L;
        e8.g = true;
        e8.h = new ArrayList();
        e8.i = new ArrayList();
        e8.j = new ArrayList();
        e8.k = new ArrayList();
        e8.l = new ArrayList();
        e8.m = new ArrayList();
        e8.n = new ArrayList();
        e8.o = new ArrayList();
        e8.p = new ArrayList();
        e8.q = new ArrayList();
        e8.r = new ArrayList();
        this.H = e8;
        this.I = 0;
        this.J = -1;
        this.T = Float.MIN_VALUE;
        this.U = Float.MIN_VALUE;
        this.V = true;
        this.W = new RunnableC0330km(this);
        this.b0 = new Bd();
        C0269im c0269im = new C0269im();
        c0269im.a = -1;
        c0269im.b = 0;
        c0269im.c = 0;
        c0269im.d = 1;
        c0269im.e = 0;
        c0269im.f = false;
        c0269im.g = false;
        c0269im.h = false;
        c0269im.i = false;
        c0269im.j = false;
        c0269im.k = false;
        this.c0 = c0269im;
        this.f0 = false;
        this.g0 = false;
        Nl nl = new Nl(this);
        this.h0 = nl;
        this.i0 = false;
        this.k0 = new int[2];
        this.m0 = new int[2];
        this.n0 = new int[2];
        this.o0 = new int[2];
        this.p0 = new ArrayList();
        this.q0 = new RunnableC0524r0(this, 12);
        this.r0 = new Nl(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.P = viewConfiguration.getScaledTouchSlop();
        this.T = Hs.a(viewConfiguration);
        this.U = Hs.b(viewConfiguration);
        this.R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.H.a = nl;
        this.d = new H0(new Nl(this));
        this.e = new K2(new Nl(this));
        WeakHashMap weakHashMap = Gs.a;
        if (AbstractC0769ys.c(this) == 0) {
            AbstractC0769ys.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0423nm(this));
        int[] iArr = AbstractC0576sl.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c = 2;
            new Qb(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c = 2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (strTrim.isEmpty()) {
                z = true;
            } else {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(Wl.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(t0);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        z = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c] = Integer.valueOf(i);
                            objArr2[3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e) {
                            e = e;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                objArr = null;
                                constructor = clsAsSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e2) {
                                e2.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                            }
                        }
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        z = true;
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((Wl) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e4);
                } catch (ClassNotFoundException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e6);
                } catch (InstantiationException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e9);
                }
            }
        } else {
            z = true;
        }
        int i3 = Build.VERSION.SDK_INT;
        int[] iArr2 = s0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        }
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, z);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Wl wl = this.l;
        if (wl != null) {
            return wl.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
