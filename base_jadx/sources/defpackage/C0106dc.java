package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: renamed from: dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0106dc extends AbstractC0093d {
    public Paint c;
    public float[] d;
    public float e;

    @Override // defpackage.A6
    public final void c() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        float f = 2.0f;
        float width = ((C0778z6) this.a).g.getWidth() / 2.0f;
        C0778z6 c0778z6 = (C0778z6) this.a;
        int i = c0778z6.a;
        float f2 = c0778z6.d;
        float f3 = c0778z6.b;
        float f4 = c0778z6.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f5 = i2;
            float f6 = i;
            float f7 = (f5 / (i - 1)) * f3;
            float fMax = Math.max(1.5f + f2, (i2 == 0 ? 0.0f : ((f5 - (f6 / f)) / f6) * this.e * f4) + f4);
            int iMin = Math.min(Math.max(1, (int) ((3.063052912151454d / Math.asin(fMax / f7)) + 0.5d)), i * 2);
            int i4 = 0;
            while (i4 < iMin) {
                int i5 = i2;
                float f8 = f4;
                int i6 = i;
                double d = iMin;
                int i7 = i4;
                double d2 = ((3.141592653589793d / d) * ((double) ((i5 + 1) % 2))) + ((((double) i4) * 6.283185307179586d) / d);
                double d3 = f7;
                float fCos = ((float) (Math.cos(d2) * d3)) + width;
                float fSin = ((float) (d3 * Math.sin(d2))) + width;
                float[] fArr = this.d;
                fArr[0] = (float) ((d2 * 180.0d) / 3.141592653589793d);
                fArr[1] = f7 / f3;
                fArr[2] = ((C0778z6) this.a).f;
                Paint paint = this.c;
                paint.setColor(Color.HSVToColor(fArr));
                paint.setAlpha(Math.round(((C0778z6) this.a).e * 255.0f));
                ((C0778z6) this.a).g.drawCircle(fCos, fSin, fMax - f2, paint);
                if (i3 >= size) {
                    arrayList.add(new C0561s6(fCos, fSin, fArr));
                } else {
                    ((C0561s6) arrayList.get(i3)).b(fCos, fSin, fArr);
                }
                i3++;
                i4 = i7 + 1;
                i = i6;
                f4 = f8;
                i2 = i5;
            }
            i2++;
            f = 2.0f;
        }
    }
}
