package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Tk {
    public static final Tk a;
    public static final /* synthetic */ Tk[] b;

    /* JADX INFO: Fake field, exist only in values array */
    Tk EF0;

    static {
        Tk tk = new Tk("SRGB", 0);
        Tk tk2 = new Tk("DISPLAY_P3", 1);
        a = tk2;
        b = new Tk[]{tk, tk2};
    }

    public static Tk valueOf(String str) {
        return (Tk) Enum.valueOf(Tk.class, str);
    }

    public static Tk[] values() {
        return (Tk[]) b.clone();
    }
}
