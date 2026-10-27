package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class Bl implements P4 {
    public final L4 a;
    public boolean b;
    public final Xo c;

    public Bl(Xo xo) {
        Tf.j("source", xo);
        this.c = xo;
        this.a = new L4();
    }

    @Override // defpackage.P4
    public final void a(long j) throws EOFException {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            L4 l4 = this.a;
            if (l4.b == 0) {
                if (this.c.f(l4, 8192) == -1) {
                    throw new EOFException();
                }
            }
            long jMin = Math.min(j, l4.b);
            l4.a(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return this.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.close();
        L4 l4 = this.a;
        l4.a(l4.b);
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) {
        Tf.j("sink", l4);
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        L4 l5 = this.a;
        if (l5.b == 0) {
            if (this.c.f(l5, 8192) == -1) {
                return -1L;
            }
        }
        return l5.f(l4, Math.min(j, l5.b));
    }

    @Override // defpackage.P4
    public final C0129e5 g(long j) throws EOFException {
        l(j);
        return this.a.g(j);
    }

    @Override // defpackage.P4
    public final String h(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jN = n(b, 0L, j2);
        L4 l4 = this.a;
        if (jN != -1) {
            return M4.a(l4, jN);
        }
        if (j2 < Long.MAX_VALUE && x(j2) && l4.w(j2 - 1) == ((byte) 13) && x(1 + j2) && l4.w(j2) == b) {
            return M4.a(l4, j2);
        }
        L4 l5 = new L4();
        l4.n(l5, 0L, Math.min(32, l4.b));
        throw new EOFException("\\n not found: limit=" + Math.min(l4.b, j) + " content=" + l5.g(l5.b).c() + "…");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    @Override // defpackage.P4
    public final String k() {
        return h(Long.MAX_VALUE);
    }

    @Override // defpackage.P4
    public final void l(long j) throws EOFException {
        if (!x(j)) {
            throw new EOFException();
        }
    }

    public final long n(byte b, long j, long j2) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        while (jMax < j2) {
            long jX = this.a.x(b, jMax, j2);
            if (jX != -1) {
                return jX;
            }
            L4 l4 = this.a;
            long j3 = l4.b;
            if (j3 >= j2) {
                return -1L;
            }
            if (this.c.f(l4, 8192) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // defpackage.P4
    public final L4 o() {
        return this.a;
    }

    @Override // defpackage.P4
    public final boolean p() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        L4 l4 = this.a;
        if (l4.p()) {
            if (this.c.f(l4, 8192) == -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        Tf.j("sink", byteBuffer);
        L4 l4 = this.a;
        if (l4.b == 0) {
            if (this.c.f(l4, 8192) == -1) {
                return -1;
            }
        }
        return l4.read(byteBuffer);
    }

    @Override // defpackage.P4
    public final byte readByte() {
        l(1L);
        return this.a.readByte();
    }

    @Override // defpackage.P4
    public final int readInt() throws EOFException {
        l(4L);
        return this.a.readInt();
    }

    @Override // defpackage.P4
    public final short readShort() throws EOFException {
        l(2L);
        return this.a.readShort();
    }

    @Override // defpackage.P4
    public final long s() throws EOFException {
        L4 l4;
        l(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zX = x(i2);
            l4 = this.a;
            if (!zX) {
                break;
            }
            byte bW = l4.w(i);
            if ((bW < ((byte) 48) || bW > ((byte) 57)) && ((bW < ((byte) 97) || bW > ((byte) 102)) && (bW < ((byte) 65) || bW > ((byte) 70)))) {
                if (i != 0) {
                    break;
                }
                F4.i(16);
                F4.i(16);
                String string = Integer.toString(bW, 16);
                Tf.i("java.lang.Integer.toStri…(this, checkRadix(radix))", string);
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return l4.s();
    }

    @Override // defpackage.P4
    public final String t(Charset charset) {
        L4 l4 = this.a;
        l4.F(this.c);
        return l4.A(l4.b, charset);
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    @Override // defpackage.P4
    public final int u(C0514qk c0514qk) throws EOFException {
        L4 l4;
        Tf.j("options", c0514qk);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            l4 = this.a;
            int iB = M4.b(l4, c0514qk, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                l4.a(c0514qk.a[iB].b());
                return iB;
            }
        } while (this.c.f(l4, 8192) != -1);
        return -1;
    }

    @Override // defpackage.P4
    public final InputStream v() {
        return new K4(this, 1);
    }

    public final int w() throws EOFException {
        l(4L);
        int i = this.a.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public final boolean x(long j) {
        L4 l4;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            l4 = this.a;
            if (l4.b >= j) {
                return true;
            }
        } while (this.c.f(l4, 8192) != -1);
        return false;
    }
}
