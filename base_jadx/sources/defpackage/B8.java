package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class B8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C8 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ E8 e;

    public /* synthetic */ B8(E8 e8, C8 c8, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = e8;
        this.b = c8;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C8 c8 = this.b;
                AbstractC0361lm abstractC0361lm = c8.a;
                E8 e8 = this.e;
                e8.d(abstractC0361lm);
                e8.r.remove(c8.a);
                e8.j();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C8 c9 = this.b;
                AbstractC0361lm abstractC0361lm2 = c9.b;
                E8 e9 = this.e;
                e9.d(abstractC0361lm2);
                e9.r.remove(c9.b);
                e9.j();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                AbstractC0361lm abstractC0361lm = this.b.a;
                this.e.getClass();
                break;
            default:
                AbstractC0361lm abstractC0361lm2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
