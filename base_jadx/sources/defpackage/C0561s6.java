package defpackage;

import android.graphics.Color;

/* JADX INFO: renamed from: s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0561s6 {
    public float a;
    public float b;
    public final float[] c = new float[3];
    public float[] d;
    public int e;

    public C0561s6(float f, float f2, float[] fArr) {
        b(f, f2, fArr);
    }

    public final float[] a(float f) {
        float[] fArr = this.d;
        float[] fArr2 = this.c;
        if (fArr == null) {
            this.d = (float[]) fArr2.clone();
        }
        float[] fArr3 = this.d;
        fArr3[0] = fArr2[0];
        fArr3[1] = fArr2[1];
        fArr3[2] = f;
        return fArr3;
    }

    public final void b(float f, float f2, float[] fArr) {
        this.a = f;
        this.b = f2;
        float f3 = fArr[0];
        float[] fArr2 = this.c;
        fArr2[0] = f3;
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        this.e = Color.HSVToColor(fArr2);
    }
}
