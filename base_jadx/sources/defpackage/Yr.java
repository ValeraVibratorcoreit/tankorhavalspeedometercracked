package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class Yr extends Xr {
    public Dk[] a;
    public String b;
    public int c;
    public final int d;

    public Yr() {
        this.a = null;
        this.c = 0;
    }

    public Dk[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(Dk[] dkArr) {
        if (!F4.h(this.a, dkArr)) {
            this.a = F4.v(dkArr);
            return;
        }
        Dk[] dkArr2 = this.a;
        for (int i = 0; i < dkArr.length; i++) {
            dkArr2[i].a = dkArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = dkArr[i].b;
                if (i2 < fArr.length) {
                    dkArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public Yr(Yr yr) {
        this.a = null;
        this.c = 0;
        this.b = yr.b;
        this.d = yr.d;
        this.a = F4.v(yr.a);
    }
}
