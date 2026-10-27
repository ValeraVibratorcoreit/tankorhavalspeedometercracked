package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class It {
    public Ht a;

    public It(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new Gt(B.i(i, interpolator, j));
        } else {
            this.a = new Et(i, interpolator, j);
        }
    }
}
