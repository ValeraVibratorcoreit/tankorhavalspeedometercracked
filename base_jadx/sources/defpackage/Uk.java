package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Uk {
    public static final Uk a;
    public static final Uk b;
    public static final Uk c;
    public static final Uk d;
    public static final /* synthetic */ Uk[] e;

    static {
        Uk uk = new Uk("IMMEDIATE", 0);
        a = uk;
        Uk uk2 = new Uk("HIGH", 1);
        b = uk2;
        Uk uk3 = new Uk("NORMAL", 2);
        c = uk3;
        Uk uk4 = new Uk("LOW", 3);
        d = uk4;
        e = new Uk[]{uk, uk2, uk3, uk4};
    }

    public static Uk valueOf(String str) {
        return (Uk) Enum.valueOf(Uk.class, str);
    }

    public static Uk[] values() {
        return (Uk[]) e.clone();
    }
}
