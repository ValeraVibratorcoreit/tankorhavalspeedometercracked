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
import defpackage.AbstractC0361lm;
import defpackage.AbstractC0658va;
import defpackage.Bd;
import defpackage.C0085cm;
import defpackage.C0269im;
import defpackage.F4;
import defpackage.InterfaceC0239hm;
import defpackage.Lg;
import defpackage.Mg;
import defpackage.Ng;
import defpackage.Og;
import defpackage.Pg;
import defpackage.Vl;
import defpackage.Vo;
import defpackage.Wl;
import defpackage.Xl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends Wl implements InterfaceC0239hm {
    public final Lg A;
    public final Mg B;
    public final int C;
    public final int[] D;
    public int p;
    public Ng q;
    public AbstractC0658va r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public Og z;

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.z = null;
        this.A = new Lg();
        this.B = new Mg();
        this.C = 2;
        this.D = new int[2];
        a1(i);
        c(null);
        if (this.t) {
            this.t = false;
            m0();
        }
    }

    @Override // defpackage.Wl
    public boolean A0() {
        return this.z == null && this.s == this.v;
    }

    public void B0(C0269im c0269im, int[] iArr) {
        int i;
        int iL = c0269im.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    public void C0(C0269im c0269im, Ng ng, Bd bd) {
        int i = ng.d;
        if (i < 0 || i >= c0269im.b()) {
            return;
        }
        bd.a(i, Math.max(0, ng.g));
    }

    public final int D0(C0269im c0269im) {
        if (v() == 0) {
            return 0;
        }
        H0();
        AbstractC0658va abstractC0658va = this.r;
        boolean z = !this.w;
        return F4.k(c0269im, abstractC0658va, K0(z), J0(z), this, this.w);
    }

    public final int E0(C0269im c0269im) {
        if (v() == 0) {
            return 0;
        }
        H0();
        AbstractC0658va abstractC0658va = this.r;
        boolean z = !this.w;
        return F4.l(c0269im, abstractC0658va, K0(z), J0(z), this, this.w, this.u);
    }

    public final int F0(C0269im c0269im) {
        if (v() == 0) {
            return 0;
        }
        H0();
        AbstractC0658va abstractC0658va = this.r;
        boolean z = !this.w;
        return F4.m(c0269im, abstractC0658va, K0(z), J0(z), this, this.w);
    }

    public final int G0(int i) {
        if (i == 1) {
            return (this.p != 1 && T0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.p != 1 && T0()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.p == 0) {
                return -1;
            }
            return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i == 33) {
            if (this.p == 1) {
                return -1;
            }
            return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i == 66) {
            if (this.p == 0) {
                return 1;
            }
            return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        }
        if (i == 130 && this.p == 1) {
            return 1;
        }
        return SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    public final void H0() {
        if (this.q == null) {
            Ng ng = new Ng();
            ng.a = true;
            ng.h = 0;
            ng.i = 0;
            ng.k = null;
            this.q = ng;
        }
    }

    public final int I0(C0085cm c0085cm, Ng ng, C0269im c0269im, boolean z) {
        int i;
        int i2 = ng.c;
        int i3 = ng.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                ng.g = i3 + i2;
            }
            W0(c0085cm, ng);
        }
        int i4 = ng.c + ng.h;
        while (true) {
            if ((!ng.l && i4 <= 0) || (i = ng.d) < 0 || i >= c0269im.b()) {
                break;
            }
            Mg mg = this.B;
            mg.a = 0;
            mg.b = false;
            mg.c = false;
            mg.d = false;
            U0(c0085cm, c0269im, ng, mg);
            if (!mg.b) {
                int i5 = ng.b;
                int i6 = mg.a;
                ng.b = (ng.f * i6) + i5;
                if (!mg.c || ng.k != null || !c0269im.g) {
                    ng.c -= i6;
                    i4 -= i6;
                }
                int i7 = ng.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    ng.g = i8;
                    int i9 = ng.c;
                    if (i9 < 0) {
                        ng.g = i8 + i9;
                    }
                    W0(c0085cm, ng);
                }
                if (z && mg.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - ng.c;
    }

    public final View J0(boolean z) {
        return this.u ? N0(0, v(), z) : N0(v() - 1, -1, z);
    }

    public final View K0(boolean z) {
        return this.u ? N0(v() - 1, -1, z) : N0(0, v(), z);
    }

    @Override // defpackage.Wl
    public final boolean L() {
        return true;
    }

    public final int L0() {
        View viewN0 = N0(v() - 1, -1, false);
        if (viewN0 == null) {
            return -1;
        }
        return Wl.H(viewN0);
    }

    public final View M0(int i, int i2) {
        int i3;
        int i4;
        H0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.d(i, i2, i3, i4) : this.d.d(i, i2, i3, i4);
    }

    public final View N0(int i, int i2, boolean z) {
        H0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.d(i, i2, i3, 320) : this.d.d(i, i2, i3, 320);
    }

    public View O0(C0085cm c0085cm, C0269im c0269im, int i, int i2, int i3) {
        H0();
        int iK = this.r.k();
        int iG = this.r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewU = u(i);
            int iH = Wl.H(viewU);
            if (iH >= 0 && iH < i3) {
                if (((Xl) viewU.getLayoutParams()).a.i()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int P0(int i, C0085cm c0085cm, C0269im c0269im, boolean z) {
        int iG;
        int iG2 = this.r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i2 = -Z0(-iG2, c0085cm, c0269im);
        int i3 = i + i2;
        if (!z || (iG = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.p(iG);
        return iG + i2;
    }

    public final int Q0(int i, C0085cm c0085cm, C0269im c0269im, boolean z) {
        int iK;
        int iK2 = i - this.r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i2 = -Z0(iK2, c0085cm, c0269im);
        int i3 = i + i2;
        if (!z || (iK = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.p(-iK);
        return i2 - iK;
    }

    @Override // defpackage.Wl
    public final void R(RecyclerView recyclerView) {
    }

    public final View R0() {
        return u(this.u ? 0 : v() - 1);
    }

    @Override // defpackage.Wl
    public View S(View view, int i, C0085cm c0085cm, C0269im c0269im) {
        int iG0;
        View viewM0;
        Y0();
        if (v() == 0 || (iG0 = G0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        H0();
        c1(iG0, (int) (this.r.l() * 0.33333334f), false, c0269im);
        Ng ng = this.q;
        ng.g = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        ng.a = false;
        I0(c0085cm, ng, c0269im, true);
        if (iG0 == -1) {
            viewM0 = this.u ? M0(v() - 1, -1) : M0(0, v());
        } else {
            viewM0 = this.u ? M0(0, v()) : M0(v() - 1, -1);
        }
        View viewS0 = iG0 == -1 ? S0() : R0();
        if (!viewS0.hasFocusable()) {
            return viewM0;
        }
        if (viewM0 == null) {
            return null;
        }
        return viewS0;
    }

    public final View S0() {
        return u(this.u ? v() - 1 : 0);
    }

    @Override // defpackage.Wl
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View viewN0 = N0(0, v(), false);
            accessibilityEvent.setFromIndex(viewN0 == null ? -1 : Wl.H(viewN0));
            accessibilityEvent.setToIndex(L0());
        }
    }

    public final boolean T0() {
        return C() == 1;
    }

    public void U0(C0085cm c0085cm, C0269im c0269im, Ng ng, Mg mg) {
        int iE;
        int i;
        int i2;
        int iD;
        View viewB = ng.b(c0085cm);
        if (viewB == null) {
            mg.b = true;
            return;
        }
        Xl xl = (Xl) viewB.getLayoutParams();
        if (ng.k == null) {
            if (this.u == (ng.f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.u == (ng.f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        Xl xl2 = (Xl) viewB.getLayoutParams();
        Rect rectK = this.b.K(viewB);
        int i3 = rectK.left + rectK.right;
        int i4 = rectK.top + rectK.bottom;
        int iW = Wl.w(d(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) xl2).leftMargin + ((ViewGroup.MarginLayoutParams) xl2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) xl2).width);
        int iW2 = Wl.w(e(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) xl2).topMargin + ((ViewGroup.MarginLayoutParams) xl2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) xl2).height);
        if (v0(viewB, iW, iW2, xl2)) {
            viewB.measure(iW, iW2);
        }
        mg.a = this.r.c(viewB);
        if (this.p == 1) {
            if (T0()) {
                iD = this.n - F();
                iE = iD - this.r.d(viewB);
            } else {
                iE = E();
                iD = this.r.d(viewB) + iE;
            }
            if (ng.f == -1) {
                i = ng.b;
                i2 = i - mg.a;
            } else {
                i2 = ng.b;
                i = mg.a + i2;
            }
        } else {
            int iG = G();
            int iD2 = this.r.d(viewB) + iG;
            if (ng.f == -1) {
                int i5 = ng.b;
                int i6 = i5 - mg.a;
                iD = i5;
                i = iD2;
                iE = i6;
                i2 = iG;
            } else {
                int i7 = ng.b;
                int i8 = mg.a + i7;
                iE = i7;
                i = iD2;
                i2 = iG;
                iD = i8;
            }
        }
        Wl.N(viewB, iE, i2, iD, i);
        if (xl.a.i() || xl.a.l()) {
            mg.c = true;
        }
        mg.d = viewB.hasFocusable();
    }

    public void V0(C0085cm c0085cm, C0269im c0269im, Lg lg, int i) {
    }

    public final void W0(C0085cm c0085cm, Ng ng) {
        if (!ng.a || ng.l) {
            return;
        }
        int i = ng.g;
        int i2 = ng.i;
        if (ng.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iV; i3++) {
                    View viewU = u(i3);
                    if (this.r.e(viewU) < iF || this.r.o(viewU) < iF) {
                        X0(c0085cm, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iV - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewU2 = u(i5);
                if (this.r.e(viewU2) < iF || this.r.o(viewU2) < iF) {
                    X0(c0085cm, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iV2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < iV2; i7++) {
                View viewU3 = u(i7);
                if (this.r.b(viewU3) > i6 || this.r.n(viewU3) > i6) {
                    X0(c0085cm, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iV2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewU4 = u(i9);
            if (this.r.b(viewU4) > i6 || this.r.n(viewU4) > i6) {
                X0(c0085cm, i8, i9);
                return;
            }
        }
    }

    public final void X0(C0085cm c0085cm, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewU = u(i);
                k0(i);
                c0085cm.f(viewU);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewU2 = u(i3);
            k0(i3);
            c0085cm.f(viewU2);
        }
    }

    public final void Y0() {
        if (this.p == 1 || !T0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int Z0(int i, C0085cm c0085cm, C0269im c0269im) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        H0();
        this.q.a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        c1(i2, iAbs, true, c0269im);
        Ng ng = this.q;
        int iI0 = I0(c0085cm, ng, c0269im, false) + ng.g;
        if (iI0 < 0) {
            return 0;
        }
        if (iAbs > iI0) {
            i = i2 * iI0;
        }
        this.r.p(-i);
        this.q.j = i;
        return i;
    }

    @Override // defpackage.InterfaceC0239hm
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < Wl.H(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(Vo.e(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.p || this.r == null) {
            AbstractC0658va abstractC0658vaA = AbstractC0658va.a(this, i);
            this.r = abstractC0658vaA;
            this.A.a = abstractC0658vaA;
            this.p = i;
            m0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:118:0x0208  */
    /* JADX WARN: Code duplicated, block: B:119:0x021e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0233  */
    /* JADX WARN: Code duplicated, block: B:123:0x023e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0264  */
    /* JADX WARN: Code duplicated, block: B:132:0x026b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0274  */
    /* JADX WARN: Code duplicated, block: B:136:0x027b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0281  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    @Override // defpackage.Wl
    public void b0(C0085cm c0085cm, C0269im c0269im) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        View viewO0;
        int iK;
        Xl xl;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int iP0;
        int i6;
        View viewQ;
        int iE;
        int iG;
        int i7;
        int i8 = -1;
        if (!(this.z == null && this.x == -1) && c0269im.b() == 0) {
            h0(c0085cm);
            return;
        }
        Og og = this.z;
        if (og != null && (i7 = og.a) >= 0) {
            this.x = i7;
        }
        H0();
        this.q.a = false;
        Y0();
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.a.E(focusedChild)) {
            focusedChild = null;
        }
        Lg lg = this.A;
        if (!lg.e || this.x != -1 || this.z != null) {
            lg.d();
            lg.d = this.u ^ this.v;
            if (c0269im.g || (i = this.x) == -1) {
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.a.E(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        xl = (Xl) focusedChild2.getLayoutParams();
                        if (xl.a.i() && xl.a.b() >= 0 && xl.a.b() < c0269im.b()) {
                            lg.c(focusedChild2, Wl.H(focusedChild2));
                        } else if (this.s == this.v) {
                            if (lg.d) {
                                if (this.u) {
                                    viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                                } else {
                                    viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                                }
                            } else if (this.u) {
                                viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                            } else {
                                viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                            }
                            if (viewO0 != null) {
                                lg.b(viewO0, Wl.H(viewO0));
                                if (!c0269im.g && A0() && (this.r.e(viewO0) >= this.r.g() || this.r.b(viewO0) < this.r.k())) {
                                    if (lg.d) {
                                        iK = this.r.g();
                                    } else {
                                        iK = this.r.k();
                                    }
                                    lg.c = iK;
                                }
                            } else {
                                lg.a();
                                if (this.v) {
                                    iB = c0269im.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                lg.b = iB;
                            }
                        } else {
                            lg.a();
                            if (this.v) {
                                iB = c0269im.b() - 1;
                            } else {
                                iB = 0;
                            }
                            lg.b = iB;
                        }
                    } else if (this.s == this.v) {
                        if (lg.d) {
                            if (this.u) {
                                viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                            } else {
                                viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                            }
                        } else if (this.u) {
                            viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                        } else {
                            viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                        }
                        if (viewO0 != null) {
                            lg.b(viewO0, Wl.H(viewO0));
                            if (!c0269im.g) {
                                if (lg.d) {
                                    iK = this.r.g();
                                } else {
                                    iK = this.r.k();
                                }
                                lg.c = iK;
                            }
                        } else {
                            lg.a();
                            if (this.v) {
                                iB = c0269im.b() - 1;
                            } else {
                                iB = 0;
                            }
                            lg.b = iB;
                        }
                    } else {
                        lg.a();
                        if (this.v) {
                            iB = c0269im.b() - 1;
                        } else {
                            iB = 0;
                        }
                        lg.b = iB;
                    }
                } else {
                    lg.a();
                    if (this.v) {
                        iB = c0269im.b() - 1;
                    } else {
                        iB = 0;
                    }
                    lg.b = iB;
                }
            } else if (i < 0 || i >= c0269im.b()) {
                this.x = -1;
                this.y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                if (v() != 0) {
                    recyclerView = this.b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        xl = (Xl) focusedChild2.getLayoutParams();
                        if (xl.a.i()) {
                            if (this.s == this.v) {
                                if (lg.d) {
                                    if (this.u) {
                                        viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                                    } else {
                                        viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                                    }
                                } else if (this.u) {
                                    viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                                } else {
                                    viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                                }
                                if (viewO0 != null) {
                                    lg.b(viewO0, Wl.H(viewO0));
                                    if (!c0269im.g) {
                                        if (lg.d) {
                                            iK = this.r.g();
                                        } else {
                                            iK = this.r.k();
                                        }
                                        lg.c = iK;
                                    }
                                } else {
                                    lg.a();
                                    if (this.v) {
                                        iB = c0269im.b() - 1;
                                    } else {
                                        iB = 0;
                                    }
                                    lg.b = iB;
                                }
                            } else {
                                lg.a();
                                if (this.v) {
                                    iB = c0269im.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                lg.b = iB;
                            }
                        } else if (this.s == this.v) {
                            if (lg.d) {
                                if (this.u) {
                                    viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                                } else {
                                    viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                                }
                            } else if (this.u) {
                                viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                            } else {
                                viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                            }
                            if (viewO0 != null) {
                                lg.b(viewO0, Wl.H(viewO0));
                                if (!c0269im.g) {
                                    if (lg.d) {
                                        iK = this.r.g();
                                    } else {
                                        iK = this.r.k();
                                    }
                                    lg.c = iK;
                                }
                            } else {
                                lg.a();
                                if (this.v) {
                                    iB = c0269im.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                lg.b = iB;
                            }
                        } else {
                            lg.a();
                            if (this.v) {
                                iB = c0269im.b() - 1;
                            } else {
                                iB = 0;
                            }
                            lg.b = iB;
                        }
                    } else if (this.s == this.v) {
                        if (lg.d) {
                            if (this.u) {
                                viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                            } else {
                                viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                            }
                        } else if (this.u) {
                            viewO0 = O0(c0085cm, c0269im, v() - 1, -1, c0269im.b());
                        } else {
                            viewO0 = O0(c0085cm, c0269im, 0, v(), c0269im.b());
                        }
                        if (viewO0 != null) {
                            lg.b(viewO0, Wl.H(viewO0));
                            if (!c0269im.g) {
                                if (lg.d) {
                                    iK = this.r.g();
                                } else {
                                    iK = this.r.k();
                                }
                                lg.c = iK;
                            }
                        } else {
                            lg.a();
                            if (this.v) {
                                iB = c0269im.b() - 1;
                            } else {
                                iB = 0;
                            }
                            lg.b = iB;
                        }
                    } else {
                        lg.a();
                        if (this.v) {
                            iB = c0269im.b() - 1;
                        } else {
                            iB = 0;
                        }
                        lg.b = iB;
                    }
                } else {
                    lg.a();
                    if (this.v) {
                        iB = c0269im.b() - 1;
                    } else {
                        iB = 0;
                    }
                    lg.b = iB;
                }
            } else {
                int i9 = this.x;
                lg.b = i9;
                Og og2 = this.z;
                if (og2 != null && og2.a >= 0) {
                    boolean z = og2.c;
                    lg.d = z;
                    if (z) {
                        lg.c = this.r.g() - this.z.b;
                    } else {
                        lg.c = this.r.k() + this.z.b;
                    }
                } else if (this.y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i9);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            lg.d = (this.x < Wl.H(u(0))) == this.u;
                        }
                        lg.a();
                    } else if (this.r.c(viewQ2) > this.r.l()) {
                        lg.a();
                    } else if (this.r.e(viewQ2) - this.r.k() < 0) {
                        lg.c = this.r.k();
                        lg.d = false;
                    } else if (this.r.g() - this.r.b(viewQ2) < 0) {
                        lg.c = this.r.g();
                        lg.d = true;
                    } else {
                        lg.c = lg.d ? this.r.m() + this.r.b(viewQ2) : this.r.e(viewQ2);
                    }
                } else {
                    boolean z2 = this.u;
                    lg.d = z2;
                    if (z2) {
                        lg.c = this.r.g() - this.y;
                    } else {
                        lg.c = this.r.k() + this.y;
                    }
                }
            }
            lg.e = true;
        } else if (focusedChild != null && (this.r.e(focusedChild) >= this.r.g() || this.r.b(focusedChild) <= this.r.k())) {
            lg.c(focusedChild, Wl.H(focusedChild));
        }
        Ng ng = this.q;
        ng.f = ng.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(c0269im, iArr);
        int iK2 = this.r.k() + Math.max(0, iArr[0]);
        int iH = this.r.h() + Math.max(0, iArr[1]);
        if (c0269im.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (viewQ = q(i6)) != null) {
            if (this.u) {
                iG = this.r.g() - this.r.b(viewQ);
                iE = this.y;
            } else {
                iE = this.r.e(viewQ) - this.r.k();
                iG = this.y;
            }
            int i10 = iG - iE;
            if (i10 > 0) {
                iK2 += i10;
            } else {
                iH -= i10;
            }
        }
        if (!lg.d ? !this.u : this.u) {
            i8 = 1;
        }
        V0(c0085cm, c0269im, lg, i8);
        p(c0085cm);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        if (lg.d) {
            e1(lg.b, lg.c);
            Ng ng2 = this.q;
            ng2.h = iK2;
            I0(c0085cm, ng2, c0269im, false);
            Ng ng3 = this.q;
            i3 = ng3.b;
            int i11 = ng3.d;
            int i12 = ng3.c;
            if (i12 > 0) {
                iH += i12;
            }
            d1(lg.b, lg.c);
            Ng ng4 = this.q;
            ng4.h = iH;
            ng4.d += ng4.e;
            I0(c0085cm, ng4, c0269im, false);
            Ng ng5 = this.q;
            i2 = ng5.b;
            int i13 = ng5.c;
            if (i13 > 0) {
                e1(i11, i3);
                Ng ng6 = this.q;
                ng6.h = i13;
                I0(c0085cm, ng6, c0269im, false);
                i3 = this.q.b;
            }
        } else {
            d1(lg.b, lg.c);
            Ng ng7 = this.q;
            ng7.h = iH;
            I0(c0085cm, ng7, c0269im, false);
            Ng ng8 = this.q;
            i2 = ng8.b;
            int i14 = ng8.d;
            int i15 = ng8.c;
            if (i15 > 0) {
                iK2 += i15;
            }
            e1(lg.b, lg.c);
            Ng ng9 = this.q;
            ng9.h = iK2;
            ng9.d += ng9.e;
            I0(c0085cm, ng9, c0269im, false);
            Ng ng10 = this.q;
            i3 = ng10.b;
            int i16 = ng10.c;
            if (i16 > 0) {
                d1(i14, i2);
                Ng ng11 = this.q;
                ng11.h = i16;
                I0(c0085cm, ng11, c0269im, false);
                i2 = this.q.b;
            }
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int iP1 = P0(i2, c0085cm, c0269im, true);
                i4 = i3 + iP1;
                i5 = i2 + iP1;
                iP0 = Q0(i4, c0085cm, c0269im, false);
            } else {
                int iQ0 = Q0(i3, c0085cm, c0269im, true);
                i4 = i3 + iQ0;
                i5 = i2 + iQ0;
                iP0 = P0(i5, c0085cm, c0269im, false);
            }
            i3 = i4 + iP0;
            i2 = i5 + iP0;
        }
        if (c0269im.k && v() != 0 && !c0269im.g && A0()) {
            List list2 = c0085cm.d;
            int size = list2.size();
            int iH2 = Wl.H(u(0));
            int iC = 0;
            int iC2 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                AbstractC0361lm abstractC0361lm = (AbstractC0361lm) list2.get(i17);
                if (!abstractC0361lm.i()) {
                    boolean z3 = abstractC0361lm.b() < iH2;
                    boolean z4 = this.u;
                    View view = abstractC0361lm.a;
                    if (z3 != z4) {
                        iC += this.r.c(view);
                    } else {
                        iC2 += this.r.c(view);
                    }
                }
            }
            this.q.k = list2;
            if (iC > 0) {
                e1(Wl.H(S0()), i3);
                Ng ng12 = this.q;
                ng12.h = iC;
                ng12.c = 0;
                ng12.a(null);
                I0(c0085cm, this.q, c0269im, false);
            }
            if (iC2 > 0) {
                d1(Wl.H(R0()), i2);
                Ng ng13 = this.q;
                ng13.h = iC2;
                ng13.c = 0;
                list = null;
                ng13.a(null);
                I0(c0085cm, this.q, c0269im, false);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (c0269im.g) {
            lg.d();
        } else {
            AbstractC0658va abstractC0658va = this.r;
            abstractC0658va.a = abstractC0658va.l();
        }
        this.s = this.v;
    }

    public void b1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        m0();
    }

    @Override // defpackage.Wl
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    @Override // defpackage.Wl
    public void c0(C0269im c0269im) {
        this.z = null;
        this.x = -1;
        this.y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.A.d();
    }

    public final void c1(int i, int i2, boolean z, C0269im c0269im) {
        int iK;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        B0(c0269im, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        Ng ng = this.q;
        int i3 = z2 ? iMax2 : iMax;
        ng.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        ng.i = iMax;
        if (z2) {
            ng.h = this.r.h() + i3;
            View viewR0 = R0();
            Ng ng2 = this.q;
            ng2.e = this.u ? -1 : 1;
            int iH = Wl.H(viewR0);
            Ng ng3 = this.q;
            ng2.d = iH + ng3.e;
            ng3.b = this.r.b(viewR0);
            iK = this.r.b(viewR0) - this.r.g();
        } else {
            View viewS0 = S0();
            Ng ng4 = this.q;
            ng4.h = this.r.k() + ng4.h;
            Ng ng5 = this.q;
            ng5.e = this.u ? 1 : -1;
            int iH2 = Wl.H(viewS0);
            Ng ng6 = this.q;
            ng5.d = iH2 + ng6.e;
            ng6.b = this.r.e(viewS0);
            iK = (-this.r.e(viewS0)) + this.r.k();
        }
        Ng ng7 = this.q;
        ng7.c = i2;
        if (z) {
            ng7.c = i2 - iK;
        }
        ng7.g = iK;
    }

    @Override // defpackage.Wl
    public final boolean d() {
        return this.p == 0;
    }

    @Override // defpackage.Wl
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof Og) {
            this.z = (Og) parcelable;
            m0();
        }
    }

    public final void d1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        Ng ng = this.q;
        ng.e = this.u ? -1 : 1;
        ng.d = i;
        ng.f = 1;
        ng.b = i2;
        ng.g = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    @Override // defpackage.Wl
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.Wl
    public final Parcelable e0() {
        Og og = this.z;
        if (og != null) {
            Og og2 = new Og();
            og2.a = og.a;
            og2.b = og.b;
            og2.c = og.c;
            return og2;
        }
        Og og3 = new Og();
        if (v() > 0) {
            H0();
            boolean z = this.s ^ this.u;
            og3.c = z;
            if (z) {
                View viewR0 = R0();
                og3.b = this.r.g() - this.r.b(viewR0);
                og3.a = Wl.H(viewR0);
            } else {
                View viewS0 = S0();
                og3.a = Wl.H(viewS0);
                og3.b = this.r.e(viewS0) - this.r.k();
            }
        } else {
            og3.a = -1;
        }
        return og3;
    }

    public final void e1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        Ng ng = this.q;
        ng.d = i;
        ng.e = this.u ? 1 : -1;
        ng.f = -1;
        ng.b = i2;
        ng.g = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
    }

    @Override // defpackage.Wl
    public final void h(int i, int i2, C0269im c0269im, Bd bd) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        H0();
        c1(i > 0 ? 1 : -1, Math.abs(i), true, c0269im);
        C0(c0269im, this.q, bd);
    }

    @Override // defpackage.Wl
    public final void i(int i, Bd bd) {
        boolean z;
        int i2;
        Og og = this.z;
        if (og == null || (i2 = og.a) < 0) {
            Y0();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = og.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            bd.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.Wl
    public final int j(C0269im c0269im) {
        return D0(c0269im);
    }

    @Override // defpackage.Wl
    public int k(C0269im c0269im) {
        return E0(c0269im);
    }

    @Override // defpackage.Wl
    public int l(C0269im c0269im) {
        return F0(c0269im);
    }

    @Override // defpackage.Wl
    public final int m(C0269im c0269im) {
        return D0(c0269im);
    }

    @Override // defpackage.Wl
    public int n(C0269im c0269im) {
        return E0(c0269im);
    }

    @Override // defpackage.Wl
    public int n0(int i, C0085cm c0085cm, C0269im c0269im) {
        if (this.p == 1) {
            return 0;
        }
        return Z0(i, c0085cm, c0269im);
    }

    @Override // defpackage.Wl
    public int o(C0269im c0269im) {
        return F0(c0269im);
    }

    @Override // defpackage.Wl
    public final void o0(int i) {
        this.x = i;
        this.y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        Og og = this.z;
        if (og != null) {
            og.a = -1;
        }
        m0();
    }

    @Override // defpackage.Wl
    public int p0(int i, C0085cm c0085cm, C0269im c0269im) {
        if (this.p == 0) {
            return 0;
        }
        return Z0(i, c0085cm, c0269im);
    }

    @Override // defpackage.Wl
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i - Wl.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (Wl.H(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.Wl
    public Xl r() {
        return new Xl(-2, -2);
    }

    @Override // defpackage.Wl
    public final boolean w0() {
        if (this.m == 1073741824 || this.l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i = 0; i < iV; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.Wl
    public void y0(RecyclerView recyclerView, int i) {
        Pg pg = new Pg(recyclerView.getContext());
        pg.a = i;
        z0(pg);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.z = null;
        this.A = new Lg();
        this.B = new Mg();
        this.C = 2;
        this.D = new int[2];
        Vl vlI = Wl.I(context, attributeSet, i, i2);
        a1(vlI.a);
        boolean z = vlI.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            m0();
        }
        b1(vlI.d);
    }
}
