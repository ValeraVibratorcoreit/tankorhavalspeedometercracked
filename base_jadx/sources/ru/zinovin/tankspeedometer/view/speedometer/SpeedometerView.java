package ru.zinovin.tankspeedometer.view.speedometer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.AbstractC0669vl;
import defpackage.Bn;
import defpackage.C0768yr;
import defpackage.InterfaceC0242hp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SpeedometerView extends View {
    public Drawable a;
    public Drawable b;
    public Bitmap c;
    public final Paint d;
    public final ArrayList e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public final RectF o;
    public final PointF p;

    public SpeedometerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.d = new Paint(1);
        new Paint(1);
        this.e = new ArrayList();
        this.f = -90.0f;
        this.g = 90.0f;
        this.h = 0.0f;
        this.i = 100.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = -90.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = new RectF();
        this.p = new PointF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0669vl.c);
            this.a = typedArrayObtainStyledAttributes.getDrawable(0);
            this.b = typedArrayObtainStyledAttributes.getDrawable(4);
            this.f = typedArrayObtainStyledAttributes.getFloat(7, -90.0f);
            this.g = typedArrayObtainStyledAttributes.getFloat(1, 90.0f);
            this.h = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
            this.i = typedArrayObtainStyledAttributes.getFloat(2, 100.0f);
            typedArrayObtainStyledAttributes.getFloat(5, 0.5f);
            float f = typedArrayObtainStyledAttributes.getFloat(6, 1.0f);
            this.j = f;
            if (f < 0.2f) {
                this.j = 0.2f;
            }
            if (this.j > 1.2f) {
                this.j = 1.2f;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private int getSize() {
        return getWidth();
    }

    public final void a(Bn bn) {
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            Bn bn2 = (Bn) arrayList.get(arrayList.size() - 1);
            if (Math.abs(bn.a - bn2.b) > 0.001f || Math.abs(0.0f - bn2.c) > 0.001f) {
                throw new IllegalArgumentException("Сектор должен начинаться с конца предыдущего");
            }
            if ((bn2.a < bn2.b) != (bn.a < bn.b)) {
                throw new IllegalArgumentException("Направление секторов должно совпадать");
            }
        }
        arrayList.add(bn);
        e();
        invalidate();
    }

    public final float b(float f) {
        for (Bn bn : this.e) {
            float f2 = bn.a;
            if (f >= f2) {
                float f3 = bn.b;
                if (f <= f3) {
                    if (f < f2 || f > f3) {
                        return -1.0f;
                    }
                    return ((bn.c - 0.0f) * ((f - f2) / (f3 - f2))) + 0.0f;
                }
            }
        }
        float f4 = this.f;
        float f5 = (f - f4) / (this.g - f4);
        float f6 = this.h;
        return ((this.i - f6) * f5) + f6;
    }

    public final void c(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.i;
        if (f > f2) {
            f = f2;
        }
        this.m = f(f);
        postInvalidateOnAnimation();
    }

    public final void d() {
        Canvas canvas;
        int size = getSize();
        if (size == 0) {
            canvas = new Canvas();
        } else {
            this.c = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(this.c);
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.a.draw(canvas);
        }
    }

    public final void e() {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f = ((Bn) arrayList.get(0)).a;
        this.h = 0.0f;
        Bn bn = (Bn) arrayList.get(arrayList.size() - 1);
        this.g = bn.b;
        this.i = bn.c;
        this.l = f(this.k);
    }

    public final float f(float f) {
        float f2 = this.h;
        if (f < f2) {
            f = f2;
        }
        float f3 = this.i;
        if (f > f3) {
            f = f3;
        }
        for (Bn bn : this.e) {
            if (bn.a(f)) {
                if (!bn.a(f)) {
                    return -1.0f;
                }
                float f4 = (f - 0.0f) / (bn.c - 0.0f);
                float f5 = bn.b;
                float f6 = bn.a;
                return ((f5 - f6) * f4) + f6;
            }
        }
        float f7 = this.h;
        float f8 = (f - f7) / (this.i - f7);
        float f9 = this.f;
        return ((this.g - f9) * f8) + f9;
    }

    public float getCurrentAngle() {
        return this.l;
    }

    public Bn getCurrentSector() {
        for (Bn bn : this.e) {
            if (bn.a(this.k)) {
                return bn;
            }
        }
        return null;
    }

    public float getCurrentValue() {
        return this.k;
    }

    public float getOverallEndAngle() {
        return this.g;
    }

    public float getOverallMaxValue() {
        return this.i;
    }

    public float getOverallMinValue() {
        return this.h;
    }

    public float getOverallStartAngle() {
        return this.f;
    }

    public List<Bn> getSectors() {
        return new ArrayList(this.e);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.c, 0.0f, 0.0f, this.d);
        if (this.b == null) {
            return;
        }
        float f = this.n;
        float f2 = ((this.m - f) * 0.08f) + f;
        this.n = f2;
        float f3 = f2 - this.l;
        if (Math.abs(f3) > 0.05f) {
            float f4 = (f3 * 0.18f) + this.l;
            this.l = f4;
            this.k = b(f4);
            postInvalidateOnAnimation();
        } else {
            float f5 = this.n;
            this.l = f5;
            this.k = b(f5);
        }
        canvas.save();
        PointF pointF = this.p;
        canvas.translate(pointF.x, pointF.y);
        canvas.rotate(this.l);
        canvas.translate(-pointF.x, -pointF.y);
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.o;
        rectF.set(0.0f, 0.0f, i, i2);
        this.p.set(rectF.centerX(), rectF.centerY());
        d();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(0, 0, getSize(), getSize());
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        this.a = drawable;
        d();
        invalidate();
    }

    public void setEffectRenderer(InterfaceC0242hp interfaceC0242hp) {
        invalidate();
    }

    public void setNeedleDrawable(Drawable drawable) {
        C0768yr.e("T500.SVIEW", "setNeedleDrawable()");
        this.b = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, getSize(), getSize());
        }
        invalidate();
    }

    public void setNeedlePivotYRatio(float f) {
        invalidate();
    }

    public void setNeedleScale(float f) {
        if (f < 0.2f) {
            f = 0.2f;
        }
        if (f > 1.2f) {
            f = 1.2f;
        }
        this.j = f;
        requestLayout();
        invalidate();
    }

    public void setValue(float f) {
        c(f);
    }
}
