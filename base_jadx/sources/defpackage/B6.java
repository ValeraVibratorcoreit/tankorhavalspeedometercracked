package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class B6 extends AbstractC0510qg {
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Paint l;

    public B6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0.0f;
        this.c = 20.0f;
        this.d = 12.5f;
        this.e = -12303292;
        this.f = -7829368;
        this.g = -256;
        this.h = -65536;
        b();
        Paint paint = new Paint();
        this.i = paint;
        paint.setColor(this.e);
        Paint paint2 = this.i;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.j = paint3;
        paint3.setColor(this.f);
        this.j.setStyle(style);
        Paint paint4 = new Paint();
        this.k = paint4;
        paint4.setColor(this.g);
        this.k.setStyle(style);
        Paint paint5 = new Paint();
        this.l = paint5;
        paint5.setColor(this.h);
        this.l.setStyle(style);
    }

    public abstract void b();

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (getWidth() - 12) / 4.0f;
        float height = getHeight();
        float f = width / 10.0f;
        for (int i = 0; i < 4; i++) {
            float f2 = (width + 4.0f) * i;
            canvas.drawRect(f2, 0.0f, f2 + width, height, this.i);
            for (int i2 = 0; i2 < 10; i2++) {
                float f3 = (i2 * f) + f2;
                float f4 = f3 + f;
                float f5 = ((i * 10) + i2) * 2.5f;
                float f6 = this.b;
                Paint paint = f6 >= this.c ? this.j : f6 >= this.d ? this.k : this.l;
                if (f6 >= f5) {
                    canvas.drawRect(f3, 0.0f, f4, height, paint);
                }
            }
        }
    }

    public void setBackColor(int i) {
        this.e = i;
        Paint paint = this.i;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setColor(int i) {
        this.f = i;
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setCriticalColor(int i) {
        this.h = i;
        Paint paint = this.l;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // defpackage.AbstractC0510qg
    public void setLevelValue(float f) {
        this.b = f;
        invalidate();
    }

    public void setLowColor(int i) {
        this.g = i;
        Paint paint = this.k;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setNormalLevel(float f) {
        this.c = f;
    }

    public void setWarnLevel(float f) {
        this.d = f;
    }
}
