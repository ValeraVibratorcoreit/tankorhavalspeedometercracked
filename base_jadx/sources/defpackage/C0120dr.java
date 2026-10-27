package defpackage;

/* JADX INFO: renamed from: dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120dr extends C0451oj {
    public boolean l;
    public final Object m;

    public C0120dr(Object obj) {
        super(obj);
        this.l = false;
        this.m = obj;
    }

    @Override // defpackage.C0451oj
    public final void e(Object obj) {
        this.l = true;
        super.e(obj);
    }

    public final void f(Object obj) {
        boolean z = true;
        this.l = true;
        synchronized (this.a) {
            if (this.f != C0451oj.k) {
                z = false;
            }
            this.f = obj;
        }
        if (z) {
            X2.R().S(this.j);
        }
    }
}
