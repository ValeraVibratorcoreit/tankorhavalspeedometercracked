package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class Dl implements Cloneable {
    public final Hl a;
    public final C0473pa b;
    public final Ze c;
    public final AtomicBoolean d;
    public Object e;
    public C0628ub f;
    public Gl g;
    public boolean h;
    public C0566sb i;
    public boolean j;
    public boolean k;
    public boolean l;
    public volatile boolean m;
    public volatile C0566sb n;
    public volatile Gl o;
    public final Pj p;
    public final T1 q;
    public final boolean r;

    public Dl(Pj pj, T1 t1) {
        Tf.j("client", pj);
        this.p = pj;
        this.q = t1;
        this.r = false;
        this.a = (Hl) pj.b.b;
        Vi vi = pj.e;
        vi.getClass();
        this.b = (C0473pa) vi.a;
        Ze ze = new Ze(this, 1);
        ze.g(0, TimeUnit.MILLISECONDS);
        this.c = ze;
        this.d = new AtomicBoolean();
        this.l = true;
    }

    public final void a(Gl gl) {
        byte[] bArr = Rr.a;
        if (this.g != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.g = gl;
        gl.o.add(new Cl(this, this.e));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketH;
        byte[] bArr = Rr.a;
        Gl gl = this.g;
        if (gl != null) {
            synchronized (gl) {
                socketH = h();
            }
            if (this.g == null) {
                if (socketH != null) {
                    Rr.e(socketH);
                }
                this.b.getClass();
            } else if (socketH != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.h && this.c.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            C0473pa c0473pa = this.b;
            Tf.f(interruptedIOException);
            c0473pa.getClass();
        } else {
            this.b.getClass();
        }
        return interruptedIOException;
    }

    public final C0117dn c() {
        if (!this.d.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.c.h();
        Gk gk = Gk.a;
        this.e = Gk.a.g();
        this.b.getClass();
        try {
            C0296jj c0296jj = this.p.a;
            synchronized (c0296jj) {
                ((ArrayDeque) c0296jj.d).add(this);
            }
            C0117dn c0117dnE = e();
            this.p.a.l(this);
            return c0117dnE;
        } catch (Throwable th) {
            this.p.a.l(this);
            throw th;
        }
    }

    public final Object clone() {
        return new Dl(this.p, this.q);
    }

    public final void d(boolean z) {
        C0566sb c0566sb;
        synchronized (this) {
            if (!this.l) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (c0566sb = this.n) != null) {
            c0566sb.f.cancel();
            c0566sb.c.f(c0566sb, true, true, null);
        }
        this.i = null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    public final C0117dn e() throws Throwable {
        ArrayList arrayList = new ArrayList();
        AbstractC0500q6.v0(arrayList, this.p.c);
        arrayList.add(new J4(this.p));
        arrayList.add(new J4(this.p.j));
        this.p.getClass();
        arrayList.add(new C0191g5(0));
        arrayList.add(C0191g5.b);
        if (!this.r) {
            AbstractC0500q6.v0(arrayList, this.p.d);
        }
        arrayList.add(new C0313k5(this.r));
        T1 t1 = this.q;
        Pj pj = this.p;
        boolean z = false;
        try {
            C0117dn c0117dnB = new Il(this, arrayList, 0, null, t1, pj.v, pj.w, pj.x).b(this.q);
            if (this.m) {
                Rr.d(c0117dnB);
                throw new IOException("Canceled");
            }
            g(null);
            return c0117dnB;
        } catch (IOException e) {
            try {
                IOException iOExceptionG = g(e);
                if (iOExceptionG == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionG;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    g(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:14:0x001d), top: B:53:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:14:0x001d), top: B:53:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033  */
    public final IOException f(C0566sb c0566sb, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Tf.j("exchange", c0566sb);
        if (!c0566sb.equals(this.n)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (this.j) {
                        if (z) {
                            this.j = false;
                        }
                        if (z2) {
                            this.k = false;
                        }
                        z5 = this.j;
                        if (z5) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (!z5) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    } else if (z2 || !this.k) {
                        z4 = false;
                    } else {
                        if (z) {
                            this.j = false;
                        }
                        if (z2) {
                            this.k = false;
                        }
                        z5 = this.j;
                        if (z5 || this.k) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (!z5 && !this.k && !this.l) {
                            z3 = true;
                        }
                        z4 = z3;
                        z3 = z6;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.n = null;
            Gl gl = this.g;
            if (gl != null) {
                synchronized (gl) {
                    gl.l++;
                }
            }
        }
        return z4 ? b(iOException) : iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.l) {
                this.l = false;
                if (!this.j && !this.k) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket h() {
        Gl gl = this.g;
        Tf.f(gl);
        byte[] bArr = Rr.a;
        ArrayList arrayList = gl.o;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Tf.b((Dl) ((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i);
        this.g = null;
        if (arrayList.isEmpty()) {
            gl.p = System.nanoTime();
            Hl hl = this.a;
            hl.getClass();
            byte[] bArr2 = Rr.a;
            boolean z = gl.i;
            C0303jq c0303jq = hl.b;
            if (z || hl.e == 0) {
                gl.i = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = hl.d;
                concurrentLinkedQueue.remove(gl);
                if (concurrentLinkedQueue.isEmpty()) {
                    c0303jq.a();
                }
                Socket socket = gl.c;
                Tf.f(socket);
                return socket;
            }
            c0303jq.c(hl.c, 0L);
        }
        return null;
    }
}
