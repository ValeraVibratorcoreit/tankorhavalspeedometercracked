package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class I4 implements To {
    public static final H4 a = new H4();

    @Override // defpackage.To
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.To
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.To
    public final boolean c() {
        boolean z = G4.d;
        return G4.d;
    }

    @Override // defpackage.To
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Tf.j("protocols", list);
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Tf.i("sslParameters", parameters);
            Gk gk = Gk.a;
            Object[] array = C0387mh.g(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
