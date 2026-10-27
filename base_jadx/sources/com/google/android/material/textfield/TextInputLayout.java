package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.A4;
import defpackage.AbstractC0340l1;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0490pr;
import defpackage.AbstractC0638ul;
import defpackage.AbstractC0747y6;
import defpackage.AbstractC0769ys;
import defpackage.B4;
import defpackage.Br;
import defpackage.C0012ab;
import defpackage.C0074cb;
import defpackage.C0147en;
import defpackage.C0164f9;
import defpackage.C0173fi;
import defpackage.C0204gi;
import defpackage.C0227ha;
import defpackage.C0247i;
import defpackage.C0283j6;
import defpackage.C0308k0;
import defpackage.C0436o4;
import defpackage.C0437o5;
import defpackage.C0456oo;
import defpackage.C0458oq;
import defpackage.C0473pa;
import defpackage.C0487po;
import defpackage.C0581sq;
import defpackage.C0612tq;
import defpackage.C0642up;
import defpackage.C0674vq;
import defpackage.C0694wf;
import defpackage.C0725xf;
import defpackage.C2;
import defpackage.F4;
import defpackage.Gs;
import defpackage.I7;
import defpackage.InterfaceC0643uq;
import defpackage.K2;
import defpackage.Kb;
import defpackage.Nh;
import defpackage.O9;
import defpackage.R7;
import defpackage.RunnableC0524r0;
import defpackage.RunnableC0591t5;
import defpackage.Td;
import defpackage.Tf;
import defpackage.Tm;
import defpackage.U1;
import defpackage.V7;
import defpackage.W7;
import defpackage.W9;
import defpackage.Y8;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public C0204gi F;
    public C0204gi G;
    public StateListDrawable H;
    public boolean I;
    public C0204gi J;
    public C0204gi K;
    public C0487po L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final Rect W;
    public final FrameLayout a;
    public final RectF a0;
    public final C0642up b;
    public Typeface b0;
    public final C0074cb c;
    public ColorDrawable c0;
    public EditText d;
    public int d0;
    public CharSequence e;
    public final LinkedHashSet e0;
    public int f;
    public ColorDrawable f0;
    public int g;
    public int g0;
    public int h;
    public Drawable h0;
    public int i;
    public ColorStateList i0;
    public final C0725xf j;
    public ColorStateList j0;
    public boolean k;
    public int k0;
    public int l;
    public int l0;
    public boolean m;
    public int m0;
    public InterfaceC0643uq n;
    public ColorStateList n0;
    public C2 o;
    public int o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public CharSequence r;
    public int r0;
    public boolean s;
    public int s0;
    public C2 t;
    public int t0;
    public ColorStateList u;
    public boolean u0;
    public int v;
    public final C0283j6 v0;
    public Kb w;
    public boolean w0;
    public Kb x;
    public boolean x0;
    public ColorStateList y;
    public ValueAnimator y0;
    public ColorStateList z;
    public boolean z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(Td.Q(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.textInputStyle, ru.zinovin.tankspeedometer.R.style.Widget_Design_TextInputLayout), attributeSet, ru.zinovin.tankspeedometer.R.attr.textInputStyle);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new C0725xf(this);
        this.n = new C0164f9(3);
        this.V = new Rect();
        this.W = new Rect();
        this.a0 = new RectF();
        this.e0 = new LinkedHashSet();
        C0283j6 c0283j6 = new C0283j6(this);
        this.v0 = c0283j6;
        this.B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0340l1.a;
        c0283j6.Q = linearInterpolator;
        c0283j6.h(false);
        c0283j6.P = linearInterpolator;
        c0283j6.h(false);
        if (c0283j6.g != 8388659) {
            c0283j6.g = 8388659;
            c0283j6.h(false);
        }
        int[] iArr = AbstractC0638ul.D;
        AbstractC0390mk.b(context2, attributeSet, ru.zinovin.tankspeedometer.R.attr.textInputStyle, ru.zinovin.tankspeedometer.R.style.Widget_Design_TextInputLayout);
        AbstractC0390mk.c(context2, attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.textInputStyle, ru.zinovin.tankspeedometer.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.textInputStyle, ru.zinovin.tankspeedometer.R.style.Widget_Design_TextInputLayout);
        K2 k2 = new K2(context2, typedArrayObtainStyledAttributes);
        C0642up c0642up = new C0642up(this, k2);
        this.b = c0642up;
        this.C = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.x0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.w0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.L = C0487po.b(context2, attributeSet, ru.zinovin.tankspeedometer.R.attr.textInputStyle, ru.zinovin.tankspeedometer.R.style.Widget_Design_TextInputLayout).a();
        this.N = context2.getResources().getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.Q = this.R;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C0456oo c0456ooE = this.L.e();
        if (dimension >= 0.0f) {
            c0456ooE.e = new C0247i(dimension);
        }
        if (dimension2 >= 0.0f) {
            c0456ooE.f = new C0247i(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c0456ooE.g = new C0247i(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c0456ooE.h = new C0247i(dimension4);
        }
        this.L = c0456ooE.a();
        ColorStateList colorStateListT = Br.t(context2, k2, 7);
        if (colorStateListT != null) {
            int defaultColor = colorStateListT.getDefaultColor();
            this.o0 = defaultColor;
            this.U = defaultColor;
            if (colorStateListT.isStateful()) {
                this.p0 = colorStateListT.getColorForState(new int[]{-16842910}, -1);
                this.q0 = colorStateListT.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.r0 = colorStateListT.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.q0 = this.o0;
                ColorStateList colorStateListC = F4.C(context2, ru.zinovin.tankspeedometer.R.color.mtrl_filled_background_color);
                this.p0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.r0 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.U = 0;
            this.o0 = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListP = k2.p(1);
            this.j0 = colorStateListP;
            this.i0 = colorStateListP;
        }
        ColorStateList colorStateListT2 = Br.t(context2, k2, 14);
        this.m0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.k0 = I7.a(context2, ru.zinovin.tankspeedometer.R.color.mtrl_textinput_default_box_stroke_color);
        this.s0 = I7.a(context2, ru.zinovin.tankspeedometer.R.color.mtrl_textinput_disabled_color);
        this.l0 = I7.a(context2, ru.zinovin.tankspeedometer.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListT2 != null) {
            setBoxStrokeColorStateList(colorStateListT2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(Br.t(context2, k2, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.A = k2.p(24);
        this.B = k2.p(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.q = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.p = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(k2.p(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(k2.p(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(k2.p(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(k2.p(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(k2.p(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(k2.p(58));
        }
        C0074cb c0074cb = new C0074cb(this, k2);
        this.c = c0074cb;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        k2.J();
        setImportantForAccessibility(2);
        AbstractC0769ys.m(this, 1);
        frameLayout.addView(c0642up);
        frameLayout.addView(c0074cb);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || F4.S(editText)) {
            return this.F;
        }
        int iJ = AbstractC0390mk.j(this.d, ru.zinovin.tankspeedometer.R.attr.colorControlHighlight);
        int i = this.O;
        int[][] iArr = C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C0204gi c0204gi = this.F;
            int i2 = this.U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0390mk.u(iJ, i2, 0.1f), i2}), c0204gi, c0204gi);
        }
        Context context = getContext();
        C0204gi c0204gi2 = this.F;
        TypedValue typedValueT = Tf.T(ru.zinovin.tankspeedometer.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = typedValueT.resourceId;
        int iA = i3 != 0 ? I7.a(context, i3) : typedValueT.data;
        C0204gi c0204gi3 = new C0204gi(c0204gi2.a.a);
        int iU = AbstractC0390mk.u(iJ, iA, 0.1f);
        c0204gi3.l(new ColorStateList(iArr, new int[]{iU, 0}));
        c0204gi3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iU, iA});
        C0204gi c0204gi4 = new C0204gi(c0204gi2.a.a);
        c0204gi4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0204gi3, c0204gi4), c0204gi2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], f(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = f(true);
        }
        return this.G;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText;
        int i = this.f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.I = false;
        i();
        setTextInputAccessibilityDelegate(new C0612tq(this));
        Typeface typeface = this.d.getTypeface();
        C0283j6 c0283j6 = this.v0;
        c0283j6.m(typeface);
        float textSize = this.d.getTextSize();
        if (c0283j6.h != textSize) {
            c0283j6.h = textSize;
            c0283j6.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (c0283j6.W != letterSpacing) {
            c0283j6.W = letterSpacing;
            c0283j6.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0283j6.g != i4) {
            c0283j6.g = i4;
            c0283j6.h(false);
        }
        if (c0283j6.f != gravity) {
            c0283j6.f = gravity;
            c0283j6.h(false);
        }
        WeakHashMap weakHashMap = Gs.a;
        this.t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new C0581sq(this, editText));
        if (this.i0 == null) {
            this.i0 = this.d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.d.getHint();
                this.e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.o != null) {
            n(this.d.getText());
        }
        r();
        this.j.b();
        this.b.bringToFront();
        C0074cb c0074cb = this.c;
        c0074cb.bringToFront();
        Iterator it = this.e0.iterator();
        while (it.hasNext()) {
            ((C0012ab) it.next()).a(this);
        }
        c0074cb.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        C0283j6 c0283j6 = this.v0;
        if (charSequence == null || !TextUtils.equals(c0283j6.A, charSequence)) {
            c0283j6.A = charSequence;
            c0283j6.B = null;
            Bitmap bitmap = c0283j6.E;
            if (bitmap != null) {
                bitmap.recycle();
                c0283j6.E = null;
            }
            c0283j6.h(false);
        }
        if (this.u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s == z) {
            return;
        }
        if (z) {
            C2 c2 = this.t;
            if (c2 != null) {
                this.a.addView(c2);
                this.t.setVisibility(0);
            }
        } else {
            C2 c3 = this.t;
            if (c3 != null) {
                c3.setVisibility(8);
            }
            this.t = null;
        }
        this.s = z;
    }

    public final void a(float f) {
        C0283j6 c0283j6 = this.v0;
        if (c0283j6.b == f) {
            return;
        }
        if (this.y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.y0 = valueAnimator;
            valueAnimator.setInterpolator(Br.i0(getContext(), ru.zinovin.tankspeedometer.R.attr.motionEasingEmphasizedInterpolator, AbstractC0340l1.b));
            this.y0.setDuration(Br.h0(getContext(), ru.zinovin.tankspeedometer.R.attr.motionDurationMedium4, 167));
            this.y0.addUpdateListener(new A4(this, 3));
        }
        this.y0.setFloatValues(c0283j6.b, f);
        this.y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        C0204gi c0204gi = this.F;
        if (c0204gi == null) {
            return;
        }
        C0487po c0487po = c0204gi.a.a;
        C0487po c0487po2 = this.L;
        if (c0487po != c0487po2) {
            c0204gi.setShapeAppearanceModel(c0487po2);
        }
        if (this.O == 2 && (i = this.Q) > -1 && (i2 = this.T) != 0) {
            C0204gi c0204gi2 = this.F;
            c0204gi2.a.k = i;
            c0204gi2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C0173fi c0173fi = c0204gi2.a;
            if (c0173fi.d != colorStateListValueOf) {
                c0173fi.d = colorStateListValueOf;
                c0204gi2.onStateChange(c0204gi2.getState());
            }
        }
        int iB = this.U;
        if (this.O == 1) {
            iB = AbstractC0747y6.b(this.U, AbstractC0390mk.i(getContext(), ru.zinovin.tankspeedometer.R.attr.colorSurface, 0));
        }
        this.U = iB;
        this.F.l(ColorStateList.valueOf(iB));
        C0204gi c0204gi3 = this.J;
        if (c0204gi3 != null && this.K != null) {
            if (this.Q > -1 && this.T != 0) {
                c0204gi3.l(this.d.isFocused() ? ColorStateList.valueOf(this.k0) : ColorStateList.valueOf(this.T));
                this.K.l(ColorStateList.valueOf(this.T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.C) {
            return 0;
        }
        int i = this.O;
        C0283j6 c0283j6 = this.v0;
        if (i == 0) {
            fD = c0283j6.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = c0283j6.d() / 2.0f;
        }
        return (int) fD;
    }

    public final Kb d() {
        Kb kb = new Kb();
        kb.c = Br.h0(getContext(), ru.zinovin.tankspeedometer.R.attr.motionDurationShort2, 87);
        kb.d = Br.i0(getContext(), ru.zinovin.tankspeedometer.R.attr.motionEasingLinearInterpolator, AbstractC0340l1.a);
        return kb;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0204gi c0204gi;
        int i;
        super.draw(canvas);
        boolean z = this.C;
        C0283j6 c0283j6 = this.v0;
        if (z) {
            c0283j6.getClass();
            int iSave = canvas.save();
            if (c0283j6.B != null) {
                RectF rectF = c0283j6.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0283j6.N;
                    textPaint.setTextSize(c0283j6.G);
                    float f = c0283j6.p;
                    float f2 = c0283j6.q;
                    float f3 = c0283j6.F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (c0283j6.d0 <= 1 || c0283j6.C) {
                        canvas.translate(f, f2);
                        c0283j6.Y.draw(canvas);
                    } else {
                        float lineStart = c0283j6.p - c0283j6.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0283j6.b0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c0283j6.H;
                            float f6 = c0283j6.I;
                            float f7 = c0283j6.J;
                            int i3 = c0283j6.K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0747y6.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c0283j6.Y.draw(canvas);
                        textPaint.setAlpha((int) (c0283j6.a0 * f4));
                        if (i2 >= 31) {
                            float f8 = c0283j6.H;
                            float f9 = c0283j6.I;
                            float f10 = c0283j6.J;
                            int i4 = c0283j6.K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0747y6.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0283j6.Y.getLineBaseline(0);
                        CharSequence charSequence = c0283j6.c0;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c0283j6.H, c0283j6.I, c0283j6.J, c0283j6.K);
                        }
                        String strTrim = c0283j6.c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c0283j6.Y.getLineEnd(i), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.K == null || (c0204gi = this.J) == null) {
            return;
        }
        c0204gi.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float f12 = c0283j6.b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0340l1.c(iCenterX, bounds2.left, f12);
            bounds.right = AbstractC0340l1.c(iCenterX, bounds2.right, f12);
            this.K.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.z0) {
            return;
        }
        this.z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0283j6 c0283j6 = this.v0;
        if (c0283j6 != null) {
            c0283j6.L = drawableState;
            ColorStateList colorStateList2 = c0283j6.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0283j6.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c0283j6.h(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.d != null) {
            WeakHashMap weakHashMap = Gs.a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z) {
            invalidate();
        }
        this.z0 = false;
    }

    public final boolean e() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof W7);
    }

    public final C0204gi f(boolean z) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof Nh ? ((Nh) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0147en c0147en = new C0147en();
        C0147en c0147en2 = new C0147en();
        C0147en c0147en3 = new C0147en();
        C0147en c0147en4 = new C0147en();
        C0473pa c0473pa = new C0473pa(i);
        C0473pa c0473pa2 = new C0473pa(i);
        C0473pa c0473pa3 = new C0473pa(i);
        C0473pa c0473pa4 = new C0473pa(i);
        C0247i c0247i = new C0247i(f);
        C0247i c0247i2 = new C0247i(f);
        C0247i c0247i3 = new C0247i(dimensionPixelOffset);
        C0247i c0247i4 = new C0247i(dimensionPixelOffset);
        C0487po c0487po = new C0487po();
        c0487po.a = c0147en;
        c0487po.b = c0147en2;
        c0487po.c = c0147en3;
        c0487po.d = c0147en4;
        c0487po.e = c0247i;
        c0487po.f = c0247i2;
        c0487po.g = c0247i4;
        c0487po.h = c0247i3;
        c0487po.i = c0473pa;
        c0487po.j = c0473pa2;
        c0487po.k = c0473pa3;
        c0487po.l = c0473pa4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof Nh ? ((Nh) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0204gi.w;
            TypedValue typedValueT = Tf.T(ru.zinovin.tankspeedometer.R.attr.colorSurface, context, C0204gi.class.getSimpleName());
            int i2 = typedValueT.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? I7.a(context, i2) : typedValueT.data);
        }
        C0204gi c0204gi = new C0204gi();
        c0204gi.j(context);
        c0204gi.l(dropDownBackgroundTintList);
        c0204gi.k(popupElevation);
        c0204gi.setShapeAppearanceModel(c0487po);
        C0173fi c0173fi = c0204gi.a;
        if (c0173fi.h == null) {
            c0173fi.h = new Rect();
        }
        c0204gi.a.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0204gi.invalidateSelf();
        return c0204gi;
    }

    public final int g(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.c.c();
        } else {
            compoundPaddingLeft = this.b.a();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public C0204gi getBoxBackground() {
        int i = this.O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zK = Tf.K(this);
        RectF rectF = this.a0;
        return zK ? this.L.h.a(rectF) : this.L.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zK = Tf.K(this);
        RectF rectF = this.a0;
        return zK ? this.L.g.a(rectF) : this.L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zK = Tf.K(this);
        RectF rectF = this.a0;
        return zK ? this.L.e.a(rectF) : this.L.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zK = Tf.K(this);
        RectF rectF = this.a0;
        return zK ? this.L.f.a(rectF) : this.L.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    public CharSequence getCounterOverflowDescription() {
        C2 c2;
        if (this.k && this.m && (c2 = this.o) != null) {
            return c2.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.z;
    }

    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.m;
    }

    public int getEndIconMode() {
        return this.c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.n;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.g;
    }

    public CharSequence getError() {
        C0725xf c0725xf = this.j;
        if (c0725xf.q) {
            return c0725xf.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.j.s;
    }

    public int getErrorCurrentTextColors() {
        C2 c2 = this.j.r;
        if (c2 != null) {
            return c2.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0725xf c0725xf = this.j;
        if (c0725xf.x) {
            return c0725xf.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C2 c2 = this.j.y;
        if (c2 != null) {
            return c2.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0283j6 c0283j6 = this.v0;
        return c0283j6.e(c0283j6.k);
    }

    public ColorStateList getHintTextColor() {
        return this.j0;
    }

    public InterfaceC0643uq getLengthCounter() {
        return this.n;
    }

    public int getMaxEms() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public C0487po getShapeAppearanceModel() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h;
    }

    public CharSequence getSuffixText() {
        return this.c.p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.q;
    }

    public Typeface getTypeface() {
        return this.b0;
    }

    public final int h(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.b.a();
        } else {
            compoundPaddingRight = this.c.c();
        }
        return i - compoundPaddingRight;
    }

    public final void i() {
        int i = this.O;
        if (i == 0) {
            this.F = null;
            this.J = null;
            this.K = null;
        } else if (i == 1) {
            this.F = new C0204gi(this.L);
            this.J = new C0204gi();
            this.K = new C0204gi();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof W7)) {
                this.F = new C0204gi(this.L);
            } else {
                C0487po c0487po = this.L;
                int i2 = W7.y;
                if (c0487po == null) {
                    c0487po = new C0487po();
                }
                this.F = new W7(new V7(c0487po, new RectF()));
            }
            this.J = null;
            this.K = null;
        }
        s();
        x();
        if (this.O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.P = getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (Br.G(getContext())) {
                this.P = getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = Gs.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (Br.G(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = Gs.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    public final void j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        int i2;
        if (e()) {
            int width = this.d.getWidth();
            int gravity = this.d.getGravity();
            C0283j6 c0283j6 = this.v0;
            boolean zB = c0283j6.b(c0283j6.A);
            c0283j6.C = zB;
            Rect rect = c0283j6.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c0283j6.Z;
                    }
                } else if (zB) {
                    f = rect.right;
                    f2 = c0283j6.Z;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.a0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c0283j6.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0283j6.C) {
                        f4 = fMax + c0283j6.Z;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c0283j6.C) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f4 = c0283j6.Z + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0283j6.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f5 = rectF.left;
                float f6 = this.N;
                rectF.left = f5 - f6;
                rectF.right += f6;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
                W7 w7 = (W7) this.F;
                w7.getClass();
                w7.p(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0283j6.Z / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.a0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c0283j6.Z / 2.0f);
            } else {
                f4 = (width / 2.0f) + (c0283j6.Z / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0283j6.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(ru.zinovin.tankspeedometer.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(I7.a(getContext(), ru.zinovin.tankspeedometer.R.color.design_error));
    }

    public final boolean m() {
        C0725xf c0725xf = this.j;
        return (c0725xf.o != 1 || c0725xf.r == null || TextUtils.isEmpty(c0725xf.p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0164f9) this.n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.m;
        int i = this.l;
        String string = null;
        if (i == -1) {
            this.o.setText(String.valueOf(length));
            this.o.setContentDescription(null);
            this.m = false;
        } else {
            this.m = length > i;
            Context context = getContext();
            this.o.setContentDescription(context.getString(this.m ? ru.zinovin.tankspeedometer.R.string.character_counter_overflowed_content_description : ru.zinovin.tankspeedometer.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.l)));
            if (z != this.m) {
                o();
            }
            String str = C0436o4.d;
            C0436o4 c0436o4 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0436o4.g : C0436o4.f;
            C2 c2 = this.o;
            String string2 = getContext().getString(ru.zinovin.tankspeedometer.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.l));
            if (string2 == null) {
                c0436o4.getClass();
            } else {
                B4 b4 = c0436o4.c;
                string = c0436o4.c(string2).toString();
            }
            c2.setText(string);
        }
        if (this.d == null || z == this.m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C2 c2 = this.o;
        if (c2 != null) {
            l(c2, this.m ? this.p : this.q);
            if (!this.m && (colorStateList2 = this.y) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (!this.m || (colorStateList = this.z) == null) {
                return;
            }
            this.o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0074cb c0074cb = this.c;
        c0074cb.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (iMax = Math.max(c0074cb.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(iMax);
            z = true;
        }
        boolean zQ = q();
        if (z || zQ) {
            this.d.post(new RunnableC0591t5(this, 22));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = Y8.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = Y8.a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            Y8.a(this, editText, matrix);
            ThreadLocal threadLocal3 = Y8.b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0204gi c0204gi = this.J;
            if (c0204gi != null) {
                int i5 = rect.bottom;
                c0204gi.setBounds(rect.left, i5 - this.R, rect.right, i5);
            }
            C0204gi c0204gi2 = this.K;
            if (c0204gi2 != null) {
                int i6 = rect.bottom;
                c0204gi2.setBounds(rect.left, i6 - this.S, rect.right, i6);
            }
            if (this.C) {
                float textSize = this.d.getTextSize();
                C0283j6 c0283j6 = this.v0;
                if (c0283j6.h != textSize) {
                    c0283j6.h = textSize;
                    c0283j6.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0283j6.g != i7) {
                    c0283j6.g = i7;
                    c0283j6.h(false);
                }
                if (c0283j6.f != gravity) {
                    c0283j6.f = gravity;
                    c0283j6.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean zK = Tf.K(this);
                int i8 = rect.bottom;
                Rect rect2 = this.W;
                rect2.bottom = i8;
                int i9 = this.O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, zK);
                    rect2.top = rect.top + this.P;
                    rect2.right = h(rect.right, zK);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, zK);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zK);
                } else {
                    rect2.left = this.d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0283j6.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0283j6.M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0283j6.O;
                textPaint.setTextSize(c0283j6.h);
                textPaint.setTypeface(c0283j6.u);
                textPaint.setLetterSpacing(c0283j6.W);
                float f = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0283j6.c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0283j6.M = true;
                }
                c0283j6.h(false);
                if (!e() || this.u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.B0;
        C0074cb c0074cb = this.c;
        if (!z) {
            c0074cb.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        if (this.t != null && (editText = this.d) != null) {
            this.t.setGravity(editText.getGravity());
            this.t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        c0074cb.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0674vq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0674vq c0674vq = (C0674vq) parcelable;
        super.onRestoreInstanceState(c0674vq.a);
        setError(c0674vq.c);
        if (c0674vq.d) {
            post(new RunnableC0524r0(this, 18));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.M) {
            R7 r7 = this.L.e;
            RectF rectF = this.a0;
            float fA = r7.a(rectF);
            float fA2 = this.L.f.a(rectF);
            float fA3 = this.L.h.a(rectF);
            float fA4 = this.L.g.a(rectF);
            C0487po c0487po = this.L;
            F4 f4 = c0487po.a;
            F4 f5 = c0487po.b;
            F4 f6 = c0487po.d;
            F4 f7 = c0487po.c;
            C0473pa c0473pa = new C0473pa(0);
            C0473pa c0473pa2 = new C0473pa(0);
            C0473pa c0473pa3 = new C0473pa(0);
            C0473pa c0473pa4 = new C0473pa(0);
            C0456oo.b(f5);
            C0456oo.b(f4);
            C0456oo.b(f7);
            C0456oo.b(f6);
            C0247i c0247i = new C0247i(fA2);
            C0247i c0247i2 = new C0247i(fA);
            C0247i c0247i3 = new C0247i(fA4);
            C0247i c0247i4 = new C0247i(fA3);
            C0487po c0487po2 = new C0487po();
            c0487po2.a = f5;
            c0487po2.b = f4;
            c0487po2.c = f6;
            c0487po2.d = f7;
            c0487po2.e = c0247i;
            c0487po2.f = c0247i2;
            c0487po2.g = c0247i4;
            c0487po2.h = c0247i3;
            c0487po2.i = c0473pa;
            c0487po2.j = c0473pa2;
            c0487po2.k = c0473pa3;
            c0487po2.l = c0473pa4;
            this.M = z;
            setShapeAppearanceModel(c0487po2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0674vq c0674vq = new C0674vq(super.onSaveInstanceState());
        if (m()) {
            c0674vq.c = getError();
        }
        C0074cb c0074cb = this.c;
        c0674vq.d = c0074cb.i != 0 && c0074cb.g.d;
        return c0674vq;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.A;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueR = Tf.R(context, ru.zinovin.tankspeedometer.R.attr.colorControlActivated);
            if (typedValueR != null) {
                int i = typedValueR.resourceId;
                if (i != 0) {
                    colorStateListValueOf = F4.C(context, i);
                } else {
                    int i2 = typedValueR.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.d.getTextCursorDrawable().mutate();
        if ((m() || (this.o != null && this.m)) && (colorStateList = this.B) != null) {
            colorStateListValueOf = colorStateList;
        }
        O9.h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z;
        if (this.d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C0642up c0642up = this.b;
            if (c0642up.getMeasuredWidth() > 0) {
                int measuredWidth = c0642up.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.c0 == null || this.d0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.c0 = colorDrawable;
                    this.d0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.c0;
                if (drawable != colorDrawable2) {
                    this.d.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.c0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.c0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.c0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.c0 = null;
            z = true;
        } else {
            z = false;
        }
        C0074cb c0074cb = this.c;
        if ((c0074cb.e() || ((c0074cb.i != 0 && c0074cb.d()) || c0074cb.p != null)) && c0074cb.getMeasuredWidth() > 0) {
            int measuredWidth2 = c0074cb.q.getMeasuredWidth() - this.d.getPaddingRight();
            if (c0074cb.e()) {
                checkableImageButton = c0074cb.c;
            } else if (c0074cb.i != 0 && c0074cb.d()) {
                checkableImageButton = c0074cb.g;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f0;
            if (colorDrawable3 == null || this.g0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f0 = colorDrawable4;
                    this.g0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative4[2];
                ColorDrawable colorDrawable5 = this.f0;
                if (drawable2 != colorDrawable5) {
                    this.h0 = drawable2;
                    this.d.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.g0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f0, compoundDrawablesRelative4[3]);
            }
        } else {
            if (this.f0 == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative5 = this.d.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f0) {
                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.h0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f0 = null;
        }
        return z2;
    }

    public final void r() {
        Drawable background;
        C2 c2;
        PorterDuffColorFilter porterDuffColorFilterG;
        PorterDuffColorFilter porterDuffColorFilterG2;
        EditText editText = this.d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = W9.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = U1.b;
            synchronized (U1.class) {
                porterDuffColorFilterG2 = Tm.g(errorCurrentTextColors, mode);
            }
            drawableMutate.setColorFilter(porterDuffColorFilterG2);
            return;
        }
        if (!this.m || (c2 = this.o) == null) {
            drawableMutate.clearColorFilter();
            this.d.refreshDrawableState();
            return;
        }
        int currentTextColor = c2.getCurrentTextColor();
        PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
        PorterDuff.Mode mode4 = U1.b;
        synchronized (U1.class) {
            porterDuffColorFilterG = Tm.g(currentTextColor, mode3);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterG);
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = Gs.a;
            editText2.setBackground(editTextBoxBackground);
            this.I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.U != i) {
            this.U = i;
            this.o0 = i;
            this.q0 = i;
            this.r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(I7.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.o0 = defaultColor;
        this.U = defaultColor;
        this.p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.O) {
            return;
        }
        this.O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.P = i;
    }

    public void setBoxCornerFamily(int i) {
        C0456oo c0456ooE = this.L.e();
        R7 r7 = this.L.e;
        F4 f4P = F4.p(i);
        c0456ooE.a = f4P;
        C0456oo.b(f4P);
        c0456ooE.e = r7;
        R7 r8 = this.L.f;
        F4 f4P2 = F4.p(i);
        c0456ooE.b = f4P2;
        C0456oo.b(f4P2);
        c0456ooE.f = r8;
        R7 r9 = this.L.h;
        F4 f4P3 = F4.p(i);
        c0456ooE.d = f4P3;
        C0456oo.b(f4P3);
        c0456ooE.h = r9;
        R7 r10 = this.L.g;
        F4 f4P4 = F4.p(i);
        c0456ooE.c = f4P4;
        C0456oo.b(f4P4);
        c0456ooE.g = r10;
        this.L = c0456ooE.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.m0 != i) {
            this.m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.k0 = colorStateList.getDefaultColor();
            this.s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.m0 != colorStateList.getDefaultColor()) {
            this.m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.k != z) {
            C0725xf c0725xf = this.j;
            if (z) {
                C2 c2 = new C2(getContext(), null);
                this.o = c2;
                c2.setId(ru.zinovin.tankspeedometer.R.id.textinput_counter);
                Typeface typeface = this.b0;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                c0725xf.a(this.o, 2);
                ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(ru.zinovin.tankspeedometer.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                c0725xf.g(this.o, 2);
                this.o = null;
            }
            this.k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.l != i) {
            if (i > 0) {
                this.l = i;
            } else {
                this.l = -1;
            }
            if (!this.k || this.o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (m() || (this.o != null && this.m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.i0 = colorStateList;
        this.j0 = colorStateList;
        if (this.d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C0074cb c0074cb = this.c;
        CharSequence text = i != 0 ? c0074cb.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0074cb.g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0074cb c0074cb = this.c;
        Drawable drawableF = i != 0 ? F4.F(c0074cb.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c0074cb.g;
        checkableImageButton.setImageDrawable(drawableF);
        if (drawableF != null) {
            ColorStateList colorStateList = c0074cb.k;
            PorterDuff.Mode mode = c0074cb.l;
            TextInputLayout textInputLayout = c0074cb.a;
            F4.e(textInputLayout, checkableImageButton, colorStateList, mode);
            F4.V(textInputLayout, checkableImageButton, c0074cb.k);
        }
    }

    public void setEndIconMinSize(int i) {
        C0074cb c0074cb = this.c;
        if (i < 0) {
            c0074cb.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0074cb.m) {
            c0074cb.m = i;
            CheckableImageButton checkableImageButton = c0074cb.g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0074cb.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0074cb c0074cb = this.c;
        View.OnLongClickListener onLongClickListener = c0074cb.o;
        CheckableImageButton checkableImageButton = c0074cb.g;
        checkableImageButton.setOnClickListener(onClickListener);
        F4.Z(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0074cb c0074cb = this.c;
        c0074cb.o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0074cb.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        F4.Z(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0074cb c0074cb = this.c;
        c0074cb.n = scaleType;
        c0074cb.g.setScaleType(scaleType);
        c0074cb.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0074cb c0074cb = this.c;
        if (c0074cb.k != colorStateList) {
            c0074cb.k = colorStateList;
            F4.e(c0074cb.a, c0074cb.g, colorStateList, c0074cb.l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0074cb c0074cb = this.c;
        if (c0074cb.l != mode) {
            c0074cb.l = mode;
            F4.e(c0074cb.a, c0074cb.g, c0074cb.k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        C0725xf c0725xf = this.j;
        if (!c0725xf.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0725xf.f();
            return;
        }
        c0725xf.c();
        c0725xf.p = charSequence;
        c0725xf.r.setText(charSequence);
        int i = c0725xf.n;
        if (i != 1) {
            c0725xf.o = 1;
        }
        c0725xf.i(i, c0725xf.o, c0725xf.h(c0725xf.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0725xf c0725xf = this.j;
        c0725xf.t = i;
        C2 c2 = c0725xf.r;
        if (c2 != null) {
            WeakHashMap weakHashMap = Gs.a;
            c2.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0725xf c0725xf = this.j;
        c0725xf.s = charSequence;
        C2 c2 = c0725xf.r;
        if (c2 != null) {
            c2.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0725xf c0725xf = this.j;
        if (c0725xf.q == z) {
            return;
        }
        c0725xf.c();
        TextInputLayout textInputLayout = c0725xf.h;
        if (z) {
            C2 c2 = new C2(c0725xf.g, null);
            c0725xf.r = c2;
            c2.setId(ru.zinovin.tankspeedometer.R.id.textinput_error);
            c0725xf.r.setTextAlignment(5);
            Typeface typeface = c0725xf.B;
            if (typeface != null) {
                c0725xf.r.setTypeface(typeface);
            }
            int i = c0725xf.u;
            c0725xf.u = i;
            C2 c3 = c0725xf.r;
            if (c3 != null) {
                textInputLayout.l(c3, i);
            }
            ColorStateList colorStateList = c0725xf.v;
            c0725xf.v = colorStateList;
            C2 c4 = c0725xf.r;
            if (c4 != null && colorStateList != null) {
                c4.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0725xf.s;
            c0725xf.s = charSequence;
            C2 c5 = c0725xf.r;
            if (c5 != null) {
                c5.setContentDescription(charSequence);
            }
            int i2 = c0725xf.t;
            c0725xf.t = i2;
            C2 c6 = c0725xf.r;
            if (c6 != null) {
                WeakHashMap weakHashMap = Gs.a;
                c6.setAccessibilityLiveRegion(i2);
            }
            c0725xf.r.setVisibility(4);
            c0725xf.a(c0725xf.r, 0);
        } else {
            c0725xf.f();
            c0725xf.g(c0725xf.r, 0);
            c0725xf.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        c0725xf.q = z;
    }

    public void setErrorIconDrawable(int i) {
        C0074cb c0074cb = this.c;
        c0074cb.i(i != 0 ? F4.F(c0074cb.getContext(), i) : null);
        F4.V(c0074cb.a, c0074cb.c, c0074cb.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0074cb c0074cb = this.c;
        CheckableImageButton checkableImageButton = c0074cb.c;
        View.OnLongClickListener onLongClickListener = c0074cb.f;
        checkableImageButton.setOnClickListener(onClickListener);
        F4.Z(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0074cb c0074cb = this.c;
        c0074cb.f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0074cb.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        F4.Z(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0074cb c0074cb = this.c;
        if (c0074cb.d != colorStateList) {
            c0074cb.d = colorStateList;
            F4.e(c0074cb.a, c0074cb.c, colorStateList, c0074cb.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0074cb c0074cb = this.c;
        if (c0074cb.e != mode) {
            c0074cb.e = mode;
            F4.e(c0074cb.a, c0074cb.c, c0074cb.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0725xf c0725xf = this.j;
        c0725xf.u = i;
        C2 c2 = c0725xf.r;
        if (c2 != null) {
            c0725xf.h.l(c2, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0725xf c0725xf = this.j;
        c0725xf.v = colorStateList;
        C2 c2 = c0725xf.r;
        if (c2 == null || colorStateList == null) {
            return;
        }
        c2.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.w0 != z) {
            this.w0 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0725xf c0725xf = this.j;
        if (zIsEmpty) {
            if (c0725xf.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0725xf.x) {
            setHelperTextEnabled(true);
        }
        c0725xf.c();
        c0725xf.w = charSequence;
        c0725xf.y.setText(charSequence);
        int i = c0725xf.n;
        if (i != 2) {
            c0725xf.o = 2;
        }
        c0725xf.i(i, c0725xf.o, c0725xf.h(c0725xf.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0725xf c0725xf = this.j;
        c0725xf.A = colorStateList;
        C2 c2 = c0725xf.y;
        if (c2 == null || colorStateList == null) {
            return;
        }
        c2.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C0725xf c0725xf = this.j;
        if (c0725xf.x == z) {
            return;
        }
        c0725xf.c();
        if (z) {
            C2 c2 = new C2(c0725xf.g, null);
            c0725xf.y = c2;
            c2.setId(ru.zinovin.tankspeedometer.R.id.textinput_helper_text);
            c0725xf.y.setTextAlignment(5);
            Typeface typeface = c0725xf.B;
            if (typeface != null) {
                c0725xf.y.setTypeface(typeface);
            }
            c0725xf.y.setVisibility(4);
            c0725xf.y.setAccessibilityLiveRegion(1);
            int i = c0725xf.z;
            c0725xf.z = i;
            C2 c3 = c0725xf.y;
            if (c3 != null) {
                c3.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0725xf.A;
            c0725xf.A = colorStateList;
            C2 c4 = c0725xf.y;
            if (c4 != null && colorStateList != null) {
                c4.setTextColor(colorStateList);
            }
            c0725xf.a(c0725xf.y, 1);
            c0725xf.y.setAccessibilityDelegate(new C0694wf(c0725xf));
        } else {
            c0725xf.c();
            int i2 = c0725xf.n;
            if (i2 == 2) {
                c0725xf.o = 0;
            }
            c0725xf.i(i2, c0725xf.o, c0725xf.h(c0725xf.y, ""));
            c0725xf.g(c0725xf.y, 1);
            c0725xf.y = null;
            TextInputLayout textInputLayout = c0725xf.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        c0725xf.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C0725xf c0725xf = this.j;
        c0725xf.z = i;
        C2 c2 = c0725xf.y;
        if (c2 != null) {
            c2.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.x0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (z) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0283j6 c0283j6 = this.v0;
        View view = c0283j6.a;
        C0458oq c0458oq = new C0458oq(view.getContext(), i);
        ColorStateList colorStateList = c0458oq.j;
        if (colorStateList != null) {
            c0283j6.k = colorStateList;
        }
        float f = c0458oq.k;
        if (f != 0.0f) {
            c0283j6.i = f;
        }
        ColorStateList colorStateList2 = c0458oq.a;
        if (colorStateList2 != null) {
            c0283j6.U = colorStateList2;
        }
        c0283j6.S = c0458oq.e;
        c0283j6.T = c0458oq.f;
        c0283j6.R = c0458oq.g;
        c0283j6.V = c0458oq.i;
        C0437o5 c0437o5 = c0283j6.y;
        if (c0437o5 != null) {
            c0437o5.l = true;
        }
        C0308k0 c0308k0 = new C0308k0(c0283j6, 4);
        c0458oq.a();
        c0283j6.y = new C0437o5(c0308k0, c0458oq.n);
        c0458oq.c(view.getContext(), c0283j6.y);
        c0283j6.h(false);
        this.j0 = c0283j6.k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            if (this.i0 == null) {
                C0283j6 c0283j6 = this.v0;
                if (c0283j6.k != colorStateList) {
                    c0283j6.k = colorStateList;
                    c0283j6.h(false);
                }
            }
            this.j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0643uq interfaceC0643uq) {
        this.n = interfaceC0643uq;
    }

    public void setMaxEms(int i) {
        this.g = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0074cb c0074cb = this.c;
        c0074cb.g.setContentDescription(i != 0 ? c0074cb.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0074cb c0074cb = this.c;
        c0074cb.g.setImageDrawable(i != 0 ? F4.F(c0074cb.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C0074cb c0074cb = this.c;
        if (z && c0074cb.i != 1) {
            c0074cb.g(1);
        } else if (z) {
            c0074cb.getClass();
        } else {
            c0074cb.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0074cb c0074cb = this.c;
        c0074cb.k = colorStateList;
        F4.e(c0074cb.a, c0074cb.g, colorStateList, c0074cb.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0074cb c0074cb = this.c;
        c0074cb.l = mode;
        F4.e(c0074cb.a, c0074cb.g, c0074cb.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.t == null) {
            C2 c2 = new C2(getContext(), null);
            this.t = c2;
            c2.setId(ru.zinovin.tankspeedometer.R.id.textinput_placeholder);
            this.t.setImportantForAccessibility(2);
            Kb kbD = d();
            this.w = kbD;
            kbD.b = 67L;
            this.x = d();
            setPlaceholderTextAppearance(this.v);
            setPlaceholderTextColor(this.u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v = i;
        C2 c2 = this.t;
        if (c2 != null) {
            c2.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            C2 c2 = this.t;
            if (c2 == null || colorStateList == null) {
                return;
            }
            c2.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0642up c0642up = this.b;
        c0642up.getClass();
        c0642up.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0642up.b.setText(charSequence);
        c0642up.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0487po c0487po) {
        C0204gi c0204gi = this.F;
        if (c0204gi == null || c0204gi.a.a == c0487po) {
            return;
        }
        this.L = c0487po;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? F4.F(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C0642up c0642up = this.b;
        if (i < 0) {
            c0642up.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c0642up.g) {
            c0642up.g = i;
            CheckableImageButton checkableImageButton = c0642up.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0642up c0642up = this.b;
        View.OnLongClickListener onLongClickListener = c0642up.i;
        CheckableImageButton checkableImageButton = c0642up.d;
        checkableImageButton.setOnClickListener(onClickListener);
        F4.Z(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0642up c0642up = this.b;
        c0642up.i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0642up.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        F4.Z(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0642up c0642up = this.b;
        c0642up.h = scaleType;
        c0642up.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0642up c0642up = this.b;
        if (c0642up.e != colorStateList) {
            c0642up.e = colorStateList;
            F4.e(c0642up.a, c0642up.d, colorStateList, c0642up.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0642up c0642up = this.b;
        if (c0642up.f != mode) {
            c0642up.f = mode;
            F4.e(c0642up.a, c0642up.d, c0642up.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0074cb c0074cb = this.c;
        c0074cb.getClass();
        c0074cb.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0074cb.q.setText(charSequence);
        c0074cb.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0612tq c0612tq) {
        EditText editText = this.d;
        if (editText != null) {
            Gs.j(editText, c0612tq);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.b0) {
            this.b0 = typeface;
            this.v0.m(typeface);
            C0725xf c0725xf = this.j;
            if (typeface != c0725xf.B) {
                c0725xf.B = typeface;
                C2 c2 = c0725xf.r;
                if (c2 != null) {
                    c2.setTypeface(typeface);
                }
                C2 c3 = c0725xf.y;
                if (c3 != null) {
                    c3.setTypeface(typeface);
                }
            }
            C2 c4 = this.o;
            if (c4 != null) {
                c4.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.O != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C2 c2;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.i0;
        C0283j6 c0283j6 = this.v0;
        if (colorStateList2 != null) {
            c0283j6.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.i0;
            c0283j6.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.s0) : this.s0));
        } else if (m()) {
            C2 c3 = this.j.r;
            c0283j6.i(c3 != null ? c3.getTextColors() : null);
        } else if (this.m && (c2 = this.o) != null) {
            c0283j6.i(c2.getTextColors());
        } else if (z4 && (colorStateList = this.j0) != null && c0283j6.k != colorStateList) {
            c0283j6.k = colorStateList;
            c0283j6.h(false);
        }
        C0074cb c0074cb = this.c;
        C0642up c0642up = this.b;
        if (z3 || !this.w0 || (isEnabled() && z4)) {
            if (z2 || this.u0) {
                ValueAnimator valueAnimator = this.y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.y0.cancel();
                }
                if (z && this.x0) {
                    a(1.0f);
                } else {
                    c0283j6.k(1.0f);
                }
                this.u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                c0642up.j = false;
                c0642up.e();
                c0074cb.r = false;
                c0074cb.n();
                return;
            }
            return;
        }
        if (z2 || !this.u0) {
            ValueAnimator valueAnimator2 = this.y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.y0.cancel();
            }
            if (z && this.x0) {
                a(0.0f);
            } else {
                c0283j6.k(0.0f);
            }
            if (e() && (!((W7) this.F).x.v.isEmpty()) && e()) {
                ((W7) this.F).p(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.u0 = true;
            C2 c4 = this.t;
            if (c4 != null && this.s) {
                c4.setText((CharSequence) null);
                AbstractC0490pr.a(this.a, this.x);
                this.t.setVisibility(4);
            }
            c0642up.j = true;
            c0642up.e();
            c0074cb.r = true;
            c0074cb.n();
        }
    }

    public final void v(Editable editable) {
        ((C0164f9) this.n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.u0) {
            C2 c2 = this.t;
            if (c2 == null || !this.s) {
                return;
            }
            c2.setText((CharSequence) null);
            AbstractC0490pr.a(frameLayout, this.x);
            this.t.setVisibility(4);
            return;
        }
        if (this.t == null || !this.s || TextUtils.isEmpty(this.r)) {
            return;
        }
        this.t.setText(this.r);
        AbstractC0490pr.a(frameLayout, this.w);
        this.t.setVisibility(0);
        this.t.bringToFront();
        announceForAccessibility(this.r);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.n0.getDefaultColor();
        int colorForState = this.n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.T = colorForState2;
        } else if (z2) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    public final void x() {
        C2 c2;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.O == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.T = this.s0;
        } else if (m()) {
            if (this.n0 != null) {
                w(z2, z);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.m || (c2 = this.o) == null) {
            if (z2) {
                this.T = this.m0;
            } else if (z) {
                this.T = this.l0;
            } else {
                this.T = this.k0;
            }
        } else if (this.n0 != null) {
            w(z2, z);
        } else {
            this.T = c2.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        C0074cb c0074cb = this.c;
        c0074cb.l();
        CheckableImageButton checkableImageButton = c0074cb.c;
        ColorStateList colorStateList = c0074cb.d;
        TextInputLayout textInputLayout = c0074cb.a;
        F4.V(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0074cb.k;
        CheckableImageButton checkableImageButton2 = c0074cb.g;
        F4.V(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0074cb.b() instanceof C0227ha) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                F4.e(textInputLayout, checkableImageButton2, c0074cb.k, c0074cb.l);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                O9.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C0642up c0642up = this.b;
        F4.V(c0642up.a, c0642up.d, c0642up.e);
        if (this.O == 2) {
            int i = this.Q;
            if (z2 && isEnabled()) {
                this.Q = this.S;
            } else {
                this.Q = this.R;
            }
            if (this.Q != i && e() && !this.u0) {
                if (e()) {
                    ((W7) this.F).p(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.O == 1) {
            if (!isEnabled()) {
                this.U = this.p0;
            } else if (z && !z2) {
                this.U = this.r0;
            } else if (z2) {
                this.U = this.q0;
            } else {
                this.U = this.o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0074cb c0074cb = this.c;
        CheckableImageButton checkableImageButton = c0074cb.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0074cb.k;
            PorterDuff.Mode mode = c0074cb.l;
            TextInputLayout textInputLayout = c0074cb.a;
            F4.e(textInputLayout, checkableImageButton, colorStateList, mode);
            F4.V(textInputLayout, checkableImageButton, c0074cb.k);
        }
    }
}
