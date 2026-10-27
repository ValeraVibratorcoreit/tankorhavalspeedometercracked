package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0487po {
    public F4 a = new C0147en();
    public F4 b = new C0147en();
    public F4 c = new C0147en();
    public F4 d = new C0147en();
    public R7 e = new C0247i(0.0f);
    public R7 f = new C0247i(0.0f);
    public R7 g = new C0247i(0.0f);
    public R7 h = new C0247i(0.0f);
    public C0473pa i = new C0473pa(0);
    public C0473pa j = new C0473pa(0);
    public C0473pa k = new C0473pa(0);
    public C0473pa l = new C0473pa(0);

    public static C0456oo a(Context context, int i, int i2, C0247i c0247i) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0638ul.x);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            R7 r7C = c(typedArrayObtainStyledAttributes, 5, c0247i);
            R7 r7C2 = c(typedArrayObtainStyledAttributes, 8, r7C);
            R7 r7C3 = c(typedArrayObtainStyledAttributes, 9, r7C);
            R7 r7C4 = c(typedArrayObtainStyledAttributes, 7, r7C);
            R7 r7C5 = c(typedArrayObtainStyledAttributes, 6, r7C);
            C0456oo c0456oo = new C0456oo();
            F4 f4P = F4.p(i4);
            c0456oo.a = f4P;
            C0456oo.b(f4P);
            c0456oo.e = r7C2;
            F4 f4P2 = F4.p(i5);
            c0456oo.b = f4P2;
            C0456oo.b(f4P2);
            c0456oo.f = r7C3;
            F4 f4P3 = F4.p(i6);
            c0456oo.c = f4P3;
            C0456oo.b(f4P3);
            c0456oo.g = r7C4;
            F4 f4P4 = F4.p(i7);
            c0456oo.d = f4P4;
            C0456oo.b(f4P4);
            c0456oo.h = r7C5;
            return c0456oo;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static C0456oo b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0247i c0247i = new C0247i(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.r, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c0247i);
    }

    public static R7 c(TypedArray typedArray, int i, R7 r7) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return r7;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new C0247i(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C0608tm(typedValuePeekValue.getFraction(1.0f, 1.0f)) : r7;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(C0473pa.class) && this.j.getClass().equals(C0473pa.class) && this.i.getClass().equals(C0473pa.class) && this.k.getClass().equals(C0473pa.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof C0147en) && (this.a instanceof C0147en) && (this.c instanceof C0147en) && (this.d instanceof C0147en));
    }

    public final C0456oo e() {
        C0456oo c0456oo = new C0456oo();
        c0456oo.a = this.a;
        c0456oo.b = this.b;
        c0456oo.c = this.c;
        c0456oo.d = this.d;
        c0456oo.e = this.e;
        c0456oo.f = this.f;
        c0456oo.g = this.g;
        c0456oo.h = this.h;
        c0456oo.i = this.i;
        c0456oo.j = this.j;
        c0456oo.k = this.k;
        c0456oo.l = this.l;
        return c0456oo;
    }
}
