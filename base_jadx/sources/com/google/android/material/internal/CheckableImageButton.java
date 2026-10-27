package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.Gs;
import defpackage.M5;
import defpackage.N5;
import defpackage.Y1;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends Y1 implements Checkable {
    public static final int[] g = {R.attr.state_checked};
    public boolean d;
    public boolean e;
    public boolean f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.zinovin.tankspeedometer.R.attr.imageButtonStyle);
        this.e = true;
        this.f = true;
        Gs.j(this, new M5(this, 0));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof N5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        N5 n5 = (N5) parcelable;
        super.onRestoreInstanceState(n5.a);
        setChecked(n5.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        N5 n5 = new N5(super.onSaveInstanceState());
        n5.c = this.d;
        return n5;
    }

    public void setCheckable(boolean z) {
        if (this.e != z) {
            this.e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.e || this.d == z) {
            return;
        }
        this.d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
