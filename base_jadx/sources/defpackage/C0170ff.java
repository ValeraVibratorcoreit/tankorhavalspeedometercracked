package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170ff {
    public final /* synthetic */ int a;
    public int b;
    public final ArrayList c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public C0170ff(I0 i0, Vi vi, Dl dl, C0473pa c0473pa) {
        List listL;
        this.a = 1;
        Tf.j("address", i0);
        Tf.j("routeDatabase", vi);
        Tf.j("call", dl);
        Tf.j("eventListener", c0473pa);
        this.f = i0;
        this.g = vi;
        this.h = dl;
        this.i = c0473pa;
        Sa sa = Sa.a;
        this.d = sa;
        this.e = sa;
        this.c = new ArrayList();
        C0201gf c0201gf = i0.a;
        Tf.j("url", c0201gf);
        URI uriF = c0201gf.f();
        if (uriF.getHost() == null) {
            listL = Rr.l(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = i0.j.select(uriF);
            listL = (listSelect == null || listSelect.isEmpty()) ? Rr.l(Proxy.NO_PROXY) : Rr.w(listSelect);
        }
        this.d = listL;
        this.b = 0;
    }

    public C0201gf a() {
        ArrayList arrayList;
        String str = (String) this.d;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strQ = C0225h8.q((String) this.e, 0, 0, false, 7);
        String strQ2 = C0225h8.q((String) this.f, 0, 0, false, 7);
        String str2 = (String) this.g;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(AbstractC0376m6.u0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0225h8.q((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC0376m6.u0(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C0225h8.q(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.h;
        return new C0201gf(str, strQ, strQ2, str2, iB, arrayList3, arrayList, str4 != null ? C0225h8.q(str4, 0, 0, false, 7) : null, toString());
    }

    public int b() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.d;
        Tf.f(str);
        int iHashCode = str.hashCode();
        if (iHashCode != 3213448) {
            if (iHashCode == 99617003 && str.equals("https")) {
                return 443;
            }
        } else if (str.equals("http")) {
            return 80;
        }
        return -1;
    }

    public boolean c() {
        return (this.b < ((List) this.d).size()) || (this.c.isEmpty() ^ true);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x021c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0224  */
    /* JADX WARN: Code duplicated, block: B:108:0x0229 A[LOOP:4: B:108:0x0229->B:218:?, LOOP_START, PHI: r5
      0x0229: PHI (r5v19 int) = (r5v12 int), (r5v20 int) binds: [B:106:0x0226, B:218:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x022c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0240  */
    /* JADX WARN: Code duplicated, block: B:127:0x0277  */
    /* JADX WARN: Code duplicated, block: B:130:0x027d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0283  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:213:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0234 A[EDGE_INSN: B:215:0x0234->B:112:0x0234 BREAK  A[LOOP:4: B:108:0x0229->B:218:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x0022  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0149  */
    /* JADX WARN: Code duplicated, block: B:80:0x014e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public void d(C0201gf c0201gf, String str) {
        int i;
        byte b;
        byte b2;
        int i2;
        int iG;
        byte bCharAt;
        ArrayList arrayList;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        byte b3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        char cCharAt2;
        byte[] bArr = Rr.a;
        int iN = Rr.n(str, 0, str.length());
        int iO = Rr.o(str, iN, str.length());
        byte b4 = -1;
        if (iO - iN >= 2) {
            char cCharAt3 = str.charAt(iN);
            char c = 'a';
            if ((Tf.k(cCharAt3, 97) >= 0 && Tf.k(cCharAt3, 122) <= 0) || (Tf.k(cCharAt3, 65) >= 0 && Tf.k(cCharAt3, 90) <= 0)) {
                i = iN + 1;
                while (true) {
                    if (i < iO) {
                        char cCharAt4 = str.charAt(i);
                        if ((c > cCharAt4 || 'z' < cCharAt4) && (('A' > cCharAt4 || 'Z' < cCharAt4) && (('0' > cCharAt4 || '9' < cCharAt4) && cCharAt4 != '+' && cCharAt4 != '-' && cCharAt4 != '.'))) {
                            if (cCharAt4 == ':') {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            i++;
                            c = 'a';
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        if (i != -1) {
            if (Mp.T0(str, "https:", iN, true)) {
                this.d = "https";
                iN += 6;
            } else {
                if (!Mp.T0(str, "http:", iN, true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str.substring(0, i);
                    Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
                    sb.append(strSubstring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.d = "http";
                iN += 5;
            }
        } else {
            if (c0201gf == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            this.d = c0201gf.b;
        }
        int i10 = iN;
        int i11 = 0;
        while (true) {
            b = 47;
            b2 = 92;
            if (i10 >= iO || !((cCharAt2 = str.charAt(i10)) == '\\' || cCharAt2 == '/')) {
                break;
            }
            i11++;
            i10++;
        }
        ArrayList arrayList4 = this.c;
        byte b5 = 63;
        byte b6 = 35;
        if (i11 >= 2 || c0201gf == null) {
            i2 = iN + i11;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                iG = Rr.g(str, i2, "@/\\?#", iO);
                if (iG != iO) {
                    bCharAt = str.charAt(iG);
                } else {
                    bCharAt = b4;
                }
                if (bCharAt == b4 || bCharAt == b6 || bCharAt == b || bCharAt == b2 || bCharAt == b5) {
                    break;
                }
                if (bCharAt != 64) {
                    b3 = b5;
                    arrayList4 = arrayList4;
                    str3 = str3;
                } else {
                    if (z2) {
                        i9 = iG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((String) this.f);
                        sb2.append("%40");
                        b3 = b5;
                        sb2.append(C0225h8.g(str, i2, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240));
                        this.f = sb2.toString();
                    } else {
                        int iF = Rr.f(str, ':', i2, iG);
                        int i12 = i2;
                        byte b7 = b5;
                        i9 = iG;
                        String strG = C0225h8.g(str, i12, iF, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        if (z3) {
                            strG = ((String) this.e) + "%40" + strG;
                        }
                        this.e = strG;
                        if (iF != i9) {
                            this.f = C0225h8.g(str, iF + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            z2 = true;
                        }
                        z3 = true;
                        b3 = b7;
                    }
                    i2 = i9 + 1;
                }
                b5 = b3;
                arrayList4 = arrayList4;
                str3 = str3;
                b2 = 92;
                b = 47;
                b6 = 35;
                b4 = -1;
            }
            arrayList = arrayList4;
            str2 = str3;
            i3 = i2;
            while (true) {
                if (i3 >= iG) {
                    cCharAt = str.charAt(i3);
                    if (cCharAt != ':') {
                        i4 = i3;
                        break;
                    }
                    if (cCharAt != '[') {
                        do {
                            i3++;
                            if (i3 < iG) {
                                break;
                            }
                        } while (str.charAt(i3) != ']');
                    }
                    i3++;
                } else {
                    i4 = iG;
                    break;
                }
            }
            i5 = i4 + 1;
            if (i5 < iG) {
                this.g = Tf.b0(C0225h8.q(str, i2, i4, false, 4));
                i7 = i4;
                try {
                    i8 = Integer.parseInt(C0225h8.g(str, i5, iG, "", false, false, false, false, 248));
                    if (1 <= i8 || 65535 < i8) {
                        i8 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.b = i8;
                if (i8 != -1) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i5, iG);
                    Tf.i(str2, strSubstring2);
                    sb3.append(strSubstring2);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                i6 = i7;
                z = false;
            } else {
                i6 = i4;
                z = false;
                this.g = Tf.b0(C0225h8.q(str, i2, i6, false, 4));
                String str4 = (String) this.d;
                Tf.f(str4);
                this.b = C0225h8.k(str4);
            }
            if (((String) this.g) != null) {
                StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i2, i6);
                Tf.i(str2, strSubstring3);
                sb4.append(strSubstring3);
                sb4.append('\"');
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            iN = iG;
        } else if (!Tf.b(c0201gf.b, (String) this.d)) {
            i2 = iN + i11;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                iG = Rr.g(str, i2, "@/\\?#", iO);
                if (iG != iO) {
                    bCharAt = str.charAt(iG);
                } else {
                    bCharAt = b4;
                }
                if (bCharAt == b4) {
                    break;
                } else {
                    break;
                }
                b5 = b3;
                arrayList4 = arrayList4;
                str3 = str3;
                b2 = 92;
                b = 47;
                b6 = 35;
                b4 = -1;
            }
            arrayList = arrayList4;
            str2 = str3;
            i3 = i2;
            while (true) {
                if (i3 >= iG) {
                    cCharAt = str.charAt(i3);
                    if (cCharAt != ':') {
                        i4 = i3;
                        break;
                    }
                    if (cCharAt != '[') {
                        do {
                            i3++;
                            if (i3 < iG) {
                                break;
                                break;
                            }
                        } while (str.charAt(i3) != ']');
                    }
                    i3++;
                } else {
                    i4 = iG;
                    break;
                }
            }
            i5 = i4 + 1;
            if (i5 < iG) {
                this.g = Tf.b0(C0225h8.q(str, i2, i4, false, 4));
                i7 = i4;
                i8 = Integer.parseInt(C0225h8.g(str, i5, iG, "", false, false, false, false, 248));
                if (1 <= i8) {
                    i8 = -1;
                } else {
                    i8 = -1;
                }
                this.b = i8;
                if (i8 != -1) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring4 = str.substring(i5, iG);
                    Tf.i(str2, strSubstring4);
                    sb5.append(strSubstring4);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                i6 = i7;
                z = false;
            } else {
                i6 = i4;
                z = false;
                this.g = Tf.b0(C0225h8.q(str, i2, i6, false, 4));
                String str5 = (String) this.d;
                Tf.f(str5);
                this.b = C0225h8.k(str5);
            }
            if (((String) this.g) != null) {
                StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                String strSubstring5 = str.substring(i2, i6);
                Tf.i(str2, strSubstring5);
                sb6.append(strSubstring5);
                sb6.append('\"');
                throw new IllegalArgumentException(sb6.toString().toString());
            }
            iN = iG;
        } else {
            this.e = c0201gf.e();
            this.f = c0201gf.a();
            this.g = c0201gf.e;
            this.b = c0201gf.f;
            arrayList4.clear();
            arrayList4.addAll(c0201gf.c());
            if (iN == iO || str.charAt(iN) == '#') {
                String strD = c0201gf.d();
                this.i = strD != null ? C0225h8.v(C0225h8.g(strD, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
            }
            arrayList = arrayList4;
            z = false;
        }
        int iG2 = Rr.g(str, iN, "?#", iO);
        if (iN != iG2) {
            char cCharAt5 = str.charAt(iN);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList2 = arrayList;
                arrayList2.clear();
                arrayList2.add("");
                iN++;
            } else {
                arrayList2 = arrayList;
                arrayList2.set(arrayList.size() - 1, "");
            }
            while (iN < iG2) {
                int iG3 = Rr.g(str, iN, "/\\", iG2);
                boolean z6 = iG3 < iG2 ? true : z;
                ArrayList arrayList5 = arrayList2;
                String strG2 = C0225h8.g(str, iN, iG3, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                if (strG2.equals(".") || strG2.equalsIgnoreCase("%2e")) {
                    arrayList3 = arrayList5;
                } else if (strG2.equals("..") || strG2.equalsIgnoreCase("%2e.") || strG2.equalsIgnoreCase(".%2e") || strG2.equalsIgnoreCase("%2e%2e")) {
                    arrayList3 = arrayList5;
                    if (((String) arrayList3.remove(arrayList3.size() - 1)).length() == 0 && (!arrayList3.isEmpty())) {
                        arrayList3.set(arrayList3.size() - 1, "");
                    } else {
                        arrayList3.add("");
                    }
                } else {
                    arrayList3 = arrayList5;
                    if (((CharSequence) arrayList3.get(arrayList5.size() - 1)).length() == 0) {
                        arrayList3.set(arrayList3.size() - 1, strG2);
                    } else {
                        arrayList3.add(strG2);
                    }
                    if (z6) {
                        arrayList3.add("");
                    }
                }
                iN = z6 ? iG3 + 1 : iG3;
                arrayList2 = arrayList3;
            }
        }
        if (iG2 < iO && str.charAt(iG2) == '?') {
            int iF2 = Rr.f(str, '#', iG2, iO);
            this.i = C0225h8.v(C0225h8.g(str, iG2 + 1, iF2, " \"'<>#", true, false, true, false, 208));
            iG2 = iF2;
        }
        if (iG2 >= iO || str.charAt(iG2) != '#') {
            return;
        }
        this.h = C0225h8.g(str, iG2 + 1, iO, "", true, false, false, true, 176);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.d;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.e).length() > 0 || ((String) this.f).length() > 0) {
                    sb.append((String) this.e);
                    if (((String) this.f).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.g;
                if (str2 != null) {
                    if (Mp.C0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.g);
                        sb.append(']');
                    } else {
                        sb.append((String) this.g);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.d) != null) {
                    int iB = b();
                    String str3 = (String) this.d;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iB);
                    } else {
                        int iHashCode = str3.hashCode();
                        if (iHashCode != 3213448) {
                            if (iHashCode == 99617003 && str3.equals("https")) {
                                i = 443;
                            }
                        } else if (str3.equals("http")) {
                            i = 80;
                        }
                        if (iB != i) {
                            sb.append(':');
                            sb.append(iB);
                        }
                    }
                }
                ArrayList arrayList = this.c;
                Tf.j("$this$toPathString", arrayList);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    Tf.f(arrayList2);
                    Nf nfM = Td.M(Td.O(0, arrayList2.size()), 2);
                    int i3 = nfM.a;
                    int i4 = nfM.b;
                    int i5 = nfM.c;
                    if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i3);
                            String str5 = (String) arrayList2.get(i3 + 1);
                            if (i3 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append('=');
                                sb.append(str5);
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.h) != null) {
                    sb.append('#');
                    sb.append((String) this.h);
                }
                String string = sb.toString();
                Tf.i("StringBuilder().apply(builderAction).toString()", string);
                return string;
            default:
                return super.toString();
        }
    }

    public C0170ff() {
        this.a = 0;
        this.e = "";
        this.f = "";
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }
}
