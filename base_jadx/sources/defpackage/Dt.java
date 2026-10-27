package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Dt implements View.OnApplyWindowInsetsListener {
    public final C7 a;
    public Vt b;

    public Dt(View view, C7 c7) {
        Vt vtB;
        this.a = c7;
        WeakHashMap weakHashMap = Gs.a;
        Vt vtA = AbstractC0707ws.a(view);
        if (vtA != null) {
            int i = Build.VERSION.SDK_INT;
            vtB = (i >= 30 ? new Mt(vtA) : i >= 29 ? new Lt(vtA) : new Kt(vtA)).b();
        } else {
            vtB = null;
        }
        this.b = vtB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Tt tt;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = Vt.g(view, windowInsets);
            return Et.i(view, windowInsets);
        }
        Vt vtG = Vt.g(view, windowInsets);
        if (this.b == null) {
            WeakHashMap weakHashMap = Gs.a;
            this.b = AbstractC0707ws.a(view);
        }
        if (this.b == null) {
            this.b = vtG;
            return Et.i(view, windowInsets);
        }
        C7 c7J = Et.j(view);
        if (c7J != null && Objects.equals((WindowInsets) c7J.b, windowInsets)) {
            return Et.i(view, windowInsets);
        }
        Vt vt = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            tt = vtG.a;
            if (i > 256) {
                break;
            }
            if (!tt.f(i).equals(vt.a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return Et.i(view, windowInsets);
        }
        Vt vt2 = this.b;
        if ((i2 & 8) != 0) {
            interpolator = tt.f(8).d > vt2.a.f(8).d ? Et.e : Et.f;
        } else {
            interpolator = Et.g;
        }
        It it = new It(i2, interpolator, 160L);
        it.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(it.a.a());
        Hf hfF = tt.f(i2);
        Hf hfF2 = vt2.a.f(i2);
        int iMin = Math.min(hfF.a, hfF2.a);
        int i3 = hfF.b;
        int i4 = hfF2.b;
        int iMin2 = Math.min(i3, i4);
        int i5 = hfF.c;
        int i6 = hfF2.c;
        int iMin3 = Math.min(i5, i6);
        int i7 = hfF.d;
        int i8 = i2;
        int i9 = hfF2.d;
        C0426np c0426np = new C0426np(Hf.b(iMin, iMin2, iMin3, Math.min(i7, i9)), 6, Hf.b(Math.max(hfF.a, hfF2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        Et.f(view, windowInsets, false);
        duration.addUpdateListener(new Ct(it, vtG, vt2, i8, view));
        duration.addListener(new C0274ir(it, view));
        ViewTreeObserverOnPreDrawListenerC0359lk.a(view, new J8(view, it, c0426np, duration));
        this.b = vtG;
        return Et.i(view, windowInsets);
    }
}
