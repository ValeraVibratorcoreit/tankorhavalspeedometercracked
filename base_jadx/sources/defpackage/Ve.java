package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class Ve implements Xo {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final P4 f;

    public Ve(P4 p4) {
        Tf.j("source", p4);
        this.f = p4;
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return this.f.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) throws IOException {
        int i;
        int i2;
        Tf.j("sink", l4);
        do {
            int i3 = this.d;
            P4 p4 = this.f;
            if (i3 != 0) {
                long jF = p4.f(l4, Math.min(j, i3));
                if (jF == -1) {
                    return -1L;
                }
                this.d -= (int) jF;
                return jF;
            }
            p4.a(this.e);
            this.e = 0;
            if ((this.b & 4) != 0) {
                return -1L;
            }
            i = this.c;
            int iS = Rr.s(p4);
            this.d = iS;
            this.a = iS;
            int i4 = p4.readByte() & 255;
            this.b = p4.readByte() & 255;
            Logger logger = We.e;
            if (logger.isLoggable(Level.FINE)) {
                C0129e5 c0129e5 = He.a;
                logger.fine(He.a(true, this.c, this.a, i4, this.b));
            }
            i2 = p4.readInt() & Integer.MAX_VALUE;
            this.c = i2;
            if (i4 != 9) {
                throw new IOException(i4 + " != TYPE_CONTINUATION");
            }
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
