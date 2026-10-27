package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class Vr extends Yr {
    public Z1 e;
    public float f;
    public Z1 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public Paint.Cap m;
    public Paint.Join n;
    public float o;

    @Override // defpackage.Xr
    public final boolean a() {
        return this.g.c() || this.e.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // defpackage.Xr
    public final boolean b(int[] iArr) {
        boolean z;
        Z1 z1 = this.g;
        boolean z2 = false;
        if (z1.c()) {
            ColorStateList colorStateList = (ColorStateList) z1.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != z1.b) {
                z1.b = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Z1 z3 = this.e;
        if (z3.c()) {
            ColorStateList colorStateList2 = (ColorStateList) z3.d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != z3.b) {
                z3.b = colorForState2;
                z2 = true;
            }
        }
        return z | z2;
    }

    public float getFillAlpha() {
        return this.i;
    }

    public int getFillColor() {
        return this.g.b;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public int getStrokeColor() {
        return this.e.b;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getTrimPathEnd() {
        return this.k;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public float getTrimPathStart() {
        return this.j;
    }

    public void setFillAlpha(float f) {
        this.i = f;
    }

    public void setFillColor(int i) {
        this.g.b = i;
    }

    public void setStrokeAlpha(float f) {
        this.h = f;
    }

    public void setStrokeColor(int i) {
        this.e.b = i;
    }

    public void setStrokeWidth(float f) {
        this.f = f;
    }

    public void setTrimPathEnd(float f) {
        this.k = f;
    }

    public void setTrimPathOffset(float f) {
        this.l = f;
    }

    public void setTrimPathStart(float f) {
        this.j = f;
    }
}
