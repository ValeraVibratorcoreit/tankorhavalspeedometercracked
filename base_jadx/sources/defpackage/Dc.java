package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Dc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Vc a;
    public final /* synthetic */ Ec b;

    public Dc(Ec ec, Vc vc) {
        this.b = ec;
        this.a = vc;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Vc vc = this.a;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = vc.c;
        vc.k();
        O8.f((ViewGroup) abstractComponentCallbacksC0784zc.E.getParent(), this.b.a.E()).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
