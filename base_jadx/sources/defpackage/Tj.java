package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Tj extends AbstractC0293jg implements InterfaceC0107dd {
    public final /* synthetic */ int b;
    public final /* synthetic */ C0021ak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Tj(C0021ak c0021ak, int i) {
        super(0);
        this.b = i;
        this.c = c0021ak;
    }

    @Override // defpackage.InterfaceC0107dd
    public final Object a() {
        switch (this.b) {
            case 0:
                this.c.b();
                break;
            case 1:
                this.c.a();
                break;
            default:
                this.c.b();
                break;
        }
        return C0473pa.m;
    }
}
