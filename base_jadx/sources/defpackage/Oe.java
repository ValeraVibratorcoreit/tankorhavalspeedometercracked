package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Oe extends AbstractC0273iq {
    public final /* synthetic */ Te e;
    public final /* synthetic */ int f;
    public final /* synthetic */ L4 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oe(String str, Te te, int i, L4 l4, int i2, boolean z) {
        super(str, true);
        this.e = te;
        this.f = i;
        this.g = l4;
        this.h = i2;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        try {
            C0473pa c0473pa = this.e.l;
            L4 l4 = this.g;
            int i = this.h;
            c0473pa.getClass();
            Tf.j("source", l4);
            l4.a(i);
            this.e.y.A(this.f, 9);
            synchronized (this.e) {
                this.e.A.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
