package defpackage;

/* JADX INFO: renamed from: fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0169fe extends AbstractC0615tt {
    @Override // defpackage.V8
    public final void a(V8 v8) {
        X8 x8 = this.h;
        if (x8.c && !x8.j) {
            x8.d((int) ((((X8) x8.l.get(0)).g * ((C0138ee) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void d() {
        C0655v7 c0655v7 = this.b;
        C0138ee c0138ee = (C0138ee) c0655v7;
        int i = c0138ee.r0;
        int i2 = c0138ee.s0;
        int i3 = c0138ee.u0;
        X8 x8 = this.h;
        if (i3 == 1) {
            if (i != -1) {
                x8.l.add(c0655v7.T.d.h);
                this.b.T.d.h.k.add(x8);
                x8.f = i;
            } else if (i2 != -1) {
                x8.l.add(c0655v7.T.d.i);
                this.b.T.d.i.k.add(x8);
                x8.f = -i2;
            } else {
                x8.b = true;
                x8.l.add(c0655v7.T.d.i);
                this.b.T.d.i.k.add(x8);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            x8.l.add(c0655v7.T.e.h);
            this.b.T.e.h.k.add(x8);
            x8.f = i;
        } else if (i2 != -1) {
            x8.l.add(c0655v7.T.e.i);
            this.b.T.e.i.k.add(x8);
            x8.f = -i2;
        } else {
            x8.b = true;
            x8.l.add(c0655v7.T.e.i);
            this.b.T.e.i.k.add(x8);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.AbstractC0615tt
    public final void e() {
        C0655v7 c0655v7 = this.b;
        int i = ((C0138ee) c0655v7).u0;
        X8 x8 = this.h;
        if (i == 1) {
            c0655v7.Y = x8.g;
        } else {
            c0655v7.Z = x8.g;
        }
    }

    @Override // defpackage.AbstractC0615tt
    public final void f() {
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
