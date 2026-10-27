package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class St extends Rt {
    public static final Vt q = Vt.g(null, WindowInsets.CONSUMED);

    public St(Vt vt, WindowInsets windowInsets) {
        super(vt, windowInsets);
    }

    @Override // defpackage.Ot, defpackage.Tt
    public final void d(View view) {
    }

    @Override // defpackage.Ot, defpackage.Tt
    public Hf f(int i) {
        return Hf.c(this.c.getInsets(Ut.a(i)));
    }
}
