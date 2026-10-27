package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.jcraft.jsch.SftpATTRS;
import defpackage.A4;
import defpackage.AbstractC0614ts;
import defpackage.AbstractC0638ul;
import defpackage.AbstractC0676vs;
import defpackage.B4;
import defpackage.Br;
import defpackage.C0173fi;
import defpackage.C0204gi;
import defpackage.C0426np;
import defpackage.C0481pi;
import defpackage.C0487po;
import defpackage.C0709x;
import defpackage.C0740y;
import defpackage.C4;
import defpackage.C7;
import defpackage.Ck;
import defpackage.D4;
import defpackage.Dt;
import defpackage.E;
import defpackage.E4;
import defpackage.Et;
import defpackage.Ft;
import defpackage.Gs;
import defpackage.Ks;
import defpackage.L7;
import defpackage.O7;
import defpackage.Q0;
import defpackage.RunnableC0650v2;
import defpackage.ViewOnAttachStateChangeListenerC0092ct;
import defpackage.Vo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends L7 {
    public final E4 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public Ks M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;
    public final int a;
    public boolean a0;
    public boolean b;
    public HashMap b0;
    public final float c;
    public final SparseIntArray c0;
    public final int d;
    public final C4 d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final C0204gi i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final C0487po y;
    public boolean z;

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new E4(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new C4(this, 0);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = Gs.a;
        if (AbstractC0676vs.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewV = v(viewGroup.getChildAt(i));
                if (viewV != null) {
                    return viewV;
                }
            }
        }
        return null;
    }

    public static int w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(Vo.h(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.b && y(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.U.get();
        RunnableC0650v2 runnableC0650v2 = new RunnableC0650v2(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = Gs.a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0650v2);
                return;
            }
        }
        runnableC0650v2.run();
    }

    public final void C(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            Vo.l(arrayList.get(0));
            throw null;
        }
    }

    public final boolean D(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            Ks r1 = r2.M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            E4 r3 = r2.A
            r3.a(r4)
            goto L43
        L40:
            r2.C(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Gs.g(view, 524288);
        Gs.e(view, 0);
        Gs.g(view, 262144);
        Gs.e(view, 0);
        Gs.g(view, 1048576);
        Gs.e(view, 0);
        SparseIntArray sparseIntArray = this.c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            Gs.g(view, i);
            Gs.e(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 6;
        if (!this.b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            Q0 q0 = new Q0(this, i2);
            ArrayList arrayListC = Gs.c(view);
            int i3 = 0;
            while (true) {
                if (i3 >= arrayListC.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = Gs.d[i5];
                        boolean z = true;
                        for (int i7 = 0; i7 < arrayListC.size(); i7++) {
                            z &= ((E) arrayListC.get(i7)).a() != i6;
                        }
                        if (z) {
                            i4 = i6;
                        }
                    }
                    iA = i4;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((E) arrayListC.get(i3)).a).getLabel())) {
                    iA = ((E) arrayListC.get(i3)).a();
                    break;
                }
                i3++;
            }
            if (iA != -1) {
                E e = new E(null, iA, string, q0, null);
                View.AccessibilityDelegate accessibilityDelegateB = Gs.b(view);
                C0740y c0740y = accessibilityDelegateB == null ? null : accessibilityDelegateB instanceof C0709x ? ((C0709x) accessibilityDelegateB).a : new C0740y(accessibilityDelegateB);
                if (c0740y == null) {
                    c0740y = new C0740y();
                }
                Gs.j(view, c0740y);
                Gs.g(view, e.a());
                Gs.c(view).add(e);
                Gs.e(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I) {
            int i8 = 5;
            if (this.L != 5) {
                Gs.h(view, E.j, new Q0(this, i8));
            }
        }
        int i9 = this.L;
        int i10 = 4;
        int i11 = 3;
        if (i9 == 3) {
            Gs.h(view, E.i, new Q0(this, this.b ? 4 : 6));
            return;
        }
        if (i9 == 4) {
            Gs.h(view, E.h, new Q0(this, this.b ? 3 : 6));
        } else {
            if (i9 != 6) {
                return;
            }
            Gs.h(view, E.i, new Q0(this, i10));
            Gs.h(view, E.h, new Q0(this, i11));
        }
    }

    public final void G(int i, boolean z) {
        C0204gi c0204gi = this.i;
        ValueAnimator valueAnimator = this.B;
        if (i == 2) {
            return;
        }
        boolean z2 = this.L == 3 && (this.x || z());
        if (this.z == z2 || c0204gi == null) {
            return;
        }
        this.z = z2;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0204gi.a.j, z2 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fS = this.z ? s() : 1.0f;
        C0173fi c0173fi = c0204gi.a;
        if (c0173fi.j != fS) {
            c0173fi.j = fS;
            c0204gi.e = true;
            c0204gi.invalidateSelf();
        }
    }

    public final void H(boolean z) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.b0 != null) {
                    return;
                } else {
                    this.b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z) {
                    this.b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.U != null) {
            r();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.L7
    public final void c(O7 o7) {
        this.U = null;
        this.M = null;
    }

    @Override // defpackage.L7
    public final void e() {
        this.U = null;
        this.M = null;
    }

    @Override // defpackage.L7
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        Ks ks;
        if (!view.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference weakReference = this.V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.o(view, x, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (ks = this.M) != null && ks.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.M.b)) ? false : true;
    }

    @Override // defpackage.L7
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.l;
        C0204gi c0204gi = this.i;
        int i3 = 5;
        WeakHashMap weakHashMap = Gs.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z = (i4 < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                B4 b4 = new B4(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0481pi c0481pi = new C0481pi();
                c0481pi.a = paddingStart;
                c0481pi.b = paddingEnd;
                c0481pi.c = paddingBottom;
                AbstractC0676vs.u(view, new C0426np(b4, i3, c0481pi));
                if (view.isAttachedToWindow()) {
                    AbstractC0614ts.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0092ct());
                }
            }
            C7 c7 = new C7(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new Ft(c7));
            } else {
                PathInterpolator pathInterpolator = Et.e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener dt = new Dt(view, c7);
                view.setTag(R.id.tag_window_insets_animation_callback, dt);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(dt);
                }
            }
            this.U = new WeakReference(view);
            Context context = view.getContext();
            Br.i0(context, R.attr.motionEasingStandardDecelerateInterpolator, Ck.b(0.0f, 0.0f, 0.0f, 1.0f));
            Br.h0(context, R.attr.motionDurationMedium2, 300);
            Br.h0(context, R.attr.motionDurationShort3, 150);
            Br.h0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c0204gi != null) {
                view.setBackground(c0204gi);
                float fI = this.H;
                if (fI == -1.0f) {
                    fI = AbstractC0676vs.i(view);
                }
                c0204gi.k(fI);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    AbstractC0676vs.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new Ks(coordinatorLayout.getContext(), coordinatorLayout, this.d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int iMin = this.T;
        int i5 = iMin - height;
        int i6 = this.w;
        if (i5 < i6) {
            if (this.r) {
                if (i2 != -1) {
                    iMin = Math.min(iMin, i2);
                }
                this.R = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i2 != -1) {
                    iMin2 = Math.min(iMin2, i2);
                }
                this.R = iMin2;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        r();
        int i7 = this.L;
        if (i7 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i7 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.L, false);
        this.V = new WeakReference(v(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        Vo.l(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.L7
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.L7
    public final boolean i(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // defpackage.L7
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z = this.K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                WeakHashMap weakHashMap = Gs.a;
                view.offsetTopAndBottom(-iX);
                C(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = Gs.a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.G;
            if (i4 > i5 && !this.I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = Gs.a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = Gs.a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // defpackage.L7
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // defpackage.L7
    public final void m(View view, Parcelable parcelable) {
        D4 d4 = (D4) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = d4.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = d4.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = d4.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = d4.g;
            }
        }
        int i2 = d4.c;
        if (i2 == 1 || i2 == 2) {
            this.L = 4;
        } else {
            this.L = i2;
        }
    }

    @Override // defpackage.L7
    public final Parcelable n(View view) {
        return new D4(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.L7
    public final boolean o(View view, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // defpackage.L7
    public final void p(View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null && view2 == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.b && view.getTop() > this.E) {
                    i3 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.X.getYVelocity(this.Y);
                }
                if (D(view, yVelocity)) {
                    i3 = 5;
                } else if (this.O == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.E;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.O == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.E;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                    i3 = 4;
                }
            } else {
                if (!this.b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            E(view, i3, false);
            this.P = false;
        }
    }

    @Override // defpackage.L7
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        Ks ks = this.M;
        if (ks != null && (this.K || i == 1)) {
            ks.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            Ks ks2 = this.M;
            if (fAbs > ks2.b) {
                ks2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void r() {
        int iT = t();
        if (this.b) {
            this.G = Math.max(this.T - iT, this.D);
        } else {
            this.G = this.T - iT;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.i != null && (weakReference = this.U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C0204gi c0204gi = this.i;
                float fA = c0204gi.a.a.e.a(c0204gi.h());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fA;
                    }
                } else {
                    f = 0.0f;
                }
                C0204gi c0204gi2 = this.i;
                float fA2 = c0204gi2.a.a.f.a(c0204gi2.h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f2 = radius2 / fA2;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R) + this.v;
        }
        return (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            Vo.l(arrayList.get(0));
            throw null;
        }
    }

    public final int x() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(Vo.e(i, "Invalid state to get top offset: "));
    }

    public final boolean z() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new E4(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new C4(this, i2);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.b);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = Br.u(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.y = C0487po.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        C0487po c0487po = this.y;
        if (c0487po != null) {
            C0204gi c0204gi = new C0204gi(c0487po);
            this.i = c0204gi;
            c0204gi.j(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new A4(this, i2));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            A(i);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                B(4);
            }
            F();
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.U != null) {
                r();
            }
            C((this.b && this.L == 6) ? 3 : this.L);
            G(this.L, true);
            F();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.C = i3;
                    G(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    G(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
