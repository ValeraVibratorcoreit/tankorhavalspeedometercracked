package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.Gs;
import defpackage.L7;
import defpackage.Vo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends L7 {
    public ExpandableBehavior() {
    }

    @Override // defpackage.L7
    public abstract void b(View view);

    @Override // defpackage.L7
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Vo.l(view2);
        throw null;
    }

    @Override // defpackage.L7
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = Gs.a;
        if (!view.isLaidOut()) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
