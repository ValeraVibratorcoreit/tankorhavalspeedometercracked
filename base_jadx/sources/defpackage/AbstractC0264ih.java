package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0264ih {
    public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = a;
        for (Locale locale3 : localeArr) {
            if (locale3.equals(locale)) {
                return false;
            }
        }
        for (Locale locale4 : localeArr) {
            if (locale4.equals(locale2)) {
                return false;
            }
        }
        String strC = AbstractC0292jf.c(AbstractC0292jf.a(AbstractC0292jf.b(locale)));
        if (!strC.isEmpty()) {
            return strC.equals(AbstractC0292jf.c(AbstractC0292jf.a(AbstractC0292jf.b(locale2))));
        }
        String country = locale.getCountry();
        return country.isEmpty() || country.equals(locale2.getCountry());
    }
}
