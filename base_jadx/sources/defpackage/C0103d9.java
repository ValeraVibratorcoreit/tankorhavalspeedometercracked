package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0103d9 extends Br {
    public final /* synthetic */ Br j;
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0133e9 k;

    public C0103d9(DialogInterfaceOnCancelListenerC0133e9 dialogInterfaceOnCancelListenerC0133e9, C0691wc c0691wc) {
        this.k = dialogInterfaceOnCancelListenerC0133e9;
        this.j = c0691wc;
    }

    @Override // defpackage.Br
    public final View N(int i) {
        Br br = this.j;
        if (br.Q()) {
            return br.N(i);
        }
        Dialog dialog = this.k.e0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.Br
    public final boolean Q() {
        return this.j.Q() || this.k.h0;
    }
}
