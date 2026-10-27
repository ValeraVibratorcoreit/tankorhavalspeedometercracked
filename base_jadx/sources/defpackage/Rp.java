package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Rp {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ Sp E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ActionProviderVisibilityListenerC0790zi z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public Rp(Sp sp, Menu menu) {
        this.E = sp;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        Sp sp = this.E;
        if (str != null) {
            if (sp.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (sp.d == null) {
                sp.d = Sp.a(sp.c);
            }
            Object obj = sp.d;
            String str2 = this.y;
            Qp qp = new Qp();
            qp.b = obj;
            Class<?> cls = obj.getClass();
            try {
                qp.c = cls.getMethod(str2, Qp.d);
                menuItem.setOnMenuItemClickListener(qp);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof C0759yi) {
                C0759yi c0759yi = (C0759yi) menuItem;
                c0759yi.x = (c0759yi.x & (-5)) | 4;
            } else if (menuItem instanceof Ci) {
                Ci ci = (Ci) menuItem;
                try {
                    Method method = ci.d;
                    Tp tp = ci.c;
                    if (method == null) {
                        ci.d = tp.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    ci.d.invoke(tp, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, Sp.e, sp.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0790zi actionProviderVisibilityListenerC0790zi = this.z;
        if (actionProviderVisibilityListenerC0790zi != null) {
            if (menuItem instanceof Tp) {
                ((Tp) menuItem).a(actionProviderVisibilityListenerC0790zi);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof Tp;
        if (z2) {
            ((Tp) menuItem).setContentDescription(charSequence);
        } else {
            AbstractC0697wi.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((Tp) menuItem).setTooltipText(charSequence2);
        } else {
            AbstractC0697wi.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((Tp) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            AbstractC0697wi.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((Tp) menuItem).setNumericShortcut(c2, i4);
        } else {
            AbstractC0697wi.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((Tp) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0697wi.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((Tp) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0697wi.i(menuItem, colorStateList);
            }
        }
    }
}
