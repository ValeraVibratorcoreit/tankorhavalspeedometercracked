package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class J1 {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static C0325kh b(Configuration configuration) {
        return C0325kh.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(C0325kh c0325kh) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c0325kh.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, C0325kh c0325kh) {
        configuration.setLocales(LocaleList.forLanguageTags(c0325kh.a.a.toLanguageTags()));
    }
}
