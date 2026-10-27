package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Yj implements InterfaceC0468p5 {
    public final Hc a;
    public final /* synthetic */ C0021ak b;

    public Yj(C0021ak c0021ak, Hc hc) {
        Tf.j("onBackPressedCallback", hc);
        this.b = c0021ak;
        this.a = hc;
    }

    @Override // defpackage.InterfaceC0468p5
    public final void cancel() {
        C0021ak c0021ak = this.b;
        Z2 z2 = c0021ak.b;
        Hc hc = this.a;
        z2.remove(hc);
        if (Tf.b(c0021ak.c, hc)) {
            hc.getClass();
            c0021ak.c = null;
        }
        hc.getClass();
        hc.b.remove(this);
        InterfaceC0107dd interfaceC0107dd = hc.c;
        if (interfaceC0107dd != null) {
            interfaceC0107dd.a();
        }
        hc.c = null;
    }
}
