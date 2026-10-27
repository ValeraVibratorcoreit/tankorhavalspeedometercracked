package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ot extends Tt {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public Hf[] d;
    public Hf e;
    public Vt f;
    public Hf g;

    public Ot(Vt vt, WindowInsets windowInsets) {
        super(vt);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private Hf r(int i2, boolean z) {
        Hf hfA = Hf.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                hfA = Hf.a(hfA, s(i3, z));
            }
        }
        return hfA;
    }

    private Hf t() {
        Vt vt = this.f;
        return vt != null ? vt.a.h() : Hf.e;
    }

    private Hf u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(objInvoke));
                if (rect != null) {
                    return Hf.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // defpackage.Tt
    public void d(View view) {
        Hf hfU = u(view);
        if (hfU == null) {
            hfU = Hf.e;
        }
        w(hfU);
    }

    @Override // defpackage.Tt
    public Hf f(int i2) {
        return r(i2, false);
    }

    @Override // defpackage.Tt
    public final Hf j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = Hf.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.Tt
    public Vt l(int i2, int i3, int i4, int i5) {
        Nt lt;
        Vt vtG = Vt.g(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            lt = new Mt(vtG);
        } else {
            lt = i6 >= 29 ? new Lt(vtG) : new Kt(vtG);
        }
        lt.g(Vt.e(j(), i2, i3, i4, i5));
        lt.e(Vt.e(h(), i2, i3, i4, i5));
        return lt.b();
    }

    @Override // defpackage.Tt
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.Tt
    public void o(Hf[] hfArr) {
        this.d = hfArr;
    }

    @Override // defpackage.Tt
    public void p(Vt vt) {
        this.f = vt;
    }

    public Hf s(int i2, boolean z) {
        Hf hfH;
        int i3;
        if (i2 == 1) {
            return z ? Hf.b(0, Math.max(t().b, j().b), 0, 0) : Hf.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                Hf hfT = t();
                Hf hfH2 = h();
                return Hf.b(Math.max(hfT.a, hfH2.a), 0, Math.max(hfT.c, hfH2.c), Math.max(hfT.d, hfH2.d));
            }
            Hf hfJ = j();
            Vt vt = this.f;
            hfH = vt != null ? vt.a.h() : null;
            int iMin = hfJ.d;
            if (hfH != null) {
                iMin = Math.min(iMin, hfH.d);
            }
            return Hf.b(hfJ.a, 0, hfJ.c, iMin);
        }
        Hf hf = Hf.e;
        if (i2 == 8) {
            Hf[] hfArr = this.d;
            hfH = hfArr != null ? hfArr[3] : null;
            if (hfH != null) {
                return hfH;
            }
            Hf hfJ2 = j();
            Hf hfT2 = t();
            int i4 = hfJ2.d;
            if (i4 > hfT2.d) {
                return Hf.b(0, 0, 0, i4);
            }
            Hf hf2 = this.g;
            return (hf2 == null || hf2.equals(hf) || (i3 = this.g.d) <= hfT2.d) ? hf : Hf.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return hf;
        }
        Vt vt2 = this.f;
        C0595t9 c0595t9E = vt2 != null ? vt2.a.e() : e();
        if (c0595t9E == null) {
            return hf;
        }
        DisplayCutout displayCutout = c0595t9E.a;
        return Hf.b(AbstractC0564s9.d(displayCutout), AbstractC0564s9.f(displayCutout), AbstractC0564s9.e(displayCutout), AbstractC0564s9.c(displayCutout));
    }

    public void w(Hf hf) {
        this.g = hf;
    }
}
