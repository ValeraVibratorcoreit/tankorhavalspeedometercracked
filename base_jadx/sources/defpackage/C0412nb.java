package defpackage;

/* JADX INFO: renamed from: nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0412nb implements Im {
    public final boolean a;
    public final boolean b;
    public final Im c;
    public final InterfaceC0381mb d;
    public final InterfaceC0171fg e;
    public int f;
    public boolean g;

    public C0412nb(Im im, boolean z, boolean z2, InterfaceC0171fg interfaceC0171fg, InterfaceC0381mb interfaceC0381mb) {
        Ud.l("Argument must not be null", im);
        this.c = im;
        this.a = z;
        this.b = z2;
        this.e = interfaceC0171fg;
        Ud.l("Argument must not be null", interfaceC0381mb);
        this.d = interfaceC0381mb;
    }

    public final synchronized void a() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public final void b() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C0166fb) this.d).e(this.e, this);
        }
    }

    @Override // defpackage.Im
    public final int c() {
        return this.c.c();
    }

    @Override // defpackage.Im
    public final Class d() {
        return this.c.d();
    }

    @Override // defpackage.Im
    public final synchronized void e() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.e();
        }
    }

    @Override // defpackage.Im
    public final Object get() {
        return this.c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
