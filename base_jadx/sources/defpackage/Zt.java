package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class Zt {
    public final Td a;

    public Zt(WindowInsetsController windowInsetsController) {
        Vi vi = new Vi();
        Uo uo = new Uo(null);
        uo.c = windowInsetsController;
        vi.a = uo;
        this.a = new Yt(windowInsetsController, vi);
    }

    public Zt(Window window, View view) {
        Vi vi = new Vi(view);
        if (Build.VERSION.SDK_INT >= 30) {
            Yt yt = new Yt(window.getInsetsController(), vi);
            yt.j = window;
            this.a = yt;
            return;
        }
        this.a = new Wt(window, vi);
    }
}
