package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class Y6 {
    public int a;
    public boolean b;
    public boolean c;
    public final List d;

    public Y6(List list) {
        Tf.j("connectionSpecs", list);
        this.d = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final X6 a(SSLSocket sSLSocket) throws UnknownServiceException, CloneNotSupportedException {
        X6 x6;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.a;
        List list = this.d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                x6 = null;
                break;
            }
            x6 = (X6) list.get(i2);
            if (x6.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (x6 == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Tf.f(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            Tf.i("java.util.Arrays.toString(this)", string);
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((X6) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.b = z;
        boolean z2 = this.c;
        String[] strArr = x6.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            Tf.i("sslSocket.enabledCipherSuites", enabledCipherSuites2);
            enabledCipherSuites = Rr.p(enabledCipherSuites2, strArr, W5.b);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = x6.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            Tf.i("sslSocket.enabledProtocols", enabledProtocols3);
            enabledProtocols = Rr.p(enabledProtocols3, r6, C0482pj.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Tf.i("supportedCipherSuites", supportedCipherSuites);
        V5 v5 = W5.b;
        byte[] bArr = Rr.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (v5.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            Tf.i("cipherSuitesIntersection", enabledCipherSuites);
            String str = supportedCipherSuites[i];
            Tf.i("supportedCipherSuites[indexOfFallbackScsv]", str);
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Tf.i("java.util.Arrays.copyOf(this, newSize)", objArrCopyOf);
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        W6 w6 = new W6();
        w6.a = x6.a;
        w6.c = strArr;
        w6.d = r6;
        w6.b = x6.b;
        Tf.i("cipherSuitesIntersection", enabledCipherSuites);
        w6.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Tf.i("tlsVersionsIntersection", enabledProtocols);
        w6.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        X6 x6A = w6.a();
        if (x6A.c() != null) {
            sSLSocket.setEnabledProtocols(x6A.d);
        }
        if (x6A.a() != null) {
            sSLSocket.setEnabledCipherSuites(x6A.c);
        }
        return x6;
    }
}
