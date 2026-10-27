package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Me extends AbstractC0273iq {
    public final /* synthetic */ Ne e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ C0087co g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me(String str, Ne ne, C0087co c0087co) {
        super(str, true);
        this.e = ne;
        this.g = c0087co;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        long jA;
        int i;
        C0016af[] c0016afArr;
        Ne ne = this.e;
        boolean z = this.f;
        C0087co c0087co = this.g;
        ne.getClass();
        Tf.j("settings", c0087co);
        C0454om c0454om = new C0454om(0);
        synchronized (ne.b.y) {
            synchronized (ne.b) {
                try {
                    C0087co c0087co2 = ne.b.s;
                    if (!z) {
                        C0087co c0087co3 = new C0087co();
                        c0087co3.b(c0087co2);
                        c0087co3.b(c0087co);
                        c0087co = c0087co3;
                    }
                    c0454om.b = c0087co;
                    jA = ((long) c0087co.a()) - ((long) c0087co2.a());
                    if (jA == 0 || ne.b.c.isEmpty()) {
                        c0016afArr = null;
                    } else {
                        Object[] array = ne.b.c.values().toArray(new C0016af[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        c0016afArr = (C0016af[]) array;
                    }
                    Te te = ne.b;
                    C0087co c0087co4 = (C0087co) c0454om.b;
                    te.getClass();
                    Tf.j("<set-?>", c0087co4);
                    te.s = c0087co4;
                    ne.b.k.c(new Le(ne.b.d + " onSettings", ne, c0454om), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ne.b.y.n((C0087co) c0454om.b);
            } catch (IOException e) {
                ne.b.n(2, 2, e);
            }
        }
        C0016af[] c0016afArr2 = c0016afArr;
        if (c0016afArr2 == null) {
            return -1L;
        }
        for (C0016af c0016af : c0016afArr2) {
            synchronized (c0016af) {
                c0016af.d += jA;
                if (jA > 0) {
                    c0016af.notifyAll();
                }
            }
        }
        return -1L;
    }
}
