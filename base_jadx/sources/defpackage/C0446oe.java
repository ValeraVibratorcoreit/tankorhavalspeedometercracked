package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0446oe {
    public final Vp a;
    public final Pq b;
    public final W5 c;
    public final List d;

    public C0446oe(Pq pq, W5 w5, List list, InterfaceC0107dd interfaceC0107dd) {
        this.b = pq;
        this.c = w5;
        this.d = list;
        this.a = new Vp(new C0415ne(interfaceC0107dd, 1));
    }

    public final List a() {
        return (List) this.a.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0446oe) {
            C0446oe c0446oe = (C0446oe) obj;
            if (c0446oe.b == this.b && Tf.b(c0446oe.c, this.c) && Tf.b(c0446oe.a(), a()) && Tf.b(c0446oe.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((a().hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(AbstractC0376m6.u0(listA));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Tf.i("type", type2);
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.b);
        sb.append(" cipherSuite=");
        sb.append(this.c);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.d;
        ArrayList arrayList2 = new ArrayList(AbstractC0376m6.u0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Tf.i("type", type);
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
