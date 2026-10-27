package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Rq implements InterfaceC0432o0, InterfaceC0542ri {
    public final /* synthetic */ Toolbar a;

    public /* synthetic */ Rq(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // defpackage.InterfaceC0542ri
    public void k(MenuC0604ti menuC0604ti) {
        Toolbar toolbar = this.a;
        C0339l0 c0339l0 = toolbar.a.t;
        if (c0339l0 == null || !c0339l0.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.G.d).iterator();
            while (it.hasNext()) {
                ((Ic) it.next()).a.s();
            }
        }
        InterfaceC0542ri interfaceC0542ri = toolbar.O;
        if (interfaceC0542ri != null) {
            interfaceC0542ri.k(menuC0604ti);
        }
    }

    @Override // defpackage.InterfaceC0542ri
    public boolean n(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        InterfaceC0542ri interfaceC0542ri = this.a.O;
        return interfaceC0542ri != null && interfaceC0542ri.n(menuC0604ti, menuItem);
    }
}
