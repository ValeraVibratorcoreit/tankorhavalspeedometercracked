package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0638ul;
import defpackage.AbstractC0676vs;
import defpackage.Br;
import defpackage.C0204gi;
import defpackage.F4;
import defpackage.Gs;
import defpackage.MenuC0604ti;
import defpackage.O9;
import defpackage.Td;
import defpackage.V5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer U;
    public boolean V;
    public boolean W;
    public ImageView.ScaleType a0;
    public Boolean b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(Td.Q(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayZ = AbstractC0390mk.z(context2, attributeSet, AbstractC0638ul.u, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayZ.hasValue(2)) {
            setNavigationIconTint(typedArrayZ.getColor(2, -1));
        }
        this.V = typedArrayZ.getBoolean(4, false);
        this.W = typedArrayZ.getBoolean(3, false);
        int i = typedArrayZ.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = c0;
            if (i < scaleTypeArr.length) {
                this.a0 = scaleTypeArr[i];
            }
        }
        if (typedArrayZ.hasValue(0)) {
            this.b0 = Boolean.valueOf(typedArrayZ.getBoolean(0, false));
        }
        typedArrayZ.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0390mk.k(background);
        if (colorStateListValueOf != null) {
            C0204gi c0204gi = new C0204gi();
            c0204gi.l(colorStateListValueOf);
            c0204gi.j(context2);
            WeakHashMap weakHashMap = Gs.a;
            c0204gi.k(AbstractC0676vs.i(this));
            setBackground(c0204gi);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC0604ti;
        if (z) {
            ((MenuC0604ti) menu).w();
        }
        super.m(i);
        if (z) {
            ((MenuC0604ti) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0204gi) {
            F4.a0(this, (C0204gi) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView2 = null;
        if (this.V || this.W) {
            ArrayList arrayListB = Br.B(this, getTitle());
            boolean zIsEmpty = arrayListB.isEmpty();
            V5 v5 = Br.e;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListB, v5);
            ArrayList arrayListB2 = Br.B(this, getSubtitle());
            TextView textView2 = arrayListB2.isEmpty() ? null : (TextView) Collections.max(arrayListB2, v5);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.V && textView != null) {
                    x(textView, pair);
                }
                if (this.W && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0204gi) {
            ((C0204gi) background).k(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.b0;
        if (bool == null || bool.booleanValue() != z) {
            this.b0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.a0 != scaleType) {
            this.a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = drawable.mutate();
            O9.g(drawable, this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.W != z) {
            this.W = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.V != z) {
            this.V = z;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
