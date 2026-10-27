package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0523qt extends AnimatorListenerAdapter implements InterfaceC0335kr {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ Kb e;

    public C0523qt(Kb kb, ViewGroup viewGroup, View view, View view2) {
        this.e = kb;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.InterfaceC0335kr
    public final void b(AbstractC0366lr abstractC0366lr) {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void c() {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void d(AbstractC0366lr abstractC0366lr) {
        if (this.d) {
            g();
        }
    }

    @Override // defpackage.InterfaceC0335kr
    public final void e() {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void f(AbstractC0366lr abstractC0366lr) {
        abstractC0366lr.x(this);
    }

    public final void g() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        g();
    }
}
