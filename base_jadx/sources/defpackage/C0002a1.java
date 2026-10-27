package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0002a1 extends Gk {
    public static final boolean e;
    public final ArrayList c;
    public final K2 d;

    static {
        boolean z = false;
        if (C0387mh.l() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public C0002a1() throws NoSuchMethodException {
        C0549rp c0549rp;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c0549rp = new C0549rp(cls);
        } catch (Exception e2) {
            Gk.a.getClass();
            Gk.i(5, "unable to load android socket classes", e2);
            c0549rp = null;
        }
        ArrayList arrayListT = AbstractC0158f3.T(new To[]{c0549rp, new S8(C0095d1.f), new S8(C0162f7.a), new S8(I4.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListT) {
            if (((To) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new K2(method3, method2, method, 6);
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
    public final InterfaceC0706wr c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Tf.i("method", declaredMethod);
            declaredMethod.setAccessible(true);
            return new Z0(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Tf.j("address", inetSocketAddress);
        socket.connect(inetSocketAddress, i);
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
    public final Object g() {
        K2 k2 = this.d;
        k2.getClass();
        Method method = (Method) k2.b;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            Method method2 = (Method) k2.c;
            Tf.f(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.Gk
    public final boolean h(String str) {
        Tf.j("hostname", str);
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.Gk
    public final void j(String str, Object obj) {
        Tf.j("message", str);
        K2 k2 = this.d;
        k2.getClass();
        if (obj != null) {
            try {
                Method method = (Method) k2.d;
                Tf.f(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        Gk.i(5, str, null);
    }
}
