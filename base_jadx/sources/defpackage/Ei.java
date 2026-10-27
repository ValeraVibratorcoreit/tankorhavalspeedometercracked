package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class Ei implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Fi a;

    public Ei(Fi fi) {
        this.a = fi;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
