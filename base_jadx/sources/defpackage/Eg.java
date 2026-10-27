package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Eg {
    public EnumC0633ug a;
    public InterfaceC0788zg b;

    public final void a(Dg dg, EnumC0602tg enumC0602tg) {
        EnumC0633ug enumC0633ugA = enumC0602tg.a();
        EnumC0633ug enumC0633ug = this.a;
        Tf.j("state1", enumC0633ug);
        if (enumC0633ugA.compareTo(enumC0633ug) < 0) {
            enumC0633ug = enumC0633ugA;
        }
        this.a = enumC0633ug;
        this.b.n(dg, enumC0602tg);
        this.a = enumC0633ugA;
    }
}
