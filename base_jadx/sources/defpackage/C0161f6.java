package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0161f6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0192g6 b;

    public /* synthetic */ C0161f6(C0192g6 c0192g6, int i) {
        this.a = i;
        this.b = c0192g6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
