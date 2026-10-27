package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.jcraft.jsch.SftpATTRS;
import defpackage.AbstractC0614ts;
import defpackage.AbstractC0676vs;
import defpackage.Bt;
import defpackage.C0028ar;
import defpackage.C0032b0;
import defpackage.C0063c0;
import defpackage.C0339l0;
import defpackage.Cj;
import defpackage.Dj;
import defpackage.Ej;
import defpackage.F4;
import defpackage.Gs;
import defpackage.Hf;
import defpackage.InterfaceC0001a0;
import defpackage.InterfaceC0532r8;
import defpackage.InterfaceC0563s8;
import defpackage.Ki;
import defpackage.Kt;
import defpackage.Lt;
import defpackage.MenuC0604ti;
import defpackage.Mt;
import defpackage.Nt;
import defpackage.Tq;
import defpackage.Tt;
import defpackage.Vt;
import defpackage.Xs;
import defpackage.Y;
import defpackage.Z;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0532r8, Cj, Dj {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final Vt D;
    public static final Rect E;
    public final Ej A;
    public final C0063c0 B;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public InterfaceC0563s8 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public Vt q;
    public Vt r;
    public Vt s;
    public Vt t;
    public InterfaceC0001a0 u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final Y x;
    public final Z y;
    public final Z z;

    static {
        Nt lt;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            lt = new Mt();
        } else {
            lt = i >= 29 ? new Lt() : new Kt();
        }
        lt.g(Hf.b(0, 1, 0, 1));
        D = lt.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        Vt vt = Vt.b;
        this.q = vt;
        this.r = vt;
        this.s = vt;
        this.t = vt;
        this.x = new Y(this, 0);
        this.y = new Z(this, 0);
        this.z = new Z(this, 1);
        i(context);
        this.A = new Ej();
        C0063c0 c0063c0 = new C0063c0(context);
        c0063c0.setWillNotDraw(true);
        this.B = c0063c0;
        addView(c0063c0);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        C0032b0 c0032b0 = (C0032b0) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0032b0).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0032b0).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0032b0).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0032b0).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0032b0).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0032b0).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0032b0).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0032b0).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.Cj
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.Cj
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.Cj
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0032b0;
    }

    @Override // defpackage.Dj
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    @Override // defpackage.Cj
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.Cj
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0032b0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0032b0(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        Ej ej = this.A;
        return ej.b | ej.a;
    }

    public CharSequence getTitle() {
        k();
        return ((C0028ar) this.e).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((C0028ar) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C0028ar) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0563s8 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0563s8) {
                wrapper = (InterfaceC0563s8) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(Menu menu, Ki ki) {
        k();
        C0028ar c0028ar = (C0028ar) this.e;
        C0339l0 c0339l0 = c0028ar.m;
        Toolbar toolbar = c0028ar.a;
        if (c0339l0 == null) {
            c0028ar.m = new C0339l0(toolbar.getContext());
        }
        C0339l0 c0339l1 = c0028ar.m;
        c0339l1.e = ki;
        MenuC0604ti menuC0604ti = (MenuC0604ti) menu;
        if (menuC0604ti == null && toolbar.a == null) {
            return;
        }
        toolbar.f();
        MenuC0604ti menuC0604ti2 = toolbar.a.p;
        if (menuC0604ti2 == menuC0604ti) {
            return;
        }
        if (menuC0604ti2 != null) {
            menuC0604ti2.r(toolbar.L);
            menuC0604ti2.r(toolbar.M);
        }
        if (toolbar.M == null) {
            toolbar.M = new Tq(toolbar);
        }
        c0339l1.q = true;
        if (menuC0604ti != null) {
            menuC0604ti.b(c0339l1, toolbar.j);
            menuC0604ti.b(toolbar.M, toolbar.j);
        } else {
            c0339l1.j(toolbar.j, null);
            toolbar.M.j(toolbar.j, null);
            c0339l1.h();
            toolbar.M.h();
        }
        toolbar.a.setPopupTheme(toolbar.k);
        toolbar.a.setPresenter(c0339l1);
        toolbar.L = c0339l1;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        Vt vtG = Vt.g(this, windowInsets);
        boolean zG = g(this.d, new Rect(vtG.b(), vtG.d(), vtG.c(), vtG.a()), false);
        WeakHashMap weakHashMap = Gs.a;
        Rect rect = this.m;
        AbstractC0676vs.b(this, vtG, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        Tt tt = vtG.a;
        Vt vtL = tt.l(i, i2, i3, i4);
        this.q = vtL;
        boolean z = true;
        if (!this.r.equals(vtL)) {
            this.r = this.q;
            zG = true;
        }
        Rect rect2 = this.n;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return tt.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0614ts.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0032b0 c0032b0 = (C0032b0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0032b0).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0032b0).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        Vt vt;
        int i3;
        Nt kt;
        k();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        C0032b0 c0032b0 = (C0032b0) this.d.getLayoutParams();
        int iMax = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0032b0).leftMargin + ((ViewGroup.MarginLayoutParams) c0032b0).rightMargin);
        int iMax2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0032b0).topMargin + ((ViewGroup.MarginLayoutParams) c0032b0).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = Gs.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.m;
        Rect rect2 = this.o;
        rect2.set(rect);
        this.s = this.q;
        if (this.g || z) {
            Hf hfB = Hf.b(this.s.b(), this.s.d() + measuredHeight, this.s.c(), this.s.a());
            vt = this.s;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                kt = new Mt(vt);
            } else if (i3 >= 29) {
                kt = new Lt(vt);
            } else {
                kt = new Kt(vt);
            }
            kt.g(hfB);
            this.s = kt.b();
        } else {
            C0063c0 c0063c0 = this.B;
            Vt vt2 = D;
            Rect rect3 = this.p;
            AbstractC0676vs.b(c0063c0, vt2, rect3);
            if (!rect3.equals(E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.s = this.s.a.l(0, measuredHeight, 0, 0);
            } else {
                Hf hfB2 = Hf.b(this.s.b(), this.s.d() + measuredHeight, this.s.c(), this.s.a());
                vt = this.s;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    kt = new Mt(vt);
                } else if (i3 >= 29) {
                    kt = new Lt(vt);
                } else {
                    kt = new Kt(vt);
                }
                kt.g(hfB2);
                this.s = kt.b();
            }
        }
        g(this.c, rect2, true);
        if (!this.t.equals(this.s)) {
            Vt vt3 = this.s;
            this.t = vt3;
            ContentFrameLayout contentFrameLayout = this.c;
            WindowInsets windowInsetsF = vt3.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsA = AbstractC0614ts.a(contentFrameLayout, windowInsetsF);
                if (!windowInsetsA.equals(windowInsetsF)) {
                    Vt.g(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        C0032b0 c0032b1 = (C0032b0) this.c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0032b1).leftMargin + ((ViewGroup.MarginLayoutParams) c0032b1).rightMargin);
        int iMax4 = Math.max(iMax2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0032b1).topMargin + ((ViewGroup.MarginLayoutParams) c0032b1).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.v.fling(0, 0, 0, (int) f2, 0, 0, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, Integer.MAX_VALUE);
        if (this.v.getFinalY() > this.d.getHeight()) {
            h();
            this.z.run();
        } else {
            h();
            this.y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        Bt bt;
        Xs xs;
        this.A.a = i;
        this.k = getActionBarHideOffset();
        h();
        InterfaceC0001a0 interfaceC0001a0 = this.u;
        if (interfaceC0001a0 == null || (xs = (bt = (Bt) interfaceC0001a0).B) == null) {
            return;
        }
        xs.a();
        bt.B = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.k <= this.d.getHeight()) {
            h();
            postDelayed(this.y, 600L);
        } else {
            h();
            postDelayed(this.z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.l ^ i;
        this.l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0001a0 interfaceC0001a0 = this.u;
        if (interfaceC0001a0 != null) {
            ((Bt) interfaceC0001a0).x = !z2;
            if (z || !z2) {
                Bt bt = (Bt) interfaceC0001a0;
                if (bt.y) {
                    bt.y = false;
                    bt.E0(true);
                }
            } else {
                Bt bt2 = (Bt) interfaceC0001a0;
                if (!bt2.y) {
                    bt2.y = true;
                    bt2.E0(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.u == null) {
            return;
        }
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0614ts.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        InterfaceC0001a0 interfaceC0001a0 = this.u;
        if (interfaceC0001a0 != null) {
            ((Bt) interfaceC0001a0).w = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0001a0 interfaceC0001a0) {
        this.u = interfaceC0001a0;
        if (getWindowToken() != null) {
            ((Bt) this.u).w = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = Gs.a;
                AbstractC0614ts.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        C0028ar c0028ar = (C0028ar) this.e;
        c0028ar.d = i != 0 ? F4.F(c0028ar.a.getContext(), i) : null;
        c0028ar.c();
    }

    public void setLogo(int i) {
        k();
        C0028ar c0028ar = (C0028ar) this.e;
        c0028ar.e = i != 0 ? F4.F(c0028ar.a.getContext(), i) : null;
        c0028ar.c();
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.InterfaceC0532r8
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((C0028ar) this.e).k = callback;
    }

    @Override // defpackage.InterfaceC0532r8
    public void setWindowTitle(CharSequence charSequence) {
        k();
        C0028ar c0028ar = (C0028ar) this.e;
        if (c0028ar.g) {
            return;
        }
        c0028ar.h = charSequence;
        if ((c0028ar.b & 8) != 0) {
            Toolbar toolbar = c0028ar.a;
            toolbar.setTitle(charSequence);
            if (c0028ar.g) {
                Gs.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0032b0(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        C0028ar c0028ar = (C0028ar) this.e;
        c0028ar.d = drawable;
        c0028ar.c();
    }
}
