package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: renamed from: kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334kq {
    public static final C0334kq h;
    public static final Logger i;
    public boolean b;
    public long c;
    public final Vi g;
    public int a = 10000;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final RunnableC0524r0 f = new RunnableC0524r0(this, 17);

    static {
        String str = Rr.g + " TaskRunner";
        Tf.j("name", str);
        Pr pr = new Pr(str, true);
        Vi vi = new Vi();
        vi.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), pr);
        h = new C0334kq(vi);
        Logger logger = Logger.getLogger(C0334kq.class.getName());
        Tf.i("Logger.getLogger(TaskRunner::class.java.name)", logger);
        i = logger;
    }

    public C0334kq(Vi vi) {
        this.g = vi;
    }

    public static final void a(C0334kq c0334kq, AbstractC0273iq abstractC0273iq) {
        c0334kq.getClass();
        byte[] bArr = Rr.a;
        Thread threadCurrentThread = Thread.currentThread();
        Tf.i("currentThread", threadCurrentThread);
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC0273iq.c);
        try {
            long jA = abstractC0273iq.a();
            synchronized (c0334kq) {
                c0334kq.b(abstractC0273iq, jA);
            }
        } finally {
            synchronized (c0334kq) {
                c0334kq.b(abstractC0273iq, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(AbstractC0273iq abstractC0273iq, long j) {
        byte[] bArr = Rr.a;
        C0303jq c0303jq = abstractC0273iq.a;
        Tf.f(c0303jq);
        if (c0303jq.b != abstractC0273iq) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = c0303jq.d;
        c0303jq.d = false;
        c0303jq.b = null;
        this.d.remove(c0303jq);
        if (j != -1 && !z && !c0303jq.a) {
            c0303jq.d(abstractC0273iq, j, true);
        }
        if (!c0303jq.c.isEmpty()) {
            this.e.add(c0303jq);
        }
    }

    public final AbstractC0273iq c() {
        boolean z;
        boolean z2;
        byte[] bArr = Rr.a;
        while (true) {
            ArrayList arrayList = this.e;
            if (arrayList.isEmpty()) {
                return null;
            }
            Vi vi = this.g;
            vi.getClass();
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC0273iq abstractC0273iq = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC0273iq abstractC0273iq2 = (AbstractC0273iq) ((C0303jq) it.next()).c.get(0);
                long jMax = Math.max(0L, abstractC0273iq2.b - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC0273iq != null) {
                        z = true;
                        break;
                    }
                    abstractC0273iq = abstractC0273iq2;
                }
            }
            if (abstractC0273iq != null) {
                byte[] bArr2 = Rr.a;
                abstractC0273iq.b = -1L;
                C0303jq c0303jq = abstractC0273iq.a;
                Tf.f(c0303jq);
                c0303jq.c.remove(abstractC0273iq);
                arrayList.remove(c0303jq);
                c0303jq.b = abstractC0273iq;
                this.d.add(c0303jq);
                if (z || (!this.b && (!arrayList.isEmpty()))) {
                    RunnableC0524r0 runnableC0524r0 = this.f;
                    Tf.j("runnable", runnableC0524r0);
                    ((ThreadPoolExecutor) vi.a).execute(runnableC0524r0);
                }
                return abstractC0273iq;
            }
            if (this.b) {
                if (jMin < this.c - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.b = true;
            this.c = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j2);
                    }
                    z2 = false;
                } catch (InterruptedException unused) {
                    d();
                    z2 = false;
                }
                this.b = z2;
            } catch (Throwable th) {
                this.b = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C0303jq) arrayList.get(size)).b();
        }
        ArrayList arrayList2 = this.e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            C0303jq c0303jq = (C0303jq) arrayList2.get(size2);
            c0303jq.b();
            if (c0303jq.c.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(C0303jq c0303jq) {
        Tf.j("taskQueue", c0303jq);
        byte[] bArr = Rr.a;
        if (c0303jq.b == null) {
            boolean z = !c0303jq.c.isEmpty();
            ArrayList arrayList = this.e;
            if (z) {
                Tf.j("$this$addIfAbsent", arrayList);
                if (!arrayList.contains(c0303jq)) {
                    arrayList.add(c0303jq);
                }
            } else {
                arrayList.remove(c0303jq);
            }
        }
        boolean z2 = this.b;
        Vi vi = this.g;
        if (z2) {
            vi.getClass();
            notify();
        } else {
            vi.getClass();
            RunnableC0524r0 runnableC0524r0 = this.f;
            Tf.j("runnable", runnableC0524r0);
            ((ThreadPoolExecutor) vi.a).execute(runnableC0524r0);
        }
    }

    public final C0303jq f() {
        int i2;
        synchronized (this) {
            i2 = this.a;
            this.a = i2 + 1;
        }
        return new C0303jq(this, Vo.e(i2, "Q"));
    }
}
