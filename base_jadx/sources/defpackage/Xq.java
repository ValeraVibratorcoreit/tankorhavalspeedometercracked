package defpackage;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class Xq implements Vq, InterfaceC0542ri {
    public final /* synthetic */ Yq a;

    public /* synthetic */ Xq(Yq yq) {
        this.a = yq;
    }

    @Override // defpackage.InterfaceC0542ri
    public void k(MenuC0604ti menuC0604ti) {
        Yq yq = this.a;
        boolean zP = yq.j.a.p();
        Window.Callback callback = yq.k;
        if (zP) {
            callback.onPanelClosed(108, menuC0604ti);
        } else if (callback.onPreparePanel(0, null, menuC0604ti)) {
            callback.onMenuOpened(108, menuC0604ti);
        }
    }

    @Override // defpackage.InterfaceC0542ri
    public boolean n(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        return false;
    }
}
