package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0139ef {
    static {
        C0129e5 c0129e5 = C0129e5.d;
        C0473pa.t("\"\\");
        C0473pa.t("\t ,=");
    }

    public static final boolean a(C0117dn c0117dn) {
        if (Tf.b((String) c0117dn.a.d, "HEAD")) {
            return false;
        }
        int i = c0117dn.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && Rr.k(c0117dn) == -1 && !"chunked".equalsIgnoreCase(C0117dn.n(c0117dn, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094 A[EDGE_INSN: B:27:0x0094->B:125:0x023d BREAK  A[LOOP:2: B:32:0x00bd->B:80:0x0187]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    public static final void b(C0473pa c0473pa, C0201gf c0201gf, C0569se c0569se) {
        List list;
        K7 k7;
        String str;
        int i = 1;
        Tf.j("$this$receiveHeaders", c0473pa);
        Tf.j("url", c0201gf);
        Tf.j("headers", c0569se);
        if (c0473pa == C0473pa.c) {
            return;
        }
        Pattern pattern = K7.j;
        int size = c0569se.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(c0569se.b(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(c0569se.d(i3));
            }
        }
        List listUnmodifiableList = Sa.a;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            Tf.i("Collections.unmodifiableList(result)", listUnmodifiableList2);
            list = listUnmodifiableList2;
        } else {
            list = listUnmodifiableList;
        }
        int size2 = list.size();
        ArrayList arrayList2 = null;
        for (int i4 = 0; i4 < size2; i4++) {
            String str2 = (String) list.get(i4);
            Tf.j("setCookie", str2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = Rr.a;
            char c = ';';
            int iF = Rr.f(str2, ';', i2, str2.length());
            char c2 = '=';
            int iF2 = Rr.f(str2, '=', i2, iF);
            if (iF2 == iF) {
                k7 = null;
                break;
            }
            String strY = Rr.y(str2, i2, iF2);
            if (strY.length() == 0 || Rr.m(strY) != -1) {
                k7 = null;
                i2 = 0;
                break;
            }
            String strY2 = Rr.y(str2, iF2 + i, iF);
            if (Rr.m(strY2) != -1) {
                k7 = null;
                i2 = 0;
                break;
            }
            int i5 = iF + i;
            int length = str2.length();
            long j = 253402300799999L;
            boolean z = i;
            long jV = 253402300799999L;
            String str3 = null;
            long j2 = -1;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = 0;
            String str4 = null;
            while (true) {
                if (i5 >= length) {
                    if (j2 == Long.MIN_VALUE) {
                        j = Long.MIN_VALUE;
                    } else if (j2 != -1) {
                        long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                        if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                            j = j3;
                        }
                    } else {
                        j = jV;
                    }
                    String str5 = c0201gf.e;
                    if (str3 == null) {
                        str3 = str5;
                    } else if (!Tf.b(str5, str3)) {
                        if (Mp.E0(str5, str3) && str5.charAt((str5.length() - str3.length()) - 1) == '.') {
                            C0454om c0454om = Rr.f;
                            c0454om.getClass();
                            if (!((Pattern) c0454om.b).matcher(str5).matches()) {
                            }
                        }
                        i2 = 0;
                        k7 = null;
                        break;
                    }
                    if (str5.length() != str3.length() && PublicSuffixDatabase.g.a(str3) == null) {
                        k7 = null;
                        i2 = 0;
                        break;
                    }
                    String strSubstring = "/";
                    String str6 = str4;
                    i2 = 0;
                    if (str6 == null || !Mp.U0(str6, "/", false)) {
                        String strB = c0201gf.b();
                        int iM0 = Mp.M0(strB, '/', 0, 6);
                        if (iM0 != 0) {
                            strSubstring = strB.substring(0, iM0);
                            Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
                        }
                        str = strSubstring;
                    } else {
                        str = str6;
                    }
                    k7 = new K7(strY, strY2, j, str3, str, z2, z3, z4, z);
                    break;
                }
                int iF3 = Rr.f(str2, c, i5, length);
                int iF4 = Rr.f(str2, c2, i5, iF3);
                String strY3 = Rr.y(str2, i5, iF4);
                String strY4 = iF4 < iF3 ? Rr.y(str2, iF4 + i, iF3) : "";
                if (strY3.equalsIgnoreCase("expires")) {
                    try {
                        jV = Br.V(strY4.length(), strY4);
                        z4 = i;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                        i = 1;
                    }
                } else if (strY3.equalsIgnoreCase("max-age")) {
                    try {
                        long j4 = Long.parseLong(strY4);
                        j2 = j4 > 0 ? j4 : Long.MIN_VALUE;
                    } catch (NumberFormatException e) {
                        Pattern patternCompile = Pattern.compile("-?\\d+");
                        Tf.i("compile(pattern)", patternCompile);
                        if (!patternCompile.matcher(strY4).matches()) {
                            throw e;
                        }
                        j2 = Mp.U0(strY4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                    }
                    i = 1;
                    z4 = 1;
                } else if (!strY3.equalsIgnoreCase("domain")) {
                    if (strY3.equalsIgnoreCase("path")) {
                        str4 = strY4;
                    } else if (strY3.equalsIgnoreCase("secure")) {
                        i = 1;
                        z2 = true;
                    } else if (strY3.equalsIgnoreCase("httponly")) {
                        i = 1;
                        z3 = true;
                    }
                    i = 1;
                } else {
                    if (!(!strY4.endsWith("."))) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    String strB0 = Tf.b0(Mp.P0(strY4, "."));
                    if (strB0 == null) {
                        throw new IllegalArgumentException();
                    }
                    str3 = strB0;
                    i = 1;
                    z = 0;
                }
                i5 = iF3 + 1;
                c = ';';
                c2 = '=';
                z4 = z4;
                z = z;
            }
            if (k7 != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(k7);
            }
            i = 1;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            Tf.i("Collections.unmodifiableList(cookies)", listUnmodifiableList);
        }
        listUnmodifiableList.isEmpty();
    }
}
