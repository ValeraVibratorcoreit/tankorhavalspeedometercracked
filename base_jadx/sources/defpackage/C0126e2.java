package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0126e2 extends RadioButton implements Mq {
    public final C0711x1 a;
    public final C0556s1 b;
    public final C0774z2 c;
    public X1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0126e2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        Kq.a(context);
        Cq.a(this, getContext());
        C0711x1 c0711x1 = new C0711x1(this);
        this.a = c0711x1;
        c0711x1.e(attributeSet, R.attr.radioButtonStyle);
        C0556s1 c0556s1 = new C0556s1(this);
        this.b = c0556s1;
        c0556s1.d(attributeSet, R.attr.radioButtonStyle);
        C0774z2 c0774z2 = new C0774z2(this);
        this.c = c0774z2;
        c0774z2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private X1 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new X1(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            c0556s1.a();
        }
        C0774z2 c0774z2 = this.c;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            return c0556s1.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            return c0556s1.c();
        }
        return null;
    }

    @Override // defpackage.Mq
    public ColorStateList getSupportButtonTintList() {
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            return (ColorStateList) c0711x1.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            return (PorterDuff.Mode) c0711x1.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            c0556s1.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            c0556s1.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            if (c0711x1.e) {
                c0711x1.e = false;
            } else {
                c0711x1.e = true;
                c0711x1.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0774z2 c0774z2 = this.c;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0774z2 c0774z2 = this.c;
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
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            c0556s1.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            c0556s1.i(mode);
        }
    }

    @Override // defpackage.Mq
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            c0711x1.a = colorStateList;
            c0711x1.c = true;
            c0711x1.a();
        }
    }

    @Override // defpackage.Mq
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            c0711x1.b = mode;
            c0711x1.d = true;
            c0711x1.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0774z2 c0774z2 = this.c;
        c0774z2.i(colorStateList);
        c0774z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0774z2 c0774z2 = this.c;
        c0774z2.j(mode);
        c0774z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(F4.F(getContext(), i));
    }
}
