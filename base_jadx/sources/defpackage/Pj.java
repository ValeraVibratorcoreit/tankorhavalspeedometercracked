package defpackage;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class Pj implements Cloneable {
    public final C0296jj a;
    public final C0308k0 b;
    public final List c;
    public final List d;
    public final Vi e;
    public final boolean f;
    public final C0473pa g;
    public final boolean h;
    public final boolean i;
    public final C0473pa j;
    public final C0473pa k;
    public final ProxySelector l;
    public final C0473pa m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final HostnameVerifier s;
    public final D5 t;
    public final AbstractC0390mk u;
    public final int v;
    public final int w;
    public final int x;
    public final Vi y;
    public static final List z = Rr.l(EnumC0268il.HTTP_2, EnumC0268il.HTTP_1_1);
    public static final List A = Rr.l(X6.e, X6.f);

    public Pj(Oj oj) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = oj.a;
        this.b = oj.b;
        this.c = Rr.w(oj.c);
        this.d = Rr.w(oj.d);
        this.e = oj.e;
        this.f = oj.f;
        this.g = oj.g;
        this.h = oj.h;
        this.i = oj.i;
        this.j = oj.j;
        this.k = oj.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.l = proxySelector == null ? Jj.a : proxySelector;
        this.m = oj.l;
        this.n = oj.m;
        List list = oj.n;
        this.q = list;
        this.r = oj.o;
        this.s = oj.p;
        this.v = oj.r;
        this.w = oj.s;
        this.x = oj.t;
        this.y = new Vi(6);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.o = null;
                    this.u = null;
                    this.p = null;
                    this.t = D5.c;
                    break;
                }
                if (((X6) it.next()).a) {
                    Gk gk = Gk.a;
                    X509TrustManager x509TrustManagerM = Gk.a.m();
                    this.p = x509TrustManagerM;
                    this.o = Gk.a.l(x509TrustManagerM);
                    AbstractC0390mk abstractC0390mkB = Gk.a.b(x509TrustManagerM);
                    this.u = abstractC0390mkB;
                    D5 d5 = oj.q;
                    this.t = Tf.b(d5.b, abstractC0390mkB) ? d5 : new D5(d5.a, abstractC0390mkB);
                    break;
                }
            }
        } else {
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = D5.c;
            break;
        }
        List list2 = this.c;
        if (list2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list2.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.d;
        if (list3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        }
        if (!(!list3.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        List list4 = this.q;
        boolean z2 = list4 instanceof Collection;
        X509TrustManager x509TrustManager = this.p;
        AbstractC0390mk abstractC0390mk = this.u;
        SSLSocketFactory sSLSocketFactory = this.o;
        if (!z2 || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((X6) it2.next()).a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (abstractC0390mk == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (!(sSLSocketFactory == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (abstractC0390mk != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (x509TrustManager != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Tf.b(this.t, D5.c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final Object clone() {
        return super.clone();
    }

    public Pj() {
        this(new Oj());
    }
}
