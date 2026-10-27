package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0325kh {
    public static final C0325kh b = new C0325kh(new C0356lh(AbstractC0294jh.a(new Locale[0])));
    public final C0356lh a;

    public C0325kh(C0356lh c0356lh) {
        this.a = c0356lh;
    }

    public static C0325kh a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC0264ih.a(strArrSplit[i]);
        }
        return new C0325kh(new C0356lh(AbstractC0294jh.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0325kh) {
            if (this.a.equals(((C0325kh) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
