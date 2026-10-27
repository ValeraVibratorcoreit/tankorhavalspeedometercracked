package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Lf {
    public static Lf J;
    public C0120dr A;
    public C0120dr B;
    public C0120dr C;
    public C0120dr D;
    public C0120dr E;
    public C0120dr F;
    public C0120dr G;
    public C0120dr H;
    public C0120dr I;
    public C0120dr a;
    public C0120dr b;
    public C0120dr c;
    public C0120dr d;
    public C0120dr e;
    public C0120dr f;
    public C0120dr g;
    public C0120dr h;
    public C0120dr i;
    public C0120dr j;
    public C0120dr k;
    public C0120dr l;
    public C0120dr m;
    public C0120dr n;
    public C0120dr o;
    public C0120dr p;
    public C0120dr q;
    public C0120dr r;
    public C0120dr s;
    public C0120dr t;
    public C0120dr u;
    public C0120dr v;
    public C0120dr w;
    public C0120dr x;
    public C0120dr y;
    public C0120dr z;

    public static Lf a() {
        if (J == null) {
            Lf lf = new Lf();
            Float fValueOf = Float.valueOf(0.0f);
            lf.a = new C0120dr(fValueOf);
            lf.b = new C0120dr(fValueOf);
            lf.c = new C0120dr(3);
            lf.d = new C0120dr(0);
            lf.e = new C0120dr(fValueOf);
            lf.f = new C0120dr(fValueOf);
            Float fValueOf2 = Float.valueOf(-1.0f);
            lf.g = new C0120dr(fValueOf2);
            lf.h = new C0120dr(fValueOf2);
            lf.i = new C0120dr(fValueOf2);
            lf.j = new C0120dr(fValueOf2);
            lf.k = new C0120dr(fValueOf2);
            lf.l = new C0120dr(fValueOf2);
            lf.m = new C0120dr(fValueOf2);
            lf.n = new C0120dr(-1);
            lf.o = new C0120dr(fValueOf2);
            lf.p = new C0120dr(fValueOf2);
            lf.q = new C0120dr(fValueOf2);
            lf.r = new C0120dr(fValueOf);
            lf.s = new C0120dr(Float.valueOf(-1000.0f));
            lf.t = new C0120dr(0);
            lf.u = new C0120dr("1");
            Boolean bool = Boolean.FALSE;
            lf.v = new C0120dr(bool);
            lf.w = new C0120dr(bool);
            lf.x = new C0120dr(bool);
            lf.y = new C0120dr(bool);
            lf.z = new C0120dr("[]");
            lf.A = new C0120dr(2);
            lf.B = new C0120dr(0);
            lf.C = new C0120dr(0);
            lf.D = new C0120dr(2);
            lf.E = new C0120dr(Boolean.TRUE);
            lf.F = new C0120dr(fValueOf2);
            lf.G = new C0120dr(-1);
            lf.H = new C0120dr(-1);
            lf.I = new C0120dr("ru.yandex.yandexnavi");
            J = lf;
        }
        return J;
    }

    public static void f(C0451oj c0451oj, Dg dg, Mj mj) {
        Object obj;
        c0451oj.getClass();
        C0451oj.a("observe");
        if (((Fg) dg.getLifecycle()).c == EnumC0633ug.a) {
            return;
        }
        C0111dh c0111dh = new C0111dh(c0451oj, dg, mj);
        C0455on c0455on = c0451oj.b;
        C0362ln c0362lnA = c0455on.a(mj);
        if (c0362lnA != null) {
            obj = c0362lnA.b;
        } else {
            C0362ln c0362ln = new C0362ln(mj, c0111dh);
            c0455on.d++;
            C0362ln c0362ln2 = c0455on.b;
            if (c0362ln2 == null) {
                c0455on.a = c0362ln;
                c0455on.b = c0362ln;
            } else {
                c0362ln2.c = c0362ln;
                c0362ln.d = c0362ln2;
                c0455on.b = c0362ln;
            }
            obj = null;
        }
        AbstractC0141eh abstractC0141eh = (AbstractC0141eh) obj;
        if (abstractC0141eh != null && !abstractC0141eh.c(dg)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0141eh != null) {
            return;
        }
        dg.getLifecycle().a(c0111dh);
    }

    public final Float b() {
        return (Float) this.s.d();
    }

    public final Float c() {
        return (Float) this.g.d();
    }

    public final Boolean d() {
        return (Boolean) this.E.d();
    }

    public final void e(Integer num) {
        this.t.f(num);
    }

    public final void g(Float f) {
        this.g.f(f);
    }

    public final void h(Boolean bool) {
        this.E.f(bool);
    }

    public final void i(Boolean bool) {
        this.v.f(bool);
    }
}
