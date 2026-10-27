package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0157f2 extends RatingBar {
    public final C0096d2 a;

    public C0157f2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        Cq.a(this, getContext());
        C0096d2 c0096d2 = new C0096d2(this);
        this.a = c0096d2;
        c0096d2.O(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
