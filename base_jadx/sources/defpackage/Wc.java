package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Wc {
    public static final Wc a;
    public static final Wc b;
    public static final Wc c;
    public static final /* synthetic */ Wc[] d;

    /* JADX INFO: Fake field, exist only in values array */
    Wc EF0;

    static {
        Wc wc = new Wc("PENALTY_LOG", 0);
        Wc wc2 = new Wc("PENALTY_DEATH", 1);
        Wc wc3 = new Wc("DETECT_FRAGMENT_REUSE", 2);
        a = wc3;
        Wc wc4 = new Wc("DETECT_FRAGMENT_TAG_USAGE", 3);
        b = wc4;
        Wc wc5 = new Wc("DETECT_RETAIN_INSTANCE_USAGE", 4);
        Wc wc6 = new Wc("DETECT_SET_USER_VISIBLE_HINT", 5);
        Wc wc7 = new Wc("DETECT_TARGET_FRAGMENT_USAGE", 6);
        Wc wc8 = new Wc("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        c = wc8;
        d = new Wc[]{wc, wc2, wc3, wc4, wc5, wc6, wc7, wc8};
    }

    public static Wc valueOf(String str) {
        return (Wc) Enum.valueOf(Wc.class, str);
    }

    public static Wc[] values() {
        return (Wc[]) d.clone();
    }
}
