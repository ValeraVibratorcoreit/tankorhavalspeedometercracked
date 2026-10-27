package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Os {
    public final Ps a = new Ps();

    public final void a() {
        Ps ps = this.a;
        if (ps != null && !ps.d) {
            ps.d = true;
            synchronized (ps.a) {
                try {
                    Iterator it = ps.b.values().iterator();
                    while (it.hasNext()) {
                        Ps.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = ps.c.iterator();
                    while (it2.hasNext()) {
                        Ps.a((AutoCloseable) it2.next());
                    }
                    ps.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
