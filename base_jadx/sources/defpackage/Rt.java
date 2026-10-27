package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class Rt extends Qt {
    public Hf n;
    public Hf o;
    public Hf p;

    public Rt(Vt vt, WindowInsets windowInsets) {
        super(vt, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.Tt
    public Hf g() {
        if (this.o == null) {
            this.o = Hf.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.Tt
    public Hf i() {
        if (this.n == null) {
            this.n = Hf.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // defpackage.Tt
    public Hf k() {
        if (this.p == null) {
            this.p = Hf.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // defpackage.Ot, defpackage.Tt
    public Vt l(int i, int i2, int i3, int i4) {
        return Vt.g(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.Pt, defpackage.Tt
    public void q(Hf hf) {
    }
}
