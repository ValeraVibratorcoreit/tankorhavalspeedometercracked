package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0229hc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ H0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ CallableC0229hc(String str, Context context, H0 h0, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.d = h0;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return AbstractC0320kc.a(this.b, this.c, this.d, this.e);
            default:
                try {
                    return AbstractC0320kc.a(this.b, this.c, this.d, this.e);
                } catch (Throwable unused) {
                    return new C0289jc(-3);
                }
        }
    }
}
