package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class V2 extends AbstractC0510qg {
    public U2 b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public int k;
    public int l;
    public int m;
    public Paint n;
    public Paint o;
    public Paint p;

    @Override // defpackage.AbstractC0510qg
    public final void a() {
        setColor(Tf.w("fuel_color"));
        setLowColor(Tf.w("fuel_low_color"));
        setCriticalColor(Tf.w("fuel_critical_color"));
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        U2 u2 = this.b;
        if (u2 != null) {
            this.a.unregisterOnSharedPreferenceChangeListener(u2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = this.e;
        float f2 = this.d;
        float f3 = this.f;
        float f4 = ((f - f2) - (3.0f * f3)) / 4.0f;
        float f5 = f4 / 10.0f;
        int i = 3;
        while (i >= 0) {
            float f6 = ((f4 + f3) * i) + f2;
            float f7 = this.g;
            float f8 = width;
            float f9 = f7 * f8;
            float f10 = height;
            float f11 = f7 * f10;
            float f12 = (1.0f - f7) * f8;
            float f13 = (1.0f - f7) * f10;
            int i2 = 9;
            while (i2 >= 0) {
                float f14 = (i2 * f5) + f6;
                float f15 = ((9 - i2) + ((3 - i) * 10)) * 2.5f;
                float f16 = this.c;
                if (f16 >= this.i) {
                    paint = this.n;
                } else {
                    paint = f16 >= this.j ? this.o : this.p;
                }
                Paint paint2 = paint;
                if (f16 >= f15) {
                    canvas.drawArc(f9, f11, f12, f13, f14, f5, false, paint2);
                }
                i2--;
                i = i;
            }
            i--;
        }
    }

    public void setColor(int i) {
        this.k = i;
        Paint paint = this.n;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setCriticalColor(int i) {
        this.m = i;
        Paint paint = this.p;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // defpackage.AbstractC0510qg
    public void setLevelValue(float f) {
        this.c = f;
        invalidate();
    }

    public void setLowColor(int i) {
        this.l = i;
        Paint paint = this.o;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setMarginKoef(float f) {
        this.g = f;
    }

    public void setNormalLevel(float f) {
        this.i = f;
    }

    public void setStrokeWidth(int i) {
        this.h = i;
    }

    public void setWarnLevel(float f) {
        this.j = f;
    }
}
