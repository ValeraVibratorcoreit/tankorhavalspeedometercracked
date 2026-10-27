package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0680w1 extends CheckedTextView {
    public final C0711x1 a;
    public final C0556s1 b;
    public final C0774z2 c;
    public X1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0680w1(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        Kq.a(context);
        Cq.a(this, getContext());
        C0774z2 c0774z2 = new C0774z2(this);
        this.c = c0774z2;
        c0774z2.f(attributeSet, R.attr.checkedTextViewStyle);
        c0774z2.b();
        C0556s1 c0556s1 = new C0556s1(this);
        this.b = c0556s1;
        c0556s1.d(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new C0711x1(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0700wl.l;
        K2 k2G = K2.G(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = (TypedArray) k2G.b;
        Gs.i(this, getContext(), iArr, attributeSet, (TypedArray) k2G.b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(F4.F(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(F4.F(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(F4.F(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(k2G.p(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(W9.c(typedArray.getInt(3, -1), null));
            }
            k2G.J();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            k2G.J();
            throw th;
        }
    }

    private X1 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new X1(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0774z2 c0774z2 = this.c;
        if (c0774z2 != null) {
            c0774z2.b();
        }
        C0556s1 c0556s1 = this.b;
        if (c0556s1 != null) {
            c0556s1.a();
        }
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            c0711x1.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
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

    public ColorStateList getSupportCheckMarkTintList() {
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            return (ColorStateList) c0711x1.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Br.L(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            if (c0711x1.e) {
                c0711x1.e = false;
            } else {
                c0711x1.e = true;
                c0711x1.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            c0711x1.a = colorStateList;
            c0711x1.c = true;
            c0711x1.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0711x1 c0711x1 = this.a;
        if (c0711x1 != null) {
            c0711x1.b = mode;
            c0711x1.d = true;
            c0711x1.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0774z2 c0774z2 = this.c;
        if (c0774z2 != null) {
            c0774z2.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(F4.F(getContext(), i));
    }
}
