package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 implements InterfaceC0706wr {
    public final X509TrustManager a;
    public final Method b;

    public Z0(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // defpackage.InterfaceC0706wr
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.b.invoke(this.a, x509Certificate);
            if (objInvoke != null) {
                return ((TrustAnchor) objInvoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z0)) {
            return false;
        }
        Z0 z0 = (Z0) obj;
        return Tf.b(this.a, z0.a) && Tf.b(this.b, z0.b);
    }

    public final int hashCode() {
        X509TrustManager x509TrustManager = this.a;
        int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
        Method method = this.b;
        return iHashCode + (method != null ? method.hashCode() : 0);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ")";
    }
}
