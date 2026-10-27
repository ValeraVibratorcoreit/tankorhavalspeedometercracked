package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0047bf implements Closeable {
    public static final Logger g = Logger.getLogger(He.class.getName());
    public final L4 a;
    public int b;
    public boolean c;
    public final C0755ye d;
    public final O4 e;
    public final boolean f;

    public C0047bf(O4 o4, boolean z) {
        Tf.j("sink", o4);
        this.e = o4;
        this.f = z;
        L4 l4 = new L4();
        this.a = l4;
        this.b = 16384;
        this.d = new C0755ye(l4);
    }

    public final synchronized void A(int i, int i2) {
        Vo.j(i2, "errorCode");
        if (this.c) {
            throw new IOException("closed");
        }
        if (Vo.o(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        x(i, 4, 3, 0);
        this.e.j(Vo.o(i2));
        this.e.flush();
    }

    public final synchronized void B(long j, int i) {
        if (this.c) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        x(i, 4, 8, 0);
        this.e.j((int) j);
        this.e.flush();
    }

    public final void C(long j, int i) {
        while (j > 0) {
            long jMin = Math.min(this.b, j);
            j -= jMin;
            x(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.e.d(this.a, jMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c = true;
        this.e.close();
    }

    public final synchronized void flush() {
        if (this.c) {
            throw new IOException("closed");
        }
        this.e.flush();
    }

    public final synchronized void n(C0087co c0087co) {
        try {
            Tf.j("peerSettings", c0087co);
            if (this.c) {
                throw new IOException("closed");
            }
            int i = this.b;
            int i2 = c0087co.a;
            if ((i2 & 32) != 0) {
                i = c0087co.b[5];
            }
            this.b = i;
            if (((i2 & 2) != 0 ? c0087co.b[1] : -1) != -1) {
                C0755ye c0755ye = this.d;
                int i3 = (i2 & 2) != 0 ? c0087co.b[1] : -1;
                c0755ye.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = c0755ye.c;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        c0755ye.a = Math.min(c0755ye.a, iMin);
                    }
                    c0755ye.b = true;
                    c0755ye.c = iMin;
                    int i5 = c0755ye.g;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            C0538re[] c0538reArr = c0755ye.d;
                            AbstractC0158f3.S(c0538reArr, 0, c0538reArr.length);
                            c0755ye.e = c0755ye.d.length - 1;
                            c0755ye.f = 0;
                            c0755ye.g = 0;
                        } else {
                            c0755ye.a(i5 - iMin);
                        }
                    }
                }
            }
            x(0, 0, 4, 1);
            this.e.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void w(boolean z, int i, L4 l4, int i2) {
        if (this.c) {
            throw new IOException("closed");
        }
        x(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            Tf.f(l4);
            this.e.d(l4, i2);
        }
    }

    public final void x(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = g;
        if (logger.isLoggable(level)) {
            logger.fine(He.a(false, i, i2, i3, i4));
        }
        if (i2 > this.b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.b + ": " + i2).toString());
        }
        if ((((int) 2147483648L) & i) != 0) {
            throw new IllegalArgumentException(Vo.e(i, "reserved bit set: ").toString());
        }
        byte[] bArr = Rr.a;
        O4 o4 = this.e;
        Tf.j("$this$writeMedium", o4);
        o4.q((i2 >>> 16) & 255);
        o4.q((i2 >>> 8) & 255);
        o4.q(i2 & 255);
        o4.q(i3 & 255);
        o4.q(i4 & 255);
        o4.j(i & Integer.MAX_VALUE);
    }

    public final synchronized void y(int i, int i2, byte[] bArr) {
        try {
            Vo.j(i2, "errorCode");
            if (this.c) {
                throw new IOException("closed");
            }
            if (Vo.o(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            x(0, bArr.length + 8, 7, 0);
            this.e.j(i);
            this.e.j(Vo.o(i2));
            if (!(bArr.length == 0)) {
                this.e.c(bArr);
            }
            this.e.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void z(int i, int i2, boolean z) {
        if (this.c) {
            throw new IOException("closed");
        }
        x(0, 8, 6, z ? 1 : 0);
        this.e.j(i);
        this.e.j(i2);
        this.e.flush();
    }
}
