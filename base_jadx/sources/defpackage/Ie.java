package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Ie extends AbstractC0273iq {
    public final /* synthetic */ Te e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ie(String str, Te te, long j) {
        super(str, true);
        this.e = te;
        this.f = j;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        Te te;
        boolean z;
        synchronized (this.e) {
            te = this.e;
            long j = te.n;
            long j2 = te.m;
            if (j < j2) {
                z = true;
            } else {
                te.m = j2 + 1;
                z = false;
            }
        }
        if (z) {
            te.n(2, 2, null);
            return -1L;
        }
        try {
            te.y.z(1, 0, false);
        } catch (IOException e) {
            te.n(2, 2, e);
        }
        return this.f;
    }
}
