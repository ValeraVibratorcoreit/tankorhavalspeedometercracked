package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Xj implements InterfaceC0788zg, InterfaceC0468p5 {
    public final AbstractC0695wg a;
    public final Hc b;
    public Yj c;
    public final /* synthetic */ C0021ak d;

    public Xj(C0021ak c0021ak, AbstractC0695wg abstractC0695wg, Hc hc) {
        Tf.j("lifecycle", abstractC0695wg);
        Tf.j("onBackPressedCallback", hc);
        this.d = c0021ak;
        this.a = abstractC0695wg;
        this.b = hc;
        abstractC0695wg.a(this);
    }

    @Override // defpackage.InterfaceC0468p5
    public final void cancel() {
        this.a.b(this);
        Hc hc = this.b;
        hc.getClass();
        hc.b.remove(this);
        Yj yj = this.c;
        if (yj != null) {
            yj.cancel();
        }
        this.c = null;
    }

    @Override // defpackage.InterfaceC0788zg
    public final void n(Dg dg, EnumC0602tg enumC0602tg) {
        if (enumC0602tg != EnumC0602tg.ON_START) {
            if (enumC0602tg != EnumC0602tg.ON_STOP) {
                if (enumC0602tg == EnumC0602tg.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                Yj yj = this.c;
                if (yj != null) {
                    yj.cancel();
                    return;
                }
                return;
            }
        }
        C0021ak c0021ak = this.d;
        c0021ak.getClass();
        Hc hc = this.b;
        Tf.j("onBackPressedCallback", hc);
        c0021ak.b.a(hc);
        Yj yj2 = new Yj(c0021ak, hc);
        hc.b.add(yj2);
        c0021ak.d();
        hc.c = new Zj(c0021ak, 1);
        this.c = yj2;
    }
}
