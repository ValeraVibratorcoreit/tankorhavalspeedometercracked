package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Jb extends AnimatorListenerAdapter implements InterfaceC0335kr {
    public final View a;
    public boolean b = false;

    public Jb(View view) {
        this.a = view;
    }

    @Override // defpackage.InterfaceC0335kr
    public final void a(AbstractC0366lr abstractC0366lr) {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void b(AbstractC0366lr abstractC0366lr) {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void c() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC0153et.a.D(view) : 0.0f));
    }

    @Override // defpackage.InterfaceC0335kr
    public final void d(AbstractC0366lr abstractC0366lr) {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void e() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.InterfaceC0335kr
    public final void f(AbstractC0366lr abstractC0366lr) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC0153et.a.n0(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C0368lt c0368lt = AbstractC0153et.a;
        c0368lt.n0(view, 1.0f);
        c0368lt.getClass();
    }
}
