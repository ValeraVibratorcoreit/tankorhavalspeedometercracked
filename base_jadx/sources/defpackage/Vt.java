package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Vt {
    public static final Vt b;
    public final Tt a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = St.q;
        } else {
            b = Tt.b;
        }
    }

    public Vt(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new St(this, windowInsets);
        } else if (i >= 29) {
            this.a = new Rt(this, windowInsets);
        } else {
            this.a = new Qt(this, windowInsets);
        }
    }

    public static Hf e(Hf hf, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, hf.a - i);
        int iMax2 = Math.max(0, hf.b - i2);
        int iMax3 = Math.max(0, hf.c - i3);
        int iMax4 = Math.max(0, hf.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? hf : Hf.b(iMax, iMax2, iMax3, iMax4);
    }

    public static Vt g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        Vt vt = new Vt(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = Gs.a;
            Vt vtA = AbstractC0707ws.a(view);
            Tt tt = vt.a;
            tt.p(vtA);
            tt.d(view.getRootView());
        }
        return vt;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vt)) {
            return false;
        }
        return Objects.equals(this.a, ((Vt) obj).a);
    }

    public final WindowInsets f() {
        Tt tt = this.a;
        if (tt instanceof Ot) {
            return ((Ot) tt).c;
        }
        return null;
    }

    public final int hashCode() {
        Tt tt = this.a;
        if (tt == null) {
            return 0;
        }
        return tt.hashCode();
    }

    public Vt() {
        this.a = new Tt(this);
    }
}
