package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final class Wj {
    public static final Wj a = new Wj();

    public final OnBackInvokedCallback a(InterfaceC0445od interfaceC0445od, InterfaceC0445od interfaceC0445od2, InterfaceC0107dd interfaceC0107dd, InterfaceC0107dd interfaceC0107dd2) {
        Tf.j("onBackStarted", interfaceC0445od);
        Tf.j("onBackProgressed", interfaceC0445od2);
        Tf.j("onBackInvoked", interfaceC0107dd);
        Tf.j("onBackCancelled", interfaceC0107dd2);
        return new Vj(interfaceC0445od, interfaceC0445od2, interfaceC0107dd, interfaceC0107dd2);
    }
}
