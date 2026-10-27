package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138ee extends C0655v7 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public C0224h7 t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public C0138ee() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.C0655v7
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.C0655v7
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.C0655v7
    public final void Q(Qg qg, boolean z) {
        if (this.T == null) {
            return;
        }
        C0224h7 c0224h7 = this.t0;
        qg.getClass();
        int iN = Qg.n(c0224h7);
        if (this.u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        C0224h7[] c0224h7Arr = this.Q;
        int length = c0224h7Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0224h7Arr[i2] = this.t0;
        }
    }

    @Override // defpackage.C0655v7
    public final void b(Qg qg, boolean z) {
        C0686w7 c0686w7 = (C0686w7) this.T;
        if (c0686w7 == null) {
            return;
        }
        Object objI = c0686w7.i(2);
        Object objI2 = c0686w7.i(4);
        C0655v7 c0655v7 = this.T;
        boolean z2 = c0655v7 != null && c0655v7.p0[0] == 2;
        if (this.u0 == 0) {
            objI = c0686w7.i(3);
            objI2 = c0686w7.i(5);
            C0655v7 c0655v8 = this.T;
            z2 = c0655v8 != null && c0655v8.p0[1] == 2;
        }
        if (this.v0) {
            C0224h7 c0224h7 = this.t0;
            if (c0224h7.c) {
                Wo woK = qg.k(c0224h7);
                qg.d(woK, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        qg.f(qg.k(objI2), woK, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    Wo woK2 = qg.k(objI2);
                    qg.f(woK, qg.k(objI), 0, 5);
                    qg.f(woK2, woK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            Wo woK3 = qg.k(this.t0);
            qg.e(woK3, qg.k(objI), this.r0, 8);
            if (z2) {
                qg.f(qg.k(objI2), woK3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            Wo woK4 = qg.k(this.t0);
            Wo woK5 = qg.k(objI2);
            qg.e(woK4, woK5, -this.s0, 8);
            if (z2) {
                qg.f(woK4, qg.k(objI), 0, 5);
                qg.f(woK5, woK4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            Wo woK6 = qg.k(this.t0);
            Wo woK7 = qg.k(objI2);
            float f = this.q0;
            C0097d3 c0097d3L = qg.l();
            c0097d3L.d.j(woK6, -1.0f);
            c0097d3L.d.j(woK7, f);
            qg.c(c0097d3L);
        }
    }

    @Override // defpackage.C0655v7
    public final boolean c() {
        return true;
    }

    @Override // defpackage.C0655v7
    public final C0224h7 i(int i) {
        int iO = Vo.o(i);
        if (iO != 1) {
            if (iO != 2) {
                if (iO != 3) {
                    if (iO != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
