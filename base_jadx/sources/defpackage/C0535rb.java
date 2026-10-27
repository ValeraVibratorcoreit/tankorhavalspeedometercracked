package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0535rb implements Xo {
    public final Xo a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final long f;
    public final /* synthetic */ C0566sb g;

    public C0535rb(C0566sb c0566sb, Xo xo, long j) {
        Tf.j("delegate", xo);
        this.g = c0566sb;
        this.a = xo;
        this.f = j;
        this.c = true;
        if (j == 0) {
            w(null);
        }
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return this.a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        try {
            n();
            w(null);
        } catch (IOException e) {
            throw w(e);
        }
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) throws IOException {
        Tf.j("sink", l4);
        if (!(!this.e)) {
            throw new IllegalStateException("closed".toString());
        }
        try {
            long jF = this.a.f(l4, j);
            if (this.c) {
                this.c = false;
                C0566sb c0566sb = this.g;
                C0473pa c0473pa = c0566sb.d;
                Dl dl = c0566sb.c;
                c0473pa.getClass();
                Tf.j("call", dl);
            }
            if (jF == -1) {
                w(null);
                return -1L;
            }
            long j2 = this.b + jF;
            long j3 = this.f;
            if (j3 == -1 || j2 <= j3) {
                this.b = j2;
                if (j2 == j3) {
                    w(null);
                }
                return jF;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw w(e);
        }
    }

    public final void n() throws IOException {
        this.a.close();
    }

    public final String toString() {
        return C0535rb.class.getSimpleName() + '(' + this.a + ')';
    }

    public final IOException w(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        C0566sb c0566sb = this.g;
        if (iOException == null && this.c) {
            this.c = false;
            c0566sb.d.getClass();
            Tf.j("call", c0566sb.c);
        }
        return c0566sb.a(true, false, iOException);
    }
}
