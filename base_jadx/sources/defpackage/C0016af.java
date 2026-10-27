package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0016af {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque e;
    public boolean f;
    public final Ye g;
    public final Xe h;
    public final Ze i;
    public final Ze j;
    public int k;
    public IOException l;
    public final int m;
    public final Te n;

    public C0016af(int i, Te te, boolean z, boolean z2, C0569se c0569se) {
        Tf.j("connection", te);
        this.m = i;
        this.n = te;
        this.d = te.s.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.g = new Ye(this, te.r.a(), z2);
        this.h = new Xe(this, z);
        int i2 = 0;
        this.i = new Ze(this, i2);
        this.j = new Ze(this, i2);
        if (c0569se == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!g())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c0569se);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() {
        boolean z;
        boolean zH;
        byte[] bArr = Rr.a;
        synchronized (this) {
            try {
                Ye ye = this.g;
                if (ye.e || !ye.c) {
                    z = false;
                } else {
                    Xe xe = this.h;
                    if (xe.c || xe.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zH) {
                return;
            }
            this.n.y(this.m);
        }
    }

    public final void b() throws IOException {
        Xe xe = this.h;
        if (xe.b) {
            throw new IOException("stream closed");
        }
        if (xe.c) {
            throw new IOException("stream finished");
        }
        if (this.k != 0) {
            IOException iOException = this.l;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.k;
            Vo.i(i);
            throw new Bp(i);
        }
    }

    public final void c(int i, IOException iOException) {
        Vo.j(i, "rstStatusCode");
        if (d(i, iOException)) {
            Te te = this.n;
            te.getClass();
            Vo.j(i, "statusCode");
            te.y.A(this.m, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = Rr.a;
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.e && this.h.c) {
                return false;
            }
            this.k = i;
            this.l = iOException;
            notifyAll();
            this.n.y(this.m);
            return true;
        }
    }

    public final void e(int i) {
        Vo.j(i, "errorCode");
        if (d(i, null)) {
            this.n.C(this.m, i);
        }
    }

    public final Xe f() {
        synchronized (this) {
            if (!this.f && !g()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.h;
    }

    public final boolean g() {
        return this.n.a == ((this.m & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.k != 0) {
            return false;
        }
        Ye ye = this.g;
        if (ye.e || ye.c) {
            Xe xe = this.h;
            if ((xe.c || xe.b) && this.f) {
                return false;
            }
        }
        return true;
    }

    public final void i(C0569se c0569se, boolean z) {
        boolean zH;
        Tf.j("headers", c0569se);
        byte[] bArr = Rr.a;
        synchronized (this) {
            try {
                if (this.f && z) {
                    this.g.getClass();
                } else {
                    this.f = true;
                    this.e.add(c0569se);
                }
                if (z) {
                    this.g.e = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.n.y(this.m);
    }

    public final synchronized void j(int i) {
        Vo.j(i, "errorCode");
        if (this.k == 0) {
            this.k = i;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
