package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0655v7 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final C0224h7 I;
    public final C0224h7 J;
    public final C0224h7 K;
    public final C0224h7 L;
    public final C0224h7 M;
    public final C0224h7 N;
    public final C0224h7 O;
    public final C0224h7 P;
    public final C0224h7[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public C0655v7 T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public F5 b;
    public int b0;
    public F5 c;
    public int c0;
    public float d0;
    public float e0;
    public Object f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final C0655v7[] l0;
    public boolean m;
    public final C0655v7[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public C0693we d = null;
    public C0336ks e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public C0655v7() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        C0224h7 c0224h7 = new C0224h7(this, 2);
        this.I = c0224h7;
        C0224h7 c0224h8 = new C0224h7(this, 3);
        this.J = c0224h8;
        C0224h7 c0224h9 = new C0224h7(this, 4);
        this.K = c0224h9;
        C0224h7 c0224h10 = new C0224h7(this, 5);
        this.L = c0224h10;
        C0224h7 c0224h11 = new C0224h7(this, 6);
        this.M = c0224h11;
        C0224h7 c0224h12 = new C0224h7(this, 8);
        this.N = c0224h12;
        C0224h7 c0224h13 = new C0224h7(this, 9);
        this.O = c0224h13;
        C0224h7 c0224h14 = new C0224h7(this, 7);
        this.P = c0224h14;
        this.Q = new C0224h7[]{c0224h7, c0224h9, c0224h8, c0224h10, c0224h11, c0224h14};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new C0655v7[]{null, null};
        this.m0 = new C0655v7[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(c0224h7);
        arrayList.add(c0224h8);
        arrayList.add(c0224h9);
        arrayList.add(c0224h10);
        arrayList.add(c0224h12);
        arrayList.add(c0224h13);
        arrayList.add(c0224h14);
        arrayList.add(c0224h11);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, C0224h7 c0224h7) {
        if (c0224h7.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c0224h7.f);
        sb.append("'");
        if (c0224h7.h != Integer.MIN_VALUE || c0224h7.g != 0) {
            sb.append(",");
            sb.append(c0224h7.g);
            if (c0224h7.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c0224h7.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        return this.k || (this.I.c && this.K.c);
    }

    public boolean B() {
        return this.l || (this.J.c && this.L.c);
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        C0655v7 c0655v7 = this.T;
        if (c0655v7 != null && (c0655v7 instanceof C0686w7)) {
            ((C0686w7) c0655v7).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0224h7) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0224h7 c0224h7 = (C0224h7) arrayList.get(i);
            c0224h7.c = false;
            c0224h7.b = 0;
        }
    }

    public void F(K2 k2) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        C0693we c0693we = this.d;
        boolean z3 = z & c0693we.g;
        C0336ks c0336ks = this.e;
        boolean z4 = z2 & c0336ks.g;
        int i3 = c0693we.h.g;
        int i4 = c0336ks.h.g;
        int i5 = c0693we.i.g;
        int i6 = c0336ks.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(Qg qg, boolean z) {
        int i;
        int i2;
        C0336ks c0336ks;
        C0693we c0693we;
        C0224h7 c0224h7 = this.I;
        qg.getClass();
        int iN = Qg.n(c0224h7);
        int iN2 = Qg.n(this.J);
        int iN3 = Qg.n(this.K);
        int iN4 = Qg.n(this.L);
        if (z && (c0693we = this.d) != null) {
            X8 x8 = c0693we.h;
            if (x8.j) {
                X8 x9 = c0693we.i;
                if (x9.j) {
                    iN = x8.g;
                    iN3 = x9.g;
                }
            }
        }
        if (z && (c0336ks = this.e) != null) {
            X8 x10 = c0336ks.h;
            if (x10.j) {
                X8 x11 = c0336ks.i;
                if (x11.j) {
                    iN2 = x10.g;
                    iN4 = x11.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(C0686w7 c0686w7, Qg qg, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Tf.e(c0686w7, qg, this);
            hashSet.remove(this);
            b(qg, c0686w7.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C0224h7) it.next()).d.a(c0686w7, qg, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C0224h7) it2.next()).d.a(c0686w7, qg, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C0224h7) it3.next()).d.a(c0686w7, qg, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C0224h7) it4.next()).d.a(c0686w7, qg, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C0224h7) it5.next()).d.a(c0686w7, qg, hashSet, i, true);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void b(defpackage.Qg r59, boolean r60) {
        /*
            Method dump skipped, instruction units count: 1994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0655v7.b(Qg, boolean):void");
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0214  */
    /* JADX WARN: Code duplicated, block: B:129:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:223:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:224:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:232:0x0402  */
    /* JADX WARN: Code duplicated, block: B:235:0x041e  */
    /* JADX WARN: Code duplicated, block: B:244:0x042f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0431 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x0451  */
    /* JADX WARN: Code duplicated, block: B:255:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:263:0x0469  */
    /* JADX WARN: Code duplicated, block: B:266:0x046f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x0480  */
    /* JADX WARN: Code duplicated, block: B:277:0x0484  */
    /* JADX WARN: Code duplicated, block: B:280:0x048a  */
    /* JADX WARN: Code duplicated, block: B:282:0x048e  */
    /* JADX WARN: Code duplicated, block: B:284:0x0492  */
    /* JADX WARN: Code duplicated, block: B:285:0x0494  */
    /* JADX WARN: Code duplicated, block: B:289:0x049d  */
    /* JADX WARN: Code duplicated, block: B:291:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:297:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:299:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:300:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:302:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:304:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:316:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x0506  */
    /* JADX WARN: Code duplicated, block: B:345:0x054a  */
    /* JADX WARN: Code duplicated, block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void d(Qg qg, boolean z, boolean z2, boolean z3, boolean z4, Wo wo, Wo wo2, int i, boolean z5, C0224h7 c0224h7, C0224h7 c0224h8, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        int i10;
        int i11;
        boolean z14;
        boolean z15;
        Wo woK;
        Wo woK2;
        char c;
        char c2;
        C0224h7 c0224h9;
        Wo wo3;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        boolean z19;
        int i13;
        boolean z20;
        Wo wo4;
        boolean z21;
        int i14;
        boolean z22;
        boolean z23;
        Wo wo5;
        C0655v7 c0655v7;
        int iMax;
        int i15;
        int iE;
        int iMin2;
        int i16;
        HashSet hashSet;
        int i17;
        int i18;
        int i19;
        boolean z24;
        boolean z25;
        int i20;
        int i21;
        int i22 = i8;
        int i23 = i9;
        Wo woK3 = qg.k(c0224h7);
        Wo woK4 = qg.k(c0224h8);
        Wo woK5 = qg.k(c0224h7.f);
        Wo woK6 = qg.k(c0224h8.f);
        boolean zH = c0224h7.h();
        boolean zH2 = c0224h8.h();
        boolean zH3 = this.P.h();
        int i24 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i24++;
        }
        int i25 = i24;
        int i26 = z6 ? 3 : i6;
        int iO = Vo.o(i);
        boolean z26 = (iO == 0 || iO == 1 || iO != 2 || i26 == 4) ? false : true;
        int i27 = this.h;
        if (i27 == -1 || !z) {
            i27 = i3;
            z12 = z26;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i28 = this.i;
        if (i28 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i27 = i28;
            z13 = false;
        }
        int i29 = i27;
        if (this.g0 == 8) {
            iMin = 0;
            z13 = false;
        } else {
            iMin = i29;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                qg.d(woK3, i2);
            } else if (zH && !zH2) {
                i10 = 8;
                qg.e(woK3, woK5, c0224h7.e(), 8);
            }
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (z13) {
            if (i25 == 2 || z6 || !(i26 == 1 || i26 == 0)) {
                if (i22 == -2) {
                    i22 = iMin;
                }
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (iMin > 0 && i26 != 1) {
                    iMin = 0;
                }
                if (i22 > 0) {
                    qg.f(woK4, woK3, i22, 8);
                    iMin = Math.max(iMin, i22);
                }
                if (i23 > 0) {
                    if (!z2 || i26 != 1) {
                        qg.g(woK4, woK3, i23, 8);
                    }
                    iMin = Math.min(iMin, i23);
                }
                if (i26 == 1) {
                    if (z2) {
                        qg.e(woK4, woK3, iMin, 8);
                    } else if (z8) {
                        qg.e(woK4, woK3, iMin, 5);
                        qg.g(woK4, woK3, iMin, 8);
                    } else {
                        qg.e(woK4, woK3, iMin, 5);
                        qg.g(woK4, woK3, iMin, 8);
                    }
                } else if (i26 == 2) {
                    int i30 = c0224h7.e;
                    if (i30 == 3 || i30 == 5) {
                        woK = qg.k(this.T.i(3));
                        woK2 = qg.k(this.T.i(5));
                    } else {
                        woK = qg.k(this.T.i(2));
                        woK2 = qg.k(this.T.i(4));
                    }
                    C0097d3 c0097d3L = qg.l();
                    c0097d3L.d.j(woK4, -1.0f);
                    c0097d3L.d.j(woK3, 1.0f);
                    c0097d3L.d.j(woK2, f2);
                    c0097d3L.d.j(woK, -f2);
                    qg.c(c0097d3L);
                    z15 = z4;
                    i11 = i22;
                    z14 = z2 ? false : z13;
                } else {
                    i11 = i22;
                    z14 = z13;
                    z15 = true;
                }
            } else {
                int iMax2 = Math.max(i22, iMin);
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                qg.e(woK4, woK3, iMax2, 8);
                z15 = z4;
                z14 = false;
                i11 = i22;
            }
            if (z11) {
                c = 1;
                c2 = 2;
            } else {
                if (z8) {
                    if (!zH || zH2 || zH3) {
                        if (zH || zH2) {
                            if (zH && zH2) {
                                qg.e(woK4, wo3, -c0224h8.e(), 8);
                                if (z2) {
                                    wo3 = woK6;
                                    qg.f(woK3, wo, 0, 5);
                                    c0224h8 = c0224h8;
                                    i15 = 5;
                                    wo5 = wo3;
                                    woK4 = woK4;
                                    z15 = z15;
                                }
                                z22 = z2;
                                i21 = i15;
                            } else {
                                wo3 = woK6;
                                if (!zH && zH2) {
                                    C0655v7 c0655v8 = c0224h7.f.d;
                                    c0224h8 = c0224h8;
                                    C0655v7 c0655v9 = c0224h8.f.d;
                                    C0655v7 c0655v10 = this.T;
                                    int i31 = 6;
                                    if (z14) {
                                        if (i26 == 0) {
                                            if (i23 != 0 || i11 != 0) {
                                                i12 = 5;
                                                z24 = true;
                                                z25 = false;
                                                z18 = true;
                                                i20 = 5;
                                            } else if (woK5.f && wo3.f) {
                                                qg.e(woK3, woK5, c0224h7.e(), 8);
                                                qg.e(woK4, wo3, -c0224h8.e(), 8);
                                                return;
                                            } else {
                                                i12 = 8;
                                                z24 = false;
                                                z25 = true;
                                                z18 = false;
                                                i20 = 8;
                                            }
                                            if ((c0655v8 instanceof X3) || (c0655v9 instanceof X3)) {
                                                z16 = true;
                                                i13 = 4;
                                            } else {
                                                i13 = i20;
                                                z16 = true;
                                            }
                                            z19 = z25;
                                            z17 = z24;
                                            i26 = i26;
                                        } else {
                                            if (i26 == 2) {
                                                if ((c0655v8 instanceof X3) || (c0655v9 instanceof X3)) {
                                                    i12 = 5;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    z19 = false;
                                                    i13 = 4;
                                                } else {
                                                    i26 = i26;
                                                    i31 = 6;
                                                    i12 = 5;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    z19 = false;
                                                    i13 = 5;
                                                }
                                            } else if (i26 == 1) {
                                                i12 = 8;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                                z19 = false;
                                                i13 = 4;
                                            } else if (i26 == 3) {
                                                i26 = i26;
                                                if (this.A == -1) {
                                                    if (z9) {
                                                        wo2 = wo2;
                                                        i12 = 8;
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = true;
                                                        z19 = true;
                                                        i31 = z2 ? 5 : 4;
                                                    } else {
                                                        wo2 = wo2;
                                                        i12 = 8;
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = true;
                                                        z19 = true;
                                                        i31 = 8;
                                                    }
                                                } else if (z6) {
                                                    if (i7 != 2) {
                                                        z16 = true;
                                                        if (i7 != 1) {
                                                            i12 = 8;
                                                            i19 = 5;
                                                        }
                                                        i13 = i19;
                                                        z17 = z16;
                                                        z18 = z17;
                                                        z19 = z18;
                                                        i31 = 6;
                                                    } else {
                                                        z16 = true;
                                                    }
                                                    i12 = 5;
                                                    i19 = 4;
                                                    i13 = i19;
                                                    z17 = z16;
                                                    z18 = z17;
                                                    z19 = z18;
                                                    i31 = 6;
                                                } else {
                                                    z16 = true;
                                                    if (i23 > 0) {
                                                        wo2 = wo2;
                                                        z17 = true;
                                                        z18 = true;
                                                        z19 = true;
                                                        i31 = 6;
                                                        i12 = 5;
                                                    } else {
                                                        if (i23 != 0 || i11 != 0) {
                                                            wo2 = wo2;
                                                            z17 = true;
                                                            z18 = true;
                                                            z19 = true;
                                                            i31 = 6;
                                                            i12 = 5;
                                                        } else if (z9) {
                                                            i12 = (c0655v8 == c0655v10 || c0655v9 == c0655v10) ? 5 : 4;
                                                            wo2 = wo2;
                                                            z17 = true;
                                                            z18 = true;
                                                            z19 = true;
                                                            i31 = 6;
                                                        } else {
                                                            wo2 = wo2;
                                                            z17 = true;
                                                            z18 = true;
                                                            z19 = true;
                                                            i31 = 6;
                                                            i12 = 5;
                                                            i13 = 8;
                                                        }
                                                        i13 = 4;
                                                    }
                                                }
                                                i13 = 5;
                                            } else {
                                                z16 = true;
                                                i12 = 5;
                                                z17 = false;
                                                z18 = false;
                                            }
                                            if (z18 || woK5 != wo3 || c0655v8 == c0655v10) {
                                                z20 = z16;
                                            } else {
                                                z18 = false;
                                                z20 = false;
                                            }
                                            if (z17) {
                                                if (z14 && !z7 && !z9 && woK5 == wo && wo3 == wo2) {
                                                    z22 = false;
                                                    i18 = 8;
                                                    z20 = false;
                                                    i17 = 8;
                                                } else {
                                                    z22 = z2;
                                                    i17 = i31;
                                                    i18 = i12;
                                                }
                                                i14 = 4;
                                                z21 = true;
                                                wo4 = woK4;
                                                qg.b(woK3, woK5, c0224h7.e(), f, wo3, woK4, c0224h8.e(), i17);
                                                i12 = i18;
                                            } else {
                                                wo4 = woK4;
                                                z21 = z16;
                                                i14 = 4;
                                                z22 = z2;
                                            }
                                            z23 = z20;
                                            if (this.g0 != 8 && ((hashSet = c0224h8.a) == null || hashSet.size() <= 0)) {
                                                return;
                                            }
                                            wo5 = wo3;
                                            if (z18) {
                                                if (z22 && woK5 != wo5 && !z14 && ((c0655v8 instanceof X3) || (c0655v9 instanceof X3))) {
                                                    i12 = 6;
                                                }
                                                qg.f(woK3, woK5, c0224h7.e(), i12);
                                                woK4 = wo4;
                                                qg.g(woK4, wo5, -c0224h8.e(), i12);
                                            } else {
                                                woK4 = wo4;
                                            }
                                            if (z22 || !z10 || (c0655v8 instanceof X3) || (c0655v9 instanceof X3)) {
                                                c0655v7 = c0655v10;
                                            } else {
                                                c0655v7 = c0655v10;
                                                if (c0655v9 != c0655v7) {
                                                    i12 = 6;
                                                    iMax = 6;
                                                    z23 = z21;
                                                }
                                                if (z23) {
                                                    if (z19 && (!z9 || z3)) {
                                                        if (c0655v8 != c0655v7 && c0655v9 != c0655v7) {
                                                            i31 = iMax;
                                                        }
                                                        if ((c0655v8 instanceof C0138ee) || (c0655v9 instanceof C0138ee)) {
                                                            i31 = 5;
                                                        }
                                                        if ((c0655v8 instanceof X3) || (c0655v9 instanceof X3)) {
                                                            i31 = 5;
                                                        }
                                                        if (z9) {
                                                            i16 = 5;
                                                        } else {
                                                            i16 = i31;
                                                        }
                                                        iMax = Math.max(i16, iMax);
                                                    }
                                                    iMin2 = iMax;
                                                    if (z22) {
                                                        iMin2 = Math.min(i12, iMin2);
                                                        if (z6 && !z9 && (c0655v8 == c0655v7 || c0655v9 == c0655v7)) {
                                                            iMin2 = i14;
                                                        }
                                                    }
                                                    qg.e(woK3, woK5, c0224h7.e(), iMin2);
                                                    qg.e(woK4, wo5, -c0224h8.e(), iMin2);
                                                }
                                                if (z22) {
                                                    if (wo == woK5) {
                                                        iE = c0224h7.e();
                                                    } else {
                                                        iE = 0;
                                                    }
                                                    if (woK5 != wo) {
                                                        qg.f(woK3, wo, iE, 5);
                                                    }
                                                }
                                                if (z22 || !z14 || i4 != 0 || i11 != 0) {
                                                    i15 = 5;
                                                } else if (z14 && i26 == 3) {
                                                    qg.f(woK4, woK3, 0, 8);
                                                    i15 = 5;
                                                } else {
                                                    i15 = 5;
                                                    qg.f(woK4, woK3, 0, 5);
                                                }
                                            }
                                            iMax = i13;
                                            if (z23) {
                                                if (z19) {
                                                    if (c0655v8 != c0655v7) {
                                                        i31 = iMax;
                                                    }
                                                    if (c0655v8 instanceof C0138ee) {
                                                        i31 = 5;
                                                    } else {
                                                        i31 = 5;
                                                    }
                                                    if (c0655v8 instanceof X3) {
                                                        i31 = 5;
                                                    } else {
                                                        i31 = 5;
                                                    }
                                                    if (z9) {
                                                        i16 = 5;
                                                    } else {
                                                        i16 = i31;
                                                    }
                                                    iMax = Math.max(i16, iMax);
                                                }
                                                iMin2 = iMax;
                                                if (z22) {
                                                    iMin2 = Math.min(i12, iMin2);
                                                    if (z6) {
                                                        iMin2 = i14;
                                                    }
                                                }
                                                qg.e(woK3, woK5, c0224h7.e(), iMin2);
                                                qg.e(woK4, wo5, -c0224h8.e(), iMin2);
                                            }
                                            if (z22) {
                                                if (wo == woK5) {
                                                    iE = c0224h7.e();
                                                } else {
                                                    iE = 0;
                                                }
                                                if (woK5 != wo) {
                                                    qg.f(woK3, wo, iE, 5);
                                                }
                                            }
                                            if (z22) {
                                                i15 = 5;
                                            } else {
                                                i15 = 5;
                                            }
                                        }
                                        wo2 = wo2;
                                        if (z18) {
                                            z20 = z16;
                                        } else {
                                            z20 = z16;
                                        }
                                        if (z17) {
                                            if (z14) {
                                                z22 = z2;
                                                i17 = i31;
                                                i18 = i12;
                                            } else {
                                                z22 = z2;
                                                i17 = i31;
                                                i18 = i12;
                                            }
                                            i14 = 4;
                                            z21 = true;
                                            wo4 = woK4;
                                            qg.b(woK3, woK5, c0224h7.e(), f, wo3, woK4, c0224h8.e(), i17);
                                            i12 = i18;
                                        } else {
                                            wo4 = woK4;
                                            z21 = z16;
                                            i14 = 4;
                                            z22 = z2;
                                        }
                                        z23 = z20;
                                        if (this.g0 != 8) {
                                        }
                                        wo5 = wo3;
                                        if (z18) {
                                            if (z22) {
                                                i12 = 6;
                                            }
                                            qg.f(woK3, woK5, c0224h7.e(), i12);
                                            woK4 = wo4;
                                            qg.g(woK4, wo5, -c0224h8.e(), i12);
                                        } else {
                                            woK4 = wo4;
                                        }
                                        if (z22) {
                                            c0655v7 = c0655v10;
                                            iMax = i13;
                                        } else {
                                            c0655v7 = c0655v10;
                                            iMax = i13;
                                        }
                                        if (z23) {
                                            if (z19) {
                                                if (c0655v8 != c0655v7) {
                                                    i31 = iMax;
                                                }
                                                if (c0655v8 instanceof C0138ee) {
                                                    i31 = 5;
                                                } else {
                                                    i31 = 5;
                                                }
                                                if (c0655v8 instanceof X3) {
                                                    i31 = 5;
                                                } else {
                                                    i31 = 5;
                                                }
                                                if (z9) {
                                                    i16 = 5;
                                                } else {
                                                    i16 = i31;
                                                }
                                                iMax = Math.max(i16, iMax);
                                            }
                                            iMin2 = iMax;
                                            if (z22) {
                                                iMin2 = Math.min(i12, iMin2);
                                                if (z6) {
                                                    iMin2 = i14;
                                                }
                                            }
                                            qg.e(woK3, woK5, c0224h7.e(), iMin2);
                                            qg.e(woK4, wo5, -c0224h8.e(), iMin2);
                                        }
                                        if (z22) {
                                            if (wo == woK5) {
                                                iE = c0224h7.e();
                                            } else {
                                                iE = 0;
                                            }
                                            if (woK5 != wo) {
                                                qg.f(woK3, wo, iE, 5);
                                            }
                                        }
                                        if (z22) {
                                            i15 = 5;
                                        } else {
                                            i15 = 5;
                                        }
                                    } else {
                                        z16 = true;
                                        if (woK5.f && wo3.f) {
                                            qg.b(woK3, woK5, c0224h7.e(), f, wo3, woK4, c0224h8.e(), 8);
                                            if (z2 && z15) {
                                                int iE2 = c0224h8.f != null ? c0224h8.e() : 0;
                                                if (wo3 != wo2) {
                                                    qg.f(wo2, woK4, iE2, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        z17 = true;
                                        z18 = true;
                                        i12 = 5;
                                    }
                                    z19 = false;
                                    i13 = 4;
                                    if (z18) {
                                        z20 = z16;
                                    } else {
                                        z20 = z16;
                                    }
                                    if (z17) {
                                        if (z14) {
                                            z22 = z2;
                                            i17 = i31;
                                            i18 = i12;
                                        } else {
                                            z22 = z2;
                                            i17 = i31;
                                            i18 = i12;
                                        }
                                        i14 = 4;
                                        z21 = true;
                                        wo4 = woK4;
                                        qg.b(woK3, woK5, c0224h7.e(), f, wo3, woK4, c0224h8.e(), i17);
                                        i12 = i18;
                                    } else {
                                        wo4 = woK4;
                                        z21 = z16;
                                        i14 = 4;
                                        z22 = z2;
                                    }
                                    z23 = z20;
                                    if (this.g0 != 8) {
                                    }
                                    wo5 = wo3;
                                    if (z18) {
                                        if (z22) {
                                            i12 = 6;
                                        }
                                        qg.f(woK3, woK5, c0224h7.e(), i12);
                                        woK4 = wo4;
                                        qg.g(woK4, wo5, -c0224h8.e(), i12);
                                    } else {
                                        woK4 = wo4;
                                    }
                                    if (z22) {
                                        c0655v7 = c0655v10;
                                        iMax = i13;
                                    } else {
                                        c0655v7 = c0655v10;
                                        iMax = i13;
                                    }
                                    if (z23) {
                                        if (z19) {
                                            if (c0655v8 != c0655v7) {
                                                i31 = iMax;
                                            }
                                            if (c0655v8 instanceof C0138ee) {
                                                i31 = 5;
                                            } else {
                                                i31 = 5;
                                            }
                                            if (c0655v8 instanceof X3) {
                                                i31 = 5;
                                            } else {
                                                i31 = 5;
                                            }
                                            if (z9) {
                                                i16 = 5;
                                            } else {
                                                i16 = i31;
                                            }
                                            iMax = Math.max(i16, iMax);
                                        }
                                        iMin2 = iMax;
                                        if (z22) {
                                            iMin2 = Math.min(i12, iMin2);
                                            if (z6) {
                                                iMin2 = i14;
                                            }
                                        }
                                        qg.e(woK3, woK5, c0224h7.e(), iMin2);
                                        qg.e(woK4, wo5, -c0224h8.e(), iMin2);
                                    }
                                    if (z22) {
                                        if (wo == woK5) {
                                            iE = c0224h7.e();
                                        } else {
                                            iE = 0;
                                        }
                                        if (woK5 != wo) {
                                            qg.f(woK3, wo, iE, 5);
                                        }
                                    }
                                    if (z22) {
                                        i15 = 5;
                                    } else {
                                        i15 = 5;
                                    }
                                }
                                i21 = i15;
                            }
                            wo3 = woK6;
                            wo5 = wo3;
                        } else {
                            c0224h8 = c0224h8;
                            woK4 = woK4;
                            z15 = z15;
                            i21 = (z2 && (c0224h7.f.d instanceof X3)) ? 8 : 5;
                            wo5 = woK6;
                            z22 = z2;
                        }
                        if (z22 || !z15) {
                            return;
                        }
                        int iE3 = c0224h8.f != null ? c0224h8.e() : 0;
                        if (wo5 != wo2) {
                            qg.f(wo2, woK4, iE3, i21);
                            return;
                        }
                        return;
                    }
                    wo5 = woK6;
                    i15 = 5;
                    z22 = z2;
                    i21 = i15;
                    if (z22) {
                        return;
                    } else {
                        return;
                    }
                }
                c2 = 2;
                c = 1;
            }
            if (i25 >= c2 && z2 && z15) {
                qg.f(woK3, wo, 0, 8);
                C0224h7 c0224h10 = this.M;
                char c3 = (z || c0224h10.f == null) ? c : (char) 0;
                if (!z && (c0224h9 = c0224h10.f) != null) {
                    C0655v7 c0655v11 = c0224h9.d;
                    if (c0655v11.W != 0.0f) {
                        int[] iArr = c0655v11.p0;
                        if (iArr[0] == 3 && iArr[c] == 3) {
                            c3 = c;
                        } else {
                            c3 = 0;
                        }
                    } else {
                        c3 = 0;
                    }
                }
                if (c3 != 0) {
                    qg.f(wo2, woK4, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (z5) {
            qg.e(woK4, woK3, 0, 3);
            if (i4 > 0) {
                qg.f(woK4, woK3, i4, 8);
            }
            if (i5 < Integer.MAX_VALUE) {
                qg.g(woK4, woK3, i5, 8);
            }
        } else {
            qg.e(woK4, woK3, iMin, i10);
        }
        z15 = z4;
        i11 = i22;
        z14 = z13;
        if (z11) {
            c = 1;
            c2 = 2;
        } else {
            if (z8) {
                if (zH) {
                    if (zH) {
                    }
                    if (zH) {
                        wo3 = woK6;
                        if (!zH) {
                        }
                        wo3 = woK6;
                        wo5 = wo3;
                        i15 = 5;
                        z22 = z2;
                    } else {
                        wo3 = woK6;
                        if (!zH) {
                        }
                        wo3 = woK6;
                        wo5 = wo3;
                        i15 = 5;
                        z22 = z2;
                    }
                    i21 = i15;
                } else {
                    if (zH) {
                    }
                    if (zH) {
                        wo3 = woK6;
                        if (!zH) {
                        }
                        wo3 = woK6;
                        wo5 = wo3;
                        i15 = 5;
                        z22 = z2;
                    } else {
                        wo3 = woK6;
                        if (!zH) {
                        }
                        wo3 = woK6;
                        wo5 = wo3;
                        i15 = 5;
                        z22 = z2;
                    }
                    i21 = i15;
                }
                if (z22) {
                    return;
                } else {
                    return;
                }
            }
            c2 = 2;
            c = 1;
        }
        if (i25 >= c2) {
        }
    }

    public final void e(int i, C0655v7 c0655v7, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, c0655v7, i2, 0);
                    e(4, c0655v7, i2, 0);
                    i(7).a(c0655v7.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, c0655v7, i2, 0);
                        e(5, c0655v7, i2, 0);
                        i(7).a(c0655v7.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            C0224h7 c0224h7I = i(2);
            C0224h7 c0224h7I2 = i(4);
            C0224h7 c0224h7I3 = i(3);
            C0224h7 c0224h7I4 = i(5);
            boolean z2 = true;
            if ((c0224h7I == null || !c0224h7I.h()) && (c0224h7I2 == null || !c0224h7I2.h())) {
                e(2, c0655v7, 2, 0);
                e(4, c0655v7, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((c0224h7I3 == null || !c0224h7I3.h()) && (c0224h7I4 == null || !c0224h7I4.h())) {
                e(3, c0655v7, 3, 0);
                e(5, c0655v7, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(c0655v7.i(7), 0);
                return;
            } else if (z) {
                i(8).a(c0655v7.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(c0655v7.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            C0224h7 c0224h7I5 = i(2);
            C0224h7 c0224h7I6 = c0655v7.i(i2);
            C0224h7 c0224h7I7 = i(4);
            c0224h7I5.a(c0224h7I6, 0);
            c0224h7I7.a(c0224h7I6, 0);
            i(8).a(c0224h7I6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            C0224h7 c0224h7I8 = c0655v7.i(i2);
            i(3).a(c0224h7I8, 0);
            i(5).a(c0224h7I8, 0);
            i(9).a(c0224h7I8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(c0655v7.i(2), 0);
            i(4).a(c0655v7.i(4), 0);
            i(8).a(c0655v7.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(c0655v7.i(3), 0);
            i(5).a(c0655v7.i(5), 0);
            i(9).a(c0655v7.i(i2), 0);
            return;
        }
        C0224h7 c0224h7I9 = i(i);
        C0224h7 c0224h7I10 = c0655v7.i(i2);
        if (c0224h7I9.i(c0224h7I10)) {
            if (i == 6) {
                C0224h7 c0224h7I11 = i(3);
                C0224h7 c0224h7I12 = i(5);
                if (c0224h7I11 != null) {
                    c0224h7I11.j();
                }
                if (c0224h7I12 != null) {
                    c0224h7I12.j();
                }
            } else if (i == 3 || i == 5) {
                C0224h7 c0224h7I13 = i(6);
                if (c0224h7I13 != null) {
                    c0224h7I13.j();
                }
                C0224h7 c0224h7I14 = i(7);
                if (c0224h7I14.f != c0224h7I10) {
                    c0224h7I14.j();
                }
                C0224h7 c0224h7F = i(i).f();
                C0224h7 c0224h7I15 = i(9);
                if (c0224h7I15.h()) {
                    c0224h7F.j();
                    c0224h7I15.j();
                }
            } else if (i == 2 || i == 4) {
                C0224h7 c0224h7I16 = i(7);
                if (c0224h7I16.f != c0224h7I10) {
                    c0224h7I16.j();
                }
                C0224h7 c0224h7F2 = i(i).f();
                C0224h7 c0224h7I17 = i(8);
                if (c0224h7I17.h()) {
                    c0224h7F2.j();
                    c0224h7I17.j();
                }
            }
            c0224h7I9.a(c0224h7I10, i3);
        }
    }

    public final void f(C0224h7 c0224h7, C0224h7 c0224h8, int i) {
        if (c0224h7.d == this) {
            e(c0224h7.e, c0224h8.d, c0224h8.e, i);
        }
    }

    public final void g(Qg qg) {
        qg.k(this.I);
        qg.k(this.J);
        qg.k(this.K);
        qg.k(this.L);
        if (this.a0 > 0) {
            qg.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            C0693we c0693we = new C0693we(this);
            c0693we.h.e = 4;
            c0693we.i.e = 5;
            c0693we.f = 0;
            this.d = c0693we;
        }
        if (this.e == null) {
            C0336ks c0336ks = new C0336ks(this);
            X8 x8 = new X8(c0336ks);
            c0336ks.k = x8;
            c0336ks.l = null;
            c0336ks.h.e = 6;
            c0336ks.i.e = 7;
            x8.e = 8;
            c0336ks.f = 1;
            this.e = c0336ks;
        }
    }

    public C0224h7 i(int i) {
        switch (Vo.o(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(Vo.n(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final C0655v7 l(int i) {
        C0224h7 c0224h7;
        C0224h7 c0224h8;
        if (i != 0) {
            if (i == 1 && (c0224h8 = (c0224h7 = this.L).f) != null && c0224h8.f == c0224h7) {
                return c0224h8.d;
            }
            return null;
        }
        C0224h7 c0224h9 = this.K;
        C0224h7 c0224h10 = c0224h9.f;
        if (c0224h10 == null || c0224h10.f != c0224h9) {
            return null;
        }
        return c0224h10.d;
    }

    public final C0655v7 m(int i) {
        C0224h7 c0224h7;
        C0224h7 c0224h8;
        if (i != 0) {
            if (i == 1 && (c0224h8 = (c0224h7 = this.J).f) != null && c0224h8.f == c0224h7) {
                return c0224h8.d;
            }
            return null;
        }
        C0224h7 c0224h9 = this.I;
        C0224h7 c0224h10 = c0224h9.f;
        if (c0224h10 == null || c0224h10.f != c0224h9) {
            return null;
        }
        return c0224h10.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.V;
        int i7 = this.c0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        float f4 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.W;
        int i11 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        C0655v7 c0655v7 = this.T;
        return (c0655v7 == null || !(c0655v7 instanceof C0686w7)) ? this.Y : ((C0686w7) c0655v7).x0 + this.Y;
    }

    public final int s() {
        C0655v7 c0655v7 = this.T;
        return (c0655v7 == null || !(c0655v7 instanceof C0686w7)) ? this.Z : ((C0686w7) c0655v7).y0 + this.Z;
    }

    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2;
        }
        return ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0)) + (this.M.f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.h0 != null ? Vo.h(new StringBuilder("id: "), this.h0, " ") : "");
        sb.append("(");
        sb.append(this.Y);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(") - (");
        sb.append(this.U);
        sb.append(" x ");
        sb.append(this.V);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i, int i2) {
        C0224h7 c0224h7;
        C0224h7 c0224h8;
        C0224h7 c0224h9;
        C0224h7 c0224h10;
        if (i == 0) {
            C0224h7 c0224h11 = this.I;
            C0224h7 c0224h12 = c0224h11.f;
            if (c0224h12 != null && c0224h12.c && (c0224h10 = (c0224h9 = this.K).f) != null && c0224h10.c) {
                return (c0224h10.d() - c0224h9.e()) - (c0224h11.e() + c0224h11.f.d()) >= i2;
            }
        } else {
            C0224h7 c0224h13 = this.J;
            C0224h7 c0224h14 = c0224h13.f;
            if (c0224h14 != null && c0224h14.c && (c0224h8 = (c0224h7 = this.L).f) != null && c0224h8.c) {
                return (c0224h8.d() - c0224h7.e()) - (c0224h13.e() + c0224h13.f.d()) >= i2;
            }
        }
        return false;
    }

    public final void v(int i, int i2, int i3, int i4, C0655v7 c0655v7) {
        i(i).b(c0655v7.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        C0224h7 c0224h7;
        C0224h7 c0224h8;
        int i2 = i * 2;
        C0224h7[] c0224h7Arr = this.Q;
        C0224h7 c0224h9 = c0224h7Arr[i2];
        C0224h7 c0224h10 = c0224h9.f;
        return (c0224h10 == null || c0224h10.f == c0224h9 || (c0224h8 = (c0224h7 = c0224h7Arr[i2 + 1]).f) == null || c0224h8.f != c0224h7) ? false : true;
    }

    public final boolean x() {
        C0224h7 c0224h7 = this.I;
        C0224h7 c0224h8 = c0224h7.f;
        if (c0224h8 != null && c0224h8.f == c0224h7) {
            return true;
        }
        C0224h7 c0224h9 = this.K;
        C0224h7 c0224h10 = c0224h9.f;
        return c0224h10 != null && c0224h10.f == c0224h9;
    }

    public final boolean y() {
        C0224h7 c0224h7 = this.J;
        C0224h7 c0224h8 = c0224h7.f;
        if (c0224h8 != null && c0224h8.f == c0224h7) {
            return true;
        }
        C0224h7 c0224h9 = this.L;
        C0224h7 c0224h10 = c0224h9.f;
        return c0224h10 != null && c0224h10.f == c0224h9;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
