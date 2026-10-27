package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0588t2 extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final C0556s1 a;
    public final Context b;
    public final C0279j2 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final InterfaceC0557s2 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public C0588t2(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.spinnerStyle);
        this.h = new Rect();
        Cq.a(this, getContext());
        int[] iArr = AbstractC0700wl.u;
        K2 k2G = K2.G(context, attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.spinnerStyle, 0);
        this.a = new C0556s1(this);
        TypedArray typedArray = (TypedArray) k2G.b;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new J7(context, resourceId);
        } else {
            this.b = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i, ru.zinovin.tankspeedometer.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                        DialogInterfaceOnClickListenerC0372m2 dialogInterfaceOnClickListenerC0372m2 = new DialogInterfaceOnClickListenerC0372m2(this);
                        this.f = dialogInterfaceOnClickListenerC0372m2;
                        dialogInterfaceOnClickListenerC0372m2.c = typedArray.getString(2);
                    } else if (i2 == 1) {
                        C0496q2 c0496q2 = new C0496q2(this, this.b, attributeSet);
                        K2 k2G2 = K2.G(this.b, attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.spinnerStyle, 0);
                        this.g = ((TypedArray) k2G2.b).getLayoutDimension(3, -2);
                        c0496q2.k(k2G2.q(1));
                        c0496q2.C = typedArray.getString(2);
                        k2G2.J();
                        this.f = c0496q2;
                        this.c = new C0279j2(this, this, c0496q2);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(ru.zinovin.tankspeedometer.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    k2G.J();
                    this.e = true;
                    spinnerAdapter = this.d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.d = null;
                    }
                    this.a.d(attributeSet, ru.zinovin.tankspeedometer.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            DialogInterfaceOnClickListenerC0372m2 dialogInterfaceOnClickListenerC0372m3 = new DialogInterfaceOnClickListenerC0372m2(this);
            this.f = dialogInterfaceOnClickListenerC0372m3;
            dialogInterfaceOnClickListenerC0372m3.c = typedArray.getString(2);
        } else if (i2 == 1) {
            C0496q2 c0496q3 = new C0496q2(this, this.b, attributeSet);
            K2 k2G3 = K2.G(this.b, attributeSet, iArr, ru.zinovin.tankspeedometer.R.attr.spinnerStyle, 0);
            this.g = ((TypedArray) k2G3.b).getLayoutDimension(3, -2);
            c0496q3.k(k2G3.q(1));
            c0496q3.C = typedArray.getString(2);
            k2G3.J();
            this.f = c0496q3;
            this.c = new C0279j2(this, this, c0496q3);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(ru.zinovin.tankspeedometer.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        k2G.J();
        this.e = true;
        spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.a.d(attributeSet, ru.zinovin.tankspeedometer.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        return interfaceC0557s2 != null ? interfaceC0557s2.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        return interfaceC0557s2 != null ? interfaceC0557s2.f() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final InterfaceC0557s2 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        return interfaceC0557s2 != null ? interfaceC0557s2.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        return interfaceC0557s2 != null ? interfaceC0557s2.h() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        if (interfaceC0557s2 == null || !interfaceC0557s2.a()) {
            return;
        }
        interfaceC0557s2.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0526r2 c0526r2 = (C0526r2) parcelable;
        super.onRestoreInstanceState(c0526r2.getSuperState());
        if (!c0526r2.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0310k2(this, 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0526r2 c0526r2 = new C0526r2(super.onSaveInstanceState());
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        c0526r2.a = interfaceC0557s2 != null && interfaceC0557s2.a();
        return c0526r2;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0279j2 c0279j2 = this.c;
        if (c0279j2 == null || !c0279j2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        if (interfaceC0557s2 == null) {
            return super.performClick();
        }
        if (interfaceC0557s2.a()) {
            return true;
        }
        this.f.d(getTextDirection(), getTextAlignment());
        return true;
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
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        if (interfaceC0557s2 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0557s2.n(i2);
            interfaceC0557s2.b(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        if (interfaceC0557s2 != null) {
            interfaceC0557s2.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        if (interfaceC0557s2 != null) {
            interfaceC0557s2.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(F4.F(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        if (interfaceC0557s2 != null) {
            interfaceC0557s2.j(charSequence);
        } else {
            super.setPrompt(charSequence);
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

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0557s2 interfaceC0557s2 = this.f;
        if (interfaceC0557s2 != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0403n2 c0403n2 = new C0403n2();
            c0403n2.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0403n2.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0341l2.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0557s2.m(c0403n2);
        }
    }
}
