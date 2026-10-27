package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.C0346l7;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        C0346l7 c0346l7 = (C0346l7) getLayoutParams();
        if (this.a && c0346l7.a == i) {
            return;
        }
        c0346l7.a = i;
        setLayoutParams(c0346l7);
    }

    public void setGuidelineEnd(int i) {
        C0346l7 c0346l7 = (C0346l7) getLayoutParams();
        if (this.a && c0346l7.b == i) {
            return;
        }
        c0346l7.b = i;
        setLayoutParams(c0346l7);
    }

    public void setGuidelinePercent(float f) {
        C0346l7 c0346l7 = (C0346l7) getLayoutParams();
        if (this.a && c0346l7.c == f) {
            return;
        }
        c0346l7.c = f;
        setLayoutParams(c0346l7);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }
}
