package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0645us implements View.OnApplyWindowInsetsListener {
    public Vt a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ Rj c;

    public ViewOnApplyWindowInsetsListenerC0645us(View view, Rj rj) {
        this.b = view;
        this.c = rj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Vt vtG = Vt.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        Rj rj = this.c;
        if (i < 30) {
            AbstractC0676vs.a(windowInsets, this.b);
            if (vtG.equals(this.a)) {
                return rj.h(view, vtG).f();
            }
        }
        this.a = vtG;
        Vt vtH = rj.h(view, vtG);
        if (i >= 30) {
            return vtH.f();
        }
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0614ts.c(view);
        return vtH.f();
    }
}
