package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class Gl extends Ke {
    public Socket b;
    public Socket c;
    public C0446oe d;
    public EnumC0268il e;
    public Te f;
    public Bl g;
    public Al h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final ArrayList o;
    public long p;
    public final C0178fn q;

    public Gl(Hl hl, C0178fn c0178fn) {
        Tf.j("connectionPool", hl);
        Tf.j("route", c0178fn);
        this.q = c0178fn;
        this.n = 1;
        this.o = new ArrayList();
        this.p = Long.MAX_VALUE;
    }

    public static void d(Pj pj, C0178fn c0178fn, IOException iOException) {
        Tf.j("client", pj);
        Tf.j("failedRoute", c0178fn);
        Tf.j("failure", iOException);
        if (c0178fn.b.type() != Proxy.Type.DIRECT) {
            I0 i0 = c0178fn.a;
            i0.j.connectFailed(i0.a.f(), c0178fn.b.address(), iOException);
        }
        Vi vi = pj.y;
        synchronized (vi) {
            ((LinkedHashSet) vi.a).add(c0178fn);
        }
    }

    @Override // defpackage.Ke
    public final synchronized void a(Te te, C0087co c0087co) {
        Tf.j("connection", te);
        Tf.j("settings", c0087co);
        this.n = (c0087co.a & 16) != 0 ? c0087co.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.Ke
    public final void b(C0016af c0016af) {
        Tf.j("stream", c0016af);
        c0016af.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, Dl dl, C0473pa c0473pa) throws Throwable {
        Tf.j("call", dl);
        Tf.j("eventListener", c0473pa);
        if (this.e != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List list = this.q.a.c;
        Y6 y6 = new Y6(list);
        I0 i0 = this.q.a;
        if (i0.f == null) {
            if (!list.contains(X6.f)) {
                throw new C0209gn(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.q.a.a.e;
            Gk gk = Gk.a;
            if (!Gk.a.h(str)) {
                throw new C0209gn(new UnknownServiceException(Vo.g("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (i0.b.contains(EnumC0268il.H2_PRIOR_KNOWLEDGE)) {
            throw new C0209gn(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C0209gn c0209gn = null;
        while (true) {
            try {
                C0178fn c0178fn = this.q;
                if (c0178fn.a.f == null || c0178fn.b.type() != Proxy.Type.HTTP) {
                    try {
                        e(i, i2, dl, c0473pa);
                    } catch (IOException e) {
                        e = e;
                        Socket socket = this.c;
                        if (socket != null) {
                            Rr.e(socket);
                        }
                        Socket socket2 = this.b;
                        if (socket2 != null) {
                            Rr.e(socket2);
                        }
                        this.c = null;
                        this.b = null;
                        this.g = null;
                        this.h = null;
                        this.d = null;
                        this.e = null;
                        this.f = null;
                        this.n = 1;
                        C0178fn c0178fn2 = this.q;
                        InetSocketAddress inetSocketAddress = c0178fn2.c;
                        Proxy proxy = c0178fn2.b;
                        Tf.j("inetSocketAddress", inetSocketAddress);
                        Tf.j("proxy", proxy);
                        if (c0209gn == null) {
                            c0209gn = new C0209gn(e);
                        } else {
                            F4.d(c0209gn.b, e);
                            c0209gn.a = e;
                        }
                        if (!z) {
                            throw c0209gn;
                        }
                        y6.c = true;
                        if (!y6.b) {
                            throw c0209gn;
                        }
                        if (e instanceof ProtocolException) {
                            throw c0209gn;
                        }
                        if (e instanceof InterruptedIOException) {
                            throw c0209gn;
                        }
                        if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            throw c0209gn;
                        }
                        if (e instanceof SSLPeerUnverifiedException) {
                            throw c0209gn;
                        }
                        if (!(e instanceof SSLException)) {
                            throw c0209gn;
                        }
                    }
                } else {
                    f(i, i2, i3, dl, c0473pa);
                    if (this.b == null) {
                        break;
                    }
                }
                g(y6, dl, c0473pa);
                Tf.j("inetSocketAddress", this.q.c);
                break;
            } catch (IOException e2) {
                e = e2;
            }
        }
        C0178fn c0178fn3 = this.q;
        if (c0178fn3.a.f != null && c0178fn3.b.type() == Proxy.Type.HTTP && this.b == null) {
            throw new C0209gn(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.p = System.nanoTime();
    }

    public final void e(int i, int i2, Dl dl, C0473pa c0473pa) throws IOException {
        Socket socket;
        int i3;
        C0178fn c0178fn = this.q;
        Proxy proxy = c0178fn.b;
        I0 i0 = c0178fn.a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = El.a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = i0.e.createSocket();
            Tf.f(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        InetSocketAddress inetSocketAddress = this.q.c;
        c0473pa.getClass();
        Tf.j("call", dl);
        Tf.j("inetSocketAddress", inetSocketAddress);
        socket.setSoTimeout(i2);
        try {
            Gk gk = Gk.a;
            Gk.a.e(socket, this.q.c, i);
            try {
                this.g = new Bl(Tf.Z(socket));
                this.h = new Al(Tf.X(socket));
            } catch (NullPointerException e) {
                if (Tf.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.q.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, Dl dl, C0473pa c0473pa) throws IOException {
        H0 h0 = new H0();
        C0178fn c0178fn = this.q;
        C0201gf c0201gf = c0178fn.a.a;
        Tf.j("url", c0201gf);
        h0.b = c0201gf;
        h0.j("CONNECT", null);
        I0 i0 = c0178fn.a;
        h0.i("Host", Rr.v(i0.a, true));
        h0.i("Proxy-Connection", "Keep-Alive");
        h0.i("User-Agent", "okhttp/4.9.1");
        T1 t1A = h0.a();
        C0086cn c0086cn = new C0086cn();
        c0086cn.a = t1A;
        c0086cn.b = EnumC0268il.HTTP_1_1;
        c0086cn.c = 407;
        c0086cn.d = "Preemptive Authenticate";
        c0086cn.g = Rr.c;
        c0086cn.k = -1L;
        c0086cn.l = -1L;
        Ya ya = c0086cn.f;
        ya.getClass();
        Ud.j("Proxy-Authenticate");
        Ud.m("OkHttp-Preemptive", "Proxy-Authenticate");
        ya.e("Proxy-Authenticate");
        ya.a("Proxy-Authenticate", "OkHttp-Preemptive");
        c0086cn.a();
        i0.i.getClass();
        e(i, i2, dl, c0473pa);
        String str = "CONNECT " + Rr.v((C0201gf) t1A.c, true) + " HTTP/1.1";
        Bl bl = this.g;
        Tf.f(bl);
        Al al = this.h;
        Tf.f(al);
        Ge ge = new Ge(null, this, bl, al);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bl.c.b().g(i2, timeUnit);
        al.c.b().g(i3, timeUnit);
        ge.j((C0569se) t1A.e, str);
        ge.d();
        C0086cn c0086cnF = ge.f(false);
        Tf.f(c0086cnF);
        c0086cnF.a = t1A;
        C0117dn c0117dnA = c0086cnF.a();
        long jK = Rr.k(c0117dnA);
        if (jK != -1) {
            De deI = ge.i(jK);
            Rr.t(deI, Integer.MAX_VALUE, timeUnit);
            deI.close();
        }
        int i4 = c0117dnA.d;
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(Vo.e(i4, "Unexpected response code for CONNECT: "));
            }
            i0.i.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!bl.a.p() || !al.a.p()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(Y6 y6, Dl dl, C0473pa c0473pa) throws Throwable {
        I0 i0 = this.q.a;
        SSLSocketFactory sSLSocketFactory = i0.f;
        EnumC0268il enumC0268ilA = EnumC0268il.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = i0.b;
            EnumC0268il enumC0268il = EnumC0268il.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC0268il)) {
                this.c = this.b;
                this.e = enumC0268ilA;
                return;
            } else {
                this.c = this.b;
                this.e = enumC0268il;
                l();
                return;
            }
        }
        c0473pa.getClass();
        Tf.j("call", dl);
        I0 i1 = this.q.a;
        SSLSocketFactory sSLSocketFactory2 = i1.f;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            Tf.f(sSLSocketFactory2);
            Socket socket = this.b;
            C0201gf c0201gf = i1.a;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, c0201gf.e, c0201gf.f, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                X6 x6A = y6.a(sSLSocket2);
                if (x6A.b) {
                    Gk gk = Gk.a;
                    Gk.a.d(sSLSocket2, i1.a.e, i1.b);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                Tf.i("sslSocketSession", session);
                C0446oe c0446oeO = Td.o(session);
                HostnameVerifier hostnameVerifier = i1.g;
                Tf.f(hostnameVerifier);
                if (hostnameVerifier.verify(i1.a.e, session)) {
                    D5 d5 = i1.h;
                    Tf.f(d5);
                    this.d = new C0446oe(c0446oeO.b, c0446oeO.c, c0446oeO.d, new Fl(d5, c0446oeO, i1));
                    Tf.j("hostname", i1.a.e);
                    Iterator it = d5.a.iterator();
                    if (it.hasNext()) {
                        Vo.l(it.next());
                        throw null;
                    }
                    if (x6A.b) {
                        Gk gk2 = Gk.a;
                        strF = Gk.a.f(sSLSocket2);
                    }
                    this.c = sSLSocket2;
                    this.g = new Bl(Tf.Z(sSLSocket2));
                    this.h = new Al(Tf.X(sSLSocket2));
                    if (strF != null) {
                        enumC0268ilA = F4.A(strF);
                    }
                    this.e = enumC0268ilA;
                    Gk gk3 = Gk.a;
                    Gk.a.a(sSLSocket2);
                    if (this.e == EnumC0268il.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = c0446oeO.a();
                if (!(!listA.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + i1.a.e + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(i1.a.e);
                sb.append(" not verified:\n              |    certificate: ");
                D5 d6 = D5.c;
                C0129e5 c0129e5 = C0129e5.d;
                PublicKey publicKey = x509Certificate.getPublicKey();
                Tf.i("publicKey", publicKey);
                byte[] encoded = publicKey.getEncoded();
                Tf.i("publicKey.encoded", encoded);
                C0129e5 c0129e6 = C0129e5.d;
                int length = encoded.length;
                Td.d(encoded.length, 0, length);
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(new C0129e5(AbstractC0158f3.R(0, length, encoded)).c);
                Tf.i("MessageDigest.getInstance(algorithm).digest(data)", bArrDigest);
                sb.append("sha256/".concat(new C0129e5(bArrDigest).a()));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                Tf.i("cert.subjectDN", subjectDN);
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                List listA2 = Nj.a(x509Certificate, 7);
                List listA3 = Nj.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(listA3.size() + listA2.size());
                arrayList.addAll(listA2);
                arrayList.addAll(listA3);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(Fp.B0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Gk gk4 = Gk.a;
                    Gk.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Rr.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        if (defpackage.Nj.b(r1, (java.security.cert.X509Certificate) r11) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.I0 r10, java.util.ArrayList r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Gl.h(I0, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = Rr.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.b;
        Tf.f(socket);
        Socket socket2 = this.c;
        Tf.f(socket2);
        Bl bl = this.g;
        Tf.f(bl);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Te te = this.f;
        if (te != null) {
            synchronized (te) {
                if (te.g) {
                    return false;
                }
                return te.p >= te.o || jNanoTime < te.q;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.p;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !bl.p();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final InterfaceC0597tb j(Pj pj, Il il) throws SocketException {
        Tf.j("client", pj);
        Socket socket = this.c;
        Tf.f(socket);
        Bl bl = this.g;
        Tf.f(bl);
        Al al = this.h;
        Tf.f(al);
        Te te = this.f;
        if (te != null) {
            return new Ue(pj, this, il, te);
        }
        int i = il.h;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bl.c.b().g(i, timeUnit);
        al.c.b().g(il.i, timeUnit);
        return new Ge(pj, this, bl, al);
    }

    public final synchronized void k() {
        this.i = true;
    }

    public final void l() throws SocketException {
        int i;
        Socket socket = this.c;
        Tf.f(socket);
        Bl bl = this.g;
        Tf.f(bl);
        Al al = this.h;
        Tf.f(al);
        socket.setSoTimeout(0);
        C0334kq c0334kq = C0334kq.h;
        Ge ge = new Ge(c0334kq);
        String str = this.q.a.a.e;
        Tf.j("peerName", str);
        ge.d = socket;
        ge.e = Rr.g + ' ' + str;
        ge.a = bl;
        ge.b = al;
        ge.f = this;
        ge.c = 0;
        Te te = new Te(ge);
        this.f = te;
        C0087co c0087co = Te.B;
        this.n = (c0087co.a & 16) != 0 ? c0087co.b[4] : Integer.MAX_VALUE;
        C0047bf c0047bf = te.y;
        synchronized (c0047bf) {
            try {
                if (c0047bf.c) {
                    throw new IOException("closed");
                }
                if (c0047bf.f) {
                    Logger logger = C0047bf.g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Rr.i(">> CONNECTION " + He.a.c(), new Object[0]));
                    }
                    c0047bf.e.r(He.a);
                    c0047bf.e.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0047bf c0047bf2 = te.y;
        C0087co c0087co2 = te.r;
        synchronized (c0047bf2) {
            try {
                Tf.j("settings", c0087co2);
                if (c0047bf2.c) {
                    throw new IOException("closed");
                }
                c0047bf2.x(0, Integer.bitCount(c0087co2.a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    if (((1 << i2) & c0087co2.a) != 0) {
                        if (i2 != 4) {
                            i = i2 != 7 ? i2 : 4;
                        } else {
                            i = 3;
                        }
                        c0047bf2.e.i(i);
                        c0047bf2.e.j(c0087co2.b[i2]);
                    }
                    i2++;
                }
                c0047bf2.e.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = te.r.a();
        if (iA != 65535) {
            te.y.B(iA - 65535, 0);
        }
        c0334kq.f().c(new Re(2, te.d, te.z), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C0178fn c0178fn = this.q;
        sb.append(c0178fn.a.a.e);
        sb.append(':');
        sb.append(c0178fn.a.a.f);
        sb.append(", proxy=");
        sb.append(c0178fn.b);
        sb.append(" hostAddress=");
        sb.append(c0178fn.c);
        sb.append(" cipherSuite=");
        C0446oe c0446oe = this.d;
        if (c0446oe == null || (obj = c0446oe.c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
