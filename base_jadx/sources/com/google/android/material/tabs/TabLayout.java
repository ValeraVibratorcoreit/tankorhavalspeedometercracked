package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.A4;
import defpackage.AbstractC0340l1;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0637uk;
import defpackage.AbstractC0638ul;
import defpackage.AbstractC0676vs;
import defpackage.AbstractC0700wl;
import defpackage.Br;
import defpackage.C0058bq;
import defpackage.C0089cq;
import defpackage.C0150eq;
import defpackage.C0204gi;
import defpackage.C0241ho;
import defpackage.C0387mh;
import defpackage.C0534ra;
import defpackage.F4;
import defpackage.Gs;
import defpackage.O9;
import defpackage.Ok;
import defpackage.Pk;
import defpackage.Td;
import defpackage.Tf;
import defpackage.Us;
import defpackage.Yp;
import defpackage.Zp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final Pk P = new Pk(16);
    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public C0387mh I;
    public final TimeInterpolator J;
    public Yp K;
    public final ArrayList L;
    public ValueAnimator M;
    public boolean N;
    public final Ok O;
    public int a;
    public final ArrayList b;
    public C0089cq c;
    public final C0058bq d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public int p;
    public final PorterDuff.Mode q;
    public final float r;
    public final float s;
    public final int t;
    public int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public int z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(Td.Q(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.u = Integer.MAX_VALUE;
        this.F = -1;
        this.L = new ArrayList();
        this.O = new Ok(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C0058bq c0058bq = new C0058bq(this, context2);
        this.d = c0058bq;
        super.addView(c0058bq, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayZ = AbstractC0390mk.z(context2, attributeSet, AbstractC0638ul.A, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListK = AbstractC0390mk.k(getBackground());
        if (colorStateListK != null) {
            C0204gi c0204gi = new C0204gi();
            c0204gi.l(colorStateListK);
            c0204gi.j(context2);
            WeakHashMap weakHashMap = Gs.a;
            c0204gi.k(AbstractC0676vs.i(this));
            setBackground(c0204gi);
        }
        setSelectedTabIndicator(Br.x(context2, typedArrayZ, 5));
        setSelectedTabIndicatorColor(typedArrayZ.getColor(8, 0));
        c0058bq.b(typedArrayZ.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayZ.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayZ.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayZ.getBoolean(9, true));
        int dimensionPixelSize = typedArrayZ.getDimensionPixelSize(16, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = typedArrayZ.getDimensionPixelSize(19, dimensionPixelSize);
        this.f = typedArrayZ.getDimensionPixelSize(20, dimensionPixelSize);
        this.g = typedArrayZ.getDimensionPixelSize(18, dimensionPixelSize);
        this.h = typedArrayZ.getDimensionPixelSize(17, dimensionPixelSize);
        if (Tf.S(context2, R.attr.isMaterial3Theme, false)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayZ.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = AbstractC0700wl.w;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.r = dimensionPixelSize2;
            this.l = Br.u(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayZ.hasValue(22)) {
                this.k = typedArrayZ.getResourceId(22, resourceId);
            }
            int i = this.k;
            if (i != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListU = Br.u(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListU != null) {
                        this.l = d(this.l.getDefaultColor(), colorStateListU.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListU.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayZ.hasValue(25)) {
                this.l = Br.u(context2, typedArrayZ, 25);
            }
            if (typedArrayZ.hasValue(23)) {
                this.l = d(this.l.getDefaultColor(), typedArrayZ.getColor(23, 0));
            }
            this.m = Br.u(context2, typedArrayZ, 3);
            this.q = Tf.P(typedArrayZ.getInt(4, -1), null);
            this.n = Br.u(context2, typedArrayZ, 21);
            this.A = typedArrayZ.getInt(6, 300);
            this.J = Br.i0(context2, R.attr.motionEasingEmphasizedInterpolator, AbstractC0340l1.b);
            this.v = typedArrayZ.getDimensionPixelSize(14, -1);
            this.w = typedArrayZ.getDimensionPixelSize(13, -1);
            this.t = typedArrayZ.getResourceId(0, 0);
            this.y = typedArrayZ.getDimensionPixelSize(1, 0);
            this.C = typedArrayZ.getInt(15, 1);
            this.z = typedArrayZ.getInt(2, 0);
            this.D = typedArrayZ.getBoolean(12, false);
            this.H = typedArrayZ.getBoolean(26, false);
            typedArrayZ.recycle();
            Resources resources = getResources();
            this.s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            b();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static ColorStateList d(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0089cq c0089cq = (C0089cq) arrayList.get(i);
            if (c0089cq != null && c0089cq.a != null && !TextUtils.isEmpty(c0089cq.b)) {
                if (!this.D) {
                    return 72;
                }
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int i2 = this.C;
        if (i2 == 0 || i2 == 2) {
            return this.x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C0058bq c0058bq = this.d;
        int childCount = c0058bq.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = c0058bq.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof C0150eq) {
                        ((C0150eq) childAt).g();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = Gs.a;
            if (isLaidOut()) {
                C0058bq c0058bq = this.d;
                int childCount = c0058bq.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c0058bq.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iC = c(i);
                if (scrollX != iC) {
                    e();
                    this.M.setIntValues(scrollX, iC);
                    this.M.start();
                }
                ValueAnimator valueAnimator = c0058bq.a;
                if (valueAnimator != null && valueAnimator.isRunning() && c0058bq.b.a != i) {
                    c0058bq.a.cancel();
                }
                c0058bq.d(i, this.A, true);
                return;
            }
        }
        i(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b() {
        int i = this.C;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.y - this.e) : 0;
        WeakHashMap weakHashMap = Gs.a;
        C0058bq c0058bq = this.d;
        c0058bq.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.C;
        if (i2 == 0) {
            int i3 = this.z;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                c0058bq.setGravity(1);
            } else if (i3 == 2) {
            }
            c0058bq.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.z == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            c0058bq.setGravity(1);
        }
        j(true);
    }

    public final int c(int i) {
        C0058bq c0058bq;
        View childAt;
        int i2 = this.C;
        if ((i2 != 0 && i2 != 2) || (childAt = (c0058bq = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < c0058bq.getChildCount() ? c0058bq.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * 0.0f);
        WeakHashMap weakHashMap = Gs.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void e() {
        if (this.M == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.M = valueAnimator;
            valueAnimator.setInterpolator(this.J);
            this.M.setDuration(this.A);
            this.M.addUpdateListener(new A4(this, 2));
        }
    }

    public final C0089cq f() {
        C0089cq c0089cq = (C0089cq) P.b();
        if (c0089cq == null) {
            c0089cq = new C0089cq();
            c0089cq.d = -1;
            c0089cq.h = -1;
        }
        c0089cq.f = this;
        Ok ok = this.O;
        C0150eq c0150eq = ok != null ? (C0150eq) ok.b() : null;
        if (c0150eq == null) {
            c0150eq = new C0150eq(this, getContext());
        }
        c0150eq.setTab(c0089cq);
        c0150eq.setFocusable(true);
        c0150eq.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c0089cq.c)) {
            c0150eq.setContentDescription(c0089cq.b);
        } else {
            c0150eq.setContentDescription(c0089cq.c);
        }
        c0089cq.g = c0150eq;
        int i = c0089cq.h;
        if (i != -1) {
            c0150eq.setId(i);
        }
        return c0089cq;
    }

    public final void g() {
        C0058bq c0058bq = this.d;
        int childCount = c0058bq.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C0150eq c0150eq = (C0150eq) c0058bq.getChildAt(childCount);
            c0058bq.removeViewAt(childCount);
            if (c0150eq != null) {
                c0150eq.setTab(null);
                c0150eq.setSelected(false);
                this.O.a(c0150eq);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            C0089cq c0089cq = (C0089cq) it.next();
            it.remove();
            c0089cq.f = null;
            c0089cq.g = null;
            c0089cq.a = null;
            c0089cq.h = -1;
            c0089cq.b = null;
            c0089cq.c = null;
            c0089cq.d = -1;
            c0089cq.e = null;
            P.a(c0089cq);
        }
        this.c = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C0089cq c0089cq = this.c;
        if (c0089cq != null) {
            return c0089cq.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.G;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final void h(C0089cq c0089cq) {
        C0089cq c0089cq2 = this.c;
        ArrayList arrayList = this.L;
        if (c0089cq2 == c0089cq) {
            if (c0089cq2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Yp) arrayList.get(size)).getClass();
                }
                a(c0089cq.d);
                return;
            }
            return;
        }
        int i = c0089cq != null ? c0089cq.d : -1;
        if ((c0089cq2 == null || c0089cq2.d == -1) && i != -1) {
            i(i);
        } else {
            a(i);
        }
        if (i != -1) {
            setSelectedTabView(i);
        }
        this.c = c0089cq;
        if (c0089cq2 != null && c0089cq2.f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((Yp) arrayList.get(size2)).getClass();
            }
        }
        if (c0089cq != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                C0241ho c0241ho = (C0241ho) ((Yp) arrayList.get(size3));
                c0241ho.getClass();
                c0241ho.a.O(c0089cq.d);
            }
        }
    }

    public final void i(int i) {
        float f = i + 0.0f;
        int iRound = Math.round(f);
        if (iRound >= 0) {
            C0058bq c0058bq = this.d;
            if (iRound >= c0058bq.getChildCount()) {
                return;
            }
            c0058bq.b.a = Math.round(f);
            ValueAnimator valueAnimator = c0058bq.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c0058bq.a.cancel();
            }
            c0058bq.c(c0058bq.getChildAt(i), c0058bq.getChildAt(i + 1), 0.0f);
            ValueAnimator valueAnimator2 = this.M;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.M.cancel();
            }
            int iC = c(i);
            int scrollX = getScrollX();
            if ((i >= getSelectedTabPosition() || iC < scrollX) && (i <= getSelectedTabPosition() || iC > scrollX)) {
                getSelectedTabPosition();
            }
            WeakHashMap weakHashMap = Gs.a;
            if (getLayoutDirection() == 1 && ((i >= getSelectedTabPosition() || iC > scrollX) && (i <= getSelectedTabPosition() || iC < scrollX))) {
                getSelectedTabPosition();
            }
            if (i < 0) {
                iC = 0;
            }
            scrollTo(iC, 0);
            setSelectedTabView(iRound);
        }
    }

    public final void j(boolean z) {
        int i = 0;
        while (true) {
            C0058bq c0058bq = this.d;
            if (i >= c0058bq.getChildCount()) {
                return;
            }
            View childAt = c0058bq.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.C == 1 && this.z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0204gi) {
            F4.a0(this, (C0204gi) background);
        }
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.N) {
            setupWithViewPager(null);
            this.N = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0150eq c0150eq;
        Drawable drawable;
        int i = 0;
        while (true) {
            C0058bq c0058bq = this.d;
            if (i >= c0058bq.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = c0058bq.getChildAt(i);
            if ((childAt instanceof C0150eq) && (drawable = (c0150eq = (C0150eq) childAt).i) != null) {
                drawable.setBounds(c0150eq.getLeft(), c0150eq.getTop(), c0150eq.getRight(), c0150eq.getBottom());
                c0150eq.i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(Tf.n(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iN = this.w;
            if (iN <= 0) {
                iN = (int) (size - Tf.n(getContext(), 56));
            }
            this.u = iN;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.C;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0204gi) {
            ((C0204gi) background).k(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.D == z) {
            return;
        }
        this.D = z;
        int i = 0;
        while (true) {
            C0058bq c0058bq = this.d;
            if (i >= c0058bq.getChildCount()) {
                b();
                return;
            }
            View childAt = c0058bq.getChildAt(i);
            if (childAt instanceof C0150eq) {
                C0150eq c0150eq = (C0150eq) childAt;
                c0150eq.setOrientation(!c0150eq.k.D ? 1 : 0);
                TextView textView = c0150eq.g;
                if (textView == null && c0150eq.h == null) {
                    c0150eq.h(c0150eq.b, c0150eq.c, true);
                } else {
                    c0150eq.h(textView, c0150eq.h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(Zp zp) {
        setOnTabSelectedListener((Yp) zp);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.M.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        int i = this.p;
        if (i != 0) {
            O9.g(drawableMutate, i);
        } else {
            O9.h(drawableMutate, null);
        }
        int intrinsicHeight = this.F;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.o.getIntrinsicHeight();
        }
        this.d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            O9.g(drawable, i);
        } else {
            O9.h(drawable, null);
        }
        j(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.B != i) {
            this.B = i;
            WeakHashMap weakHashMap = Gs.a;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.F = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.z != i) {
            this.z = i;
            b();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0150eq c0150eq = ((C0089cq) arrayList.get(i)).g;
                if (c0150eq != null) {
                    c0150eq.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(F4.C(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.G = i;
        if (i == 0) {
            this.I = new C0387mh(22);
            return;
        }
        if (i == 1) {
            this.I = new C0534ra(0);
        } else {
            if (i == 2) {
                this.I = new C0534ra(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.E = z;
        int i = C0058bq.c;
        C0058bq c0058bq = this.d;
        c0058bq.a(c0058bq.b.getSelectedTabPosition());
        WeakHashMap weakHashMap = Gs.a;
        c0058bq.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.C) {
            this.C = i;
            b();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        int i = 0;
        while (true) {
            C0058bq c0058bq = this.d;
            if (i >= c0058bq.getChildCount()) {
                return;
            }
            View childAt = c0058bq.getChildAt(i);
            if (childAt instanceof C0150eq) {
                Context context = getContext();
                int i2 = C0150eq.l;
                ((C0150eq) childAt).f(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(F4.C(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0150eq c0150eq = ((C0089cq) arrayList.get(i)).g;
                if (c0150eq != null) {
                    c0150eq.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC0637uk abstractC0637uk) {
        g();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.H == z) {
            return;
        }
        this.H = z;
        int i = 0;
        while (true) {
            C0058bq c0058bq = this.d;
            if (i >= c0058bq.getChildCount()) {
                return;
            }
            View childAt = c0058bq.getChildAt(i);
            if (childAt instanceof C0150eq) {
                Context context = getContext();
                int i2 = C0150eq.l;
                ((C0150eq) childAt).f(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(Us us) {
        g();
        this.N = false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(Yp yp) {
        Yp yp2 = this.K;
        ArrayList arrayList = this.L;
        if (yp2 != null) {
            arrayList.remove(yp2);
        }
        this.K = yp;
        if (yp == null || arrayList.contains(yp)) {
            return;
        }
        arrayList.add(yp);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(F4.F(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
