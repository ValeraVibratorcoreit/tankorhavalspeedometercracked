package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Xe implements Mo {
    public final L4 a = new L4();
    public boolean b;
    public final boolean c;
    public final /* synthetic */ C0016af d;

    public Xe(C0016af c0016af, boolean z) {
        this.d = c0016af;
        this.c = z;
    }

    @Override // defpackage.Mo
    public final Jq b() {
        return this.d.j;
    }

    @Override // defpackage.Mo, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i;
        C0016af c0016af = this.d;
        byte[] bArr = Rr.a;
        synchronized (c0016af) {
            if (this.b) {
                return;
            }
            C0016af c0016af2 = this.d;
            synchronized (c0016af2) {
                i = c0016af2.k;
            }
            boolean z = i == 0;
            C0016af c0016af3 = this.d;
            if (!c0016af3.h.c) {
                if (this.a.b > 0) {
                    while (this.a.b > 0) {
                        n(true);
                    }
                } else if (z) {
                    c0016af3.n.B(c0016af3.m, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.b = true;
            }
            this.d.n.flush();
            this.d.a();
        }
    }

    @Override // defpackage.Mo
    public final void d(L4 l4, long j) {
        Tf.j("source", l4);
        byte[] bArr = Rr.a;
        L4 l5 = this.a;
        l5.d(l4, j);
        while (l5.b >= 16384) {
            n(false);
        }
    }

    @Override // defpackage.Mo, java.io.Flushable
    public final void flush() {
        C0016af c0016af = this.d;
        byte[] bArr = Rr.a;
        synchronized (c0016af) {
            this.d.b();
        }
        while (this.a.b > 0) {
            n(false);
            this.d.n.flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    public final void n(boolean z) {
        long jMin;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        synchronized (this.d) {
            this.d.j.h();
            while (true) {
                try {
                    C0016af c0016af = this.d;
                    if (c0016af.c >= c0016af.d && !this.c && !this.b) {
                        synchronized (c0016af) {
                            i2 = c0016af.k;
                        }
                        if (i2 != 0) {
                            break;
                        } else {
                            this.d.k();
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    this.d.j.l();
                    throw th;
                }
            }
            this.d.j.l();
            this.d.b();
            C0016af c0016af2 = this.d;
            jMin = Math.min(c0016af2.d - c0016af2.c, this.a.b);
            C0016af c0016af3 = this.d;
            c0016af3.c += jMin;
            if (z && jMin == this.a.b) {
                synchronized (c0016af3) {
                    i = c0016af3.k;
                }
                if (i == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            z3 = z2;
        }
        this.d.j.h();
        try {
            C0016af c0016af4 = this.d;
            c0016af4.n.B(c0016af4.m, z3, this.a, jMin);
        } finally {
            this.d.j.l();
        }
    }
}
