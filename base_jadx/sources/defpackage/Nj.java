package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public final class Nj implements HostnameVerifier {
    public static final Nj a = new Nj();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        Sa sa = Sa.a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!Tf.b(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return sa;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean zB;
        int length;
        Tf.j("host", str);
        byte[] bArr = Rr.a;
        C0454om c0454om = Rr.f;
        c0454om.getClass();
        if (((Pattern) c0454om.b).matcher(str).matches()) {
            String strB0 = Tf.b0(str);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (Tf.b(strB0, Tf.b0((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            Locale locale = Locale.US;
            Tf.i("Locale.US", locale);
            String lowerCase = str.toLowerCase(locale);
            Tf.i("(this as java.lang.String).toLowerCase(locale)", lowerCase);
            List<String> listA2 = a(x509Certificate, 2);
            if (!listA2.isEmpty()) {
                for (String strConcat : listA2) {
                    if (lowerCase.length() == 0 || Mp.U0(lowerCase, ".", false) || lowerCase.endsWith("..") || strConcat == null || strConcat.length() == 0 || Mp.U0(strConcat, ".", false) || strConcat.endsWith("..")) {
                        zB = false;
                    } else {
                        String strConcat2 = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                        if (!strConcat.endsWith(".")) {
                            strConcat = strConcat.concat(".");
                        }
                        Locale locale2 = Locale.US;
                        Tf.i("Locale.US", locale2);
                        if (strConcat == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase2 = strConcat.toLowerCase(locale2);
                        Tf.i("(this as java.lang.String).toLowerCase(locale)", lowerCase2);
                        if (!Mp.D0(lowerCase2, "*")) {
                            zB = Tf.b(strConcat2, lowerCase2);
                        } else if (!Mp.U0(lowerCase2, "*.", false) || Mp.I0(lowerCase2, '*', 1, false, 4) != -1 || strConcat2.length() < lowerCase2.length() || "*.".equals(lowerCase2)) {
                            zB = false;
                        } else {
                            String strSubstring = lowerCase2.substring(1);
                            Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring);
                            if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || Mp.M0(strConcat2, '.', length - 1, 4) == -1)) {
                                zB = true;
                            } else {
                                zB = false;
                            }
                        }
                    }
                    if (zB) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Tf.j("host", str);
        Tf.j("session", sSLSession);
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return b(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
