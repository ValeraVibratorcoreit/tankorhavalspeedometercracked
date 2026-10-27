package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Gq implements Am, InterfaceC0732xm {
    public final Am a;
    public final Object b;
    public volatile InterfaceC0732xm c;
    public volatile InterfaceC0732xm d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public Gq(Object obj, Am am) {
        this.b = obj;
        this.a = am;
    }

    @Override // defpackage.Am, defpackage.InterfaceC0732xm
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean b(InterfaceC0732xm interfaceC0732xm) {
        if (!(interfaceC0732xm instanceof Gq)) {
            return false;
        }
        Gq gq = (Gq) interfaceC0732xm;
        if (this.c == null) {
            if (gq.c != null) {
                return false;
            }
        } else if (!this.c.b(gq.c)) {
            return false;
        }
        if (this.d == null) {
            if (gq.d != null) {
                return false;
            }
        } else if (!this.d.b(gq.d)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.Am
    public final Am c() {
        Am amC;
        synchronized (this.b) {
            try {
                Am am = this.a;
                amC = am != null ? am.c() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return amC;
    }

    @Override // defpackage.InterfaceC0732xm
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final void d() {
        synchronized (this.b) {
            try {
                if (!Vo.d(this.f)) {
                    this.f = 2;
                    this.d.d();
                }
                if (!Vo.d(this.e)) {
                    this.e = 2;
                    this.c.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Am
    public final boolean e(InterfaceC0732xm interfaceC0732xm) {
        boolean z;
        synchronized (this.b) {
            try {
                Am am = this.a;
                z = (am == null || am.e(this)) && interfaceC0732xm.equals(this.c) && this.e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final void f() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.f();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.f();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.Am
    public final boolean g(InterfaceC0732xm interfaceC0732xm) {
        boolean z;
        synchronized (this.b) {
            try {
                Am am = this.a;
                z = (am == null || am.g(this)) && interfaceC0732xm.equals(this.c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.Am
    public final void h(InterfaceC0732xm interfaceC0732xm) {
        synchronized (this.b) {
            try {
                if (!interfaceC0732xm.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                Am am = this.a;
                if (am != null) {
                    am.h(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.Am
    public final boolean i(InterfaceC0732xm interfaceC0732xm) {
        boolean z;
        synchronized (this.b) {
            try {
                Am am = this.a;
                z = (am == null || am.i(this)) && (interfaceC0732xm.equals(this.c) || this.e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.Am
    public final void k(InterfaceC0732xm interfaceC0732xm) {
        synchronized (this.b) {
            try {
                if (interfaceC0732xm.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                Am am = this.a;
                if (am != null) {
                    am.k(this);
                }
                if (!Vo.d(this.f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean l() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }
}
