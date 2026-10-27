package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0134ea implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0134ea(C0227ha c0227ha) {
        this.b = c0227ha;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                C0227ha c0227ha = (C0227ha) this.b;
                c0227ha.getClass();
                c0227ha.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((Bt) ((Vi) this.b).a).m.getParent()).invalidate();
                break;
        }
    }
}
