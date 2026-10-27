package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class Pt extends Ot {
    public Hf m;

    public Pt(Vt vt, WindowInsets windowInsets) {
        super(vt, windowInsets);
        this.m = null;
    }

    @Override // defpackage.Tt
    public Vt b() {
        return Vt.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.Tt
    public Vt c() {
        return Vt.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.Tt
    public final Hf h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = Hf.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.Tt
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.Tt
    public void q(Hf hf) {
        this.m = hf;
    }
}
