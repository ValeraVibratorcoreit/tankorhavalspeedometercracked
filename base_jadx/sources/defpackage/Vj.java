package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class Vj implements OnBackAnimationCallback {
    public final /* synthetic */ InterfaceC0445od a;
    public final /* synthetic */ InterfaceC0445od b;
    public final /* synthetic */ InterfaceC0107dd c;
    public final /* synthetic */ InterfaceC0107dd d;

    public Vj(InterfaceC0445od interfaceC0445od, InterfaceC0445od interfaceC0445od2, InterfaceC0107dd interfaceC0107dd, InterfaceC0107dd interfaceC0107dd2) {
        this.a = interfaceC0445od;
        this.b = interfaceC0445od2;
        this.c = interfaceC0107dd;
        this.d = interfaceC0107dd2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Tf.j("backEvent", backEvent);
        this.b.c(new C0527r3(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Tf.j("backEvent", backEvent);
        this.a.c(new C0527r3(backEvent));
    }
}
