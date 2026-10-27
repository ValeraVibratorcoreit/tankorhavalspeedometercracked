package defpackage;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0374m4 implements InterfaceC0706wr {
    public final LinkedHashMap a;

    public C0374m4(X509Certificate... x509CertificateArr) {
        Tf.j("caCerts", x509CertificateArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Tf.i("caCert.subjectX500Principal", subjectX500Principal);
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.InterfaceC0706wr
    public final X509Certificate a(X509Certificate x509Certificate) {
        Set set = (Set) this.a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0374m4) && Tf.b(((C0374m4) obj).a, this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
