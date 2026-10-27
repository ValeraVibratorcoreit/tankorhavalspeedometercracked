package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends AbstractC0390mk {
    public final X509TrustManager l;
    public final X509TrustManagerExtensions m;

    public W0(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.l = x509TrustManager;
        this.m = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof W0) && ((W0) obj).l == this.l;
    }

    @Override // defpackage.AbstractC0390mk
    public final List g(String str, List list) throws SSLPeerUnverifiedException {
        Tf.j("chain", list);
        Tf.j("hostname", str);
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.m.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            Tf.i("x509TrustManagerExtensio…ficates, \"RSA\", hostname)", listCheckServerTrusted);
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.l);
    }
}
