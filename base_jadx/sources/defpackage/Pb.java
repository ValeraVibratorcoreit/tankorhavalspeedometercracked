package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class Pb extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ Qb b;

    public Pb(Qb qb) {
        this.b = qb;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        Qb qb = this.b;
        if (((Float) qb.z.getAnimatedValue()).floatValue() == 0.0f) {
            qb.A = 0;
            qb.g(0);
        } else {
            qb.A = 2;
            qb.s.invalidate();
        }
    }
}
