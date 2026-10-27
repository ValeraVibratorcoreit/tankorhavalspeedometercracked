package defpackage;

/* JADX INFO: renamed from: dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0111dh extends AbstractC0141eh implements InterfaceC0788zg {
    public final Dg e;
    public final /* synthetic */ C0451oj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111dh(C0451oj c0451oj, Dg dg, Mj mj) {
        super(c0451oj, mj);
        this.f = c0451oj;
        this.e = dg;
    }

    @Override // defpackage.AbstractC0141eh
    public final void b() {
        this.e.getLifecycle().b(this);
    }

    @Override // defpackage.AbstractC0141eh
    public final boolean c(Dg dg) {
        return this.e == dg;
    }

    @Override // defpackage.AbstractC0141eh
    public final boolean d() {
        return ((Fg) this.e.getLifecycle()).c.a(EnumC0633ug.d);
    }

    @Override // defpackage.InterfaceC0788zg
    public final void n(Dg dg, EnumC0602tg enumC0602tg) {
        Dg dg2 = this.e;
        EnumC0633ug enumC0633ug = ((Fg) dg2.getLifecycle()).c;
        if (enumC0633ug != EnumC0633ug.a) {
            EnumC0633ug enumC0633ug2 = null;
            while (enumC0633ug2 != enumC0633ug) {
                a(d());
                enumC0633ug2 = enumC0633ug;
                enumC0633ug = ((Fg) dg2.getLifecycle()).c;
            }
            return;
        }
        C0451oj c0451oj = this.f;
        c0451oj.getClass();
        C0451oj.a("removeObserver");
        AbstractC0141eh abstractC0141eh = (AbstractC0141eh) c0451oj.b.b(this.a);
        if (abstractC0141eh == null) {
            return;
        }
        abstractC0141eh.b();
        abstractC0141eh.a(false);
    }
}
