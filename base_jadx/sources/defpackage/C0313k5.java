package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0313k5 implements Rf {
    public final boolean a;

    public C0313k5(boolean z) {
        this.a = z;
    }

    @Override // defpackage.Rf
    public final C0117dn a(Il il) throws Throwable {
        boolean z;
        Long l;
        C0086cn c0086cnB;
        C0117dn c0117dnA;
        C0086cn c0086cnB2;
        boolean z2;
        C0566sb c0566sb = il.e;
        Tf.f(c0566sb);
        InterfaceC0597tb interfaceC0597tb = c0566sb.f;
        C0473pa c0473pa = c0566sb.d;
        Dl dl = c0566sb.c;
        T1 t1 = il.f;
        C0043bb c0043bb = (C0043bb) t1.f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            c0473pa.getClass();
            Tf.j("call", dl);
            interfaceC0597tb.b(t1);
            boolean zW = Br.W((String) t1.d);
            boolean z3 = true;
            Gl gl = c0566sb.b;
            if (!zW || c0043bb == null) {
                z = false;
                l = null;
                dl.f(c0566sb, true, false, null);
                c0086cnB = null;
            } else {
                if ("100-continue".equalsIgnoreCase(((C0569se) t1.e).a("Expect"))) {
                    try {
                        interfaceC0597tb.e();
                        c0086cnB2 = c0566sb.b(true);
                        c0473pa.getClass();
                        Tf.j("call", dl);
                        z2 = false;
                    } catch (IOException e) {
                        c0473pa.getClass();
                        Tf.j("call", dl);
                        c0566sb.c(e);
                        throw e;
                    }
                } else {
                    z2 = true;
                    c0086cnB2 = null;
                }
                if (c0086cnB2 == null) {
                    c0566sb.a = false;
                    C0043bb c0043bb2 = (C0043bb) t1.f;
                    Tf.f(c0043bb2);
                    long j = c0043bb2.a;
                    c0473pa.getClass();
                    Tf.j("call", dl);
                    Al al = new Al(new C0505qb(c0566sb, interfaceC0597tb.a(t1, j), j));
                    al.w(c0043bb.b, c0043bb.a, (byte[]) c0043bb.c);
                    al.close();
                } else {
                    dl.f(c0566sb, true, false, null);
                    if (gl.f == null) {
                        interfaceC0597tb.h().k();
                    }
                }
                c0086cnB = c0086cnB2;
                z3 = z2;
                l = null;
                z = false;
            }
            try {
                interfaceC0597tb.d();
                if (c0086cnB == null) {
                    c0086cnB = c0566sb.b(z);
                    Tf.f(c0086cnB);
                    if (z3) {
                        c0473pa.getClass();
                        Tf.j("call", dl);
                        z3 = false;
                    }
                }
                c0086cnB.a = t1;
                c0086cnB.e = gl.d;
                c0086cnB.k = jCurrentTimeMillis;
                c0086cnB.l = System.currentTimeMillis();
                C0117dn c0117dnA2 = c0086cnB.a();
                int i = c0117dnA2.d;
                if (i == 100) {
                    C0086cn c0086cnB3 = c0566sb.b(false);
                    Tf.f(c0086cnB3);
                    if (z3) {
                        c0473pa.getClass();
                        Tf.j("call", dl);
                    }
                    c0086cnB3.a = t1;
                    c0086cnB3.e = gl.d;
                    c0086cnB3.k = jCurrentTimeMillis;
                    c0086cnB3.l = System.currentTimeMillis();
                    c0117dnA2 = c0086cnB3.a();
                    i = c0117dnA2.d;
                }
                if (this.a && i == 101) {
                    C0086cn c0086cnX = c0117dnA2.x();
                    c0086cnX.g = Rr.c;
                    c0117dnA = c0086cnX.a();
                } else {
                    C0086cn c0086cnX2 = c0117dnA2.x();
                    try {
                        String strN = C0117dn.n(c0117dnA2, "Content-Type");
                        long jG = interfaceC0597tb.g(c0117dnA2);
                        c0086cnX2.g = new Jl(strN, jG, new Bl(new C0535rb(c0566sb, interfaceC0597tb.c(c0117dnA2), jG)));
                        c0117dnA = c0086cnX2.a();
                    } catch (IOException e2) {
                        c0566sb.c(e2);
                        throw e2;
                    }
                }
                if ("close".equalsIgnoreCase(((C0569se) c0117dnA.a.e).a("Connection")) || "close".equalsIgnoreCase(C0117dn.n(c0117dnA, "Connection"))) {
                    interfaceC0597tb.h().k();
                }
                if (i == 204 || i == 205) {
                    Jl jl = c0117dnA.g;
                    if ((jl != null ? jl.n() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i);
                        sb.append(" had non-zero Content-Length: ");
                        sb.append(jl != null ? Long.valueOf(jl.n()) : l);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return c0117dnA;
            } catch (IOException e3) {
                c0566sb.c(e3);
                throw e3;
            }
        } catch (IOException e4) {
            c0473pa.getClass();
            Tf.j("call", dl);
            c0566sb.c(e4);
            throw e4;
        }
    }
}
