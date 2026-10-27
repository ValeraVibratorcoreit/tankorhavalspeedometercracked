package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class Ba extends Ud {
    public final /* synthetic */ Ud h;
    public final /* synthetic */ ThreadPoolExecutor i;

    public Ba(Ud ud, ThreadPoolExecutor threadPoolExecutor) {
        this.h = ud;
        this.i = threadPoolExecutor;
    }

    @Override // defpackage.Ud
    public final void X(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.i;
        try {
            this.h.X(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.Ud
    public final void Y(C0296jj c0296jj) {
        ThreadPoolExecutor threadPoolExecutor = this.i;
        try {
            this.h.Y(c0296jj);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
