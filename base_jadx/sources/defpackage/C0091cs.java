package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0091cs extends Tr {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public C0029as b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public C0091cs() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        C0029as c0029as = new C0029as();
        c0029as.c = null;
        c0029as.d = j;
        c0029as.b = new Zr();
        this.b = c0029as;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        O9.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && P9.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0029as c0029as = this.b;
        Bitmap bitmap = c0029as.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c0029as.f.getHeight()) {
            c0029as.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c0029as.k = true;
        }
        if (this.f) {
            C0029as c0029as2 = this.b;
            if (c0029as2.k || c0029as2.g != c0029as2.c || c0029as2.h != c0029as2.d || c0029as2.j != c0029as2.e || c0029as2.i != c0029as2.b.getRootAlpha()) {
                C0029as c0029as3 = this.b;
                c0029as3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0029as3.f);
                Zr zr = c0029as3.b;
                zr.a(zr.g, Zr.p, canvas2, iMin, iMin2);
                C0029as c0029as4 = this.b;
                c0029as4.g = c0029as4.c;
                c0029as4.h = c0029as4.d;
                c0029as4.i = c0029as4.b.getRootAlpha();
                c0029as4.j = c0029as4.e;
                c0029as4.k = false;
            }
        } else {
            C0029as c0029as5 = this.b;
            c0029as5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0029as5.f);
            Zr zr2 = c0029as5.b;
            zr2.a(zr2.g, Zr.p, canvas3, iMin, iMin2);
        }
        C0029as c0029as6 = this.b;
        if (c0029as6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0029as6.l == null) {
                Paint paint2 = new Paint();
                c0029as6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0029as6.l.setAlpha(c0029as6.b.getRootAlpha());
            c0029as6.l.setColorFilter(colorFilter);
            paint = c0029as6.l;
        }
        canvas.drawBitmap(c0029as6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? O9.c(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) {
            return new C0060bs(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0029as c0029as = this.b;
            if (c0029as != null) {
                Zr zr = c0029as.b;
                if (zr.n == null) {
                    zr.n = Boolean.valueOf(zr.g.a());
                }
                if (zr.n.booleanValue() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            C0029as c0029as = this.b;
            C0029as c0029as2 = new C0029as();
            c0029as2.c = null;
            c0029as2.d = j;
            if (c0029as != null) {
                c0029as2.a = c0029as.a;
                Zr zr = new Zr(c0029as.b);
                c0029as2.b = zr;
                if (c0029as.b.e != null) {
                    zr.e = new Paint(c0029as.b.e);
                }
                if (c0029as.b.d != null) {
                    c0029as2.b.d = new Paint(c0029as.b.d);
                }
                c0029as2.c = c0029as.c;
                c0029as2.d = c0029as.d;
                c0029as2.e = c0029as.e;
            }
            this.b = c0029as2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0029as c0029as = this.b;
        ColorStateList colorStateList = c0029as.c;
        if (colorStateList == null || (mode = c0029as.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        Zr zr = c0029as.b;
        if (zr.n == null) {
            zr.n = Boolean.valueOf(zr.g.a());
        }
        if (zr.n.booleanValue()) {
            boolean zB = c0029as.b.g.b(iArr);
            c0029as.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            Ud.g0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            O9.h(drawable, colorStateList);
            return;
        }
        C0029as c0029as = this.b;
        if (c0029as.c != colorStateList) {
            c0029as.c = colorStateList;
            this.c = a(colorStateList, c0029as.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            O9.i(drawable, mode);
            return;
        }
        C0029as c0029as = this.b;
        if (c0029as.d != mode) {
            c0029as.d = mode;
            this.c = a(c0029as.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Zr zr;
        int i;
        boolean z;
        char c;
        int i2;
        Paint.Cap cap;
        Drawable drawable = this.a;
        if (drawable != null) {
            O9.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0029as c0029as = this.b;
        c0029as.b = new Zr();
        TypedArray typedArrayJ = Br.J(resources, theme, attributeSet, F4.a);
        C0029as c0029as2 = this.b;
        Zr zr2 = c0029as2.b;
        int i3 = !Br.E(xmlPullParser, "tintMode") ? -1 : typedArrayJ.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i4 = 3;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0029as2.d = mode;
        int i5 = 1;
        ColorStateList colorStateListA = null;
        boolean z2 = false;
        if (Br.E(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayJ.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 >= 28 && i6 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayJ.getResources();
                int resourceId = typedArrayJ.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0716x6.a;
                try {
                    colorStateListA = AbstractC0716x6.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            c0029as2.c = colorStateList;
        }
        boolean z3 = c0029as2.e;
        if (Br.E(xmlPullParser, "autoMirrored")) {
            z3 = typedArrayJ.getBoolean(5, z3);
        }
        c0029as2.e = z3;
        float f = zr2.j;
        if (Br.E(xmlPullParser, "viewportWidth")) {
            f = typedArrayJ.getFloat(7, f);
        }
        zr2.j = f;
        float f2 = zr2.k;
        if (Br.E(xmlPullParser, "viewportHeight")) {
            f2 = typedArrayJ.getFloat(8, f2);
        }
        zr2.k = f2;
        if (zr2.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayJ.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            zr2.h = typedArrayJ.getDimension(3, zr2.h);
            float dimension = typedArrayJ.getDimension(2, zr2.i);
            zr2.i = dimension;
            if (zr2.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayJ.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = zr2.getAlpha();
                if (Br.E(xmlPullParser, "alpha")) {
                    alpha = typedArrayJ.getFloat(4, alpha);
                }
                zr2.setAlpha(alpha);
                String string = typedArrayJ.getString(0);
                if (string != null) {
                    zr2.m = string;
                    zr2.o.put(string, zr2);
                }
                typedArrayJ.recycle();
                c0029as.a = getChangingConfigurations();
                c0029as.k = true;
                C0029as c0029as3 = this.b;
                Zr zr3 = c0029as3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(zr3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                while (eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i4)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        Wr wr = (Wr) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        C0066c3 c0066c3 = zr3.o;
                        zr = zr3;
                        if (zEquals) {
                            Vr vr = new Vr();
                            vr.f = 0.0f;
                            vr.h = 1.0f;
                            vr.i = 1.0f;
                            vr.j = 0.0f;
                            vr.k = 1.0f;
                            vr.l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            vr.m = cap2;
                            Paint.Join join = Paint.Join.MITER;
                            vr.n = join;
                            i = depth;
                            vr.o = 4.0f;
                            TypedArray typedArrayJ2 = Br.J(resources, theme, attributeSet, F4.c);
                            if (Br.E(xmlPullParser, "pathData")) {
                                String string2 = typedArrayJ2.getString(0);
                                if (string2 != null) {
                                    vr.b = string2;
                                }
                                String string3 = typedArrayJ2.getString(2);
                                if (string3 != null) {
                                    vr.a = F4.t(string3);
                                }
                                vr.g = Br.z(typedArrayJ2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = vr.i;
                                if (Br.E(xmlPullParser, "fillAlpha")) {
                                    f3 = typedArrayJ2.getFloat(12, f3);
                                }
                                vr.i = f3;
                                int i7 = !Br.E(xmlPullParser, "strokeLineCap") ? -1 : typedArrayJ2.getInt(8, -1);
                                Paint.Cap cap3 = vr.m;
                                if (i7 == 0) {
                                    cap = cap2;
                                } else if (i7 != 1) {
                                    cap = i7 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                vr.m = cap;
                                int i8 = !Br.E(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayJ2.getInt(9, -1);
                                Paint.Join join2 = vr.n;
                                if (i8 != 0) {
                                    if (i8 != 1) {
                                        join = i8 != 2 ? join2 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                }
                                vr.n = join;
                                float f4 = vr.o;
                                if (Br.E(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = typedArrayJ2.getFloat(10, f4);
                                }
                                vr.o = f4;
                                vr.e = Br.z(typedArrayJ2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = vr.h;
                                if (Br.E(xmlPullParser, "strokeAlpha")) {
                                    f5 = typedArrayJ2.getFloat(11, f5);
                                }
                                vr.h = f5;
                                float f6 = vr.f;
                                if (Br.E(xmlPullParser, "strokeWidth")) {
                                    f6 = typedArrayJ2.getFloat(4, f6);
                                }
                                vr.f = f6;
                                float f7 = vr.k;
                                if (Br.E(xmlPullParser, "trimPathEnd")) {
                                    f7 = typedArrayJ2.getFloat(6, f7);
                                }
                                vr.k = f7;
                                float f8 = vr.l;
                                if (Br.E(xmlPullParser, "trimPathOffset")) {
                                    f8 = typedArrayJ2.getFloat(7, f8);
                                }
                                vr.l = f8;
                                float f9 = vr.j;
                                if (Br.E(xmlPullParser, "trimPathStart")) {
                                    f9 = typedArrayJ2.getFloat(5, f9);
                                }
                                vr.j = f9;
                                int i9 = vr.c;
                                if (Br.E(xmlPullParser, "fillType")) {
                                    i9 = typedArrayJ2.getInt(13, i9);
                                }
                                vr.c = i9;
                            }
                            typedArrayJ2.recycle();
                            wr.b.add(vr);
                            if (vr.getPathName() != null) {
                                c0066c3.put(vr.getPathName(), vr);
                            }
                            c0029as3.a |= vr.d;
                            z = false;
                            c = '\b';
                            z4 = false;
                        } else {
                            i = depth;
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                Ur ur = new Ur();
                                if (Br.E(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayJ3 = Br.J(resources, theme, attributeSet, F4.d);
                                    String string4 = typedArrayJ3.getString(0);
                                    if (string4 != null) {
                                        ur.b = string4;
                                    }
                                    String string5 = typedArrayJ3.getString(1);
                                    if (string5 != null) {
                                        ur.a = F4.t(string5);
                                    }
                                    ur.c = !Br.E(xmlPullParser, "fillType") ? 0 : typedArrayJ3.getInt(2, 0);
                                    typedArrayJ3.recycle();
                                }
                                wr.b.add(ur);
                                if (ur.getPathName() != null) {
                                    c0066c3.put(ur.getPathName(), ur);
                                }
                                c0029as3.a |= ur.d;
                            } else if ("group".equals(name)) {
                                Wr wr2 = new Wr();
                                TypedArray typedArrayJ4 = Br.J(resources, theme, attributeSet, F4.b);
                                float f10 = wr2.c;
                                if (Br.E(xmlPullParser, "rotation")) {
                                    f10 = typedArrayJ4.getFloat(5, f10);
                                }
                                wr2.c = f10;
                                wr2.d = typedArrayJ4.getFloat(1, wr2.d);
                                wr2.e = typedArrayJ4.getFloat(2, wr2.e);
                                float f11 = wr2.f;
                                if (Br.E(xmlPullParser, "scaleX")) {
                                    f11 = typedArrayJ4.getFloat(3, f11);
                                }
                                wr2.f = f11;
                                float f12 = wr2.g;
                                if (Br.E(xmlPullParser, "scaleY")) {
                                    f12 = typedArrayJ4.getFloat(4, f12);
                                }
                                wr2.g = f12;
                                float f13 = wr2.h;
                                if (Br.E(xmlPullParser, "translateX")) {
                                    f13 = typedArrayJ4.getFloat(6, f13);
                                }
                                wr2.h = f13;
                                float f14 = wr2.i;
                                if (Br.E(xmlPullParser, "translateY")) {
                                    f14 = typedArrayJ4.getFloat(7, f14);
                                }
                                wr2.i = f14;
                                z = false;
                                String string6 = typedArrayJ4.getString(0);
                                if (string6 != null) {
                                    wr2.l = string6;
                                }
                                wr2.c();
                                typedArrayJ4.recycle();
                                wr.b.add(wr2);
                                arrayDeque.push(wr2);
                                if (wr2.getGroupName() != null) {
                                    c0066c3.put(wr2.getGroupName(), wr2);
                                }
                                c0029as3.a = wr2.k | c0029as3.a;
                            }
                            z = false;
                        }
                        i4 = 3;
                        i2 = 1;
                    } else {
                        zr = zr3;
                        i = depth;
                        z = z2;
                        c = '\b';
                        i2 = i5;
                        i4 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i2;
                    zr3 = zr;
                    z2 = z;
                    depth = i;
                }
                if (!z4) {
                    this.c = a(c0029as.c, c0029as.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayJ.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayJ.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0091cs(C0029as c0029as) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = c0029as;
        this.c = a(c0029as.c, c0029as.d);
    }
}
