package defpackage;

import android.view.View;

/* JADX INFO: renamed from: wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691wc extends Br {
    public final /* synthetic */ AbstractComponentCallbacksC0784zc j;

    public C0691wc(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        this.j = abstractComponentCallbacksC0784zc;
    }

    @Override // defpackage.Br
    public final View N(int i) {
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.j;
        View view = abstractComponentCallbacksC0784zc.E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0784zc + " does not have a view");
    }

    @Override // defpackage.Br
    public final boolean Q() {
        return this.j.E != null;
    }
}
