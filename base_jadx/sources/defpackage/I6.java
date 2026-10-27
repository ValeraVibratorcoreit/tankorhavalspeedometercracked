package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I6 implements InterfaceC0788zg {
    public final /* synthetic */ C0021ak a;
    public final /* synthetic */ P6 b;

    public /* synthetic */ I6(C0021ak c0021ak, P6 p6) {
        this.a = c0021ak;
        this.b = p6;
    }

    @Override // defpackage.InterfaceC0788zg
    public final void n(Dg dg, EnumC0602tg enumC0602tg) {
        C0021ak c0021ak = this.a;
        Tf.j("$dispatcher", c0021ak);
        P6 p6 = this.b;
        Tf.j("this$0", p6);
        if (enumC0602tg == EnumC0602tg.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = J6.a.a(p6);
            Tf.j("invoker", onBackInvokedDispatcherA);
            c0021ak.e = onBackInvokedDispatcherA;
            c0021ak.c(c0021ak.g);
        }
    }
}
