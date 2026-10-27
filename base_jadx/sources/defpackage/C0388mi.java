package defpackage;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0388mi {
    public static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String[] b;

    public C0388mi(String str, String[] strArr) {
        this.a = str;
        this.b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.b;
        Tf.j("<this>", strArr);
        Nf nfM = Td.M(new Pf(0, strArr.length - 1, 1), 2);
        int i = nfM.a;
        int i2 = nfM.b;
        int i3 = nfM.c;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (true) {
                if (!Mp.F0(strArr[i], "charset")) {
                    if (i == i2) {
                        str = null;
                        break;
                    }
                    i += i3;
                } else {
                    str = strArr[i + 1];
                    break;
                }
            }
        } else {
            str = null;
            break;
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0388mi) && Tf.b(((C0388mi) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
