package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0281j4 extends AbstractC0390mk {
    public final InterfaceC0706wr l;

    public C0281j4(InterfaceC0706wr interfaceC0706wr) {
        Tf.j("trustRootIndex", interfaceC0706wr);
        this.l = interfaceC0706wr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0281j4) && Tf.b(((C0281j4) obj).l, this.l);
    }

    @Override // defpackage.AbstractC0390mk
    public final List g(String str, List list) throws SSLPeerUnverifiedException {
        Tf.j("chain", list);
        Tf.j("hostname", str);
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        Tf.i("queue.removeFirst()", objRemoveFirst);
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.l.a(x509Certificate);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || (!x509Certificate.equals(x509CertificateA))) {
                    arrayList.add(x509CertificateA);
                }
                if (!(!Tf.b(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN()))) {
                    try {
                        x509CertificateA.verify(x509CertificateA.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                Tf.i("queue.iterator()", it);
                while (true) {
                    if (!it.hasNext()) {
                        if (z) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                    }
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (!(!Tf.b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()))) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
