package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class Ig extends AbstractC0123e {
    public int k;
    public Paint l;
    public Paint m;
    public Paint n;
    public C0685w6 o;

    @Override // defpackage.AbstractC0123e
    public final void b(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.k, fArr);
        int iMax = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = i;
            fArr[2] = f / (width - 1);
            Paint paint = this.l;
            paint.setColor(Color.HSVToColor(fArr));
            i += iMax;
            canvas.drawRect(f, 0.0f, i, height, paint);
        }
    }

    @Override // defpackage.AbstractC0123e
    public final void c(Canvas canvas, float f, float f2) {
        Paint paint = this.m;
        int i = this.k;
        float[] fArr = {0.0f, 0.0f, this.h};
        Color.colorToHSV(i, fArr);
        paint.setColor(Color.HSVToColor(fArr));
        if (this.i) {
            canvas.drawCircle(f, f2, this.f, this.n);
        }
        canvas.drawCircle(f, f2, this.f * 0.75f, paint);
    }

    @Override // defpackage.AbstractC0123e
    public final void d(float f) {
        C0685w6 c0685w6 = this.o;
        if (c0685w6 != null) {
            c0685w6.setLightness(f);
        }
    }

    public void setColor(int i) {
        this.k = i;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.h = fArr[2];
        if (this.c != null) {
            e();
            invalidate();
        }
    }

    public void setColorPicker(C0685w6 c0685w6) {
        this.o = c0685w6;
    }
}
