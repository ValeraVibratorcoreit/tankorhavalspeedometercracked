package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: to, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0610to extends AbstractC0765yo {
    public final C0672vo c;

    public C0610to(C0672vo c0672vo) {
        this.c = c0672vo;
    }

    @Override // defpackage.AbstractC0765yo
    public final void a(Matrix matrix, C0425no c0425no, int i, Canvas canvas) {
        C0672vo c0672vo = this.c;
        float f = c0672vo.f;
        float f2 = c0672vo.g;
        RectF rectF = new RectF(c0672vo.b, c0672vo.c, c0672vo.d, c0672vo.e);
        c0425no.getClass();
        boolean z = f2 < 0.0f;
        Path path = c0425no.g;
        int[] iArr = C0425no.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c0425no.f;
            iArr[2] = c0425no.e;
            iArr[3] = c0425no.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c0425no.d;
            iArr[2] = c0425no.e;
            iArr[3] = c0425no.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C0425no.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c0425no.b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0425no.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
