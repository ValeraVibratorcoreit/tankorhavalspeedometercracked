package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0505qb implements Mo {
    public final Mo a;
    public boolean b;
    public long c;
    public boolean d;
    public final long e;
    public final /* synthetic */ C0566sb f;

    public C0505qb(C0566sb c0566sb, Mo mo, long j) {
        Tf.j("delegate", mo);
        this.f = c0566sb;
        this.a = mo;
        this.e = j;
    }

    @Override // defpackage.Mo
    public final Jq b() {
        return this.a.b();
    }

    @Override // defpackage.Mo, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.d = true;
        long j = this.e;
        if (j != -1 && this.c != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            n();
            w(null);
        } catch (IOException e) {
            throw w(e);
        }
    }

    @Override // defpackage.Mo
    public final void d(L4 l4, long j) throws IOException {
        Tf.j("source", l4);
        if (!(!this.d)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.e;
        if (j2 == -1 || this.c + j <= j2) {
            try {
                this.a.d(l4, j);
                this.c += j;
                return;
            } catch (IOException e) {
                throw w(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.c + j));
    }

    @Override // defpackage.Mo, java.io.Flushable
    public final void flush() throws IOException {
        try {
            x();
        } catch (IOException e) {
            throw w(e);
        }
    }

    public final void n() {
        this.a.close();
    }

    public final String toString() {
        return C0505qb.class.getSimpleName() + '(' + this.a + ')';
    }

    public final IOException w(IOException iOException) {
        if (this.b) {
            return iOException;
        }
        this.b = true;
        return this.f.a(false, true, iOException);
    }

    public final void x() {
        this.a.flush();
    }
}
