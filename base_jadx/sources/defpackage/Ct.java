package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class Ct implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ It a;
    public final /* synthetic */ Vt b;
    public final /* synthetic */ Vt c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public Ct(It it, Vt vt, Vt vt2, int i, View view) {
        this.a = it;
        this.b = vt;
        this.c = vt2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Nt lt;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        It it = this.a;
        it.a.d(animatedFraction);
        float fB = it.a.b();
        PathInterpolator pathInterpolator = Et.e;
        int i = Build.VERSION.SDK_INT;
        Vt vt = this.b;
        if (i >= 30) {
            lt = new Mt(vt);
        } else {
            lt = i >= 29 ? new Lt(vt) : new Kt(vt);
        }
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.d & i2) == 0) {
                lt.c(i2, vt.a.f(i2));
            } else {
                Hf hfF = vt.a.f(i2);
                Hf hfF2 = this.c.a.f(i2);
                float f = 1.0f - fB;
                lt.c(i2, Vt.e(hfF, (int) (((double) ((hfF.a - hfF2.a) * f)) + 0.5d), (int) (((double) ((hfF.b - hfF2.b) * f)) + 0.5d), (int) (((double) ((hfF.c - hfF2.c) * f)) + 0.5d), (int) (((double) ((hfF.d - hfF2.d) * f)) + 0.5d)));
            }
            i2 <<= 1;
            fB = fB;
            it = it;
        }
        Et.g(this.e, lt.b(), Collections.singletonList(it));
    }
}
