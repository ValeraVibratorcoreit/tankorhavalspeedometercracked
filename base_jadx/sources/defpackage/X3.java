package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class X3 extends AbstractC0662ve {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.C0655v7
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.C0655v7
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            C0655v7 c0655v7 = this.q0[i4];
            if ((this.t0 || c0655v7.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !c0655v7.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !c0655v7.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            C0655v7 c0655v8 = this.q0[i5];
            if (this.t0 || c0655v8.c()) {
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = c0655v8.i(2).d();
                    } else if (i6 == 1) {
                        iMax = c0655v8.i(4).d();
                    } else if (i6 == 2) {
                        iMax = c0655v8.i(3).d();
                    } else if (i6 == 3) {
                        iMax = c0655v8.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c0655v8.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c0655v8.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c0655v8.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c0655v8.i(5).d());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            J(i8, i8);
        } else {
            K(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.C0655v7
    public final void b(Qg qg, boolean z) {
        boolean z2;
        int i;
        int i2;
        C0224h7[] c0224h7Arr = this.Q;
        C0224h7 c0224h7 = this.I;
        c0224h7Arr[0] = c0224h7;
        C0224h7 c0224h8 = this.J;
        int i3 = 2;
        c0224h7Arr[2] = c0224h8;
        C0224h7 c0224h9 = this.K;
        c0224h7Arr[1] = c0224h9;
        C0224h7 c0224h10 = this.L;
        c0224h7Arr[3] = c0224h10;
        for (C0224h7 c0224h11 : c0224h7Arr) {
            c0224h11.i = qg.k(c0224h11);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0224h7 c0224h12 = c0224h7Arr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                qg.d(c0224h7.i, this.Y);
                qg.d(c0224h9.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    qg.d(c0224h8.i, this.Z);
                    qg.d(c0224h10.i, this.Z);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.r0) {
                z2 = false;
                break;
            }
            C0655v7 c0655v7 = this.q0[i6];
            if ((this.t0 || c0655v7.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && c0655v7.p0[0] == 3 && c0655v7.I.f != null && c0655v7.K.f != null) || ((i2 == 2 || i2 == 3) && c0655v7.p0[1] == 3 && c0655v7.J.f != null && c0655v7.L.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c0224h7.g() || c0224h9.g();
        boolean z4 = c0224h8.g() || c0224h10.g();
        int i7 = (z2 || !(((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            C0655v7 c0655v8 = this.q0[i8];
            if (this.t0 || c0655v8.c()) {
                Wo woK = qg.k(c0655v8.Q[this.s0]);
                int i9 = this.s0;
                C0224h7 c0224h13 = c0655v8.Q[i9];
                c0224h13.i = woK;
                C0224h7 c0224h14 = c0224h13.f;
                int i10 = (c0224h14 == null || c0224h14.d != this) ? 0 : c0224h13.g;
                if (i9 == 0 || i9 == i3) {
                    Wo wo = c0224h12.i;
                    int i11 = this.u0 - i10;
                    C0097d3 c0097d3L = qg.l();
                    Wo woM = qg.m();
                    woM.d = 0;
                    c0097d3L.c(wo, woK, woM, i11);
                    qg.c(c0097d3L);
                } else {
                    Wo wo2 = c0224h12.i;
                    int i12 = this.u0 + i10;
                    C0097d3 c0097d3L2 = qg.l();
                    Wo woM2 = qg.m();
                    woM2.d = 0;
                    c0097d3L2.b(wo2, woK, woM2, i12);
                    qg.c(c0097d3L2);
                }
                qg.e(c0224h12.i, woK, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            qg.e(c0224h9.i, c0224h7.i, 0, 8);
            qg.e(c0224h7.i, this.T.K.i, 0, 4);
            qg.e(c0224h7.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            qg.e(c0224h7.i, c0224h9.i, 0, 8);
            qg.e(c0224h7.i, this.T.I.i, 0, 4);
            qg.e(c0224h7.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            qg.e(c0224h10.i, c0224h8.i, 0, 8);
            qg.e(c0224h8.i, this.T.L.i, 0, 4);
            qg.e(c0224h8.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            qg.e(c0224h8.i, c0224h10.i, 0, 8);
            qg.e(c0224h8.i, this.T.J.i, 0, 4);
            qg.e(c0224h8.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.C0655v7
    public final boolean c() {
        return true;
    }

    @Override // defpackage.C0655v7
    public final String toString() {
        String strH = Vo.h(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            C0655v7 c0655v7 = this.q0[i];
            if (i > 0) {
                strH = Vo.f(strH, ", ");
            }
            strH = strH + c0655v7.h0;
        }
        return Vo.f(strH, "}");
    }
}
