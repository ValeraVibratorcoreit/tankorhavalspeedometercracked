package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288jb implements Ib {
    public static final C0225h8 z = new C0225h8(10);
    public final C0259ib a;
    public final C0704wp b;
    public final InterfaceC0381mb c;
    public final Nk d;
    public final C0225h8 e;
    public final InterfaceC0319kb f;
    public final Zd g;
    public final Zd h;
    public final Zd i;
    public final Zd j;
    public final AtomicInteger k;
    public InterfaceC0171fg l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Im q;
    public int r;
    public boolean s;
    public Xd t;
    public boolean u;
    public C0412nb v;
    public RunnableC0471p8 w;
    public volatile boolean x;
    public boolean y;

    public C0288jb(Zd zd, Zd zd2, Zd zd3, Zd zd4, InterfaceC0319kb interfaceC0319kb, InterfaceC0381mb interfaceC0381mb, K2 k2) {
        C0225h8 c0225h8 = z;
        this.a = new C0259ib(new ArrayList(2));
        this.b = new C0704wp();
        this.k = new AtomicInteger();
        this.g = zd;
        this.h = zd2;
        this.i = zd3;
        this.j = zd4;
        this.f = interfaceC0319kb;
        this.c = interfaceC0381mb;
        this.d = k2;
        this.e = c0225h8;
    }

    public final synchronized void a(Lm lm, Executor executor) {
        try {
            this.b.a();
            C0259ib c0259ib = this.a;
            c0259ib.getClass();
            c0259ib.a.add(new C0228hb(lm, executor));
            if (this.s) {
                e(1);
                executor.execute(new RunnableC0197gb(this, lm, 1));
            } else if (this.u) {
                e(1);
                executor.execute(new RunnableC0197gb(this, lm, 0));
            } else {
                Ud.i("Cannot add callbacks to a cancelled EngineJob", !this.x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.Ib
    public final C0704wp b() {
        return this.b;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.x = true;
        RunnableC0471p8 runnableC0471p8 = this.w;
        runnableC0471p8.B = true;
        InterfaceC0071c8 interfaceC0071c8 = runnableC0471p8.z;
        if (interfaceC0071c8 != null) {
            interfaceC0071c8.cancel();
        }
        InterfaceC0319kb interfaceC0319kb = this.f;
        InterfaceC0171fg interfaceC0171fg = this.l;
        C0166fb c0166fb = (C0166fb) interfaceC0319kb;
        synchronized (c0166fb) {
            C0048bg c0048bg = c0166fb.a;
            c0048bg.getClass();
            HashMap map = this.p ? c0048bg.b : c0048bg.a;
            if (equals(map.get(interfaceC0171fg))) {
                map.remove(interfaceC0171fg);
            }
        }
    }

    public final void d() {
        C0412nb c0412nb;
        synchronized (this) {
            try {
                this.b.a();
                Ud.i("Not yet complete!", f());
                int iDecrementAndGet = this.k.decrementAndGet();
                Ud.i("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c0412nb = this.v;
                    g();
                } else {
                    c0412nb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0412nb != null) {
            c0412nb.b();
        }
    }

    public final synchronized void e(int i) {
        C0412nb c0412nb;
        Ud.i("Not yet complete!", f());
        if (this.k.getAndAdd(i) == 0 && (c0412nb = this.v) != null) {
            c0412nb.a();
        }
    }

    public final boolean f() {
        return this.u || this.s || this.x;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.l == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.l = null;
        this.v = null;
        this.q = null;
        this.u = false;
        this.x = false;
        this.s = false;
        this.y = false;
        RunnableC0471p8 runnableC0471p8 = this.w;
        C0440o8 c0440o8 = runnableC0471p8.g;
        synchronized (c0440o8) {
            c0440o8.a = true;
            zA = c0440o8.a();
        }
        if (zA) {
            runnableC0471p8.m();
        }
        this.w = null;
        this.t = null;
        this.r = 0;
        this.d.a(this);
    }

    public final synchronized void h(Lm lm) {
        try {
            this.b.a();
            C0259ib c0259ib = this.a;
            c0259ib.a.remove(new C0228hb(lm, AbstractC0390mk.f));
            if (this.a.a.isEmpty()) {
                c();
                if (this.s || this.u) {
                    if (this.k.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
