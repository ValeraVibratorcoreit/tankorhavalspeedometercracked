package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0399mt extends C0368lt {
    @Override // defpackage.C0368lt
    public final void B0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.C0368lt
    public final void C0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.Br
    public final float D(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.C0368lt
    public final void D0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.Br
    public final void n0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.C0368lt, defpackage.Br
    public final void o0(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
