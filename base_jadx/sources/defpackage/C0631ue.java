package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0631ue extends AbstractC0615tt {
    @Override // defpackage.V8
    public final void a(V8 v8) {
        X3 x3 = (X3) this.b;
        int i = x3.s0;
        X8 x8 = this.h;
        Iterator it = x8.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((X8) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            x8.d(i3 + x3.u0);
        } else {
            x8.d(i2 + x3.u0);
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void d() {
        C0655v7 c0655v7 = this.b;
        if (c0655v7 instanceof X3) {
            X8 x8 = this.h;
            x8.b = true;
            X3 x3 = (X3) c0655v7;
            int i = x3.s0;
            boolean z = x3.t0;
            int i2 = 0;
            if (i == 0) {
                x8.e = 4;
                while (i2 < x3.r0) {
                    C0655v7 c0655v8 = x3.q0[i2];
                    if (z || c0655v8.g0 != 8) {
                        X8 x9 = c0655v8.d.h;
                        x9.k.add(x8);
                        x8.l.add(x9);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                x8.e = 5;
                while (i2 < x3.r0) {
                    C0655v7 c0655v9 = x3.q0[i2];
                    if (z || c0655v9.g0 != 8) {
                        X8 x10 = c0655v9.d.i;
                        x10.k.add(x8);
                        x8.l.add(x10);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                x8.e = 6;
                while (i2 < x3.r0) {
                    C0655v7 c0655v10 = x3.q0[i2];
                    if (z || c0655v10.g0 != 8) {
                        X8 x11 = c0655v10.e.h;
                        x11.k.add(x8);
                        x8.l.add(x11);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            x8.e = 7;
            while (i2 < x3.r0) {
                C0655v7 c0655v11 = x3.q0[i2];
                if (z || c0655v11.g0 != 8) {
                    X8 x12 = c0655v11.e.i;
                    x12.k.add(x8);
                    x8.l.add(x12);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void e() {
        C0655v7 c0655v7 = this.b;
        if (c0655v7 instanceof X3) {
            int i = ((X3) c0655v7).s0;
            X8 x8 = this.h;
            if (i == 0 || i == 1) {
                c0655v7.Y = x8.g;
            } else {
                c0655v7.Z = x8.g;
            }
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.AbstractC0615tt
    public final boolean k() {
        return false;
    }

    public final void m(X8 x8) {
        X8 x9 = this.h;
        x9.k.add(x8);
        x8.l.add(x9);
    }
}
