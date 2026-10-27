package defpackage;

/* JADX INFO: renamed from: ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0336ks extends AbstractC0615tt {
    public X8 k;
    public C0252i4 l;

    @Override // defpackage.V8
    public final void a(V8 v8) {
        float f;
        float f2;
        float f3;
        int i;
        if (Vo.o(this.j) == 3) {
            C0655v7 c0655v7 = this.b;
            l(c0655v7.J, c0655v7.L, 1);
            return;
        }
        C0226h9 c0226h9 = this.e;
        if (c0226h9.c && !c0226h9.j && this.d == 3) {
            C0655v7 c0655v8 = this.b;
            int i2 = c0655v8.s;
            if (i2 == 2) {
                C0655v7 c0655v9 = c0655v8.T;
                if (c0655v9 != null) {
                    C0226h9 c0226h10 = c0655v9.e.e;
                    if (c0226h10.j) {
                        c0226h9.d((int) ((c0226h10.g * c0655v8.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0226h9 c0226h11 = c0655v8.d.e;
                if (c0226h11.j) {
                    int i3 = c0655v8.X;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c0226h11.g * c0655v8.W;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c0226h11.g;
                            f2 = c0655v8.W;
                        }
                        c0226h9.d(i);
                    } else {
                        f = c0226h11.g;
                        f2 = c0655v8.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0226h9.d(i);
                }
            }
        }
        X8 x8 = this.h;
        if (x8.c) {
            X8 x9 = this.i;
            if (x9.c) {
                if (x8.j && x9.j && c0226h9.j) {
                    return;
                }
                if (!c0226h9.j && this.d == 3) {
                    C0655v7 c0655v10 = this.b;
                    if (c0655v10.r == 0 && !c0655v10.y()) {
                        X8 x10 = (X8) x8.l.get(0);
                        X8 x11 = (X8) x9.l.get(0);
                        int i4 = x10.g + x8.f;
                        int i5 = x11.g + x9.f;
                        x8.d(i4);
                        x9.d(i5);
                        c0226h9.d(i5 - i4);
                        return;
                    }
                }
                if (!c0226h9.j && this.d == 3 && this.a == 1 && x8.l.size() > 0 && x9.l.size() > 0) {
                    X8 x12 = (X8) x8.l.get(0);
                    int i6 = (((X8) x9.l.get(0)).g + x9.f) - (x12.g + x8.f);
                    int i7 = c0226h9.m;
                    if (i6 < i7) {
                        c0226h9.d(i6);
                    } else {
                        c0226h9.d(i7);
                    }
                }
                if (c0226h9.j && x8.l.size() > 0 && x9.l.size() > 0) {
                    X8 x13 = (X8) x8.l.get(0);
                    X8 x14 = (X8) x9.l.get(0);
                    int i8 = x13.g;
                    int i9 = x8.f + i8;
                    int i10 = x14.g;
                    int i11 = x9.f + i10;
                    float f4 = this.b.e0;
                    if (x13 == x14) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    x8.d((int) ((((i10 - i8) - c0226h9.g) * f4) + i8 + 0.5f));
                    x9.d(x8.g + c0226h9.g);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void d() {
        C0655v7 c0655v7;
        C0655v7 c0655v8;
        C0655v7 c0655v9;
        C0655v7 c0655v10;
        C0655v7 c0655v11 = this.b;
        boolean z = c0655v11.a;
        C0226h9 c0226h9 = this.e;
        if (z) {
            c0226h9.d(c0655v11.k());
        }
        boolean z2 = c0226h9.j;
        X8 x8 = this.i;
        X8 x9 = this.h;
        if (!z2) {
            C0655v7 c0655v12 = this.b;
            this.d = c0655v12.p0[1];
            if (c0655v12.E) {
                this.l = new C0252i4(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0655v10 = this.b.T) != null && c0655v10.p0[1] == 1) {
                    int iK = (c0655v10.k() - this.b.J.e()) - this.b.L.e();
                    AbstractC0615tt.b(x9, c0655v10.e.h, this.b.J.e());
                    AbstractC0615tt.b(x8, c0655v10.e.i, -this.b.L.e());
                    c0226h9.d(iK);
                    return;
                }
                if (i == 1) {
                    c0226h9.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (c0655v8 = (c0655v7 = this.b).T) != null && c0655v8.p0[1] == 1) {
            AbstractC0615tt.b(x9, c0655v8.e.h, c0655v7.J.e());
            AbstractC0615tt.b(x8, c0655v8.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = c0226h9.j;
        X8 x10 = this.k;
        if (z3) {
            C0655v7 c0655v13 = this.b;
            if (c0655v13.a) {
                C0224h7[] c0224h7Arr = c0655v13.Q;
                C0224h7 c0224h7 = c0224h7Arr[2];
                C0224h7 c0224h8 = c0224h7.f;
                if (c0224h8 != null && c0224h7Arr[3].f != null) {
                    if (c0655v13.y()) {
                        x9.f = this.b.Q[2].e();
                        x8.f = -this.b.Q[3].e();
                    } else {
                        X8 x8H = AbstractC0615tt.h(this.b.Q[2]);
                        if (x8H != null) {
                            AbstractC0615tt.b(x9, x8H, this.b.Q[2].e());
                        }
                        X8 x8H2 = AbstractC0615tt.h(this.b.Q[3]);
                        if (x8H2 != null) {
                            AbstractC0615tt.b(x8, x8H2, -this.b.Q[3].e());
                        }
                        x9.b = true;
                        x8.b = true;
                    }
                    C0655v7 c0655v14 = this.b;
                    if (c0655v14.E) {
                        AbstractC0615tt.b(x10, x9, c0655v14.a0);
                        return;
                    }
                    return;
                }
                if (c0224h8 != null) {
                    X8 x8H3 = AbstractC0615tt.h(c0224h7);
                    if (x8H3 != null) {
                        AbstractC0615tt.b(x9, x8H3, this.b.Q[2].e());
                        AbstractC0615tt.b(x8, x9, c0226h9.g);
                        C0655v7 c0655v15 = this.b;
                        if (c0655v15.E) {
                            AbstractC0615tt.b(x10, x9, c0655v15.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0224h7 c0224h9 = c0224h7Arr[3];
                if (c0224h9.f != null) {
                    X8 x8H4 = AbstractC0615tt.h(c0224h9);
                    if (x8H4 != null) {
                        AbstractC0615tt.b(x8, x8H4, -this.b.Q[3].e());
                        AbstractC0615tt.b(x9, x8, -c0226h9.g);
                    }
                    C0655v7 c0655v16 = this.b;
                    if (c0655v16.E) {
                        AbstractC0615tt.b(x10, x9, c0655v16.a0);
                        return;
                    }
                    return;
                }
                C0224h7 c0224h10 = c0224h7Arr[4];
                if (c0224h10.f != null) {
                    X8 x8H5 = AbstractC0615tt.h(c0224h10);
                    if (x8H5 != null) {
                        AbstractC0615tt.b(x10, x8H5, 0);
                        AbstractC0615tt.b(x9, x10, -this.b.a0);
                        AbstractC0615tt.b(x8, x9, c0226h9.g);
                        return;
                    }
                    return;
                }
                if ((c0655v13 instanceof AbstractC0662ve) || c0655v13.T == null || c0655v13.i(7).f != null) {
                    return;
                }
                C0655v7 c0655v17 = this.b;
                AbstractC0615tt.b(x9, c0655v17.T.e.h, c0655v17.s());
                AbstractC0615tt.b(x8, x9, c0226h9.g);
                C0655v7 c0655v18 = this.b;
                if (c0655v18.E) {
                    AbstractC0615tt.b(x10, x9, c0655v18.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            c0226h9.b(this);
        } else {
            C0655v7 c0655v19 = this.b;
            int i2 = c0655v19.s;
            if (i2 == 2) {
                C0655v7 c0655v20 = c0655v19.T;
                if (c0655v20 != null) {
                    C0226h9 c0226h10 = c0655v20.e.e;
                    c0226h9.l.add(c0226h10);
                    c0226h10.k.add(c0226h9);
                    c0226h9.b = true;
                    c0226h9.k.add(x9);
                    c0226h9.k.add(x8);
                }
            } else if (i2 == 3 && !c0655v19.y()) {
                C0655v7 c0655v21 = this.b;
                if (c0655v21.r != 3) {
                    C0226h9 c0226h11 = c0655v21.d.e;
                    c0226h9.l.add(c0226h11);
                    c0226h11.k.add(c0226h9);
                    c0226h9.b = true;
                    c0226h9.k.add(x9);
                    c0226h9.k.add(x8);
                }
            }
        }
        C0655v7 c0655v22 = this.b;
        C0224h7[] c0224h7Arr2 = c0655v22.Q;
        C0224h7 c0224h11 = c0224h7Arr2[2];
        C0224h7 c0224h12 = c0224h11.f;
        if (c0224h12 != null && c0224h7Arr2[3].f != null) {
            if (c0655v22.y()) {
                x9.f = this.b.Q[2].e();
                x8.f = -this.b.Q[3].e();
            } else {
                X8 x8H6 = AbstractC0615tt.h(this.b.Q[2]);
                X8 x8H7 = AbstractC0615tt.h(this.b.Q[3]);
                if (x8H6 != null) {
                    x8H6.b(this);
                }
                if (x8H7 != null) {
                    x8H7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(x10, x9, 1, this.l);
            }
        } else if (c0224h12 != null) {
            X8 x8H8 = AbstractC0615tt.h(c0224h11);
            if (x8H8 != null) {
                AbstractC0615tt.b(x9, x8H8, this.b.Q[2].e());
                c(x8, x9, 1, c0226h9);
                if (this.b.E) {
                    c(x10, x9, 1, this.l);
                }
                if (this.d == 3) {
                    C0655v7 c0655v23 = this.b;
                    if (c0655v23.W > 0.0f) {
                        C0693we c0693we = c0655v23.d;
                        if (c0693we.d == 3) {
                            c0693we.e.k.add(c0226h9);
                            c0226h9.l.add(this.b.d.e);
                            c0226h9.a = this;
                        }
                    }
                }
            }
        } else {
            C0224h7 c0224h13 = c0224h7Arr2[3];
            if (c0224h13.f != null) {
                X8 x8H9 = AbstractC0615tt.h(c0224h13);
                if (x8H9 != null) {
                    AbstractC0615tt.b(x8, x8H9, -this.b.Q[3].e());
                    c(x9, x8, -1, c0226h9);
                    if (this.b.E) {
                        c(x10, x9, 1, this.l);
                    }
                }
            } else {
                C0224h7 c0224h14 = c0224h7Arr2[4];
                if (c0224h14.f != null) {
                    X8 x8H10 = AbstractC0615tt.h(c0224h14);
                    if (x8H10 != null) {
                        AbstractC0615tt.b(x10, x8H10, 0);
                        c(x9, x10, -1, this.l);
                        c(x8, x9, 1, c0226h9);
                    }
                } else if (!(c0655v22 instanceof AbstractC0662ve) && (c0655v9 = c0655v22.T) != null) {
                    AbstractC0615tt.b(x9, c0655v9.e.h, c0655v22.s());
                    c(x8, x9, 1, c0226h9);
                    if (this.b.E) {
                        c(x10, x9, 1, this.l);
                    }
                    if (this.d == 3) {
                        C0655v7 c0655v24 = this.b;
                        if (c0655v24.W > 0.0f) {
                            C0693we c0693we2 = c0655v24.d;
                            if (c0693we2.d == 3) {
                                c0693we2.e.k.add(c0226h9);
                                c0226h9.l.add(this.b.d.e);
                                c0226h9.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0226h9.l.size() == 0) {
            c0226h9.c = true;
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void e() {
        X8 x8 = this.h;
        if (x8.j) {
            this.b.Z = x8.g;
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.AbstractC0615tt
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        X8 x8 = this.h;
        x8.c();
        x8.j = false;
        X8 x9 = this.i;
        x9.c();
        x9.j = false;
        X8 x10 = this.k;
        x10.c();
        x10.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
