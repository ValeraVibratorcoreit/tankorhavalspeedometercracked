package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201gf {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final String h;
    public final String i;

    public C0201gf(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        Tf.j("scheme", str);
        Tf.j("host", str4);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.a = str.equals("https");
    }

    public final String a() {
        if (this.d.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.i;
        int iI0 = Mp.I0(str, ':', length, false, 4) + 1;
        int iI1 = Mp.I0(str, '@', 0, false, 6);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iI0, iI1);
        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String b() {
        int length = this.b.length() + 3;
        String str = this.i;
        int iI0 = Mp.I0(str, '/', length, false, 4);
        String strSubstring = str.substring(iI0, Rr.g(str, iI0, "?#", str.length()));
        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.b.length() + 3;
        String str = this.i;
        int iI0 = Mp.I0(str, '/', length, false, 4);
        int iG = Rr.g(str, iI0, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (iI0 < iG) {
            int i = iI0 + 1;
            int iF = Rr.f(str, '/', i, iG);
            String strSubstring = str.substring(i, iF);
            Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
            arrayList.add(strSubstring);
            iI0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iI0 = Mp.I0(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iI0, Rr.f(str, '#', iI0, str.length()));
        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String e() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.i;
        int iG = Rr.g(str, length, ":@", str.length());
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(length, iG);
        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0201gf) && Tf.b(((C0201gf) obj).i, this.i);
    }

    public final URI f() {
        String strSubstring;
        String strReplaceAll;
        C0170ff c0170ff = new C0170ff();
        String str = this.b;
        c0170ff.d = str;
        c0170ff.e = e();
        c0170ff.f = a();
        c0170ff.g = this.e;
        int iK = C0225h8.k(str);
        int i = this.f;
        if (i == iK) {
            i = -1;
        }
        c0170ff.b = i;
        ArrayList arrayList = c0170ff.c;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        c0170ff.i = strD != null ? C0225h8.v(C0225h8.g(strD, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str2 = this.i;
            int iI0 = Mp.I0(str2, '#', 0, false, 6) + 1;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring = str2.substring(iI0);
            Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring);
        }
        c0170ff.h = strSubstring;
        String str3 = (String) c0170ff.g;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            Tf.i("compile(pattern)", patternCompile);
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            Tf.i("nativePattern.matcher(in…).replaceAll(replacement)", strReplaceAll);
        } else {
            strReplaceAll = null;
        }
        c0170ff.g = strReplaceAll;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, C0225h8.g((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = (ArrayList) c0170ff.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str4 != null ? C0225h8.g(str4, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str5 = (String) c0170ff.h;
        c0170ff.h = str5 != null ? C0225h8.g(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = c0170ff.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                Tf.i("compile(pattern)", patternCompile2);
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                Tf.i("nativePattern.matcher(in…).replaceAll(replacement)", strReplaceAll2);
                URI uriCreate = URI.create(strReplaceAll2);
                Tf.i("try {\n        val stripp…e) // Unexpected!\n      }", uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
