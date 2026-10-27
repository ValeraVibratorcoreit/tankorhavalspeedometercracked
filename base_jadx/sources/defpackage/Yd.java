package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Yd implements ThreadFactory {
    public final ThreadFactory a;
    public final String b;
    public final C0473pa c;
    public final boolean d;
    public final AtomicInteger e;

    public Yd(ThreadFactoryC0555s0 threadFactoryC0555s0, String str, boolean z) {
        C0473pa c0473pa = C0473pa.f;
        this.e = new AtomicInteger();
        this.a = threadFactoryC0555s0;
        this.b = str;
        this.c = c0473pa;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(new RunnableC0248i0(this, 3, runnable));
        threadNewThread.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return threadNewThread;
    }
}
