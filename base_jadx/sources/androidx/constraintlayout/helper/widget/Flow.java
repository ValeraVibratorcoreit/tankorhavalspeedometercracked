package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.AbstractC0422nl;
import defpackage.AbstractC0461ot;
import defpackage.C0075cc;
import defpackage.C0343l4;
import defpackage.C0655v7;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC0461ot {
    public C0075cc j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.g = new HashMap();
        this.c = context;
        g(attributeSet);
    }

    @Override // defpackage.AbstractC0461ot, defpackage.AbstractC0284j7
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        C0075cc c0075cc = new C0075cc();
        c0075cc.s0 = 0;
        c0075cc.t0 = 0;
        c0075cc.u0 = 0;
        c0075cc.v0 = 0;
        c0075cc.w0 = 0;
        c0075cc.x0 = 0;
        c0075cc.y0 = false;
        c0075cc.z0 = 0;
        c0075cc.A0 = 0;
        c0075cc.B0 = new C0343l4();
        c0075cc.C0 = null;
        c0075cc.D0 = -1;
        c0075cc.E0 = -1;
        c0075cc.F0 = -1;
        c0075cc.G0 = -1;
        c0075cc.H0 = -1;
        c0075cc.I0 = -1;
        c0075cc.J0 = 0.5f;
        c0075cc.K0 = 0.5f;
        c0075cc.L0 = 0.5f;
        c0075cc.M0 = 0.5f;
        c0075cc.N0 = 0.5f;
        c0075cc.O0 = 0.5f;
        c0075cc.P0 = 0;
        c0075cc.Q0 = 0;
        c0075cc.R0 = 2;
        c0075cc.S0 = 2;
        c0075cc.T0 = 0;
        c0075cc.U0 = -1;
        c0075cc.V0 = 0;
        c0075cc.W0 = new ArrayList();
        c0075cc.X0 = null;
        c0075cc.Y0 = null;
        c0075cc.Z0 = null;
        c0075cc.b1 = 0;
        this.j = c0075cc;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0422nl.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.j.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C0075cc c0075cc2 = this.j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0075cc2.s0 = dimensionPixelSize;
                    c0075cc2.t0 = dimensionPixelSize;
                    c0075cc2.u0 = dimensionPixelSize;
                    c0075cc2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C0075cc c0075cc3 = this.j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0075cc3.u0 = dimensionPixelSize2;
                    c0075cc3.w0 = dimensionPixelSize2;
                    c0075cc3.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.j.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.j.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.j.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.j.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.j.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.j.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.j.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.j.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.j.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.j.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.j.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.j.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.j.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.j.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.j.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.j.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.j.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.j.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.j.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.j.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.j.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.j.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.j.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.j;
        i();
    }

    @Override // defpackage.AbstractC0284j7
    public final void h(C0655v7 c0655v7, boolean z) {
        C0075cc c0075cc = this.j;
        int i = c0075cc.u0;
        if (i > 0 || c0075cc.v0 > 0) {
            if (z) {
                c0075cc.w0 = c0075cc.v0;
                c0075cc.x0 = i;
            } else {
                c0075cc.w0 = i;
                c0075cc.x0 = c0075cc.v0;
            }
        }
    }

    @Override // defpackage.AbstractC0461ot
    public final void j(C0075cc c0075cc, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c0075cc == null) {
            setMeasuredDimension(0, 0);
        } else {
            c0075cc.V(mode, size, mode2, size2);
            setMeasuredDimension(c0075cc.z0, c0075cc.A0);
        }
    }

    @Override // defpackage.AbstractC0284j7, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.j, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.j.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.j.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.j.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.j.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.j.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.j.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.j.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.j.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.j.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.j.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.j.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.j.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.j.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.j.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0075cc c0075cc = this.j;
        c0075cc.s0 = i;
        c0075cc.t0 = i;
        c0075cc.u0 = i;
        c0075cc.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.j.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.j.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.j.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.j.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.j.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.j.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.j.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.j.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.j.T0 = i;
        requestLayout();
    }
}
