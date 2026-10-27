package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0471p8 implements InterfaceC0040b8, Runnable, Comparable, Ib {
    public volatile boolean A;
    public volatile boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public final G7 d;
    public final Nk e;
    public Vd h;
    public InterfaceC0171fg i;
    public Uk j;
    public C0350lb k;
    public int l;
    public int m;
    public C0317k9 n;
    public C0544rk o;
    public C0288jb p;
    public int q;
    public long r;
    public boolean s;
    public Object t;
    public Thread u;
    public InterfaceC0171fg v;
    public InterfaceC0171fg w;
    public Object x;
    public InterfaceC0009a8 y;
    public volatile InterfaceC0071c8 z;
    public final C0409n8 a = new C0409n8();
    public final ArrayList b = new ArrayList();
    public final C0704wp c = new C0704wp();
    public final K2 f = new K2(8, false);
    public final C0440o8 g = new C0440o8();

    public RunnableC0471p8(G7 g7, K2 k2) {
        this.d = g7;
        this.e = k2;
    }

    @Override // defpackage.InterfaceC0040b8
    public final void a(InterfaceC0171fg interfaceC0171fg, Exception exc, InterfaceC0009a8 interfaceC0009a8, int i) {
        interfaceC0009a8.c();
        Xd xd = new Xd("Fetching data failed", Collections.singletonList(exc));
        Class clsA = interfaceC0009a8.a();
        xd.b = interfaceC0171fg;
        xd.c = i;
        xd.d = clsA;
        this.b.add(xd);
        if (Thread.currentThread() != this.u) {
            n(2);
        } else {
            o();
        }
    }

    @Override // defpackage.Ib
    public final C0704wp b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC0040b8
    public final void c(InterfaceC0171fg interfaceC0171fg, Object obj, InterfaceC0009a8 interfaceC0009a8, int i, InterfaceC0171fg interfaceC0171fg2) {
        this.v = interfaceC0171fg;
        this.x = obj;
        this.y = interfaceC0009a8;
        this.F = i;
        this.w = interfaceC0171fg2;
        this.C = interfaceC0171fg != this.a.a().get(0);
        if (Thread.currentThread() != this.u) {
            n(3);
        } else {
            g();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0471p8 runnableC0471p8 = (RunnableC0471p8) obj;
        int iOrdinal = this.j.ordinal() - runnableC0471p8.j.ordinal();
        return iOrdinal == 0 ? this.q - runnableC0471p8.q : iOrdinal;
    }

    @Override // defpackage.InterfaceC0040b8
    public final void d() {
        n(2);
    }

    public final Im e(InterfaceC0009a8 interfaceC0009a8, Object obj, int i) {
        if (obj == null) {
            interfaceC0009a8.c();
            return null;
        }
        try {
            int i2 = AbstractC0449oh.b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Im imF = f(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + imF, jElapsedRealtimeNanos, null);
            }
            return imF;
        } finally {
            interfaceC0009a8.c();
        }
    }

    public final Im f(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C0409n8 c0409n8 = this.a;
        C0172fh c0172fhC = c0409n8.c(cls);
        C0544rk c0544rk = this.o;
        boolean z = i == 4 || c0409n8.r;
        C0483pk c0483pk = N9.i;
        Boolean bool = (Boolean) c0544rk.c(c0483pk);
        if (bool == null || (bool.booleanValue() && !z)) {
            c0544rk = new C0544rk();
            C0222h5 c0222h5 = this.o.b;
            C0222h5 c0222h6 = c0544rk.b;
            c0222h6.i(c0222h5);
            c0222h6.put(c0483pk, Boolean.valueOf(z));
        }
        C0544rk c0544rk2 = c0544rk;
        InterfaceC0132e8 interfaceC0132e8G = this.h.a().g(obj);
        try {
            return c0172fhC.a(this.l, this.m, new Q0(this, i), interfaceC0132e8G, c0544rk2);
        } finally {
            interfaceC0132e8G.c();
        }
    }

    public final void g() {
        Im imE;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Retrieved data", this.r, "data: " + this.x + ", cache key: " + this.v + ", fetcher: " + this.y);
        }
        C0418nh c0418nh = null;
        try {
            imE = e(this.y, this.x, this.F);
        } catch (Xd e) {
            InterfaceC0171fg interfaceC0171fg = this.w;
            int i = this.F;
            e.b = interfaceC0171fg;
            e.c = i;
            e.d = null;
            this.b.add(e);
            imE = null;
        }
        if (imE == null) {
            o();
            return;
        }
        int i2 = this.F;
        boolean z = this.C;
        if (imE instanceof Bf) {
            ((Bf) imE).a();
        }
        if (((C0418nh) this.f.d) != null) {
            c0418nh = (C0418nh) C0418nh.e.b();
            c0418nh.d = false;
            c0418nh.c = true;
            c0418nh.b = imE;
            imE = c0418nh;
        }
        k(imE, i2, z);
        this.D = 5;
        try {
            K2 k2 = this.f;
            if (((C0418nh) k2.d) != null) {
                G7 g7 = this.d;
                C0544rk c0544rk = this.o;
                k2.getClass();
                try {
                    g7.a().b((InterfaceC0171fg) k2.b, new K2((Qm) k2.c, (C0418nh) k2.d, c0544rk, 7));
                    ((C0418nh) k2.d).a();
                } catch (Throwable th) {
                    ((C0418nh) k2.d).a();
                    throw th;
                }
            }
            if (c0418nh != null) {
                c0418nh.a();
            }
            C0440o8 c0440o8 = this.g;
            synchronized (c0440o8) {
                c0440o8.b = true;
                zA = c0440o8.a();
            }
            if (zA) {
                m();
            }
        } catch (Throwable th2) {
            if (c0418nh != null) {
                c0418nh.a();
            }
            throw th2;
        }
    }

    public final InterfaceC0071c8 h() {
        int iO = Vo.o(this.D);
        C0409n8 c0409n8 = this.a;
        if (iO == 1) {
            return new Jm(c0409n8, this);
        }
        if (iO == 2) {
            return new X7(c0409n8.a(), c0409n8, this);
        }
        if (iO == 3) {
            return new Yo(c0409n8, this);
        }
        if (iO == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(Vo.q(this.D)));
    }

    public final int i(int i) {
        int iO = Vo.o(i);
        if (iO == 0) {
            if (this.n.b()) {
                return 2;
            }
            return i(2);
        }
        if (iO == 1) {
            if (this.n.a()) {
                return 3;
            }
            return i(3);
        }
        if (iO == 2) {
            return this.s ? 6 : 4;
        }
        if (iO == 3 || iO == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(Vo.q(i)));
    }

    public final void j(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AbstractC0449oh.a(j));
        sb.append(", load key: ");
        sb.append(this.k);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    public final void k(Im im, int i, boolean z) {
        q();
        C0288jb c0288jb = this.p;
        synchronized (c0288jb) {
            c0288jb.q = im;
            c0288jb.r = i;
            c0288jb.y = z;
        }
        synchronized (c0288jb) {
            try {
                c0288jb.b.a();
                if (c0288jb.x) {
                    c0288jb.q.e();
                    c0288jb.g();
                    return;
                }
                if (c0288jb.a.a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (c0288jb.s) {
                    throw new IllegalStateException("Already have resource");
                }
                C0225h8 c0225h8 = c0288jb.e;
                Im im2 = c0288jb.q;
                boolean z2 = c0288jb.m;
                InterfaceC0171fg interfaceC0171fg = c0288jb.l;
                InterfaceC0381mb interfaceC0381mb = c0288jb.c;
                c0225h8.getClass();
                c0288jb.v = new C0412nb(im2, z2, true, interfaceC0171fg, interfaceC0381mb);
                c0288jb.s = true;
                C0259ib c0259ib = c0288jb.a;
                c0259ib.getClass();
                ArrayList<C0228hb> arrayList = new ArrayList(c0259ib.a);
                c0288jb.e(arrayList.size() + 1);
                ((C0166fb) c0288jb.f).d(c0288jb, c0288jb.l, c0288jb.v);
                for (C0228hb c0228hb : arrayList) {
                    c0228hb.b.execute(new RunnableC0197gb(c0288jb, c0228hb.a, 1));
                }
                c0288jb.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        boolean zA;
        q();
        Xd xd = new Xd("Failed to load resource", new ArrayList(this.b));
        C0288jb c0288jb = this.p;
        synchronized (c0288jb) {
            c0288jb.t = xd;
        }
        synchronized (c0288jb) {
            try {
                c0288jb.b.a();
                if (c0288jb.x) {
                    c0288jb.g();
                } else {
                    if (c0288jb.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c0288jb.u) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c0288jb.u = true;
                    InterfaceC0171fg interfaceC0171fg = c0288jb.l;
                    C0259ib c0259ib = c0288jb.a;
                    c0259ib.getClass();
                    ArrayList<C0228hb> arrayList = new ArrayList(c0259ib.a);
                    c0288jb.e(arrayList.size() + 1);
                    ((C0166fb) c0288jb.f).d(c0288jb, interfaceC0171fg, null);
                    for (C0228hb c0228hb : arrayList) {
                        c0228hb.b.execute(new RunnableC0197gb(c0288jb, c0228hb.a, 0));
                    }
                    c0288jb.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0440o8 c0440o8 = this.g;
        synchronized (c0440o8) {
            c0440o8.c = true;
            zA = c0440o8.a();
        }
        if (zA) {
            m();
        }
    }

    public final void m() {
        C0440o8 c0440o8 = this.g;
        synchronized (c0440o8) {
            c0440o8.b = false;
            c0440o8.a = false;
            c0440o8.c = false;
        }
        K2 k2 = this.f;
        k2.b = null;
        k2.c = null;
        k2.d = null;
        C0409n8 c0409n8 = this.a;
        c0409n8.c = null;
        c0409n8.d = null;
        c0409n8.n = null;
        c0409n8.g = null;
        c0409n8.k = null;
        c0409n8.i = null;
        c0409n8.o = null;
        c0409n8.j = null;
        c0409n8.p = null;
        c0409n8.a.clear();
        c0409n8.l = false;
        c0409n8.b.clear();
        c0409n8.m = false;
        this.A = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.D = 0;
        this.z = null;
        this.u = null;
        this.v = null;
        this.x = null;
        this.F = 0;
        this.y = null;
        this.r = 0L;
        this.B = false;
        this.b.clear();
        this.e.a(this);
    }

    public final void n(int i) {
        Zd zd;
        this.E = i;
        C0288jb c0288jb = this.p;
        if (c0288jb.n) {
            zd = c0288jb.i;
        } else {
            zd = c0288jb.o ? c0288jb.j : c0288jb.h;
        }
        zd.execute(this);
    }

    public final void o() {
        this.u = Thread.currentThread();
        int i = AbstractC0449oh.b;
        this.r = SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.B && this.z != null && !(zB = this.z.b())) {
            this.D = i(this.D);
            this.z = h();
            if (this.D == 4) {
                n(2);
                return;
            }
        }
        if ((this.D == 6 || this.B) && !zB) {
            l();
        }
    }

    public final void p() {
        String str;
        int iO = Vo.o(this.E);
        if (iO == 0) {
            this.D = i(1);
            this.z = h();
            o();
        } else {
            if (iO == 1) {
                o();
                return;
            }
            if (iO == 2) {
                g();
                return;
            }
            int i = this.E;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i != 2) {
                str = i != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    public final void q() {
        Throwable th;
        this.c.a();
        if (!this.A) {
            this.A = true;
            return;
        }
        if (this.b.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.b;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0009a8 interfaceC0009a8 = this.y;
        try {
            try {
                if (this.B) {
                    l();
                    if (interfaceC0009a8 != null) {
                        interfaceC0009a8.c();
                        return;
                    }
                    return;
                }
                p();
                if (interfaceC0009a8 != null) {
                    interfaceC0009a8.c();
                }
            } catch (Throwable th) {
                if (interfaceC0009a8 != null) {
                    interfaceC0009a8.c();
                }
                throw th;
            }
        } catch (C0344l5 e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.B + ", stage: " + Vo.q(this.D), th2);
            }
            if (this.D != 5) {
                this.b.add(th2);
                l();
            }
            if (!this.B) {
                throw th2;
            }
            throw th2;
        }
    }
}
