package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Te implements Closeable {
    public static final C0087co B;
    public final LinkedHashSet A;
    public final Ke b;
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final C0334kq h;
    public final C0303jq i;
    public final C0303jq j;
    public final C0303jq k;
    public final C0473pa l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public final C0087co r;
    public C0087co s;
    public long t;
    public long u;
    public long v;
    public long w;
    public final Socket x;
    public final C0047bf y;
    public final Ne z;
    public final boolean a = true;
    public final LinkedHashMap c = new LinkedHashMap();

    static {
        C0087co c0087co = new C0087co();
        c0087co.c(7, 65535);
        c0087co.c(5, 16384);
        B = c0087co;
    }

    public Te(Ge ge) {
        this.b = (Ke) ge.f;
        String str = (String) ge.e;
        if (str == null) {
            Tf.a0("connectionName");
            throw null;
        }
        this.d = str;
        this.f = 3;
        C0334kq c0334kq = (C0334kq) ge.g;
        this.h = c0334kq;
        C0303jq c0303jqF = c0334kq.f();
        this.i = c0303jqF;
        this.j = c0334kq.f();
        this.k = c0334kq.f();
        this.l = C0473pa.j;
        C0087co c0087co = new C0087co();
        c0087co.c(7, 16777216);
        this.r = c0087co;
        C0087co c0087co2 = B;
        this.s = c0087co2;
        this.w = c0087co2.a();
        Socket socket = (Socket) ge.d;
        if (socket == null) {
            Tf.a0("socket");
            throw null;
        }
        this.x = socket;
        O4 o4 = ge.b;
        if (o4 == null) {
            Tf.a0("sink");
            throw null;
        }
        this.y = new C0047bf(o4, true);
        P4 p4 = ge.a;
        if (p4 == null) {
            Tf.a0("source");
            throw null;
        }
        this.z = new Ne(this, new We(p4, true));
        this.A = new LinkedHashSet();
        int i = ge.c;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            c0303jqF.c(new Ie(str.concat(" ping"), this, nanos), nanos);
        }
    }

    public final synchronized void A(long j) {
        long j2 = this.t + j;
        this.t = j2;
        long j3 = j2 - this.u;
        if (j3 >= this.r.a() / 2) {
            D(j3, 0);
            this.u += j3;
        }
    }

    public final void B(int i, boolean z, L4 l4, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.y.w(z, i, l4, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.v;
                            j3 = this.w;
                            if (j2 >= j3) {
                                if (!this.c.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.y.b);
                j4 = iMin;
                this.v += j4;
            }
            j -= j4;
            this.y.w(z && j == 0, i, l4, iMin);
        }
    }

    public final void C(int i, int i2) {
        Vo.j(i2, "errorCode");
        this.i.c(new Qe(this.d + '[' + i + "] writeSynReset", this, i, i2, 1), 0L);
    }

    public final void D(long j, int i) {
        this.i.c(new Se(this.d + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n(1, 9, null);
    }

    public final void flush() {
        this.y.flush();
    }

    public final void n(int i, int i2, IOException iOException) {
        int i3;
        C0016af[] c0016afArr;
        Vo.j(i, "connectionCode");
        Vo.j(i2, "streamCode");
        byte[] bArr = Rr.a;
        try {
            z(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (!this.c.isEmpty()) {
                    Object[] array = this.c.values().toArray(new C0016af[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    c0016afArr = (C0016af[]) array;
                    this.c.clear();
                } else {
                    c0016afArr = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0016afArr != null) {
            for (C0016af c0016af : c0016afArr) {
                try {
                    c0016af.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.y.close();
        } catch (IOException unused3) {
        }
        try {
            this.x.close();
        } catch (IOException unused4) {
        }
        this.i.e();
        this.j.e();
        this.k.e();
    }

    public final void w(IOException iOException) {
        n(2, 2, iOException);
    }

    public final synchronized C0016af x(int i) {
        return (C0016af) this.c.get(Integer.valueOf(i));
    }

    public final synchronized C0016af y(int i) {
        C0016af c0016af;
        c0016af = (C0016af) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return c0016af;
    }

    public final void z(int i) {
        Vo.j(i, "statusCode");
        synchronized (this.y) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.y.y(this.e, i, Rr.a);
            }
        }
    }
}
