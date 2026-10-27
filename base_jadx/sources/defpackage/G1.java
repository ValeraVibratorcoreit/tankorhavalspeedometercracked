package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class G1 implements Rj, A7, Ki {
    public final /* synthetic */ int a;
    public final /* synthetic */ R1 b;

    public /* synthetic */ G1(R1 r1, int i) {
        this.a = i;
        this.b = r1;
    }

    @Override // defpackage.Ki
    public void b(MenuC0604ti menuC0604ti, boolean z) {
        Q1 q1;
        switch (this.a) {
            case 2:
                this.b.r(menuC0604ti);
                break;
            default:
                MenuC0604ti menuC0604tiK = menuC0604ti.k();
                int i = 0;
                boolean z2 = menuC0604tiK != menuC0604ti;
                if (z2) {
                    menuC0604ti = menuC0604tiK;
                }
                R1 r1 = this.b;
                Q1[] q1Arr = r1.M;
                int length = q1Arr != null ? q1Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        q1 = null;
                    } else {
                        q1 = q1Arr[i];
                        if (q1 == null || q1.h != menuC0604ti) {
                            i++;
                        }
                    }
                }
                if (q1 != null) {
                    if (!z2) {
                        r1.s(q1, z);
                    } else {
                        r1.q(q1.a, q1, menuC0604tiK);
                        r1.s(q1, true);
                    }
                }
                break;
        }
    }

    @Override // defpackage.Rj
    public Vt h(View view, Vt vt) {
        int i;
        boolean z;
        Vt vtB;
        Nt lt;
        boolean z2;
        int iD = vt.d();
        R1 r1 = this.b;
        r1.getClass();
        int iD2 = vt.d();
        ActionBarContextView actionBarContextView = r1.v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r1.v.getLayoutParams();
            boolean z3 = true;
            if (r1.v.isShown()) {
                if (r1.d0 == null) {
                    r1.d0 = new Rect();
                    r1.e0 = new Rect();
                }
                Rect rect = r1.d0;
                Rect rect2 = r1.e0;
                rect.set(vt.b(), vt.d(), vt.c(), vt.a());
                ViewGroup viewGroup = r1.B;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0122dt.a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC0390mk.j) {
                        AbstractC0390mk.j = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC0390mk.k = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC0390mk.k.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC0390mk.k;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = r1.B;
                WeakHashMap weakHashMap = Gs.a;
                Vt vtA = AbstractC0707ws.a(viewGroup2);
                int iB = vtA == null ? 0 : vtA.b();
                int iC = vtA == null ? 0 : vtA.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                Context context = r1.k;
                if (i2 <= 0 || r1.D != null) {
                    View view2 = r1.D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            r1.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    r1.D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    r1.B.addView(r1.D, -1, layoutParams);
                }
                View view4 = r1.D;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = r1.D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? I7.a(context, R.color.abc_decor_view_status_guard_light) : I7.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!r1.I && z3) {
                    iD2 = 0;
                }
                z = z3;
                z3 = z2;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (z3) {
                r1.v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = r1.D;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (iD != iD2) {
            int iB2 = vt.b();
            int iC2 = vt.c();
            int iA = vt.a();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                lt = new Mt(vt);
            } else {
                lt = i7 >= 29 ? new Lt(vt) : new Kt(vt);
            }
            lt.g(Hf.b(iB2, iD2, iC2, iA));
            vtB = lt.b();
        } else {
            vtB = vt;
        }
        WeakHashMap weakHashMap2 = Gs.a;
        WindowInsets windowInsetsF = vtB.f();
        if (windowInsetsF == null) {
            return vtB;
        }
        WindowInsets windowInsetsB = AbstractC0614ts.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? Vt.g(view, windowInsetsB) : vtB;
    }

    @Override // defpackage.Ki
    public boolean u(MenuC0604ti menuC0604ti) {
        Window.Callback callback;
        switch (this.a) {
            case 2:
                Window.Callback callback2 = this.b.l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0604ti);
                }
                break;
            default:
                if (menuC0604ti == menuC0604ti.k()) {
                    R1 r1 = this.b;
                    if (r1.G && (callback = r1.l.getCallback()) != null && !r1.R) {
                        callback.onMenuOpened(108, menuC0604ti);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
