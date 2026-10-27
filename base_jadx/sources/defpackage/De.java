package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class De extends Ae {
    public long d;
    public final /* synthetic */ Ge e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(Ge ge, long j) {
        super(ge);
        this.e = ge;
        this.d = j;
        if (j == 0) {
            n();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.d != 0 && !Rr.h(this, TimeUnit.MILLISECONDS)) {
            ((Gl) this.e.g).k();
            n();
        }
        this.b = true;
    }

    @Override // defpackage.Ae, defpackage.Xo
    public final long f(L4 l4, long j) throws IOException {
        Tf.j("sink", l4);
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jF = super.f(l4, Math.min(j2, j));
        if (jF == -1) {
            ((Gl) this.e.g).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            n();
            throw protocolException;
        }
        long j3 = this.d - jF;
        this.d = j3;
        if (j3 == 0) {
            n();
        }
        return jF;
    }
}
