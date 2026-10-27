package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class J6 {
    public static final J6 a = new J6();

    public final OnBackInvokedDispatcher a(Activity activity) {
        Tf.j("activity", activity);
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        Tf.i("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
        return onBackInvokedDispatcher;
    }
}
