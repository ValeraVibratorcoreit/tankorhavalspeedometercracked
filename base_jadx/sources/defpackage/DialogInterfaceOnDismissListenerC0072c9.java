package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0072c9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0133e9 a;

    public DialogInterfaceOnDismissListenerC0072c9(DialogInterfaceOnCancelListenerC0133e9 dialogInterfaceOnCancelListenerC0133e9) {
        this.a = dialogInterfaceOnCancelListenerC0133e9;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0133e9 dialogInterfaceOnCancelListenerC0133e9 = this.a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0133e9.e0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0133e9.onDismiss(dialog);
        }
    }
}
