package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0378m8 {
    public static final EnumC0378m8 a;
    public static final EnumC0378m8 b;
    public static final EnumC0378m8 c;
    public static final /* synthetic */ EnumC0378m8[] d;

    static {
        EnumC0378m8 enumC0378m8 = new EnumC0378m8("PREFER_ARGB_8888", 0);
        a = enumC0378m8;
        EnumC0378m8 enumC0378m9 = new EnumC0378m8("PREFER_RGB_565", 1);
        b = enumC0378m9;
        d = new EnumC0378m8[]{enumC0378m8, enumC0378m9};
        c = enumC0378m8;
    }

    public static EnumC0378m8 valueOf(String str) {
        return (EnumC0378m8) Enum.valueOf(EnumC0378m8.class, str);
    }

    public static EnumC0378m8[] values() {
        return (EnumC0378m8[]) d.clone();
    }
}
