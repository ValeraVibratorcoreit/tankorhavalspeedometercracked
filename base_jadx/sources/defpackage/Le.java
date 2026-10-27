package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Le extends AbstractC0273iq {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Ne f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Le(String str, Ne ne, C0454om c0454om) {
        super(str, true);
        this.f = ne;
        this.g = c0454om;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        switch (this.e) {
            case 0:
                Te te = this.f.b;
                te.b.a(te, (C0087co) ((C0454om) this.g).b);
                break;
            default:
                try {
                    this.f.b.b.b((C0016af) this.g);
                } catch (IOException e) {
                    Gk gk = Gk.a;
                    Gk gk2 = Gk.a;
                    String str = "Http2Connection.Listener failure for " + this.f.b.d;
                    gk2.getClass();
                    Gk.i(4, str, e);
                    try {
                        ((C0016af) this.g).c(2, e);
                    } catch (IOException unused) {
                    }
                }
                break;
        }
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Le(String str, C0016af c0016af, Ne ne) {
        super(str, true);
        this.g = c0016af;
        this.f = ne;
    }
}
