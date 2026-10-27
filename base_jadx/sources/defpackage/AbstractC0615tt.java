package defpackage;

/* JADX INFO: renamed from: tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0615tt implements V8 {
    public int a;
    public C0655v7 b;
    public C0300jn c;
    public int d;
    public final C0226h9 e = new C0226h9(this);
    public int f = 0;
    public boolean g = false;
    public final X8 h = new X8(this);
    public final X8 i = new X8(this);
    public int j = 1;

    public AbstractC0615tt(C0655v7 c0655v7) {
        this.b = c0655v7;
    }

    public static void b(X8 x8, X8 x9, int i) {
        x8.l.add(x9);
        x8.f = i;
        x9.k.add(x8);
    }

    public static X8 h(C0224h7 c0224h7) {
        C0224h7 c0224h8 = c0224h7.f;
        if (c0224h8 == null) {
            return null;
        }
        int iO = Vo.o(c0224h8.e);
        C0655v7 c0655v7 = c0224h8.d;
        if (iO == 1) {
            return c0655v7.d.h;
        }
        if (iO == 2) {
            return c0655v7.e.h;
        }
        if (iO == 3) {
            return c0655v7.d.i;
        }
        if (iO == 4) {
            return c0655v7.e.i;
        }
        if (iO != 5) {
            return null;
        }
        return c0655v7.e.k;
    }

    public static X8 i(C0224h7 c0224h7, int i) {
        C0224h7 c0224h8 = c0224h7.f;
        if (c0224h8 == null) {
            return null;
        }
        C0655v7 c0655v7 = c0224h8.d;
        AbstractC0615tt abstractC0615tt = i == 0 ? c0655v7.d : c0655v7.e;
        int iO = Vo.o(c0224h8.e);
        if (iO == 1 || iO == 2) {
            return abstractC0615tt.h;
        }
        if (iO == 3 || iO == 4) {
            return abstractC0615tt.i;
        }
        return null;
    }

    public final void c(X8 x8, X8 x9, int i, C0226h9 c0226h9) {
        x8.l.add(x9);
        x8.l.add(this.e);
        x8.h = i;
        x8.i = c0226h9;
        x9.k.add(x8);
        c0226h9.k.add(x8);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C0655v7 c0655v7 = this.b;
            int i3 = c0655v7.v;
            iMax = Math.max(c0655v7.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C0655v7 c0655v8 = this.b;
            int i4 = c0655v8.y;
            iMax = Math.max(c0655v8.x, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long j() {
        C0226h9 c0226h9 = this.e;
        if (c0226h9.j) {
            return c0226h9.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(C0224h7 c0224h7, C0224h7 c0224h8, int i) {
        C0226h9 c0226h9;
        float f;
        int i2;
        X8 x8H = h(c0224h7);
        X8 x8H2 = h(c0224h8);
        if (x8H.j && x8H2.j) {
            int iE = c0224h7.e() + x8H.g;
            int iE2 = x8H2.g - c0224h8.e();
            int i3 = iE2 - iE;
            C0226h9 c0226h10 = this.e;
            if (!c0226h10.j && this.d == 3) {
                int i4 = this.a;
                if (i4 == 0) {
                    c0226h10.d(g(i3, i));
                } else if (i4 == 1) {
                    c0226h10.d(Math.min(g(c0226h10.m, i), i3));
                } else if (i4 == 2) {
                    C0655v7 c0655v7 = this.b;
                    C0655v7 c0655v8 = c0655v7.T;
                    if (c0655v8 != null) {
                        C0226h9 c0226h11 = (i == 0 ? c0655v8.d : c0655v8.e).e;
                        if (c0226h11.j) {
                            c0226h10.d(g((int) ((c0226h11.g * (i == 0 ? c0655v7.w : c0655v7.z)) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3) {
                    C0655v7 c0655v9 = this.b;
                    AbstractC0615tt abstractC0615tt = c0655v9.d;
                    if (abstractC0615tt.d == 3 && abstractC0615tt.a == 3) {
                        C0336ks c0336ks = c0655v9.e;
                        if (c0336ks.d != 3 || c0336ks.a != 3) {
                            if (i == 0) {
                                abstractC0615tt = c0655v9.e;
                            }
                            c0226h9 = abstractC0615tt.e;
                            if (c0226h9.j) {
                                f = c0655v9.W;
                                if (i == 1) {
                                    i2 = (int) ((c0226h9.g / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c0226h9.g) + 0.5f);
                                }
                                c0226h10.d(i2);
                            }
                        }
                    } else {
                        if (i == 0) {
                            abstractC0615tt = c0655v9.e;
                        }
                        c0226h9 = abstractC0615tt.e;
                        if (c0226h9.j) {
                            f = c0655v9.W;
                            if (i == 1) {
                                i2 = (int) ((c0226h9.g / f) + 0.5f);
                            } else {
                                i2 = (int) ((f * c0226h9.g) + 0.5f);
                            }
                            c0226h10.d(i2);
                        }
                    }
                }
            }
            if (c0226h10.j) {
                int i5 = c0226h10.g;
                X8 x8 = this.i;
                X8 x9 = this.h;
                if (i5 == i3) {
                    x9.d(iE);
                    x8.d(iE2);
                    return;
                }
                C0655v7 c0655v10 = this.b;
                float f2 = i == 0 ? c0655v10.d0 : c0655v10.e0;
                if (x8H == x8H2) {
                    iE = x8H.g;
                    iE2 = x8H2.g;
                    f2 = 0.5f;
                }
                x9.d((int) ((((iE2 - iE) - i5) * f2) + iE + 0.5f));
                x8.d(x9.g + c0226h10.g);
            }
        }
    }
}
