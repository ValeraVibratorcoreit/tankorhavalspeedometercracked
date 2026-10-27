package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends AbstractC0123e {
    public int k;
    public Paint l;
    public Paint m;
    public Paint n;
    public Paint o;
    public Paint p;
    public Bitmap q;
    public Canvas r;
    public C0685w6 s;

    @Override // defpackage.AbstractC0123e
    public final void a() {
        super.a();
        this.l.setShader(Br.m(this.g * 2));
        this.q = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.r = new Canvas(this.q);
    }

    @Override // defpackage.AbstractC0123e
    public final void b(Canvas canvas) {
        int width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.l);
        int iMax = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            float f = i;
            Paint paint = this.m;
            paint.setColor(this.k);
            paint.setAlpha(Math.round((f / (width - 1)) * 255.0f));
            i += iMax;
            canvas.drawRect(f, 0.0f, i, height, paint);
        }
    }

    @Override // defpackage.AbstractC0123e
    public final void c(Canvas canvas, float f, float f2) {
        Paint paint = this.n;
        paint.setColor(this.k);
        paint.setAlpha(Math.round(this.h * 255.0f));
        if (this.i) {
            canvas.drawCircle(f, f2, this.f, this.o);
        }
        if (this.h >= 1.0f) {
            canvas.drawCircle(f, f2, this.f * 0.75f, paint);
            return;
        }
        Canvas canvas2 = this.r;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        this.r.drawCircle(f, f2, (this.f * 0.75f) + 4.0f, this.l);
        this.r.drawCircle(f, f2, (this.f * 0.75f) + 4.0f, paint);
        Vi viI = Br.I();
        Paint paint2 = (Paint) viI.a;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(6.0f);
        ((Paint) viI.a).setXfermode(new PorterDuffXfermode(mode));
        this.p = paint2;
        this.r.drawCircle(f, f2, (paint2.getStrokeWidth() / 2.0f) + (this.f * 0.75f), this.p);
        canvas.drawBitmap(this.q, 0.0f, 0.0f, (Paint) null);
    }

    @Override // defpackage.AbstractC0123e
    public final void d(float f) {
        C0685w6 c0685w6 = this.s;
        if (c0685w6 != null) {
            c0685w6.setAlphaValue(f);
        }
    }

    public void setColor(int i) {
        this.k = i;
        this.h = Color.alpha(i) / 255.0f;
        if (this.c != null) {
            e();
            invalidate();
        }
    }

    public void setColorPicker(C0685w6 c0685w6) {
        this.s = c0685w6;
    }
}
