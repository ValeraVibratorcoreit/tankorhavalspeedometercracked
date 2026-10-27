package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0707ws {
    public static Vt a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        Vt vtG = Vt.g(null, rootWindowInsets);
        Tt tt = vtG.a;
        tt.p(vtG);
        tt.d(view.getRootView());
        return vtG;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
