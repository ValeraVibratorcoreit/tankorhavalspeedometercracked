package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0243hq implements Bg {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.Bg
    public final void f() {
        Iterator it = Qr.e(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0212gq) it.next()).f();
        }
    }

    @Override // defpackage.Bg
    public final void j() {
        Iterator it = Qr.e(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0212gq) it.next()).j();
        }
    }

    @Override // defpackage.Bg
    public final void k() {
        Iterator it = Qr.e(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0212gq) it.next()).k();
        }
    }
}
