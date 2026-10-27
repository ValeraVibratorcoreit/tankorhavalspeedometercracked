package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0780z8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ AbstractC0361lm b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ E8 e;

    public C0780z8(E8 e8, AbstractC0361lm abstractC0361lm, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = e8;
        this.b = abstractC0361lm;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                E8 e8 = this.e;
                AbstractC0361lm abstractC0361lm = this.b;
                e8.d(abstractC0361lm);
                e8.q.remove(abstractC0361lm);
                e8.j();
                break;
            default:
                this.d.setListener(null);
                E8 e9 = this.e;
                AbstractC0361lm abstractC0361lm2 = this.b;
                e9.d(abstractC0361lm2);
                e9.o.remove(abstractC0361lm2);
                e9.j();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public C0780z8(E8 e8, AbstractC0361lm abstractC0361lm, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = e8;
        this.b = abstractC0361lm;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
