package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class A4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0204gi c0204gi = ((BottomSheetBehavior) this.b).i;
                if (c0204gi != null) {
                    C0173fi c0173fi = c0204gi.a;
                    if (c0173fi.j != fFloatValue) {
                        c0173fi.j = fFloatValue;
                        c0204gi.e = true;
                        c0204gi.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                Qb qb = (Qb) this.b;
                qb.c.setAlpha(iFloatValue);
                qb.d.setAlpha(iFloatValue);
                qb.s.invalidate();
                break;
            case 2:
                ((TabLayout) this.b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            default:
                ((TextInputLayout) this.b).v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
