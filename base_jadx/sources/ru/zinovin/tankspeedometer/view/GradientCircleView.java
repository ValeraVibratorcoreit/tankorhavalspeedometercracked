package ru.zinovin.tankspeedometer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.AbstractC0669vl;
import defpackage.C0768yr;

/* JADX INFO: loaded from: classes.dex */
public class GradientCircleView extends View {
    public final Paint a;
    public int b;
    public int c;
    public int d;
    public final int[] e;
    public final float[] f;
    public boolean g;

    public GradientCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        this.e = new int[]{Color.argb(255, 0, 0, 0), Color.argb(150, 0, 0, 0), Color.argb(5, 0, 0, 0)};
        this.f = new float[]{0.0f, 0.65f, 1.0f};
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0669vl.a);
            int[] iArr = this.e;
            iArr[1] = typedArrayObtainStyledAttributes.getColor(0, iArr[1]);
            float[] fArr = this.f;
            fArr[1] = typedArrayObtainStyledAttributes.getFloat(1, fArr[1]);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i, float f) {
        C0768yr.e("T500.SHADOW", "gradientStop=" + f + " gradientColor=" + i);
        this.e[1] = i;
        this.f[1] = f;
        if (this.g) {
            this.a.setShader(new RadialGradient(this.c, this.d, this.b, this.e, this.f, Shader.TileMode.CLAMP));
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.c, this.d, this.b, this.a);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = true;
        C0768yr.e("T500.SHADOW", "onSizeChanged()");
        this.b = Math.min(i, i2) / 2;
        this.c = i / 2;
        this.d = i2 / 2;
        this.a.setShader(new RadialGradient(this.c, this.d, this.b, this.e, this.f, Shader.TileMode.CLAMP));
    }
}
