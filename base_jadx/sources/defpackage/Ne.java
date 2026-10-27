package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Ne implements InterfaceC0107dd {
    public final We a;
    public final /* synthetic */ Te b;

    public Ne(Te te, We we) {
        this.b = te;
        this.a = we;
    }

    @Override // defpackage.InterfaceC0107dd
    public final Object a() {
        Te te = this.b;
        We we = this.a;
        try {
            we.w(this);
            do {
            } while (we.n(false, this));
            te.n(1, 9, null);
        } catch (IOException e) {
            te.n(2, 2, e);
        } finally {
            te.n(3, 3, null);
            Rr.d(we);
        }
        return C0473pa.m;
    }
}
