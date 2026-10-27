package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class W8 {
    public C0686w7 a;
    public boolean b;
    public boolean c;
    public C0686w7 d;
    public ArrayList e;
    public C0377m7 f;
    public C0343l4 g;
    public ArrayList h;

    public final void a(X8 x8, int i, ArrayList arrayList, C0300jn c0300jn) {
        AbstractC0615tt abstractC0615tt = x8.d;
        if (abstractC0615tt.c == null) {
            C0686w7 c0686w7 = this.a;
            if (abstractC0615tt == c0686w7.d || abstractC0615tt == c0686w7.e) {
                return;
            }
            if (c0300jn == null) {
                c0300jn = new C0300jn();
                c0300jn.a = null;
                c0300jn.b = new ArrayList();
                c0300jn.a = abstractC0615tt;
                arrayList.add(c0300jn);
            }
            abstractC0615tt.c = c0300jn;
            c0300jn.b.add(abstractC0615tt);
            X8 x9 = abstractC0615tt.h;
            for (V8 v8 : x9.k) {
                if (v8 instanceof X8) {
                    a((X8) v8, i, arrayList, c0300jn);
                }
            }
            X8 x10 = abstractC0615tt.i;
            for (V8 v9 : x10.k) {
                if (v9 instanceof X8) {
                    a((X8) v9, i, arrayList, c0300jn);
                }
            }
            if (i == 1 && (abstractC0615tt instanceof C0336ks)) {
                for (V8 v10 : ((C0336ks) abstractC0615tt).k.k) {
                    if (v10 instanceof X8) {
                        a((X8) v10, i, arrayList, c0300jn);
                    }
                }
            }
            Iterator it = x9.l.iterator();
            while (it.hasNext()) {
                a((X8) it.next(), i, arrayList, c0300jn);
            }
            Iterator it2 = x10.l.iterator();
            while (it2.hasNext()) {
                a((X8) it2.next(), i, arrayList, c0300jn);
            }
            if (i == 1 && (abstractC0615tt instanceof C0336ks)) {
                Iterator it3 = ((C0336ks) abstractC0615tt).k.l.iterator();
                while (it3.hasNext()) {
                    a((X8) it3.next(), i, arrayList, c0300jn);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:114:0x0232  */
    /* JADX WARN: Code duplicated, block: B:156:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01fc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0239 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0185  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a8  */
    public final void b(C0686w7 c0686w7) {
        int iQ;
        int iK;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        for (C0655v7 c0655v7 : c0686w7.q0) {
            int[] iArr = c0655v7.p0;
            int i6 = iArr[0];
            int i7 = iArr[1];
            if (c0655v7.g0 == 8) {
                c0655v7.a = true;
            } else {
                float f2 = c0655v7.w;
                if (f2 < 1.0f && i6 == 3) {
                    c0655v7.r = 2;
                }
                float f3 = c0655v7.z;
                if (f3 < 1.0f && i7 == 3) {
                    c0655v7.s = 2;
                }
                if (c0655v7.W > 0.0f) {
                    if (i6 == 3 && (i7 == 2 || i7 == 1)) {
                        c0655v7.r = 3;
                    } else if (i7 == 3 && (i6 == 2 || i6 == 1)) {
                        c0655v7.s = 3;
                    } else if (i6 == 3 && i7 == 3) {
                        if (c0655v7.r == 0) {
                            c0655v7.r = 3;
                        }
                        if (c0655v7.s == 0) {
                            c0655v7.s = 3;
                        }
                    }
                }
                C0224h7 c0224h7 = c0655v7.K;
                C0224h7 c0224h8 = c0655v7.I;
                if (i6 == 3 && c0655v7.r == 1 && (c0224h8.f == null || c0224h7.f == null)) {
                    i6 = 2;
                }
                C0224h7 c0224h9 = c0655v7.L;
                C0224h7 c0224h10 = c0655v7.J;
                int i8 = (i7 == 3 && c0655v7.s == 1 && (c0224h10.f == null || c0224h9.f == null)) ? 2 : i7;
                C0693we c0693we = c0655v7.d;
                c0693we.d = i6;
                int i9 = c0655v7.r;
                c0693we.a = i9;
                C0336ks c0336ks = c0655v7.e;
                c0336ks.d = i8;
                int i10 = c0655v7.s;
                c0336ks.a = i10;
                if ((i6 == 4 || i6 == 1 || i6 == 2) && (i8 == 4 || i8 == 1 || i8 == 2)) {
                    int iQ2 = c0655v7.q();
                    if (i6 == 4) {
                        iQ = (c0686w7.q() - c0224h8.g) - c0224h7.g;
                        i6 = 1;
                    } else {
                        iQ = iQ2;
                    }
                    int iK2 = c0655v7.k();
                    if (i8 == 4) {
                        iK = (c0686w7.k() - c0224h10.g) - c0224h9.g;
                        i = 1;
                    } else {
                        iK = iK2;
                        i = i8;
                    }
                    f(i6, iQ, i, iK, c0655v7);
                    c0655v7.d.e.d(c0655v7.q());
                    c0655v7.e.e.d(c0655v7.k());
                    c0655v7.a = true;
                } else {
                    int[] iArr2 = c0686w7.p0;
                    C0224h7[] c0224h7Arr = c0655v7.Q;
                    if (i6 != 3 || (i8 != 2 && i8 != 1)) {
                        i2 = 3;
                        if (i8 == i2) {
                            if (i6 == 2 && i6 != 1) {
                                i4 = i2;
                                i3 = 1;
                                if (i6 != i4 && i8 == i4) {
                                    if (i9 == i3 || i10 == i3) {
                                        f(2, 0, 2, 0, c0655v7);
                                        c0655v7.d.e.m = c0655v7.q();
                                        c0655v7.e.e.m = c0655v7.k();
                                    } else if (i10 == 2 && i9 == 2 && iArr2[0] == 1 && iArr2[i3] == 1) {
                                        f(1, (int) ((f2 * c0686w7.q()) + 0.5f), 1, (int) ((f3 * c0686w7.k()) + 0.5f), c0655v7);
                                        c0655v7.d.e.d(c0655v7.q());
                                        c0655v7.e.e.d(c0655v7.k());
                                        c0655v7.a = true;
                                    }
                                }
                            } else if (i10 == i2) {
                                if (i6 == 2) {
                                    f(2, 0, 2, 0, c0655v7);
                                }
                                int iQ3 = c0655v7.q();
                                f = c0655v7.W;
                                if (c0655v7.X == -1) {
                                    f = 1.0f / f;
                                }
                                f(1, iQ3, 1, (int) ((iQ3 * f) + 0.5f), c0655v7);
                                c0655v7.d.e.d(c0655v7.q());
                                c0655v7.e.e.d(c0655v7.k());
                                c0655v7.a = true;
                            } else if (i10 == 1) {
                                f(i6, 0, 2, 0, c0655v7);
                                c0655v7.e.e.m = c0655v7.k();
                            } else if (i10 == 2) {
                                i5 = iArr2[1];
                                if (i5 != 1 || i5 == 4) {
                                    f(i6, c0655v7.q(), 1, (int) ((f3 * c0686w7.k()) + 0.5f), c0655v7);
                                    c0655v7.d.e.d(c0655v7.q());
                                    c0655v7.e.e.d(c0655v7.k());
                                    c0655v7.a = true;
                                }
                            } else if (c0224h7Arr[2].f != null || c0224h7Arr[3].f == null) {
                                f(2, 0, i8, 0, c0655v7);
                                c0655v7.d.e.d(c0655v7.q());
                                c0655v7.e.e.d(c0655v7.k());
                                c0655v7.a = true;
                            }
                        }
                        i3 = 1;
                        i4 = 3;
                        if (i6 != i4) {
                        }
                    } else if (i9 == 3) {
                        if (i8 == 2) {
                            f(2, 0, 2, 0, c0655v7);
                        }
                        int iK3 = c0655v7.k();
                        f(1, (int) ((iK3 * c0655v7.W) + 0.5f), 1, iK3, c0655v7);
                        c0655v7.d.e.d(c0655v7.q());
                        c0655v7.e.e.d(c0655v7.k());
                        c0655v7.a = true;
                    } else if (i9 == 1) {
                        f(2, 0, i8, 0, c0655v7);
                        c0655v7.d.e.m = c0655v7.q();
                    } else if (i9 == 2) {
                        int i11 = iArr2[0];
                        if (i11 == 1 || i11 == 4) {
                            f(1, (int) ((f2 * c0686w7.q()) + 0.5f), i8, c0655v7.k(), c0655v7);
                            c0655v7.d.e.d(c0655v7.q());
                            c0655v7.e.e.d(c0655v7.k());
                            c0655v7.a = true;
                        } else {
                            i2 = 3;
                            if (i8 == i2) {
                                if (i6 == 2) {
                                }
                                if (i10 == i2) {
                                    if (i6 == 2) {
                                        f(2, 0, 2, 0, c0655v7);
                                    }
                                    int iQ4 = c0655v7.q();
                                    f = c0655v7.W;
                                    if (c0655v7.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    f(1, iQ4, 1, (int) ((iQ4 * f) + 0.5f), c0655v7);
                                    c0655v7.d.e.d(c0655v7.q());
                                    c0655v7.e.e.d(c0655v7.k());
                                    c0655v7.a = true;
                                } else if (i10 == 1) {
                                    f(i6, 0, 2, 0, c0655v7);
                                    c0655v7.e.e.m = c0655v7.k();
                                } else if (i10 == 2) {
                                    i5 = iArr2[1];
                                    if (i5 != 1) {
                                    }
                                    f(i6, c0655v7.q(), 1, (int) ((f3 * c0686w7.k()) + 0.5f), c0655v7);
                                    c0655v7.d.e.d(c0655v7.q());
                                    c0655v7.e.e.d(c0655v7.k());
                                    c0655v7.a = true;
                                } else {
                                    if (c0224h7Arr[2].f != null) {
                                    }
                                    f(2, 0, i8, 0, c0655v7);
                                    c0655v7.d.e.d(c0655v7.q());
                                    c0655v7.e.e.d(c0655v7.k());
                                    c0655v7.a = true;
                                }
                            }
                            i3 = 1;
                            i4 = 3;
                            if (i6 != i4) {
                            }
                        }
                    } else if (c0224h7Arr[0].f == null || c0224h7Arr[1].f == null) {
                        f(2, 0, i8, 0, c0655v7);
                        c0655v7.d.e.d(c0655v7.q());
                        c0655v7.e.e.d(c0655v7.k());
                        c0655v7.a = true;
                    } else {
                        i2 = 3;
                        if (i8 == i2) {
                            if (i6 == 2) {
                            }
                            if (i10 == i2) {
                                if (i6 == 2) {
                                    f(2, 0, 2, 0, c0655v7);
                                }
                                int iQ5 = c0655v7.q();
                                f = c0655v7.W;
                                if (c0655v7.X == -1) {
                                    f = 1.0f / f;
                                }
                                f(1, iQ5, 1, (int) ((iQ5 * f) + 0.5f), c0655v7);
                                c0655v7.d.e.d(c0655v7.q());
                                c0655v7.e.e.d(c0655v7.k());
                                c0655v7.a = true;
                            } else if (i10 == 1) {
                                f(i6, 0, 2, 0, c0655v7);
                                c0655v7.e.e.m = c0655v7.k();
                            } else if (i10 == 2) {
                                i5 = iArr2[1];
                                if (i5 != 1) {
                                }
                                f(i6, c0655v7.q(), 1, (int) ((f3 * c0686w7.k()) + 0.5f), c0655v7);
                                c0655v7.d.e.d(c0655v7.q());
                                c0655v7.e.e.d(c0655v7.k());
                                c0655v7.a = true;
                            } else {
                                if (c0224h7Arr[2].f != null) {
                                }
                                f(2, 0, i8, 0, c0655v7);
                                c0655v7.d.e.d(c0655v7.q());
                                c0655v7.e.e.d(c0655v7.k());
                                c0655v7.a = true;
                            }
                        }
                        i3 = 1;
                        i4 = 3;
                        if (i6 != i4) {
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList<AbstractC0615tt> arrayList = this.e;
        arrayList.clear();
        C0686w7 c0686w7 = this.d;
        c0686w7.d.f();
        c0686w7.e.f();
        arrayList.add(c0686w7.d);
        arrayList.add(c0686w7.e);
        HashSet hashSet = null;
        for (C0655v7 c0655v7 : c0686w7.q0) {
            if (c0655v7 instanceof C0138ee) {
                C0169fe c0169fe = new C0169fe(c0655v7);
                c0655v7.d.f();
                c0655v7.e.f();
                c0169fe.f = ((C0138ee) c0655v7).u0;
                arrayList.add(c0169fe);
            } else {
                if (c0655v7.x()) {
                    if (c0655v7.b == null) {
                        c0655v7.b = new F5(c0655v7, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0655v7.b);
                } else {
                    arrayList.add(c0655v7.d);
                }
                if (c0655v7.y()) {
                    if (c0655v7.c == null) {
                        c0655v7.c = new F5(c0655v7, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0655v7.c);
                } else {
                    arrayList.add(c0655v7.e);
                }
                if (c0655v7 instanceof AbstractC0662ve) {
                    arrayList.add(new C0631ue(c0655v7));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0615tt) it.next()).f();
        }
        for (AbstractC0615tt abstractC0615tt : arrayList) {
            if (abstractC0615tt.b != c0686w7) {
                abstractC0615tt.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0686w7 c0686w8 = this.a;
        e(c0686w8.d, 0, arrayList2);
        e(c0686w8.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(C0686w7 c0686w7, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax = 0;
        while (i4 < size) {
            AbstractC0615tt abstractC0615tt = ((C0300jn) arrayList2.get(i4)).a;
            if (!(abstractC0615tt instanceof F5) ? !(i != 0 ? (abstractC0615tt instanceof C0336ks) : (abstractC0615tt instanceof C0693we)) : ((F5) abstractC0615tt).f != i) {
                X8 x8 = (i == 0 ? c0686w7.d : c0686w7.e).h;
                X8 x9 = (i == 0 ? c0686w7.d : c0686w7.e).i;
                boolean zContains = abstractC0615tt.h.l.contains(x8);
                X8 x10 = abstractC0615tt.i;
                boolean zContains2 = x10.l.contains(x9);
                long j3 = abstractC0615tt.j();
                X8 x11 = abstractC0615tt.h;
                if (zContains && zContains2) {
                    long jB = C0300jn.b(x11, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long jA = C0300jn.a(x10, 0L);
                    long j4 = jB - j3;
                    int i5 = x10.f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += (long) i5;
                    }
                    long j5 = (-jA) - j3;
                    long j6 = x11.f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0655v7 c0655v7 = abstractC0615tt.b;
                    if (i == 0) {
                        f = c0655v7.d0;
                    } else if (i == 1) {
                        f = c0655v7.e0;
                    } else {
                        c0655v7.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j4 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) x11.f) + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) x10.f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    if (zContains) {
                        j = Math.max(C0300jn.b(x11, x11.f), ((long) x11.f) + j3);
                    } else if (zContains2) {
                        j = Math.max(-C0300jn.a(x10, x10.f), ((long) (-x10.f)) + j3);
                    } else {
                        j = (abstractC0615tt.j() + ((long) x11.f)) - ((long) x10.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i4 = i3 + 1;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(AbstractC0615tt abstractC0615tt, int i, ArrayList arrayList) {
        X8 x8;
        Iterator it = abstractC0615tt.h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            x8 = abstractC0615tt.i;
            if (!zHasNext) {
                break;
            }
            V8 v8 = (V8) it.next();
            if (v8 instanceof X8) {
                a((X8) v8, i, arrayList, null);
            } else if (v8 instanceof AbstractC0615tt) {
                a(((AbstractC0615tt) v8).h, i, arrayList, null);
            }
        }
        for (V8 v9 : x8.k) {
            if (v9 instanceof X8) {
                a((X8) v9, i, arrayList, null);
            } else if (v9 instanceof AbstractC0615tt) {
                a(((AbstractC0615tt) v9).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (V8 v10 : ((C0336ks) abstractC0615tt).k.k) {
                if (v10 instanceof X8) {
                    a((X8) v10, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0655v7 c0655v7) {
        C0343l4 c0343l4 = this.g;
        c0343l4.a = i;
        c0343l4.b = i3;
        c0343l4.c = i2;
        c0343l4.d = i4;
        this.f.b(c0655v7, c0343l4);
        c0655v7.O(c0343l4.e);
        c0655v7.L(c0343l4.f);
        c0655v7.E = c0343l4.h;
        c0655v7.I(c0343l4.g);
    }

    public final void g() {
        C0252i4 c0252i4;
        for (C0655v7 c0655v7 : this.a.q0) {
            if (!c0655v7.a) {
                int[] iArr = c0655v7.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0655v7.r;
                int i4 = c0655v7.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C0226h9 c0226h9 = c0655v7.d.e;
                boolean z3 = c0226h9.j;
                C0226h9 c0226h10 = c0655v7.e.e;
                boolean z4 = c0226h10.j;
                if (z3 && z4) {
                    f(1, c0226h9.g, 1, c0226h10.g, c0655v7);
                    c0655v7.a = true;
                } else if (z3 && z) {
                    f(1, c0226h9.g, 2, c0226h10.g, c0655v7);
                    if (i2 == 3) {
                        c0655v7.e.e.m = c0655v7.k();
                    } else {
                        c0655v7.e.e.d(c0655v7.k());
                        c0655v7.a = true;
                    }
                } else if (z4 && z2) {
                    f(2, c0226h9.g, 1, c0226h10.g, c0655v7);
                    if (i == 3) {
                        c0655v7.d.e.m = c0655v7.q();
                    } else {
                        c0655v7.d.e.d(c0655v7.q());
                        c0655v7.a = true;
                    }
                }
                if (c0655v7.a && (c0252i4 = c0655v7.e.l) != null) {
                    c0252i4.d(c0655v7.a0);
                }
            }
        }
    }
}
