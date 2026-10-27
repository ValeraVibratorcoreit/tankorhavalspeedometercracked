package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192g6 extends AbstractC0105db {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final ViewOnClickListenerC0069c6 j;
    public final ViewOnFocusChangeListenerC0100d6 k;
    public AnimatorSet l;
    public ValueAnimator m;

    public C0192g6(C0074cb c0074cb) {
        super(c0074cb);
        this.j = new ViewOnClickListenerC0069c6(this, 0);
        this.k = new ViewOnFocusChangeListenerC0100d6(this, 0);
        this.e = Br.h0(c0074cb.getContext(), R.attr.motionDurationShort3, 100);
        this.f = Br.h0(c0074cb.getContext(), R.attr.motionDurationShort3, 150);
        this.g = Br.i0(c0074cb.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0340l1.a);
        this.h = Br.i0(c0074cb.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0340l1.d);
    }

    @Override // defpackage.AbstractC0105db
    public final void a() {
        if (this.b.p != null) {
            return;
        }
        t(u());
    }

    @Override // defpackage.AbstractC0105db
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.AbstractC0105db
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.AbstractC0105db
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.AbstractC0105db
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.AbstractC0105db
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.AbstractC0105db
    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // defpackage.AbstractC0105db
    public final void p(boolean z) {
        if (this.b.p == null) {
            return;
        }
        t(z);
    }

    @Override // defpackage.AbstractC0105db
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e6
            public final /* synthetic */ C0192g6 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0192g6 c0192g6 = this.b;
                        c0192g6.getClass();
                        c0192g6.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0192g6 c0192g7 = this.b;
                        c0192g7.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0192g7.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.e;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e6
            public final /* synthetic */ C0192g6 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0192g6 c0192g6 = this.b;
                        c0192g6.getClass();
                        c0192g6.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0192g6 c0192g7 = this.b;
                        c0192g7.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0192g7.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new C0161f6(this, i2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e6
            public final /* synthetic */ C0192g6 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0192g6 c0192g6 = this.b;
                        c0192g6.getClass();
                        c0192g6.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0192g6 c0192g7 = this.b;
                        c0192g7.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0192g7.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0161f6(this, i));
    }

    @Override // defpackage.AbstractC0105db
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new RunnableC0591t5(this, 1));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
