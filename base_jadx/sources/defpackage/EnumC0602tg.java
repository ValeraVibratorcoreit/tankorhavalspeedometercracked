package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0602tg {
    private static final /* synthetic */ EnumC0602tg[] $VALUES;
    public static final C0540rg Companion;
    public static final EnumC0602tg ON_ANY;
    public static final EnumC0602tg ON_CREATE;
    public static final EnumC0602tg ON_DESTROY;
    public static final EnumC0602tg ON_PAUSE;
    public static final EnumC0602tg ON_RESUME;
    public static final EnumC0602tg ON_START;
    public static final EnumC0602tg ON_STOP;

    static {
        EnumC0602tg enumC0602tg = new EnumC0602tg("ON_CREATE", 0);
        ON_CREATE = enumC0602tg;
        EnumC0602tg enumC0602tg2 = new EnumC0602tg("ON_START", 1);
        ON_START = enumC0602tg2;
        EnumC0602tg enumC0602tg3 = new EnumC0602tg("ON_RESUME", 2);
        ON_RESUME = enumC0602tg3;
        EnumC0602tg enumC0602tg4 = new EnumC0602tg("ON_PAUSE", 3);
        ON_PAUSE = enumC0602tg4;
        EnumC0602tg enumC0602tg5 = new EnumC0602tg("ON_STOP", 4);
        ON_STOP = enumC0602tg5;
        EnumC0602tg enumC0602tg6 = new EnumC0602tg("ON_DESTROY", 5);
        ON_DESTROY = enumC0602tg6;
        EnumC0602tg enumC0602tg7 = new EnumC0602tg("ON_ANY", 6);
        ON_ANY = enumC0602tg7;
        $VALUES = new EnumC0602tg[]{enumC0602tg, enumC0602tg2, enumC0602tg3, enumC0602tg4, enumC0602tg5, enumC0602tg6, enumC0602tg7};
        Companion = new C0540rg();
    }

    public static EnumC0602tg valueOf(String str) {
        return (EnumC0602tg) Enum.valueOf(EnumC0602tg.class, str);
    }

    public static EnumC0602tg[] values() {
        return (EnumC0602tg[]) $VALUES.clone();
    }

    public final EnumC0633ug a() {
        switch (AbstractC0571sg.a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0633ug.c;
            case 3:
            case 4:
                return EnumC0633ug.d;
            case 5:
                return EnumC0633ug.e;
            case 6:
                return EnumC0633ug.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
