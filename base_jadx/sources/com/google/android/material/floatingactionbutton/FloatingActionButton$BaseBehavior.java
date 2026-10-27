package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC0638ul;
import defpackage.L7;
import defpackage.O7;
import defpackage.Vo;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends L7 {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // defpackage.L7
    public final boolean a(View view) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final void c(O7 o7) {
        if (o7.h == 0) {
            o7.h = 80;
        }
    }

    @Override // defpackage.L7
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Vo.m(view);
        throw null;
    }

    @Override // defpackage.L7
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        Vo.m(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.h);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
