package defpackage;

/* JADX INFO: renamed from: nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0418nh implements Im, Ib {
    public static final K2 e = Br.s0(20, new C0387mh(0));
    public final C0704wp a = new C0704wp();
    public Im b;
    public boolean c;
    public boolean d;

    public final synchronized void a() {
        this.a.a();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            e();
        }
    }

    @Override // defpackage.Ib
    public final C0704wp b() {
        return this.a;
    }

    @Override // defpackage.Im
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.Im
    public final Class d() {
        return this.b.d();
    }

    @Override // defpackage.Im
    public final synchronized void e() {
        this.a.a();
        this.d = true;
        if (!this.c) {
            this.b.e();
            this.b = null;
            e.a(this);
        }
    }

    @Override // defpackage.Im
    public final Object get() {
        return this.b.get();
    }
}
