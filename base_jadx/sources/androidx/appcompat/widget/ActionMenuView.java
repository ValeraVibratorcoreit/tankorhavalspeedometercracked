package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.jcraft.jsch.SftpATTRS;
import defpackage.C0186g0;
import defpackage.C0277j0;
import defpackage.C0308k0;
import defpackage.C0339l0;
import defpackage.C0401n0;
import defpackage.C0473pa;
import defpackage.C0759yi;
import defpackage.InterfaceC0370m0;
import defpackage.InterfaceC0432o0;
import defpackage.InterfaceC0542ri;
import defpackage.InterfaceC0573si;
import defpackage.Jg;
import defpackage.Kg;
import defpackage.Ki;
import defpackage.MenuC0604ti;
import defpackage.Ni;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends Kg implements InterfaceC0573si, Ni {
    public InterfaceC0432o0 A;
    public MenuC0604ti p;
    public Context q;
    public int r;
    public boolean s;
    public C0339l0 t;
    public Ki u;
    public InterfaceC0542ri v;
    public boolean w;
    public int x;
    public final int y;
    public final int z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.y = (int) (56.0f * f);
        this.z = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public static C0401n0 j() {
        C0401n0 c0401n0 = new C0401n0(-2, -2);
        c0401n0.a = false;
        ((LinearLayout.LayoutParams) c0401n0).gravity = 16;
        return c0401n0;
    }

    public static C0401n0 k(ViewGroup.LayoutParams layoutParams) {
        C0401n0 c0401n0;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0401n0) {
            C0401n0 c0401n1 = (C0401n0) layoutParams;
            c0401n0 = new C0401n0(c0401n1);
            c0401n0.a = c0401n1.a;
        } else {
            c0401n0 = new C0401n0(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0401n0).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0401n0).gravity = 16;
        }
        return c0401n0;
    }

    @Override // defpackage.InterfaceC0573si
    public final boolean a(C0759yi c0759yi) {
        return this.p.q(c0759yi, null, 0);
    }

    @Override // defpackage.Ni
    public final void b(MenuC0604ti menuC0604ti) {
        this.p = menuC0604ti;
    }

    @Override // defpackage.Kg, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0401n0;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.Kg
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Jg generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.Kg
    /* JADX INFO: renamed from: g */
    public final Jg generateLayoutParams(AttributeSet attributeSet) {
        return new C0401n0(getContext(), attributeSet);
    }

    @Override // defpackage.Kg, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.Kg, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.p == null) {
            Context context = getContext();
            MenuC0604ti menuC0604ti = new MenuC0604ti(context);
            this.p = menuC0604ti;
            menuC0604ti.e = new C0308k0(this, 1);
            C0339l0 c0339l0 = new C0339l0(context);
            this.t = c0339l0;
            c0339l0.l = true;
            c0339l0.m = true;
            Ki c0473pa = this.u;
            if (c0473pa == null) {
                c0473pa = new C0473pa(14);
            }
            c0339l0.e = c0473pa;
            this.p.b(c0339l0, this.q);
            C0339l0 c0339l1 = this.t;
            c0339l1.h = this;
            this.p = c0339l1.c;
        }
        return this.p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0339l0 c0339l0 = this.t;
        C0277j0 c0277j0 = c0339l0.i;
        if (c0277j0 != null) {
            return c0277j0.getDrawable();
        }
        if (c0339l0.k) {
            return c0339l0.j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.Kg
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ Jg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0370m0)) {
            zA = ((InterfaceC0370m0) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0370m0)) ? zA : zA | ((InterfaceC0370m0) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0339l0 c0339l0 = this.t;
        if (c0339l0 != null) {
            c0339l0.h();
            if (this.t.i()) {
                this.t.e();
                this.t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0339l0 c0339l0 = this.t;
        if (c0339l0 != null) {
            c0339l0.e();
            C0186g0 c0186g0 = c0339l0.t;
            if (c0186g0 == null || !c0186g0.b()) {
                return;
            }
            c0186g0.j.dismiss();
        }
    }

    @Override // defpackage.Kg, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0401n0 c0401n0 = (C0401n0) childAt.getLayoutParams();
                if (c0401n0.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0401n0).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0401n0).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0401n0).leftMargin) + ((LinearLayout.LayoutParams) c0401n0).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0401n0 c0401n1 = (C0401n0) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0401n1.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c0401n1).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0401n1).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0401n0 c0401n2 = (C0401n0) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0401n2.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c0401n2).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0401n2).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // defpackage.Kg, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        ?? r1;
        int i7;
        MenuC0604ti menuC0604ti;
        boolean z2 = this.w;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.w = z3;
        if (z2 != z3) {
            this.x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.w && (menuC0604ti = this.p) != null && size != this.x) {
            this.x = size;
            menuC0604ti.p(true);
        }
        int childCount = getChildCount();
        if (!this.w || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C0401n0 c0401n0 = (C0401n0) getChildAt(i8).getLayoutParams();
                ((LinearLayout.LayoutParams) c0401n0).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0401n0).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.y;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int iMax = 0;
        int i15 = 0;
        boolean z4 = false;
        int i16 = 0;
        int iMax2 = 0;
        long j = 0;
        while (true) {
            i3 = this.z;
            if (i15 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i15);
            int i17 = size3;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0401n0 c0401n1 = (C0401n0) childAt.getLayoutParams();
                c0401n1.f = false;
                c0401n1.c = 0;
                c0401n1.b = 0;
                c0401n1.d = false;
                ((LinearLayout.LayoutParams) c0401n1).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0401n1).rightMargin = 0;
                c0401n1.e = z5 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i19 = c0401n1.a ? 1 : i11;
                C0401n0 c0401n2 = (C0401n0) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z5 ? (ActionMenuItemView) childAt : null;
                boolean z6 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i19 <= 0 || (z6 && i19 < 2)) {
                    i7 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i13, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i7 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i7++;
                    }
                    if (z6 && i7 < 2) {
                        i7 = 2;
                    }
                }
                c0401n2.d = !c0401n2.a && z6;
                c0401n2.b = i7;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i13, 1073741824), iMakeMeasureSpec);
                iMax = Math.max(iMax, i7);
                if (c0401n1.d) {
                    i16++;
                }
                if (c0401n1.a) {
                    z4 = true;
                }
                i11 -= i7;
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight());
                if (i7 == 1) {
                    j |= (long) (1 << i15);
                }
                i14 = i18;
            }
            i15++;
            size3 = i17;
            paddingBottom = paddingBottom;
            i9 = i9;
        }
        int i20 = i9;
        int i21 = size3;
        int i22 = iMax2;
        boolean z7 = z4 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i11 <= 0) {
                i4 = i22;
                z = z8;
                break;
            }
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i25 < childCount2) {
                int i26 = i22;
                C0401n0 c0401n3 = (C0401n0) getChildAt(i25).getLayoutParams();
                boolean z9 = z8;
                if (c0401n3.d) {
                    int i27 = c0401n3.b;
                    if (i27 < i23) {
                        j2 = 1 << i25;
                        i23 = i27;
                        i24 = 1;
                    } else if (i27 == i23) {
                        i24++;
                        j2 |= 1 << i25;
                    }
                }
                i25++;
                z8 = z9;
                i22 = i26;
            }
            i4 = i22;
            z = z8;
            j |= j2;
            if (i24 > i11) {
                break;
            }
            int i28 = i23 + 1;
            int i29 = 0;
            while (i29 < childCount2) {
                View childAt2 = getChildAt(i29);
                C0401n0 c0401n4 = (C0401n0) childAt2.getLayoutParams();
                int i30 = mode;
                int i31 = childMeasureSpec;
                int i32 = childCount2;
                long j3 = 1 << i29;
                if ((j2 & j3) != 0) {
                    if (z7 && c0401n4.e) {
                        r1 = 1;
                        r1 = 1;
                        if (i11 == 1) {
                            childAt2.setPadding(i3 + i13, 0, i3, 0);
                        }
                    } else {
                        r1 = 1;
                    }
                    c0401n4.b += r1;
                    c0401n4.f = r1;
                    i11--;
                } else if (c0401n4.b == i28) {
                    j |= j3;
                }
                i29++;
                childMeasureSpec = i31;
                mode = i30;
                childCount2 = i32;
            }
            i22 = i4;
            z8 = true;
        }
        int i33 = childMeasureSpec;
        int i34 = childCount2;
        boolean z10 = !z4 && i14 == 1;
        if (i11 <= 0 || j == 0 || (i11 >= i14 - 1 && !z10 && iMax <= 1)) {
            i5 = i34;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0401n0) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i35 = i34 - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((C0401n0) getChildAt(i35).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i36 = fBitCount > 0.0f ? (int) ((i11 * i13) / fBitCount) : 0;
            i5 = i34;
            for (int i37 = 0; i37 < i5; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    C0401n0 c0401n5 = (C0401n0) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0401n5.c = i36;
                        c0401n5.f = true;
                        if (i37 == 0 && !c0401n5.e) {
                            ((LinearLayout.LayoutParams) c0401n5).leftMargin = (-i36) / 2;
                        }
                        z = true;
                    } else if (c0401n5.a) {
                        c0401n5.c = i36;
                        c0401n5.f = true;
                        ((LinearLayout.LayoutParams) c0401n5).rightMargin = (-i36) / 2;
                        z = true;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) c0401n5).leftMargin = i36 / 2;
                        }
                        if (i37 != i5 - 1) {
                            ((LinearLayout.LayoutParams) c0401n5).rightMargin = i36 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            int i38 = 0;
            while (i38 < i5) {
                View childAt4 = getChildAt(i38);
                C0401n0 c0401n6 = (C0401n0) childAt4.getLayoutParams();
                if (c0401n6.f) {
                    i6 = i33;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0401n6.b * i13) + c0401n6.c, 1073741824), i6);
                } else {
                    i6 = i33;
                }
                i38++;
                i33 = i6;
            }
        }
        setMeasuredDimension(i20, mode != 1073741824 ? i4 : i21);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.q = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0432o0 interfaceC0432o0) {
        this.A = interfaceC0432o0;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0339l0 c0339l0 = this.t;
        C0277j0 c0277j0 = c0339l0.i;
        if (c0277j0 != null) {
            c0277j0.setImageDrawable(drawable);
        } else {
            c0339l0.k = true;
            c0339l0.j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0339l0 c0339l0) {
        this.t = c0339l0;
        c0339l0.h = this;
        this.p = c0339l0.c;
    }

    @Override // defpackage.Kg, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0401n0(getContext(), attributeSet);
    }
}
