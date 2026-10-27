package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K1 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ K1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((R1) this.b).D();
                break;
            case 1:
                InterfaceC0107dd interfaceC0107dd = (InterfaceC0107dd) this.b;
                Tf.j("$onBackInvoked", interfaceC0107dd);
                interfaceC0107dd.a();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
