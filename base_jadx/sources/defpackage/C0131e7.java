package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131e7 implements R8 {
    @Override // defpackage.R8
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = C0101d7.d;
        return AbstractC0039b7.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.R8
    public final To c(SSLSocket sSLSocket) {
        return new C0162f7();
    }
}
