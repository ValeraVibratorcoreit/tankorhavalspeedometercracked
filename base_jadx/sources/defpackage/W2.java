package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class W2 extends AbstractC0510qg {
    public U2 b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public float m;
    public float n;
    public float o;
    public Paint p;
    public Paint q;
    public Paint r;

    @Override // defpackage.AbstractC0510qg
    public final void a() {
        setColor(Tf.w("coolant_color"));
        setWarnColor(Tf.w("coolant_warn_color"));
        setCriticalColor(Tf.w("coolant_critical_color"));
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
        float f = this.n;
        float f2 = this.m;
        float f3 = this.o;
        float f4 = ((f - f2) - (3.0f * f3)) / 4.0f;
        float f5 = f4 / 10.0f;
        float f6 = this.c;
        float f7 = this.e;
        if (f6 - f7 >= this.g) {
            paint = this.r;
        } else {
            paint = f6 - f7 >= this.f ? this.q : this.p;
        }
        Paint paint2 = paint;
        int i = 3;
        while (i >= 0) {
            float f8 = ((f4 + f3) * i) + f2;
            float f9 = this.h;
            float f10 = width;
            float f11 = f9 * f10;
            float f12 = height;
            float f13 = f9 * f12;
            float f14 = (1.0f - f9) * f10;
            float f15 = (1.0f - f9) * f12;
            int i2 = 9;
            while (i2 >= 0) {
                float f16 = (i2 * f5) + f8;
                float f17 = (9 - i2) + ((3 - i) * 10);
                float f18 = this.d;
                float f19 = this.e;
                if (this.c - f19 >= ((f18 - f19) / 40.0f) * f17) {
                    canvas.drawArc(f11, f13, f14, f15, f16, f5, false, paint2);
                }
                i2--;
                i = i;
            }
            i--;
        }
    }

    public void setColor(int i) {
        this.j = i;
        Paint paint = this.p;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setCriticalColor(int i) {
        this.l = i;
        Paint paint = this.r;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setCriticalLevel(float f) {
        this.g = f - this.e;
    }

    @Override // defpackage.AbstractC0510qg
    public void setLevelValue(float f) {
        this.c = f;
        invalidate();
    }

    public void setMarginKoef(float f) {
        this.h = f;
    }

    public void setMaxValue(float f) {
        this.d = f;
    }

    public void setMinValue(float f) {
        this.e = f;
    }

    public void setStrokeWidth(int i) {
        this.i = i;
    }

    public void setWarnColor(int i) {
        this.k = i;
        Paint paint = this.q;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setWarnLevel(float f) {
        this.f = f - this.e;
    }
}
