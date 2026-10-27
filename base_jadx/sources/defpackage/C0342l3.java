package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0342l3 implements Mo {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C0342l3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.Mo
    public final Jq b() {
        switch (this.a) {
            case 0:
                return (C0404n3) this.b;
            default:
                return (Jq) this.c;
        }
    }

    @Override // defpackage.Mo, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                C0404n3 c0404n3 = (C0404n3) this.b;
                c0404n3.h();
                try {
                    try {
                        ((Mo) this.c).close();
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
                ((OutputStream) this.b).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009b A[LOOP:1: B:12:0x0062->B:25:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d A[SYNTHETIC] */
    @Override // defpackage.Mo
    public final void d(L4 l4, long j) throws IOException {
        C0404n3 c0404n3;
        switch (this.a) {
            case 0:
                Tf.j("source", l4);
                Td.d(l4.b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    Cn cn = l4.a;
                    Tf.f(cn);
                    try {
                        try {
                            while (j2 < 65536) {
                                j2 += (long) (cn.c - cn.b);
                                if (j2 >= j) {
                                    j2 = j;
                                    c0404n3 = (C0404n3) this.b;
                                    c0404n3.h();
                                    ((Mo) this.c).d(l4, j2);
                                    if (!c0404n3.i()) {
                                        throw c0404n3.j(null);
                                    }
                                    j -= j2;
                                } else {
                                    cn = cn.f;
                                    Tf.f(cn);
                                }
                            }
                            ((Mo) this.c).d(l4, j2);
                            if (!c0404n3.i()) {
                                throw c0404n3.j(null);
                            }
                            j -= j2;
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
                    c0404n3 = (C0404n3) this.b;
                    c0404n3.h();
                }
                break;
            default:
                Tf.j("source", l4);
                Td.d(l4.b, 0L, j);
                while (j > 0) {
                    ((Jq) this.c).f();
                    Cn cn2 = l4.a;
                    Tf.f(cn2);
                    int iMin = (int) Math.min(j, cn2.c - cn2.b);
                    ((OutputStream) this.b).write(cn2.a, cn2.b, iMin);
                    int i = cn2.b + iMin;
                    cn2.b = i;
                    long j3 = iMin;
                    j -= j3;
                    l4.b -= j3;
                    if (i == cn2.c) {
                        l4.a = cn2.a();
                        Dn.a(cn2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.Mo, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                C0404n3 c0404n3 = (C0404n3) this.b;
                c0404n3.h();
                try {
                    try {
                        ((Mo) this.c).flush();
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
                ((OutputStream) this.b).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.sink(" + ((Mo) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }
}
