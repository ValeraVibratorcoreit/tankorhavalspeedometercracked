package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0492pt extends AnimatorListenerAdapter implements InterfaceC0335kr {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public C0492pt(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        g(true);
    }

    @Override // defpackage.InterfaceC0335kr
    public final void b(AbstractC0366lr abstractC0366lr) {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void c() {
        g(false);
        if (this.f) {
            return;
        }
        AbstractC0153et.b(this.a, this.b);
    }

    @Override // defpackage.InterfaceC0335kr
    public final void d(AbstractC0366lr abstractC0366lr) {
    }

    @Override // defpackage.InterfaceC0335kr
    public final void e() {
        g(true);
        if (this.f) {
            return;
        }
        AbstractC0153et.b(this.a, 0);
    }

    @Override // defpackage.InterfaceC0335kr
    public final void f(AbstractC0366lr abstractC0366lr) {
        abstractC0366lr.x(this);
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        Br.r0(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            AbstractC0153et.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC0153et.b(this.a, 0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f) {
            AbstractC0153et.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }
}
