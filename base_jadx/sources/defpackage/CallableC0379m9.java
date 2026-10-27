package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: m9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0379m9 implements Callable {
    public final /* synthetic */ C0503q9 a;

    public CallableC0379m9(C0503q9 c0503q9) {
        this.a = c0503q9;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.a) {
            try {
                C0503q9 c0503q9 = this.a;
                if (c0503q9.i == null) {
                    return null;
                }
                c0503q9.I();
                if (this.a.B()) {
                    this.a.G();
                    this.a.k = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
