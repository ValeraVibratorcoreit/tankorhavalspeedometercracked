package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0318ka {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static final void a(P6 p6) {
        C0380ma c0411na;
        Tf.j("<this>", p6);
        Wp wp = Wp.b;
        Xp xp = new Xp(0, 0, wp);
        Xp xp2 = new Xp(a, b, wp);
        View decorView = p6.getWindow().getDecorView();
        Tf.i("window.decorView", decorView);
        Resources resources = decorView.getResources();
        Tf.i("view.resources", resources);
        boolean zBooleanValue = ((Boolean) wp.c(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        Tf.i("view.resources", resources2);
        boolean zBooleanValue2 = ((Boolean) wp.c(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c0411na = new C0442oa();
        } else {
            c0411na = i >= 29 ? new C0411na() : new C0380ma();
        }
        Window window = p6.getWindow();
        Tf.i("window", window);
        c0411na.a(xp, xp2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = p6.getWindow();
        Tf.i("window", window2);
        c0411na.b(window2);
    }
}
