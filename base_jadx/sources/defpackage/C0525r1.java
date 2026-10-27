package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0525r1 extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};
    public final C0556s1 a;
    public final C0774z2 b;
    public final C0096d2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525r1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.autoCompleteTextViewStyle);
        Kq.a(context);
        Cq.a(this, getContext());
        K2 k2G = K2.G(getContext(), attributeSet, d, ru.zinovin.tankspeedometer.R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) k2G.b).hasValue(0)) {
            setDropDownBackgroundDrawable(k2G.q(0));
        }
        k2G.J();
        C0556s1 c0556s1 = new C0556s1(this);
        this.a = c0556s1;
        c0556s1.d(attributeSet, ru.zinovin.tankspeedometer.R.attr.autoCompleteTextViewStyle);
        C0774z2 c0774z2 = new C0774z2(this);
        this.b = c0774z2;
        c0774z2.f(attributeSet, ru.zinovin.tankspeedometer.R.attr.autoCompleteTextViewStyle);
        c0774z2.b();
        C0096d2 c0096d2 = new C0096d2(this, 3);
        this.c = c0096d2;
        c0096d2.O(attributeSet, ru.zinovin.tankspeedometer.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerI = c0096d2.I(keyListener);
            if (keyListenerI == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerI);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Br.L(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.c.Q(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(F4.F(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.W(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.I(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.g(context, i);
        }
    }
}
