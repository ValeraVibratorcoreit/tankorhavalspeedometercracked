package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Lh extends Q0 {
    public final C0204gi c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public Lh(Context context) {
        TypedValue typedValueR = Tf.R(context, R.attr.materialAlertDialogTheme);
        int i = typedValueR == null ? 0 : typedValueR.data;
        Context contextQ = Td.Q(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextQ = i != 0 ? new J7(contextQ, i) : contextQ;
        TypedValue typedValueR2 = Tf.R(context, R.attr.materialAlertDialogTheme);
        super(contextQ, typedValueR2 == null ? 0 : typedValueR2.data);
        Context context2 = ((M0) this.b).a;
        Resources.Theme theme = context2.getTheme();
        int[] iArr = AbstractC0638ul.j;
        AbstractC0390mk.b(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        AbstractC0390mk.c(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.d = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue typedValueT = Tf.T(R.attr.colorSurface, context2, Lh.class.getCanonicalName());
        int i2 = typedValueT.resourceId;
        int iA = i2 != 0 ? I7.a(context2, i2) : typedValueT.data;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iA);
        typedArrayObtainStyledAttributes2.recycle();
        C0204gi c0204gi = new C0204gi(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        c0204gi.j(context2);
        c0204gi.l(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(((M0) this.b).a.getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            C0456oo c0456ooE = c0204gi.a.a.e();
            c0456ooE.e = new C0247i(dimension);
            c0456ooE.f = new C0247i(dimension);
            c0456ooE.g = new C0247i(dimension);
            c0456ooE.h = new C0247i(dimension);
            c0204gi.setShapeAppearanceModel(c0456ooE.a());
        }
        this.c = c0204gi;
    }

    @Override // defpackage.Q0
    public final R0 b() {
        R0 r0B = super.b();
        Window window = r0B.getWindow();
        View decorView = window.getDecorView();
        C0204gi c0204gi = this.c;
        if (c0204gi instanceof C0204gi) {
            WeakHashMap weakHashMap = Gs.a;
            c0204gi.k(AbstractC0676vs.i(decorView));
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c0204gi, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new Ff(r0B, rect));
        return r0B;
    }

    @Override // defpackage.Q0
    public final Q0 d(int i, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // defpackage.Q0
    public final Q0 e(int i, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // defpackage.Q0
    public final Q0 f(int i) {
        throw null;
    }

    public final void h() {
        M0 m0 = (M0) this.b;
        m0.f = m0.a.getText(R.string.text_timeout_message);
    }

    public final void i(int i, DialogInterface.OnClickListener onClickListener) {
        super.d(i, onClickListener);
    }

    public final void j(DialogInterface.OnClickListener onClickListener) {
        super.e(R.string.text_retry, onClickListener);
    }

    public final void k(int i) {
        super.f(i);
    }
}
