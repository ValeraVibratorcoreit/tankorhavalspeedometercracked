package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class F5 extends AbstractC0615tt {
    public final ArrayList k;
    public int l;

    public F5(C0655v7 c0655v7, int i) {
        C0655v7 c0655v8;
        super(c0655v7);
        this.k = new ArrayList();
        this.f = i;
        C0655v7 c0655v9 = this.b;
        C0655v7 c0655v7M = c0655v9.m(i);
        while (true) {
            C0655v7 c0655v10 = c0655v7M;
            c0655v8 = c0655v9;
            c0655v9 = c0655v10;
            if (c0655v9 == null) {
                break;
            } else {
                c0655v7M = c0655v9.m(this.f);
            }
        }
        this.b = c0655v8;
        int i2 = this.f;
        AbstractC0615tt abstractC0615tt = i2 == 0 ? c0655v8.d : i2 == 1 ? c0655v8.e : null;
        ArrayList<AbstractC0615tt> arrayList = this.k;
        arrayList.add(abstractC0615tt);
        C0655v7 c0655v7L = c0655v8.l(this.f);
        while (c0655v7L != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? c0655v7L.d : i3 == 1 ? c0655v7L.e : null);
            c0655v7L = c0655v7L.l(this.f);
        }
        for (AbstractC0615tt abstractC0615tt2 : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                abstractC0615tt2.b.b = this;
            } else if (i4 == 1) {
                abstractC0615tt2.b.c = this;
            }
        }
        if (this.f == 0 && ((C0686w7) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((AbstractC0615tt) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.i0 : this.b.j0;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x00e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    @Override // defpackage.V8
    public final void a(V8 v8) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        boolean z;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f2;
        X8 x8 = this.h;
        if (x8.j) {
            X8 x9 = this.i;
            if (x9.j) {
                C0655v7 c0655v7 = this.b.T;
                boolean z2 = c0655v7 instanceof C0686w7 ? ((C0686w7) c0655v7).v0 : false;
                int i16 = x9.g - x8.g;
                ArrayList arrayList3 = this.k;
                int size = arrayList3.size();
                int i17 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((AbstractC0615tt) arrayList3.get(i17)).b.g0 != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                for (int i19 = i18; i19 >= 0; i19--) {
                    if (((AbstractC0615tt) arrayList3.get(i19)).b.g0 != 8) {
                        i = i19;
                        break;
                    }
                }
                int i20 = 0;
                while (true) {
                    if (i20 >= 2) {
                        arrayList = arrayList3;
                        i3 = i17;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i21 = 0;
                    i6 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    f = 0.0f;
                    while (i21 < size) {
                        AbstractC0615tt abstractC0615tt = (AbstractC0615tt) arrayList3.get(i21);
                        C0655v7 c0655v8 = abstractC0615tt.b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0655v8.g0 == i2) {
                            i14 = i17;
                        } else {
                            i23++;
                            if (i21 > 0 && i21 >= i17) {
                                i6 += abstractC0615tt.h.f;
                            }
                            C0226h9 c0226h9 = abstractC0615tt.e;
                            int i24 = c0226h9.g;
                            i14 = i17;
                            boolean z3 = abstractC0615tt.d != 3;
                            if (z3) {
                                int i25 = this.f;
                                if (i25 == 0 && !c0655v8.d.e.j) {
                                    return;
                                }
                                if (i25 == 1 && !c0655v8.e.e.j) {
                                    return;
                                }
                            } else {
                                if (abstractC0615tt.a == 1 && i20 == 0) {
                                    i15 = c0226h9.m;
                                    i22++;
                                } else {
                                    if (c0226h9.j) {
                                        i15 = i24;
                                    }
                                    if (z3) {
                                        i6 += i15;
                                    } else {
                                        i22++;
                                        f2 = c0655v8.k0[this.f];
                                        if (f2 >= 0.0f) {
                                            f += f2;
                                        }
                                    }
                                    if (i21 >= i18 && i21 < i) {
                                        i6 += -abstractC0615tt.i.f;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    i22++;
                                    f2 = c0655v8.k0[this.f];
                                    if (f2 >= 0.0f) {
                                        f += f2;
                                    }
                                } else {
                                    i6 += i15;
                                }
                                if (i21 >= i18) {
                                }
                            }
                            i15 = i24;
                            if (z3) {
                                i22++;
                                f2 = c0655v8.k0[this.f];
                                if (f2 >= 0.0f) {
                                    f += f2;
                                }
                            } else {
                                i6 += i15;
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        arrayList3 = arrayList4;
                        i17 = i14;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i17;
                    if (i6 < i16 || i22 == 0) {
                        i4 = i22;
                        i5 = i23;
                        break;
                    } else {
                        i20++;
                        arrayList3 = arrayList;
                        i17 = i3;
                        i2 = 8;
                    }
                }
                int i26 = x8.g;
                if (z2) {
                    i26 = x9.g;
                }
                if (i6 > i16) {
                    i26 = z2 ? i26 + ((int) (((i6 - i16) / 2.0f) + 0.5f)) : i26 - ((int) (((i6 - i16) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f3 = i16 - i6;
                    int i27 = (int) ((f3 / i4) + 0.5f);
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC0615tt abstractC0615tt2 = (AbstractC0615tt) arrayList5.get(i28);
                        int i30 = i27;
                        C0655v7 c0655v9 = abstractC0615tt2.b;
                        int i31 = i6;
                        int i32 = i26;
                        if (c0655v9.g0 != 8 && abstractC0615tt2.d == 3) {
                            C0226h9 c0226h10 = abstractC0615tt2.e;
                            if (c0226h10.j) {
                                z2 = z2;
                            } else {
                                int i33 = f > 0.0f ? (int) (((c0655v9.k0[this.f] * f3) / f) + 0.5f) : i30;
                                if (this.f == 0) {
                                    i12 = c0655v9.v;
                                    i13 = c0655v9.u;
                                } else {
                                    i12 = c0655v9.y;
                                    i13 = c0655v9.x;
                                }
                                int iMax = Math.max(i13, abstractC0615tt2.a == 1 ? Math.min(i33, c0226h10.m) : i33);
                                if (i12 > 0) {
                                    iMax = Math.min(i12, iMax);
                                }
                                if (iMax != i33) {
                                    i29++;
                                    i33 = iMax;
                                }
                                c0226h10.d(i33);
                            }
                        } else {
                            z2 = z2;
                        }
                        i28++;
                        i27 = i30;
                        i6 = i31;
                        i26 = i32;
                        z2 = z2;
                        f3 = f3;
                        arrayList = arrayList5;
                    }
                    i7 = i26;
                    z = z2;
                    arrayList2 = arrayList;
                    int i34 = i6;
                    if (i29 > 0) {
                        i4 -= i29;
                        int i35 = 0;
                        i6 = 0;
                        while (i35 < size) {
                            AbstractC0615tt abstractC0615tt3 = (AbstractC0615tt) arrayList2.get(i35);
                            if (abstractC0615tt3.b.g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0615tt3.h.f;
                                }
                                i6 += abstractC0615tt3.e.g;
                                if (i35 < i18 && i35 < i) {
                                    i6 += -abstractC0615tt3.i.f;
                                }
                            }
                            i35++;
                            i3 = i11;
                        }
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i6 = i34;
                    }
                    i10 = 2;
                    if (this.l == 2 && i29 == 0) {
                        i9 = 0;
                        this.l = 0;
                    } else {
                        i9 = 0;
                    }
                } else {
                    i7 = i26;
                    z = z2;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 0;
                    i10 = 2;
                }
                if (i6 > i16) {
                    this.l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.l = i10;
                }
                int i36 = this.l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i16 - i6) / (i5 - 1) : i5 == 1 ? (i16 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0615tt abstractC0615tt4 = (AbstractC0615tt) arrayList2.get(z ? size - (i39 + 1) : i39);
                        int i40 = abstractC0615tt4.b.g0;
                        X8 x10 = abstractC0615tt4.i;
                        X8 x11 = abstractC0615tt4.h;
                        if (i40 == 8) {
                            x11.d(i38);
                            x10.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z ? i38 - x11.f : i38 + x11.f;
                            }
                            if (z) {
                                x10.d(i38);
                            } else {
                                x11.d(i38);
                            }
                            C0226h9 c0226h11 = abstractC0615tt4.e;
                            int i41 = c0226h11.g;
                            if (abstractC0615tt4.d == 3 && abstractC0615tt4.a == 1) {
                                i41 = c0226h11.m;
                            }
                            i38 = z ? i38 - i41 : i38 + i41;
                            if (z) {
                                x11.d(i38);
                            } else {
                                x10.d(i38);
                            }
                            abstractC0615tt4.g = true;
                            if (i39 < i18 && i39 < i) {
                                i38 = z ? i38 - (-x10.f) : i38 + (-x10.f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i42 = (i16 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i42 = i9;
                    }
                    int i43 = i7;
                    for (int i44 = i9; i44 < size; i44++) {
                        AbstractC0615tt abstractC0615tt5 = (AbstractC0615tt) arrayList2.get(z ? size - (i44 + 1) : i44);
                        int i45 = abstractC0615tt5.b.g0;
                        X8 x12 = abstractC0615tt5.i;
                        X8 x13 = abstractC0615tt5.h;
                        if (i45 == 8) {
                            x13.d(i43);
                            x12.d(i43);
                        } else {
                            int i46 = z ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z ? i46 - x13.f : i46 + x13.f;
                            }
                            if (z) {
                                x12.d(i46);
                            } else {
                                x13.d(i46);
                            }
                            C0226h9 c0226h12 = abstractC0615tt5.e;
                            int iMin = c0226h12.g;
                            if (abstractC0615tt5.d == 3 && abstractC0615tt5.a == 1) {
                                iMin = Math.min(iMin, c0226h12.m);
                            }
                            i43 = z ? i46 - iMin : i46 + iMin;
                            if (z) {
                                x13.d(i43);
                            } else {
                                x12.d(i43);
                            }
                            if (i44 < i18 && i44 < i) {
                                i43 = z ? i43 - (-x12.f) : i43 + (-x12.f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f4 = this.f == 0 ? this.b.d0 : this.b.e0;
                    if (z) {
                        f4 = 1.0f - f4;
                    }
                    int i47 = (int) (((i16 - i6) * f4) + 0.5f);
                    if (i47 < 0 || i4 > 0) {
                        i47 = i9;
                    }
                    int i48 = z ? i7 - i47 : i7 + i47;
                    for (int i49 = i9; i49 < size; i49++) {
                        AbstractC0615tt abstractC0615tt6 = (AbstractC0615tt) arrayList2.get(z ? size - (i49 + 1) : i49);
                        int i50 = abstractC0615tt6.b.g0;
                        X8 x14 = abstractC0615tt6.i;
                        X8 x15 = abstractC0615tt6.h;
                        if (i50 == 8) {
                            x15.d(i48);
                            x14.d(i48);
                        } else {
                            if (i49 > 0 && i49 >= i8) {
                                i48 = z ? i48 - x15.f : i48 + x15.f;
                            }
                            if (z) {
                                x14.d(i48);
                            } else {
                                x15.d(i48);
                            }
                            C0226h9 c0226h13 = abstractC0615tt6.e;
                            int i51 = c0226h13.g;
                            if (abstractC0615tt6.d == 3 && abstractC0615tt6.a == 1) {
                                i51 = c0226h13.m;
                            }
                            i48 = z ? i48 - i51 : i48 + i51;
                            if (z) {
                                x15.d(i48);
                            } else {
                                x14.d(i48);
                            }
                            if (i49 < i18 && i49 < i) {
                                i48 = z ? i48 - (-x14.f) : i48 + (-x14.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0615tt) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0655v7 c0655v7 = ((AbstractC0615tt) arrayList.get(0)).b;
        C0655v7 c0655v8 = ((AbstractC0615tt) arrayList.get(size - 1)).b;
        int i = this.f;
        X8 x8 = this.i;
        X8 x9 = this.h;
        if (i == 0) {
            C0224h7 c0224h7 = c0655v7.I;
            C0224h7 c0224h8 = c0655v8.K;
            X8 x8I = AbstractC0615tt.i(c0224h7, 0);
            int iE = c0224h7.e();
            C0655v7 c0655v7M = m();
            if (c0655v7M != null) {
                iE = c0655v7M.I.e();
            }
            if (x8I != null) {
                AbstractC0615tt.b(x9, x8I, iE);
            }
            X8 x8I2 = AbstractC0615tt.i(c0224h8, 0);
            int iE2 = c0224h8.e();
            C0655v7 c0655v7N = n();
            if (c0655v7N != null) {
                iE2 = c0655v7N.K.e();
            }
            if (x8I2 != null) {
                AbstractC0615tt.b(x8, x8I2, -iE2);
            }
        } else {
            C0224h7 c0224h9 = c0655v7.J;
            C0224h7 c0224h10 = c0655v8.L;
            X8 x8I3 = AbstractC0615tt.i(c0224h9, 1);
            int iE3 = c0224h9.e();
            C0655v7 c0655v7M2 = m();
            if (c0655v7M2 != null) {
                iE3 = c0655v7M2.J.e();
            }
            if (x8I3 != null) {
                AbstractC0615tt.b(x9, x8I3, iE3);
            }
            X8 x8I4 = AbstractC0615tt.i(c0224h10, 1);
            int iE4 = c0224h10.e();
            C0655v7 c0655v7N2 = n();
            if (c0655v7N2 != null) {
                iE4 = c0655v7N2.L.e();
            }
            if (x8I4 != null) {
                AbstractC0615tt.b(x8, x8I4, -iE4);
            }
        }
        x9.a = this;
        x8.a = this;
    }

    @Override // defpackage.AbstractC0615tt
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0615tt) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((AbstractC0615tt) it.next()).f();
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0615tt abstractC0615tt = (AbstractC0615tt) arrayList.get(i);
            j = ((long) abstractC0615tt.i.f) + abstractC0615tt.j() + j + ((long) abstractC0615tt.h.f);
        }
        return j;
    }

    @Override // defpackage.AbstractC0615tt
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0615tt) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0655v7 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0655v7 c0655v7 = ((AbstractC0615tt) arrayList.get(i)).b;
            if (c0655v7.g0 != 8) {
                return c0655v7;
            }
            i++;
        }
    }

    public final C0655v7 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0655v7 c0655v7 = ((AbstractC0615tt) arrayList.get(size)).b;
            if (c0655v7.g0 != 8) {
                return c0655v7;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC0615tt abstractC0615tt : this.k) {
            sb.append("<");
            sb.append(abstractC0615tt);
            sb.append("> ");
        }
        return sb.toString();
    }
}
