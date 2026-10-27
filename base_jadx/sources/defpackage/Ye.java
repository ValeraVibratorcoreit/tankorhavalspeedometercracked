package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Ye implements Xo {
    public final L4 a = new L4();
    public final L4 b = new L4();
    public boolean c;
    public final long d;
    public boolean e;
    public final /* synthetic */ C0016af f;

    public Ye(C0016af c0016af, long j, boolean z) {
        this.f = c0016af;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return this.f.i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f) {
            this.c = true;
            L4 l4 = this.b;
            j = l4.b;
            l4.a(j);
            C0016af c0016af = this.f;
            if (c0016af == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            c0016af.notifyAll();
        }
        if (j > 0) {
            n(j);
        }
        this.f.a();
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) throws Throwable {
        int i;
        Throwable bp;
        long jF;
        boolean z;
        int i2;
        Tf.j("sink", l4);
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        while (true) {
            synchronized (this.f) {
                this.f.i.h();
                try {
                    C0016af c0016af = this.f;
                    synchronized (c0016af) {
                        i = c0016af.k;
                    }
                    if (i != 0) {
                        bp = this.f.l;
                        if (bp == null) {
                            C0016af c0016af2 = this.f;
                            synchronized (c0016af2) {
                                i2 = c0016af2.k;
                            }
                            Vo.i(i2);
                            bp = new Bp(i2);
                        }
                    } else {
                        bp = null;
                    }
                    if (this.c) {
                        throw new IOException("stream closed");
                    }
                    L4 l5 = this.b;
                    long j3 = l5.b;
                    if (j3 > j2) {
                        jF = l5.f(l4, Math.min(j, j3));
                        C0016af c0016af3 = this.f;
                        long j4 = c0016af3.a + jF;
                        c0016af3.a = j4;
                        long j5 = j4 - c0016af3.b;
                        if (bp == null && j5 >= c0016af3.n.r.a() / 2) {
                            C0016af c0016af4 = this.f;
                            c0016af4.n.D(j5, c0016af4.m);
                            C0016af c0016af5 = this.f;
                            c0016af5.b = c0016af5.a;
                        }
                    } else {
                        if (this.e || bp != null) {
                            jF = -1;
                        } else {
                            this.f.k();
                            z = true;
                            jF = -1;
                        }
                        this.f.i.l();
                    }
                    z = false;
                    this.f.i.l();
                } catch (Throwable th) {
                    this.f.i.l();
                    throw th;
                }
            }
            if (!z) {
                if (jF != -1) {
                    n(jF);
                    return jF;
                }
                if (bp == null) {
                    return -1L;
                }
                throw bp;
            }
            j2 = 0;
        }
    }

    public final void n(long j) {
        byte[] bArr = Rr.a;
        this.f.n.A(j);
    }
}
