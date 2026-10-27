package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class L1 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, R1 r1) {
        Objects.requireNonNull(r1);
        K1 k1 = new K1(r1, 0);
        D.e(obj).registerOnBackInvokedCallback(1000000, k1);
        return k1;
    }

    public static void c(Object obj, Object obj2) {
        D.e(obj).unregisterOnBackInvokedCallback(D.b(obj2));
    }
}
