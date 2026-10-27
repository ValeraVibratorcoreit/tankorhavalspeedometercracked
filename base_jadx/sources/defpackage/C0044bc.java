package defpackage;

/* JADX INFO: renamed from: bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044bc {
    public int a;
    public C0224h7 d;
    public C0224h7 e;
    public C0224h7 f;
    public C0224h7 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ C0075cc r;
    public C0655v7 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public C0044bc(C0075cc c0075cc, int i, C0224h7 c0224h7, C0224h7 c0224h8, C0224h7 c0224h9, C0224h7 c0224h10, int i2) {
        this.r = c0075cc;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.q = 0;
        this.a = i;
        this.d = c0224h7;
        this.e = c0224h8;
        this.f = c0224h9;
        this.g = c0224h10;
        this.h = c0075cc.w0;
        this.i = c0075cc.s0;
        this.j = c0075cc.x0;
        this.k = c0075cc.t0;
        this.q = i2;
    }

    public final void a(C0655v7 c0655v7) {
        int i = this.a;
        C0075cc c0075cc = this.r;
        if (i == 0) {
            int iU = c0075cc.U(c0655v7, this.q);
            if (c0655v7.p0[0] == 3) {
                this.p++;
                iU = 0;
            }
            this.l = iU + (c0655v7.g0 != 8 ? c0075cc.P0 : 0) + this.l;
            int iT = c0075cc.T(c0655v7, this.q);
            if (this.b == null || this.c < iT) {
                this.b = c0655v7;
                this.c = iT;
                this.m = iT;
            }
        } else {
            int iU2 = c0075cc.U(c0655v7, this.q);
            int iT2 = c0075cc.T(c0655v7, this.q);
            if (c0655v7.p0[1] == 3) {
                this.p++;
                iT2 = 0;
            }
            this.m = iT2 + (c0655v7.g0 != 8 ? c0075cc.Q0 : 0) + this.m;
            if (this.b == null || this.c < iU2) {
                this.b = c0655v7;
                this.c = iU2;
                this.l = iU2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        C0075cc c0075cc;
        int i2;
        int i3;
        C0655v7 c0655v7;
        char c;
        int i4;
        float f;
        int i5;
        int i6;
        int i7 = this.o;
        int i8 = 0;
        while (true) {
            c0075cc = this.r;
            if (i8 >= i7 || (i6 = this.n + i8) >= c0075cc.b1) {
                break;
            }
            C0655v7 c0655v8 = c0075cc.a1[i6];
            if (c0655v8 != null) {
                c0655v8.D();
            }
            i8++;
        }
        if (i7 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.n + (z ? (i7 - 1) - i11 : i11);
            if (i12 >= c0075cc.b1) {
                break;
            }
            C0655v7 c0655v9 = c0075cc.a1[i12];
            if (c0655v9 != null && c0655v9.g0 == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.a != 0) {
            C0655v7 c0655v10 = this.b;
            c0655v10.i0 = c0075cc.D0;
            int i13 = this.h;
            if (i > 0) {
                i13 += c0075cc.P0;
            }
            C0224h7 c0224h7 = c0655v10.I;
            C0224h7 c0224h8 = c0655v10.K;
            if (z) {
                c0224h8.a(this.f, i13);
                if (z2) {
                    c0224h7.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.I.a(c0224h8, 0);
                }
            } else {
                c0224h7.a(this.d, i13);
                if (z2) {
                    c0224h8.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.K.a(c0224h7, 0);
                }
            }
            C0655v7 c0655v11 = null;
            for (int i14 = 0; i14 < i7; i14++) {
                int i15 = this.n + i14;
                if (i15 >= c0075cc.b1) {
                    return;
                }
                C0655v7 c0655v12 = c0075cc.a1[i15];
                if (c0655v12 != null) {
                    C0224h7 c0224h9 = c0655v12.J;
                    if (i14 == 0) {
                        c0655v12.f(c0224h9, this.e, this.i);
                        int i16 = c0075cc.E0;
                        float f2 = c0075cc.K0;
                        if (this.n == 0) {
                            i3 = c0075cc.G0;
                            i2 = -1;
                            if (i3 != -1) {
                                f2 = c0075cc.M0;
                            }
                            c0655v12.j0 = i3;
                            c0655v12.e0 = f2;
                        } else {
                            i2 = -1;
                        }
                        if (!z2 || (i3 = c0075cc.I0) == i2) {
                            i3 = i16;
                        } else {
                            f2 = c0075cc.O0;
                        }
                        c0655v12.j0 = i3;
                        c0655v12.e0 = f2;
                    }
                    if (i14 == i7 - 1) {
                        c0655v12.f(c0655v12.L, this.g, this.k);
                    }
                    if (c0655v11 != null) {
                        int i17 = c0075cc.Q0;
                        C0224h7 c0224h10 = c0655v11.L;
                        c0224h9.a(c0224h10, i17);
                        if (i14 == i9) {
                            int i18 = this.i;
                            if (c0224h9.h()) {
                                c0224h9.h = i18;
                            }
                        }
                        c0224h10.a(c0224h9, 0);
                        if (i14 == i10 + 1) {
                            int i19 = this.k;
                            if (c0224h10.h()) {
                                c0224h10.h = i19;
                            }
                        }
                    }
                    if (c0655v12 != c0655v10) {
                        C0224h7 c0224h11 = c0655v12.K;
                        C0224h7 c0224h12 = c0655v12.I;
                        if (z) {
                            int i20 = c0075cc.R0;
                            if (i20 == 0) {
                                c0224h11.a(c0224h8, 0);
                            } else if (i20 == 1) {
                                c0224h12.a(c0224h7, 0);
                            } else if (i20 == 2) {
                                c0224h12.a(c0224h7, 0);
                                c0224h11.a(c0224h8, 0);
                            }
                        } else {
                            int i21 = c0075cc.R0;
                            if (i21 == 0) {
                                c0224h12.a(c0224h7, 0);
                            } else if (i21 == 1) {
                                c0224h11.a(c0224h8, 0);
                            } else if (i21 == 2) {
                                if (z3) {
                                    c0224h12.a(this.d, this.h);
                                    c0224h11.a(this.f, this.j);
                                } else {
                                    c0224h12.a(c0224h7, 0);
                                    c0224h11.a(c0224h8, 0);
                                }
                            }
                        }
                    }
                    c0655v11 = c0655v12;
                }
            }
            return;
        }
        C0655v7 c0655v13 = this.b;
        c0655v13.j0 = c0075cc.E0;
        int i22 = this.i;
        if (i > 0) {
            i22 += c0075cc.Q0;
        }
        C0224h7 c0224h13 = this.e;
        C0224h7 c0224h14 = c0655v13.J;
        c0224h14.a(c0224h13, i22);
        C0224h7 c0224h15 = c0655v13.L;
        if (z2) {
            c0224h15.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.d.L.a(c0224h14, 0);
        }
        if (c0075cc.S0 != 3 || c0655v13.E) {
            c0655v7 = c0655v13;
            break;
        }
        int i23 = 0;
        while (true) {
            if (i23 < i7) {
                int i24 = this.n + (z ? (i7 - 1) - i23 : i23);
                if (i24 < c0075cc.b1) {
                    c0655v7 = c0075cc.a1[i24];
                    if (c0655v7.E) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
            c0655v7 = c0655v13;
            break;
        }
        int i25 = 0;
        C0655v7 c0655v14 = null;
        while (i25 < i7) {
            int i26 = z ? (i7 - 1) - i25 : i25;
            int i27 = this.n + i26;
            if (i27 >= c0075cc.b1) {
                return;
            }
            C0655v7 c0655v15 = c0075cc.a1[i27];
            if (c0655v15 == null) {
                i7 = i7;
                c = 3;
            } else {
                C0224h7 c0224h16 = c0655v15.I;
                if (i25 == 0) {
                    c0655v15.f(c0224h16, this.d, this.h);
                }
                if (i26 == 0) {
                    int i28 = c0075cc.D0;
                    float f3 = z ? 1.0f - c0075cc.J0 : c0075cc.J0;
                    if (this.n == 0 && (i5 = c0075cc.F0) != -1) {
                        f = z ? 1.0f - c0075cc.L0 : c0075cc.L0;
                        i4 = i5;
                    } else if (!z2 || (i4 = c0075cc.H0) == -1) {
                        i4 = i28;
                        f = f3;
                    } else {
                        f = z ? 1.0f - c0075cc.N0 : c0075cc.N0;
                    }
                    c0655v15.i0 = i4;
                    c0655v15.d0 = f;
                }
                if (i25 == i7 - 1) {
                    c0655v15.f(c0655v15.K, this.f, this.j);
                }
                if (c0655v14 != null) {
                    int i29 = c0075cc.P0;
                    C0224h7 c0224h17 = c0655v14.K;
                    c0224h16.a(c0224h17, i29);
                    if (i25 == i9) {
                        int i30 = this.h;
                        if (c0224h16.h()) {
                            c0224h16.h = i30;
                        }
                    }
                    c0224h17.a(c0224h16, 0);
                    if (i25 == i10 + 1) {
                        int i31 = this.j;
                        if (c0224h17.h()) {
                            c0224h17.h = i31;
                        }
                    }
                }
                if (c0655v15 != c0655v13) {
                    int i32 = c0075cc.S0;
                    c = 3;
                    if (i32 == 3 && c0655v7.E && c0655v15 != c0655v7 && c0655v15.E) {
                        c0655v15.M.a(c0655v7.M, 0);
                    } else {
                        C0224h7 c0224h18 = c0655v15.J;
                        if (i32 != 0) {
                            C0224h7 c0224h19 = c0655v15.L;
                            if (i32 == 1) {
                                c0224h19.a(c0224h15, 0);
                            } else if (z3) {
                                c0224h18.a(this.e, this.i);
                                c0224h19.a(this.g, this.k);
                            } else {
                                c0224h18.a(c0224h14, 0);
                                c0224h19.a(c0224h15, 0);
                            }
                        } else {
                            c0224h18.a(c0224h14, 0);
                        }
                    }
                } else {
                    c = 3;
                }
                c0655v14 = c0655v15;
            }
            i25++;
            i7 = i7;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.Q0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.P0 : this.l;
    }

    public final void e(int i) {
        C0075cc c0075cc;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c0075cc = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= c0075cc.b1) {
                break;
            }
            C0655v7 c0655v7 = c0075cc.a1[i2];
            if (this.a == 0) {
                if (c0655v7 != null) {
                    int[] iArr = c0655v7.p0;
                    if (iArr[0] == 3 && c0655v7.r == 0) {
                        c0075cc.W(1, i5, iArr[1], c0655v7.k(), c0655v7);
                    }
                }
            } else if (c0655v7 != null) {
                int[] iArr2 = c0655v7.p0;
                if (iArr2[1] == 3 && c0655v7.s == 0) {
                    c0075cc.W(iArr2[0], c0655v7.q(), 1, i5, c0655v7);
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i7 = this.o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.n + i8;
            if (i9 >= c0075cc.b1) {
                return;
            }
            C0655v7 c0655v8 = c0075cc.a1[i9];
            if (this.a == 0) {
                int iQ = c0655v8.q();
                int i10 = c0075cc.P0;
                if (c0655v8.g0 == 8) {
                    i10 = 0;
                }
                this.l = iQ + i10 + this.l;
                int iT = c0075cc.T(c0655v8, this.q);
                if (this.b == null || this.c < iT) {
                    this.b = c0655v8;
                    this.c = iT;
                    this.m = iT;
                }
            } else {
                int iU = c0075cc.U(c0655v8, this.q);
                int iT2 = c0075cc.T(c0655v8, this.q);
                int i11 = c0075cc.Q0;
                if (c0655v8.g0 == 8) {
                    i11 = 0;
                }
                this.m = iT2 + i11 + this.m;
                if (this.b == null || this.c < iU) {
                    this.b = c0655v8;
                    this.c = iU;
                    this.l = iU;
                }
            }
        }
    }

    public final void f(int i, C0224h7 c0224h7, C0224h7 c0224h8, C0224h7 c0224h9, C0224h7 c0224h10, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = c0224h7;
        this.e = c0224h8;
        this.f = c0224h9;
        this.g = c0224h10;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
