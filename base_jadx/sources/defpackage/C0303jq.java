package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: renamed from: jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303jq {
    public boolean a;
    public AbstractC0273iq b;
    public final ArrayList c;
    public boolean d;
    public final C0334kq e;
    public final String f;

    public C0303jq(C0334kq c0334kq, String str) {
        Tf.j("taskRunner", c0334kq);
        Tf.j("name", str);
        this.e = c0334kq;
        this.f = str;
        this.c = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Rr.a;
        synchronized (this.e) {
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final boolean b() {
        AbstractC0273iq abstractC0273iq = this.b;
        if (abstractC0273iq != null && abstractC0273iq.d) {
            this.d = true;
        }
        ArrayList arrayList = this.c;
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((AbstractC0273iq) arrayList.get(size)).d) {
                AbstractC0273iq abstractC0273iq2 = (AbstractC0273iq) arrayList.get(size);
                if (C0334kq.i.isLoggable(Level.FINE)) {
                    Ud.a(abstractC0273iq2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(AbstractC0273iq abstractC0273iq, long j) {
        Tf.j("task", abstractC0273iq);
        synchronized (this.e) {
            if (!this.a) {
                if (d(abstractC0273iq, j, false)) {
                    this.e.e(this);
                }
            } else if (abstractC0273iq.d) {
                C0334kq c0334kq = C0334kq.h;
                if (C0334kq.i.isLoggable(Level.FINE)) {
                    Ud.a(abstractC0273iq, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                C0334kq c0334kq2 = C0334kq.h;
                if (C0334kq.i.isLoggable(Level.FINE)) {
                    Ud.a(abstractC0273iq, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(AbstractC0273iq abstractC0273iq, long j, boolean z) {
        Tf.j("task", abstractC0273iq);
        C0303jq c0303jq = abstractC0273iq.a;
        if (c0303jq != this) {
            if (c0303jq != null) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            abstractC0273iq.a = this;
        }
        this.e.g.getClass();
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.c;
        int iIndexOf = arrayList.indexOf(abstractC0273iq);
        if (iIndexOf != -1) {
            if (abstractC0273iq.b <= j2) {
                if (C0334kq.i.isLoggable(Level.FINE)) {
                    Ud.a(abstractC0273iq, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        abstractC0273iq.b = j2;
        if (C0334kq.i.isLoggable(Level.FINE)) {
            Ud.a(abstractC0273iq, this, z ? "run again after ".concat(Ud.q(j2 - jNanoTime)) : "scheduled after ".concat(Ud.q(j2 - jNanoTime)));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC0273iq) it.next()).b - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, abstractC0273iq);
        return size == 0;
    }

    public final void e() {
        byte[] bArr = Rr.a;
        synchronized (this.e) {
            this.a = true;
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final String toString() {
        return this.f;
    }
}
