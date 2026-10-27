package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class Gt extends Ht {
    public final WindowInsetsAnimation e;

    public Gt(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.Ht
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.Ht
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.Ht
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.Ht
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
