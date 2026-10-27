package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class A5 extends Di implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public Ki x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0310k2 j = new ViewTreeObserverOnGlobalLayoutListenerC0310k2(this, 2);
    public final ViewOnAttachStateChangeListenerC0715x5 k = new ViewOnAttachStateChangeListenerC0715x5(this, 0);
    public final C0308k0 l = new C0308k0(this, 3);
    public int m = 0;
    public int n = 0;
    public boolean v = false;

    public A5(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    @Override // defpackage.Co
    public final boolean a() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((C0777z5) arrayList.get(0)).a.z.isShowing();
    }

    @Override // defpackage.Li
    public final void b(MenuC0604ti menuC0604ti, boolean z) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0604ti == ((C0777z5) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C0777z5) arrayList.get(i2)).b.c(false);
        }
        C0777z5 c0777z5 = (C0777z5) arrayList.remove(i);
        c0777z5.b.r(this);
        boolean z2 = this.A;
        Ji ji = c0777z5.a;
        if (z2) {
            Gi.b(ji.z, null);
            ji.z.setAnimationStyle(0);
        }
        ji.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.q = ((C0777z5) arrayList.get(size2 - 1)).c;
        } else {
            this.q = this.o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0777z5) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        Ki ki = this.x;
        if (ki != null) {
            ki.b(menuC0604ti, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // defpackage.Li
    public final boolean c() {
        return false;
    }

    @Override // defpackage.Co
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            C0777z5[] c0777z5Arr = (C0777z5[]) arrayList.toArray(new C0777z5[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0777z5 c0777z5 = c0777z5Arr[i];
                if (c0777z5.a.z.isShowing()) {
                    c0777z5.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.Co
    public final void e() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0604ti) it.next());
        }
        arrayList.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // defpackage.Li
    public final void f(Ki ki) {
        this.x = ki;
    }

    @Override // defpackage.Li
    public final void h() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0777z5) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0512qi) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.Co
    public final C0073ca i() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0777z5) arrayList.get(arrayList.size() - 1)).a.c;
    }

    @Override // defpackage.Li
    public final boolean k(Np np) {
        for (C0777z5 c0777z5 : this.i) {
            if (np == c0777z5.b) {
                c0777z5.a.c.requestFocus();
                return true;
            }
        }
        if (!np.hasVisibleItems()) {
            return false;
        }
        l(np);
        Ki ki = this.x;
        if (ki != null) {
            ki.u(np);
        }
        return true;
    }

    @Override // defpackage.Di
    public final void l(MenuC0604ti menuC0604ti) {
        menuC0604ti.b(this, this.b);
        if (a()) {
            v(menuC0604ti);
        } else {
            this.h.add(menuC0604ti);
        }
    }

    @Override // defpackage.Di
    public final void n(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = Gravity.getAbsoluteGravity(this.m, view.getLayoutDirection());
        }
    }

    @Override // defpackage.Di
    public final void o(boolean z) {
        this.v = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0777z5 c0777z5;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0777z5 = null;
                break;
            }
            c0777z5 = (C0777z5) arrayList.get(i);
            if (!c0777z5.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0777z5 != null) {
            c0777z5.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.Di
    public final void p(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = Gravity.getAbsoluteGravity(i, this.o.getLayoutDirection());
        }
    }

    @Override // defpackage.Di
    public final void q(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // defpackage.Di
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.Di
    public final void s(boolean z) {
        this.w = z;
    }

    @Override // defpackage.Di
    public final void t(int i) {
        this.s = true;
        this.u = i;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x0197  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void v(MenuC0604ti menuC0604ti) {
        C0777z5 c0777z5;
        View childAt;
        Rect rect;
        Rect rect2;
        int i;
        C0065c2 c0065c2;
        C0073ca c0073ca;
        int[] iArr;
        Rect rect3;
        int i2;
        int i3;
        boolean z;
        Method method;
        MenuItem item;
        C0512qi c0512qi;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0512qi c0512qi2 = new C0512qi(menuC0604ti, layoutInflaterFrom, this.f, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.v) {
            c0512qi2.c = true;
        } else if (a()) {
            c0512qi2.c = Di.u(menuC0604ti);
        }
        int iM = Di.m(c0512qi2, context, this.c);
        Ji ji = new Ji(context, null, this.d, this.e);
        ji.C = this.l;
        ji.p = this;
        ji.z.setOnDismissListener(this);
        ji.o = this.o;
        ji.l = this.n;
        ji.y = true;
        ji.z.setFocusable(true);
        ji.z.setInputMethodMode(2);
        ji.m(c0512qi2);
        ji.p(iM);
        ji.l = this.n;
        ArrayList arrayList = this.i;
        if (arrayList.size() > 0) {
            c0777z5 = (C0777z5) arrayList.get(arrayList.size() - 1);
            MenuC0604ti menuC0604ti2 = c0777z5.b;
            int size = menuC0604ti2.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    item = null;
                    break;
                }
                item = menuC0604ti2.getItem(i4);
                if (item.hasSubMenu() && menuC0604ti == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C0073ca c0073ca2 = c0777z5.a.c;
                ListAdapter adapter = c0073ca2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0512qi = (C0512qi) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0512qi = (C0512qi) adapter;
                    headersCount = 0;
                }
                int count = c0512qi.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == c0512qi.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - c0073ca2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0073ca2.getChildCount()) {
                    childAt = c0073ca2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i = Build.VERSION.SDK_INT;
                c0065c2 = ji.z;
                if (i <= 28) {
                    method = Ji.D;
                    if (method != null) {
                        try {
                            method.invoke(c0065c2, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    Hi.a(c0065c2, false);
                }
                Gi.a(ji.z, null);
                c0073ca = ((C0777z5) arrayList.get(arrayList.size() - 1)).a.c;
                iArr = new int[2];
                c0073ca.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.p.getWindowVisibleDisplayFrame(rect3);
                if (this.q == 1) {
                    if (c0073ca.getWidth() + iArr[0] + iM > rect3.right) {
                        i3 = 0;
                        i2 = 1;
                    } else {
                        i2 = 1;
                        i3 = 1;
                    }
                } else if (iArr[0] - iM < 0) {
                    i2 = 1;
                    i3 = 1;
                } else {
                    i3 = 0;
                    i2 = 1;
                }
                if (i3 == i2) {
                    z = true;
                } else {
                    z = false;
                }
                this.q = i3;
                ji.o = childAt;
                if ((this.n & 5) == 5) {
                    if (!z) {
                        iM = 0 - childAt.getWidth();
                    }
                } else if (z) {
                    iM = childAt.getWidth();
                } else {
                    iM = 0 - iM;
                }
                ji.f = iM;
                ji.k = true;
                ji.j = true;
                ji.l(0);
            } else {
                if (this.r) {
                    ji.f = this.t;
                }
                if (this.s) {
                    ji.l(this.u);
                }
                rect = this.a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                ji.x = rect2;
            }
            arrayList.add(new C0777z5(ji, menuC0604ti, this.q));
            ji.e();
            C0073ca c0073ca3 = ji.c;
            c0073ca3.setOnKeyListener(this);
            if (c0777z5 == null || !this.w || menuC0604ti.m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0073ca3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0604ti.m);
            c0073ca3.addHeaderView(frameLayout, null, false);
            ji.e();
            return;
        }
        c0777z5 = null;
        childAt = null;
        if (childAt != null) {
            i = Build.VERSION.SDK_INT;
            c0065c2 = ji.z;
            if (i <= 28) {
                method = Ji.D;
                if (method != null) {
                    method.invoke(c0065c2, Boolean.FALSE);
                }
            } else {
                Hi.a(c0065c2, false);
            }
            Gi.a(ji.z, null);
            c0073ca = ((C0777z5) arrayList.get(arrayList.size() - 1)).a.c;
            iArr = new int[2];
            c0073ca.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.p.getWindowVisibleDisplayFrame(rect3);
            if (this.q == 1) {
                if (c0073ca.getWidth() + iArr[0] + iM > rect3.right) {
                    i3 = 0;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i2 = 1;
                i3 = 1;
            } else {
                i3 = 0;
                i2 = 1;
            }
            if (i3 == i2) {
                z = true;
            } else {
                z = false;
            }
            this.q = i3;
            ji.o = childAt;
            if ((this.n & 5) == 5) {
                if (!z) {
                    iM = 0 - childAt.getWidth();
                }
            } else if (z) {
                iM = childAt.getWidth();
            } else {
                iM = 0 - iM;
            }
            ji.f = iM;
            ji.k = true;
            ji.j = true;
            ji.l(0);
        } else {
            if (this.r) {
                ji.f = this.t;
            }
            if (this.s) {
                ji.l(this.u);
            }
            rect = this.a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            ji.x = rect2;
        }
        arrayList.add(new C0777z5(ji, menuC0604ti, this.q));
        ji.e();
        C0073ca c0073ca4 = ji.c;
        c0073ca4.setOnKeyListener(this);
        if (c0777z5 == null) {
        }
    }
}
