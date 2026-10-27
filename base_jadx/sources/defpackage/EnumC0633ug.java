package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0633ug {
    public static final EnumC0633ug a;
    public static final EnumC0633ug b;
    public static final EnumC0633ug c;
    public static final EnumC0633ug d;
    public static final EnumC0633ug e;
    public static final /* synthetic */ EnumC0633ug[] f;

    static {
        EnumC0633ug enumC0633ug = new EnumC0633ug("DESTROYED", 0);
        a = enumC0633ug;
        EnumC0633ug enumC0633ug2 = new EnumC0633ug("INITIALIZED", 1);
        b = enumC0633ug2;
        EnumC0633ug enumC0633ug3 = new EnumC0633ug("CREATED", 2);
        c = enumC0633ug3;
        EnumC0633ug enumC0633ug4 = new EnumC0633ug("STARTED", 3);
        d = enumC0633ug4;
        EnumC0633ug enumC0633ug5 = new EnumC0633ug("RESUMED", 4);
        e = enumC0633ug5;
        f = new EnumC0633ug[]{enumC0633ug, enumC0633ug2, enumC0633ug3, enumC0633ug4, enumC0633ug5};
    }

    public static EnumC0633ug valueOf(String str) {
        return (EnumC0633ug) Enum.valueOf(EnumC0633ug.class, str);
    }

    public static EnumC0633ug[] values() {
        return (EnumC0633ug[]) f.clone();
    }

    public final boolean a(EnumC0633ug enumC0633ug) {
        return compareTo(enumC0633ug) >= 0;
    }
}
