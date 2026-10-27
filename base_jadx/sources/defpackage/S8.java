package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class S8 implements To {
    public To a;
    public final R8 b;

    public S8(R8 r8) {
        this.b = r8;
    }

    @Override // defpackage.To
    public final boolean a(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }

    @Override // defpackage.To
    public final String b(SSLSocket sSLSocket) {
        To toE = e(sSLSocket);
        if (toE != null) {
            return toE.b(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.To
    public final boolean c() {
        return true;
    }

    @Override // defpackage.To
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Tf.j("protocols", list);
        To toE = e(sSLSocket);
        if (toE != null) {
            toE.d(sSLSocket, str, list);
        }
    }

    public final synchronized To e(SSLSocket sSLSocket) {
        try {
            if (this.a == null && this.b.a(sSLSocket)) {
                this.a = this.b.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
