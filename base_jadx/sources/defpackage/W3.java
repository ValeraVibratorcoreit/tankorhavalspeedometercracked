package defpackage;

import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class W3 extends AbstractC0284j7 {
    public int h;
    public int i;
    public X3 j;

    @Override // defpackage.AbstractC0284j7
    public final void g(AttributeSet attributeSet) {
        X3 x3 = new X3();
        x3.s0 = 0;
        x3.t0 = true;
        x3.u0 = 0;
        x3.v0 = false;
        this.j = x3;
        this.d = x3;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.j.t0;
    }

    public int getMargin() {
        return this.j.u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // defpackage.AbstractC0284j7
    public final void h(C0655v7 c0655v7, boolean z) {
        int i = this.h;
        this.i = i;
        if (z) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (c0655v7 instanceof X3) {
            ((X3) c0655v7).s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.t0 = z;
    }

    public void setDpMargin(int i) {
        this.j.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.j.u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
