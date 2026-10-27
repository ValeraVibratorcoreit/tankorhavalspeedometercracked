package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0513qj extends View {
    public Paint a;
    public Path b;
    public RectF c;
    public float d;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        float height = getHeight();
        float f = this.d;
        canvas.drawLine(0.0f, 0.0f, 0.0f, height - f, this.a);
        float f2 = width;
        float f3 = this.d;
        canvas.drawLine(f3, height, f2 - f3, height, this.a);
        canvas.drawLine(f2, 0.0f, f2, height - f, this.a);
        this.b.reset();
        this.c.set(f2 - (f * 2.0f), height - (f * 2.0f), f2, height);
        this.b.addArc(this.c, 0.0f, 90.0f);
        this.c.set(0.0f, height - (f * 2.0f), f * 2.0f, height);
        this.b.arcTo(this.c, 90.0f, 90.0f);
        canvas.drawPath(this.b, this.a);
    }
}
