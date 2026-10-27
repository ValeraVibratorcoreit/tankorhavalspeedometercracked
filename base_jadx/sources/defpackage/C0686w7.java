package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: w7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0686w7 extends C0655v7 {
    public int A0;
    public E5[] B0;
    public E5[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final C0343l4 L0;
    public ArrayList q0 = new ArrayList();
    public final K2 r0 = new K2(this);
    public final W8 s0;
    public int t0;
    public C0377m7 u0;
    public boolean v0;
    public final Qg w0;
    public int x0;
    public int y0;
    public int z0;

    public C0686w7() {
        W8 w8 = new W8();
        w8.b = true;
        w8.c = true;
        w8.e = new ArrayList();
        new ArrayList();
        w8.f = null;
        w8.g = new C0343l4();
        w8.h = new ArrayList();
        w8.a = this;
        w8.d = this;
        this.s0 = w8;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new Qg();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new E5[4];
        this.C0 = new E5[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new C0343l4();
    }

    public static void V(C0655v7 c0655v7, C0377m7 c0377m7, C0343l4 c0343l4) {
        int i;
        int i2;
        if (c0377m7 == null) {
            return;
        }
        if (c0655v7.g0 == 8 || (c0655v7 instanceof C0138ee) || (c0655v7 instanceof X3)) {
            c0343l4.e = 0;
            c0343l4.f = 0;
            return;
        }
        int[] iArr = c0655v7.p0;
        c0343l4.a = iArr[0];
        c0343l4.b = iArr[1];
        c0343l4.c = c0655v7.q();
        c0343l4.d = c0655v7.k();
        c0343l4.i = false;
        c0343l4.j = 0;
        boolean z = c0343l4.a == 3;
        boolean z2 = c0343l4.b == 3;
        boolean z3 = z && c0655v7.W > 0.0f;
        boolean z4 = z2 && c0655v7.W > 0.0f;
        if (z && c0655v7.t(0) && c0655v7.r == 0 && !z3) {
            c0343l4.a = 2;
            if (z2 && c0655v7.s == 0) {
                c0343l4.a = 1;
            }
            z = false;
        }
        if (z2 && c0655v7.t(1) && c0655v7.s == 0 && !z4) {
            c0343l4.b = 2;
            if (z && c0655v7.r == 0) {
                c0343l4.b = 1;
            }
            z2 = false;
        }
        if (c0655v7.A()) {
            c0343l4.a = 1;
            z = false;
        }
        if (c0655v7.B()) {
            c0343l4.b = 1;
            z2 = false;
        }
        int[] iArr2 = c0655v7.t;
        if (z3) {
            if (iArr2[0] == 4) {
                c0343l4.a = 1;
            } else if (!z2) {
                if (c0343l4.b == 1) {
                    i2 = c0343l4.d;
                } else {
                    c0343l4.a = 2;
                    c0377m7.b(c0655v7, c0343l4);
                    i2 = c0343l4.f;
                }
                c0343l4.a = 1;
                c0343l4.c = (int) (c0655v7.W * i2);
            }
        }
        if (z4) {
            if (iArr2[1] == 4) {
                c0343l4.b = 1;
            } else if (!z) {
                if (c0343l4.a == 1) {
                    i = c0343l4.c;
                } else {
                    c0343l4.b = 2;
                    c0377m7.b(c0655v7, c0343l4);
                    i = c0343l4.e;
                }
                c0343l4.b = 1;
                if (c0655v7.X == -1) {
                    c0343l4.d = (int) (i / c0655v7.W);
                } else {
                    c0343l4.d = (int) (c0655v7.W * i);
                }
            }
        }
        c0377m7.b(c0655v7, c0343l4);
        c0655v7.O(c0343l4.e);
        c0655v7.L(c0343l4.f);
        c0655v7.E = c0343l4.h;
        c0655v7.I(c0343l4.g);
        c0343l4.j = 0;
    }

    @Override // defpackage.C0655v7
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        X();
    }

    @Override // defpackage.C0655v7
    public final void F(K2 k2) {
        super.F(k2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((C0655v7) this.q0.get(i)).F(k2);
        }
    }

    @Override // defpackage.C0655v7
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((C0655v7) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(C0655v7 c0655v7, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            E5[] e5Arr = this.C0;
            if (i2 >= e5Arr.length) {
                this.C0 = (E5[]) Arrays.copyOf(e5Arr, e5Arr.length * 2);
            }
            E5[] e5Arr2 = this.C0;
            int i3 = this.z0;
            e5Arr2[i3] = new E5(c0655v7, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            E5[] e5Arr3 = this.B0;
            if (i4 >= e5Arr3.length) {
                this.B0 = (E5[]) Arrays.copyOf(e5Arr3, e5Arr3.length * 2);
            }
            E5[] e5Arr4 = this.B0;
            int i5 = this.A0;
            e5Arr4[i5] = new E5(c0655v7, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(Qg qg) {
        boolean zW = W(64);
        b(qg, zW);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0655v7 c0655v7 = (C0655v7) this.q0.get(i);
            boolean[] zArr = c0655v7.S;
            zArr[0] = false;
            zArr[1] = false;
            if (c0655v7 instanceof X3) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0655v7 c0655v8 = (C0655v7) this.q0.get(i2);
                if (c0655v8 instanceof X3) {
                    X3 x3 = (X3) c0655v8;
                    for (int i3 = 0; i3 < x3.r0; i3++) {
                        C0655v7 c0655v9 = x3.q0[i3];
                        if (x3.t0 || c0655v9.c()) {
                            int i4 = x3.s0;
                            if (i4 == 0 || i4 == 1) {
                                c0655v9.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c0655v9.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0655v7 c0655v10 = (C0655v7) this.q0.get(i5);
            c0655v10.getClass();
            boolean z2 = c0655v10 instanceof C0075cc;
            if (z2 || (c0655v10 instanceof C0138ee)) {
                if (z2) {
                    hashSet.add(c0655v10);
                } else {
                    c0655v10.b(qg, zW);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0075cc c0075cc = (C0075cc) ((C0655v7) it.next());
                for (int i6 = 0; i6 < c0075cc.r0; i6++) {
                    if (hashSet.contains(c0075cc.q0[i6])) {
                        c0075cc.b(qg, zW);
                        hashSet.remove(c0075cc);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0655v7) it2.next()).b(qg, zW);
                }
                hashSet.clear();
            }
        }
        if (Qg.p) {
            HashSet<C0655v7> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C0655v7 c0655v11 = (C0655v7) this.q0.get(i7);
                c0655v11.getClass();
                if (!(c0655v11 instanceof C0075cc) && !(c0655v11 instanceof C0138ee)) {
                    hashSet2.add(c0655v11);
                }
            }
            a(this, qg, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            for (C0655v7 c0655v12 : hashSet2) {
                Tf.e(this, qg, c0655v12);
                c0655v12.b(qg, zW);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C0655v7 c0655v13 = (C0655v7) this.q0.get(i8);
                if (c0655v13 instanceof C0686w7) {
                    int[] iArr = c0655v13.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c0655v13.M(1);
                    }
                    if (i10 == 2) {
                        c0655v13.N(1);
                    }
                    c0655v13.b(qg, zW);
                    if (i9 == 2) {
                        c0655v13.M(i9);
                    }
                    if (i10 == 2) {
                        c0655v13.N(i10);
                    }
                } else {
                    Tf.e(this, qg, c0655v13);
                    if (!(c0655v13 instanceof C0075cc) && !(c0655v13 instanceof C0138ee)) {
                        c0655v13.b(qg, zW);
                    }
                }
            }
        }
        if (this.z0 > 0) {
            Br.e(this, qg, null, 0);
        }
        if (this.A0 > 0) {
            Br.e(this, qg, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    public final boolean T(int i, boolean z) {
        boolean z2;
        W8 w8 = this.s0;
        C0686w7 c0686w7 = w8.a;
        boolean z3 = false;
        int iJ = c0686w7.j(0);
        int iJ2 = c0686w7.j(1);
        int iR = c0686w7.r();
        int iS = c0686w7.s();
        ArrayList<AbstractC0615tt> arrayList = w8.e;
        if (z && (iJ == 2 || iJ2 == 2)) {
            for (AbstractC0615tt abstractC0615tt : arrayList) {
                if (abstractC0615tt.f == i && !abstractC0615tt.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iJ == 2) {
                    c0686w7.M(1);
                    c0686w7.O(w8.d(c0686w7, 0));
                    c0686w7.d.e.d(c0686w7.q());
                }
            } else if (z && iJ2 == 2) {
                c0686w7.N(1);
                c0686w7.L(w8.d(c0686w7, 1));
                c0686w7.e.e.d(c0686w7.k());
            }
        }
        int[] iArr = c0686w7.p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iQ = c0686w7.q() + iR;
                c0686w7.d.i.d(iQ);
                c0686w7.d.e.d(iQ - iR);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iK = c0686w7.k() + iS;
                c0686w7.e.i.d(iK);
                c0686w7.e.e.d(iK - iS);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        w8.g();
        for (AbstractC0615tt abstractC0615tt2 : arrayList) {
            if (abstractC0615tt2.f == i && (abstractC0615tt2.b != c0686w7 || abstractC0615tt2.g)) {
                abstractC0615tt2.e();
            }
        }
        for (AbstractC0615tt abstractC0615tt3 : arrayList) {
            if (abstractC0615tt3.f == i && (z2 || abstractC0615tt3.b != c0686w7)) {
                if (!abstractC0615tt3.h.j || !abstractC0615tt3.i.j || (!(abstractC0615tt3 instanceof F5) && !abstractC0615tt3.e.j)) {
                    c0686w7.M(iJ);
                    c0686w7.N(iJ2);
                    return z3;
                }
            }
        }
        z3 = true;
        c0686w7.M(iJ);
        c0686w7.N(iJ2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:349:0x05db  */
    /* JADX WARN: Code duplicated, block: B:352:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:360:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:361:0x0606  */
    /* JADX WARN: Code duplicated, block: B:367:0x061a  */
    /* JADX WARN: Code duplicated, block: B:373:0x0633  */
    /* JADX WARN: Code duplicated, block: B:376:0x0639  */
    /* JADX WARN: Code duplicated, block: B:378:0x0641 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:381:0x064f  */
    /* JADX WARN: Code duplicated, block: B:387:0x065f  */
    /* JADX WARN: Code duplicated, block: B:391:0x066a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:396:0x067b  */
    /* JADX WARN: Code duplicated, block: B:399:0x0683  */
    /* JADX WARN: Code duplicated, block: B:403:0x068a  */
    /* JADX WARN: Code duplicated, block: B:406:0x0694  */
    /* JADX WARN: Code duplicated, block: B:408:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:412:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:415:0x06c2 A[Catch: Exception -> 0x06d0, LOOP:12: B:414:0x06c0->B:415:0x06c2, LOOP_END, TryCatch #0 {Exception -> 0x06d0, blocks: (B:413:0x06b4, B:415:0x06c2, B:419:0x06d7), top: B:541:0x06b4 }] */
    /* JADX WARN: Code duplicated, block: B:424:0x06e4 A[Catch: Exception -> 0x070f, TRY_LEAVE, TryCatch #2 {Exception -> 0x070f, blocks: (B:422:0x06de, B:424:0x06e4), top: B:545:0x06de }] */
    /* JADX WARN: Code duplicated, block: B:436:0x0713  */
    /* JADX WARN: Code duplicated, block: B:439:0x0719 A[Catch: Exception -> 0x0705, TRY_ENTER, TryCatch #6 {Exception -> 0x0705, blocks: (B:428:0x06fe, B:439:0x0719, B:441:0x071f, B:444:0x073f, B:446:0x0745, B:450:0x075d), top: B:553:0x06fe }] */
    /* JADX WARN: Code duplicated, block: B:444:0x073f A[Catch: Exception -> 0x0705, TRY_ENTER, TryCatch #6 {Exception -> 0x0705, blocks: (B:428:0x06fe, B:439:0x0719, B:441:0x071f, B:444:0x073f, B:446:0x0745, B:450:0x075d), top: B:553:0x06fe }] */
    /* JADX WARN: Code duplicated, block: B:456:0x076c A[Catch: Exception -> 0x0797, TryCatch #4 {Exception -> 0x0797, blocks: (B:437:0x0715, B:442:0x073b, B:454:0x0768, B:456:0x076c, B:458:0x0772), top: B:549:0x0715 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x079b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:480:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:482:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:484:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:486:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:489:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:491:0x0804 A[LOOP:15: B:490:0x0802->B:491:0x0804, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:495:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:500:0x0824 A[LOOP:14: B:499:0x0822->B:500:0x0824, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:503:0x0858  */
    /* JADX WARN: Code duplicated, block: B:507:0x086a  */
    /* JADX WARN: Code duplicated, block: B:512:0x088a  */
    /* JADX WARN: Code duplicated, block: B:513:0x0896  */
    /* JADX WARN: Code duplicated, block: B:516:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:517:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:519:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:521:0x08bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:524:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:527:0x08d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:532:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:534:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:538:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:545:0x06de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x06a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:611:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v81, types: [int] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v28 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r31v0, types: [v7, w7] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r5v40, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v75, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v28, types: [int] */
    public final void U() {
        int i;
        ?? r23;
        C0224h7 c0224h7;
        int i2;
        int i3;
        C0224h7 c0224h8;
        int i4;
        Qg qg;
        int i5;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i6;
        int i7;
        boolean zW;
        ?? r12;
        int i8;
        boolean z4;
        ?? r21;
        int i9;
        ?? r22;
        ?? r24;
        boolean z5;
        boolean[] zArr;
        int i10;
        boolean z6;
        int iMax;
        ?? r6;
        ?? r18;
        boolean z7;
        int iMax2;
        ?? r0;
        boolean z8;
        boolean z9;
        ?? r1;
        ?? r13;
        boolean z10;
        int i11;
        boolean z11;
        ?? r2;
        ?? r3;
        int i12;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zW2;
        int size;
        int i13;
        boolean z12;
        C0655v7 c0655v7;
        ?? r25;
        boolean z13;
        boolean z14;
        int i14;
        ?? r26;
        WeakReference weakReference;
        C0224h7 c0224h9;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0224h7 c0224h10;
        C0655v7 c0655v8;
        int i15;
        int i16;
        int i17;
        char c2;
        C0584st c0584st;
        C0584st c0584st2;
        int i18;
        int iQ;
        int i19;
        int iK;
        int i20;
        int iB;
        C0584st c0584st3;
        C0584st c0584st4;
        int[] iArr;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size2 = this.q0.size();
        int iMax7 = Math.max(0, q());
        int iMax8 = Math.max(0, k());
        int[] iArr2 = this.p0;
        int i21 = iArr2[1];
        int i22 = iArr2[0];
        int i23 = this.t0;
        C0224h7 c0224h11 = this.J;
        C0224h7 c0224h12 = this.I;
        if (i23 == 0 && Tf.p(this.D0, 1)) {
            C0377m7 c0377m7 = this.u0;
            int i24 = iArr2[0];
            int i25 = iArr2[1];
            E();
            ArrayList arrayList = this.q0;
            int size3 = arrayList.size();
            for (int i26 = 0; i26 < size3; i26++) {
                ((C0655v7) arrayList.get(i26)).E();
            }
            boolean z15 = this.v0;
            if (i24 == 1) {
                J(0, q());
            } else {
                c0224h12.l(0);
                this.Y = 0;
            }
            int i27 = 0;
            boolean z16 = false;
            boolean z17 = false;
            while (i27 < size3) {
                C0224h7 c0224h13 = c0224h12;
                C0655v7 c0655v9 = (C0655v7) arrayList.get(i27);
                int i28 = iMax8;
                if (c0655v9 instanceof C0138ee) {
                    C0138ee c0138ee = (C0138ee) c0655v9;
                    iArr = iArr2;
                    if (c0138ee.u0 == 1) {
                        int i29 = c0138ee.r0;
                        if (i29 != -1) {
                            c0138ee.R(i29);
                        } else if (c0138ee.s0 != -1 && A()) {
                            c0138ee.R(q() - c0138ee.s0);
                        } else if (A()) {
                            c0138ee.R((int) ((c0138ee.q0 * q()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c0655v9 instanceof X3) && ((X3) c0655v9).U() == 0) {
                        z17 = true;
                    }
                }
                i27++;
                iMax8 = i28;
                c0224h12 = c0224h13;
                iArr2 = iArr;
            }
            i = iMax8;
            r23 = iArr2;
            c0224h7 = c0224h12;
            if (z16) {
                for (int i30 = 0; i30 < size3; i30++) {
                    C0655v7 c0655v10 = (C0655v7) arrayList.get(i30);
                    if (c0655v10 instanceof C0138ee) {
                        C0138ee c0138ee2 = (C0138ee) c0655v10;
                        if (c0138ee2.u0 == 1) {
                            Td.v(0, c0377m7, c0138ee2, z15);
                        }
                    }
                }
            }
            Td.v(0, c0377m7, this, z15);
            if (z17) {
                for (int i31 = 0; i31 < size3; i31++) {
                    C0655v7 c0655v11 = (C0655v7) arrayList.get(i31);
                    if (c0655v11 instanceof X3) {
                        X3 x3 = (X3) c0655v11;
                        if (x3.U() == 0 && x3.T()) {
                            Td.v(1, c0377m7, x3, z15);
                        }
                    }
                }
            }
            if (i25 == 1) {
                K(0, k());
            } else {
                c0224h11.l(0);
                this.Z = 0;
            }
            boolean z18 = false;
            boolean z19 = false;
            for (int i32 = 0; i32 < size3; i32++) {
                C0655v7 c0655v12 = (C0655v7) arrayList.get(i32);
                if (c0655v12 instanceof C0138ee) {
                    C0138ee c0138ee3 = (C0138ee) c0655v12;
                    if (c0138ee3.u0 == 0) {
                        int i33 = c0138ee3.r0;
                        if (i33 != -1) {
                            c0138ee3.R(i33);
                        } else if (c0138ee3.s0 != -1 && B()) {
                            c0138ee3.R(k() - c0138ee3.s0);
                        } else if (B()) {
                            c0138ee3.R((int) ((c0138ee3.q0 * k()) + 0.5f));
                        }
                        z18 = true;
                    }
                } else if ((c0655v12 instanceof X3) && ((X3) c0655v12).U() == 1) {
                    z19 = true;
                }
            }
            if (z18) {
                for (int i34 = 0; i34 < size3; i34++) {
                    C0655v7 c0655v13 = (C0655v7) arrayList.get(i34);
                    if (c0655v13 instanceof C0138ee) {
                        C0138ee c0138ee4 = (C0138ee) c0655v13;
                        if (c0138ee4.u0 == 0) {
                            Td.P(1, c0377m7, c0138ee4);
                        }
                    }
                }
            }
            Td.P(0, c0377m7, this);
            if (z19) {
                for (int i35 = 0; i35 < size3; i35++) {
                    C0655v7 c0655v14 = (C0655v7) arrayList.get(i35);
                    if (c0655v14 instanceof X3) {
                        X3 x4 = (X3) c0655v14;
                        if (x4.U() == 1 && x4.T()) {
                            Td.P(1, c0377m7, x4);
                        }
                    }
                }
            }
            for (int i36 = 0; i36 < size3; i36++) {
                C0655v7 c0655v15 = (C0655v7) arrayList.get(i36);
                if (c0655v15.z() && Td.c(c0655v15)) {
                    V(c0655v15, c0377m7, Td.b);
                    if (!(c0655v15 instanceof C0138ee)) {
                        Td.v(0, c0377m7, c0655v15, z15);
                        Td.P(0, c0377m7, c0655v15);
                    } else if (((C0138ee) c0655v15).u0 == 0) {
                        Td.P(0, c0377m7, c0655v15);
                    } else {
                        Td.v(0, c0377m7, c0655v15, z15);
                    }
                }
            }
            for (int i37 = 0; i37 < size2; i37++) {
                C0655v7 c0655v16 = (C0655v7) this.q0.get(i37);
                if (c0655v16.z() && !(c0655v16 instanceof C0138ee) && !(c0655v16 instanceof X3) && !(c0655v16 instanceof C0075cc) && !c0655v16.F) {
                    int iJ = c0655v16.j(0);
                    int iJ2 = c0655v16.j(1);
                    if (iJ != 3 || c0655v16.r == 1 || iJ2 != 3 || c0655v16.s == 1) {
                        V(c0655v16, this.u0, new C0343l4());
                    }
                }
            }
        } else {
            i = iMax8;
            r23 = iArr2;
            c0224h7 = c0224h12;
        }
        Qg qg2 = this.w0;
        if (size2 <= 2 || !((i22 == 2 || i21 == 2) && Tf.p(this.D0, 1024))) {
            i2 = size2;
            i3 = i21;
            c0224h8 = c0224h11;
            i4 = iMax7;
            qg = qg2;
            i5 = i22;
        } else {
            C0377m7 c0377m8 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size4 = arrayList2.size();
            int i38 = 0;
            while (true) {
                if (i38 < size4) {
                    C0655v7 c0655v17 = (C0655v7) arrayList2.get(i38);
                    ?? r7 = r23[0];
                    ?? r5 = r23[1];
                    int[] iArr3 = c0655v17.p0;
                    c0224h8 = c0224h11;
                    if (F4.c0(r7, r5, iArr3[0], iArr3[1]) && !(c0655v17 instanceof C0075cc)) {
                        i38++;
                        c0224h11 = c0224h8;
                    } else {
                        i15 = iMax7;
                        i2 = size2;
                        i16 = i21;
                        i17 = i22;
                        qg = qg2;
                    }
                } else {
                    c0224h8 = c0224h11;
                    int i39 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList<AbstractC0662ve> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<AbstractC0662ve> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i39 < size4) {
                        int i40 = size2;
                        C0655v7 c0655v18 = (C0655v7) arrayList2.get(i39);
                        int i41 = i21;
                        ?? r8 = r23[0];
                        int i42 = iMax7;
                        ?? r4 = r23[1];
                        int i43 = i22;
                        int[] iArr4 = c0655v18.p0;
                        Qg qg3 = qg2;
                        if (!F4.c0(r8, r4, iArr4[0], iArr4[1])) {
                            V(c0655v18, c0377m8, this.L0);
                        }
                        boolean z20 = c0655v18 instanceof C0138ee;
                        if (z20) {
                            C0138ee c0138ee5 = (C0138ee) c0655v18;
                            if (c0138ee5.u0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(c0138ee5);
                            }
                            if (c0138ee5.u0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c0138ee5);
                            }
                        }
                        if (c0655v18 instanceof AbstractC0662ve) {
                            if (c0655v18 instanceof X3) {
                                X3 x5 = (X3) c0655v18;
                                if (x5.U() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(x5);
                                }
                                if (x5.U() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(x5);
                                }
                            } else {
                                AbstractC0662ve abstractC0662ve = (AbstractC0662ve) c0655v18;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(abstractC0662ve);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(abstractC0662ve);
                            }
                        }
                        if (c0655v18.I.f == null && c0655v18.K.f == null && !z20 && !(c0655v18 instanceof X3)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(c0655v18);
                        }
                        if (c0655v18.J.f == null && c0655v18.L.f == null && c0655v18.M.f == null && !z20 && !(c0655v18 instanceof X3)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(c0655v18);
                        }
                        i39++;
                        i21 = i41;
                        size2 = i40;
                        iMax7 = i42;
                        i22 = i43;
                        qg2 = qg3;
                    }
                    i15 = iMax7;
                    Qg qg4 = qg2;
                    i2 = size2;
                    i16 = i21;
                    i17 = i22;
                    ArrayList<C0584st> arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            F4.z((C0138ee) it.next(), 0, arrayList9, null);
                        }
                    }
                    int i44 = 0;
                    C0584st c0584st5 = null;
                    if (arrayList4 != null) {
                        for (AbstractC0662ve abstractC0662ve2 : arrayList4) {
                            C0584st c0584stZ = F4.z(abstractC0662ve2, i44, arrayList9, c0584st5);
                            abstractC0662ve2.R(i44, c0584stZ, arrayList9);
                            c0584stZ.a(arrayList9);
                            i44 = 0;
                            c0584st5 = null;
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            F4.z(((C0224h7) it2.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            F4.z(((C0224h7) it3.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            F4.z(((C0224h7) it4.next()).d, 0, arrayList9, null);
                        }
                    }
                    C0584st c0584st6 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            F4.z((C0655v7) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            F4.z((C0138ee) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i45 = 1;
                    if (arrayList6 != null) {
                        for (AbstractC0662ve abstractC0662ve3 : arrayList6) {
                            C0584st c0584stZ2 = F4.z(abstractC0662ve3, i45, arrayList9, c0584st6);
                            abstractC0662ve3.R(i45, c0584stZ2, arrayList9);
                            c0584stZ2.a(arrayList9);
                            i45 = 1;
                            c0584st6 = null;
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            F4.z(((C0224h7) it7.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            F4.z(((C0224h7) it8.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            F4.z(((C0224h7) it9.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            F4.z(((C0224h7) it10.next()).d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            F4.z((C0655v7) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i46 = 0; i46 < size4; i46++) {
                        C0655v7 c0655v19 = (C0655v7) arrayList2.get(i46);
                        int[] iArr5 = c0655v19.p0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i47 = c0655v19.n0;
                            int size5 = arrayList9.size();
                            int i48 = 0;
                            while (true) {
                                if (i48 >= size5) {
                                    c0584st3 = null;
                                    break;
                                }
                                c0584st3 = (C0584st) arrayList9.get(i48);
                                if (i47 == c0584st3.b) {
                                    break;
                                } else {
                                    i48++;
                                }
                            }
                            int i49 = c0655v19.o0;
                            int size6 = arrayList9.size();
                            int i50 = 0;
                            while (true) {
                                if (i50 >= size6) {
                                    c0584st4 = null;
                                    break;
                                }
                                c0584st4 = (C0584st) arrayList9.get(i50);
                                if (i49 == c0584st4.b) {
                                    break;
                                } else {
                                    i50++;
                                }
                            }
                            if (c0584st3 != null && c0584st4 != null) {
                                c0584st3.c(0, c0584st4);
                                c0584st4.c = 2;
                                arrayList9.remove(c0584st3);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (r23[0] == 2) {
                            int i51 = 0;
                            c0584st = null;
                            for (C0584st c0584st7 : arrayList9) {
                                if (c0584st7.c != 1) {
                                    Qg qg5 = qg4;
                                    int iB2 = c0584st7.b(qg5, 0);
                                    if (iB2 > i51) {
                                        c0584st = c0584st7;
                                        i51 = iB2;
                                    }
                                    qg4 = qg5;
                                }
                            }
                            qg = qg4;
                            c2 = 1;
                            if (c0584st != null) {
                                M(1);
                                O(i51);
                            }
                            if (r23[c2] == 2) {
                                i20 = 0;
                                c0584st2 = null;
                                for (C0584st c0584st8 : arrayList9) {
                                    if (c0584st8.c != 0 && (iB = c0584st8.b(qg, 1)) > i20) {
                                        c0584st2 = c0584st8;
                                        i20 = iB;
                                    }
                                }
                                if (c0584st2 != null) {
                                    N(1);
                                    L(i20);
                                } else {
                                    c0584st2 = null;
                                }
                            } else {
                                c0584st2 = null;
                            }
                            if (c0584st == null || c0584st2 != null) {
                                i5 = i17;
                                if (i5 == 2) {
                                    i18 = i15;
                                    if (i18 < q() || i18 <= 0) {
                                        iQ = q();
                                    } else {
                                        O(i18);
                                        this.E0 = true;
                                    }
                                    i3 = i16;
                                    if (i3 == 2) {
                                        i19 = i;
                                        if (i19 < k() || i19 <= 0) {
                                            iK = k();
                                        } else {
                                            L(i19);
                                            this.F0 = true;
                                        }
                                        i = iK;
                                        i4 = iQ;
                                        z = true;
                                    } else {
                                        i19 = i;
                                    }
                                    iK = i19;
                                    i = iK;
                                    i4 = iQ;
                                    z = true;
                                } else {
                                    i18 = i15;
                                }
                                iQ = i18;
                                i3 = i16;
                                if (i3 == 2) {
                                    i19 = i;
                                    if (i19 < k()) {
                                    }
                                    iK = k();
                                    i = iK;
                                    i4 = iQ;
                                    z = true;
                                } else {
                                    i19 = i;
                                }
                                iK = i19;
                                i = iK;
                                i4 = iQ;
                                z = true;
                            }
                            if (!W(64) || W(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            qg.getClass();
                            qg.g = false;
                            if (this.D0 == 0 && z2) {
                                c = 1;
                                qg.g = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.q0;
                            if (r23[0] != 2 || r23[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i6 = i2;
                            for (i7 = 0; i7 < i6; i7++) {
                                c0655v8 = (C0655v7) this.q0.get(i7);
                                if (c0655v8 instanceof C0686w7) {
                                    ((C0686w7) c0655v8).U();
                                }
                            }
                            zW = W(64);
                            r12 = z;
                            i8 = 0;
                            z4 = true;
                            while (z4) {
                                i9 = i8 + 1;
                                try {
                                    qg.t();
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    g(qg);
                                    for (i14 = 0; i14 < i6; i14++) {
                                        ((C0655v7) this.q0.get(i14)).g(qg);
                                    }
                                    S(qg);
                                    try {
                                        weakReference = this.G0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    C0224h7 c0224h14 = (C0224h7) this.G0.get();
                                                    c0224h9 = c0224h8;
                                                    try {
                                                        Wo woK = qg.k(c0224h9);
                                                        Qg qg6 = this.w0;
                                                        r26 = r12;
                                                        c0224h8 = c0224h9;
                                                        try {
                                                            qg6.f(qg6.k(c0224h14), woK, 0, 5);
                                                            this.G0 = null;
                                                            r26 = r26;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            z14 = true;
                                                            r22 = r26;
                                                            z13 = z14;
                                                            r25 = r22;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z5 = z13;
                                                            r24 = r25;
                                                            zArr = Tf.c;
                                                            if (z5) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(qg, zW2);
                                                                size = this.q0.size();
                                                                i13 = 0;
                                                                z12 = false;
                                                                while (i13 < size) {
                                                                    c0655v7 = (C0655v7) this.q0.get(i13);
                                                                    c0655v7.Q(qg, zW2);
                                                                    boolean z21 = zW2;
                                                                    int i52 = size;
                                                                    if (c0655v7.h == -1) {
                                                                        z12 = true;
                                                                    } else {
                                                                        z12 = true;
                                                                    }
                                                                    i13++;
                                                                    zW2 = z21;
                                                                    size = i52;
                                                                    z12 = z12;
                                                                }
                                                                z6 = z12;
                                                            } else {
                                                                Q(qg, zW);
                                                                for (i10 = 0; i10 < i6; i10++) {
                                                                    ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                                                                }
                                                                z6 = false;
                                                            }
                                                            if (z3) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                for (i12 = 0; i12 < i6; i12++) {
                                                                    C0655v7 c0655v20 = (C0655v7) this.q0.get(i12);
                                                                    iMax3 = Math.max(iMax3, c0655v20.q() + c0655v20.Y);
                                                                    iMax4 = Math.max(iMax4, c0655v20.k() + c0655v20.Z);
                                                                }
                                                                iMax5 = Math.max(this.b0, iMax3);
                                                                iMax6 = Math.max(this.c0, iMax4);
                                                                z6 = z6;
                                                                r24 = r24;
                                                                if (i5 == 2) {
                                                                    z6 = z6;
                                                                    r24 = r24;
                                                                    O(iMax5);
                                                                    r23[0] = 2;
                                                                    z6 = true;
                                                                    r24 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    L(iMax6);
                                                                    r23[1] = 2;
                                                                    z6 = true;
                                                                    r24 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r6 = 1;
                                                                r23[0] = 1;
                                                                z7 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r6 = 1;
                                                                r18 = r24;
                                                                z7 = z6;
                                                            }
                                                            iMax2 = Math.max(this.c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                r23[r6] = r6;
                                                                r3 = r6;
                                                                z8 = r3 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r18;
                                                            }
                                                            if (r0 == 0) {
                                                                z8 = z7;
                                                                if (r23[0] == 2) {
                                                                    r2 = r0;
                                                                    z11 = z8;
                                                                    if (q() > i4) {
                                                                        this.E0 = r6;
                                                                        r23[0] = r6;
                                                                        O(i4);
                                                                        ?? r9 = r6;
                                                                        z11 = r9 == true ? 1 : 0;
                                                                        r2 = r9;
                                                                    }
                                                                }
                                                                r0 = r3;
                                                                r2 = r0;
                                                                r2 = r0;
                                                                z11 = z8;
                                                                z11 = z8;
                                                                r1 = r2;
                                                                r1 = r2;
                                                                z9 = z11;
                                                                z9 = z11;
                                                                if (r23[r6] != 2) {
                                                                }
                                                                if (i9 > i11) {
                                                                    r1 = r2;
                                                                    z9 = z11;
                                                                    z10 = false;
                                                                } else {
                                                                    r1 = r2;
                                                                    z9 = z11;
                                                                }
                                                                z4 = z10;
                                                                i8 = i9;
                                                                r12 = r13;
                                                            } else {
                                                                z8 = z7;
                                                                r0 = r3;
                                                                r1 = r0;
                                                                z9 = z8;
                                                            }
                                                            r1 = r2;
                                                            z9 = z11;
                                                            r13 = r1;
                                                            z10 = z9;
                                                            i11 = 8;
                                                            if (i9 > i11) {
                                                                r1 = r2;
                                                                z9 = z11;
                                                                z10 = false;
                                                            } else {
                                                                r1 = r2;
                                                                z9 = z11;
                                                            }
                                                            z4 = z10;
                                                            i8 = i9;
                                                            r12 = r13;
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        r26 = r12;
                                                        c0224h8 = c0224h9;
                                                    }
                                                } else {
                                                    r26 = r12;
                                                }
                                                try {
                                                    weakReference2 = this.I0;
                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                        C0224h7 c0224h15 = (C0224h7) this.I0.get();
                                                        Wo woK2 = qg.k(this.L);
                                                        Qg qg7 = this.w0;
                                                        qg7.f(woK2, qg7.k(c0224h15), 0, 5);
                                                        this.I0 = null;
                                                    }
                                                    weakReference3 = this.H0;
                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                        C0224h7 c0224h16 = (C0224h7) this.H0.get();
                                                        c0224h10 = c0224h7;
                                                        try {
                                                            Wo woK3 = qg.k(c0224h10);
                                                            Qg qg8 = this.w0;
                                                            c0224h7 = c0224h10;
                                                            qg8.f(qg8.k(c0224h16), woK3, 0, 5);
                                                            this.H0 = null;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            c0224h7 = c0224h10;
                                                            z14 = true;
                                                            r22 = r26;
                                                            z13 = z14;
                                                            r25 = r22;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z5 = z13;
                                                            r24 = r25;
                                                        }
                                                    }
                                                    weakReference4 = this.J0;
                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                        C0224h7 c0224h17 = (C0224h7) this.J0.get();
                                                        Wo woK4 = qg.k(this.K);
                                                        try {
                                                            Qg qg9 = this.w0;
                                                            try {
                                                                qg9.f(woK4, qg9.k(c0224h17), 0, 5);
                                                                try {
                                                                    this.J0 = null;
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    z13 = true;
                                                                    r25 = r26;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    z5 = z13;
                                                                    r24 = r25;
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z13 = true;
                                                            r25 = r26;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z5 = z13;
                                                            r24 = r25;
                                                            zArr = Tf.c;
                                                            if (z5) {
                                                                zArr[2] = false;
                                                                zW2 = W(64);
                                                                Q(qg, zW2);
                                                                size = this.q0.size();
                                                                i13 = 0;
                                                                z12 = false;
                                                                while (i13 < size) {
                                                                    c0655v7 = (C0655v7) this.q0.get(i13);
                                                                    c0655v7.Q(qg, zW2);
                                                                    boolean z22 = zW2;
                                                                    int i53 = size;
                                                                    if (c0655v7.h == -1) {
                                                                        z12 = true;
                                                                    } else {
                                                                        z12 = true;
                                                                    }
                                                                    i13++;
                                                                    zW2 = z22;
                                                                    size = i53;
                                                                    z12 = z12;
                                                                }
                                                                z6 = z12;
                                                            } else {
                                                                Q(qg, zW);
                                                                while (i10 < i6) {
                                                                    ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                                                                }
                                                                z6 = false;
                                                            }
                                                            if (z3) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i12 < i6) {
                                                                    C0655v7 c0655v21 = (C0655v7) this.q0.get(i12);
                                                                    iMax3 = Math.max(iMax3, c0655v21.q() + c0655v21.Y);
                                                                    iMax4 = Math.max(iMax4, c0655v21.k() + c0655v21.Z);
                                                                }
                                                                iMax5 = Math.max(this.b0, iMax3);
                                                                iMax6 = Math.max(this.c0, iMax4);
                                                                z6 = z6;
                                                                r24 = r24;
                                                                if (i5 == 2) {
                                                                    z6 = z6;
                                                                    r24 = r24;
                                                                    O(iMax5);
                                                                    r23[0] = 2;
                                                                    z6 = true;
                                                                    r24 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    L(iMax6);
                                                                    r23[1] = 2;
                                                                    z6 = true;
                                                                    r24 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.b0, q());
                                                            if (iMax > q()) {
                                                                O(iMax);
                                                                r6 = 1;
                                                                r23[0] = 1;
                                                                z7 = true;
                                                                r18 = 1;
                                                            } else {
                                                                r6 = 1;
                                                                r18 = r24;
                                                                z7 = z6;
                                                            }
                                                            iMax2 = Math.max(this.c0, k());
                                                            if (iMax2 > k()) {
                                                                L(iMax2);
                                                                r23[r6] = r6;
                                                                r3 = r6;
                                                                z8 = r3 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r18;
                                                            }
                                                            if (r0 == 0) {
                                                                z8 = z7;
                                                                if (r23[0] == 2) {
                                                                    r2 = r0;
                                                                    z11 = z8;
                                                                    if (q() > i4) {
                                                                        this.E0 = r6;
                                                                        r23[0] = r6;
                                                                        O(i4);
                                                                        ?? r10 = r6;
                                                                        z11 = r10 == true ? 1 : 0;
                                                                        r2 = r10;
                                                                    }
                                                                }
                                                                r0 = r3;
                                                                r2 = r0;
                                                                r2 = r0;
                                                                z11 = z8;
                                                                z11 = z8;
                                                                r1 = r2;
                                                                r1 = r2;
                                                                z9 = z11;
                                                                z9 = z11;
                                                                if (r23[r6] != 2) {
                                                                }
                                                                if (i9 > i11) {
                                                                    r1 = r2;
                                                                    z9 = z11;
                                                                    z10 = false;
                                                                } else {
                                                                    r1 = r2;
                                                                    z9 = z11;
                                                                }
                                                                z4 = z10;
                                                                i8 = i9;
                                                                r12 = r13;
                                                            } else {
                                                                z8 = z7;
                                                                r0 = r3;
                                                                r1 = r0;
                                                                z9 = z8;
                                                            }
                                                            r1 = r2;
                                                            z9 = z11;
                                                            r13 = r1;
                                                            z10 = z9;
                                                            i11 = 8;
                                                            if (i9 > i11) {
                                                                r1 = r2;
                                                                z9 = z11;
                                                                z10 = false;
                                                            } else {
                                                                r1 = r2;
                                                                z9 = z11;
                                                            }
                                                            z4 = z10;
                                                            i8 = i9;
                                                            r12 = r13;
                                                        }
                                                    }
                                                    qg.p();
                                                    z5 = true;
                                                    r24 = r26;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                r26 = r12;
                                            }
                                        } else {
                                            r26 = r12;
                                            weakReference2 = this.I0;
                                            if (weakReference2 != null) {
                                                C0224h7 c0224h18 = (C0224h7) this.I0.get();
                                                Wo woK5 = qg.k(this.L);
                                                Qg qg10 = this.w0;
                                                qg10.f(woK5, qg10.k(c0224h18), 0, 5);
                                                this.I0 = null;
                                            }
                                            weakReference3 = this.H0;
                                            if (weakReference3 != null) {
                                                C0224h7 c0224h19 = (C0224h7) this.H0.get();
                                                c0224h10 = c0224h7;
                                                Wo woK6 = qg.k(c0224h10);
                                                Qg qg11 = this.w0;
                                                c0224h7 = c0224h10;
                                                qg11.f(qg11.k(c0224h19), woK6, 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference4 = this.J0;
                                            if (weakReference4 == null) {
                                            }
                                            qg.p();
                                            z5 = true;
                                            r24 = r26;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        r26 = r12;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    r22 = r12;
                                    z14 = z4;
                                }
                                zArr = Tf.c;
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(qg, zW2);
                                    size = this.q0.size();
                                    i13 = 0;
                                    z12 = false;
                                    while (i13 < size) {
                                        c0655v7 = (C0655v7) this.q0.get(i13);
                                        c0655v7.Q(qg, zW2);
                                        boolean z23 = zW2;
                                        int i54 = size;
                                        if (c0655v7.h == -1 || c0655v7.i != -1) {
                                            z12 = true;
                                        }
                                        i13++;
                                        zW2 = z23;
                                        size = i54;
                                        z12 = z12;
                                    }
                                    z6 = z12;
                                } else {
                                    Q(qg, zW);
                                    while (i10 < i6) {
                                        ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                                    }
                                    z6 = false;
                                }
                                if (z3 && i9 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i12 < i6) {
                                        C0655v7 c0655v22 = (C0655v7) this.q0.get(i12);
                                        iMax3 = Math.max(iMax3, c0655v22.q() + c0655v22.Y);
                                        iMax4 = Math.max(iMax4, c0655v22.k() + c0655v22.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    z6 = z6;
                                    r24 = r24;
                                    if (i5 == 2 && q() < iMax5) {
                                        z6 = z6;
                                        r24 = r24;
                                        O(iMax5);
                                        r23[0] = 2;
                                        z6 = true;
                                        r24 = 1;
                                    }
                                    if (i3 == 2 && k() < iMax6) {
                                        L(iMax6);
                                        r23[1] = 2;
                                        z6 = true;
                                        r24 = 1;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z7 = true;
                                    r18 = 1;
                                } else {
                                    r6 = 1;
                                    r18 = r24;
                                    z7 = z6;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r23[r6] = r6;
                                    r3 = r6;
                                    z8 = r3 == true ? 1 : 0;
                                } else {
                                    r0 = r18;
                                }
                                if (r0 == 0) {
                                    z8 = z7;
                                    if (r23[0] == 2 && i4 > 0) {
                                        r2 = r0;
                                        z11 = z8;
                                        if (q() > i4) {
                                            this.E0 = r6;
                                            r23[0] = r6;
                                            O(i4);
                                            ?? r11 = r6;
                                            z11 = r11 == true ? 1 : 0;
                                            r2 = r11;
                                        }
                                    }
                                    r0 = r3;
                                    r2 = r0;
                                    r2 = r0;
                                    z11 = z8;
                                    z11 = z8;
                                    r1 = r2;
                                    r1 = r2;
                                    z9 = z11;
                                    z9 = z11;
                                    if (r23[r6] != 2 && i > 0 && k() > i) {
                                        this.F0 = r6;
                                        r23[r6] = r6;
                                        L(i);
                                        i11 = 8;
                                        z10 = true;
                                        r13 = 1;
                                    }
                                    if (i9 > i11) {
                                        r1 = r2;
                                        z9 = z11;
                                        z10 = false;
                                    } else {
                                        r1 = r2;
                                        z9 = z11;
                                    }
                                    z4 = z10;
                                    i8 = i9;
                                    r12 = r13;
                                } else {
                                    z8 = z7;
                                    r0 = r3;
                                    r1 = r0;
                                    z9 = z8;
                                }
                                r1 = r2;
                                z9 = z11;
                                r13 = r1;
                                z10 = z9;
                                i11 = 8;
                                if (i9 > i11) {
                                    r1 = r2;
                                    z9 = z11;
                                    z10 = false;
                                } else {
                                    r1 = r2;
                                    z9 = z11;
                                }
                                z4 = z10;
                                i8 = i9;
                                r12 = r13;
                            }
                            r21 = r12;
                            this.q0 = arrayList10;
                            if (r21 != 0) {
                                r23[0] = i5;
                                r23[1] = i3;
                            }
                            F(qg.l);
                        }
                        qg = qg4;
                        c2 = 1;
                        c0584st = null;
                        if (r23[c2] == 2) {
                            i20 = 0;
                            c0584st2 = null;
                            while (r0.hasNext()) {
                                if (c0584st8.c != 0) {
                                    c0584st2 = c0584st8;
                                    i20 = iB;
                                }
                            }
                            if (c0584st2 != null) {
                                N(1);
                                L(i20);
                            } else {
                                c0584st2 = null;
                            }
                        } else {
                            c0584st2 = null;
                        }
                        if (c0584st == null) {
                        }
                        i5 = i17;
                        if (i5 == 2) {
                            i18 = i15;
                            if (i18 < q()) {
                            }
                            iQ = q();
                            i3 = i16;
                            if (i3 == 2) {
                                i19 = i;
                                if (i19 < k()) {
                                }
                                iK = k();
                                i = iK;
                                i4 = iQ;
                                z = true;
                                if (W(64)) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                qg.getClass();
                                qg.g = false;
                                if (this.D0 == 0) {
                                    c = 1;
                                } else {
                                    c = 1;
                                }
                                ArrayList arrayList11 = this.q0;
                                if (r23[0] != 2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                this.z0 = 0;
                                this.A0 = 0;
                                i6 = i2;
                                while (i7 < i6) {
                                    c0655v8 = (C0655v7) this.q0.get(i7);
                                    if (c0655v8 instanceof C0686w7) {
                                        ((C0686w7) c0655v8).U();
                                    }
                                }
                                zW = W(64);
                                r12 = z;
                                i8 = 0;
                                z4 = true;
                                while (z4) {
                                    i9 = i8 + 1;
                                    qg.t();
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    g(qg);
                                    while (i14 < i6) {
                                        ((C0655v7) this.q0.get(i14)).g(qg);
                                    }
                                    S(qg);
                                    weakReference = this.G0;
                                    if (weakReference != null) {
                                        if (weakReference.get() != null) {
                                            C0224h7 c0224h110 = (C0224h7) this.G0.get();
                                            c0224h9 = c0224h8;
                                            Wo woK7 = qg.k(c0224h9);
                                            Qg qg12 = this.w0;
                                            r26 = r12;
                                            c0224h8 = c0224h9;
                                            qg12.f(qg12.k(c0224h110), woK7, 0, 5);
                                            this.G0 = null;
                                            r26 = r26;
                                        } else {
                                            r26 = r12;
                                        }
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            C0224h7 c0224h111 = (C0224h7) this.I0.get();
                                            Wo woK8 = qg.k(this.L);
                                            Qg qg13 = this.w0;
                                            qg13.f(woK8, qg13.k(c0224h111), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            C0224h7 c0224h112 = (C0224h7) this.H0.get();
                                            c0224h10 = c0224h7;
                                            Wo woK9 = qg.k(c0224h10);
                                            Qg qg14 = this.w0;
                                            c0224h7 = c0224h10;
                                            qg14.f(qg14.k(c0224h112), woK9, 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        qg.p();
                                        z5 = true;
                                        r24 = r26;
                                    } else {
                                        r26 = r12;
                                        weakReference2 = this.I0;
                                        if (weakReference2 != null) {
                                            C0224h7 c0224h113 = (C0224h7) this.I0.get();
                                            Wo woK10 = qg.k(this.L);
                                            Qg qg15 = this.w0;
                                            qg15.f(woK10, qg15.k(c0224h113), 0, 5);
                                            this.I0 = null;
                                        }
                                        weakReference3 = this.H0;
                                        if (weakReference3 != null) {
                                            C0224h7 c0224h114 = (C0224h7) this.H0.get();
                                            c0224h10 = c0224h7;
                                            Wo woK11 = qg.k(c0224h10);
                                            Qg qg16 = this.w0;
                                            c0224h7 = c0224h10;
                                            qg16.f(qg16.k(c0224h114), woK11, 0, 5);
                                            this.H0 = null;
                                        }
                                        weakReference4 = this.J0;
                                        if (weakReference4 == null) {
                                        }
                                        qg.p();
                                        z5 = true;
                                        r24 = r26;
                                    }
                                    zArr = Tf.c;
                                    if (z5) {
                                        zArr[2] = false;
                                        zW2 = W(64);
                                        Q(qg, zW2);
                                        size = this.q0.size();
                                        i13 = 0;
                                        z12 = false;
                                        while (i13 < size) {
                                            c0655v7 = (C0655v7) this.q0.get(i13);
                                            c0655v7.Q(qg, zW2);
                                            boolean z24 = zW2;
                                            int i55 = size;
                                            if (c0655v7.h == -1) {
                                                z12 = true;
                                            } else {
                                                z12 = true;
                                            }
                                            i13++;
                                            zW2 = z24;
                                            size = i55;
                                            z12 = z12;
                                        }
                                        z6 = z12;
                                    } else {
                                        Q(qg, zW);
                                        while (i10 < i6) {
                                            ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                                        }
                                        z6 = false;
                                    }
                                    if (z3) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i12 < i6) {
                                            C0655v7 c0655v23 = (C0655v7) this.q0.get(i12);
                                            iMax3 = Math.max(iMax3, c0655v23.q() + c0655v23.Y);
                                            iMax4 = Math.max(iMax4, c0655v23.k() + c0655v23.Z);
                                        }
                                        iMax5 = Math.max(this.b0, iMax3);
                                        iMax6 = Math.max(this.c0, iMax4);
                                        z6 = z6;
                                        r24 = r24;
                                        if (i5 == 2) {
                                            z6 = z6;
                                            r24 = r24;
                                            O(iMax5);
                                            r23[0] = 2;
                                            z6 = true;
                                            r24 = 1;
                                        }
                                        if (i3 == 2) {
                                            L(iMax6);
                                            r23[1] = 2;
                                            z6 = true;
                                            r24 = 1;
                                        }
                                    }
                                    iMax = Math.max(this.b0, q());
                                    if (iMax > q()) {
                                        O(iMax);
                                        r6 = 1;
                                        r23[0] = 1;
                                        z7 = true;
                                        r18 = 1;
                                    } else {
                                        r6 = 1;
                                        r18 = r24;
                                        z7 = z6;
                                    }
                                    iMax2 = Math.max(this.c0, k());
                                    if (iMax2 > k()) {
                                        L(iMax2);
                                        r23[r6] = r6;
                                        r3 = r6;
                                        z8 = r3 == true ? 1 : 0;
                                    } else {
                                        r0 = r18;
                                    }
                                    if (r0 == 0) {
                                        z8 = z7;
                                        if (r23[0] == 2) {
                                            r2 = r0;
                                            z11 = z8;
                                            if (q() > i4) {
                                                this.E0 = r6;
                                                r23[0] = r6;
                                                O(i4);
                                                ?? r14 = r6;
                                                z11 = r14 == true ? 1 : 0;
                                                r2 = r14;
                                            }
                                        }
                                        r0 = r3;
                                        r2 = r0;
                                        r2 = r0;
                                        z11 = z8;
                                        z11 = z8;
                                        r1 = r2;
                                        r1 = r2;
                                        z9 = z11;
                                        z9 = z11;
                                        if (r23[r6] != 2) {
                                        }
                                        if (i9 > i11) {
                                            r1 = r2;
                                            z9 = z11;
                                            z10 = false;
                                        } else {
                                            r1 = r2;
                                            z9 = z11;
                                        }
                                        z4 = z10;
                                        i8 = i9;
                                        r12 = r13;
                                    } else {
                                        z8 = z7;
                                        r0 = r3;
                                        r1 = r0;
                                        z9 = z8;
                                    }
                                    r1 = r2;
                                    z9 = z11;
                                    r13 = r1;
                                    z10 = z9;
                                    i11 = 8;
                                    if (i9 > i11) {
                                        r1 = r2;
                                        z9 = z11;
                                        z10 = false;
                                    } else {
                                        r1 = r2;
                                        z9 = z11;
                                    }
                                    z4 = z10;
                                    i8 = i9;
                                    r12 = r13;
                                }
                                r21 = r12;
                                this.q0 = arrayList11;
                                if (r21 != 0) {
                                    r23[0] = i5;
                                    r23[1] = i3;
                                }
                                F(qg.l);
                            }
                            i19 = i;
                            iK = i19;
                            i = iK;
                            i4 = iQ;
                            z = true;
                            if (W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            qg.getClass();
                            qg.g = false;
                            if (this.D0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList12 = this.q0;
                            if (r23[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i6 = i2;
                            while (i7 < i6) {
                                c0655v8 = (C0655v7) this.q0.get(i7);
                                if (c0655v8 instanceof C0686w7) {
                                    ((C0686w7) c0655v8).U();
                                }
                            }
                            zW = W(64);
                            r12 = z;
                            i8 = 0;
                            z4 = true;
                            while (z4) {
                                i9 = i8 + 1;
                                qg.t();
                                this.z0 = 0;
                                this.A0 = 0;
                                g(qg);
                                while (i14 < i6) {
                                    ((C0655v7) this.q0.get(i14)).g(qg);
                                }
                                S(qg);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        C0224h7 c0224h115 = (C0224h7) this.G0.get();
                                        c0224h9 = c0224h8;
                                        Wo woK12 = qg.k(c0224h9);
                                        Qg qg17 = this.w0;
                                        r26 = r12;
                                        c0224h8 = c0224h9;
                                        qg17.f(qg17.k(c0224h115), woK12, 0, 5);
                                        this.G0 = null;
                                        r26 = r26;
                                    } else {
                                        r26 = r12;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0224h7 c0224h116 = (C0224h7) this.I0.get();
                                        Wo woK13 = qg.k(this.L);
                                        Qg qg18 = this.w0;
                                        qg18.f(woK13, qg18.k(c0224h116), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0224h7 c0224h117 = (C0224h7) this.H0.get();
                                        c0224h10 = c0224h7;
                                        Wo woK14 = qg.k(c0224h10);
                                        Qg qg19 = this.w0;
                                        c0224h7 = c0224h10;
                                        qg19.f(qg19.k(c0224h117), woK14, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    qg.p();
                                    z5 = true;
                                    r24 = r26;
                                } else {
                                    r26 = r12;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0224h7 c0224h118 = (C0224h7) this.I0.get();
                                        Wo woK15 = qg.k(this.L);
                                        Qg qg110 = this.w0;
                                        qg110.f(woK15, qg110.k(c0224h118), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0224h7 c0224h119 = (C0224h7) this.H0.get();
                                        c0224h10 = c0224h7;
                                        Wo woK16 = qg.k(c0224h10);
                                        Qg qg111 = this.w0;
                                        c0224h7 = c0224h10;
                                        qg111.f(qg111.k(c0224h119), woK16, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    qg.p();
                                    z5 = true;
                                    r24 = r26;
                                }
                                zArr = Tf.c;
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(qg, zW2);
                                    size = this.q0.size();
                                    i13 = 0;
                                    z12 = false;
                                    while (i13 < size) {
                                        c0655v7 = (C0655v7) this.q0.get(i13);
                                        c0655v7.Q(qg, zW2);
                                        boolean z25 = zW2;
                                        int i56 = size;
                                        if (c0655v7.h == -1) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        i13++;
                                        zW2 = z25;
                                        size = i56;
                                        z12 = z12;
                                    }
                                    z6 = z12;
                                } else {
                                    Q(qg, zW);
                                    while (i10 < i6) {
                                        ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                                    }
                                    z6 = false;
                                }
                                if (z3) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i12 < i6) {
                                        C0655v7 c0655v24 = (C0655v7) this.q0.get(i12);
                                        iMax3 = Math.max(iMax3, c0655v24.q() + c0655v24.Y);
                                        iMax4 = Math.max(iMax4, c0655v24.k() + c0655v24.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    z6 = z6;
                                    r24 = r24;
                                    if (i5 == 2) {
                                        z6 = z6;
                                        r24 = r24;
                                        O(iMax5);
                                        r23[0] = 2;
                                        z6 = true;
                                        r24 = 1;
                                    }
                                    if (i3 == 2) {
                                        L(iMax6);
                                        r23[1] = 2;
                                        z6 = true;
                                        r24 = 1;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z7 = true;
                                    r18 = 1;
                                } else {
                                    r6 = 1;
                                    r18 = r24;
                                    z7 = z6;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r23[r6] = r6;
                                    r3 = r6;
                                    z8 = r3 == true ? 1 : 0;
                                } else {
                                    r0 = r18;
                                }
                                if (r0 == 0) {
                                    z8 = z7;
                                    if (r23[0] == 2) {
                                        r2 = r0;
                                        z11 = z8;
                                        if (q() > i4) {
                                            this.E0 = r6;
                                            r23[0] = r6;
                                            O(i4);
                                            ?? r15 = r6;
                                            z11 = r15 == true ? 1 : 0;
                                            r2 = r15;
                                        }
                                    }
                                    r0 = r3;
                                    r2 = r0;
                                    r2 = r0;
                                    z11 = z8;
                                    z11 = z8;
                                    r1 = r2;
                                    r1 = r2;
                                    z9 = z11;
                                    z9 = z11;
                                    if (r23[r6] != 2) {
                                    }
                                    if (i9 > i11) {
                                        r1 = r2;
                                        z9 = z11;
                                        z10 = false;
                                    } else {
                                        r1 = r2;
                                        z9 = z11;
                                    }
                                    z4 = z10;
                                    i8 = i9;
                                    r12 = r13;
                                } else {
                                    z8 = z7;
                                    r0 = r3;
                                    r1 = r0;
                                    z9 = z8;
                                }
                                r1 = r2;
                                z9 = z11;
                                r13 = r1;
                                z10 = z9;
                                i11 = 8;
                                if (i9 > i11) {
                                    r1 = r2;
                                    z9 = z11;
                                    z10 = false;
                                } else {
                                    r1 = r2;
                                    z9 = z11;
                                }
                                z4 = z10;
                                i8 = i9;
                                r12 = r13;
                            }
                            r21 = r12;
                            this.q0 = arrayList12;
                            if (r21 != 0) {
                                r23[0] = i5;
                                r23[1] = i3;
                            }
                            F(qg.l);
                        }
                        i18 = i15;
                        iQ = i18;
                        i3 = i16;
                        if (i3 == 2) {
                            i19 = i;
                            if (i19 < k()) {
                            }
                            iK = k();
                            i = iK;
                            i4 = iQ;
                            z = true;
                            if (W(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            qg.getClass();
                            qg.g = false;
                            if (this.D0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList13 = this.q0;
                            if (r23[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.z0 = 0;
                            this.A0 = 0;
                            i6 = i2;
                            while (i7 < i6) {
                                c0655v8 = (C0655v7) this.q0.get(i7);
                                if (c0655v8 instanceof C0686w7) {
                                    ((C0686w7) c0655v8).U();
                                }
                            }
                            zW = W(64);
                            r12 = z;
                            i8 = 0;
                            z4 = true;
                            while (z4) {
                                i9 = i8 + 1;
                                qg.t();
                                this.z0 = 0;
                                this.A0 = 0;
                                g(qg);
                                while (i14 < i6) {
                                    ((C0655v7) this.q0.get(i14)).g(qg);
                                }
                                S(qg);
                                weakReference = this.G0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        C0224h7 c0224h1110 = (C0224h7) this.G0.get();
                                        c0224h9 = c0224h8;
                                        Wo woK17 = qg.k(c0224h9);
                                        Qg qg112 = this.w0;
                                        r26 = r12;
                                        c0224h8 = c0224h9;
                                        qg112.f(qg112.k(c0224h1110), woK17, 0, 5);
                                        this.G0 = null;
                                        r26 = r26;
                                    } else {
                                        r26 = r12;
                                    }
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0224h7 c0224h1111 = (C0224h7) this.I0.get();
                                        Wo woK18 = qg.k(this.L);
                                        Qg qg113 = this.w0;
                                        qg113.f(woK18, qg113.k(c0224h1111), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0224h7 c0224h1112 = (C0224h7) this.H0.get();
                                        c0224h10 = c0224h7;
                                        Wo woK19 = qg.k(c0224h10);
                                        Qg qg114 = this.w0;
                                        c0224h7 = c0224h10;
                                        qg114.f(qg114.k(c0224h1112), woK19, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    qg.p();
                                    z5 = true;
                                    r24 = r26;
                                } else {
                                    r26 = r12;
                                    weakReference2 = this.I0;
                                    if (weakReference2 != null) {
                                        C0224h7 c0224h1113 = (C0224h7) this.I0.get();
                                        Wo woK110 = qg.k(this.L);
                                        Qg qg115 = this.w0;
                                        qg115.f(woK110, qg115.k(c0224h1113), 0, 5);
                                        this.I0 = null;
                                    }
                                    weakReference3 = this.H0;
                                    if (weakReference3 != null) {
                                        C0224h7 c0224h1114 = (C0224h7) this.H0.get();
                                        c0224h10 = c0224h7;
                                        Wo woK111 = qg.k(c0224h10);
                                        Qg qg116 = this.w0;
                                        c0224h7 = c0224h10;
                                        qg116.f(qg116.k(c0224h1114), woK111, 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference4 = this.J0;
                                    if (weakReference4 == null) {
                                    }
                                    qg.p();
                                    z5 = true;
                                    r24 = r26;
                                }
                                zArr = Tf.c;
                                if (z5) {
                                    zArr[2] = false;
                                    zW2 = W(64);
                                    Q(qg, zW2);
                                    size = this.q0.size();
                                    i13 = 0;
                                    z12 = false;
                                    while (i13 < size) {
                                        c0655v7 = (C0655v7) this.q0.get(i13);
                                        c0655v7.Q(qg, zW2);
                                        boolean z26 = zW2;
                                        int i57 = size;
                                        if (c0655v7.h == -1) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        i13++;
                                        zW2 = z26;
                                        size = i57;
                                        z12 = z12;
                                    }
                                    z6 = z12;
                                } else {
                                    Q(qg, zW);
                                    while (i10 < i6) {
                                        ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                                    }
                                    z6 = false;
                                }
                                if (z3) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i12 < i6) {
                                        C0655v7 c0655v25 = (C0655v7) this.q0.get(i12);
                                        iMax3 = Math.max(iMax3, c0655v25.q() + c0655v25.Y);
                                        iMax4 = Math.max(iMax4, c0655v25.k() + c0655v25.Z);
                                    }
                                    iMax5 = Math.max(this.b0, iMax3);
                                    iMax6 = Math.max(this.c0, iMax4);
                                    z6 = z6;
                                    r24 = r24;
                                    if (i5 == 2) {
                                        z6 = z6;
                                        r24 = r24;
                                        O(iMax5);
                                        r23[0] = 2;
                                        z6 = true;
                                        r24 = 1;
                                    }
                                    if (i3 == 2) {
                                        L(iMax6);
                                        r23[1] = 2;
                                        z6 = true;
                                        r24 = 1;
                                    }
                                }
                                iMax = Math.max(this.b0, q());
                                if (iMax > q()) {
                                    O(iMax);
                                    r6 = 1;
                                    r23[0] = 1;
                                    z7 = true;
                                    r18 = 1;
                                } else {
                                    r6 = 1;
                                    r18 = r24;
                                    z7 = z6;
                                }
                                iMax2 = Math.max(this.c0, k());
                                if (iMax2 > k()) {
                                    L(iMax2);
                                    r23[r6] = r6;
                                    r3 = r6;
                                    z8 = r3 == true ? 1 : 0;
                                } else {
                                    r0 = r18;
                                }
                                if (r0 == 0) {
                                    z8 = z7;
                                    if (r23[0] == 2) {
                                        r2 = r0;
                                        z11 = z8;
                                        if (q() > i4) {
                                            this.E0 = r6;
                                            r23[0] = r6;
                                            O(i4);
                                            ?? r16 = r6;
                                            z11 = r16 == true ? 1 : 0;
                                            r2 = r16;
                                        }
                                    }
                                    r0 = r3;
                                    r2 = r0;
                                    r2 = r0;
                                    z11 = z8;
                                    z11 = z8;
                                    r1 = r2;
                                    r1 = r2;
                                    z9 = z11;
                                    z9 = z11;
                                    if (r23[r6] != 2) {
                                    }
                                    if (i9 > i11) {
                                        r1 = r2;
                                        z9 = z11;
                                        z10 = false;
                                    } else {
                                        r1 = r2;
                                        z9 = z11;
                                    }
                                    z4 = z10;
                                    i8 = i9;
                                    r12 = r13;
                                } else {
                                    z8 = z7;
                                    r0 = r3;
                                    r1 = r0;
                                    z9 = z8;
                                }
                                r1 = r2;
                                z9 = z11;
                                r13 = r1;
                                z10 = z9;
                                i11 = 8;
                                if (i9 > i11) {
                                    r1 = r2;
                                    z9 = z11;
                                    z10 = false;
                                } else {
                                    r1 = r2;
                                    z9 = z11;
                                }
                                z4 = z10;
                                i8 = i9;
                                r12 = r13;
                            }
                            r21 = r12;
                            this.q0 = arrayList13;
                            if (r21 != 0) {
                                r23[0] = i5;
                                r23[1] = i3;
                            }
                            F(qg.l);
                        }
                        i19 = i;
                        iK = i19;
                        i = iK;
                        i4 = iQ;
                        z = true;
                        if (W(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        qg.getClass();
                        qg.g = false;
                        if (this.D0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList14 = this.q0;
                        if (r23[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.z0 = 0;
                        this.A0 = 0;
                        i6 = i2;
                        while (i7 < i6) {
                            c0655v8 = (C0655v7) this.q0.get(i7);
                            if (c0655v8 instanceof C0686w7) {
                                ((C0686w7) c0655v8).U();
                            }
                        }
                        zW = W(64);
                        r12 = z;
                        i8 = 0;
                        z4 = true;
                        while (z4) {
                            i9 = i8 + 1;
                            qg.t();
                            this.z0 = 0;
                            this.A0 = 0;
                            g(qg);
                            while (i14 < i6) {
                                ((C0655v7) this.q0.get(i14)).g(qg);
                            }
                            S(qg);
                            weakReference = this.G0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    C0224h7 c0224h1115 = (C0224h7) this.G0.get();
                                    c0224h9 = c0224h8;
                                    Wo woK112 = qg.k(c0224h9);
                                    Qg qg117 = this.w0;
                                    r26 = r12;
                                    c0224h8 = c0224h9;
                                    qg117.f(qg117.k(c0224h1115), woK112, 0, 5);
                                    this.G0 = null;
                                    r26 = r26;
                                } else {
                                    r26 = r12;
                                }
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    C0224h7 c0224h1116 = (C0224h7) this.I0.get();
                                    Wo woK113 = qg.k(this.L);
                                    Qg qg118 = this.w0;
                                    qg118.f(woK113, qg118.k(c0224h1116), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    C0224h7 c0224h1117 = (C0224h7) this.H0.get();
                                    c0224h10 = c0224h7;
                                    Wo woK114 = qg.k(c0224h10);
                                    Qg qg119 = this.w0;
                                    c0224h7 = c0224h10;
                                    qg119.f(qg119.k(c0224h1117), woK114, 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                qg.p();
                                z5 = true;
                                r24 = r26;
                            } else {
                                r26 = r12;
                                weakReference2 = this.I0;
                                if (weakReference2 != null) {
                                    C0224h7 c0224h1118 = (C0224h7) this.I0.get();
                                    Wo woK115 = qg.k(this.L);
                                    Qg qg1110 = this.w0;
                                    qg1110.f(woK115, qg1110.k(c0224h1118), 0, 5);
                                    this.I0 = null;
                                }
                                weakReference3 = this.H0;
                                if (weakReference3 != null) {
                                    C0224h7 c0224h1119 = (C0224h7) this.H0.get();
                                    c0224h10 = c0224h7;
                                    Wo woK116 = qg.k(c0224h10);
                                    Qg qg1111 = this.w0;
                                    c0224h7 = c0224h10;
                                    qg1111.f(qg1111.k(c0224h1119), woK116, 0, 5);
                                    this.H0 = null;
                                }
                                weakReference4 = this.J0;
                                if (weakReference4 == null) {
                                }
                                qg.p();
                                z5 = true;
                                r24 = r26;
                            }
                            zArr = Tf.c;
                            if (z5) {
                                zArr[2] = false;
                                zW2 = W(64);
                                Q(qg, zW2);
                                size = this.q0.size();
                                i13 = 0;
                                z12 = false;
                                while (i13 < size) {
                                    c0655v7 = (C0655v7) this.q0.get(i13);
                                    c0655v7.Q(qg, zW2);
                                    boolean z27 = zW2;
                                    int i58 = size;
                                    if (c0655v7.h == -1) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    i13++;
                                    zW2 = z27;
                                    size = i58;
                                    z12 = z12;
                                }
                                z6 = z12;
                            } else {
                                Q(qg, zW);
                                while (i10 < i6) {
                                    ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                                }
                                z6 = false;
                            }
                            if (z3) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i12 < i6) {
                                    C0655v7 c0655v26 = (C0655v7) this.q0.get(i12);
                                    iMax3 = Math.max(iMax3, c0655v26.q() + c0655v26.Y);
                                    iMax4 = Math.max(iMax4, c0655v26.k() + c0655v26.Z);
                                }
                                iMax5 = Math.max(this.b0, iMax3);
                                iMax6 = Math.max(this.c0, iMax4);
                                z6 = z6;
                                r24 = r24;
                                if (i5 == 2) {
                                    z6 = z6;
                                    r24 = r24;
                                    O(iMax5);
                                    r23[0] = 2;
                                    z6 = true;
                                    r24 = 1;
                                }
                                if (i3 == 2) {
                                    L(iMax6);
                                    r23[1] = 2;
                                    z6 = true;
                                    r24 = 1;
                                }
                            }
                            iMax = Math.max(this.b0, q());
                            if (iMax > q()) {
                                O(iMax);
                                r6 = 1;
                                r23[0] = 1;
                                z7 = true;
                                r18 = 1;
                            } else {
                                r6 = 1;
                                r18 = r24;
                                z7 = z6;
                            }
                            iMax2 = Math.max(this.c0, k());
                            if (iMax2 > k()) {
                                L(iMax2);
                                r23[r6] = r6;
                                r3 = r6;
                                z8 = r3 == true ? 1 : 0;
                            } else {
                                r0 = r18;
                            }
                            if (r0 == 0) {
                                z8 = z7;
                                if (r23[0] == 2) {
                                    r2 = r0;
                                    z11 = z8;
                                    if (q() > i4) {
                                        this.E0 = r6;
                                        r23[0] = r6;
                                        O(i4);
                                        ?? r17 = r6;
                                        z11 = r17 == true ? 1 : 0;
                                        r2 = r17;
                                    }
                                }
                                r0 = r3;
                                r2 = r0;
                                r2 = r0;
                                z11 = z8;
                                z11 = z8;
                                r1 = r2;
                                r1 = r2;
                                z9 = z11;
                                z9 = z11;
                                if (r23[r6] != 2) {
                                }
                                if (i9 > i11) {
                                    r1 = r2;
                                    z9 = z11;
                                    z10 = false;
                                } else {
                                    r1 = r2;
                                    z9 = z11;
                                }
                                z4 = z10;
                                i8 = i9;
                                r12 = r13;
                            } else {
                                z8 = z7;
                                r0 = r3;
                                r1 = r0;
                                z9 = z8;
                            }
                            r1 = r2;
                            z9 = z11;
                            r13 = r1;
                            z10 = z9;
                            i11 = 8;
                            if (i9 > i11) {
                                r1 = r2;
                                z9 = z11;
                                z10 = false;
                            } else {
                                r1 = r2;
                                z9 = z11;
                            }
                            z4 = z10;
                            i8 = i9;
                            r12 = r13;
                        }
                        r21 = r12;
                        this.q0 = arrayList14;
                        if (r21 != 0) {
                            r23[0] = i5;
                            r23[1] = i3;
                        }
                        F(qg.l);
                    }
                    qg = qg4;
                }
                i3 = i16;
                i4 = i15;
                i5 = i17;
            }
        }
        z = false;
        if (W(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        qg.getClass();
        qg.g = false;
        if (this.D0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList15 = this.q0;
        if (r23[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.z0 = 0;
        this.A0 = 0;
        i6 = i2;
        while (i7 < i6) {
            c0655v8 = (C0655v7) this.q0.get(i7);
            if (c0655v8 instanceof C0686w7) {
                ((C0686w7) c0655v8).U();
            }
        }
        zW = W(64);
        r12 = z;
        i8 = 0;
        z4 = true;
        while (z4) {
            i9 = i8 + 1;
            qg.t();
            this.z0 = 0;
            this.A0 = 0;
            g(qg);
            while (i14 < i6) {
                ((C0655v7) this.q0.get(i14)).g(qg);
            }
            S(qg);
            weakReference = this.G0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    C0224h7 c0224h11110 = (C0224h7) this.G0.get();
                    c0224h9 = c0224h8;
                    Wo woK117 = qg.k(c0224h9);
                    Qg qg1112 = this.w0;
                    r26 = r12;
                    c0224h8 = c0224h9;
                    qg1112.f(qg1112.k(c0224h11110), woK117, 0, 5);
                    this.G0 = null;
                    r26 = r26;
                } else {
                    r26 = r12;
                }
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    C0224h7 c0224h11111 = (C0224h7) this.I0.get();
                    Wo woK118 = qg.k(this.L);
                    Qg qg1113 = this.w0;
                    qg1113.f(woK118, qg1113.k(c0224h11111), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    C0224h7 c0224h11112 = (C0224h7) this.H0.get();
                    c0224h10 = c0224h7;
                    Wo woK119 = qg.k(c0224h10);
                    Qg qg1114 = this.w0;
                    c0224h7 = c0224h10;
                    qg1114.f(qg1114.k(c0224h11112), woK119, 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                qg.p();
                z5 = true;
                r24 = r26;
            } else {
                r26 = r12;
                weakReference2 = this.I0;
                if (weakReference2 != null) {
                    C0224h7 c0224h11113 = (C0224h7) this.I0.get();
                    Wo woK1110 = qg.k(this.L);
                    Qg qg1115 = this.w0;
                    qg1115.f(woK1110, qg1115.k(c0224h11113), 0, 5);
                    this.I0 = null;
                }
                weakReference3 = this.H0;
                if (weakReference3 != null) {
                    C0224h7 c0224h11114 = (C0224h7) this.H0.get();
                    c0224h10 = c0224h7;
                    Wo woK1111 = qg.k(c0224h10);
                    Qg qg1116 = this.w0;
                    c0224h7 = c0224h10;
                    qg1116.f(qg1116.k(c0224h11114), woK1111, 0, 5);
                    this.H0 = null;
                }
                weakReference4 = this.J0;
                if (weakReference4 == null) {
                }
                qg.p();
                z5 = true;
                r24 = r26;
            }
            zArr = Tf.c;
            if (z5) {
                zArr[2] = false;
                zW2 = W(64);
                Q(qg, zW2);
                size = this.q0.size();
                i13 = 0;
                z12 = false;
                while (i13 < size) {
                    c0655v7 = (C0655v7) this.q0.get(i13);
                    c0655v7.Q(qg, zW2);
                    boolean z28 = zW2;
                    int i59 = size;
                    if (c0655v7.h == -1) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    i13++;
                    zW2 = z28;
                    size = i59;
                    z12 = z12;
                }
                z6 = z12;
            } else {
                Q(qg, zW);
                while (i10 < i6) {
                    ((C0655v7) this.q0.get(i10)).Q(qg, zW);
                }
                z6 = false;
            }
            if (z3) {
                iMax3 = 0;
                iMax4 = 0;
                while (i12 < i6) {
                    C0655v7 c0655v27 = (C0655v7) this.q0.get(i12);
                    iMax3 = Math.max(iMax3, c0655v27.q() + c0655v27.Y);
                    iMax4 = Math.max(iMax4, c0655v27.k() + c0655v27.Z);
                }
                iMax5 = Math.max(this.b0, iMax3);
                iMax6 = Math.max(this.c0, iMax4);
                z6 = z6;
                r24 = r24;
                if (i5 == 2) {
                    z6 = z6;
                    r24 = r24;
                    O(iMax5);
                    r23[0] = 2;
                    z6 = true;
                    r24 = 1;
                }
                if (i3 == 2) {
                    L(iMax6);
                    r23[1] = 2;
                    z6 = true;
                    r24 = 1;
                }
            }
            iMax = Math.max(this.b0, q());
            if (iMax > q()) {
                O(iMax);
                r6 = 1;
                r23[0] = 1;
                z7 = true;
                r18 = 1;
            } else {
                r6 = 1;
                r18 = r24;
                z7 = z6;
            }
            iMax2 = Math.max(this.c0, k());
            if (iMax2 > k()) {
                L(iMax2);
                r23[r6] = r6;
                r3 = r6;
                z8 = r3 == true ? 1 : 0;
            } else {
                r0 = r18;
            }
            if (r0 == 0) {
                z8 = z7;
                if (r23[0] == 2) {
                    r2 = r0;
                    z11 = z8;
                    if (q() > i4) {
                        this.E0 = r6;
                        r23[0] = r6;
                        O(i4);
                        ?? r19 = r6;
                        z11 = r19 == true ? 1 : 0;
                        r2 = r19;
                    }
                }
                r0 = r3;
                r2 = r0;
                r2 = r0;
                z11 = z8;
                z11 = z8;
                r1 = r2;
                r1 = r2;
                z9 = z11;
                z9 = z11;
                if (r23[r6] != 2) {
                }
                if (i9 > i11) {
                    r1 = r2;
                    z9 = z11;
                    z10 = false;
                } else {
                    r1 = r2;
                    z9 = z11;
                }
                z4 = z10;
                i8 = i9;
                r12 = r13;
            } else {
                z8 = z7;
                r0 = r3;
                r1 = r0;
                z9 = z8;
            }
            r1 = r2;
            z9 = z11;
            r13 = r1;
            z10 = z9;
            i11 = 8;
            if (i9 > i11) {
                r1 = r2;
                z9 = z11;
                z10 = false;
            } else {
                r1 = r2;
                z9 = z11;
            }
            z4 = z10;
            i8 = i9;
            r12 = r13;
        }
        r21 = r12;
        this.q0 = arrayList15;
        if (r21 != 0) {
            r23[0] = i5;
            r23[1] = i3;
        }
        F(qg.l);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    public final void X() {
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.C0655v7
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((C0655v7) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
