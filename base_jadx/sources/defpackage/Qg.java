package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Qg {
    public static boolean p = false;
    public static int q = 1000;
    public final Vk c;
    public C0097d3[] f;
    public final K2 l;
    public C0097d3 o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public Wo[] m = new Wo[q];
    public int n = 0;

    public Qg() {
        this.f = null;
        this.f = new C0097d3[32];
        s();
        K2 k2 = new K2(4, false);
        k2.b = new Ok();
        k2.c = new Ok();
        k2.d = new Wo[32];
        this.l = k2;
        Vk vk = new Vk(k2);
        vk.f = new Wo[128];
        vk.g = new Wo[128];
        vk.h = 0;
        vk.i = new C0096d2(vk);
        this.c = vk;
        this.o = new C0097d3(k2);
    }

    public static int n(Object obj) {
        Wo wo = ((C0224h7) obj).i;
        if (wo != null) {
            return (int) (wo.e + 0.5f);
        }
        return 0;
    }

    public final Wo a(int i) {
        Ok ok = (Ok) this.l.c;
        int i2 = ok.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = ok.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            ok.b = i3;
            obj = obj2;
        }
        Wo wo = (Wo) obj;
        if (wo == null) {
            wo = new Wo(i);
            wo.l = i;
        } else {
            wo.c();
            wo.l = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (Wo[]) Arrays.copyOf(this.m, i6);
        }
        Wo[] woArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        woArr[i7] = wo;
        return wo;
    }

    public final void b(Wo wo, Wo wo2, int i, float f, Wo wo3, Wo wo4, int i2, int i3) {
        C0097d3 c0097d3L = l();
        if (wo2 == wo3) {
            c0097d3L.d.j(wo, 1.0f);
            c0097d3L.d.j(wo4, 1.0f);
            c0097d3L.d.j(wo2, -2.0f);
        } else if (f == 0.5f) {
            c0097d3L.d.j(wo, 1.0f);
            c0097d3L.d.j(wo2, -1.0f);
            c0097d3L.d.j(wo3, -1.0f);
            c0097d3L.d.j(wo4, 1.0f);
            if (i > 0 || i2 > 0) {
                c0097d3L.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0097d3L.d.j(wo, -1.0f);
            c0097d3L.d.j(wo2, 1.0f);
            c0097d3L.b = i;
        } else if (f >= 1.0f) {
            c0097d3L.d.j(wo4, -1.0f);
            c0097d3L.d.j(wo3, 1.0f);
            c0097d3L.b = -i2;
        } else {
            float f2 = 1.0f - f;
            c0097d3L.d.j(wo, f2 * 1.0f);
            c0097d3L.d.j(wo2, f2 * (-1.0f));
            c0097d3L.d.j(wo3, (-1.0f) * f);
            c0097d3L.d.j(wo4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0097d3L.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0097d3L.a(this, i3);
        }
        c(c0097d3L);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0195  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    public final void c(C0097d3 c0097d3) {
        boolean z;
        boolean z2;
        Wo woF;
        ArrayList arrayList;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (c0097d3.e) {
            z = false;
        } else {
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iF = c0097d3.d.f();
                    int i = 0;
                    while (true) {
                        arrayList = c0097d3.c;
                        if (i >= iF) {
                            break;
                        }
                        Wo woG = c0097d3.d.g(i);
                        if (woG.c != -1 || woG.f) {
                            arrayList.add(woG);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            Wo wo = (Wo) arrayList.get(i2);
                            if (wo.f) {
                                c0097d3.h(this, wo, true);
                            } else {
                                c0097d3.i(this, this.f[wo.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c0097d3.a != null && c0097d3.d.f() == 0) {
                    c0097d3.e = true;
                    this.a = true;
                }
            }
            if (c0097d3.e()) {
                return;
            }
            float f = c0097d3.b;
            if (f < 0.0f) {
                c0097d3.b = f * (-1.0f);
                c0097d3.d.i();
            }
            int iF2 = c0097d3.d.f();
            float f2 = 0.0f;
            float f3 = 0.0f;
            Wo wo2 = null;
            Wo wo3 = null;
            boolean z4 = false;
            boolean z5 = false;
            for (int i3 = 0; i3 < iF2; i3++) {
                float fH = c0097d3.d.h(i3);
                Wo woG2 = c0097d3.d.g(i3);
                if (woG2.l == 1) {
                    if (wo2 == null) {
                        if (woG2.k <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        wo2 = woG2;
                        f2 = fH;
                    } else {
                        if (f2 > fH) {
                            if (woG2.k > 1) {
                                z4 = false;
                            }
                            wo2 = woG2;
                            f2 = fH;
                        } else if (z4 || woG2.k > 1) {
                        }
                        z4 = true;
                        wo2 = woG2;
                        f2 = fH;
                    }
                } else if (wo2 == null && fH < 0.0f) {
                    if (wo3 == null) {
                        if (woG2.k <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        wo3 = woG2;
                        f3 = fH;
                    } else {
                        if (f3 > fH) {
                            if (woG2.k > 1) {
                                z5 = false;
                            }
                            wo3 = woG2;
                            f3 = fH;
                        } else if (z5 || woG2.k > 1) {
                        }
                        z5 = true;
                        wo3 = woG2;
                        f3 = fH;
                    }
                }
            }
            if (wo2 == null) {
                wo2 = wo3;
            }
            if (wo2 == null) {
                z2 = true;
            } else {
                c0097d3.g(wo2);
                z2 = false;
            }
            if (c0097d3.d.f() == 0) {
                c0097d3.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                Wo woA = a(3);
                int i4 = this.b + 1;
                this.b = i4;
                this.i++;
                woA.b = i4;
                K2 k2 = this.l;
                ((Wo[]) k2.d)[i4] = woA;
                c0097d3.a = woA;
                int i5 = this.j;
                h(c0097d3);
                if (this.j == i5 + 1) {
                    C0097d3 c0097d4 = this.o;
                    c0097d4.getClass();
                    c0097d4.a = null;
                    c0097d4.d.b();
                    for (int i6 = 0; i6 < c0097d3.d.f(); i6++) {
                        c0097d4.d.a(c0097d3.d.g(i6), c0097d3.d.h(i6), true);
                    }
                    r(this.o);
                    if (woA.c == -1) {
                        if (c0097d3.a == woA && (woF = c0097d3.f(null, woA)) != null) {
                            c0097d3.g(woF);
                        }
                        if (!c0097d3.e) {
                            c0097d3.a.e(this, c0097d3);
                        }
                        ((Ok) k2.b).c(c0097d3);
                        this.j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            Wo wo4 = c0097d3.a;
            if (wo4 == null) {
                return;
            }
            if (wo4.l != 1 && c0097d3.b < 0.0f) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(c0097d3);
    }

    public final void d(Wo wo, int i) {
        int i2 = wo.c;
        if (i2 == -1) {
            wo.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                Wo wo2 = ((Wo[]) this.l.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0097d3 c0097d3L = l();
            c0097d3L.a = wo;
            float f = i;
            wo.e = f;
            c0097d3L.b = f;
            c0097d3L.e = true;
            c(c0097d3L);
            return;
        }
        C0097d3 c0097d3 = this.f[i2];
        if (c0097d3.e) {
            c0097d3.b = i;
            return;
        }
        if (c0097d3.d.f() == 0) {
            c0097d3.e = true;
            c0097d3.b = i;
            return;
        }
        C0097d3 c0097d3L2 = l();
        if (i < 0) {
            c0097d3L2.b = i * (-1);
            c0097d3L2.d.j(wo, 1.0f);
        } else {
            c0097d3L2.b = i;
            c0097d3L2.d.j(wo, -1.0f);
        }
        c(c0097d3L2);
    }

    public final void e(Wo wo, Wo wo2, int i, int i2) {
        if (i2 == 8 && wo2.f && wo.c == -1) {
            wo.d(this, wo2.e + i);
            return;
        }
        C0097d3 c0097d3L = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0097d3L.b = i;
        }
        if (z) {
            c0097d3L.d.j(wo, 1.0f);
            c0097d3L.d.j(wo2, -1.0f);
        } else {
            c0097d3L.d.j(wo, -1.0f);
            c0097d3L.d.j(wo2, 1.0f);
        }
        if (i2 != 8) {
            c0097d3L.a(this, i2);
        }
        c(c0097d3L);
    }

    public final void f(Wo wo, Wo wo2, int i, int i2) {
        C0097d3 c0097d3L = l();
        Wo woM = m();
        woM.d = 0;
        c0097d3L.b(wo, wo2, woM, i);
        if (i2 != 8) {
            c0097d3L.d.j(j(i2), (int) (c0097d3L.d.e(woM) * (-1.0f)));
        }
        c(c0097d3L);
    }

    public final void g(Wo wo, Wo wo2, int i, int i2) {
        C0097d3 c0097d3L = l();
        Wo woM = m();
        woM.d = 0;
        c0097d3L.c(wo, wo2, woM, i);
        if (i2 != 8) {
            c0097d3L.d.j(j(i2), (int) (c0097d3L.d.e(woM) * (-1.0f)));
        }
        c(c0097d3L);
    }

    public final void h(C0097d3 c0097d3) {
        int i;
        if (c0097d3.e) {
            c0097d3.a.d(this, c0097d3.b);
        } else {
            C0097d3[] c0097d3Arr = this.f;
            int i2 = this.j;
            c0097d3Arr[i2] = c0097d3;
            Wo wo = c0097d3.a;
            wo.c = i2;
            this.j = i2 + 1;
            wo.e(this, c0097d3);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                C0097d3 c0097d4 = this.f[i3];
                if (c0097d4 != null && c0097d4.e) {
                    c0097d4.a.d(this, c0097d4.b);
                    ((Ok) this.l.b).c(c0097d4);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        C0097d3[] c0097d3Arr2 = this.f;
                        int i6 = i4 - 1;
                        C0097d3 c0097d5 = c0097d3Arr2[i4];
                        c0097d3Arr2[i6] = c0097d5;
                        Wo wo2 = c0097d5.a;
                        if (wo2.c == i4) {
                            wo2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            C0097d3 c0097d3 = this.f[i];
            c0097d3.a.e = c0097d3.b;
        }
    }

    public final Wo j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        Wo woA = a(4);
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        woA.b = i2;
        woA.d = i;
        ((Wo[]) this.l.d)[i2] = woA;
        Vk vk = this.c;
        vk.i.b = woA;
        float[] fArr = woA.h;
        Arrays.fill(fArr, 0.0f);
        fArr[woA.d] = 1.0f;
        vk.j(woA);
        return woA;
    }

    public final Wo k(Object obj) {
        Wo wo = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (obj instanceof C0224h7) {
            C0224h7 c0224h7 = (C0224h7) obj;
            wo = c0224h7.i;
            if (wo == null) {
                c0224h7.k();
                wo = c0224h7.i;
            }
            int i = wo.b;
            K2 k2 = this.l;
            if (i == -1 || i > this.b || ((Wo[]) k2.d)[i] == null) {
                if (i != -1) {
                    wo.c();
                }
                int i2 = this.b + 1;
                this.b = i2;
                this.i++;
                wo.b = i2;
                wo.l = 1;
                ((Wo[]) k2.d)[i2] = wo;
            }
        }
        return wo;
    }

    public final C0097d3 l() {
        Object obj;
        K2 k2 = this.l;
        Ok ok = (Ok) k2.b;
        int i = ok.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = ok.a;
            obj = objArr[i2];
            objArr[i2] = null;
            ok.b = i2;
        } else {
            obj = null;
        }
        C0097d3 c0097d3 = (C0097d3) obj;
        if (c0097d3 == null) {
            return new C0097d3(k2);
        }
        c0097d3.a = null;
        c0097d3.d.b();
        c0097d3.b = 0.0f;
        c0097d3.e = false;
        return c0097d3;
    }

    public final Wo m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        Wo woA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        woA.b = i;
        ((Wo[]) this.l.d)[i] = woA;
        return woA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (C0097d3[]) Arrays.copyOf(this.f, i);
        K2 k2 = this.l;
        k2.d = (Wo[]) Arrays.copyOf((Wo[]) k2.d, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        Vk vk = this.c;
        if (vk.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(vk);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(vk);
                return;
            }
        }
        i();
    }

    public final void q(C0097d3 c0097d3) {
        for (int i = 0; i < this.j; i++) {
            C0097d3 c0097d4 = this.f[i];
            int i2 = 1;
            if (c0097d4.a.l != 1) {
                float f = 0.0f;
                if (c0097d4.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            C0097d3 c0097d5 = this.f[i6];
                            if (c0097d5.a.l != i2 && !c0097d5.e && c0097d5.b < f) {
                                int iF = c0097d5.d.f();
                                int i8 = 0;
                                while (i8 < iF) {
                                    Wo woG = c0097d5.d.g(i8);
                                    float fE = c0097d5.d.e(woG);
                                    if (fE > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = woG.g[i9] / fE;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = woG.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0097d3 c0097d6 = this.f[i4];
                            c0097d6.a.c = -1;
                            c0097d6.g(((Wo[]) this.l.d)[i5]);
                            Wo wo = c0097d6.a;
                            wo.c = i4;
                            wo.e(this, c0097d6);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(c0097d3);
        i();
    }

    public final void r(C0097d3 c0097d3) {
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.i * 2) {
                return;
            }
            Wo wo = c0097d3.a;
            if (wo != null) {
                this.h[wo.b] = true;
            }
            Wo woD = c0097d3.d(this.h);
            if (woD != null) {
                boolean[] zArr = this.h;
                int i3 = woD.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (woD != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    C0097d3 c0097d4 = this.f[i5];
                    if (c0097d4.a.l != 1 && !c0097d4.e && c0097d4.d.c(woD)) {
                        float fE = c0097d4.d.e(woD);
                        if (fE < 0.0f) {
                            float f2 = (-c0097d4.b) / fE;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0097d3 c0097d5 = this.f[i4];
                    c0097d5.a.c = -1;
                    c0097d5.g(woD);
                    Wo wo2 = c0097d5.a;
                    wo2.c = i4;
                    wo2.e(this, c0097d5);
                }
            } else {
                z = true;
            }
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            C0097d3 c0097d3 = this.f[i];
            if (c0097d3 != null) {
                ((Ok) this.l.b).c(c0097d3);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        K2 k2;
        int i = 0;
        while (true) {
            k2 = this.l;
            Wo[] woArr = (Wo[]) k2.d;
            if (i >= woArr.length) {
                break;
            }
            Wo wo = woArr[i];
            if (wo != null) {
                wo.c();
            }
            i++;
        }
        Ok ok = (Ok) k2.c;
        Wo[] woArr2 = this.m;
        int length = this.n;
        ok.getClass();
        if (length > woArr2.length) {
            length = woArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            Wo wo2 = woArr2[i2];
            int i3 = ok.b;
            Object[] objArr = ok.a;
            if (i3 < objArr.length) {
                objArr[i3] = wo2;
                ok.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((Wo[]) k2.d, (Object) null);
        this.b = 0;
        Vk vk = this.c;
        vk.h = 0;
        vk.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            C0097d3 c0097d3 = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new C0097d3(k2);
    }
}
