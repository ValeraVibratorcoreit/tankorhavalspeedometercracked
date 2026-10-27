package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.AbstractC0024an;
import defpackage.AbstractC0059br;
import defpackage.AbstractC0536rc;
import defpackage.C0759yi;
import defpackage.Gs;
import defpackage.Jg;
import defpackage.M5;
import defpackage.Mi;
import defpackage.O9;
import defpackage.Vm;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0536rc implements Mi {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public C0759yi B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final M5 F;
    public int v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final CheckedTextView z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = true;
        M5 m5 = new M5(this, 3);
        this.F = m5;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ru.zinovin.tankspeedometer.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ru.zinovin.tankspeedometer.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ru.zinovin.tankspeedometer.R.id.design_menu_item_text);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Gs.j(checkedTextView, m5);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(ru.zinovin.tankspeedometer.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // defpackage.Mi
    public final void c(C0759yi c0759yi) {
        StateListDrawable stateListDrawable;
        this.B = c0759yi;
        int i = c0759yi.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0759yi.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(ru.zinovin.tankspeedometer.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = Gs.a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0759yi.isCheckable());
        setChecked(c0759yi.isChecked());
        setEnabled(c0759yi.isEnabled());
        setTitle(c0759yi.e);
        setIcon(c0759yi.getIcon());
        setActionView(c0759yi.getActionView());
        setContentDescription(c0759yi.q);
        AbstractC0059br.a(this, c0759yi.r);
        C0759yi c0759yi2 = this.B;
        CharSequence charSequence = c0759yi2.e;
        CheckedTextView checkedTextView = this.z;
        if (charSequence == null && c0759yi2.getIcon() == null && this.B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                Jg jg = (Jg) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) jg).width = -1;
                this.A.setLayoutParams(jg);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            Jg jg2 = (Jg) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) jg2).width = -2;
            this.A.setLayoutParams(jg2);
        }
    }

    @Override // defpackage.Mi
    public C0759yi getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0759yi c0759yi = this.B;
        if (c0759yi != null && c0759yi.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.x != z) {
            this.x = z;
            this.F.h(this.z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                O9.h(drawable, this.C);
            }
            int i = this.v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0024an.a;
                Drawable drawableA = Vm.a(resources, ru.zinovin.tankspeedometer.R.drawable.navigation_empty_icon, theme);
                this.E = drawableA;
                if (drawableA != null) {
                    int i2 = this.v;
                    drawableA.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.E;
        }
        this.z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        C0759yi c0759yi = this.B;
        if (c0759yi != null) {
            setIcon(c0759yi.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w = z;
    }

    public void setTextAppearance(int i) {
        this.z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}
