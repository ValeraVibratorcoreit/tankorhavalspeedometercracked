package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Ag implements InterfaceC0664vg, Cg {
    public final HashSet a = new HashSet();
    public final AbstractC0695wg b;

    public Ag(AbstractC0695wg abstractC0695wg) {
        this.b = abstractC0695wg;
        abstractC0695wg.a(this);
    }

    @Override // defpackage.InterfaceC0664vg
    public final void f(Bg bg) {
        this.a.remove(bg);
    }

    @Override // defpackage.InterfaceC0664vg
    public final void g(Bg bg) {
        this.a.add(bg);
        EnumC0633ug enumC0633ug = ((Fg) this.b).c;
        if (enumC0633ug == EnumC0633ug.a) {
            bg.k();
        } else if (enumC0633ug.compareTo(EnumC0633ug.d) >= 0) {
            bg.j();
        } else {
            bg.f();
        }
    }

    @InterfaceC0144ek(EnumC0602tg.ON_DESTROY)
    public void onDestroy(Dg dg) {
        Iterator it = Qr.e(this.a).iterator();
        while (it.hasNext()) {
            ((Bg) it.next()).k();
        }
        dg.getLifecycle().b(this);
    }

    @InterfaceC0144ek(EnumC0602tg.ON_START)
    public void onStart(Dg dg) {
        Iterator it = Qr.e(this.a).iterator();
        while (it.hasNext()) {
            ((Bg) it.next()).j();
        }
    }

    @InterfaceC0144ek(EnumC0602tg.ON_STOP)
    public void onStop(Dg dg) {
        Iterator it = Qr.e(this.a).iterator();
        while (it.hasNext()) {
            ((Bg) it.next()).f();
        }
    }
}
