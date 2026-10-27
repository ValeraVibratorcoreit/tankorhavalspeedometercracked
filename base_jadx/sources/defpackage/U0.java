package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends Gk {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = C0387mh.l() && Build.VERSION.SDK_INT >= 29;
    }

    public U0() {
        ArrayList arrayListT = AbstractC0158f3.T(new To[]{(!C0387mh.l() || Build.VERSION.SDK_INT < 29) ? null : new V0(), new S8(C0095d1.f), new S8(C0162f7.a), new S8(I4.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListT) {
            if (((To) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.Gk
    public final AbstractC0390mk b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        W0 w0 = x509TrustManagerExtensions != null ? new W0(x509TrustManager, x509TrustManagerExtensions) : null;
        return w0 != null ? w0 : new C0281j4(c(x509TrustManager));
    }

    @Override // defpackage.Gk
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Tf.j("protocols", list);
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((To) next).a(sSLSocket));
        To to = (To) next;
        if (to != null) {
            to.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.Gk
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((To) next).a(sSLSocket));
        To to = (To) next;
        if (to != null) {
            return to.b(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.Gk
    public final boolean h(String str) {
        Tf.j("hostname", str);
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
