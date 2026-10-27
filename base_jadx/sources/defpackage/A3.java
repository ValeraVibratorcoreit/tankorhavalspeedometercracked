package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A3 implements InterfaceC0394mo, Vn, Tn {
    public final /* synthetic */ int a;
    public final /* synthetic */ E3 b;

    public /* synthetic */ A3(E3 e3, int i) {
        this.a = i;
        this.b = e3;
    }

    @Override // defpackage.Tn
    public void a(String str) {
        E3 e3 = this.b;
        e3.T().edit().putString("bgMode", str).apply();
        e3.n0();
        e3.k0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.InterfaceC0394mo
    public void b(String str) {
        boolean z;
        E3 e3 = this.b;
        e3.T.z = str;
        Wn wn = e3.X;
        if (!str.equals("Default")) {
            z = e3.T().getBoolean("useDefaultSwitchBack", true);
        }
        wn.setChecked(z);
        e3.n0();
        e3.V.notifyDataSetChanged();
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        switch (this.a) {
            case 1:
                E3 e3 = this.b;
                e3.T().edit().putBoolean("useDefaultSwitchBack", z).apply();
                e3.n0();
                e3.c0();
                break;
            default:
                this.b.T().edit().putBoolean("bg_sun_auto_update", z).apply();
                break;
        }
    }
}
