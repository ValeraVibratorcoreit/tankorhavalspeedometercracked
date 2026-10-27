package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0190g4 extends FrameLayout {
    public static final ViewOnTouchListenerC0159f4 i = new ViewOnTouchListenerC0159f4();
    public final C0487po a;
    public int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    public AbstractC0190g4(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(Td.Q(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0638ul.z);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = Gs.a;
            AbstractC0676vs.s(this, dimensionPixelSize);
        }
        this.b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.a = C0487po.b(context2, attributeSet, 0, 0).a();
        }
        this.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(Br.u(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(Tf.P(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            int iU = AbstractC0390mk.u(AbstractC0390mk.j(this, R.attr.colorSurface), AbstractC0390mk.j(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C0487po c0487po = this.a;
            if (c0487po != null) {
                int i2 = AbstractC0221h4.a;
                C0204gi c0204gi = new C0204gi(c0487po);
                c0204gi.l(ColorStateList.valueOf(iU));
                drawable = c0204gi;
            } else {
                Resources resources = getResources();
                int i3 = AbstractC0221h4.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iU);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.g;
            if (colorStateList != null) {
                O9.h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = Gs.a;
            setBackground(drawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC0221h4 abstractC0221h4) {
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.c;
    }

    public int getMaxInlineActionWidth() {
        return this.f;
    }

    public int getMaxWidth() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0614ts.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.g != null) {
            drawable = drawable.mutate();
            O9.h(drawable, this.g);
            O9.i(drawable, this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            O9.h(drawableMutate, colorStateList);
            O9.i(drawableMutate, this.h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            O9.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : i);
        super.setOnClickListener(onClickListener);
    }
}
