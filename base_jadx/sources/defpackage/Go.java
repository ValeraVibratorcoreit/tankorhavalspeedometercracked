package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Go extends AbstractC0093d {
    public Paint c;
    public float[] d;

    @Override // defpackage.A6
    public final void c() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        float width = ((C0778z6) this.a).g.getWidth() / 2.0f;
        C0778z6 c0778z6 = (C0778z6) this.a;
        int i = c0778z6.a;
        float f = c0778z6.b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float f2 = (i2 / (i - 1)) * f;
            float f3 = ((C0778z6) this.a).c;
            int iMax = Math.max(1, (int) ((3.063052912151454d / Math.asin(f3 / f2)) + 0.5d));
            int i4 = 0;
            while (i4 < iMax) {
                int i5 = i2;
                double d = iMax;
                int i6 = iMax;
                double d2 = ((3.141592653589793d / d) * ((double) ((i5 + 1) % 2))) + ((((double) i4) * 6.283185307179586d) / d);
                double d3 = f2;
                float fCos = ((float) (Math.cos(d2) * d3)) + width;
                float fSin = ((float) (d3 * Math.sin(d2))) + width;
                float[] fArr = this.d;
                fArr[0] = (float) ((d2 * 180.0d) / 3.141592653589793d);
                fArr[1] = f2 / f;
                fArr[2] = ((C0778z6) this.a).f;
                Paint paint = this.c;
                paint.setColor(Color.HSVToColor(fArr));
                paint.setAlpha(Math.round(((C0778z6) this.a).e * 255.0f));
                C0778z6 c0778z7 = (C0778z6) this.a;
                c0778z7.g.drawCircle(fCos, fSin, f3 - c0778z7.d, paint);
                if (i3 >= size) {
                    arrayList.add(new C0561s6(fCos, fSin, fArr));
                } else {
                    ((C0561s6) arrayList.get(i3)).b(fCos, fSin, fArr);
                }
                i3++;
                i4++;
                i2 = i5;
                iMax = i6;
            }
            i2++;
        }
    }
}
