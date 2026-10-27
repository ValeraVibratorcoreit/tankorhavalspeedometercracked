package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Zr {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final Wr g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final C0066c3 o;

    public Zr() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new C0066c3();
        this.g = new Wr();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x0191  */
    /* JADX WARN: Code duplicated, block: B:60:0x0194  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.graphics.PathMeasure] */
    public final void a(Wr wr, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        Z1 z1;
        ?? r5;
        Z1 z2;
        Paint paint;
        Paint.Join join;
        Paint.Cap cap;
        Shader shader;
        Paint paint2;
        Shader shader2;
        Path.FillType fillType;
        int i4 = 1;
        wr.a.set(matrix);
        Matrix matrix2 = wr.a;
        matrix2.preConcat(wr.j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = wr.b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            Xr xr = (Xr) arrayList.get(i5);
            if (xr instanceof Wr) {
                a((Wr) xr, matrix2, canvas, i, i2);
                i3 = i4;
            } else if (xr instanceof Yr) {
                Yr yr = (Yr) xr;
                float f3 = i / this.j;
                float f4 = i2 / this.k;
                float fMin = Math.min(f3, f4);
                Matrix matrix3 = this.c;
                matrix3.set(matrix2);
                matrix3.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.a;
                    yr.getClass();
                    path.reset();
                    Dk[] dkArr = yr.a;
                    if (dkArr != null) {
                        Dk.b(dkArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (yr instanceof Ur) {
                        path2.setFillType(yr.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        Vr vr = (Vr) yr;
                        float f6 = vr.j;
                        if (f6 == 0.0f) {
                            f = 1.0f;
                            if (vr.k != 1.0f) {
                            }
                            path2.addPath(path, matrix3);
                            z1 = vr.g;
                            if (((Shader) z1.c) != null && z1.b == 0) {
                                r5 = r11;
                            } else {
                                r5 = 1;
                            }
                            if (r5 != 0) {
                                if (this.e == null) {
                                    Paint paint3 = new Paint(1);
                                    this.e = paint3;
                                    paint3.setStyle(Paint.Style.FILL);
                                }
                                paint2 = this.e;
                                shader2 = (Shader) z1.c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint2.setShader(shader2);
                                    paint2.setAlpha(Math.round(vr.i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = z1.b;
                                    float f7 = vr.i;
                                    PorterDuff.Mode mode = C0091cs.j;
                                    paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f7)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (vr.c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            z2 = vr.e;
                            if (((Shader) z2.c) == null || z2.b != 0) {
                                if (this.d == null) {
                                    Paint paint4 = new Paint(1);
                                    this.d = paint4;
                                    paint4.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.d;
                                join = vr.n;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = vr.m;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(vr.o);
                                shader = (Shader) z2.c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(vr.h * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i7 = z2.b;
                                    float f8 = vr.h;
                                    PorterDuff.Mode mode2 = C0091cs.j;
                                    paint.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f8)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(vr.f * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            }
                        } else {
                            f = 1.0f;
                        }
                        float f9 = vr.l;
                        float f10 = (f6 + f9) % f;
                        float f11 = (vr.k + f9) % f;
                        if (this.f == null) {
                            this.f = new PathMeasure();
                        }
                        this.f.setPath(path, r11);
                        float length = this.f.getLength();
                        float f12 = f10 * length;
                        float f13 = f11 * length;
                        path.reset();
                        if (f12 > f13) {
                            this.f.getSegment(f12, length, path, true);
                            f2 = 0.0f;
                            this.f.getSegment(0.0f, f13, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f.getSegment(f12, f13, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix3);
                        z1 = vr.g;
                        if (((Shader) z1.c) != null) {
                            r5 = 1;
                        } else {
                            r5 = r11;
                        }
                        if (r5 != 0) {
                            if (this.e == null) {
                                Paint paint5 = new Paint(1);
                                this.e = paint5;
                                paint5.setStyle(Paint.Style.FILL);
                            }
                            paint2 = this.e;
                            shader2 = (Shader) z1.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint2.setShader(shader2);
                                paint2.setAlpha(Math.round(vr.i * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i8 = z1.b;
                                float f14 = vr.i;
                                PorterDuff.Mode mode3 = C0091cs.j;
                                paint2.setColor((i8 & 16777215) | (((int) (Color.alpha(i8) * f14)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (vr.c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        }
                        z2 = vr.e;
                        if (((Shader) z2.c) == null) {
                            if (this.d == null) {
                                Paint paint6 = new Paint(1);
                                this.d = paint6;
                                paint6.setStyle(Paint.Style.STROKE);
                            }
                            paint = this.d;
                            join = vr.n;
                            if (join != null) {
                                paint.setStrokeJoin(join);
                            }
                            cap = vr.m;
                            if (cap != null) {
                                paint.setStrokeCap(cap);
                            }
                            paint.setStrokeMiter(vr.o);
                            shader = (Shader) z2.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint.setShader(shader);
                                paint.setAlpha(Math.round(vr.h * 255.0f));
                            } else {
                                paint.setShader(null);
                                paint.setAlpha(255);
                                int i9 = z2.b;
                                float f15 = vr.h;
                                PorterDuff.Mode mode4 = C0091cs.j;
                                paint.setColor((i9 & 16777215) | (((int) (Color.alpha(i9) * f15)) << 24));
                            }
                            paint.setColorFilter(null);
                            paint.setStrokeWidth(vr.f * fAbs * fMin);
                            canvas.drawPath(path2, paint);
                        } else {
                            if (this.d == null) {
                                Paint paint7 = new Paint(1);
                                this.d = paint7;
                                paint7.setStyle(Paint.Style.STROKE);
                            }
                            paint = this.d;
                            join = vr.n;
                            if (join != null) {
                                paint.setStrokeJoin(join);
                            }
                            cap = vr.m;
                            if (cap != null) {
                                paint.setStrokeCap(cap);
                            }
                            paint.setStrokeMiter(vr.o);
                            shader = (Shader) z2.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint.setShader(shader);
                                paint.setAlpha(Math.round(vr.h * 255.0f));
                            } else {
                                paint.setShader(null);
                                paint.setAlpha(255);
                                int i10 = z2.b;
                                float f16 = vr.h;
                                PorterDuff.Mode mode5 = C0091cs.j;
                                paint.setColor((i10 & 16777215) | (((int) (Color.alpha(i10) * f16)) << 24));
                            }
                            paint.setColorFilter(null);
                            paint.setStrokeWidth(vr.f * fAbs * fMin);
                            canvas.drawPath(path2, paint);
                        }
                    }
                }
                i3 = 1;
            } else {
                i3 = i4;
            }
            i5 += i3;
            i4 = i3;
            matrix2 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public Zr(Zr zr) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        C0066c3 c0066c3 = new C0066c3();
        this.o = c0066c3;
        this.g = new Wr(zr.g, c0066c3);
        this.a = new Path(zr.a);
        this.b = new Path(zr.b);
        this.h = zr.h;
        this.i = zr.i;
        this.j = zr.j;
        this.k = zr.k;
        this.l = zr.l;
        this.m = zr.m;
        String str = zr.m;
        if (str != null) {
            c0066c3.put(str, this);
        }
        this.n = zr.n;
    }
}
