package defpackage;

import android.view.View;

/* JADX INFO: renamed from: dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0119dq implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ C0150eq b;

    public ViewOnLayoutChangeListenerC0119dq(C0150eq c0150eq, View view) {
        this.b = c0150eq;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.a;
        if (view2.getVisibility() == 0) {
            this.b.d(view2);
        }
    }
}
