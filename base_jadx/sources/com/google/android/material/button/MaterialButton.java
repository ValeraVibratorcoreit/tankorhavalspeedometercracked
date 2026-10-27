package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0638ul;
import defpackage.Ao;
import defpackage.Br;
import defpackage.C0247i;
import defpackage.C0308k0;
import defpackage.C0456oo;
import defpackage.C0487po;
import defpackage.C0587t1;
import defpackage.F4;
import defpackage.Gs;
import defpackage.O9;
import defpackage.Oh;
import defpackage.Ph;
import defpackage.Qh;
import defpackage.Td;
import defpackage.Tf;
import defpackage.Vo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0587t1 implements Checkable, Ao {
    public static final int[] r = {R.attr.state_checkable};
    public static final int[] s = {R.attr.state_checked};
    public final Qh d;
    public final LinkedHashSet e;
    public Oh f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(Td.Q(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.materialButtonStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Button), attributeSet, ru.zinovin.tankspeedometer.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        this.o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray typedArrayZ = AbstractC0390mk.z(context2, attributeSet, AbstractC0638ul.l, ru.zinovin.tankspeedometer.R.attr.materialButtonStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.n = typedArrayZ.getDimensionPixelSize(12, 0);
        int i = typedArrayZ.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = Tf.P(i, mode);
        this.h = Br.u(getContext(), typedArrayZ, 14);
        this.i = Br.x(getContext(), typedArrayZ, 10);
        this.q = typedArrayZ.getInteger(11, 1);
        this.k = typedArrayZ.getDimensionPixelSize(13, 0);
        Qh qh = new Qh(this, C0487po.b(context2, attributeSet, ru.zinovin.tankspeedometer.R.attr.materialButtonStyle, ru.zinovin.tankspeedometer.R.style.Widget_MaterialComponents_Button).a());
        this.d = qh;
        qh.c = typedArrayZ.getDimensionPixelOffset(1, 0);
        qh.d = typedArrayZ.getDimensionPixelOffset(2, 0);
        qh.e = typedArrayZ.getDimensionPixelOffset(3, 0);
        qh.f = typedArrayZ.getDimensionPixelOffset(4, 0);
        if (typedArrayZ.hasValue(8)) {
            int dimensionPixelSize = typedArrayZ.getDimensionPixelSize(8, -1);
            qh.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C0456oo c0456ooE = qh.b.e();
            c0456ooE.e = new C0247i(f);
            c0456ooE.f = new C0247i(f);
            c0456ooE.g = new C0247i(f);
            c0456ooE.h = new C0247i(f);
            qh.c(c0456ooE.a());
            qh.p = true;
        }
        qh.h = typedArrayZ.getDimensionPixelSize(20, 0);
        qh.i = Tf.P(typedArrayZ.getInt(7, -1), mode);
        qh.j = Br.u(getContext(), typedArrayZ, 6);
        qh.k = Br.u(getContext(), typedArrayZ, 19);
        qh.l = Br.u(getContext(), typedArrayZ, 16);
        qh.q = typedArrayZ.getBoolean(5, false);
        qh.t = typedArrayZ.getDimensionPixelSize(9, 0);
        qh.r = typedArrayZ.getBoolean(21, true);
        WeakHashMap weakHashMap = Gs.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayZ.hasValue(0)) {
            qh.o = true;
            setSupportBackgroundTintList(qh.j);
            setSupportBackgroundTintMode(qh.i);
        } else {
            qh.e();
        }
        setPaddingRelative(paddingStart + qh.c, paddingTop + qh.e, paddingEnd + qh.d, paddingBottom + qh.f);
        typedArrayZ.recycle();
        setCompoundDrawablePadding(this.n);
        d(this.i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        Qh qh = this.d;
        return qh != null && qh.q;
    }

    public final boolean b() {
        Qh qh = this.d;
        return (qh == null || qh.o) ? false : true;
    }

    public final void c() {
        int i = this.q;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            O9.h(drawableMutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                O9.i(this.i, mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.l;
            int i2 = this.m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.i) || (((i3 == 3 || i3 == 4) && drawable5 != this.i) || ((i3 == 16 || i3 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.l = 0;
                if (i3 == 16) {
                    this.m = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.n) - getPaddingBottom()) / 2);
                if (this.m != iMax) {
                    this.m = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = Gs.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.l != paddingEnd) {
            this.l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.j;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.l;
        }
        return null;
    }

    public C0487po getShapeAppearanceModel() {
        if (b()) {
            return this.d.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // defpackage.C0587t1
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.j : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.C0587t1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            F4.a0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.C0587t1, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.o);
    }

    @Override // defpackage.C0587t1, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.C0587t1, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Ph)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Ph ph = (Ph) parcelable;
        super.onRestoreInstanceState(ph.a);
        setChecked(ph.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Ph ph = new Ph(super.onSaveInstanceState());
        ph.c = this.o;
        return ph;
    }

    @Override // defpackage.C0587t1, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        Qh qh = this.d;
        if (qh.b(false) != null) {
            qh.b(false).setTint(i);
        }
    }

    @Override // defpackage.C0587t1, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        Qh qh = this.d;
        qh.o = true;
        ColorStateList colorStateList = qh.j;
        MaterialButton materialButton = qh.a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(qh.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.C0587t1, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? F4.F(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.o != z) {
            this.o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.o;
                if (!materialButtonToggleGroup.f) {
                    materialButtonToggleGroup.b(getId(), z2);
                }
            }
            if (this.p) {
                return;
            }
            this.p = true;
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                Vo.l(it.next());
                throw null;
            }
            this.p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            Qh qh = this.d;
            if (qh.p && qh.g == i) {
                return;
            }
            qh.g = i;
            qh.p = true;
            float f = i;
            C0456oo c0456ooE = qh.b.e();
            c0456ooE.e = new C0247i(f);
            c0456ooE.f = new C0247i(f);
            c0456ooE.g = new C0247i(f);
            c0456ooE.h = new C0247i(f);
            qh.c(c0456ooE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.d.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? F4.F(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i) {
            this.k = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(F4.C(getContext(), i));
    }

    public void setInsetBottom(int i) {
        Qh qh = this.d;
        qh.d(qh.e, i);
    }

    public void setInsetTop(int i) {
        Qh qh = this.d;
        qh.d(i, qh.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(Oh oh) {
        this.f = oh;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        Oh oh = this.f;
        if (oh != null) {
            ((MaterialButtonToggleGroup) ((C0308k0) oh).b).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            Qh qh = this.d;
            if (qh.l != colorStateList) {
                qh.l = colorStateList;
                MaterialButton materialButton = qh.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(F4.C(getContext(), i));
        }
    }

    @Override // defpackage.Ao
    public void setShapeAppearanceModel(C0487po c0487po) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(c0487po);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            Qh qh = this.d;
            qh.n = z;
            qh.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            Qh qh = this.d;
            if (qh.k != colorStateList) {
                qh.k = colorStateList;
                qh.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(F4.C(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            Qh qh = this.d;
            if (qh.h != i) {
                qh.h = i;
                qh.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.C0587t1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        Qh qh = this.d;
        if (qh.j != colorStateList) {
            qh.j = colorStateList;
            if (qh.b(false) != null) {
                O9.h(qh.b(false), qh.j);
            }
        }
    }

    @Override // defpackage.C0587t1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        Qh qh = this.d;
        if (qh.i != mode) {
            qh.i = mode;
            if (qh.b(false) == null || qh.i == null) {
                return;
            }
            O9.i(qh.b(false), qh.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }
}
