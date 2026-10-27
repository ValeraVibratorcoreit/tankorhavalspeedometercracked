package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {
    public final C0201gf a;
    public final List b;
    public final List c;
    public final C0473pa d;
    public final SocketFactory e;
    public final SSLSocketFactory f;
    public final HostnameVerifier g;
    public final D5 h;
    public final C0473pa i;
    public final ProxySelector j;

    public I0(String str, int i, C0473pa c0473pa, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, D5 d5, C0473pa c0473pa2, List list, List list2, ProxySelector proxySelector) {
        Tf.j("uriHost", str);
        Tf.j("dns", c0473pa);
        Tf.j("socketFactory", socketFactory);
        Tf.j("proxyAuthenticator", c0473pa2);
        Tf.j("protocols", list);
        Tf.j("connectionSpecs", list2);
        Tf.j("proxySelector", proxySelector);
        this.d = c0473pa;
        this.e = socketFactory;
        this.f = sSLSocketFactory;
        this.g = hostnameVerifier;
        this.h = d5;
        this.i = c0473pa2;
        this.j = proxySelector;
        C0170ff c0170ff = new C0170ff();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c0170ff.d = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c0170ff.d = "https";
        }
        String strB0 = Tf.b0(C0225h8.q(str, 0, 0, false, 7));
        if (strB0 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c0170ff.g = strB0;
        if (1 > i || 65535 < i) {
            throw new IllegalArgumentException(Vo.e(i, "unexpected port: ").toString());
        }
        c0170ff.b = i;
        this.a = c0170ff.a();
        this.b = Rr.w(list);
        this.c = Rr.w(list2);
    }

    public final boolean a(I0 i0) {
        Tf.j("that", i0);
        return Tf.b(this.d, i0.d) && Tf.b(this.i, i0.i) && Tf.b(this.b, i0.b) && Tf.b(this.c, i0.c) && Tf.b(this.j, i0.j) && Tf.b(null, null) && Tf.b(this.f, i0.f) && Tf.b(this.g, i0.g) && Tf.b(this.h, i0.h) && this.a.f == i0.a.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I0) {
            I0 i0 = (I0) obj;
            if (Tf.b(this.a, i0.a) && a(i0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + ((this.j.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.i.hashCode() + ((this.d.hashCode() + ((this.a.i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C0201gf c0201gf = this.a;
        sb.append(c0201gf.e);
        sb.append(':');
        sb.append(c0201gf.f);
        sb.append(", ");
        sb.append("proxySelector=" + this.j);
        sb.append("}");
        return sb.toString();
    }
}
