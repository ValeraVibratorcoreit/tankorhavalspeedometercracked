package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: renamed from: gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0204gi extends Drawable implements Ao {
    public static final Paint w;
    public C0173fi a;
    public final AbstractC0765yo[] b;
    public final AbstractC0765yo[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public C0487po m;
    public final Paint n;
    public final Paint o;
    public final C0425no p;
    public final C0308k0 q;
    public final C0548ro r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public final RectF u;
    public final boolean v;

    static {
        Paint paint = new Paint(1);
        w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0204gi() {
        this(new C0487po());
    }

    public final void b(RectF rectF, Path path) {
        C0173fi c0173fi = this.a;
        this.r.a(c0173fi.a, c0173fi.j, rectF, this.q, path);
        if (this.a.i != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.u, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iD;
        if (colorStateList == null || mode == null) {
            return (!z || (iD = d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i) {
        int i2;
        C0173fi c0173fi = this.a;
        float f = c0173fi.n + c0173fi.o + c0173fi.m;
        C0565sa c0565sa = c0173fi.b;
        if (c0565sa == null || !c0565sa.a || AbstractC0747y6.d(i, 255) != c0565sa.d) {
            return i;
        }
        float f2 = c0565sa.e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iU = AbstractC0390mk.u(AbstractC0747y6.d(i, 255), c0565sa.b, fMin);
        if (fMin > 0.0f && (i2 = c0565sa.c) != 0) {
            iU = AbstractC0747y6.b(AbstractC0747y6.d(i2, C0565sa.f), iU);
        }
        return AbstractC0747y6.d(iU, iAlpha);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:43:0x012b  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth;
        Paint paint = this.n;
        paint.setColorFilter(this.s);
        int alpha = paint.getAlpha();
        int i = this.a.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.o;
        paint2.setColorFilter(this.t);
        paint2.setStrokeWidth(this.a.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        Path path = this.g;
        if (z) {
            float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0487po c0487po = this.a.a;
            C0456oo c0456ooE = c0487po.e();
            R7 j0 = c0487po.e;
            if (!(j0 instanceof C0608tm)) {
                j0 = new J0(f, j0);
            }
            c0456ooE.e = j0;
            R7 j1 = c0487po.f;
            if (!(j1 instanceof C0608tm)) {
                j1 = new J0(f, j1);
            }
            c0456ooE.f = j1;
            R7 j2 = c0487po.h;
            if (!(j2 instanceof C0608tm)) {
                j2 = new J0(f, j2);
            }
            c0456ooE.h = j2;
            R7 j3 = c0487po.g;
            if (!(j3 instanceof C0608tm)) {
                j3 = new J0(f, j3);
            }
            c0456ooE.g = j3;
            C0487po c0487poA = c0456ooE.a();
            this.m = c0487poA;
            float f2 = this.a.j;
            RectF rectF = this.j;
            rectF.set(h());
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.r.a(c0487poA, f2, rectF, null, this.h);
            b(h(), path);
            this.e = false;
        }
        C0173fi c0173fi = this.a;
        int i3 = c0173fi.p;
        if (i3 != 1 && c0173fi.q > 0) {
            if (i3 != 2) {
                int i4 = Build.VERSION.SDK_INT;
                if (!c0173fi.a.d(h()) && !path.isConvex() && i4 < 29) {
                    canvas.save();
                    C0173fi c0173fi2 = this.a;
                    int iSin = (int) (Math.sin(Math.toRadians(c0173fi2.s)) * ((double) c0173fi2.r));
                    C0173fi c0173fi3 = this.a;
                    canvas.translate(iSin, (int) (Math.cos(Math.toRadians(c0173fi3.s)) * ((double) c0173fi3.r)));
                    if (!this.v) {
                        RectF rectF2 = this.u;
                        iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth >= 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.a.q * 2) + ((int) rectF2.width()) + iWidth, (this.a.q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f3 = (getBounds().left - this.a.q) - iWidth;
                        float f4 = (getBounds().top - this.a.q) - iHeight;
                        canvas2.translate(-f3, -f4);
                        e(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        e(canvas);
                        canvas.restore();
                    }
                }
            } else {
                canvas.save();
                C0173fi c0173fi4 = this.a;
                int iSin2 = (int) (Math.sin(Math.toRadians(c0173fi4.s)) * ((double) c0173fi4.r));
                C0173fi c0173fi5 = this.a;
                canvas.translate(iSin2, (int) (Math.cos(Math.toRadians(c0173fi5.s)) * ((double) c0173fi5.r)));
                if (!this.v) {
                    RectF rectF3 = this.u;
                    iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight2 = (int) (rectF3.height() - getBounds().height());
                    if (iWidth >= 0) {
                    }
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                e(canvas);
                canvas.restore();
            }
        }
        C0173fi c0173fi6 = this.a;
        Paint.Style style = c0173fi6.u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, c0173fi6.a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("gi", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.a.r;
        Path path = this.g;
        C0425no c0425no = this.p;
        if (i != 0) {
            canvas.drawPath(path, c0425no.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC0765yo abstractC0765yo = this.b[i2];
            int i3 = this.a.q;
            Matrix matrix = AbstractC0765yo.b;
            abstractC0765yo.a(matrix, c0425no, i3, canvas);
            this.c[i2].a(matrix, c0425no, this.a.q, canvas);
        }
        if (this.v) {
            C0173fi c0173fi = this.a;
            int iSin = (int) (Math.sin(Math.toRadians(c0173fi.s)) * ((double) c0173fi.r));
            C0173fi c0173fi2 = this.a;
            int iCos = (int) (Math.cos(Math.toRadians(c0173fi2.s)) * ((double) c0173fi2.r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, w);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, C0487po c0487po, RectF rectF) {
        if (!c0487po.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = c0487po.f.a(rectF) * this.a.j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.o;
        Path path = this.h;
        C0487po c0487po = this.m;
        RectF rectF = this.j;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, c0487po, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C0173fi c0173fi = this.a;
        if (c0173fi.p == 2) {
            return;
        }
        if (c0173fi.a.d(h())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(h()) * this.a.j);
            return;
        }
        RectF rectFH = h();
        Path path = this.g;
        b(rectFH, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            V9.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                U9.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            U9.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.g;
        b(rectFH, path);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.a.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.c) != null && colorStateList4.isStateful())));
    }

    public final void j(Context context) {
        this.a.b = new C0565sa(context);
        o();
    }

    public final void k(float f) {
        C0173fi c0173fi = this.a;
        if (c0173fi.n != f) {
            c0173fi.n = f;
            o();
        }
    }

    public final void l(ColorStateList colorStateList) {
        C0173fi c0173fi = this.a;
        if (c0173fi.c != colorStateList) {
            c0173fi.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean m(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new C0173fi(this.a);
        return this;
    }

    public final boolean n() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        C0173fi c0173fi = this.a;
        this.s = c(c0173fi.f, c0173fi.g, this.n, true);
        C0173fi c0173fi2 = this.a;
        this.t = c(c0173fi2.e, c0173fi2.g, this.o, false);
        C0173fi c0173fi3 = this.a;
        if (c0173fi3.t) {
            int colorForState = c0173fi3.f.getColorForState(getState(), 0);
            C0425no c0425no = this.p;
            c0425no.getClass();
            c0425no.d = AbstractC0747y6.d(colorForState, 68);
            c0425no.e = AbstractC0747y6.d(colorForState, 20);
            c0425no.f = AbstractC0747y6.d(colorForState, 0);
            c0425no.a.setColor(c0425no.d);
        }
        return (Objects.equals(porterDuffColorFilter, this.s) && Objects.equals(porterDuffColorFilter2, this.t)) ? false : true;
    }

    public final void o() {
        C0173fi c0173fi = this.a;
        float f = c0173fi.n + c0173fi.o;
        c0173fi.q = (int) Math.ceil(0.75f * f);
        this.a.r = (int) Math.ceil(f * 0.25f);
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.InterfaceC0520qq
    public boolean onStateChange(int[] iArr) {
        boolean z = m(iArr) || n();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0173fi c0173fi = this.a;
        if (c0173fi.l != i) {
            c0173fi.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.Ao
    public final void setShapeAppearanceModel(C0487po c0487po) {
        this.a.a = c0487po;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.f = colorStateList;
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0173fi c0173fi = this.a;
        if (c0173fi.g != mode) {
            c0173fi.g = mode;
            n();
            super.invalidateSelf();
        }
    }

    public C0204gi(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C0487po.b(context, attributeSet, i, i2).a());
    }

    public C0204gi(C0487po c0487po) {
        this(new C0173fi(c0487po));
    }

    public C0204gi(C0173fi c0173fi) {
        C0548ro c0548ro;
        this.b = new AbstractC0765yo[4];
        this.c = new AbstractC0765yo[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new C0425no();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0548ro = AbstractC0518qo.a;
        } else {
            c0548ro = new C0548ro();
        }
        this.r = c0548ro;
        this.u = new RectF();
        this.v = true;
        this.a = c0173fi;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n();
        m(getState());
        this.q = new C0308k0(this, 27);
    }
}
