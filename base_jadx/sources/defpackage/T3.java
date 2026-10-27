package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class T3 extends Drawable implements InterfaceC0520qq {
    public final WeakReference a;
    public final C0204gi b;
    public final C0550rq c;
    public final Rect d;
    public final V3 e;
    public float f;
    public float g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public WeakReference l;
    public WeakReference m;

    public T3(Context context) {
        C0458oq c0458oq;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        AbstractC0390mk.d(context, AbstractC0390mk.i, "Theme.MaterialComponents");
        this.d = new Rect();
        C0550rq c0550rq = new C0550rq(this);
        this.c = c0550rq;
        TextPaint textPaint = c0550rq.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        V3 v3 = new V3(context);
        this.e = v3;
        boolean zE = e();
        U3 u3 = v3.b;
        C0204gi c0204gi = new C0204gi(C0487po.a(context, zE ? u3.g.intValue() : u3.e.intValue(), e() ? u3.h.intValue() : u3.f.intValue(), new C0247i(0)).a());
        this.b = c0204gi;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c0550rq.g != (c0458oq = new C0458oq(context2, u3.d.intValue()))) {
            c0550rq.b(c0458oq, context2);
            textPaint.setColor(u3.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = u3.l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.h = u3.m;
        }
        c0550rq.e = true;
        i();
        invalidateSelf();
        c0550rq.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(u3.b.intValue());
        if (c0204gi.a.c != colorStateListValueOf) {
            c0204gi.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(u3.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(u3.t.booleanValue(), false);
    }

    @Override // defpackage.InterfaceC0520qq
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        V3 v3 = this.e;
        U3 u3 = v3.b;
        String str = u3.j;
        boolean z = str != null;
        WeakReference weakReference = this.a;
        if (z) {
            int i = u3.l;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i2 = this.h;
        U3 u4 = v3.b;
        if (i2 == -2 || d() <= this.h) {
            return NumberFormat.getInstance(u4.n).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(u4.n, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.h), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.e.b.k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        C0550rq c0550rq = this.c;
        c0550rq.a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.g - rect.exactCenterY();
        canvas.drawText(strB, this.f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), c0550rq.a);
    }

    public final boolean e() {
        return this.e.b.j != null || f();
    }

    public final boolean f() {
        U3 u3 = this.e.b;
        return u3.j == null && u3.k != -1;
    }

    public final void g() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        V3 v3 = this.e;
        this.b.setShapeAppearanceModel(C0487po.a(context, zE ? v3.b.g.intValue() : v3.b.e.intValue(), e() ? v3.b.h.intValue() : v3.b.f.intValue(), new C0247i(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0220  */
    /* JADX WARN: Code duplicated, block: B:102:0x0238  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:106:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x025e  */
    /* JADX WARN: Code duplicated, block: B:112:0x026b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0278  */
    /* JADX WARN: Code duplicated, block: B:118:0x0285  */
    public final void i() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        float f2;
        WeakReference weakReference = this.a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.m;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zE = e();
        V3 v3 = this.e;
        float f3 = zE ? v3.d : v3.c;
        this.i = f3;
        if (f3 != -1.0f) {
            this.j = f3;
            this.k = f3;
        } else {
            this.j = Math.round((e() ? v3.g : v3.e) / 2.0f);
            this.k = Math.round((e() ? v3.h : v3.f) / 2.0f);
        }
        if (e()) {
            String strB = b();
            float f4 = this.j;
            C0550rq c0550rq = this.c;
            if (c0550rq.e) {
                c0550rq.a(strB);
                f = c0550rq.c;
            } else {
                f = c0550rq.c;
            }
            this.j = Math.max(f4, (f / 2.0f) + v3.b.u.intValue());
            float f5 = this.k;
            if (c0550rq.e) {
                c0550rq.a(strB);
                f2 = c0550rq.d;
            } else {
                f2 = c0550rq.d;
            }
            float fMax = Math.max(f5, (f2 / 2.0f) + v3.b.v.intValue());
            this.k = fMax;
            this.j = Math.max(this.j, fMax);
        }
        int iIntValue = v3.b.x.intValue();
        boolean zE2 = e();
        U3 u3 = v3.b;
        if (zE2) {
            iIntValue = u3.z.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC0340l1.c(iIntValue, iIntValue - u3.C.intValue(), AbstractC0340l1.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        int i = v3.k;
        if (i == 0) {
            iIntValue -= Math.round(this.k);
        }
        int iIntValue2 = u3.B.intValue() + iIntValue;
        int iIntValue3 = u3.s.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.g = rect3.bottom - iIntValue2;
        } else {
            this.g = rect3.top + iIntValue2;
        }
        int iIntValue4 = e() ? u3.y.intValue() : u3.w.intValue();
        if (i == 1) {
            iIntValue4 += e() ? v3.j : v3.i;
        }
        int iIntValue5 = u3.A.intValue() + iIntValue4;
        int iIntValue6 = u3.s.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = Gs.a;
            this.f = view.getLayoutDirection() == 0 ? (rect3.left - this.j) + iIntValue5 : (rect3.right + this.j) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = Gs.a;
            this.f = view.getLayoutDirection() == 0 ? (rect3.right + this.j) - iIntValue5 : (rect3.left - this.j) + iIntValue5;
        }
        if (u3.D.booleanValue()) {
            View viewC = c();
            if (viewC != null) {
                FrameLayout frameLayoutC = c();
                if (frameLayoutC == null || frameLayoutC.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewC.getParent() instanceof View) {
                    y = viewC.getY();
                    x = viewC.getX();
                    viewC = (View) viewC.getParent();
                }
                y2 = viewC.getY() + (this.g - this.k) + y;
                x2 = viewC.getX() + (this.f - this.j) + x;
                if (viewC.getParent() instanceof View) {
                    height = ((this.g + this.k) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.f + this.j) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.g = Math.abs(y2) + this.g;
                }
                if (x2 < 0.0f) {
                    this.f = Math.abs(x2) + this.f;
                }
                if (height > 0.0f) {
                    this.g -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewC = view2;
                y2 = viewC.getY() + (this.g - this.k) + y;
                x2 = viewC.getX() + (this.f - this.j) + x;
                if (viewC.getParent() instanceof View) {
                    height = ((this.g + this.k) - (((View) viewC.getParent()).getHeight() - viewC.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewC.getParent() instanceof View) {
                    width = ((this.f + this.j) - (((View) viewC.getParent()).getWidth() - viewC.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.g = Math.abs(y2) + this.g;
                }
                if (x2 < 0.0f) {
                    this.f = Math.abs(x2) + this.f;
                }
                if (height > 0.0f) {
                    this.g -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f -= Math.abs(width);
                }
            }
        }
        float f6 = this.f;
        float f7 = this.g;
        float f8 = this.j;
        float f9 = this.k;
        rect2.set((int) (f6 - f8), (int) (f7 - f9), (int) (f6 + f8), (int) (f7 + f9));
        float f10 = this.i;
        C0204gi c0204gi = this.b;
        if (f10 != -1.0f) {
            C0456oo c0456ooE = c0204gi.a.a.e();
            c0456ooE.e = new C0247i(f10);
            c0456ooE.f = new C0247i(f10);
            c0456ooE.g = new C0247i(f10);
            c0456ooE.h = new C0247i(f10);
            c0204gi.setShapeAppearanceModel(c0456ooE.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c0204gi.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.InterfaceC0520qq
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        V3 v3 = this.e;
        v3.a.i = i;
        v3.b.i = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
