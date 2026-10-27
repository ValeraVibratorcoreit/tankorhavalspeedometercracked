package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0274ir extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public C0274ir(It it, View view) {
        this.b = it;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((C0066c3) this.b).remove(animator);
                ((AbstractC0366lr) this.c).n.remove(animator);
                break;
            default:
                ((It) this.b).a.d(1.0f);
                Et.e((View) this.c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((AbstractC0366lr) this.c).n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0274ir(AbstractC0366lr abstractC0366lr, C0066c3 c0066c3) {
        this.c = abstractC0366lr;
        this.b = c0066c3;
    }
}
