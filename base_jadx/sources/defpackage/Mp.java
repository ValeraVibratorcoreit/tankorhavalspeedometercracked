package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Mp extends Kp {
    public static boolean C0(CharSequence charSequence, char c) {
        Tf.j("<this>", charSequence);
        return I0(charSequence, c, 0, false, 2) >= 0;
    }

    public static boolean D0(CharSequence charSequence, String str) {
        Tf.j("<this>", charSequence);
        return J0(charSequence, str, 0, false, 2) >= 0;
    }

    public static boolean E0(String str, String str2) {
        Tf.j("<this>", str);
        return str.endsWith(str2);
    }

    public static boolean F0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final int G0(CharSequence charSequence) {
        Tf.j("<this>", charSequence);
        return charSequence.length() - 1;
    }

    public static final int H0(CharSequence charSequence, String str, int i, boolean z) {
        Tf.j("<this>", charSequence);
        Tf.j("string", str);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        Pf pf = new Pf(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = pf.b;
        if (!z2) {
            if (i <= i2) {
                while (!O0(str, 0, charSequence, i, str.length(), z)) {
                    if (i != i2) {
                        i++;
                    }
                }
                return i;
            }
            return -1;
        }
        if (i <= i2) {
            while (!N0(0, i, str.length(), str, (String) charSequence, z)) {
                if (i != i2) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public static int I0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        Tf.j("<this>", charSequence);
        return (z || !(charSequence instanceof String)) ? K0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int J0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return H0(charSequence, str, i, z);
    }

    public static final int K0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int i2;
        Tf.j("<this>", charSequence);
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC0158f3.U(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int i3 = new Pf(i, G0(charSequence), 1).b;
        boolean z2 = i <= i3;
        if (!z2) {
            i = i3;
        }
        while (z2) {
            if (i != i3) {
                i2 = i + 1;
            } else {
                if (!z2) {
                    throw new NoSuchElementException();
                }
                i2 = i;
                z2 = false;
            }
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (F4.w(c, cCharAt, z)) {
                    return i;
                }
            }
            i = i2;
        }
        return -1;
    }

    public static final boolean L0(String str) {
        Tf.j("<this>", str);
        if (str.length() == 0) {
            return true;
        }
        Iterable pf = new Pf(0, str.length() - 1, 1);
        if ((pf instanceof Collection) && ((Collection) pf).isEmpty()) {
            return true;
        }
        Iterator it = pf.iterator();
        while (((Of) it).c) {
            char cCharAt = str.charAt(((Of) it).a());
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static int M0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = G0(charSequence);
        }
        Tf.j("<this>", charSequence);
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC0158f3.U(cArr), i);
        }
        int iG0 = G0(charSequence);
        if (i > iG0) {
            i = iG0;
        }
        while (-1 < i) {
            if (F4.w(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final boolean N0(int i, int i2, int i3, String str, String str2, boolean z) {
        Tf.j("<this>", str);
        Tf.j("other", str2);
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean O0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        Tf.j("<this>", charSequence);
        Tf.j("other", charSequence2);
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!F4.w(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String P0(String str, String str2) {
        if (!U0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        Tf.i("this as java.lang.String).substring(startIndex)", strSubstring);
        return strSubstring;
    }

    public static String Q0(String str, String str2, String str3) {
        Tf.j("<this>", str);
        int iH0 = H0(str, str2, 0, false);
        if (iH0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iH0);
            sb.append(str3);
            i2 = iH0 + length;
            if (iH0 >= str.length()) {
                break;
            }
            iH0 = H0(str, str2, iH0 + i, false);
        } while (iH0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        Tf.i("stringBuilder.append(this, i, length).toString()", string);
        return string;
    }

    public static final void R0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(Vo.e(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static List S0(CharSequence charSequence, char[] cArr) {
        Tf.j("<this>", charSequence);
        boolean z = false;
        if (cArr.length != 1) {
            R0(0);
            U8<Pf> u8 = new U8(charSequence, 0, 0, new Lp(cArr, z, 0));
            ArrayList arrayList = new ArrayList(AbstractC0376m6.u0(new Gn(u8)));
            for (Pf pf : u8) {
                Tf.j("range", pf);
                arrayList.add(charSequence.subSequence(pf.a, pf.b + 1).toString());
            }
            return arrayList;
        }
        String strValueOf = String.valueOf(cArr[0]);
        R0(0);
        int iH0 = H0(charSequence, strValueOf, 0, false);
        if (iH0 == -1) {
            return Ud.R(charSequence.toString());
        }
        ArrayList arrayList2 = new ArrayList(10);
        int length = 0;
        do {
            arrayList2.add(charSequence.subSequence(length, iH0).toString());
            length = strValueOf.length() + iH0;
            iH0 = H0(charSequence, strValueOf, length, false);
        } while (iH0 != -1);
        arrayList2.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList2;
    }

    public static boolean T0(String str, String str2, int i, boolean z) {
        Tf.j("<this>", str);
        return !z ? str.startsWith(str2, i) : N0(i, 0, str2.length(), str, str2, z);
    }

    public static boolean U0(String str, String str2, boolean z) {
        Tf.j("<this>", str);
        Tf.j("prefix", str2);
        return !z ? str.startsWith(str2) : N0(0, 0, str2.length(), str, str2, z);
    }

    public static String V0(String str) {
        Tf.j("<this>", str);
        Tf.j("missingDelimiterValue", str);
        int iM0 = M0(str, '.', 0, 6);
        if (iM0 == -1) {
            return str;
        }
        String strSubstring = str.substring(iM0 + 1, str.length());
        Tf.i("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public static CharSequence W0(CharSequence charSequence) {
        Tf.j("<this>", charSequence);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = charSequence.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
