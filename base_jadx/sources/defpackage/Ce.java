package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Ce extends Ae {
    public long d;
    public boolean e;
    public final C0201gf f;
    public final /* synthetic */ Ge g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ce(Ge ge, C0201gf c0201gf) {
        super(ge);
        Tf.j("url", c0201gf);
        this.g = ge;
        this.f = c0201gf;
        this.d = -1L;
        this.e = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.e && !Rr.h(this, TimeUnit.MILLISECONDS)) {
            ((Gl) this.g.g).k();
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
        if (!this.e) {
            return -1L;
        }
        long j2 = this.d;
        Ge ge = this.g;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                ge.a.k();
            }
            try {
                this.d = ge.a.s();
                String string = Mp.W0(ge.a.k()).toString();
                if (this.d < 0 || (string.length() > 0 && !Mp.U0(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.d + string + '\"');
                }
                if (this.d == 0) {
                    this.e = false;
                    ge.e = ((O5) ge.d).f();
                    Pj pj = (Pj) ge.f;
                    Tf.f(pj);
                    C0569se c0569se = (C0569se) ge.e;
                    Tf.f(c0569se);
                    AbstractC0139ef.b(pj.j, this.f, c0569se);
                    n();
                }
                if (!this.e) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jF = super.f(l4, Math.min(j, this.d));
        if (jF != -1) {
            this.d -= jF;
            return jF;
        }
        ((Gl) ge.g).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        n();
        throw protocolException;
    }
}
