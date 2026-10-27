package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class O6 extends AbstractC0293jg implements InterfaceC0107dd {
    public final /* synthetic */ int b;
    public final /* synthetic */ P6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O6(P6 p6, int i) {
        super(0);
        this.b = i;
        this.c = p6;
    }

    @Override // defpackage.InterfaceC0107dd
    public final Object a() {
        switch (this.b) {
            case 0:
                this.c.reportFullyDrawn();
                return C0473pa.m;
            case 1:
                P6 p6 = this.c;
                return new C0076cd(p6.f, new O6(p6, 0));
            default:
                P6 p7 = this.c;
                C0021ak c0021ak = new C0021ak(new E6(p7, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Tf.b(Looper.myLooper(), Looper.getMainLooper())) {
                        p7.getClass();
                        p7.a.a(new I6(c0021ak, p7));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B1(p7, 6, c0021ak));
                    }
                }
                return c0021ak;
        }
    }
}
