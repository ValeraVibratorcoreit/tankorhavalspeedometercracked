package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Se extends AbstractC0273iq {
    public final /* synthetic */ Te e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Se(String str, Te te, int i, long j) {
        super(str, true);
        this.e = te;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        Te te = this.e;
        try {
            te.y.B(this.g, this.f);
            return -1L;
        } catch (IOException e) {
            te.w(e);
            return -1L;
        }
    }
}
