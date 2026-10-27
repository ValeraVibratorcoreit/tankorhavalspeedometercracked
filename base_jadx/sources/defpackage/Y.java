package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 6:
                ((Ys) this.b).b();
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
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                C0309k1 c0309k1 = (C0309k1) this.b;
                ArrayList arrayList = new ArrayList(c0309k1.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((Zh) arrayList.get(i)).b.o;
                    if (colorStateList != null) {
                        O9.h(c0309k1, colorStateList);
                    }
                }
                break;
            case 2:
                C0227ha c0227ha = (C0227ha) this.b;
                c0227ha.q();
                c0227ha.r.start();
                break;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.b).h = null;
                break;
            case 4:
                ((View) this.b).setVisibility(4);
                super.onAnimationEnd(animator);
                break;
            case 5:
                ((AbstractC0366lr) this.b).m();
                animator.removeListener(this);
                break;
            default:
                ((Ys) this.b).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                C0309k1 c0309k1 = (C0309k1) this.b;
                ArrayList arrayList = new ArrayList(c0309k1.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0050bi c0050bi = ((Zh) arrayList.get(i)).b;
                    ColorStateList colorStateList = c0050bi.o;
                    if (colorStateList != null) {
                        O9.g(c0309k1, colorStateList.getColorForState(c0050bi.s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 6:
                ((Ys) this.b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public Y(Ys ys, View view) {
        this.a = 6;
        this.b = ys;
    }
}
