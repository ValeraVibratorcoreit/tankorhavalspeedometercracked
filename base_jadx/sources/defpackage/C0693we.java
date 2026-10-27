package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0693we extends AbstractC0615tt {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0267  */
    /* JADX WARN: Code duplicated, block: B:120:0x0276  */
    @Override // defpackage.V8
    public final void a(V8 v8) {
        int iG;
        int i;
        int iG2;
        float f;
        float f2;
        float f3;
        int i2;
        if (Vo.o(this.j) == 3) {
            C0655v7 c0655v7 = this.b;
            l(c0655v7.I, c0655v7.K, 0);
            return;
        }
        C0226h9 c0226h9 = this.e;
        boolean z = c0226h9.j;
        X8 x8 = this.h;
        X8 x9 = this.i;
        if (!z && this.d == 3) {
            C0655v7 c0655v8 = this.b;
            int i3 = c0655v8.r;
            if (i3 == 2) {
                C0655v7 c0655v9 = c0655v8.T;
                if (c0655v9 != null) {
                    C0226h9 c0226h10 = c0655v9.d.e;
                    if (c0226h10.j) {
                        c0226h9.d((int) ((c0226h10.g * c0655v8.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c0655v8.s;
                if (i4 == 0 || i4 == 3) {
                    C0336ks c0336ks = c0655v8.e;
                    X8 x10 = c0336ks.h;
                    X8 x11 = c0336ks.i;
                    boolean z2 = c0655v8.I.f != null;
                    boolean z3 = c0655v8.J.f != null;
                    boolean z4 = c0655v8.K.f != null;
                    boolean z5 = c0655v8.L.f != null;
                    int i5 = c0655v8.X;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = c0655v8.W;
                        boolean z6 = x10.j;
                        int[] iArr = k;
                        if (z6 && x11.j) {
                            if (x8.c && x9.c) {
                                m(iArr, ((X8) x8.l.get(0)).g + x8.f, ((X8) x9.l.get(0)).g - x9.f, x10.g + x10.f, x11.g - x11.f, f4, i5);
                                c0226h9.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z7 = x8.j;
                        ArrayList arrayList = x10.l;
                        if (z7 && x9.j) {
                            if (!x10.c || !x11.c) {
                                return;
                            }
                            m(iArr, x8.g + x8.f, x9.g - x9.f, ((X8) arrayList.get(0)).g + x10.f, ((X8) x11.l.get(0)).g - x11.f, f4, i5);
                            c0226h9.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!x8.c || !x9.c || !x10.c || !x11.c) {
                            return;
                        }
                        m(iArr, ((X8) x8.l.get(0)).g + x8.f, ((X8) x9.l.get(0)).g - x9.f, ((X8) arrayList.get(0)).g + x10.f, ((X8) x11.l.get(0)).g - x11.f, f4, i5);
                        c0226h9.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!x8.c || !x9.c) {
                            return;
                        }
                        float f5 = c0655v8.W;
                        int i6 = ((X8) x8.l.get(0)).g + x8.f;
                        int i7 = ((X8) x9.l.get(0)).g - x9.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f5) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f5) + 0.5f);
                            }
                            c0226h9.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f5) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f5) + 0.5f);
                            }
                            c0226h9.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!x10.c || !x11.c) {
                            return;
                        }
                        float f6 = c0655v8.W;
                        int i10 = ((X8) x10.l.get(0)).g + x10.f;
                        int i11 = ((X8) x11.l.get(0)).g - x11.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f6) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f6) + 0.5f);
                            }
                            c0226h9.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f6) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f6) + 0.5f);
                            }
                            c0226h9.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f6) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f6) + 0.5f);
                            }
                            c0226h9.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = c0655v8.X;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f3 = c0655v8.e.e.g / c0655v8.W;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f = c0655v8.e.e.g;
                            f2 = c0655v8.W;
                        }
                        c0226h9.d(i2);
                    } else {
                        f = c0655v8.e.e.g;
                        f2 = c0655v8.W;
                    }
                    f3 = f * f2;
                    i2 = (int) (f3 + 0.5f);
                    c0226h9.d(i2);
                }
            }
        }
        if (x8.c && x9.c) {
            if (x8.j && x9.j && c0226h9.j) {
                return;
            }
            if (!c0226h9.j && this.d == 3) {
                C0655v7 c0655v10 = this.b;
                if (c0655v10.r == 0 && !c0655v10.x()) {
                    X8 x12 = (X8) x8.l.get(0);
                    X8 x13 = (X8) x9.l.get(0);
                    int i14 = x12.g + x8.f;
                    int i15 = x13.g + x9.f;
                    x8.d(i14);
                    x9.d(i15);
                    c0226h9.d(i15 - i14);
                    return;
                }
            }
            if (!c0226h9.j && this.d == 3 && this.a == 1 && x8.l.size() > 0 && x9.l.size() > 0) {
                int iMin = Math.min((((X8) x9.l.get(0)).g + x9.f) - (((X8) x8.l.get(0)).g + x8.f), c0226h9.m);
                C0655v7 c0655v11 = this.b;
                int i16 = c0655v11.v;
                int iMax = Math.max(c0655v11.u, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                c0226h9.d(iMax);
            }
            if (c0226h9.j) {
                X8 x14 = (X8) x8.l.get(0);
                X8 x15 = (X8) x9.l.get(0);
                int i17 = x14.g;
                int i18 = x8.f + i17;
                int i19 = x15.g;
                int i20 = x9.f + i19;
                float f7 = this.b.d0;
                if (x14 == x15) {
                    f7 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                x8.d((int) ((((i19 - i17) - c0226h9.g) * f7) + i17 + 0.5f));
                x9.d(x8.g + c0226h9.g);
            }
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void d() {
        C0655v7 c0655v7;
        C0655v7 c0655v8;
        int i;
        C0655v7 c0655v9;
        C0655v7 c0655v10;
        int i2;
        C0655v7 c0655v11 = this.b;
        boolean z = c0655v11.a;
        C0226h9 c0226h9 = this.e;
        if (z) {
            c0226h9.d(c0655v11.q());
        }
        boolean z2 = c0226h9.j;
        X8 x8 = this.i;
        X8 x9 = this.h;
        if (!z2) {
            C0655v7 c0655v12 = this.b;
            int i3 = c0655v12.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0655v10 = c0655v12.T) != null && ((i2 = c0655v10.p0[0]) == 1 || i2 == 4)) {
                    int iQ = (c0655v10.q() - this.b.I.e()) - this.b.K.e();
                    AbstractC0615tt.b(x9, c0655v10.d.h, this.b.I.e());
                    AbstractC0615tt.b(x8, c0655v10.d.i, -this.b.K.e());
                    c0226h9.d(iQ);
                    return;
                }
                if (i3 == 1) {
                    c0226h9.d(c0655v12.q());
                }
            }
        } else if (this.d == 4 && (c0655v8 = (c0655v7 = this.b).T) != null && ((i = c0655v8.p0[0]) == 1 || i == 4)) {
            AbstractC0615tt.b(x9, c0655v8.d.h, c0655v7.I.e());
            AbstractC0615tt.b(x8, c0655v8.d.i, -this.b.K.e());
            return;
        }
        if (c0226h9.j) {
            C0655v7 c0655v13 = this.b;
            if (c0655v13.a) {
                C0224h7[] c0224h7Arr = c0655v13.Q;
                C0224h7 c0224h7 = c0224h7Arr[0];
                C0224h7 c0224h8 = c0224h7.f;
                if (c0224h8 != null && c0224h7Arr[1].f != null) {
                    if (c0655v13.x()) {
                        x9.f = this.b.Q[0].e();
                        x8.f = -this.b.Q[1].e();
                        return;
                    }
                    X8 x8H = AbstractC0615tt.h(this.b.Q[0]);
                    if (x8H != null) {
                        AbstractC0615tt.b(x9, x8H, this.b.Q[0].e());
                    }
                    X8 x8H2 = AbstractC0615tt.h(this.b.Q[1]);
                    if (x8H2 != null) {
                        AbstractC0615tt.b(x8, x8H2, -this.b.Q[1].e());
                    }
                    x9.b = true;
                    x8.b = true;
                    return;
                }
                if (c0224h8 != null) {
                    X8 x8H3 = AbstractC0615tt.h(c0224h7);
                    if (x8H3 != null) {
                        AbstractC0615tt.b(x9, x8H3, this.b.Q[0].e());
                        AbstractC0615tt.b(x8, x9, c0226h9.g);
                        return;
                    }
                    return;
                }
                C0224h7 c0224h9 = c0224h7Arr[1];
                if (c0224h9.f != null) {
                    X8 x8H4 = AbstractC0615tt.h(c0224h9);
                    if (x8H4 != null) {
                        AbstractC0615tt.b(x8, x8H4, -this.b.Q[1].e());
                        AbstractC0615tt.b(x9, x8, -c0226h9.g);
                        return;
                    }
                    return;
                }
                if ((c0655v13 instanceof AbstractC0662ve) || c0655v13.T == null || c0655v13.i(7).f != null) {
                    return;
                }
                C0655v7 c0655v14 = this.b;
                AbstractC0615tt.b(x9, c0655v14.T.d.h, c0655v14.r());
                AbstractC0615tt.b(x8, x9, c0226h9.g);
                return;
            }
        }
        if (this.d == 3) {
            C0655v7 c0655v15 = this.b;
            int i4 = c0655v15.r;
            if (i4 == 2) {
                C0655v7 c0655v16 = c0655v15.T;
                if (c0655v16 != null) {
                    C0226h9 c0226h10 = c0655v16.e.e;
                    c0226h9.l.add(c0226h10);
                    c0226h10.k.add(c0226h9);
                    c0226h9.b = true;
                    c0226h9.k.add(x9);
                    c0226h9.k.add(x8);
                }
            } else if (i4 == 3) {
                if (c0655v15.s == 3) {
                    x9.a = this;
                    x8.a = this;
                    C0336ks c0336ks = c0655v15.e;
                    c0336ks.h.a = this;
                    c0336ks.i.a = this;
                    c0226h9.a = this;
                    if (c0655v15.y()) {
                        c0226h9.l.add(this.b.e.e);
                        this.b.e.e.k.add(c0226h9);
                        C0336ks c0336ks2 = this.b.e;
                        c0336ks2.e.a = this;
                        c0226h9.l.add(c0336ks2.h);
                        c0226h9.l.add(this.b.e.i);
                        this.b.e.h.k.add(c0226h9);
                        this.b.e.i.k.add(c0226h9);
                    } else if (this.b.x()) {
                        this.b.e.e.l.add(c0226h9);
                        c0226h9.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(c0226h9);
                    }
                } else {
                    C0226h9 c0226h11 = c0655v15.e.e;
                    c0226h9.l.add(c0226h11);
                    c0226h11.k.add(c0226h9);
                    this.b.e.h.k.add(c0226h9);
                    this.b.e.i.k.add(c0226h9);
                    c0226h9.b = true;
                    c0226h9.k.add(x9);
                    c0226h9.k.add(x8);
                    x9.l.add(c0226h9);
                    x8.l.add(c0226h9);
                }
            }
        }
        C0655v7 c0655v17 = this.b;
        C0224h7[] c0224h7Arr2 = c0655v17.Q;
        C0224h7 c0224h10 = c0224h7Arr2[0];
        C0224h7 c0224h11 = c0224h10.f;
        if (c0224h11 != null && c0224h7Arr2[1].f != null) {
            if (c0655v17.x()) {
                x9.f = this.b.Q[0].e();
                x8.f = -this.b.Q[1].e();
                return;
            }
            X8 x8H5 = AbstractC0615tt.h(this.b.Q[0]);
            X8 x8H6 = AbstractC0615tt.h(this.b.Q[1]);
            if (x8H5 != null) {
                x8H5.b(this);
            }
            if (x8H6 != null) {
                x8H6.b(this);
            }
            this.j = 4;
            return;
        }
        if (c0224h11 != null) {
            X8 x8H7 = AbstractC0615tt.h(c0224h10);
            if (x8H7 != null) {
                AbstractC0615tt.b(x9, x8H7, this.b.Q[0].e());
                c(x8, x9, 1, c0226h9);
                return;
            }
            return;
        }
        C0224h7 c0224h12 = c0224h7Arr2[1];
        if (c0224h12.f != null) {
            X8 x8H8 = AbstractC0615tt.h(c0224h12);
            if (x8H8 != null) {
                AbstractC0615tt.b(x8, x8H8, -this.b.Q[1].e());
                c(x9, x8, -1, c0226h9);
                return;
            }
            return;
        }
        if ((c0655v17 instanceof AbstractC0662ve) || (c0655v9 = c0655v17.T) == null) {
            return;
        }
        AbstractC0615tt.b(x9, c0655v9.d.h, c0655v17.r());
        c(x8, x9, 1, c0226h9);
    }

    @Override // defpackage.AbstractC0615tt
    public final void e() {
        X8 x8 = this.h;
        if (x8.j) {
            this.b.Y = x8.g;
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.AbstractC0615tt
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        X8 x8 = this.h;
        x8.c();
        x8.j = false;
        X8 x9 = this.i;
        x9.c();
        x9.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
