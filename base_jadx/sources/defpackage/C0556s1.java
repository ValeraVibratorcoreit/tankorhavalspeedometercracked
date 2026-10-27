package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0556s1 {
    public final View a;
    public W6 d;
    public W6 e;
    public W6 f;
    public int c = -1;
    public final U1 b = U1.a();

    public C0556s1(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new W6();
                }
                W6 w6 = this.f;
                w6.c = null;
                w6.b = false;
                w6.d = null;
                w6.a = false;
                WeakHashMap weakHashMap = Gs.a;
                ColorStateList colorStateListG = AbstractC0676vs.g(view);
                if (colorStateListG != null) {
                    w6.b = true;
                    w6.c = colorStateListG;
                }
                PorterDuff.Mode modeH = AbstractC0676vs.h(view);
                if (modeH != null) {
                    w6.a = true;
                    w6.d = modeH;
                }
                if (w6.b || w6.a) {
                    U1.d(background, w6, view.getDrawableState());
                    return;
                }
            }
            W6 w7 = this.e;
            if (w7 != null) {
                U1.d(background, w7, view.getDrawableState());
                return;
            }
            W6 w8 = this.d;
            if (w8 != null) {
                U1.d(background, w8, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        W6 w6 = this.e;
        if (w6 != null) {
            return (ColorStateList) w6.c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        W6 w6 = this.e;
        if (w6 != null) {
            return (PorterDuff.Mode) w6.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListH;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = AbstractC0700wl.z;
        K2 k2G = K2.G(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) k2G.b;
        View view2 = this.a;
        Gs.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) k2G.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                U1 u1 = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (u1) {
                    colorStateListH = u1.a.h(context2, i2);
                }
                if (colorStateListH != null) {
                    g(colorStateListH);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0676vs.q(view, k2G.p(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0676vs.r(view, W9.c(typedArray.getInt(2, -1), null));
            }
            k2G.J();
        } catch (Throwable th) {
            k2G.J();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListH;
        this.c = i;
        U1 u1 = this.b;
        if (u1 != null) {
            Context context = this.a.getContext();
            synchronized (u1) {
                colorStateListH = u1.a.h(context, i);
            }
        } else {
            colorStateListH = null;
        }
        g(colorStateListH);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new W6();
            }
            W6 w6 = this.d;
            w6.c = colorStateList;
            w6.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new W6();
        }
        W6 w6 = this.e;
        w6.c = colorStateList;
        w6.b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new W6();
        }
        W6 w6 = this.e;
        w6.d = mode;
        w6.a = true;
        a();
    }
}
