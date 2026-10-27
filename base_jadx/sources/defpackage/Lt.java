package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class Lt extends Nt {
    public final WindowInsets.Builder c;

    public Lt() {
        this.c = AbstractC0306jt.b();
    }

    @Override // defpackage.Nt
    public Vt b() {
        a();
        Vt vtG = Vt.g(null, this.c.build());
        vtG.a.o(this.b);
        return vtG;
    }

    @Override // defpackage.Nt
    public void d(Hf hf) {
        this.c.setMandatorySystemGestureInsets(hf.d());
    }

    @Override // defpackage.Nt
    public void e(Hf hf) {
        this.c.setStableInsets(hf.d());
    }

    @Override // defpackage.Nt
    public void f(Hf hf) {
        this.c.setSystemGestureInsets(hf.d());
    }

    @Override // defpackage.Nt
    public void g(Hf hf) {
        this.c.setSystemWindowInsets(hf.d());
    }

    @Override // defpackage.Nt
    public void h(Hf hf) {
        this.c.setTappableElementInsets(hf.d());
    }

    public Lt(Vt vt) {
        WindowInsets.Builder builderB;
        super(vt);
        WindowInsets windowInsetsF = vt.f();
        if (windowInsetsF != null) {
            builderB = AbstractC0306jt.c(windowInsetsF);
        } else {
            builderB = AbstractC0306jt.b();
        }
        this.c = builderB;
    }
}
