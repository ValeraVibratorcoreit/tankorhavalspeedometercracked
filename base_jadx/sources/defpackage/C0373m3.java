package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373m3 implements Xo {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C0373m3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.Xo
    public final Jq b() {
        switch (this.a) {
            case 0:
                return (C0404n3) this.b;
            default:
                return (Jq) this.c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                C0404n3 c0404n3 = (C0404n3) this.b;
                c0404n3.h();
                try {
                    try {
                        ((Xo) this.c).close();
                        if (c0404n3.i()) {
                            throw c0404n3.j(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c0404n3.i()) {
                            throw e;
                        }
                        throw c0404n3.j(e);
                    }
                } catch (Throwable th) {
                    c0404n3.i();
                    throw th;
                }
            default:
                ((InputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) throws IOException {
        switch (this.a) {
            case 0:
                Tf.j("sink", l4);
                C0404n3 c0404n3 = (C0404n3) this.b;
                c0404n3.h();
                try {
                    try {
                        long jF = ((Xo) this.c).f(l4, j);
                        if (c0404n3.i()) {
                            throw c0404n3.j(null);
                        }
                        return jF;
                    } catch (IOException e) {
                        if (c0404n3.i()) {
                            throw c0404n3.j(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    c0404n3.i();
                    throw th;
                }
            default:
                Tf.j("sink", l4);
                if (j == 0) {
                    return 0L;
                }
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
                }
                try {
                    ((Jq) this.c).f();
                    Cn cnC = l4.C(1);
                    int i = ((InputStream) this.b).read(cnC.a, cnC.c, (int) Math.min(j, 8192 - cnC.c));
                    if (i == -1) {
                        if (cnC.b == cnC.c) {
                            l4.a = cnC.a();
                            Dn.a(cnC);
                        }
                        return -1L;
                    }
                    cnC.c += i;
                    long j2 = i;
                    l4.b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (Tf.I(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((Xo) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }
}
