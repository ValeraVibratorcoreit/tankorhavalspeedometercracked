package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.jcraft.jsch.SftpATTRS;
import defpackage.AbstractC0658va;
import defpackage.Bd;
import defpackage.C0085cm;
import defpackage.C0269im;
import defpackage.C0324kg;
import defpackage.C0333kp;
import defpackage.C0364lp;
import defpackage.C0426np;
import defpackage.C0457op;
import defpackage.C0488pp;
import defpackage.F4;
import defpackage.Gs;
import defpackage.I;
import defpackage.InterfaceC0239hm;
import defpackage.J;
import defpackage.Pg;
import defpackage.RunnableC0524r0;
import defpackage.Vl;
import defpackage.Wl;
import defpackage.Xl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends Wl implements InterfaceC0239hm {
    public final C0426np B;
    public final int C;
    public boolean D;
    public boolean E;
    public C0457op F;
    public final Rect G;
    public final C0333kp H;
    public final boolean I;
    public int[] J;
    public final RunnableC0524r0 K;
    public final int p;
    public final C0488pp[] q;
    public final AbstractC0658va r;
    public final AbstractC0658va s;
    public final int t;
    public int u;
    public final C0324kg v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        C0426np c0426np = new C0426np(0);
        this.B = c0426np;
        this.C = 2;
        this.G = new Rect();
        this.H = new C0333kp(this);
        this.I = true;
        this.K = new RunnableC0524r0(this, 16);
        Vl vlI = Wl.I(context, attributeSet, i, i2);
        int i3 = vlI.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            AbstractC0658va abstractC0658va = this.r;
            this.r = this.s;
            this.s = abstractC0658va;
            m0();
        }
        int i4 = vlI.b;
        c(null);
        if (i4 != this.p) {
            int[] iArr = (int[]) c0426np.b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0426np.c = null;
            m0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new C0488pp[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new C0488pp(this, i5);
            }
            m0();
        }
        boolean z = vlI.c;
        c(null);
        C0457op c0457op = this.F;
        if (c0457op != null && c0457op.h != z) {
            c0457op.h = z;
        }
        this.w = z;
        m0();
        C0324kg c0324kg = new C0324kg();
        c0324kg.a = true;
        c0324kg.f = 0;
        c0324kg.g = 0;
        this.v = c0324kg;
        this.r = AbstractC0658va.a(this, this.t);
        this.s = AbstractC0658va.a(this, 1 - this.t);
    }

    public static int e1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.Wl
    public final boolean A0() {
        return this.F == null;
    }

    public final int B0(int i) {
        if (v() == 0) {
            return this.x ? 1 : -1;
        }
        return (i < L0()) != this.x ? -1 : 1;
    }

    public final boolean C0() {
        int iL0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iL0 = M0();
                L0();
            } else {
                iL0 = L0();
                M0();
            }
            C0426np c0426np = this.B;
            if (iL0 == 0 && Q0() != null) {
                int[] iArr = (int[]) c0426np.b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0426np.c = null;
                this.f = true;
                m0();
                return true;
            }
        }
        return false;
    }

    public final int D0(C0269im c0269im) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0658va abstractC0658va = this.r;
        boolean z = this.I;
        return F4.k(c0269im, abstractC0658va, I0(!z), H0(!z), this, this.I);
    }

    public final int E0(C0269im c0269im) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0658va abstractC0658va = this.r;
        boolean z = this.I;
        return F4.l(c0269im, abstractC0658va, I0(!z), H0(!z), this, this.I, this.x);
    }

    public final int F0(C0269im c0269im) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0658va abstractC0658va = this.r;
        boolean z = this.I;
        return F4.m(c0269im, abstractC0658va, I0(!z), H0(!z), this, this.I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int G0(C0085cm c0085cm, C0324kg c0324kg, C0269im c0269im) {
        C0488pp c0488pp;
        ?? r6;
        int i;
        int iH;
        int iC;
        int iK;
        int iC2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.y.set(0, this.p, true);
        C0324kg c0324kg2 = this.v;
        int i8 = c0324kg2.i ? c0324kg.e == 1 ? Integer.MAX_VALUE : SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED : c0324kg.e == 1 ? c0324kg.g + c0324kg.b : c0324kg.f - c0324kg.b;
        int i9 = c0324kg.e;
        for (int i10 = 0; i10 < this.p; i10++) {
            if (!this.q[i10].a.isEmpty()) {
                d1(this.q[i10], i9, i8);
            }
        }
        int iG = this.x ? this.r.g() : this.r.k();
        boolean z = false;
        while (true) {
            int i11 = c0324kg.c;
            if (((i11 < 0 || i11 >= c0269im.b()) ? i6 : i7) == 0 || (!c0324kg2.i && this.y.isEmpty())) {
                break;
            }
            View view = c0085cm.i(Long.MAX_VALUE, c0324kg.c).a;
            c0324kg.c += c0324kg.d;
            C0364lp c0364lp = (C0364lp) view.getLayoutParams();
            int iB = c0364lp.a.b();
            C0426np c0426np = this.B;
            int[] iArr = (int[]) c0426np.b;
            int i12 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i12 == -1) {
                if (U0(c0324kg.e)) {
                    i5 = this.p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.p;
                    i5 = i6;
                }
                C0488pp c0488pp2 = null;
                if (c0324kg.e == i7) {
                    int iK2 = this.r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C0488pp c0488pp3 = this.q[i5];
                        int iF = c0488pp3.f(iK2);
                        if (iF < i13) {
                            i13 = iF;
                            c0488pp2 = c0488pp3;
                        }
                        i5 += i3;
                    }
                } else {
                    int iG2 = this.r.g();
                    int i14 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                    while (i5 != i4) {
                        C0488pp c0488pp4 = this.q[i5];
                        int iH2 = c0488pp4.h(iG2);
                        if (iH2 > i14) {
                            c0488pp2 = c0488pp4;
                            i14 = iH2;
                        }
                        i5 += i3;
                    }
                }
                c0488pp = c0488pp2;
                c0426np.c(iB);
                ((int[]) c0426np.b)[iB] = c0488pp.e;
            } else {
                c0488pp = this.q[i12];
            }
            c0364lp.e = c0488pp;
            if (c0324kg.e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.t == 1) {
                i = 1;
                S0(view, Wl.w(r6, this.u, this.l, r6, ((ViewGroup.MarginLayoutParams) c0364lp).width), Wl.w(true, this.o, this.m, D() + G(), ((ViewGroup.MarginLayoutParams) c0364lp).height));
            } else {
                i = 1;
                S0(view, Wl.w(true, this.n, this.l, F() + E(), ((ViewGroup.MarginLayoutParams) c0364lp).width), Wl.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) c0364lp).height));
            }
            if (c0324kg.e == i) {
                iC = c0488pp.f(iG);
                iH = this.r.c(view) + iC;
            } else {
                iH = c0488pp.h(iG);
                iC = iH - this.r.c(view);
            }
            if (c0324kg.e == 1) {
                C0488pp c0488pp5 = c0364lp.e;
                c0488pp5.getClass();
                C0364lp c0364lp2 = (C0364lp) view.getLayoutParams();
                c0364lp2.e = c0488pp5;
                ArrayList arrayList = c0488pp5.a;
                arrayList.add(view);
                c0488pp5.c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                if (arrayList.size() == 1) {
                    c0488pp5.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                }
                if (c0364lp2.a.i() || c0364lp2.a.l()) {
                    c0488pp5.d = c0488pp5.f.r.c(view) + c0488pp5.d;
                }
            } else {
                C0488pp c0488pp6 = c0364lp.e;
                c0488pp6.getClass();
                C0364lp c0364lp3 = (C0364lp) view.getLayoutParams();
                c0364lp3.e = c0488pp6;
                ArrayList arrayList2 = c0488pp6.a;
                arrayList2.add(0, view);
                c0488pp6.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                if (arrayList2.size() == 1) {
                    c0488pp6.c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                }
                if (c0364lp3.a.i() || c0364lp3.a.l()) {
                    c0488pp6.d = c0488pp6.f.r.c(view) + c0488pp6.d;
                }
            }
            if (R0() && this.t == 1) {
                iC2 = this.s.g() - (((this.p - 1) - c0488pp.e) * this.u);
                iK = iC2 - this.s.c(view);
            } else {
                iK = this.s.k() + (c0488pp.e * this.u);
                iC2 = this.s.c(view) + iK;
            }
            if (this.t == 1) {
                Wl.N(view, iK, iC, iC2, iH);
            } else {
                Wl.N(view, iC, iK, iH, iC2);
            }
            d1(c0488pp, c0324kg2.e, i8);
            W0(c0085cm, c0324kg2);
            if (c0324kg2.h && view.hasFocusable()) {
                i2 = 0;
                this.y.set(c0488pp.e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z = true;
        }
        int i15 = i6;
        if (!z) {
            W0(c0085cm, c0324kg2);
        }
        int iK3 = c0324kg2.e == -1 ? this.r.k() - O0(this.r.k()) : N0(this.r.g()) - this.r.g();
        return iK3 > 0 ? Math.min(c0324kg.b, iK3) : i15;
    }

    public final View H0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.r.e(viewU);
            int iB = this.r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View I0(boolean z) {
        int iK = this.r.k();
        int iG = this.r.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = this.r.e(viewU);
            if (this.r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    @Override // defpackage.Wl
    public final int J(C0085cm c0085cm, C0269im c0269im) {
        return this.t == 0 ? this.p : super.J(c0085cm, c0269im);
    }

    public final void J0(C0085cm c0085cm, C0269im c0269im, boolean z) {
        int iG;
        int iN0 = N0(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        if (iN0 != Integer.MIN_VALUE && (iG = this.r.g() - iN0) > 0) {
            int i = iG - (-a1(-iG, c0085cm, c0269im));
            if (!z || i <= 0) {
                return;
            }
            this.r.p(i);
        }
    }

    public final void K0(C0085cm c0085cm, C0269im c0269im, boolean z) {
        int iK;
        int iO0 = O0(Integer.MAX_VALUE);
        if (iO0 != Integer.MAX_VALUE && (iK = iO0 - this.r.k()) > 0) {
            int iA1 = iK - a1(iK, c0085cm, c0269im);
            if (!z || iA1 <= 0) {
                return;
            }
            this.r.p(-iA1);
        }
    }

    @Override // defpackage.Wl
    public final boolean L() {
        return this.C != 0;
    }

    public final int L0() {
        if (v() == 0) {
            return 0;
        }
        return Wl.H(u(0));
    }

    public final int M0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return Wl.H(u(iV - 1));
    }

    public final int N0(int i) {
        int iF = this.q[0].f(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iF2 = this.q[i2].f(i);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    @Override // defpackage.Wl
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C0488pp c0488pp = this.q[i2];
            int i3 = c0488pp.b;
            if (i3 != Integer.MIN_VALUE) {
                c0488pp.b = i3 + i;
            }
            int i4 = c0488pp.c;
            if (i4 != Integer.MIN_VALUE) {
                c0488pp.c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // defpackage.Wl
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            C0488pp c0488pp = this.q[i2];
            int i3 = c0488pp.b;
            if (i3 != Integer.MIN_VALUE) {
                c0488pp.b = i3 + i;
            }
            int i4 = c0488pp.c;
            if (i4 != Integer.MIN_VALUE) {
                c0488pp.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final void P0(int i, int i2, int i3) {
        int i4;
        int i5;
        C0426np c0426np;
        int iM0;
        int iM1 = this.x ? M0() : L0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            c0426np = this.B;
            c0426np.i(i5);
            if (i3 != 1) {
                c0426np.k(i, i2);
            } else if (i3 != 2) {
                c0426np.l(i, i2);
            } else if (i3 == 8) {
                c0426np.l(i, 1);
                c0426np.k(i2, 1);
            }
            if (i4 <= iM1) {
                return;
            }
            if (this.x) {
                iM0 = L0();
            } else {
                iM0 = M0();
            }
            if (i5 <= iM0) {
                m0();
            }
        }
        i4 = i + i2;
        i5 = i;
        c0426np = this.B;
        c0426np.i(i5);
        if (i3 != 1) {
            c0426np.k(i, i2);
        } else if (i3 != 2) {
            c0426np.l(i, i2);
        } else if (i3 == 8) {
            c0426np.l(i, 1);
            c0426np.k(i2, 1);
        }
        if (i4 <= iM1) {
            return;
        }
        if (this.x) {
            iM0 = L0();
        } else {
            iM0 = M0();
        }
        if (i5 <= iM0) {
            m0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x002c A[SYNTHETIC] */
    public final View Q0() {
        boolean z;
        boolean z2;
        int iV = v();
        int i = iV - 1;
        BitSet bitSet = new BitSet(this.p);
        bitSet.set(0, this.p, true);
        byte b = (this.t == 1 && R0()) ? (byte) 1 : (byte) -1;
        if (this.x) {
            iV = -1;
        } else {
            i = 0;
        }
        int i2 = i < iV ? 1 : -1;
        while (i != iV) {
            View viewU = u(i);
            C0364lp c0364lp = (C0364lp) viewU.getLayoutParams();
            if (bitSet.get(c0364lp.e.e)) {
                C0488pp c0488pp = c0364lp.e;
                if (this.x) {
                    int i3 = c0488pp.c;
                    if (i3 == Integer.MIN_VALUE) {
                        c0488pp.a();
                        i3 = c0488pp.c;
                    }
                    if (i3 < this.r.g()) {
                        ArrayList arrayList = c0488pp.a;
                        ((C0364lp) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                    bitSet.clear(c0364lp.e.e);
                } else {
                    int i4 = c0488pp.b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) c0488pp.a.get(0);
                        C0364lp c0364lp2 = (C0364lp) view.getLayoutParams();
                        c0488pp.b = c0488pp.f.r.e(view);
                        c0364lp2.getClass();
                        i4 = c0488pp.b;
                    }
                    if (i4 > this.r.k()) {
                        ((C0364lp) ((View) c0488pp.a.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                    bitSet.clear(c0364lp.e.e);
                }
            }
            i += i2;
            if (i != iV) {
                View viewU2 = u(i);
                if (this.x) {
                    int iB = this.r.b(viewU);
                    int iB2 = this.r.b(viewU2);
                    if (iB < iB2) {
                        return viewU;
                    }
                    if (iB == iB2) {
                        if (c0364lp.e.e - ((C0364lp) viewU2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return viewU;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iE = this.r.e(viewU);
                    int iE2 = this.r.e(viewU2);
                    if (iE > iE2) {
                        return viewU;
                    }
                    if (iE == iE2) {
                        if (c0364lp.e.e - ((C0364lp) viewU2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                            return viewU;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.Wl
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean R0() {
        return C() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0057  */
    /* JADX WARN: Code duplicated, block: B:46:0x005f  */
    @Override // defpackage.Wl
    public final View S(View view, int i, C0085cm c0085cm, C0269im c0269im) {
        View viewA;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (viewA = recyclerView.A(view)) == null || this.a.E(viewA)) {
            viewA = null;
        }
        if (viewA == null) {
            return null;
        }
        Z0();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.t == 0 : !(i != 130 || this.t != 1)) {
                            i2 = 1;
                        }
                    } else if (this.t == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.t == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.t != 1 && R0()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.t != 1 && R0()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0364lp c0364lp = (C0364lp) viewA.getLayoutParams();
        c0364lp.getClass();
        C0488pp c0488pp = c0364lp.e;
        int iM0 = i2 == 1 ? M0() : L0();
        c1(iM0, c0269im);
        b1(i2);
        C0324kg c0324kg = this.v;
        c0324kg.c = c0324kg.d + iM0;
        c0324kg.b = (int) (this.r.l() * 0.33333334f);
        c0324kg.h = true;
        c0324kg.a = false;
        G0(c0085cm, c0324kg, c0269im);
        this.D = this.x;
        View viewG = c0488pp.g(iM0, i2);
        if (viewG != null && viewG != viewA) {
            return viewG;
        }
        if (U0(i2)) {
            for (int i3 = this.p - 1; i3 >= 0; i3--) {
                View viewG2 = this.q[i3].g(iM0, i2);
                if (viewG2 != null && viewG2 != viewA) {
                    return viewG2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.p; i4++) {
                View viewG3 = this.q[i4].g(iM0, i2);
                if (viewG3 != null && viewG3 != viewA) {
                    return viewG3;
                }
            }
        }
        boolean z = (this.w ^ true) == (i2 == -1);
        View viewQ = q(z ? c0488pp.c() : c0488pp.d());
        if (viewQ != null && viewQ != viewA) {
            return viewQ;
        }
        if (U0(i2)) {
            for (int i5 = this.p - 1; i5 >= 0; i5--) {
                if (i5 != c0488pp.e) {
                    View viewQ2 = q(z ? this.q[i5].c() : this.q[i5].d());
                    if (viewQ2 != null && viewQ2 != viewA) {
                        return viewQ2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.p; i6++) {
                View viewQ3 = q(z ? this.q[i6].c() : this.q[i6].d());
                if (viewQ3 != null && viewQ3 != viewA) {
                    return viewQ3;
                }
            }
        }
        return null;
    }

    public final void S0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.K(view));
        }
        C0364lp c0364lp = (C0364lp) view.getLayoutParams();
        int iE1 = e1(i, ((ViewGroup.MarginLayoutParams) c0364lp).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0364lp).rightMargin + rect.right);
        int iE2 = e1(i2, ((ViewGroup.MarginLayoutParams) c0364lp).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0364lp).bottomMargin + rect.bottom);
        if (v0(view, iE1, iE2, c0364lp)) {
            view.measure(iE1, iE2);
        }
    }

    @Override // defpackage.Wl
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View viewI0 = I0(false);
            View viewH0 = H0(false);
            if (viewI0 == null || viewH0 == null) {
                return;
            }
            int iH = Wl.H(viewI0);
            int iH2 = Wl.H(viewH0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:249:0x040d  */
    /* JADX WARN: Code duplicated, block: B:260:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x01ea A[SYNTHETIC] */
    public final void T0(C0085cm c0085cm, C0269im c0269im, boolean z) {
        boolean z2;
        C0457op c0457op;
        int iV;
        int i;
        int iH;
        int iH2;
        int iV2;
        int i2;
        C0457op c0457op2 = this.F;
        C0333kp c0333kp = this.H;
        if (!(c0457op2 == null && this.z == -1) && c0269im.b() == 0) {
            h0(c0085cm);
            c0333kp.a();
            return;
        }
        boolean z3 = (c0333kp.e && this.z == -1 && this.F == null) ? false : true;
        C0426np c0426np = this.B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0333kp.g;
        if (z3) {
            c0333kp.a();
            C0457op c0457op3 = this.F;
            if (c0457op3 != null) {
                int i3 = c0457op3.c;
                if (i3 > 0) {
                    if (i3 == this.p) {
                        for (int i4 = 0; i4 < this.p; i4++) {
                            this.q[i4].b();
                            C0457op c0457op4 = this.F;
                            int iG = c0457op4.d[i4];
                            if (iG != Integer.MIN_VALUE) {
                                iG += c0457op4.i ? this.r.g() : this.r.k();
                            }
                            C0488pp c0488pp = this.q[i4];
                            c0488pp.b = iG;
                            c0488pp.c = iG;
                        }
                    } else {
                        c0457op3.d = null;
                        c0457op3.c = 0;
                        c0457op3.e = 0;
                        c0457op3.f = null;
                        c0457op3.g = null;
                        c0457op3.a = c0457op3.b;
                    }
                }
                C0457op c0457op5 = this.F;
                this.E = c0457op5.j;
                boolean z4 = c0457op5.h;
                c(null);
                C0457op c0457op6 = this.F;
                if (c0457op6 != null && c0457op6.h != z4) {
                    c0457op6.h = z4;
                }
                this.w = z4;
                m0();
                Z0();
                C0457op c0457op7 = this.F;
                int i5 = c0457op7.a;
                if (i5 != -1) {
                    this.z = i5;
                    c0333kp.c = c0457op7.i;
                } else {
                    c0333kp.c = this.x;
                }
                if (c0457op7.e > 1) {
                    c0426np.b = c0457op7.f;
                    c0426np.c = c0457op7.g;
                }
            } else {
                Z0();
                c0333kp.c = this.x;
            }
            if (c0269im.g || (i2 = this.z) == -1) {
                if (this.D) {
                    int iB = c0269im.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iH2 = 0;
                            break;
                        }
                        iH2 = Wl.H(u(iV2));
                        if (iH2 < 0 && iH2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = c0269im.b();
                    iV = v();
                    i = 0;
                    while (true) {
                        if (i >= iV) {
                            iH2 = 0;
                            break;
                        }
                        iH = Wl.H(u(i));
                        if (iH < 0 && iH < iB2) {
                            iH2 = iH;
                            break;
                        }
                        i++;
                    }
                }
                c0333kp.a = iH2;
                c0333kp.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            } else if (i2 < 0 || i2 >= c0269im.b()) {
                this.z = -1;
                this.A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                if (this.D) {
                    int iB3 = c0269im.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iH2 = 0;
                            break;
                        } else {
                            iH2 = Wl.H(u(iV2));
                            if (iH2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = c0269im.b();
                    iV = v();
                    i = 0;
                    while (true) {
                        if (i >= iV) {
                            iH2 = 0;
                            break;
                        } else {
                            iH = Wl.H(u(i));
                            if (iH < 0) {
                            }
                            i++;
                        }
                    }
                }
                c0333kp.a = iH2;
                c0333kp.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            } else {
                C0457op c0457op8 = this.F;
                if (c0457op8 == null || c0457op8.a == -1 || c0457op8.c < 1) {
                    View viewQ = q(this.z);
                    if (viewQ != null) {
                        c0333kp.a = this.x ? M0() : L0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (c0333kp.c) {
                                c0333kp.b = (this.r.g() - this.A) - this.r.b(viewQ);
                            } else {
                                c0333kp.b = (this.r.k() + this.A) - this.r.e(viewQ);
                            }
                        } else if (this.r.c(viewQ) > this.r.l()) {
                            c0333kp.b = c0333kp.c ? this.r.g() : this.r.k();
                        } else {
                            int iE = this.r.e(viewQ) - this.r.k();
                            if (iE < 0) {
                                c0333kp.b = -iE;
                            } else {
                                int iG2 = this.r.g() - this.r.b(viewQ);
                                if (iG2 < 0) {
                                    c0333kp.b = iG2;
                                } else {
                                    c0333kp.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                                }
                            }
                        }
                    } else {
                        int i6 = this.z;
                        c0333kp.a = i6;
                        int i7 = this.A;
                        if (i7 == Integer.MIN_VALUE) {
                            boolean z5 = B0(i6) == 1;
                            c0333kp.c = z5;
                            c0333kp.b = z5 ? staggeredGridLayoutManager.r.g() : staggeredGridLayoutManager.r.k();
                        } else if (c0333kp.c) {
                            c0333kp.b = staggeredGridLayoutManager.r.g() - i7;
                        } else {
                            c0333kp.b = staggeredGridLayoutManager.r.k() + i7;
                        }
                        c0333kp.d = true;
                    }
                } else {
                    c0333kp.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                    c0333kp.a = this.z;
                }
            }
            c0333kp.e = true;
        }
        if (this.F == null && this.z == -1 && (c0333kp.c != this.D || R0() != this.E)) {
            int[] iArr = (int[]) c0426np.b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0426np.c = null;
            c0333kp.d = true;
        }
        if (v() > 0 && ((c0457op = this.F) == null || c0457op.c < 1)) {
            if (c0333kp.d) {
                for (int i8 = 0; i8 < this.p; i8++) {
                    this.q[i8].b();
                    int i9 = c0333kp.b;
                    if (i9 != Integer.MIN_VALUE) {
                        C0488pp c0488pp2 = this.q[i8];
                        c0488pp2.b = i9;
                        c0488pp2.c = i9;
                    }
                }
            } else if (z3 || c0333kp.f == null) {
                for (int i10 = 0; i10 < this.p; i10++) {
                    C0488pp c0488pp3 = this.q[i10];
                    boolean z6 = this.x;
                    int i11 = c0333kp.b;
                    int iF = z6 ? c0488pp3.f(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED) : c0488pp3.h(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                    c0488pp3.b();
                    if (iF != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = c0488pp3.f;
                        if ((!z6 || iF >= staggeredGridLayoutManager2.r.g()) && (z6 || iF <= staggeredGridLayoutManager2.r.k())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iF += i11;
                            }
                            c0488pp3.c = iF;
                            c0488pp3.b = iF;
                        }
                    }
                }
                C0488pp[] c0488ppArr = this.q;
                int length = c0488ppArr.length;
                int[] iArr2 = c0333kp.f;
                if (iArr2 == null || iArr2.length < length) {
                    c0333kp.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c0333kp.f[i12] = c0488ppArr[i12].h(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                }
            } else {
                for (int i13 = 0; i13 < this.p; i13++) {
                    C0488pp c0488pp4 = this.q[i13];
                    c0488pp4.b();
                    int i14 = c0333kp.f[i13];
                    c0488pp4.b = i14;
                    c0488pp4.c = i14;
                }
            }
        }
        p(c0085cm);
        C0324kg c0324kg = this.v;
        c0324kg.a = false;
        int iL = this.s.l();
        this.u = iL / this.p;
        View.MeasureSpec.makeMeasureSpec(iL, this.s.i());
        c1(c0333kp.a, c0269im);
        if (c0333kp.c) {
            b1(-1);
            G0(c0085cm, c0324kg, c0269im);
            b1(1);
            c0324kg.c = c0333kp.a + c0324kg.d;
            G0(c0085cm, c0324kg, c0269im);
        } else {
            b1(1);
            G0(c0085cm, c0324kg, c0269im);
            b1(-1);
            c0324kg.c = c0333kp.a + c0324kg.d;
            G0(c0085cm, c0324kg, c0269im);
        }
        if (this.s.i() != 1073741824) {
            int iV3 = v();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iV3; i15++) {
                View viewU = u(i15);
                float fC = this.s.c(viewU);
                if (fC >= fMax) {
                    ((C0364lp) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i16 = this.u;
            int iRound = Math.round(fMax * this.p);
            if (this.s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.s.l());
            }
            this.u = iRound / this.p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.s.i());
            if (this.u != i16) {
                for (int i17 = 0; i17 < iV3; i17++) {
                    View viewU2 = u(i17);
                    C0364lp c0364lp = (C0364lp) viewU2.getLayoutParams();
                    c0364lp.getClass();
                    if (R0() && this.t == 1) {
                        int i18 = -((this.p - 1) - c0364lp.e.e);
                        viewU2.offsetLeftAndRight((this.u * i18) - (i18 * i16));
                    } else {
                        int i19 = c0364lp.e.e;
                        int i20 = this.u * i19;
                        int i21 = i19 * i16;
                        if (this.t == 1) {
                            viewU2.offsetLeftAndRight(i20 - i21);
                        } else {
                            viewU2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.x) {
                J0(c0085cm, c0269im, true);
                K0(c0085cm, c0269im, false);
            } else {
                K0(c0085cm, c0269im, true);
                J0(c0085cm, c0269im, false);
            }
        }
        if (z && !c0269im.g && this.C != 0 && v() > 0 && Q0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z2 = C0();
        }
        if (c0269im.g) {
            c0333kp.a();
        }
        this.D = c0333kp.c;
        this.E = R0();
        if (z2) {
            c0333kp.a();
            T0(c0085cm, c0269im, false);
        }
    }

    @Override // defpackage.Wl
    public final void U(C0085cm c0085cm, C0269im c0269im, View view, J j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0364lp)) {
            V(view, j);
            return;
        }
        C0364lp c0364lp = (C0364lp) layoutParams;
        if (this.t == 0) {
            C0488pp c0488pp = c0364lp.e;
            j.h(I.a(false, c0488pp == null ? -1 : c0488pp.e, 1, -1, -1));
        } else {
            C0488pp c0488pp2 = c0364lp.e;
            j.h(I.a(false, -1, -1, c0488pp2 == null ? -1 : c0488pp2.e, 1));
        }
    }

    public final boolean U0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == R0();
    }

    public final void V0(int i, C0269im c0269im) {
        int iL0;
        int i2;
        if (i > 0) {
            iL0 = M0();
            i2 = 1;
        } else {
            iL0 = L0();
            i2 = -1;
        }
        C0324kg c0324kg = this.v;
        c0324kg.a = true;
        c1(iL0, c0269im);
        b1(i2);
        c0324kg.c = iL0 + c0324kg.d;
        c0324kg.b = Math.abs(i);
    }

    @Override // defpackage.Wl
    public final void W(int i, int i2) {
        P0(i, i2, 1);
    }

    public final void W0(C0085cm c0085cm, C0324kg c0324kg) {
        int iMin;
        if (!c0324kg.a || c0324kg.i) {
            return;
        }
        if (c0324kg.b == 0) {
            if (c0324kg.e == -1) {
                X0(c0085cm, c0324kg.g);
                return;
            } else {
                Y0(c0085cm, c0324kg.f);
                return;
            }
        }
        int i = 1;
        if (c0324kg.e == -1) {
            int i2 = c0324kg.f;
            int iH = this.q[0].h(i2);
            while (i < this.p) {
                int iH2 = this.q[i].h(i2);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i++;
            }
            int i3 = i2 - iH;
            X0(c0085cm, i3 < 0 ? c0324kg.g : c0324kg.g - Math.min(i3, c0324kg.b));
            return;
        }
        int i4 = c0324kg.g;
        int iF = this.q[0].f(i4);
        while (i < this.p) {
            int iF2 = this.q[i].f(i4);
            if (iF2 < iF) {
                iF = iF2;
            }
            i++;
        }
        int i5 = iF - c0324kg.g;
        if (i5 < 0) {
            iMin = c0324kg.f;
        } else {
            iMin = Math.min(i5, c0324kg.b) + c0324kg.f;
        }
        Y0(c0085cm, iMin);
    }

    @Override // defpackage.Wl
    public final void X() {
        C0426np c0426np = this.B;
        int[] iArr = (int[]) c0426np.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0426np.c = null;
        m0();
    }

    public final void X0(C0085cm c0085cm, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.r.e(viewU) < i || this.r.o(viewU) < i) {
                return;
            }
            C0364lp c0364lp = (C0364lp) viewU.getLayoutParams();
            c0364lp.getClass();
            if (c0364lp.e.a.size() == 1) {
                return;
            }
            C0488pp c0488pp = c0364lp.e;
            ArrayList arrayList = c0488pp.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0364lp c0364lp2 = (C0364lp) view.getLayoutParams();
            c0364lp2.e = null;
            if (c0364lp2.a.i() || c0364lp2.a.l()) {
                c0488pp.d -= c0488pp.f.r.c(view);
            }
            if (size == 1) {
                c0488pp.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            }
            c0488pp.c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            j0(viewU, c0085cm);
        }
    }

    @Override // defpackage.Wl
    public final void Y(int i, int i2) {
        P0(i, i2, 8);
    }

    public final void Y0(C0085cm c0085cm, int i) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.r.b(viewU) > i || this.r.n(viewU) > i) {
                return;
            }
            C0364lp c0364lp = (C0364lp) viewU.getLayoutParams();
            c0364lp.getClass();
            if (c0364lp.e.a.size() == 1) {
                return;
            }
            C0488pp c0488pp = c0364lp.e;
            ArrayList arrayList = c0488pp.a;
            View view = (View) arrayList.remove(0);
            C0364lp c0364lp2 = (C0364lp) view.getLayoutParams();
            c0364lp2.e = null;
            if (arrayList.size() == 0) {
                c0488pp.c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            }
            if (c0364lp2.a.i() || c0364lp2.a.l()) {
                c0488pp.d -= c0488pp.f.r.c(view);
            }
            c0488pp.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
            j0(viewU, c0085cm);
        }
    }

    @Override // defpackage.Wl
    public final void Z(int i, int i2) {
        P0(i, i2, 2);
    }

    public final void Z0() {
        if (this.t == 1 || !R0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.InterfaceC0239hm
    public final PointF a(int i) {
        int iB0 = B0(i);
        PointF pointF = new PointF();
        if (iB0 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = iB0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iB0;
        }
        return pointF;
    }

    @Override // defpackage.Wl
    public final void a0(int i, int i2) {
        P0(i, i2, 4);
    }

    public final int a1(int i, C0085cm c0085cm, C0269im c0269im) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        V0(i, c0269im);
        C0324kg c0324kg = this.v;
        int iG0 = G0(c0085cm, c0324kg, c0269im);
        if (c0324kg.b >= iG0) {
            i = i < 0 ? -iG0 : iG0;
        }
        this.r.p(-i);
        this.D = this.x;
        c0324kg.b = 0;
        W0(c0085cm, c0324kg);
        return i;
    }

    @Override // defpackage.Wl
    public final void b0(C0085cm c0085cm, C0269im c0269im) {
        T0(c0085cm, c0269im, true);
    }

    public final void b1(int i) {
        C0324kg c0324kg = this.v;
        c0324kg.e = i;
        c0324kg.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.Wl
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.Wl
    public final void c0(C0269im c0269im) {
        this.z = -1;
        this.A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.F = null;
        this.H.a();
    }

    public final void c1(int i, C0269im c0269im) {
        int iL;
        int iL2;
        int i2;
        C0324kg c0324kg = this.v;
        boolean z = false;
        c0324kg.b = 0;
        c0324kg.c = i;
        Pg pg = this.e;
        if (!(pg != null && pg.e) || (i2 = c0269im.a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iL = this.r.l();
                iL2 = 0;
            } else {
                iL2 = this.r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.g) {
            c0324kg.g = this.r.f() + iL;
            c0324kg.f = -iL2;
        } else {
            c0324kg.f = this.r.k() - iL2;
            c0324kg.g = this.r.g() + iL;
        }
        c0324kg.h = false;
        c0324kg.a = true;
        if (this.r.i() == 0 && this.r.f() == 0) {
            z = true;
        }
        c0324kg.i = z;
    }

    @Override // defpackage.Wl
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.Wl
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0457op) {
            this.F = (C0457op) parcelable;
            m0();
        }
    }

    public final void d1(C0488pp c0488pp, int i, int i2) {
        int i3 = c0488pp.d;
        int i4 = c0488pp.e;
        if (i != -1) {
            int i5 = c0488pp.c;
            if (i5 == Integer.MIN_VALUE) {
                c0488pp.a();
                i5 = c0488pp.c;
            }
            if (i5 - i3 >= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c0488pp.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) c0488pp.a.get(0);
            C0364lp c0364lp = (C0364lp) view.getLayoutParams();
            c0488pp.b = c0488pp.f.r.e(view);
            c0364lp.getClass();
            i6 = c0488pp.b;
        }
        if (i6 + i3 <= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // defpackage.Wl
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.Wl
    public final Parcelable e0() {
        int iH;
        int iK;
        int[] iArr;
        C0457op c0457op = this.F;
        if (c0457op != null) {
            C0457op c0457op2 = new C0457op();
            c0457op2.c = c0457op.c;
            c0457op2.a = c0457op.a;
            c0457op2.b = c0457op.b;
            c0457op2.d = c0457op.d;
            c0457op2.e = c0457op.e;
            c0457op2.f = c0457op.f;
            c0457op2.h = c0457op.h;
            c0457op2.i = c0457op.i;
            c0457op2.j = c0457op.j;
            c0457op2.g = c0457op.g;
            return c0457op2;
        }
        C0457op c0457op3 = new C0457op();
        c0457op3.h = this.w;
        c0457op3.i = this.D;
        c0457op3.j = this.E;
        C0426np c0426np = this.B;
        if (c0426np == null || (iArr = (int[]) c0426np.b) == null) {
            c0457op3.e = 0;
        } else {
            c0457op3.f = iArr;
            c0457op3.e = iArr.length;
            c0457op3.g = (List) c0426np.c;
        }
        if (v() > 0) {
            c0457op3.a = this.D ? M0() : L0();
            View viewH0 = this.x ? H0(true) : I0(true);
            c0457op3.b = viewH0 != null ? Wl.H(viewH0) : -1;
            int i = this.p;
            c0457op3.c = i;
            c0457op3.d = new int[i];
            for (int i2 = 0; i2 < this.p; i2++) {
                if (this.D) {
                    iH = this.q[i2].f(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.r.g();
                        iH -= iK;
                    }
                } else {
                    iH = this.q[i2].h(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
                    if (iH != Integer.MIN_VALUE) {
                        iK = this.r.k();
                        iH -= iK;
                    }
                }
                c0457op3.d[i2] = iH;
            }
        } else {
            c0457op3.a = -1;
            c0457op3.b = -1;
            c0457op3.c = 0;
        }
        return c0457op3;
    }

    @Override // defpackage.Wl
    public final boolean f(Xl xl) {
        return xl instanceof C0364lp;
    }

    @Override // defpackage.Wl
    public final void f0(int i) {
        if (i == 0) {
            C0();
        }
    }

    @Override // defpackage.Wl
    public final void h(int i, int i2, C0269im c0269im, Bd bd) {
        C0324kg c0324kg;
        int iF;
        int iH;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        V0(i, c0269im);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.p) {
            this.J = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            c0324kg = this.v;
            if (i3 >= i5) {
                break;
            }
            if (c0324kg.d == -1) {
                iF = c0324kg.f;
                iH = this.q[i3].h(iF);
            } else {
                iF = this.q[i3].f(c0324kg.g);
                iH = c0324kg.g;
            }
            int i6 = iF - iH;
            if (i6 >= 0) {
                this.J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c0324kg.c;
            if (i8 < 0 || i8 >= c0269im.b()) {
                return;
            }
            bd.a(c0324kg.c, this.J[i7]);
            c0324kg.c += c0324kg.d;
        }
    }

    @Override // defpackage.Wl
    public final int j(C0269im c0269im) {
        return D0(c0269im);
    }

    @Override // defpackage.Wl
    public final int k(C0269im c0269im) {
        return E0(c0269im);
    }

    @Override // defpackage.Wl
    public final int l(C0269im c0269im) {
        return F0(c0269im);
    }

    @Override // defpackage.Wl
    public final int m(C0269im c0269im) {
        return D0(c0269im);
    }

    @Override // defpackage.Wl
    public final int n(C0269im c0269im) {
        return E0(c0269im);
    }

    @Override // defpackage.Wl
    public final int n0(int i, C0085cm c0085cm, C0269im c0269im) {
        return a1(i, c0085cm, c0269im);
    }

    @Override // defpackage.Wl
    public final int o(C0269im c0269im) {
        return F0(c0269im);
    }

    @Override // defpackage.Wl
    public final void o0(int i) {
        C0457op c0457op = this.F;
        if (c0457op != null && c0457op.a != i) {
            c0457op.d = null;
            c0457op.c = 0;
            c0457op.a = -1;
            c0457op.b = -1;
        }
        this.z = i;
        this.A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        m0();
    }

    @Override // defpackage.Wl
    public final int p0(int i, C0085cm c0085cm, C0269im c0269im) {
        return a1(i, c0085cm, c0269im);
    }

    @Override // defpackage.Wl
    public final Xl r() {
        return this.t == 0 ? new C0364lp(-2, -1) : new C0364lp(-1, -2);
    }

    @Override // defpackage.Wl
    public final Xl s(Context context, AttributeSet attributeSet) {
        return new C0364lp(context, attributeSet);
    }

    @Override // defpackage.Wl
    public final void s0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        int i3 = this.p;
        int iF = F() + E();
        int iD = D() + G();
        if (this.t == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = Gs.a;
            iG2 = Wl.g(i2, iHeight, recyclerView.getMinimumHeight());
            iG = Wl.g(i, (this.u * i3) + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = Gs.a;
            iG = Wl.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = Wl.g(i2, (this.u * i3) + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // defpackage.Wl
    public final Xl t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0364lp((ViewGroup.MarginLayoutParams) layoutParams) : new C0364lp(layoutParams);
    }

    @Override // defpackage.Wl
    public final int x(C0085cm c0085cm, C0269im c0269im) {
        return this.t == 1 ? this.p : super.x(c0085cm, c0269im);
    }

    @Override // defpackage.Wl
    public final void y0(RecyclerView recyclerView, int i) {
        Pg pg = new Pg(recyclerView.getContext());
        pg.a = i;
        z0(pg);
    }
}
