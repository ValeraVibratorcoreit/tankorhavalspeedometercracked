package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0404n3 extends Jq {
    public static final long h;
    public static final long i;
    public static C0404n3 j;
    public boolean e;
    public C0404n3 f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        C0404n3 c0404n3;
        if (!(!this.e)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            this.e = true;
            synchronized (C0404n3.class) {
                try {
                    if (j == null) {
                        j = new C0404n3();
                        C0311k3 c0311k3 = new C0311k3("Okio Watchdog");
                        c0311k3.setDaemon(true);
                        c0311k3.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j2 != 0 && z) {
                        this.g = Math.min(j2, c() - jNanoTime) + jNanoTime;
                    } else if (j2 != 0) {
                        this.g = j2 + jNanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        this.g = c();
                    }
                    long j3 = this.g - jNanoTime;
                    C0404n3 c0404n4 = j;
                    Tf.f(c0404n4);
                    while (true) {
                        c0404n3 = c0404n4.f;
                        if (c0404n3 == null || j3 < c0404n3.g - jNanoTime) {
                            break;
                            break;
                        }
                        c0404n4 = c0404n3;
                    }
                    this.f = c0404n3;
                    c0404n4.f = this;
                    if (c0404n4 == j) {
                        C0404n3.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean i() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (C0404n3.class) {
            C0404n3 c0404n3 = j;
            while (c0404n3 != null) {
                C0404n3 c0404n4 = c0404n3.f;
                if (c0404n4 == this) {
                    c0404n3.f = this.f;
                    this.f = null;
                    return false;
                }
                c0404n3 = c0404n4;
            }
            return true;
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
