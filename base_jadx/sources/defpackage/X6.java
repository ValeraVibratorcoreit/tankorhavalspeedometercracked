package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class X6 {
    public static final X6 e;
    public static final X6 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        W5 w5 = W5.q;
        W5 w6 = W5.r;
        W5 w7 = W5.s;
        W5 w8 = W5.k;
        W5 w9 = W5.m;
        W5 w10 = W5.l;
        W5 w11 = W5.n;
        W5 w12 = W5.p;
        W5 w13 = W5.o;
        W5[] w5Arr = {w5, w6, w7, w8, w9, w10, w11, w12, w13, W5.i, W5.j, W5.g, W5.h, W5.e, W5.f, W5.d};
        W6 w14 = new W6();
        w14.b((W5[]) Arrays.copyOf(new W5[]{w5, w6, w7, w8, w9, w10, w11, w12, w13}, 9));
        Pq pq = Pq.TLS_1_3;
        Pq pq2 = Pq.TLS_1_2;
        w14.e(pq, pq2);
        w14.d();
        w14.a();
        W6 w15 = new W6();
        w15.b((W5[]) Arrays.copyOf(w5Arr, 16));
        w15.e(pq, pq2);
        w15.d();
        e = w15.a();
        W6 w16 = new W6();
        w16.b((W5[]) Arrays.copyOf(w5Arr, 16));
        w16.e(pq, pq2, Pq.TLS_1_1, Pq.TLS_1_0);
        w16.d();
        w16.a();
        f = new X6(false, false, null, null);
    }

    public X6(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(W5.t.v(str));
        }
        return AbstractC0314k6.x0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !Rr.j(strArr, sSLSocket.getEnabledProtocols(), C0482pj.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || Rr.j(strArr2, sSLSocket.getEnabledCipherSuites(), W5.b);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Ud.p(str));
        }
        return AbstractC0314k6.x0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof X6)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        X6 x6 = (X6) obj;
        boolean z = x6.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, x6.c) && Arrays.equals(this.d, x6.d) && this.b == x6.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
