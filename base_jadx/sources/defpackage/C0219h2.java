package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0219h2 extends SeekBar {
    public final C0250i2 a;

    public C0219h2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        Cq.a(this, getContext());
        C0250i2 c0250i2 = new C0250i2(this);
        this.a = c0250i2;
        c0250i2.O(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0250i2 c0250i2 = this.a;
        Drawable drawable = c0250i2.f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = c0250i2.e;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.a0(canvas);
    }
}
