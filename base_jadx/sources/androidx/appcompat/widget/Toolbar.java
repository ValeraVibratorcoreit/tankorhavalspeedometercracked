package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.jcraft.jsch.SftpATTRS;
import defpackage.AbstractC0059br;
import defpackage.AbstractC0700wl;
import defpackage.C0003a2;
import defpackage.C0028ar;
import defpackage.C0270in;
import defpackage.C0339l0;
import defpackage.C0759yi;
import defpackage.C2;
import defpackage.F4;
import defpackage.Gs;
import defpackage.Ic;
import defpackage.InterfaceC0542ri;
import defpackage.InterfaceC0563s8;
import defpackage.InterfaceC0666vi;
import defpackage.K2;
import defpackage.Ki;
import defpackage.MenuC0604ti;
import defpackage.Qq;
import defpackage.Rq;
import defpackage.RunnableC0524r0;
import defpackage.Sp;
import defpackage.Sq;
import defpackage.Tq;
import defpackage.Uq;
import defpackage.Vq;
import defpackage.Wq;
import defpackage.X;
import defpackage.Y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0666vi {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final K2 G;
    public ArrayList H;
    public Vq I;
    public final Rq J;
    public C0028ar K;
    public C0339l0 L;
    public Tq M;
    public Ki N;
    public InterfaceC0542ri O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final RunnableC0524r0 T;
    public ActionMenuView a;
    public C2 b;
    public C2 c;
    public Y1 d;
    public C0003a2 e;
    public final Drawable f;
    public final CharSequence g;
    public Y1 h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public C0270in t;
    public int u;
    public int v;
    public final int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new Sp(getContext());
    }

    public static Uq h() {
        Uq uq = new Uq(-2, -2);
        uq.b = 0;
        uq.a = 8388627;
        return uq;
    }

    public static Uq i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof Uq;
        if (z) {
            Uq uq = (Uq) layoutParams;
            Uq uq2 = new Uq(uq);
            uq2.b = 0;
            uq2.b = uq.b;
            return uq2;
        }
        if (z) {
            Uq uq3 = new Uq((Uq) layoutParams);
            uq3.b = 0;
            return uq3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Uq uq4 = new Uq(layoutParams);
            uq4.b = 0;
            return uq4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Uq uq5 = new Uq(marginLayoutParams);
        uq5.b = 0;
        ((ViewGroup.MarginLayoutParams) uq5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) uq5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) uq5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) uq5).bottomMargin = marginLayoutParams.bottomMargin;
        return uq5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                Uq uq = (Uq) childAt.getLayoutParams();
                if (uq.b == 0 && u(childAt)) {
                    int i3 = uq.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            Uq uq2 = (Uq) childAt2.getLayoutParams();
            if (uq2.b == 0 && u(childAt2)) {
                int i5 = uq2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        Uq uqI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            uqI = h();
        } else {
            uqI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (Uq) layoutParams;
        }
        uqI.b = 1;
        if (!z || this.i == null) {
            addView(view, uqI);
        } else {
            view.setLayoutParams(uqI);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            Y1 y1 = new Y1(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = y1;
            y1.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            Uq uqH = h();
            uqH.a = (this.n & 112) | 8388611;
            uqH.b = 2;
            this.h.setLayoutParams(uqH);
            this.h.setOnClickListener(new X(this, 3));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Uq);
    }

    public final void d() {
        if (this.t == null) {
            C0270in c0270in = new C0270in();
            c0270in.a = 0;
            c0270in.b = 0;
            c0270in.c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            c0270in.d = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            c0270in.e = 0;
            c0270in.f = 0;
            c0270in.g = false;
            c0270in.h = false;
            this.t = c0270in;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.p == null) {
            MenuC0604ti menuC0604ti = (MenuC0604ti) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new Tq(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            menuC0604ti.b(this.M, this.j);
            w();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.a;
            Ki ki = this.N;
            Rq rq = new Rq(this);
            actionMenuView2.u = ki;
            actionMenuView2.v = rq;
            Uq uqH = h();
            uqH.a = (this.n & 112) | 8388613;
            this.a.setLayoutParams(uqH);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new Y1(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            Uq uqH = h();
            uqH.a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(uqH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        Y1 y1 = this.h;
        if (y1 != null) {
            return y1.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        Y1 y1 = this.h;
        if (y1 != null) {
            return y1.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0270in c0270in = this.t;
        if (c0270in != null) {
            return c0270in.g ? c0270in.a : c0270in.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0270in c0270in = this.t;
        if (c0270in != null) {
            return c0270in.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0270in c0270in = this.t;
        if (c0270in != null) {
            return c0270in.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0270in c0270in = this.t;
        if (c0270in != null) {
            return c0270in.g ? c0270in.b : c0270in.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0604ti menuC0604ti;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (menuC0604ti = actionMenuView.p) == null || !menuC0604ti.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0003a2 c0003a2 = this.e;
        if (c0003a2 != null) {
            return c0003a2.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0003a2 c0003a2 = this.e;
        if (c0003a2 != null) {
            return c0003a2.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        Y1 y1 = this.d;
        if (y1 != null) {
            return y1.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        Y1 y1 = this.d;
        if (y1 != null) {
            return y1.getDrawable();
        }
        return null;
    }

    public C0339l0 getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public InterfaceC0563s8 getWrapper() {
        if (this.K == null) {
            this.K = new C0028ar(this, true);
        }
        return this.K;
    }

    public final int j(View view, int i) {
        Uq uq = (Uq) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = uq.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) uq).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) uq).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) uq).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.G.d).iterator();
        while (it2.hasNext()) {
            ((Ic) it2.next()).a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0261  */
    /* JADX WARN: Code duplicated, block: B:101:0x0283  */
    /* JADX WARN: Code duplicated, block: B:103:0x0286  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0314 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0316  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:91:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0223  */
    /* JADX WARN: Code duplicated, block: B:94:0x0227  */
    /* JADX WARN: Code duplicated, block: B:97:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        C2 c2;
        C2 c3;
        Uq uq;
        Uq uq2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax2;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i17;
        int i18;
        int size2;
        int i19;
        int size3;
        int i20;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = Gs.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (u(this.d)) {
            if (z3) {
                iR = r(this.d, i26, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(this.d, paddingLeft, iMin2, iArr);
            }
            if (u(this.h)) {
                if (z3) {
                    iR = r(this.h, iR, iMin2, iArr);
                } else {
                    iQ = q(this.h, iQ, iMin2, iArr);
                }
            }
            if (u(this.a)) {
                if (z3) {
                    iQ = q(this.a, iQ, iMin2, iArr);
                } else {
                    iR = r(this.a, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i26 - currentContentInsetRight);
            if (u(this.i)) {
                if (z3) {
                    iMin = r(this.i, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.i, iMax, iMin2, iArr);
                }
            }
            if (u(this.e)) {
                if (z3) {
                    iMin = r(this.e, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.e, iMax, iMin2, iArr);
                }
            }
            zU = u(this.b);
            zU2 = u(this.c);
            if (zU) {
                Uq uq3 = (Uq) this.b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) uq3).bottomMargin + this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) uq3).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                Uq uq4 = (Uq) this.c.getLayoutParams();
                measuredHeight += this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) uq4).topMargin + ((ViewGroup.MarginLayoutParams) uq4).bottomMargin;
            }
            if (!zU || zU2) {
                if (zU) {
                    c2 = this.b;
                } else {
                    c2 = this.c;
                }
                if (zU2) {
                    c3 = this.c;
                } else {
                    c3 = this.b;
                }
                uq = (Uq) c2.getLayoutParams();
                uq2 = (Uq) c3.getLayoutParams();
                z2 = (!zU && this.b.getMeasuredWidth() > 0) || (zU2 && this.c.getMeasuredWidth() > 0);
                i5 = this.w & 112;
                i6 = iMin2;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) uq).topMargin + this.r;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) uq).topMargin + this.r;
                    if (iMax2 < i13) {
                        iMax2 = i13;
                    } else {
                        i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i15 = ((ViewGroup.MarginLayoutParams) uq).bottomMargin;
                        i16 = this.s;
                        if (i14 < i15 + i16) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) uq2).bottomMargin + i16) - i14));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) uq2).bottomMargin) - this.s) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i10 = this.p;
                    } else {
                        i10 = 0;
                    }
                    int i27 = i10 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zU) {
                        Uq uq5 = (Uq) this.b.getLayoutParams();
                        int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) uq5).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (zU2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Uq) this.c.getLayoutParams())).topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i28, iMin, this.c.getMeasuredHeight() + i28);
                        i12 = iMin - this.q;
                    } else {
                        i12 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i11, i12);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i7 = this.p;
                    } else {
                        i7 = 0;
                    }
                    int i29 = i7 - iArr[0];
                    iMax = Math.max(0, i29) + iMax;
                    iArr[0] = Math.max(0, -i29);
                    if (zU) {
                        Uq uq6 = (Uq) this.b.getLayoutParams();
                        int measuredWidth3 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) uq6).bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (zU2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Uq) this.c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.c.getMeasuredWidth() + iMax;
                        this.c.layout(iMax, i30, measuredWidth4, this.c.getMeasuredHeight() + i30);
                        i9 = measuredWidth4 + this.q;
                    } else {
                        i9 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i8, i9);
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                i6 = iMin2;
            }
            arrayList = this.D;
            a(arrayList, 3);
            size = arrayList.size();
            iQ2 = iMax;
            for (i17 = 0; i17 < size; i17++) {
                iQ2 = q((View) arrayList.get(i17), iQ2, i6, iArr);
            }
            i18 = i6;
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = r((View) arrayList.get(i19), iMin, i18, iArr);
            }
            a(arrayList, 1);
            int i31 = iArr[0];
            int i32 = iArr[1];
            size3 = arrayList.size();
            i20 = i32;
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = (View) arrayList.get(i22);
                Uq uq7 = (Uq) view.getLayoutParams();
                int i33 = ((ViewGroup.MarginLayoutParams) uq7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) uq7).rightMargin - i20;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i20 = iMax6;
                i21 = iMax5;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iQ2) {
                if (i25 > iMin) {
                    iQ2 = i24 - (i25 - iMin);
                } else {
                    iQ2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iQ2 = q((View) arrayList.get(i23), iQ2, i18, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i26;
        if (u(this.h)) {
            if (z3) {
                iR = r(this.h, iR, iMin2, iArr);
            } else {
                iQ = q(this.h, iQ, iMin2, iArr);
            }
        }
        if (u(this.a)) {
            if (z3) {
                iQ = q(this.a, iQ, iMin2, iArr);
            } else {
                iR = r(this.a, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i26 - currentContentInsetRight2);
        if (u(this.i)) {
            if (z3) {
                iMin = r(this.i, iMin, iMin2, iArr);
            } else {
                iMax = q(this.i, iMax, iMin2, iArr);
            }
        }
        if (u(this.e)) {
            if (z3) {
                iMin = r(this.e, iMin, iMin2, iArr);
            } else {
                iMax = q(this.e, iMax, iMin2, iArr);
            }
        }
        zU = u(this.b);
        zU2 = u(this.c);
        if (zU) {
            Uq uq8 = (Uq) this.b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) uq8).bottomMargin + this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) uq8).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            Uq uq9 = (Uq) this.c.getLayoutParams();
            measuredHeight += this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) uq9).topMargin + ((ViewGroup.MarginLayoutParams) uq9).bottomMargin;
        }
        if (zU) {
            if (zU) {
                c2 = this.b;
            } else {
                c2 = this.c;
            }
            if (zU2) {
                c3 = this.c;
            } else {
                c3 = this.b;
            }
            uq = (Uq) c2.getLayoutParams();
            uq2 = (Uq) c3.getLayoutParams();
            if (zU) {
            }
            i5 = this.w & 112;
            i6 = iMin2;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) uq).topMargin + this.r;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) uq).topMargin + this.r;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) uq).bottomMargin;
                    i16 = this.s;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) uq2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) uq2).bottomMargin) - this.s) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.p;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zU) {
                    Uq uq10 = (Uq) this.b.getLayoutParams();
                    int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) uq10).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zU2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Uq) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i12 = iMin - this.q;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.p;
                } else {
                    i7 = 0;
                }
                int i212 = i7 - iArr[0];
                iMax = Math.max(0, i212) + iMax;
                iArr[0] = Math.max(0, -i212);
                if (zU) {
                    Uq uq11 = (Uq) this.b.getLayoutParams();
                    int measuredWidth6 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) uq11).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zU2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Uq) this.c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i35, measuredWidth7, this.c.getMeasuredHeight() + i35);
                    i9 = measuredWidth7 + this.q;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        } else {
            if (zU) {
                c2 = this.b;
            } else {
                c2 = this.c;
            }
            if (zU2) {
                c3 = this.c;
            } else {
                c3 = this.b;
            }
            uq = (Uq) c2.getLayoutParams();
            uq2 = (Uq) c3.getLayoutParams();
            if (zU) {
            }
            i5 = this.w & 112;
            i6 = iMin2;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) uq).topMargin + this.r;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) uq).topMargin + this.r;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) uq).bottomMargin;
                    i16 = this.s;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) uq2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) uq2).bottomMargin) - this.s) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.p;
                } else {
                    i10 = 0;
                }
                int i213 = i10 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zU) {
                    Uq uq12 = (Uq) this.b.getLayoutParams();
                    int measuredWidth8 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) uq12).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zU2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Uq) this.c.getLayoutParams())).topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i214, iMin, this.c.getMeasuredHeight() + i214);
                    i12 = iMin - this.q;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.p;
                } else {
                    i7 = 0;
                }
                int i215 = i7 - iArr[0];
                iMax = Math.max(0, i215) + iMax;
                iArr[0] = Math.max(0, -i215);
                if (zU) {
                    Uq uq13 = (Uq) this.b.getLayoutParams();
                    int measuredWidth9 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) uq13).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zU2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Uq) this.c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.c.getMeasuredWidth() + iMax;
                    this.c.layout(iMax, i36, measuredWidth10, this.c.getMeasuredHeight() + i36);
                    i9 = measuredWidth10 + this.q;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        }
        arrayList = this.D;
        a(arrayList, 3);
        size = arrayList.size();
        iQ2 = iMax;
        while (i17 < size) {
            iQ2 = q((View) arrayList.get(i17), iQ2, i6, iArr);
        }
        i18 = i6;
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = r((View) arrayList.get(i19), iMin, i18, iArr);
        }
        a(arrayList, 1);
        int i37 = iArr[0];
        int i38 = iArr[1];
        size3 = arrayList.size();
        i20 = i38;
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = (View) arrayList.get(i22);
            Uq uq14 = (Uq) view2.getLayoutParams();
            int i39 = ((ViewGroup.MarginLayoutParams) uq14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) uq14).rightMargin - i20;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i20 = iMax10;
            i21 = iMax9;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iQ2) {
            if (i25 > iMin) {
                iQ2 = i24 - (i25 - iMin);
            } else {
                iQ2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iQ2 = q((View) arrayList.get(i23), iQ2, i18, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        if (u(this.d)) {
            t(this.d, i, 0, i2, this.o);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.h)) {
            t(this.h, i, 0, i2, this.o);
            iK = k(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.F;
        iArr[c2] = iMax4;
        if (u(this.a)) {
            t(this.a, i, iMax3, i2, this.o);
            iK2 = k(this.a) + this.a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.a) + this.a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (u(this.i)) {
            iMax5 += s(this.i, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.i) + this.i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (u(this.e)) {
            iMax5 += s(this.e, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((Uq) childAt.getLayoutParams()).b == 0 && u(childAt)) {
                iMax5 += s(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.r + this.s;
        int i6 = this.p + this.q;
        if (u(this.b)) {
            s(this.b, i, iMax5 + i6, i2, i5, iArr);
            int iK3 = k(this.b) + this.b.getMeasuredWidth();
            iL = l(this.b) + this.b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.c)) {
            iMax2 = Math.max(iMax2, s(this.c, i, iMax5 + i6, i2, iL + i5, iArr));
            iL += l(this.c) + this.c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.P) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof Wq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Wq wq = (Wq) parcelable;
        super.onRestoreInstanceState(wq.a);
        ActionMenuView actionMenuView = this.a;
        MenuC0604ti menuC0604ti = actionMenuView != null ? actionMenuView.p : null;
        int i = wq.c;
        if (i != 0 && this.M != null && menuC0604ti != null && (menuItemFindItem = menuC0604ti.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (wq.d) {
            RunnableC0524r0 runnableC0524r0 = this.T;
            removeCallbacks(runnableC0524r0);
            post(runnableC0524r0);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        C0270in c0270in = this.t;
        boolean z = i == 1;
        if (z == c0270in.g) {
            return;
        }
        c0270in.g = z;
        if (!c0270in.h) {
            c0270in.a = c0270in.e;
            c0270in.b = c0270in.f;
            return;
        }
        if (z) {
            int i2 = c0270in.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0270in.e;
            }
            c0270in.a = i2;
            int i3 = c0270in.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0270in.f;
            }
            c0270in.b = i3;
            return;
        }
        int i4 = c0270in.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0270in.e;
        }
        c0270in.a = i4;
        int i5 = c0270in.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0270in.f;
        }
        c0270in.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0759yi c0759yi;
        Wq wq = new Wq(super.onSaveInstanceState());
        Tq tq = this.M;
        if (tq != null && (c0759yi = tq.b) != null) {
            wq.c = c0759yi.a;
        }
        wq.d = p();
        return wq;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final boolean p() {
        C0339l0 c0339l0;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (c0339l0 = actionMenuView.t) == null || !c0339l0.i()) ? false : true;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        Uq uq = (Uq) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) uq).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) uq).rightMargin + iMax;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        Uq uq = (Uq) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) uq).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) uq).leftMargin);
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.S != z) {
            this.S = z;
            w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(F4.F(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(F4.F(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(F4.F(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(Vq vq) {
        this.I = vq;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        C0339l0 c0339l0;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (c0339l0 = actionMenuView.t) == null || !c0339l0.l()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = Sq.a(this);
            Tq tq = this.M;
            boolean z = (tq == null || tq.b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.S) ? false : true;
            if (z && this.R == null) {
                if (this.Q == null) {
                    this.Q = Sq.b(new Qq(this, 0));
                }
                Sq.c(onBackInvokedDispatcherA, this.Q);
                this.R = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            Sq.d(onBackInvokedDispatcher, this.Q);
            this.R = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new K2(new Qq(this, 1));
        this.H = new ArrayList();
        this.J = new Rq(this);
        this.T = new RunnableC0524r0(this, 19);
        Context context2 = getContext();
        int[] iArr = AbstractC0700wl.x;
        K2 k2G = K2.G(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        Gs.i(this, context, iArr, attributeSet, (TypedArray) k2G.b, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) k2G.b;
        this.l = typedArray.getResourceId(28, 0);
        this.m = typedArray.getResourceId(19, 0);
        this.w = typedArray.getInteger(0, 8388627);
        this.n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.q = dimensionPixelOffset;
        this.p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.s = dimensionPixelOffset5;
        }
        this.o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0270in c0270in = this.t;
        c0270in.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0270in.e = dimensionPixelSize;
            c0270in.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0270in.f = dimensionPixelSize2;
            c0270in.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0270in.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.u = typedArray.getDimensionPixelOffset(10, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        this.v = typedArray.getDimensionPixelOffset(6, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        this.f = k2G.q(4);
        this.g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableQ = k2G.q(16);
        if (drawableQ != null) {
            setNavigationIcon(drawableQ);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableQ2 = k2G.q(11);
        if (drawableQ2 != null) {
            setLogo(drawableQ2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(k2G.p(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(k2G.p(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        k2G.J();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        Uq uq = new Uq(context, attributeSet);
        uq.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0700wl.b);
        uq.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        uq.b = 0;
        return uq;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        Y1 y1 = this.h;
        if (y1 != null) {
            y1.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            Y1 y1 = this.h;
            if (y1 != null) {
                y1.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new C0003a2(getContext(), null, 0);
            }
            if (!o(this.e)) {
                b(this.e, true);
            }
        } else {
            C0003a2 c0003a2 = this.e;
            if (c0003a2 != null && o(c0003a2)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        C0003a2 c0003a3 = this.e;
        if (c0003a3 != null) {
            c0003a3.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new C0003a2(getContext(), null, 0);
        }
        C0003a2 c0003a2 = this.e;
        if (c0003a2 != null) {
            c0003a2.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        Y1 y1 = this.d;
        if (y1 != null) {
            y1.setContentDescription(charSequence);
            AbstractC0059br.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            Y1 y1 = this.d;
            if (y1 != null && o(y1)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        Y1 y2 = this.d;
        if (y2 != null) {
            y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2 c2 = this.c;
            if (c2 != null && o(c2)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                C2 c3 = new C2(context, null);
                this.c = c3;
                c3.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!o(this.c)) {
                b(this.c, true);
            }
        }
        C2 c4 = this.c;
        if (c4 != null) {
            c4.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        C2 c2 = this.c;
        if (c2 != null) {
            c2.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C2 c2 = this.b;
            if (c2 != null && o(c2)) {
                removeView(this.b);
                this.E.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                C2 c3 = new C2(context, null);
                this.b = c3;
                c3.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!o(this.b)) {
                b(this.b, true);
            }
        }
        C2 c4 = this.b;
        if (c4 != null) {
            c4.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        C2 c2 = this.b;
        if (c2 != null) {
            c2.setTextColor(colorStateList);
        }
    }
}
