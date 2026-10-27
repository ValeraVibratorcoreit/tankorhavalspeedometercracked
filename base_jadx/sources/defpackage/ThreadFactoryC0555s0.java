package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0555s0 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ ThreadFactoryC0555s0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new RunnableC0524r0(runnable, 0), "glide-active-resources");
            default:
                return new C0311k3(runnable);
        }
    }
}
