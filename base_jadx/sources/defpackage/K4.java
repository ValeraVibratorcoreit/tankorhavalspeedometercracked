package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class K4 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ P4 b;

    public /* synthetic */ K4(P4 p4, int i) {
        this.a = i;
        this.b = p4;
    }

    private final void n() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.a) {
            case 0:
                return (int) Math.min(((L4) this.b).b, Integer.MAX_VALUE);
            default:
                Bl bl = (Bl) this.b;
                if (bl.b) {
                    throw new IOException("closed");
                }
                return (int) Math.min(bl.a.b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((Bl) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                L4 l4 = (L4) this.b;
                if (l4.b > 0) {
                    return l4.readByte() & 255;
                }
                return -1;
            default:
                Bl bl = (Bl) this.b;
                if (bl.b) {
                    throw new IOException("closed");
                }
                L4 l5 = bl.a;
                if (l5.b == 0) {
                    if (bl.c.f(l5, 8192) == -1) {
                        return -1;
                    }
                }
                return l5.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((L4) this.b) + ".inputStream()";
            default:
                return ((Bl) this.b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                Tf.j("sink", bArr);
                return ((L4) this.b).y(bArr, i, i2);
            default:
                Tf.j("data", bArr);
                Bl bl = (Bl) this.b;
                if (!bl.b) {
                    Td.d(bArr.length, i, i2);
                    L4 l4 = bl.a;
                    if (l4.b == 0) {
                        if (bl.c.f(l4, 8192) == -1) {
                            return -1;
                        }
                    }
                    return l4.y(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
