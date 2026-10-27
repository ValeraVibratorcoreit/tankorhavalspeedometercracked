package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.AbstractC0059br;
import defpackage.AbstractC0155f0;
import defpackage.AbstractC0700wl;
import defpackage.C0124e0;
import defpackage.C0759yi;
import defpackage.C2;
import defpackage.InterfaceC0370m0;
import defpackage.InterfaceC0573si;
import defpackage.MenuC0604ti;
import defpackage.Mi;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C2 implements Mi, View.OnClickListener, InterfaceC0370m0 {
    public C0759yi g;
    public CharSequence h;
    public Drawable i;
    public InterfaceC0573si j;
    public C0124e0 k;
    public AbstractC0155f0 l;
    public boolean m;
    public boolean n;
    public final int o;
    public int p;
    public final int q;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.m = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0700wl.c, 0, 0);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.InterfaceC0370m0
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.InterfaceC0370m0
    public final boolean b() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.g.getIcon() == null;
    }

    @Override // defpackage.Mi
    public final void c(C0759yi c0759yi) {
        this.g = c0759yi;
        setIcon(c0759yi.getIcon());
        setTitle(c0759yi.getTitleCondensed());
        setId(c0759yi.a);
        setVisibility(c0759yi.isVisible() ? 0 : 8);
        setEnabled(c0759yi.isEnabled());
        if (c0759yi.hasSubMenu() && this.k == null) {
            this.k = new C0124e0(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.Mi
    public C0759yi getItemData() {
        return this.g;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.h);
        if (this.i != null && ((this.g.y & 4) != 4 || (!this.m && !this.n))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.h : null);
        CharSequence charSequence = this.g.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.g.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.g.r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC0059br.a(this, z3 ? null : this.g.e);
        } else {
            AbstractC0059br.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0573si interfaceC0573si = this.j;
        if (interfaceC0573si != null) {
            interfaceC0573si.a(this.g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m = h();
        i();
    }

    @Override // defpackage.C2, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.o;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (z || this.i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0124e0 c0124e0;
        if (this.g.hasSubMenu() && (c0124e0 = this.k) != null && c0124e0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.n != z) {
            this.n = z;
            C0759yi c0759yi = this.g;
            if (c0759yi != null) {
                MenuC0604ti menuC0604ti = c0759yi.n;
                menuC0604ti.k = true;
                menuC0604ti.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(InterfaceC0573si interfaceC0573si) {
        this.j = interfaceC0573si;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0155f0 abstractC0155f0) {
        this.l = abstractC0155f0;
    }

    public void setTitle(CharSequence charSequence) {
        this.h = charSequence;
        i();
    }
}
