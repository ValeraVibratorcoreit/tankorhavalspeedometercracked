package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0548ro {
    public final C0796zo[] a = new C0796zo[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final C0796zo g = new C0796zo();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public C0548ro() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new C0796zo();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public final void a(C0487po c0487po, float f, RectF rectF, C0308k0 c0308k0, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C0796zo[] c0796zoArr;
        C0473pa c0473pa;
        R7 r7;
        F4 f4;
        C0548ro c0548ro = this;
        path.rewind();
        Path path2 = c0548ro.e;
        path2.rewind();
        Path path3 = c0548ro.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = c0548ro.c;
            fArr = c0548ro.h;
            matrixArr2 = c0548ro.b;
            c0796zoArr = c0548ro.a;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                r7 = c0487po.g;
            } else if (i2 != 2) {
                r7 = i2 != 3 ? c0487po.f : c0487po.e;
            } else {
                r7 = c0487po.h;
            }
            if (i2 == 1) {
                f4 = c0487po.c;
            } else if (i2 != 2) {
                f4 = i2 != 3 ? c0487po.b : c0487po.a;
            } else {
                f4 = c0487po.d;
            }
            C0796zo c0796zo = c0796zoArr[i2];
            f4.getClass();
            f4.D(c0796zo, f, r7.a(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = c0548ro.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            C0796zo c0796zo2 = c0796zoArr[i2];
            fArr[0] = c0796zo2.c;
            fArr[1] = c0796zo2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < i) {
            C0796zo c0796zo3 = c0796zoArr[i4];
            fArr[0] = c0796zo3.a;
            fArr[1] = c0796zo3.b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c0796zoArr[i4].b(matrixArr2[i4], path);
            if (c0308k0 != null) {
                C0796zo c0796zo4 = c0796zoArr[i4];
                Matrix matrix = matrixArr2[i4];
                C0204gi c0204gi = (C0204gi) c0308k0.b;
                BitSet bitSet = c0204gi.d;
                c0796zo4.getClass();
                bitSet.set(i4, false);
                c0796zo4.a(c0796zo4.f);
                c0204gi.b[i4] = new C0579so(new ArrayList(c0796zo4.h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            C0796zo c0796zo5 = c0796zoArr[i4];
            fArr[0] = c0796zo5.c;
            fArr[1] = c0796zo5.d;
            matrixArr2[i4].mapPoints(fArr);
            C0796zo c0796zo6 = c0796zoArr[i6];
            float f3 = c0796zo6.a;
            float[] fArr2 = c0548ro.i;
            fArr2[0] = f3;
            fArr2[1] = c0796zo6.b;
            matrixArr2[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C0796zo c0796zo7 = c0796zoArr[i4];
            fArr[0] = c0796zo7.c;
            fArr[1] = c0796zo7.d;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 1 || i4 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C0796zo c0796zo8 = c0548ro.g;
            c0796zo8.d(0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c0473pa = c0487po.k;
            } else if (i4 != 2) {
                c0473pa = i4 != 3 ? c0487po.j : c0487po.i;
            } else {
                c0473pa = c0487po.l;
            }
            c0473pa.getClass();
            c0796zo8.c(fMax, 0.0f);
            Path path4 = c0548ro.j;
            path4.reset();
            c0796zo8.b(matrixArr[i4], path4);
            if (c0548ro.l && (c0548ro.b(path4, i4) || c0548ro.b(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = c0796zo8.a;
                fArr[1] = c0796zo8.b;
                matrixArr[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0796zo8.b(matrixArr[i4], path2);
            } else {
                c0796zo8.b(matrixArr[i4], path);
            }
            if (c0308k0 != null) {
                Matrix matrix2 = matrixArr[i4];
                C0204gi c0204gi2 = (C0204gi) c0308k0.b;
                c0204gi2.d.set(i4 + 4, false);
                c0796zo8.a(c0796zo8.f);
                c0204gi2.c[i4] = new C0579so(new ArrayList(c0796zo8.h), new Matrix(matrix2));
            }
            i = 4;
            c0548ro = this;
            i4 = i5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
