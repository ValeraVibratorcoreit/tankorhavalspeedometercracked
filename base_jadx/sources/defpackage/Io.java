package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Io implements Z6 {
    public final /* synthetic */ Lo a;

    public Io(Lo lo) {
        this.a = lo;
    }

    @Override // defpackage.Z6
    public final void a(boolean z) {
        ArrayList arrayList;
        Qr.a();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Z6) it.next()).a(z);
        }
    }
}
