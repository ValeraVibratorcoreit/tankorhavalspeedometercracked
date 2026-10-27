package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0349la {
    public void a(Xp xp, Xp xp2, Window window, View view, boolean z, boolean z2) {
        Td wt;
        Tf.j("statusBarStyle", xp);
        Tf.j("navigationBarStyle", xp2);
        Tf.j("window", window);
        Tf.j("view", view);
        F4.Y(window, false);
        window.setStatusBarColor(z ? xp.b : xp.a);
        window.setNavigationBarColor(z2 ? xp2.b : xp2.a);
        Vi vi = new Vi(view);
        if (Build.VERSION.SDK_INT >= 30) {
            Yt yt = new Yt(window.getInsetsController(), vi);
            yt.j = window;
            wt = yt;
        } else {
            wt = new Wt(window, vi);
        }
        wt.F(!z);
        wt.E(!z2);
    }
}
