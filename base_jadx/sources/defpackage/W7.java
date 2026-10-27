package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class W7 extends C0204gi {
    public static final /* synthetic */ int y = 0;
    public V7 x;

    public W7(V7 v7) {
        super(v7);
        this.x = v7;
    }

    @Override // defpackage.C0204gi
    public final void g(Canvas canvas) {
        if (this.x.v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.x.v);
        super.g(canvas);
        canvas.restore();
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.x = new V7(this.x);
        return this;
    }

    public final void p(float f, float f2, float f3, float f4) {
        RectF rectF = this.x.v;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
