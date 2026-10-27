package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0027aq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ C0058bq c;

    public C0027aq(C0058bq c0058bq, View view, View view2) {
        this.c = c0058bq;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
