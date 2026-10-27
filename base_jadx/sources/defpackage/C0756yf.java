package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0756yf implements Xo {
    public int a;
    public boolean b;
    public final P4 c;
    public final Inflater d;

    public C0756yf(Bl bl, Inflater inflater) {
        this.c = bl;
        this.d = inflater;
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return this.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b) {
            return;
        }
        this.d.end();
        this.b = true;
        this.c.close();
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) throws IOException {
        long j2;
        Tf.j("sink", l4);
        while (j >= 0) {
            if (!(!this.b)) {
                throw new IllegalStateException("closed".toString());
            }
            P4 p4 = this.c;
            Inflater inflater = this.d;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    Cn cnC = l4.C(1);
                    int iMin = (int) Math.min(j, 8192 - cnC.c);
                    if (inflater.needsInput() && !p4.p()) {
                        Cn cn = p4.o().a;
                        Tf.f(cn);
                        int i = cn.c;
                        int i2 = cn.b;
                        int i3 = i - i2;
                        this.a = i3;
                        inflater.setInput(cn.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(cnC.a, cnC.c, iMin);
                    int i4 = this.a;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.a -= remaining;
                        p4.a(remaining);
                    }
                    if (iInflate > 0) {
                        cnC.c += iInflate;
                        j2 = iInflate;
                        l4.b += j2;
                    } else {
                        if (cnC.b == cnC.c) {
                            l4.a = cnC.a();
                            Dn.a(cnC);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (p4.p()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }
}
