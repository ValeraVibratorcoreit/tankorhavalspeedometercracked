package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Pe extends AbstractC0273iq {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Te f;
    public final /* synthetic */ int g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pe(String str, Te te, int i, List list) {
        super(str, true);
        this.f = te;
        this.g = i;
        this.h = list;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        switch (this.e) {
            case 0:
                C0473pa c0473pa = this.f.l;
                List list = this.h;
                c0473pa.getClass();
                Tf.j("responseHeaders", list);
                try {
                    this.f.y.A(this.g, 9);
                    synchronized (this.f) {
                        this.f.A.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                C0473pa c0473pa2 = this.f.l;
                List list2 = this.h;
                c0473pa2.getClass();
                Tf.j("requestHeaders", list2);
                try {
                    this.f.y.A(this.g, 9);
                    synchronized (this.f) {
                        this.f.A.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pe(String str, Te te, int i, List list, boolean z) {
        super(str, true);
        this.f = te;
        this.g = i;
        this.h = list;
    }
}
