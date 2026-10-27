package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0041b9 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0133e9 a;

    public DialogInterfaceOnCancelListenerC0041b9(DialogInterfaceOnCancelListenerC0133e9 dialogInterfaceOnCancelListenerC0133e9) {
        this.a = dialogInterfaceOnCancelListenerC0133e9;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0133e9 dialogInterfaceOnCancelListenerC0133e9 = this.a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0133e9.e0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0133e9.onCancel(dialog);
        }
    }
}
