package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0162f7 implements To {
    public static final C0131e7 a = new C0131e7();

    @Override // defpackage.To
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.To
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.To
    public final boolean c() {
        boolean z = C0101d7.d;
        return C0101d7.d;
    }

    @Override // defpackage.To
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Tf.j("protocols", list);
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Gk gk = Gk.a;
            Object[] array = C0387mh.g(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
