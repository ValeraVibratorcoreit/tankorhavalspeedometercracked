package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class I5 extends AbstractC0397mr {
    public boolean a = false;
    public final ViewGroup b;

    public I5(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.AbstractC0397mr, defpackage.InterfaceC0335kr
    public final void c() {
        Br.r0(this.b, false);
    }

    @Override // defpackage.AbstractC0397mr, defpackage.InterfaceC0335kr
    public final void d(AbstractC0366lr abstractC0366lr) {
        Br.r0(this.b, false);
        this.a = true;
    }

    @Override // defpackage.AbstractC0397mr, defpackage.InterfaceC0335kr
    public final void e() {
        Br.r0(this.b, true);
    }

    @Override // defpackage.InterfaceC0335kr
    public final void f(AbstractC0366lr abstractC0366lr) {
        if (!this.a) {
            Br.r0(this.b, false);
        }
        abstractC0366lr.x(this);
    }
}
