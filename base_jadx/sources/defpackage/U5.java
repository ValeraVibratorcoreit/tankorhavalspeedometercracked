package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class U5 extends C0204gi implements Drawable.Callback, InterfaceC0520qq {
    public static final int[] G0 = {R.attr.state_enabled};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    public float A;
    public ColorStateList A0;
    public ColorStateList B;
    public WeakReference B0;
    public float C;
    public TextUtils.TruncateAt C0;
    public ColorStateList D;
    public boolean D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public boolean F0;
    public Drawable G;
    public ColorStateList H;
    public float I;
    public boolean J;
    public boolean K;
    public Drawable L;
    public RippleDrawable M;
    public ColorStateList N;
    public float O;
    public SpannableStringBuilder P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public C0113dj U;
    public C0113dj V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public final Context e0;
    public final Paint f0;
    public final Paint.FontMetrics g0;
    public final RectF h0;
    public final PointF i0;
    public final Path j0;
    public final C0550rq k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r0;
    public int s0;
    public int t0;
    public ColorFilter u0;
    public PorterDuffColorFilter v0;
    public ColorStateList w0;
    public ColorStateList x;
    public PorterDuff.Mode x0;
    public ColorStateList y;
    public int[] y0;
    public float z;
    public boolean z0;

    public U5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.chipStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Chip_Action);
        this.A = -1.0f;
        this.f0 = new Paint(1);
        this.g0 = new Paint.FontMetrics();
        this.h0 = new RectF();
        this.i0 = new PointF();
        this.j0 = new Path();
        this.t0 = 255;
        this.x0 = PorterDuff.Mode.SRC_IN;
        this.B0 = new WeakReference(null);
        j(context);
        this.e0 = context;
        C0550rq c0550rq = new C0550rq(this);
        this.k0 = c0550rq;
        this.E = "";
        c0550rq.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        if (!Arrays.equals(this.y0, iArr)) {
            this.y0 = iArr;
            if (U()) {
                x(getState(), iArr);
            }
        }
        this.D0 = true;
        H0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean u(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.R && (drawable = this.S) != null && this.Q) {
                O9.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(boolean z) {
        if (this.R != z) {
            boolean zS = S();
            this.R = z;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    p(this.S);
                } else {
                    V(this.S);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void C(float f) {
        if (this.A != f) {
            this.A = f;
            C0456oo c0456ooE = this.a.a.e();
            c0456ooE.e = new C0247i(f);
            c0456ooE.f = new C0247i(f);
            c0456ooE.g = new C0247i(f);
            c0456ooE.h = new C0247i(f);
            setShapeAppearanceModel(c0456ooE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void D(Drawable drawable) {
        ?? r0;
        Object obj = this.G;
        if (obj == null) {
            r0 = 0;
        } else if (obj instanceof au) {
            r0 = obj;
            ((bu) ((au) obj)).getClass();
            r0 = 0;
        }
        if (r0 != drawable) {
            float fR = r();
            this.G = drawable != null ? drawable.mutate() : null;
            float fR2 = r();
            V(r0);
            if (T()) {
                p(this.G);
            }
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void E(float f) {
        if (this.I != f) {
            float fR = r();
            this.I = f;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        this.J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (T()) {
                O9.h(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z) {
        if (this.F != z) {
            boolean zT = T();
            this.F = z;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    p(this.G);
                } else {
                    V(this.G);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (this.F0) {
                C0173fi c0173fi = this.a;
                if (c0173fi.d != colorStateList) {
                    c0173fi.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void I(float f) {
        if (this.C != f) {
            this.C = f;
            this.f0.setStrokeWidth(f);
            if (this.F0) {
                this.a.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void J(Drawable drawable) {
        ?? r0;
        Object obj = this.L;
        if (obj == null) {
            r0 = 0;
        } else if (obj instanceof au) {
            r0 = obj;
            ((bu) ((au) obj)).getClass();
            r0 = 0;
        }
        if (r0 != drawable) {
            float fS = s();
            this.L = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.D;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.M = new RippleDrawable(colorStateListValueOf, this.L, H0);
            float fS2 = s();
            V(r0);
            if (U()) {
                p(this.L);
            }
            invalidateSelf();
            if (fS != fS2) {
                w();
            }
        }
    }

    public final void K(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void L(float f) {
        if (this.O != f) {
            this.O = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void M(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (U()) {
                O9.h(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z) {
        if (this.K != z) {
            boolean zU = U();
            this.K = z;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    p(this.L);
                } else {
                    V(this.L);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void P(float f) {
        if (this.Y != f) {
            float fR = r();
            this.Y = f;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void Q(float f) {
        if (this.X != f) {
            float fR = r();
            this.X = f;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void R(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (!this.z0) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.A0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean S() {
        return this.R && this.S != null && this.r0;
    }

    public final boolean T() {
        return this.F && this.G != null;
    }

    public final boolean U() {
        return this.K && this.L != null;
    }

    @Override // defpackage.InterfaceC0520qq
    public final void a() {
        w();
        invalidateSelf();
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        float f;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.t0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.F0;
        Paint paint = this.f0;
        RectF rectF3 = this.h0;
        if (!z) {
            paint.setColor(this.l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (!this.F0) {
            paint.setColor(this.m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.u0;
            if (colorFilter == null) {
                colorFilter = this.v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (this.F0) {
            super.draw(canvas);
        }
        if (this.C > 0.0f && !this.F0) {
            paint.setColor(this.o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                ColorFilter colorFilter2 = this.u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.A - (this.C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.F0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.j0;
            C0173fi c0173fi = this.a;
            this.r.a(c0173fi.a, c0173fi.j, rectF4, this.q, path);
            f(canvas, paint, path, this.a.a, h());
        } else {
            canvas.drawRoundRect(rectF3, t(), t(), paint);
        }
        if (T()) {
            q(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (S()) {
            q(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.D0 || this.E == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.E;
            C0550rq c0550rq = this.k0;
            if (charSequence != null) {
                float fR = r() + this.W + this.Z;
                if (P9.a(this) == 0) {
                    pointF.x = bounds.left + fR;
                } else {
                    pointF.x = bounds.right - fR;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c0550rq.a;
                Paint.FontMetrics fontMetrics = this.g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.E != null) {
                float fR2 = r() + this.W + this.Z;
                float fS = s() + this.d0 + this.a0;
                if (P9.a(this) == 0) {
                    rectF3.left = bounds.left + fR2;
                    rectF3.right = bounds.right - fS;
                } else {
                    rectF3.left = bounds.left + fS;
                    rectF3.right = bounds.right - fR2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            C0458oq c0458oq = c0550rq.g;
            TextPaint textPaint2 = c0550rq.a;
            if (c0458oq != null) {
                textPaint2.drawableState = getState();
                c0550rq.g.e(this.e0, textPaint2, c0550rq.b);
            }
            textPaint2.setTextAlign(align);
            String string = this.E.toString();
            if (c0550rq.e) {
                c0550rq.a(string);
                f = c0550rq.c;
            } else {
                f = c0550rq.c;
            }
            boolean z2 = Math.round(f) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.E;
            if (z2 && this.C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.C0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f9 = pointF.x;
            float f10 = pointF.y;
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence2, 0, length, f9, f10, textPaint2);
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f11 = this.d0 + this.c0;
                if (P9.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.O;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f14 = this.O;
                float f15 = fExactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.M.setBounds(this.L.getBounds());
            this.M.jumpToCurrentState();
            this.M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f;
        float fR = r() + this.W + this.Z;
        String string = this.E.toString();
        C0550rq c0550rq = this.k0;
        if (c0550rq.e) {
            c0550rq.a(string);
            f = c0550rq.c;
        } else {
            f = c0550rq.c;
        }
        return Math.min(Math.round(s() + f + fR + this.a0 + this.d0), this.E0);
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.z, this.A);
        } else {
            outline.setRoundRect(bounds, this.A);
        }
        outline.setAlpha(this.t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C0458oq c0458oq;
        ColorStateList colorStateList;
        return u(this.x) || u(this.y) || u(this.B) || (this.z0 && u(this.A0)) || (!((c0458oq = this.k0.g) == null || (colorStateList = c0458oq.j) == null || !colorStateList.isStateful()) || ((this.R && this.S != null && this.Q) || v(this.G) || v(this.S) || u(this.w0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (T()) {
            zOnLayoutDirectionChanged |= P9.b(this.G, i);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= P9.b(this.S, i);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= P9.b(this.L, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (T()) {
            zOnLevelChange |= this.G.setLevel(i);
        }
        if (S()) {
            zOnLevelChange |= this.S.setLevel(i);
        }
        if (U()) {
            zOnLevelChange |= this.L.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable, defpackage.InterfaceC0520qq
    public final boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return x(iArr, this.y0);
    }

    public final void p(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        P9.b(drawable, P9.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.L) {
            if (drawable.isStateful()) {
                drawable.setState(this.y0);
            }
            O9.h(drawable, this.N);
            return;
        }
        Drawable drawable2 = this.G;
        if (drawable == drawable2 && this.J) {
            O9.h(drawable2, this.H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void q(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f = this.W + this.X;
            Drawable drawable = this.r0 ? this.S : this.G;
            float intrinsicWidth = this.I;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (P9.a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.r0 ? this.S : this.G;
            float fCeil = this.I;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(Tf.n(this.e0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float r() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f = this.X;
        Drawable drawable = this.r0 ? this.S : this.G;
        float intrinsicWidth = this.I;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.Y;
    }

    public final float s() {
        if (U()) {
            return this.b0 + this.O + this.c0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.u0 != colorFilter) {
            this.u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.w0 != colorStateList) {
            this.w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.C0204gi, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            ColorStateList colorStateList = this.w0;
            this.v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (T()) {
            visible |= this.G.setVisible(z, z2);
        }
        if (S()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        return this.F0 ? this.a.a.e.a(h()) : this.A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w() {
        T5 t5 = (T5) this.B0.get();
        if (t5 != null) {
            Chip chip = (Chip) t5;
            chip.b(chip.p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean x(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.x;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.l0) : 0);
        boolean state = true;
        if (this.l0 != iD) {
            this.l0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.y;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.m0) : 0);
        if (this.m0 != iD2) {
            this.m0 = iD2;
            zOnStateChange = true;
        }
        int iB = AbstractC0747y6.b(iD2, iD);
        if ((this.n0 != iB) | (this.a.c == null)) {
            this.n0 = iB;
            l(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.B;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.o0) : 0;
        if (this.o0 != colorForState) {
            this.o0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.A0 == null || !Ud.j0(iArr)) ? 0 : this.A0.getColorForState(iArr, this.p0);
        if (this.p0 != colorForState2) {
            this.p0 = colorForState2;
            if (this.z0) {
                zOnStateChange = true;
            }
        }
        C0458oq c0458oq = this.k0.g;
        int colorForState3 = (c0458oq == null || (colorStateList = c0458oq.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.q0);
        if (this.q0 != colorForState3) {
            this.q0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.Q) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        if (this.r0 == z || this.S == null) {
            z2 = false;
        } else {
            float fR = r();
            this.r0 = z;
            if (fR != r()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.w0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.s0) : 0;
        if (this.s0 != colorForState4) {
            this.s0 = colorForState4;
            ColorStateList colorStateList6 = this.w0;
            PorterDuff.Mode mode = this.x0;
            this.v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (v(this.G)) {
            state |= this.G.setState(iArr);
        }
        if (v(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (v(this.L)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.L.setState(iArr3);
        }
        if (v(this.M)) {
            state |= this.M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            w();
        }
        return state;
    }

    public final void y(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            float fR = r();
            if (!z && this.r0) {
                this.r0 = false;
            }
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void z(Drawable drawable) {
        if (this.S != drawable) {
            float fR = r();
            this.S = drawable;
            float fR2 = r();
            V(this.S);
            p(this.S);
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }
}
