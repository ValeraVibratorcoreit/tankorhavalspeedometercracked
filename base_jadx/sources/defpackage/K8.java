package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class K8 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C0118dp d;
    public final /* synthetic */ M8 e;

    public K8(ViewGroup viewGroup, View view, boolean z, C0118dp c0118dp, M8 m8) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = c0118dp;
        this.e = m8;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        C0118dp c0118dp = this.d;
        if (z) {
            Vo.a(view, c0118dp.a);
        }
        this.e.e();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + c0118dp + " has ended.");
        }
    }
}
