package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class Uj {
    public static final Uj a = new Uj();

    public final OnBackInvokedCallback a(InterfaceC0107dd interfaceC0107dd) {
        Tf.j("onBackInvoked", interfaceC0107dd);
        return new K1(interfaceC0107dd, 1);
    }

    public final void b(Object obj, int i, Object obj2) {
        Tf.j("dispatcher", obj);
        Tf.j("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        Tf.j("dispatcher", obj);
        Tf.j("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
