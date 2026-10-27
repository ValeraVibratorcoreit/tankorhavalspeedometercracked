package defpackage;

/* JADX INFO: renamed from: ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0443ob implements Am, InterfaceC0732xm {
    public final Object a;
    public final Am b;
    public volatile InterfaceC0732xm c;
    public volatile InterfaceC0732xm d;
    public int e = 3;
    public int f = 3;

    public C0443ob(Object obj, Am am) {
        this.a = obj;
        this.b = am;
    }

    @Override // defpackage.Am, defpackage.InterfaceC0732xm
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean b(InterfaceC0732xm interfaceC0732xm) {
        if (!(interfaceC0732xm instanceof C0443ob)) {
            return false;
        }
        C0443ob c0443ob = (C0443ob) interfaceC0732xm;
        return this.c.b(c0443ob.c) && this.d.b(c0443ob.d);
    }

    @Override // defpackage.Am
    public final Am c() {
        Am amC;
        synchronized (this.a) {
            try {
                Am am = this.b;
                amC = am != null ? am.c() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return amC;
    }

    @Override // defpackage.InterfaceC0732xm
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final void d() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.d();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Am
    public final boolean e(InterfaceC0732xm interfaceC0732xm) {
        boolean z;
        synchronized (this.a) {
            Am am = this.b;
            z = (am == null || am.e(this)) && interfaceC0732xm.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final void f() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Am
    public final boolean g(InterfaceC0732xm interfaceC0732xm) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.a) {
            Am am = this.b;
            z = false;
            if (am == null || am.g(this)) {
                if (this.e != 5) {
                    zEquals = interfaceC0732xm.equals(this.c);
                } else {
                    zEquals = interfaceC0732xm.equals(this.d) && ((i = this.f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.Am
    public final void h(InterfaceC0732xm interfaceC0732xm) {
        synchronized (this.a) {
            try {
                if (interfaceC0732xm.equals(this.d)) {
                    this.f = 5;
                    Am am = this.b;
                    if (am != null) {
                        am.h(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Am
    public final boolean i(InterfaceC0732xm interfaceC0732xm) {
        boolean z;
        synchronized (this.a) {
            Am am = this.b;
            z = am == null || am.i(this);
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.Am
    public final void k(InterfaceC0732xm interfaceC0732xm) {
        synchronized (this.a) {
            try {
                if (interfaceC0732xm.equals(this.c)) {
                    this.e = 4;
                } else if (interfaceC0732xm.equals(this.d)) {
                    this.f = 4;
                }
                Am am = this.b;
                if (am != null) {
                    am.k(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
