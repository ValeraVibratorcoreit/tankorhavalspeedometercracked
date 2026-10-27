package defpackage;

/* JADX INFO: renamed from: rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540rg {
    public static EnumC0602tg a(EnumC0633ug enumC0633ug) {
        Tf.j("state", enumC0633ug);
        int iOrdinal = enumC0633ug.ordinal();
        if (iOrdinal == 1) {
            return EnumC0602tg.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC0602tg.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC0602tg.ON_RESUME;
    }
}
