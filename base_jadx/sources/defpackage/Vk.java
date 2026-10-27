package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Vk extends C0097d3 {
    public Wo[] f;
    public Wo[] g;
    public int h;
    public C0096d2 i;

    @Override // defpackage.C0097d3
    public final Wo d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            Wo[] woArr = this.f;
            Wo wo = woArr[i2];
            if (!zArr[wo.b]) {
                C0096d2 c0096d2 = this.i;
                c0096d2.b = wo;
                int i3 = 8;
                if (i != -1) {
                    Wo wo2 = woArr[i];
                    while (i3 >= 0) {
                        float f = wo2.h[i3];
                        float f2 = ((Wo) c0096d2.b).h[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((Wo) c0096d2.b).h[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.C0097d3
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.C0097d3
    public final void i(Qg qg, C0097d3 c0097d3, boolean z) {
        Wo wo = c0097d3.a;
        if (wo == null) {
            return;
        }
        C0004a3 c0004a3 = c0097d3.d;
        int iF = c0004a3.f();
        for (int i = 0; i < iF; i++) {
            Wo woG = c0004a3.g(i);
            float fH = c0004a3.h(i);
            C0096d2 c0096d2 = this.i;
            c0096d2.b = woG;
            boolean z2 = woG.a;
            float[] fArr = wo.h;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((Wo) c0096d2.b).h;
                    float f = (fArr[i2] * fH) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((Wo) c0096d2.b).h[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    ((Vk) c0096d2.c).k((Wo) c0096d2.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fH;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((Wo) c0096d2.b).h[i3] = f3;
                    } else {
                        ((Wo) c0096d2.b).h[i3] = 0.0f;
                    }
                }
                j(woG);
            }
            this.b = (c0097d3.b * fH) + this.b;
        }
        k(wo);
    }

    public final void j(Wo wo) {
        int i;
        int i2 = this.h + 1;
        Wo[] woArr = this.f;
        if (i2 > woArr.length) {
            Wo[] woArr2 = (Wo[]) Arrays.copyOf(woArr, woArr.length * 2);
            this.f = woArr2;
            this.g = (Wo[]) Arrays.copyOf(woArr2, woArr2.length * 2);
        }
        Wo[] woArr3 = this.f;
        int i3 = this.h;
        woArr3[i3] = wo;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && woArr3[i3].b > wo.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new V5(3));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        wo.a = true;
        wo.a(this);
    }

    public final void k(Wo wo) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == wo) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        wo.a = false;
                        return;
                    } else {
                        Wo[] woArr = this.f;
                        int i3 = i + 1;
                        woArr[i] = woArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.C0097d3
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            Wo wo = this.f[i];
            C0096d2 c0096d2 = this.i;
            c0096d2.b = wo;
            str = str + c0096d2 + " ";
        }
        return str;
    }
}
