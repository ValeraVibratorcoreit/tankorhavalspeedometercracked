package defpackage;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0353le extends View {
    public final Paint a;
    public final RectF b;
    public final ArgbEvaluator c;
    public final AccelerateDecelerateInterpolator d;
    public boolean e;
    public float f;
    public InterfaceC0322ke g;
    public boolean h;
    public long i;
    public float j;
    public float k;
    public final RunnableC0524r0 l;
    public final int m;
    public final int n;
    public final int o;
    public final float p;
    public final float q;
    public final float r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;

    public C0353le(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new RectF();
        this.c = new ArgbEvaluator();
        this.d = new AccelerateDecelerateInterpolator();
        this.l = new RunnableC0524r0(this, 9);
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (65.0f * f);
        this.n = i;
        this.r = f;
        int i2 = i / 12;
        this.o = i2;
        this.m = ((i - (i2 * 2)) * 2) + (i2 * 4);
        float f2 = f * 2.0f;
        this.p = f2;
        this.q = f2;
        this.s = getResources().getColor(R.color.ts_color_gwm);
        this.t = getResources().getColor(R.color.ts_color_control_off);
        this.u = getResources().getColor(R.color.ts_color_thumb_center);
        this.v = getResources().getColor(R.color.ts_color_thumb_edge);
        this.w = getResources().getColor(R.color.ts_color_control_border);
        this.f = this.e ? 1.0f : 0.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArgbEvaluator argbEvaluator = this.c;
        int iIntValue = ((Integer) argbEvaluator.evaluate(this.f, Integer.valueOf(this.t), Integer.valueOf(this.s))).intValue();
        int iIntValue2 = ((Integer) argbEvaluator.evaluate(this.f, Integer.valueOf(this.w), Integer.valueOf(this.s))).intValue();
        float f = this.r / 2.0f;
        RectF rectF = this.b;
        rectF.set(f, f, this.m - f, this.n - f);
        Paint paint = this.a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(iIntValue);
        float f2 = this.p;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.r);
        paint.setColor(iIntValue2);
        float f3 = this.p;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        int i = this.n;
        int i2 = this.o;
        int i3 = i - (i2 * 2);
        float f4 = i2;
        float f5 = ((((this.m - i2) - i3) - f4) * this.f) + f4;
        float f6 = i3;
        rectF.set(f5, i2, f5 + f6, i2 + i3);
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), f6 * 0.62f, this.u, this.v, Shader.TileMode.CLAMP);
        paint.setStyle(style);
        paint.setShader(radialGradient);
        float f7 = this.q;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        paint.setShader(null);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.m, this.n);
    }

    public void setChecked(boolean z) {
        if (this.e != z) {
            this.e = z;
            this.h = false;
            removeCallbacks(this.l);
            this.f = z ? 1.0f : 0.0f;
            invalidate();
        }
    }

    public void setOnCheckedChange(InterfaceC0322ke interfaceC0322ke) {
        this.g = interfaceC0322ke;
    }
}
