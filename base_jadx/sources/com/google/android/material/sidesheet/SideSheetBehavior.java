package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.AbstractC0638ul;
import defpackage.AbstractC0676vs;
import defpackage.As;
import defpackage.Br;
import defpackage.C0204gi;
import defpackage.C0247i;
import defpackage.C0448og;
import defpackage.C0456oo;
import defpackage.C0487po;
import defpackage.C4;
import defpackage.Ck;
import defpackage.E;
import defpackage.E4;
import defpackage.Eo;
import defpackage.Gs;
import defpackage.Ks;
import defpackage.L7;
import defpackage.O7;
import defpackage.U;
import defpackage.Ud;
import defpackage.Vo;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends L7 {
    public Ud a;
    public final C0204gi b;
    public final ColorStateList c;
    public final C0487po d;
    public final E4 e;
    public final float f;
    public final boolean g;
    public int h;
    public Ks i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final C4 v;

    public SideSheetBehavior() {
        this.e = new E4(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new C4(this, 1);
    }

    @Override // defpackage.L7
    public final void c(O7 o7) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.L7
    public final void e() {
        this.p = null;
        this.i = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.L7
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked;
        Ks ks;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            WeakHashMap weakHashMap = Gs.a;
            if (As.b(view) != null) {
                if (this.g) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 && (velocityTracker = this.s) != null) {
                        velocityTracker.recycle();
                        this.s = null;
                    }
                    if (this.s == null) {
                        this.s = VelocityTracker.obtain();
                    }
                    this.s.addMovement(motionEvent);
                    if (actionMasked == 0) {
                        this.t = (int) motionEvent.getX();
                    } else if ((actionMasked != 1 || actionMasked == 3) && this.j) {
                        this.j = false;
                        return false;
                    }
                    return this.j && (ks = this.i) != null && ks.p(motionEvent);
                }
            }
        } else if (this.g) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                velocityTracker.recycle();
                this.s = null;
            }
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            if (actionMasked == 0) {
                if (actionMasked != 1) {
                    this.j = false;
                    return false;
                }
                this.j = false;
                return false;
            }
            this.t = (int) motionEvent.getX();
            if (this.j) {
            }
        }
        this.j = true;
        return false;
    }

    @Override // defpackage.L7
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int iB = 0;
        int i3 = 1;
        C0204gi c0204gi = this.b;
        WeakHashMap weakHashMap = Gs.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.p == null) {
            this.p = new WeakReference(view);
            Context context = view.getContext();
            Br.i0(context, R.attr.motionEasingStandardDecelerateInterpolator, Ck.b(0.0f, 0.0f, 0.0f, 1.0f));
            Br.h0(context, R.attr.motionDurationMedium2, 300);
            Br.h0(context, R.attr.motionDurationShort3, 150);
            Br.h0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0204gi != null) {
                view.setBackground(c0204gi);
                float fI = this.f;
                if (fI == -1.0f) {
                    fI = AbstractC0676vs.i(view);
                }
                c0204gi.k(fI);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    AbstractC0676vs.q(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (As.b(view) == null) {
                Gs.k(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((O7) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        Ud ud = this.a;
        if (ud == null || ud.E() != i5) {
            C0487po c0487po = this.d;
            O7 o7 = null;
            if (i5 == 0) {
                this.a = new C0448og(this, i3);
                if (c0487po != null) {
                    WeakReference weakReference = this.p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof O7)) {
                        o7 = (O7) view3.getLayoutParams();
                    }
                    if (o7 == null || ((ViewGroup.MarginLayoutParams) o7).rightMargin <= 0) {
                        C0456oo c0456ooE = c0487po.e();
                        c0456ooE.f = new C0247i(0.0f);
                        c0456ooE.g = new C0247i(0.0f);
                        C0487po c0487poA = c0456ooE.a();
                        if (c0204gi != null) {
                            c0204gi.setShapeAppearanceModel(c0487poA);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i5 + ". Must be 0 or 1.");
                }
                this.a = new C0448og(this, iB);
                if (c0487po != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof O7)) {
                        o7 = (O7) view2.getLayoutParams();
                    }
                    if (o7 == null || ((ViewGroup.MarginLayoutParams) o7).leftMargin <= 0) {
                        C0456oo c0456ooE2 = c0487po.e();
                        c0456ooE2.e = new C0247i(0.0f);
                        c0456ooE2.h = new C0247i(0.0f);
                        C0487po c0487poA2 = c0456ooE2.a();
                        if (c0204gi != null) {
                            c0204gi.setShapeAppearanceModel(c0487poA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new Ks(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int iB2 = this.a.B(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.C(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.d(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iB = iB2 - this.a.B(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iB = this.a.t();
        }
        view.offsetLeftAndRight(iB);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            Vo.l(it.next());
        }
        return true;
    }

    @Override // defpackage.L7
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.L7
    public final void m(View view, Parcelable parcelable) {
        int i = ((Eo) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.L7
    public final Parcelable n(View view) {
        return new Eo(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.L7
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float fAbs = Math.abs(this.t - motionEvent.getX());
            Ks ks = this.i;
            if (fAbs > ks.b) {
                ks.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (it.hasNext()) {
            Vo.l(it.next());
            throw null;
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            Ud r0 = r2.a
            int r0 = r0.t()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = defpackage.Vo.e(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            Ud r0 = r2.a
            int r0 = r0.s()
        L1f:
            Ks r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            E4 r3 = r2.e
            r3.a(r4)
            goto L5a
        L57:
            r2.r(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Gs.g(view, 262144);
        Gs.e(view, 0);
        Gs.g(view, 1048576);
        Gs.e(view, 0);
        final int i = 5;
        if (this.h != 5) {
            Gs.h(view, E.j, new U() { // from class: Do
                /* JADX WARN: Code duplicated, block: B:19:0x003f  */
                @Override // defpackage.U
                public final boolean a(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.a;
                    sideSheetBehavior.getClass();
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(Vo.h(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i2);
                    } else {
                        View view3 = (View) sideSheetBehavior.p.get();
                        F9 f9 = new F9(i2, sideSheetBehavior, 4);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            f9.run();
                        } else {
                            WeakHashMap weakHashMap = Gs.a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(f9);
                            } else {
                                f9.run();
                            }
                        }
                    }
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            Gs.h(view, E.h, new U() { // from class: Do
                /* JADX WARN: Code duplicated, block: B:19:0x003f  */
                @Override // defpackage.U
                public final boolean a(View view2) {
                    SideSheetBehavior sideSheetBehavior = this.a;
                    sideSheetBehavior.getClass();
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        throw new IllegalArgumentException(Vo.h(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.p.get();
                        F9 f9 = new F9(i3, sideSheetBehavior, 4);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            f9.run();
                        } else {
                            WeakHashMap weakHashMap = Gs.a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(f9);
                            } else {
                                f9.run();
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new E4(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new C4(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.y);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = Br.u(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = C0487po.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = Gs.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0487po c0487po = this.d;
        if (c0487po != null) {
            C0204gi c0204gi = new C0204gi(c0487po);
            this.b = c0204gi;
            c0204gi.j(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
