package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Qh {
    public final MaterialButton a;
    public C0487po b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public C0204gi m;
    public boolean q;
    public RippleDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    public Qh(MaterialButton materialButton, C0487po c0487po) {
        this.a = materialButton;
        this.b = c0487po;
    }

    public final Ao a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (Ao) this.s.getDrawable(2) : (Ao) this.s.getDrawable(1);
    }

    public final C0204gi b(boolean z) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0204gi) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void c(C0487po c0487po) {
        this.b = c0487po;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(c0487po);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(c0487po);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(c0487po);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = Gs.a;
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        C0204gi c0204gi = new C0204gi(this.b);
        MaterialButton materialButton = this.a;
        c0204gi.j(materialButton.getContext());
        O9.h(c0204gi, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            O9.i(c0204gi, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        c0204gi.a.k = f;
        c0204gi.invalidateSelf();
        C0173fi c0173fi = c0204gi.a;
        if (c0173fi.d != colorStateList) {
            c0173fi.d = colorStateList;
            c0204gi.onStateChange(c0204gi.getState());
        }
        C0204gi c0204gi2 = new C0204gi(this.b);
        c0204gi2.setTint(0);
        float f2 = this.h;
        int iJ = this.n ? AbstractC0390mk.j(materialButton, R.attr.colorSurface) : 0;
        c0204gi2.a.k = f2;
        c0204gi2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iJ);
        C0173fi c0173fi2 = c0204gi2.a;
        if (c0173fi2.d != colorStateListValueOf) {
            c0173fi2.d = colorStateListValueOf;
            c0204gi2.onStateChange(c0204gi2.getState());
        }
        C0204gi c0204gi3 = new C0204gi(this.b);
        this.m = c0204gi3;
        O9.g(c0204gi3, -1);
        ColorStateList colorStateListValueOf2 = this.l;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0204gi2, c0204gi}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0204gi c0204giB = b(false);
        if (c0204giB != null) {
            c0204giB.k(this.t);
            c0204giB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        C0204gi c0204giB = b(false);
        C0204gi c0204giB2 = b(true);
        if (c0204giB != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            c0204giB.a.k = f;
            c0204giB.invalidateSelf();
            C0173fi c0173fi = c0204giB.a;
            if (c0173fi.d != colorStateList) {
                c0173fi.d = colorStateList;
                c0204giB.onStateChange(c0204giB.getState());
            }
            if (c0204giB2 != null) {
                float f2 = this.h;
                int iJ = this.n ? AbstractC0390mk.j(this.a, R.attr.colorSurface) : 0;
                c0204giB2.a.k = f2;
                c0204giB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iJ);
                C0173fi c0173fi2 = c0204giB2.a;
                if (c0173fi2.d != colorStateListValueOf) {
                    c0173fi2.d = colorStateListValueOf;
                    c0204giB2.onStateChange(c0204giB2.getState());
                }
            }
        }
    }
}
