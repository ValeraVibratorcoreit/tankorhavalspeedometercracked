package ru.zinovin.tankspeedometer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class HeaderBlockView extends View {
    public final Paint a;
    public RectF b;
    public RectF c;
    public int d;

    public HeaderBlockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(Color.parseColor("#9B000000"));
        this.a.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.b, 90.0f, 180.0f, true, this.a);
        canvas.drawArc(this.c, 270.0f, 180.0f, true, this.a);
        canvas.drawRect(this.d, 0.0f, getWidth() - this.d, getHeight(), this.a);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d = i2 / 2;
        float f = i2;
        this.b = new RectF(0.0f, 0.0f, this.d * 2, f);
        this.c = new RectF(i - (this.d * 2), 0.0f, i, f);
    }
}
