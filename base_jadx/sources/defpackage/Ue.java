package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Ue implements InterfaceC0597tb {
    public static final List g = Rr.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = Rr.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public volatile C0016af a;
    public final EnumC0268il b;
    public volatile boolean c;
    public final Gl d;
    public final Il e;
    public final Te f;

    public Ue(Pj pj, Gl gl, Il il, Te te) {
        Tf.j("client", pj);
        Tf.j("connection", gl);
        Tf.j("http2Connection", te);
        this.d = gl;
        this.e = il;
        this.f = te;
        EnumC0268il enumC0268il = EnumC0268il.H2_PRIOR_KNOWLEDGE;
        this.b = pj.r.contains(enumC0268il) ? enumC0268il : EnumC0268il.HTTP_2;
    }

    @Override // defpackage.InterfaceC0597tb
    public final Mo a(T1 t1, long j) {
        Tf.j("request", t1);
        C0016af c0016af = this.a;
        Tf.f(c0016af);
        return c0016af.f();
    }

    @Override // defpackage.InterfaceC0597tb
    public final void b(T1 t1) throws IOException {
        int i;
        C0016af c0016af;
        boolean z;
        Tf.j("request", t1);
        if (this.a != null) {
            return;
        }
        boolean z2 = ((C0043bb) t1.f) != null;
        C0569se c0569se = (C0569se) t1.e;
        ArrayList arrayList = new ArrayList(c0569se.size() + 4);
        arrayList.add(new C0538re(C0538re.f, (String) t1.d));
        C0129e5 c0129e5 = C0538re.g;
        C0201gf c0201gf = (C0201gf) t1.c;
        Tf.j("url", c0201gf);
        String strB = c0201gf.b();
        String strD = c0201gf.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new C0538re(c0129e5, strB));
        String strA = ((C0569se) t1.e).a("Host");
        if (strA != null) {
            arrayList.add(new C0538re(C0538re.i, strA));
        }
        arrayList.add(new C0538re(C0538re.h, c0201gf.b));
        int size = c0569se.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = c0569se.b(i2);
            Locale locale = Locale.US;
            Tf.i("Locale.US", locale);
            if (strB2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strB2.toLowerCase(locale);
            Tf.i("(this as java.lang.String).toLowerCase(locale)", lowerCase);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && Tf.b(c0569se.d(i2), "trailers"))) {
                arrayList.add(new C0538re(lowerCase, c0569se.d(i2)));
            }
        }
        Te te = this.f;
        te.getClass();
        boolean z3 = !z2;
        synchronized (te.y) {
            synchronized (te) {
                try {
                    if (te.f > 1073741823) {
                        te.z(8);
                    }
                    if (te.g) {
                        throw new V6();
                    }
                    i = te.f;
                    te.f = i + 2;
                    c0016af = new C0016af(i, te, z3, false, null);
                    z = !z2 || te.v >= te.w || c0016af.c >= c0016af.d;
                    if (c0016af.h()) {
                        te.c.put(Integer.valueOf(i), c0016af);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0047bf c0047bf = te.y;
            synchronized (c0047bf) {
                if (c0047bf.c) {
                    throw new IOException("closed");
                }
                c0047bf.d.d(arrayList);
                long j = c0047bf.a.b;
                long jMin = Math.min(c0047bf.b, j);
                int i3 = j == jMin ? 4 : 0;
                if (z3) {
                    i3 |= 1;
                }
                c0047bf.x(i, (int) jMin, 1, i3);
                c0047bf.e.d(c0047bf.a, jMin);
                if (j > jMin) {
                    c0047bf.C(j - jMin, i);
                }
            }
        }
        if (z) {
            te.y.flush();
        }
        this.a = c0016af;
        if (this.c) {
            C0016af c0016af2 = this.a;
            Tf.f(c0016af2);
            c0016af2.e(9);
            throw new IOException("Canceled");
        }
        C0016af c0016af3 = this.a;
        Tf.f(c0016af3);
        Ze ze = c0016af3.i;
        long j2 = this.e.h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ze.g(j2, timeUnit);
        C0016af c0016af4 = this.a;
        Tf.f(c0016af4);
        c0016af4.j.g(this.e.i, timeUnit);
    }

    @Override // defpackage.InterfaceC0597tb
    public final Xo c(C0117dn c0117dn) {
        C0016af c0016af = this.a;
        Tf.f(c0016af);
        return c0016af.g;
    }

    @Override // defpackage.InterfaceC0597tb
    public final void cancel() {
        this.c = true;
        C0016af c0016af = this.a;
        if (c0016af != null) {
            c0016af.e(9);
        }
    }

    @Override // defpackage.InterfaceC0597tb
    public final void d() {
        C0016af c0016af = this.a;
        Tf.f(c0016af);
        c0016af.f().close();
    }

    @Override // defpackage.InterfaceC0597tb
    public final void e() {
        this.f.flush();
    }

    @Override // defpackage.InterfaceC0597tb
    public final C0086cn f(boolean z) throws IOException {
        C0569se c0569se;
        C0016af c0016af = this.a;
        Tf.f(c0016af);
        synchronized (c0016af) {
            c0016af.i.h();
            while (c0016af.e.isEmpty() && c0016af.k == 0) {
                try {
                    c0016af.k();
                } catch (Throwable th) {
                    c0016af.i.l();
                    throw th;
                }
            }
            c0016af.i.l();
            if (!(!c0016af.e.isEmpty())) {
                IOException iOException = c0016af.l;
                if (iOException != null) {
                    throw iOException;
                }
                int i = c0016af.k;
                Vo.i(i);
                throw new Bp(i);
            }
            Object objRemoveFirst = c0016af.e.removeFirst();
            Tf.i("headersQueue.removeFirst()", objRemoveFirst);
            c0569se = (C0569se) objRemoveFirst;
        }
        EnumC0268il enumC0268il = this.b;
        Tf.j("protocol", enumC0268il);
        ArrayList arrayList = new ArrayList(20);
        int size = c0569se.size();
        Z1 z1E = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strB = c0569se.b(i2);
            String strD = c0569se.d(i2);
            if (Tf.b(strB, ":status")) {
                z1E = AbstractC0390mk.E("HTTP/1.1 " + strD);
            } else if (!h.contains(strB)) {
                Tf.j("name", strB);
                Tf.j("value", strD);
                arrayList.add(strB);
                arrayList.add(Mp.W0(strD).toString());
            }
        }
        if (z1E == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0086cn c0086cn = new C0086cn();
        c0086cn.b = enumC0268il;
        c0086cn.c = z1E.b;
        c0086cn.d = (String) z1E.d;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Ya ya = new Ya(1);
        ArrayList arrayList2 = ya.a;
        Tf.j("<this>", arrayList2);
        List listAsList = Arrays.asList((String[]) array);
        Tf.i("asList(this)", listAsList);
        arrayList2.addAll(listAsList);
        c0086cn.f = ya;
        if (z && c0086cn.c == 100) {
            return null;
        }
        return c0086cn;
    }

    @Override // defpackage.InterfaceC0597tb
    public final long g(C0117dn c0117dn) {
        if (AbstractC0139ef.a(c0117dn)) {
            return Rr.k(c0117dn);
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC0597tb
    public final Gl h() {
        return this.d;
    }
}
