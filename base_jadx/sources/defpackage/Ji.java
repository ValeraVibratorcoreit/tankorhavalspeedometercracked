package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Ji extends C0018ah implements InterfaceC0728xi {
    public static final Method D;
    public InterfaceC0728xi C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.C0018ah
    public final C0073ca o(Context context, boolean z) {
        Ii ii = new Ii(context, z);
        ii.setHoverListener(this);
        return ii;
    }

    @Override // defpackage.InterfaceC0728xi
    public final void t(MenuC0604ti menuC0604ti, C0759yi c0759yi) {
        InterfaceC0728xi interfaceC0728xi = this.C;
        if (interfaceC0728xi != null) {
            interfaceC0728xi.t(menuC0604ti, c0759yi);
        }
    }

    @Override // defpackage.InterfaceC0728xi
    public final void v(MenuC0604ti menuC0604ti, C0759yi c0759yi) {
        InterfaceC0728xi interfaceC0728xi = this.C;
        if (interfaceC0728xi != null) {
            interfaceC0728xi.v(menuC0604ti, c0759yi);
        }
    }
}
