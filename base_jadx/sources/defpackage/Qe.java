package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Qe extends AbstractC0273iq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Qe(String str, Object obj, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = obj;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        switch (this.e) {
            case 0:
                C0473pa c0473pa = ((Te) this.f).l;
                int i = this.h;
                c0473pa.getClass();
                Vo.j(i, "errorCode");
                synchronized (((Te) this.f)) {
                    ((Te) this.f).A.remove(Integer.valueOf(this.g));
                }
                return -1L;
            case 1:
                Te te = (Te) this.f;
                try {
                    int i2 = this.g;
                    int i3 = this.h;
                    te.getClass();
                    Vo.j(i3, "statusCode");
                    te.y.A(i2, i3);
                    return -1L;
                } catch (IOException e) {
                    te.n(2, 2, e);
                    return -1L;
                }
            default:
                Te te2 = ((Ne) this.f).b;
                int i4 = this.g;
                int i5 = this.h;
                te2.getClass();
                try {
                    te2.y.z(i4, i5, true);
                    return -1L;
                } catch (IOException e2) {
                    te2.n(2, 2, e2);
                    return -1L;
                }
        }
    }
}
