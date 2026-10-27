package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class We implements Closeable {
    public static final Logger e;
    public final Ve a;
    public final C0724xe b;
    public final P4 c;
    public final boolean d;

    static {
        Logger logger = Logger.getLogger(He.class.getName());
        Tf.i("Logger.getLogger(Http2::class.java.name)", logger);
        e = logger;
    }

    public We(P4 p4, boolean z) {
        Tf.j("source", p4);
        this.c = p4;
        this.d = z;
        Ve ve = new Ve(p4);
        this.a = ve;
        this.b = new C0724xe(ve);
    }

    public final void A(Ne ne, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = Rr.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.c.readInt() & Integer.MAX_VALUE;
        List listY = y(AbstractC0390mk.w(i - 4, i2, i4), i4, i2, i3);
        ne.getClass();
        Te te = ne.b;
        te.getClass();
        synchronized (te) {
            if (te.A.contains(Integer.valueOf(i5))) {
                te.C(i5, 2);
                return;
            }
            te.A.add(Integer.valueOf(i5));
            te.j.c(new Pe(te.d + '[' + i5 + "] onRequest", te, i5, listY), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    public final boolean n(boolean z, Ne ne) throws IOException {
        int i;
        int i2;
        int i3;
        C0016af[] c0016afArr;
        Tf.j("handler", ne);
        int i4 = 0;
        try {
            this.c.l(9L);
            int iS = Rr.s(this.c);
            if (iS > 16384) {
                throw new IOException(Vo.e(iS, "FRAME_SIZE_ERROR: "));
            }
            int i5 = this.c.readByte() & 255;
            byte b = this.c.readByte();
            int i6 = b & 255;
            int i7 = this.c.readInt();
            int i8 = i7 & Integer.MAX_VALUE;
            Logger logger = e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(He.a(true, i8, iS, i5, i6));
            }
            if (z && i5 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = He.b;
                sb.append(i5 < strArr.length ? strArr[i5] : Rr.i("0x%02x", Integer.valueOf(i5)));
                throw new IOException(sb.toString());
            }
            switch (i5) {
                case 0:
                    x(ne, iS, i6, i8);
                    return true;
                case 1:
                    z(ne, iS, i6, i8);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + iS + " != 5");
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    P4 p4 = this.c;
                    p4.readInt();
                    p4.readByte();
                    return true;
                case 3:
                    if (iS != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + iS + " != 4");
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i9 = this.c.readInt();
                    int[] iArrT = Vo.t(14);
                    int length = iArrT.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            int i11 = iArrT[i10];
                            if (Vo.o(i11) == i9) {
                                i = i11;
                            } else {
                                i10++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(Vo.e(i9, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    Te te = ne.b;
                    te.getClass();
                    if (i8 != 0 && (i7 & 1) == 0) {
                        i4 = 1;
                    }
                    if (i4 == 0) {
                        C0016af c0016afY = te.y(i8);
                        if (c0016afY == null) {
                            return true;
                        }
                        c0016afY.j(i);
                        return true;
                    }
                    te.j.c(new Qe(te.d + '[' + i8 + "] onReset", te, i8, i, 0), 0L);
                    return true;
                case 4:
                    if (i8 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) != 0) {
                        if (iS == 0) {
                            return true;
                        }
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    if (iS % 6 != 0) {
                        throw new IOException(Vo.e(iS, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    C0087co c0087co = new C0087co();
                    Nf nfM = Td.M(Td.O(0, iS), 6);
                    int i12 = nfM.a;
                    int i13 = nfM.b;
                    int i14 = nfM.c;
                    if (i14 < 0 ? i12 >= i13 : i12 <= i13) {
                        while (true) {
                            P4 p5 = this.c;
                            short s = p5.readShort();
                            byte[] bArr = Rr.a;
                            int i15 = s & 65535;
                            i2 = p5.readInt();
                            if (i15 != 2) {
                                if (i15 == 3) {
                                    i15 = 4;
                                } else if (i15 == 4) {
                                    if (i2 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i15 = 7;
                                } else if (i15 == 5 && (i2 < 16384 || i2 > 16777215)) {
                                }
                            } else if (i2 != 0 && i2 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            c0087co.c(i15, i2);
                            if (i12 != i13) {
                                i12 += i14;
                            }
                        }
                        throw new IOException(Vo.e(i2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                    }
                    Te te2 = ne.b;
                    te2.i.c(new Me(Vo.h(new StringBuilder(), te2.d, " applyAndAckSettings"), ne, c0087co), 0L);
                    return true;
                case 5:
                    A(ne, iS, i6, i8);
                    return true;
                case 6:
                    if (iS != 8) {
                        throw new IOException(Vo.e(iS, "TYPE_PING length != 8: "));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i16 = this.c.readInt();
                    int i17 = this.c.readInt();
                    if ((b & 1) == 0) {
                        ne.b.i.c(new Qe(Vo.h(new StringBuilder(), ne.b.d, " ping"), ne, i16, i17, 2), 0L);
                        return true;
                    }
                    synchronized (ne.b) {
                        try {
                            if (i16 == 1) {
                                ne.b.n++;
                            } else if (i16 == 2) {
                                ne.b.p++;
                            } else if (i16 == 3) {
                                Te te3 = ne.b;
                                te3.getClass();
                                te3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iS < 8) {
                        throw new IOException(Vo.e(iS, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i18 = this.c.readInt();
                    int i19 = this.c.readInt();
                    int i20 = iS - 8;
                    int[] iArrT2 = Vo.t(14);
                    int length2 = iArrT2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 < length2) {
                            i3 = iArrT2[i21];
                            if (Vo.o(i3) != i19) {
                                i21++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    if (i3 == 0) {
                        throw new IOException(Vo.e(i19, "TYPE_GOAWAY unexpected error code: "));
                    }
                    C0129e5 c0129e5G = C0129e5.d;
                    if (i20 > 0) {
                        c0129e5G = this.c.g(i20);
                    }
                    Tf.j("debugData", c0129e5G);
                    c0129e5G.b();
                    synchronized (ne.b) {
                        Object[] array = ne.b.c.values().toArray(new C0016af[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        c0016afArr = (C0016af[]) array;
                        ne.b.g = true;
                    }
                    int length3 = c0016afArr.length;
                    while (i4 < length3) {
                        C0016af c0016af = c0016afArr[i4];
                        if (c0016af.m > i18 && c0016af.g()) {
                            c0016af.j(8);
                            ne.b.y(c0016af.m);
                        }
                        i4++;
                    }
                    return true;
                case 8:
                    if (iS != 4) {
                        throw new IOException(Vo.e(iS, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j = ((long) this.c.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i8 == 0) {
                        synchronized (ne.b) {
                            Te te4 = ne.b;
                            te4.w += j;
                            te4.notifyAll();
                        }
                        return true;
                    }
                    C0016af c0016afX = ne.b.x(i8);
                    if (c0016afX == null) {
                        return true;
                    }
                    synchronized (c0016afX) {
                        c0016afX.d += j;
                        if (j > 0) {
                            c0016afX.notifyAll();
                        }
                        break;
                    }
                    return true;
                default:
                    this.c.a(iS);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void w(Ne ne) throws IOException {
        Tf.j("handler", ne);
        if (this.d) {
            if (!n(true, ne)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        C0129e5 c0129e5 = He.a;
        C0129e5 c0129e5G = this.c.g(c0129e5.c.length);
        Level level = Level.FINE;
        Logger logger = e;
        if (logger.isLoggable(level)) {
            logger.fine(Rr.i("<< CONNECTION " + c0129e5G.c(), new Object[0]));
        }
        if (!c0129e5.equals(c0129e5G)) {
            throw new IOException("Expected a connection header but was ".concat(c0129e5G.i()));
        }
    }

    public final void x(Ne ne, int i, int i2, int i3) throws IOException {
        int i4;
        C0016af c0016af;
        boolean z;
        boolean z2;
        long j;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = Rr.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iW = AbstractC0390mk.w(i, i2, i4);
        P4 p4 = this.c;
        ne.getClass();
        Tf.j("source", p4);
        ne.b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            Te te = ne.b;
            te.getClass();
            L4 l4 = new L4();
            long j2 = iW;
            p4.l(j2);
            p4.f(l4, j2);
            te.j.c(new Oe(te.d + '[' + i3 + "] onData", te, i3, l4, iW, z3), 0L);
        } else {
            C0016af c0016afX = ne.b.x(i3);
            if (c0016afX == null) {
                ne.b.C(i3, 2);
                long j3 = iW;
                ne.b.A(j3);
                p4.a(j3);
            } else {
                byte[] bArr2 = Rr.a;
                Ye ye = c0016afX.g;
                long j4 = iW;
                ye.getClass();
                while (true) {
                    if (j4 <= 0) {
                        c0016af = c0016afX;
                        break;
                    }
                    synchronized (ye.f) {
                        z = ye.e;
                        c0016af = c0016afX;
                        z2 = ye.b.b + j4 > ye.d;
                    }
                    if (z2) {
                        p4.a(j4);
                        ye.f.e(4);
                        break;
                    }
                    if (z) {
                        p4.a(j4);
                        break;
                    }
                    long jF = p4.f(ye.a, j4);
                    if (jF == -1) {
                        throw new EOFException();
                    }
                    j4 -= jF;
                    synchronized (ye.f) {
                        try {
                            if (ye.c) {
                                L4 l5 = ye.a;
                                j = l5.b;
                                l5.a(j);
                            } else {
                                L4 l6 = ye.b;
                                boolean z4 = l6.b == 0;
                                l6.F(ye.a);
                                if (z4) {
                                    C0016af c0016af2 = ye.f;
                                    if (c0016af2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    c0016af2.notifyAll();
                                }
                                j = 0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (j > 0) {
                        ye.n(j);
                    }
                    c0016afX = c0016af;
                }
                if (z3) {
                    c0016af.i(Rr.b, true);
                }
            }
        }
        this.c.a(i4);
    }

    public final List y(int i, int i2, int i3, int i4) throws IOException {
        Ve ve = this.a;
        ve.d = i;
        ve.a = i;
        ve.e = i2;
        ve.b = i3;
        ve.c = i4;
        while (true) {
            C0724xe c0724xe = this.b;
            Bl bl = c0724xe.b;
            boolean zP = bl.p();
            ArrayList arrayList = c0724xe.a;
            if (zP) {
                List listX0 = AbstractC0314k6.x0(arrayList);
                arrayList.clear();
                return listX0;
            }
            byte b = bl.readByte();
            byte[] bArr = Rr.a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iE = c0724xe.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    C0538re[] c0538reArr = AbstractC0786ze.a;
                    if (i6 <= c0538reArr.length - 1) {
                        arrayList.add(c0538reArr[i6]);
                    }
                }
                int length = c0724xe.d + 1 + (i6 - AbstractC0786ze.a.length);
                if (length >= 0) {
                    C0538re[] c0538reArr2 = c0724xe.c;
                    if (length < c0538reArr2.length) {
                        C0538re c0538re = c0538reArr2[length];
                        Tf.f(c0538re);
                        arrayList.add(c0538re);
                    }
                }
                throw new IOException(Vo.e(iE, "Header index too large "));
            }
            if (i5 == 64) {
                C0538re[] c0538reArr3 = AbstractC0786ze.a;
                C0129e5 c0129e5D = c0724xe.d();
                AbstractC0786ze.a(c0129e5D);
                c0724xe.c(new C0538re(c0129e5D, c0724xe.d()));
            } else if ((b & 64) == 64) {
                c0724xe.c(new C0538re(c0724xe.b(c0724xe.e(i5, 63) - 1), c0724xe.d()));
            } else if ((b & 32) == 32) {
                int iE2 = c0724xe.e(i5, 31);
                c0724xe.g = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c0724xe.g);
                }
                int i7 = c0724xe.f;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        C0538re[] c0538reArr4 = c0724xe.c;
                        AbstractC0158f3.S(c0538reArr4, 0, c0538reArr4.length);
                        c0724xe.d = c0724xe.c.length - 1;
                        c0724xe.e = 0;
                        c0724xe.f = 0;
                    } else {
                        c0724xe.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C0538re[] c0538reArr5 = AbstractC0786ze.a;
                C0129e5 c0129e5D2 = c0724xe.d();
                AbstractC0786ze.a(c0129e5D2);
                arrayList.add(new C0538re(c0129e5D2, c0724xe.d()));
            } else {
                arrayList.add(new C0538re(c0724xe.b(c0724xe.e(i5, 15) - 1), c0724xe.d()));
            }
        }
    }

    public final void z(Ne ne, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.c.readByte();
            byte[] bArr = Rr.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            P4 p4 = this.c;
            p4.readInt();
            p4.readByte();
            byte[] bArr2 = Rr.a;
            ne.getClass();
            i -= 5;
        }
        List listY = y(AbstractC0390mk.w(i, i2, i4), i4, i2, i3);
        ne.getClass();
        ne.b.getClass();
        if (i3 != 0 && (i3 & 1) == 0) {
            Te te = ne.b;
            te.getClass();
            te.j.c(new Pe(te.d + '[' + i3 + "] onHeaders", te, i3, listY, z), 0L);
            return;
        }
        synchronized (ne.b) {
            C0016af c0016afX = ne.b.x(i3);
            if (c0016afX != null) {
                c0016afX.i(Rr.u(listY), z);
                return;
            }
            Te te2 = ne.b;
            if (te2.g) {
                return;
            }
            if (i3 <= te2.e) {
                return;
            }
            if (i3 % 2 == te2.f % 2) {
                return;
            }
            C0016af c0016af = new C0016af(i3, ne.b, false, z, Rr.u(listY));
            Te te3 = ne.b;
            te3.e = i3;
            te3.c.put(Integer.valueOf(i3), c0016af);
            ne.b.h.f().c(new Le(ne.b.d + '[' + i3 + "] onStream", c0016af, ne), 0L);
        }
    }
}
