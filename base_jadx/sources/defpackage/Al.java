package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Al implements O4 {
    public final L4 a;
    public boolean b;
    public final Mo c;

    public Al(Mo mo) {
        Tf.j("sink", mo);
        this.c = mo;
        this.a = new L4();
    }

    @Override // defpackage.Mo
    public final Jq b() {
        return this.c.b();
    }

    @Override // defpackage.O4
    public final O4 c(byte[] bArr) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        L4 l4 = this.a;
        l4.getClass();
        l4.E(bArr, 0, bArr.length);
        n();
        return this;
    }

    @Override // defpackage.Mo, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        Mo mo = this.c;
        if (this.b) {
            return;
        }
        L4 l4 = this.a;
        long j = l4.b;
        if (j > 0) {
            mo.d(l4, j);
        }
        th = null;
        try {
            mo.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.Mo
    public final void d(L4 l4, long j) {
        Tf.j("source", l4);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.d(l4, j);
        n();
    }

    @Override // defpackage.O4
    public final O4 e(long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.H(j);
        n();
        return this;
    }

    @Override // defpackage.O4, defpackage.Mo, java.io.Flushable
    public final void flush() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        L4 l4 = this.a;
        long j = l4.b;
        Mo mo = this.c;
        if (j > 0) {
            mo.d(l4, j);
        }
        mo.flush();
    }

    @Override // defpackage.O4
    public final O4 i(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.J(i);
        n();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    @Override // defpackage.O4
    public final O4 j(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.I(i);
        n();
        return this;
    }

    @Override // defpackage.O4
    public final O4 m(String str) {
        Tf.j("string", str);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.K(str);
        n();
        return this;
    }

    public final O4 n() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        L4 l4 = this.a;
        long j = l4.b;
        if (j == 0) {
            j = 0;
        } else {
            Cn cn = l4.a;
            Tf.f(cn);
            Cn cn2 = cn.g;
            Tf.f(cn2);
            int i = cn2.c;
            if (i < 8192 && cn2.e) {
                j -= (long) (i - cn2.b);
            }
        }
        if (j > 0) {
            this.c.d(l4, j);
        }
        return this;
    }

    @Override // defpackage.O4
    public final O4 q(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.G(i);
        n();
        return this;
    }

    @Override // defpackage.O4
    public final O4 r(C0129e5 c0129e5) {
        Tf.j("byteString", c0129e5);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.D(c0129e5);
        n();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    public final O4 w(int i, int i2, byte[] bArr) {
        Tf.j("source", bArr);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.E(bArr, i, i2);
        n();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        Tf.j("source", byteBuffer);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.a.write(byteBuffer);
        n();
        return iWrite;
    }
}
