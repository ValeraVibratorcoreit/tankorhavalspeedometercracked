package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: renamed from: t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0587t1 extends Button {
    public final C0556s1 a;
    public final C0774z2 b;
    public X1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0587t1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Kq.a(context);
        Cq.a(this, getContext());
        C0556s1 c0556s1 = new C0556s1(this);
        this.a = c0556s1;
        c0556s1.d(attributeSet, i);
        C0774z2 c0774z2 = new C0774z2(this);
        this.b = c0774z2;
        c0774z2.f(attributeSet, i);
        c0774z2.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private X1 getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new X1(this);
        }
        return this.c;
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
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.a.setAllCaps(z);
        }
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
