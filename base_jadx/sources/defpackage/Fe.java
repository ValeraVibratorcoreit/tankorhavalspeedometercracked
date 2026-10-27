package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Fe extends Ae {
    public boolean d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.d) {
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
        if (this.d) {
            return -1L;
        }
        long jF = super.f(l4, j);
        if (jF != -1) {
            return jF;
        }
        this.d = true;
        n();
        return -1L;
    }
}
