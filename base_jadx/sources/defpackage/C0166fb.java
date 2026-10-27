package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0166fb implements InterfaceC0319kb, InterfaceC0419ni, InterfaceC0381mb {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final C0048bg a;
    public final C0225h8 b;
    public final Ah c;
    public final C0135eb d;
    public final B4 e;
    public final Z1 f;
    public final K2 g;

    public C0166fb(Ah ah, C0308k0 c0308k0, Zd zd, Zd zd2, Zd zd3, Zd zd4) {
        this.c = ah;
        G7 g7 = new G7(c0308k0);
        K2 k2 = new K2(1);
        this.g = k2;
        synchronized (this) {
            synchronized (k2) {
                k2.d = this;
            }
        }
        this.b = new C0225h8(11);
        C0048bg c0048bg = new C0048bg();
        c0048bg.a = new HashMap();
        c0048bg.b = new HashMap();
        this.a = c0048bg;
        this.d = new C0135eb(zd, zd2, zd3, zd4, this, this);
        this.f = new Z1(g7);
        this.e = new B4();
        ah.d = this;
    }

    public static void c(String str, long j, InterfaceC0171fg interfaceC0171fg) {
        Log.v("Engine", str + " in " + AbstractC0449oh.a(j) + "ms, key: " + interfaceC0171fg);
    }

    public static void f(Im im) {
        if (!(im instanceof C0412nb)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C0412nb) im).b();
    }

    public final K2 a(Vd vd, Object obj, InterfaceC0171fg interfaceC0171fg, int i, int i2, Class cls, Class cls2, Uk uk, C0317k9 c0317k9, C0222h5 c0222h5, boolean z, boolean z2, C0544rk c0544rk, boolean z3, boolean z4, boolean z5, boolean z6, Lm lm, Executor executor) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i3 = AbstractC0449oh.b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos;
        this.b.getClass();
        C0350lb c0350lb = new C0350lb(obj, interfaceC0171fg, i, i2, c0222h5, cls, cls2, c0544rk);
        synchronized (this) {
            try {
                C0412nb c0412nbB = b(c0350lb, z3, j);
                if (c0412nbB == null) {
                    return g(vd, obj, interfaceC0171fg, i, i2, cls, cls2, uk, c0317k9, c0222h5, z, z2, c0544rk, z3, z4, z5, z6, lm, executor, c0350lb, j);
                }
                ((Ho) lm).i(c0412nbB, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0412nb b(C0350lb c0350lb, boolean z, long j) {
        C0412nb c0412nb;
        Object obj;
        C0412nb c0412nb2;
        if (!z) {
            return null;
        }
        K2 k2 = this.g;
        synchronized (k2) {
            C0586t0 c0586t0 = (C0586t0) ((HashMap) k2.b).get(c0350lb);
            if (c0586t0 == null) {
                c0412nb = null;
            } else {
                c0412nb = (C0412nb) c0586t0.get();
                if (c0412nb == null) {
                    k2.f(c0586t0);
                }
            }
        }
        if (c0412nb != null) {
            c0412nb.a();
        }
        if (c0412nb != null) {
            if (h) {
                c("Loaded resource from active resources", j, c0350lb);
            }
            return c0412nb;
        }
        Ah ah = this.c;
        synchronized (ah) {
            C0696wh c0696wh = (C0696wh) ah.a.remove(c0350lb);
            if (c0696wh == null) {
                obj = null;
            } else {
                ah.c -= (long) c0696wh.b;
                obj = c0696wh.a;
            }
        }
        Im im = (Im) obj;
        if (im == null) {
            c0412nb2 = null;
        } else {
            c0412nb2 = im instanceof C0412nb ? (C0412nb) im : new C0412nb(im, true, true, c0350lb, this);
        }
        if (c0412nb2 != null) {
            c0412nb2.a();
            this.g.c(c0350lb, c0412nb2);
        }
        if (c0412nb2 == null) {
            return null;
        }
        if (h) {
            c("Loaded resource from cache", j, c0350lb);
        }
        return c0412nb2;
    }

    public final synchronized void d(C0288jb c0288jb, InterfaceC0171fg interfaceC0171fg, C0412nb c0412nb) {
        if (c0412nb != null) {
            try {
                if (c0412nb.a) {
                    this.g.c(interfaceC0171fg, c0412nb);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0048bg c0048bg = this.a;
        c0048bg.getClass();
        HashMap map = c0288jb.p ? c0048bg.b : c0048bg.a;
        if (c0288jb.equals(map.get(interfaceC0171fg))) {
            map.remove(interfaceC0171fg);
        }
    }

    public final void e(InterfaceC0171fg interfaceC0171fg, C0412nb c0412nb) {
        K2 k2 = this.g;
        synchronized (k2) {
            C0586t0 c0586t0 = (C0586t0) ((HashMap) k2.b).remove(interfaceC0171fg);
            if (c0586t0 != null) {
                c0586t0.c = null;
                c0586t0.clear();
            }
        }
        if (c0412nb.a) {
        } else {
            this.e.d(c0412nb, false);
        }
    }

    public final K2 g(Vd vd, Object obj, InterfaceC0171fg interfaceC0171fg, int i, int i2, Class cls, Class cls2, Uk uk, C0317k9 c0317k9, C0222h5 c0222h5, boolean z, boolean z2, C0544rk c0544rk, boolean z3, boolean z4, boolean z5, boolean z6, Lm lm, Executor executor, C0350lb c0350lb, long j) {
        Zd zd;
        C0048bg c0048bg = this.a;
        C0288jb c0288jb = (C0288jb) (z6 ? c0048bg.b : c0048bg.a).get(c0350lb);
        if (c0288jb != null) {
            c0288jb.a(lm, executor);
            if (h) {
                c("Added to existing load", j, c0350lb);
            }
            return new K2(this, lm, c0288jb);
        }
        C0288jb c0288jb2 = (C0288jb) this.d.g.b();
        synchronized (c0288jb2) {
            c0288jb2.l = c0350lb;
            c0288jb2.m = z3;
            c0288jb2.n = z4;
            c0288jb2.o = z5;
            c0288jb2.p = z6;
        }
        Z1 z1 = this.f;
        RunnableC0471p8 runnableC0471p8 = (RunnableC0471p8) ((K2) z1.d).b();
        int i3 = z1.b;
        z1.b = i3 + 1;
        C0409n8 c0409n8 = runnableC0471p8.a;
        c0409n8.c = vd;
        c0409n8.d = obj;
        c0409n8.n = interfaceC0171fg;
        c0409n8.e = i;
        c0409n8.f = i2;
        c0409n8.p = c0317k9;
        c0409n8.g = cls;
        c0409n8.h = runnableC0471p8.d;
        c0409n8.k = cls2;
        c0409n8.o = uk;
        c0409n8.i = c0544rk;
        c0409n8.j = c0222h5;
        c0409n8.q = z;
        c0409n8.r = z2;
        runnableC0471p8.h = vd;
        runnableC0471p8.i = interfaceC0171fg;
        runnableC0471p8.j = uk;
        runnableC0471p8.k = c0350lb;
        runnableC0471p8.l = i;
        runnableC0471p8.m = i2;
        runnableC0471p8.n = c0317k9;
        runnableC0471p8.s = z6;
        runnableC0471p8.o = c0544rk;
        runnableC0471p8.p = c0288jb2;
        runnableC0471p8.q = i3;
        runnableC0471p8.E = 1;
        runnableC0471p8.t = obj;
        C0048bg c0048bg2 = this.a;
        c0048bg2.getClass();
        (c0288jb2.p ? c0048bg2.b : c0048bg2.a).put(c0350lb, c0288jb2);
        c0288jb2.a(lm, executor);
        synchronized (c0288jb2) {
            c0288jb2.w = runnableC0471p8;
            int i4 = runnableC0471p8.i(1);
            if (i4 == 2 || i4 == 3) {
                zd = c0288jb2.g;
            } else if (c0288jb2.n) {
                zd = c0288jb2.i;
            } else {
                zd = c0288jb2.o ? c0288jb2.j : c0288jb2.h;
            }
            zd.execute(runnableC0471p8);
        }
        if (h) {
            c("Started new load", j, c0350lb);
        }
        return new K2(this, lm, c0288jb2);
    }
}
