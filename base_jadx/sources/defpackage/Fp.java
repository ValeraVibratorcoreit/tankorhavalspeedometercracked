package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fp extends Br {
    /* JADX WARN: Code duplicated, block: B:18:0x0090 A[PHI: r9
      0x0090: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v3 java.lang.String) binds: [B:17:0x008e, B:39:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    public static String B0(String str) {
        Tf.j("<this>", str);
        if (!(!Mp.L0("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        Mp.R0(0);
        List listAsList = Arrays.asList("\r\n", "\n", "\r");
        Tf.i("asList(this)", listAsList);
        U8<Pf> u8 = new U8(str, 0, 0, new Lp(listAsList, false, 1));
        ArrayList arrayList = new ArrayList();
        for (Pf pf : u8) {
            Tf.j("it", pf);
            arrayList.add(str.subSequence(pf.a, pf.b + 1).toString());
        }
        List listT0 = AbstractC0345l6.t0(arrayList);
        int length = str.length();
        listT0.size();
        int iS0 = AbstractC0345l6.s0(listT0);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listT0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iS0) && Mp.L0(str2)) {
                str2 = strSubstring;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    char cCharAt = str2.charAt(i3);
                    if (!(Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && Mp.T0(str2, "|", i3, false)) {
                    strSubstring = str2.substring(i3 + 1);
                    Tf.i("this as java.lang.String).substring(startIndex)", strSubstring);
                }
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0314k6.w0(arrayList2, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        Tf.i("mapIndexedNotNull { inde…\"\\n\")\n        .toString()", string);
        return string;
    }
}
