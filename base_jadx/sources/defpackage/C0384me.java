package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0384me implements Xo {
    public byte a;
    public final Bl b;
    public final Inflater c;
    public final C0756yf d;
    public final CRC32 e;

    public C0384me(Xo xo) {
        Tf.j("source", xo);
        Bl bl = new Bl(xo);
        this.b = bl;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new C0756yf(bl, inflater);
        this.e = new CRC32();
    }

    public static void n(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return this.b.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.Xo
    public final long f(L4 l4, long j) throws IOException {
        Bl bl;
        long j2;
        Tf.j("sink", l4);
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.a;
        CRC32 crc32 = this.e;
        Bl bl2 = this.b;
        if (b == 0) {
            bl2.l(10L);
            L4 l5 = bl2.a;
            byte bW = l5.w(3L);
            boolean z = ((bW >> 1) & 1) == 1;
            if (z) {
                w(bl2.a, 0L, 10L);
            }
            n("ID1ID2", 8075, bl2.readShort());
            bl2.a(8L);
            if (((bW >> 2) & 1) == 1) {
                bl2.l(2L);
                if (z) {
                    w(bl2.a, 0L, 2L);
                }
                short s = l5.readShort();
                long j3 = (short) (((s & 255) << 8) | ((s & 65280) >>> 8));
                bl2.l(j3);
                if (z) {
                    w(bl2.a, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                bl2.a(j2);
            }
            if (((bW >> 3) & 1) == 1) {
                bl = bl2;
                long jN = bl2.n((byte) 0, 0L, Long.MAX_VALUE);
                if (jN == -1) {
                    throw new EOFException();
                }
                if (z) {
                    w(bl.a, 0L, jN + 1);
                }
                bl.a(jN + 1);
            } else {
                bl = bl2;
            }
            if (((bW >> 4) & 1) == 1) {
                long jN2 = bl.n((byte) 0, 0L, Long.MAX_VALUE);
                if (jN2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    w(bl.a, 0L, jN2 + 1);
                }
                bl.a(jN2 + 1);
            }
            if (z) {
                bl.l(2L);
                short s2 = l5.readShort();
                n("FHCRC", (short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.a = (byte) 1;
        } else {
            bl = bl2;
        }
        if (this.a == 1) {
            long j4 = l4.b;
            long jF = this.d.f(l4, j);
            if (jF != -1) {
                w(l4, j4, jF);
                return jF;
            }
            this.a = (byte) 2;
        }
        if (this.a != 2) {
            return -1L;
        }
        n("CRC", bl.w(), (int) crc32.getValue());
        n("ISIZE", bl.w(), (int) this.c.getBytesWritten());
        this.a = (byte) 3;
        if (bl.p()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    public final void w(L4 l4, long j, long j2) {
        Cn cn = l4.a;
        Tf.f(cn);
        while (true) {
            int i = cn.c;
            int i2 = cn.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            cn = cn.f;
            Tf.f(cn);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) cn.b) + j);
            int iMin = (int) Math.min(cn.c - i3, j2);
            this.e.update(cn.a, i3, iMin);
            j2 -= (long) iMin;
            cn = cn.f;
            Tf.f(cn);
            j = 0;
        }
    }
}
