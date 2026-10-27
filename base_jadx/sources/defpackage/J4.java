package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class J4 implements Rf {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public J4(C0473pa c0473pa) {
        Tf.j("cookieJar", c0473pa);
        this.b = c0473pa;
    }

    public static int d(C0117dn c0117dn, int i) {
        String strN = C0117dn.n(c0117dn, "Retry-After");
        if (strN == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        Tf.i("compile(pattern)", patternCompile);
        if (!patternCompile.matcher(strN).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strN);
        Tf.i("Integer.valueOf(header)", numValueOf);
        return numValueOf.intValue();
    }

    @Override // defpackage.Rf
    public final C0117dn a(Il il) {
        Jl jl;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        D5 d5;
        switch (this.a) {
            case 0:
                T1 t1 = il.f;
                H0 h0E = t1.e();
                C0043bb c0043bb = (C0043bb) t1.f;
                if (c0043bb != null) {
                    C0388mi c0388mi = (C0388mi) c0043bb.d;
                    if (c0388mi != null) {
                        h0E.i("Content-Type", c0388mi.a);
                    }
                    long j = c0043bb.a;
                    if (j != -1) {
                        h0E.i("Content-Length", String.valueOf(j));
                        ((Ya) h0E.d).e("Transfer-Encoding");
                    } else {
                        h0E.i("Transfer-Encoding", "chunked");
                        ((Ya) h0E.d).e("Content-Length");
                    }
                }
                C0569se c0569se = (C0569se) t1.e;
                String strA = c0569se.a("Host");
                boolean z = false;
                C0201gf c0201gf = (C0201gf) t1.c;
                if (strA == null) {
                    h0E.i("Host", Rr.v(c0201gf, false));
                }
                if (c0569se.a("Connection") == null) {
                    h0E.i("Connection", "Keep-Alive");
                }
                if (c0569se.a("Accept-Encoding") == null && c0569se.a("Range") == null) {
                    h0E.i("Accept-Encoding", "gzip");
                    z = true;
                }
                C0473pa c0473pa = (C0473pa) this.b;
                c0473pa.getClass();
                Tf.j("url", c0201gf);
                if (c0569se.a("User-Agent") == null) {
                    h0E.i("User-Agent", "okhttp/4.9.1");
                }
                C0117dn c0117dnB = il.b(h0E.a());
                C0569se c0569se2 = c0117dnB.f;
                AbstractC0139ef.b(c0473pa, c0201gf, c0569se2);
                C0086cn c0086cnX = c0117dnB.x();
                c0086cnX.a = t1;
                if (z && "gzip".equalsIgnoreCase(C0117dn.n(c0117dnB, "Content-Encoding")) && AbstractC0139ef.a(c0117dnB) && (jl = c0117dnB.g) != null) {
                    C0384me c0384me = new C0384me(jl.x());
                    Ya yaC = c0569se2.c();
                    yaC.e("Content-Encoding");
                    yaC.e("Content-Length");
                    c0086cnX.f = yaC.b().c();
                    c0086cnX.g = new Jl(C0117dn.n(c0117dnB, "Content-Type"), -1L, new Bl(c0384me));
                }
                return c0086cnX.a();
            default:
                T1 t2 = il.f;
                Dl dl = il.b;
                boolean z2 = true;
                List list = Sa.a;
                C0117dn c0117dn = null;
                int i = 0;
                T1 t1B = t2;
                boolean z3 = true;
                while (true) {
                    dl.getClass();
                    Tf.j("request", t1B);
                    if (dl.i != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    synchronized (dl) {
                        try {
                            if (!(dl.k ^ z2)) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                            }
                            if (!(dl.j ^ z2)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z3) {
                        Hl hl = dl.a;
                        C0201gf c0201gf2 = (C0201gf) t1B.c;
                        boolean z4 = c0201gf2.a;
                        Pj pj = dl.p;
                        if (z4) {
                            SSLSocketFactory sSLSocketFactory2 = pj.o;
                            if (sSLSocketFactory2 == null) {
                                throw new IllegalStateException("CLEARTEXT-only client");
                            }
                            HostnameVerifier hostnameVerifier2 = pj.s;
                            d5 = pj.t;
                            sSLSocketFactory = sSLSocketFactory2;
                            hostnameVerifier = hostnameVerifier2;
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            d5 = null;
                        }
                        dl.f = new C0628ub(hl, new I0(c0201gf2.e, c0201gf2.f, pj.k, pj.n, sSLSocketFactory, hostnameVerifier, d5, pj.m, pj.r, pj.q, pj.l), dl);
                    }
                    try {
                        if (dl.m) {
                            throw new IOException("Canceled");
                        }
                        try {
                            try {
                                C0117dn c0117dnB2 = il.b(t1B);
                                if (c0117dn != null) {
                                    C0086cn c0086cnX2 = c0117dnB2.x();
                                    C0086cn c0086cnX3 = c0117dn.x();
                                    c0086cnX3.g = null;
                                    C0117dn c0117dnA = c0086cnX3.a();
                                    if (c0117dnA.g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null".toString());
                                    }
                                    c0086cnX2.j = c0117dnA;
                                    c0117dnB2 = c0086cnX2.a();
                                }
                                c0117dn = c0117dnB2;
                                C0566sb c0566sb = dl.i;
                                t1B = b(c0117dn, c0566sb);
                                if (t1B == null) {
                                    if (c0566sb != null && c0566sb.a) {
                                        if (!(!dl.h)) {
                                            throw new IllegalStateException("Check failed.".toString());
                                        }
                                        dl.h = true;
                                        dl.c.i();
                                    }
                                    dl.d(false);
                                    return c0117dn;
                                }
                                Jl jl2 = c0117dn.g;
                                if (jl2 != null) {
                                    Rr.d(jl2);
                                }
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                dl.d(true);
                                list = list;
                                z3 = true;
                                z2 = true;
                            } catch (IOException e) {
                                if (!c(e, dl, t1B, !(e instanceof V6))) {
                                    Rr.z(e, list);
                                    throw e;
                                }
                                ArrayList arrayList = new ArrayList(list.size() + 1);
                                arrayList.addAll(list);
                                arrayList.add(e);
                                dl.d(true);
                                list = arrayList;
                                z2 = true;
                                i = i;
                                z3 = false;
                            }
                        } catch (C0209gn e2) {
                            List list2 = list;
                            if (!c(e2.a, dl, t1B, false)) {
                                IOException iOException = e2.b;
                                Rr.z(iOException, list2);
                                throw iOException;
                            }
                            IOException iOException2 = e2.b;
                            ArrayList arrayList2 = new ArrayList(list2.size() + 1);
                            arrayList2.addAll(list2);
                            arrayList2.add(iOException2);
                            dl.d(true);
                            list = arrayList2;
                            z3 = false;
                            z2 = true;
                            i = i;
                        }
                    } catch (Throwable th2) {
                        dl.d(true);
                        throw th2;
                    }
                }
                break;
        }
    }

    public T1 b(C0117dn c0117dn, C0566sb c0566sb) throws ProtocolException {
        String strN;
        C0170ff c0170ff;
        Gl gl;
        C0178fn c0178fn = (c0566sb == null || (gl = c0566sb.b) == null) ? null : gl.q;
        int i = c0117dn.d;
        String str = (String) c0117dn.a.d;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((Pj) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                if (c0566sb == null || !(!Tf.b(c0566sb.e.h.a.e, c0566sb.b.q.a.a.e))) {
                    return null;
                }
                Gl gl2 = c0566sb.b;
                synchronized (gl2) {
                    gl2.j = true;
                }
                return c0117dn.a;
            }
            if (i == 503) {
                C0117dn c0117dn2 = c0117dn.j;
                if ((c0117dn2 == null || c0117dn2.d != 503) && d(c0117dn, Integer.MAX_VALUE) == 0) {
                    return c0117dn.a;
                }
                return null;
            }
            if (i == 407) {
                Tf.f(c0178fn);
                if (c0178fn.b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((Pj) this.b).m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((Pj) this.b).f) {
                    return null;
                }
                C0117dn c0117dn3 = c0117dn.j;
                if ((c0117dn3 == null || c0117dn3.d != 408) && d(c0117dn, 0) <= 0) {
                    return c0117dn.a;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        Pj pj = (Pj) this.b;
        if (!pj.h || (strN = C0117dn.n(c0117dn, "Location")) == null) {
            return null;
        }
        T1 t1 = c0117dn.a;
        C0201gf c0201gf = (C0201gf) t1.c;
        c0201gf.getClass();
        try {
            c0170ff = new C0170ff();
            c0170ff.d(c0201gf, strN);
        } catch (IllegalArgumentException unused) {
            c0170ff = null;
        }
        C0201gf c0201gfA = c0170ff != null ? c0170ff.a() : null;
        if (c0201gfA == null) {
            return null;
        }
        if (!Tf.b(c0201gfA.b, ((C0201gf) t1.c).b) && !pj.i) {
            return null;
        }
        H0 h0E = t1.e();
        if (Br.W(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i2 = c0117dn.d;
            boolean z = zEquals || i2 == 308 || i2 == 307;
            if (!(true ^ str.equals("PROPFIND")) || i2 == 308 || i2 == 307) {
                h0E.j(str, z ? (C0043bb) t1.f : null);
            } else {
                h0E.j("GET", null);
            }
            if (!z) {
                ((Ya) h0E.d).e("Transfer-Encoding");
                ((Ya) h0E.d).e("Content-Length");
                ((Ya) h0E.d).e("Content-Type");
            }
        }
        if (!Rr.a((C0201gf) t1.c, c0201gfA)) {
            ((Ya) h0E.d).e("Authorization");
        }
        h0E.b = c0201gfA;
        return h0E.a();
    }

    public boolean c(IOException iOException, Dl dl, T1 t1, boolean z) {
        C0170ff c0170ff;
        boolean zC;
        Gl gl;
        if (!((Pj) this.b).f) {
            return false;
        }
        if ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z)) {
            return false;
        }
        C0628ub c0628ub = dl.f;
        Tf.f(c0628ub);
        int i = c0628ub.c;
        if (i == 0 && c0628ub.d == 0 && c0628ub.e == 0) {
            zC = false;
        } else if (c0628ub.f != null) {
            zC = true;
        } else {
            C0178fn c0178fn = null;
            if (i <= 1 && c0628ub.d <= 1 && c0628ub.e <= 0 && (gl = c0628ub.i.g) != null) {
                synchronized (gl) {
                    if (gl.k == 0 && Rr.a(gl.q.a.a, c0628ub.h.a)) {
                        c0178fn = gl.q;
                    }
                }
            }
            if (c0178fn != null) {
                c0628ub.f = c0178fn;
            } else {
                Q0 q0 = c0628ub.a;
                if ((q0 == null || !q0.c()) && (c0170ff = c0628ub.b) != null) {
                    zC = c0170ff.c();
                }
            }
            zC = true;
        }
        return zC;
    }

    public J4(Pj pj) {
        Tf.j("client", pj);
        this.b = pj;
    }
}
