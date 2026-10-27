package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0097d3 {
    public final C0004a3 d;
    public Wo a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public C0097d3(K2 k2) {
        this.d = new C0004a3(this, k2);
    }

    public final void a(Qg qg, int i) {
        this.d.j(qg.j(i), 1.0f);
        this.d.j(qg.j(i), -1.0f);
    }

    public final void b(Wo wo, Wo wo2, Wo wo3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(wo, 1.0f);
            this.d.j(wo2, -1.0f);
            this.d.j(wo3, -1.0f);
        } else {
            this.d.j(wo, -1.0f);
            this.d.j(wo2, 1.0f);
            this.d.j(wo3, 1.0f);
        }
    }

    public final void c(Wo wo, Wo wo2, Wo wo3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.j(wo, 1.0f);
            this.d.j(wo2, -1.0f);
            this.d.j(wo3, 1.0f);
        } else {
            this.d.j(wo, -1.0f);
            this.d.j(wo2, 1.0f);
            this.d.j(wo3, -1.0f);
        }
    }

    public Wo d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }

    public final Wo f(boolean[] zArr, Wo wo) {
        int i;
        int iF = this.d.f();
        Wo wo2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iF; i2++) {
            float fH = this.d.h(i2);
            if (fH < 0.0f) {
                Wo woG = this.d.g(i2);
                if ((zArr == null || !zArr[woG.b]) && woG != wo && (((i = woG.l) == 3 || i == 4) && fH < f)) {
                    f = fH;
                    wo2 = woG;
                }
            }
        }
        return wo2;
    }

    public final void g(Wo wo) {
        Wo wo2 = this.a;
        if (wo2 != null) {
            this.d.j(wo2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fK = this.d.k(wo, true) * (-1.0f);
        this.a = wo;
        if (fK == 1.0f) {
            return;
        }
        this.b /= fK;
        this.d.d(fK);
    }

    public final void h(Qg qg, Wo wo, boolean z) {
        if (wo == null || !wo.f) {
            return;
        }
        float fE = this.d.e(wo);
        this.b = (wo.e * fE) + this.b;
        this.d.k(wo, z);
        if (z) {
            wo.b(this);
        }
        if (this.d.f() == 0) {
            this.e = true;
            qg.a = true;
        }
    }

    public void i(Qg qg, C0097d3 c0097d3, boolean z) {
        float fL = this.d.l(c0097d3, z);
        this.b = (c0097d3.b * fL) + this.b;
        if (z) {
            c0097d3.a.b(this);
        }
        if (this.a == null || this.d.f() != 0) {
            return;
        }
        this.e = true;
        qg.a = true;
    }

    public String toString() {
        boolean z;
        String strF = Vo.f(this.a == null ? "0" : "" + this.a, " = ");
        if (this.b != 0.0f) {
            strF = strF + this.b;
            z = true;
        } else {
            z = false;
        }
        int iF = this.d.f();
        for (int i = 0; i < iF; i++) {
            Wo woG = this.d.g(i);
            if (woG != null) {
                float fH = this.d.h(i);
                if (fH != 0.0f) {
                    String string = woG.toString();
                    if (z) {
                        if (fH > 0.0f) {
                            strF = Vo.f(strF, " + ");
                        } else {
                            strF = Vo.f(strF, " - ");
                            fH *= -1.0f;
                        }
                    } else if (fH < 0.0f) {
                        strF = Vo.f(strF, "- ");
                        fH *= -1.0f;
                    }
                    strF = fH == 1.0f ? Vo.f(strF, string) : strF + fH + " " + string;
                    z = true;
                }
            }
        }
        return !z ? Vo.f(strF, "0.0") : strF;
    }
}
