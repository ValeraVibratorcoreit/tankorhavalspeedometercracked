package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0250i2 extends C0096d2 {
    public final SeekBar e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;

    public C0250i2(SeekBar seekBar) {
        super(seekBar);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = seekBar;
    }

    @Override // defpackage.C0096d2
    public final void O(AttributeSet attributeSet, int i) {
        super.O(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.e;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC0700wl.g;
        K2 k2G = K2.G(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        Gs.i(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) k2G.b, R.attr.seekBarStyle);
        Drawable drawableR = k2G.r(0);
        if (drawableR != null) {
            seekBar.setThumb(drawableR);
        }
        Drawable drawableQ = k2G.q(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = drawableQ;
        if (drawableQ != null) {
            drawableQ.setCallback(seekBar);
            P9.b(drawableQ, seekBar.getLayoutDirection());
            if (drawableQ.isStateful()) {
                drawableQ.setState(seekBar.getDrawableState());
            }
            Z();
        }
        seekBar.invalidate();
        TypedArray typedArray = (TypedArray) k2G.b;
        if (typedArray.hasValue(3)) {
            this.h = W9.c(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = k2G.p(2);
            this.i = true;
        }
        k2G.J();
        Z();
    }

    public final void Z() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    O9.h(drawableMutate, this.g);
                }
                if (this.j) {
                    O9.i(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(this.e.getDrawableState());
                }
            }
        }
    }

    public final void a0(Canvas canvas) {
        if (this.f != null) {
            SeekBar seekBar = this.e;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f.getIntrinsicWidth();
                int intrinsicHeight = this.f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i, -i2, i, i2);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
