package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC0453ol;
import defpackage.AbstractC0614ts;
import defpackage.AbstractC0676vs;
import defpackage.C0296jj;
import defpackage.C0308k0;
import defpackage.Cj;
import defpackage.Dj;
import defpackage.Ej;
import defpackage.Fo;
import defpackage.Gs;
import defpackage.H7;
import defpackage.L7;
import defpackage.M7;
import defpackage.Ms;
import defpackage.N7;
import defpackage.Nk;
import defpackage.O7;
import defpackage.P7;
import defpackage.P9;
import defpackage.Pk;
import defpackage.Q7;
import defpackage.V5;
import defpackage.Vt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements Cj, Dj {
    public static final String t;
    public static final Class[] u;
    public static final ThreadLocal v;
    public static final V5 w;
    public static final Pk x;
    public final ArrayList a;
    public final C0296jj b;
    public final ArrayList c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public P7 l;
    public boolean m;
    public Vt n;
    public boolean o;
    public Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public C0308k0 r;
    public final Ej s;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        t = r0 != null ? r0.getName() : null;
        w = new V5(1);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new Pk(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.a = new ArrayList();
        this.b = new C0296jj(3);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.s = new Ej();
        int[] iArr = AbstractC0453ol.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.i;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new N7(this));
        WeakHashMap weakHashMap = Gs.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) x.b();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, O7 o7, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = o7.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = o7.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static O7 n(View view) {
        O7 o7 = (O7) view.getLayoutParams();
        if (!o7.b) {
            M7 m7 = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                m7 = (M7) superclass.getAnnotation(M7.class);
                if (m7 != null) {
                    break;
                }
            }
            if (m7 != null) {
                try {
                    L7 l7 = (L7) m7.value().getDeclaredConstructor(null).newInstance(null);
                    L7 l8 = o7.a;
                    if (l8 != l7) {
                        if (l8 != null) {
                            l8.e();
                        }
                        o7.a = l7;
                        o7.b = true;
                        if (l7 != null) {
                            l7.c(o7);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + m7.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            o7.b = true;
        }
        return o7;
    }

    public static void u(View view, int i) {
        O7 o7 = (O7) view.getLayoutParams();
        int i2 = o7.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = Gs.a;
            view.offsetLeftAndRight(i - i2);
            o7.i = i;
        }
    }

    public static void v(View view, int i) {
        O7 o7 = (O7) view.getLayoutParams();
        int i2 = o7.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = Gs.a;
            view.offsetTopAndBottom(i - i2);
            o7.j = i;
        }
    }

    @Override // defpackage.Cj
    public final void a(View view, View view2, int i, int i2) {
        Ej ej = this.s;
        if (i2 == 1) {
            ej.b = i;
        } else {
            ej.a = i;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((O7) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.Cj
    public final void b(View view, int i) {
        Ej ej = this.s;
        if (i == 1) {
            ej.b = 0;
        } else {
            ej.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            O7 o7 = (O7) childAt.getLayoutParams();
            if (o7.a(i)) {
                L7 l7 = o7.a;
                if (l7 != null) {
                    l7.p(childAt, view, i);
                }
                if (i == 0) {
                    o7.n = false;
                } else if (i == 1) {
                    o7.o = false;
                }
                o7.getClass();
            }
        }
        this.k = null;
    }

    @Override // defpackage.Cj
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        L7 l7;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                O7 o7 = (O7) childAt.getLayoutParams();
                if (o7.a(i3) && (l7 = o7.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    l7.j(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof O7) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.Dj
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        L7 l7;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                O7 o7 = (O7) childAt.getLayoutParams();
                if (o7.a(i5) && (l7 = o7.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    l7.k(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        L7 l7 = ((O7) view.getLayoutParams()).a;
        if (l7 != null) {
            l7.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.Cj
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // defpackage.Cj
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                O7 o7 = (O7) childAt.getLayoutParams();
                L7 l7 = o7.a;
                if (l7 != null) {
                    boolean zO = l7.o(childAt, i, i2);
                    z |= zO;
                    if (i2 == 0) {
                        o7.n = zO;
                    } else if (i2 == 1) {
                        o7.o = zO;
                    }
                } else if (i2 == 0) {
                    o7.n = false;
                } else if (i2 == 1) {
                    o7.o = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new O7();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new O7(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.a);
    }

    public final Vt getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Ej ej = this.s;
        return ej.b | ej.a;
    }

    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(O7 o7, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o7).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) o7).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) o7).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) o7).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        Fo fo = (Fo) this.b.d;
        int i = fo.c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) fo.l(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fo.h(i2));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = Ms.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = Ms.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        Ms.a(this, view, matrix);
        ThreadLocal threadLocal3 = Ms.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        Pk pk = x;
        Rect rectG = g();
        k(rectG, view);
        try {
            return rectG.contains(i, i2);
        } finally {
            rectG.setEmpty();
            pk.a(rectG);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.m) {
            if (this.l == null) {
                this.l = new P7(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null) {
            WeakHashMap weakHashMap = Gs.a;
            if (getFitsSystemWindows()) {
                AbstractC0614ts.c(this);
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            b(view, 0);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.o || this.p == null) {
            return;
        }
        Vt vt = this.n;
        int iD = vt != null ? vt.d() : 0;
        if (iD > 0) {
            this.p.setBounds(0, 0, getWidth(), iD);
            this.p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return zR;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        L7 l7;
        WeakHashMap weakHashMap = Gs.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((l7 = ((O7) view.getLayoutParams()).a) == null || !l7.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        L7 l7;
        int i6;
        ArrayList arrayList;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int iMax;
        s();
        int childCount = getChildCount();
        int i14 = 0;
        loop0: while (true) {
            if (i14 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i14);
            Fo fo = (Fo) this.b.d;
            int i15 = fo.c;
            for (int i16 = 0; i16 < i15; i16++) {
                ArrayList arrayList2 = (ArrayList) fo.l(i16);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i14++;
        }
        if (z != this.m) {
            if (z) {
                if (this.h) {
                    if (this.l == null) {
                        this.l = new P7(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.l);
                }
                this.m = true;
            } else {
                if (this.h && this.l != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.l);
                }
                this.m = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = Gs.a;
        int layoutDirection = getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z5 = this.n != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.a;
        int size3 = arrayList3.size();
        int i19 = suggestedMinimumWidth;
        int i20 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i21 = 0;
        while (i21 < size3) {
            View view = (View) arrayList3.get(i21);
            if (view.getVisibility() == 8) {
                i11 = i21;
                i6 = size3;
                arrayList = arrayList3;
                i9 = paddingLeft;
                i12 = paddingRight;
                i7 = layoutDirection;
                z3 = true;
                z2 = false;
            } else {
                O7 o7 = (O7) view.getLayoutParams();
                int i22 = o7.e;
                if (i22 < 0 || mode == 0) {
                    i3 = iCombineMeasuredStates;
                    i4 = i21;
                } else {
                    int iM = m(i22);
                    i3 = iCombineMeasuredStates;
                    int i23 = o7.c;
                    if (i23 == 0) {
                        i23 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, layoutDirection) & 7;
                    i4 = i21;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iM - paddingLeft);
                        }
                        if (z5 || view.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iC = this.n.c() + this.n.b();
                            int iA = this.n.a() + this.n.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        l7 = o7.a;
                        if (l7 != null) {
                            int i24 = i3;
                            i11 = i4;
                            z2 = false;
                            i9 = paddingLeft;
                            i10 = i24;
                            i12 = paddingRight;
                            i13 = i20;
                            i7 = layoutDirection;
                            i8 = i19;
                            i6 = size3;
                            arrayList = arrayList3;
                            if (!l7.h(this, view, iMakeMeasureSpec, i5, iMakeMeasureSpec2)) {
                            }
                            int iMax2 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) o7).leftMargin + ((ViewGroup.MarginLayoutParams) o7).rightMargin);
                            int iMax3 = Math.max(i13, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) o7).topMargin + ((ViewGroup.MarginLayoutParams) o7).bottomMargin);
                            i19 = iMax2;
                            iCombineMeasuredStates = View.combineMeasuredStates(i10, view.getMeasuredState());
                            i20 = iMax3;
                            z3 = true;
                        } else {
                            i6 = size3;
                            arrayList = arrayList3;
                            i7 = layoutDirection;
                            z2 = false;
                            i8 = i19;
                            int i25 = i4;
                            i9 = paddingLeft;
                            i10 = i3;
                            i11 = i25;
                            i12 = paddingRight;
                            i13 = i20;
                        }
                        measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                        int iMax4 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) o7).leftMargin + ((ViewGroup.MarginLayoutParams) o7).rightMargin);
                        int iMax5 = Math.max(i13, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) o7).topMargin + ((ViewGroup.MarginLayoutParams) o7).bottomMargin);
                        i19 = iMax4;
                        iCombineMeasuredStates = View.combineMeasuredStates(i10, view.getMeasuredState());
                        i20 = iMax5;
                        z3 = true;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM);
                    }
                    i5 = iMax;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    l7 = o7.a;
                    if (l7 != null) {
                        int i26 = i3;
                        i11 = i4;
                        z2 = false;
                        i9 = paddingLeft;
                        i10 = i26;
                        i12 = paddingRight;
                        i13 = i20;
                        i7 = layoutDirection;
                        i8 = i19;
                        i6 = size3;
                        arrayList = arrayList3;
                        if (!l7.h(this, view, iMakeMeasureSpec, i5, iMakeMeasureSpec2)) {
                        }
                        int iMax6 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) o7).leftMargin + ((ViewGroup.MarginLayoutParams) o7).rightMargin);
                        int iMax7 = Math.max(i13, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) o7).topMargin + ((ViewGroup.MarginLayoutParams) o7).bottomMargin);
                        i19 = iMax6;
                        iCombineMeasuredStates = View.combineMeasuredStates(i10, view.getMeasuredState());
                        i20 = iMax7;
                        z3 = true;
                    } else {
                        i6 = size3;
                        arrayList = arrayList3;
                        i7 = layoutDirection;
                        z2 = false;
                        i8 = i19;
                        int i27 = i4;
                        i9 = paddingLeft;
                        i10 = i3;
                        i11 = i27;
                        i12 = paddingRight;
                        i13 = i20;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                    int iMax8 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) o7).leftMargin + ((ViewGroup.MarginLayoutParams) o7).rightMargin);
                    int iMax9 = Math.max(i13, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) o7).topMargin + ((ViewGroup.MarginLayoutParams) o7).bottomMargin);
                    i19 = iMax8;
                    iCombineMeasuredStates = View.combineMeasuredStates(i10, view.getMeasuredState());
                    i20 = iMax9;
                    z3 = true;
                }
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                l7 = o7.a;
                if (l7 != null) {
                    int i28 = i3;
                    i11 = i4;
                    z2 = false;
                    i9 = paddingLeft;
                    i10 = i28;
                    i12 = paddingRight;
                    i13 = i20;
                    i7 = layoutDirection;
                    i8 = i19;
                    i6 = size3;
                    arrayList = arrayList3;
                    if (!l7.h(this, view, iMakeMeasureSpec, i5, iMakeMeasureSpec2)) {
                    }
                    int iMax10 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) o7).leftMargin + ((ViewGroup.MarginLayoutParams) o7).rightMargin);
                    int iMax11 = Math.max(i13, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) o7).topMargin + ((ViewGroup.MarginLayoutParams) o7).bottomMargin);
                    i19 = iMax10;
                    iCombineMeasuredStates = View.combineMeasuredStates(i10, view.getMeasuredState());
                    i20 = iMax11;
                    z3 = true;
                } else {
                    i6 = size3;
                    arrayList = arrayList3;
                    i7 = layoutDirection;
                    z2 = false;
                    i8 = i19;
                    int i29 = i4;
                    i9 = paddingLeft;
                    i10 = i3;
                    i11 = i29;
                    i12 = paddingRight;
                    i13 = i20;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, i5, iMakeMeasureSpec2, 0);
                int iMax12 = Math.max(i8, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) o7).leftMargin + ((ViewGroup.MarginLayoutParams) o7).rightMargin);
                int iMax13 = Math.max(i13, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) o7).topMargin + ((ViewGroup.MarginLayoutParams) o7).bottomMargin);
                i19 = iMax12;
                iCombineMeasuredStates = View.combineMeasuredStates(i10, view.getMeasuredState());
                i20 = iMax13;
                z3 = true;
            }
            i21 = i11 + 1;
            paddingLeft = i9;
            paddingRight = i12;
            layoutDirection = i7;
            size3 = i6;
            arrayList3 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i19, i, (-16777216) & i30), View.resolveSizeAndState(i20, i2, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                O7 o7 = (O7) childAt.getLayoutParams();
                if (o7.a(0)) {
                    L7 l7 = o7.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        L7 l7;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                O7 o7 = (O7) childAt.getLayoutParams();
                if (o7.a(0) && (l7 = o7.a) != null) {
                    zI |= l7.i(view);
                }
            }
        }
        return zI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof Q7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Q7 q7 = (Q7) parcelable;
        super.onRestoreInstanceState(q7.a);
        SparseArray sparseArray = q7.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            L7 l7 = n(childAt).a;
            if (id != -1 && l7 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                l7.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        Q7 q7 = new Q7(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            L7 l7 = ((O7) childAt.getLayoutParams()).a;
            if (id != -1 && l7 != null && (parcelableN = l7.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        q7.c = sparseArray;
        return q7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zR;
        boolean zQ;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.j == null) {
            zR = r(motionEvent, 1);
            if (!zR) {
                zQ = false;
            }
            motionEventObtain = null;
            if (this.j == null) {
                zQ |= super.onTouchEvent(motionEvent);
            } else if (zR) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                t(false);
            }
            return zQ;
        }
        zR = false;
        L7 l7 = ((O7) this.j.getLayoutParams()).a;
        if (l7 != null) {
            zQ = l7.q(this.j, motionEvent);
        } else {
            zQ = false;
        }
        motionEventObtain = null;
        if (this.j == null) {
            zQ |= super.onTouchEvent(motionEvent);
        } else if (zR) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            t(false);
        } else {
            t(false);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        Rect rect3;
        int i5;
        ArrayList arrayList;
        boolean z;
        int i6;
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        int height;
        int i11;
        int i12;
        int i13;
        Pk pk;
        L7 l7;
        int i14 = i;
        WeakHashMap weakHashMap = Gs.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i15 = 0;
        while (true) {
            Pk pk2 = x;
            if (i15 >= size) {
                Rect rect4 = rectG3;
                Rect rect5 = rectG2;
                Rect rect6 = rectG;
                rect6.setEmpty();
                pk2.a(rect6);
                rect5.setEmpty();
                pk2.a(rect5);
                rect4.setEmpty();
                pk2.a(rect4);
                return;
            }
            View view = (View) arrayList2.get(i15);
            O7 o7 = (O7) view.getLayoutParams();
            if (i14 != 0 || view.getVisibility() != 8) {
                int i16 = 0;
                while (i16 < i15) {
                    if (o7.l == ((View) arrayList2.get(i16))) {
                        O7 o8 = (O7) view.getLayoutParams();
                        if (o8.k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            Rect rectG6 = g();
                            k(rectG4, o8.k);
                            i(view, rectG5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            pk = pk2;
                            l(layoutDirection, rectG4, rectG6, o8, measuredWidth, measuredHeight);
                            boolean z2 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(o8, rectG6, measuredWidth, measuredHeight);
                            int i17 = rectG6.left - rectG5.left;
                            int i18 = rectG6.top - rectG5.top;
                            if (i17 != 0) {
                                WeakHashMap weakHashMap2 = Gs.a;
                                view.offsetLeftAndRight(i17);
                            }
                            if (i18 != 0) {
                                WeakHashMap weakHashMap3 = Gs.a;
                                view.offsetTopAndBottom(i18);
                            }
                            if (z2 && (l7 = o8.a) != null) {
                                l7.d(this, view, o8.k);
                            }
                            rectG4.setEmpty();
                            pk.a(rectG4);
                            rectG5.setEmpty();
                            pk.a(rectG5);
                            rectG6.setEmpty();
                            pk.a(rectG6);
                        } else {
                            pk = pk2;
                        }
                    } else {
                        pk = pk2;
                    }
                    i16++;
                    pk2 = pk;
                    size = size;
                    arrayList2 = arrayList2;
                    layoutDirection = layoutDirection;
                    o7 = o7;
                    i15 = i15;
                    rectG3 = rectG3;
                    rectG2 = rectG2;
                    rectG = rectG;
                }
                O7 o9 = o7;
                int i19 = layoutDirection;
                Nk nk = pk2;
                i2 = i15;
                Rect rect7 = rectG3;
                rect = rectG2;
                Rect rect8 = rectG;
                ArrayList arrayList3 = arrayList2;
                int i20 = size;
                i(view, rect, true);
                if (o9.g == 0 || rect.isEmpty()) {
                    i3 = i19;
                    rect2 = rect8;
                } else {
                    i3 = i19;
                    int absoluteGravity = Gravity.getAbsoluteGravity(o9.g, i3);
                    int i21 = absoluteGravity & 112;
                    if (i21 == 48) {
                        rect2 = rect8;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i21 != 80) {
                        rect2 = rect8;
                    } else {
                        rect2 = rect8;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i22 = absoluteGravity & 7;
                    if (i22 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i22 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (o9.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = Gs.a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        O7 o10 = (O7) view.getLayoutParams();
                        L7 l8 = o10.a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (l8 == null || !l8.a(view)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectG7.toShortString() + " | Bounds:" + rectG8.toShortString());
                        }
                        rectG8.setEmpty();
                        nk.a(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            nk.a(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(o10.h, i3);
                            if ((absoluteGravity2 & 48) != 48 || (i12 = (rectG7.top - ((ViewGroup.MarginLayoutParams) o10).topMargin) - o10.j) >= (i13 = rect2.top)) {
                                z = false;
                            } else {
                                v(view, i13 - i12);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) o10).bottomMargin) + o10.j) < (i11 = rect2.bottom)) {
                                v(view, height - i11);
                                z = true;
                            }
                            if (z) {
                                i6 = 0;
                            } else {
                                i6 = 0;
                                v(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i9 = (rectG7.left - ((ViewGroup.MarginLayoutParams) o10).leftMargin) - o10.i) >= (i10 = rect2.left)) {
                                i7 = i6;
                            } else {
                                u(view, i10 - i9);
                                i7 = 1;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) o10).rightMargin) + o10.i) < (i8 = rect2.right)) {
                                u(view, width - i8);
                                i7 = 1;
                            }
                            if (i7 == 0) {
                                u(view, i6);
                            }
                            rectG7.setEmpty();
                            nk.a(rectG7);
                        }
                    }
                }
                i4 = i;
                if (i4 != 2) {
                    rect3 = rect7;
                    rect3.set(((O7) view.getLayoutParams()).p);
                    if (rect3.equals(rect)) {
                        i5 = i20;
                        arrayList = arrayList3;
                    } else {
                        ((O7) view.getLayoutParams()).p.set(rect);
                    }
                } else {
                    rect3 = rect7;
                }
                int i23 = i2 + 1;
                i5 = i20;
                while (true) {
                    arrayList = arrayList3;
                    if (i23 >= i5) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i23);
                    L7 l9 = ((O7) view2.getLayoutParams()).a;
                    if (l9 != null) {
                        l9.b(view2);
                    }
                    i23++;
                    arrayList3 = arrayList;
                }
            } else {
                i4 = i14;
                i3 = layoutDirection;
                i2 = i15;
                rect3 = rectG3;
                rect = rectG2;
                rect2 = rectG;
                arrayList = arrayList2;
                i5 = size;
            }
            size = i5;
            i15 = i2 + 1;
            rectG2 = rect;
            i14 = i4;
            rectG3 = rect3;
            arrayList2 = arrayList;
            rectG = rect2;
            layoutDirection = i3;
        }
    }

    public final void q(View view, int i) {
        int i2;
        O7 o7 = (O7) view.getLayoutParams();
        View view2 = o7.k;
        if (view2 == null && o7.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        Pk pk = x;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                k(rectG, view2);
                O7 o8 = (O7) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectG, rectG2, o8, measuredWidth, measuredHeight);
                h(o8, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                pk.a(rectG);
                rectG2.setEmpty();
                pk.a(rectG2);
            }
        }
        int i3 = o7.e;
        if (i3 < 0) {
            O7 o9 = (O7) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o9).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) o9).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) o9).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) o9).bottomMargin);
            if (this.n != null) {
                WeakHashMap weakHashMap = Gs.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG3.left = this.n.b() + rectG3.left;
                    rectG3.top = this.n.d() + rectG3.top;
                    rectG3.right -= this.n.c();
                    rectG3.bottom -= this.n.a();
                }
            }
            Rect rectG4 = g();
            int i4 = o9.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            pk.a(rectG3);
            rectG4.setEmpty();
            pk.a(rectG4);
            return;
        }
        O7 o10 = (O7) view.getLayoutParams();
        int i5 = o10.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM = m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o10).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) o10).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) o10).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) o10).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        V5 v5 = w;
        if (v5 != null) {
            Collections.sort(arrayList, v5);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            O7 o7 = (O7) view.getLayoutParams();
            L7 l7 = o7.a;
            if (!(zF || z2) || actionMasked == 0) {
                if (!zF && l7 != null) {
                    if (i == 0) {
                        zF = l7.f(this, view, motionEvent);
                    } else if (i == 1) {
                        zF = l7.q(view, motionEvent);
                    }
                    if (zF) {
                        this.j = view;
                    }
                }
                if (o7.a == null) {
                    o7.m = false;
                }
                boolean z3 = o7.m;
                if (z3) {
                    z = true;
                } else {
                    o7.m = z3;
                    z = z3;
                }
                z2 = z && !z3;
                if (z && !z2) {
                    break;
                }
            } else if (l7 != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    l7.f(this, view, motionEventObtain);
                } else if (i == 1) {
                    l7.q(view, motionEventObtain);
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        L7 l7 = ((O7) view.getLayoutParams()).a;
        if (l7 != null) {
            l7.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.g) {
            return;
        }
        t(false);
        this.g = true;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void s() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable3 = this.p;
                WeakHashMap weakHashMap = Gs.a;
                P9.b(drawable3, getLayoutDirection());
                this.p.setVisible(getVisibility() == 0, false);
                this.p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = Gs.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? H7.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.p.setVisible(z, false);
    }

    public final void t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            L7 l7 = ((O7) childAt.getLayoutParams()).a;
            if (l7 != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    l7.f(this, childAt, motionEventObtain);
                } else {
                    l7.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((O7) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.j = null;
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public final void w() {
        WeakHashMap weakHashMap = Gs.a;
        if (!getFitsSystemWindows()) {
            AbstractC0676vs.u(this, null);
            return;
        }
        if (this.r == null) {
            this.r = new C0308k0(this, 8);
        }
        AbstractC0676vs.u(this, this.r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof O7) {
            return new O7((O7) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new O7((ViewGroup.MarginLayoutParams) layoutParams) : new O7(layoutParams);
    }
}
