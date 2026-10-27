package defpackage;

/* JADX INFO: renamed from: j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0276j extends AbstractC0293jg implements InterfaceC0445od {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0276j() {
        super(1);
        this.b = 1;
        this.c = C0.b;
    }

    @Override // defpackage.InterfaceC0445od
    public final Object c(Object obj) {
        switch (this.b) {
            case 0:
                return obj == ((AbstractC0400n) this.c) ? "(this Collection)" : String.valueOf(obj);
            default:
                Tf.j("it", obj);
                return ((InterfaceC0107dd) this.c).a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0276j(AbstractC0400n abstractC0400n) {
        super(1);
        this.b = 0;
        this.c = abstractC0400n;
    }
}
