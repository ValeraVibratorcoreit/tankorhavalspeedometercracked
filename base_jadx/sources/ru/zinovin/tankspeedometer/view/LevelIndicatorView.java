package ru.zinovin.tankspeedometer.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.AbstractC0510qg;
import defpackage.Tf;
import defpackage.U2;

/* JADX INFO: loaded from: classes.dex */
public class LevelIndicatorView extends AbstractC0510qg {
    public static final /* synthetic */ int p = 0;
    public final U2 b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final Paint o;

    public LevelIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.0f;
        this.d = 130.0f;
        this.e = 50.0f;
        this.f = 55.0f;
        this.g = 70.0f;
        this.h = -12303292;
        this.i = -7829368;
        this.j = -256;
        this.k = -65536;
        U2 u2 = new U2(this, 5);
        this.b = u2;
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.registerOnSharedPreferenceChangeListener(u2);
        b();
        setWarnLevel(Float.parseFloat(sharedPreferences.getString("coolant_warn_level", "105.0")));
        setCriticalLevel(Float.parseFloat(sharedPreferences.getString("coolant_critical_level", "120.0")));
        Paint paint = new Paint();
        this.l = paint;
        paint.setColor(this.h);
        Paint paint2 = this.l;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.m = paint3;
        paint3.setColor(this.i);
        this.m.setStyle(style);
        Paint paint4 = new Paint();
        this.n = paint4;
        paint4.setColor(this.j);
        this.n.setStyle(style);
        Paint paint5 = new Paint();
        this.o = paint5;
        paint5.setColor(this.k);
        this.o.setStyle(style);
    }

    @Override // defpackage.AbstractC0510qg
    public final void a() {
        b();
        invalidate();
    }

    public final void b() {
        setColor(Tf.w("coolant_color"));
        setBackColor(Tf.w("coolant_background_color"));
        setWarnColor(Tf.w("coolant_warn_color"));
        setCriticalColor(Tf.w("coolant_critical_color"));
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
        super.onDraw(canvas);
        float width = (getWidth() - 12) / 4.0f;
        float height = getHeight();
        float f = width / 10.0f;
        float f2 = this.c;
        float f3 = this.e;
        Paint paint = f2 - f3 >= this.g ? this.o : f2 - f3 >= this.f ? this.n : this.m;
        for (int i = 0; i < 4; i++) {
            float f4 = (width + 4.0f) * i;
            canvas.drawRect(f4, 0.0f, f4 + width, height, this.l);
            for (int i2 = 0; i2 < 10; i2++) {
                float f5 = (i2 * f) + f4;
                float f6 = f5 + f;
                float f7 = this.d;
                float f8 = this.e;
                if (this.c - f8 >= ((f7 - f8) / 40.0f) * ((i * 10) + i2)) {
                    canvas.drawRect(f5, 0.0f, f6, height, paint);
                }
            }
        }
    }

    public void setBackColor(int i) {
        this.h = i;
        Paint paint = this.l;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setColor(int i) {
        this.i = i;
        Paint paint = this.m;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setCriticalColor(int i) {
        this.k = i;
        Paint paint = this.o;
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

    public void setMaxValue(float f) {
        this.d = f;
    }

    public void setMinValue(float f) {
        this.e = f;
    }

    public void setWarnColor(int i) {
        this.j = i;
        Paint paint = this.n;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setWarnLevel(float f) {
        this.f = f - this.e;
    }
}
