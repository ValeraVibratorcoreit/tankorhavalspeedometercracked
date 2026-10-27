package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641uo extends AbstractC0765yo {
    public final C0703wo c;
    public final float d;
    public final float e;

    public C0641uo(C0703wo c0703wo, float f, float f2) {
        this.c = c0703wo;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.AbstractC0765yo
    public final void a(Matrix matrix, C0425no c0425no, int i, Canvas canvas) {
        C0703wo c0703wo = this.c;
        float f = c0703wo.c;
        float f2 = this.e;
        float f3 = c0703wo.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        c0425no.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C0425no.i;
        iArr[0] = c0425no.f;
        iArr[1] = c0425no.e;
        iArr[2] = c0425no.d;
        Paint paint = c0425no.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C0425no.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        C0703wo c0703wo = this.c;
        return (float) Math.toDegrees(Math.atan((c0703wo.c - this.e) / (c0703wo.b - this.d)));
    }
}
