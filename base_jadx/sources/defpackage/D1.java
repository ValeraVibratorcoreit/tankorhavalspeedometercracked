package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class D1 implements Executor {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                Qr.f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
