package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public final class H2 extends ToggleButton {
    public final C0556s1 a;
    public final C0774z2 b;
    public X1 c;

    public H2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        Cq.a(this, getContext());
        C0556s1 c0556s1 = new C0556s1(this);
        this.a = c0556s1;
        c0556s1.d(attributeSet, R.attr.buttonStyleToggle);
        C0774z2 c0774z2 = new C0774z2(this);
        this.b = c0774z2;
        c0774z2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private X1 getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new X1(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.a();
        }
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            return c0556s1.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            return c0556s1.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0774z2 c0774z2 = this.b;
        c0774z2.i(colorStateList);
        c0774z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0774z2 c0774z2 = this.b;
        c0774z2.j(mode);
        c0774z2.b();
    }
}
