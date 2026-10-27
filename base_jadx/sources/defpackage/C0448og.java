package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0448og extends Ud {
    public final /* synthetic */ int h;
    public final SideSheetBehavior i;

    public /* synthetic */ C0448og(SideSheetBehavior sideSheetBehavior, int i) {
        this.h = i;
        this.i = sideSheetBehavior;
    }

    @Override // defpackage.Ud
    public final int B(View view) {
        switch (this.h) {
            case 0:
                return view.getRight() + this.i.o;
            default:
                return view.getLeft() - this.i.o;
        }
    }

    @Override // defpackage.Ud
    public final int C(CoordinatorLayout coordinatorLayout) {
        switch (this.h) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.Ud
    public final int E() {
        switch (this.h) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.Ud
    public final boolean M(float f) {
        switch (this.h) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // defpackage.Ud
    public final boolean P(View view) {
        switch (this.h) {
            case 0:
                return view.getRight() < (s() - t()) / 2;
            default:
                return view.getLeft() > (s() + this.i.m) / 2;
        }
    }

    @Override // defpackage.Ud
    public final boolean Q(float f, float f2) {
        switch (this.h) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs = Math.abs(f);
                    this.i.getClass();
                    if (fAbs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float fAbs2 = Math.abs(f);
                    this.i.getClass();
                    if (fAbs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.Ud
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.h) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.Ud
    public final float e(int i) {
        switch (this.h) {
            case 0:
                float fT = t();
                return (i - fT) / (s() - fT);
            default:
                float f = this.i.m;
                return (f - i) / (f - s());
        }
    }

    @Override // defpackage.Ud
    public final boolean k0(View view, float f) {
        switch (this.h) {
            case 0:
                return Math.abs((f * this.i.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * this.i.k) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // defpackage.Ud
    public final void r0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.h) {
            case 0:
                if (i <= this.i.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.i.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // defpackage.Ud
    public final int s() {
        switch (this.h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.i;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.i;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // defpackage.Ud
    public final int t() {
        switch (this.h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.i;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.i.m;
        }
    }

    @Override // defpackage.Ud
    public final int x() {
        switch (this.h) {
            case 0:
                return this.i.o;
            default:
                return this.i.m;
        }
    }

    @Override // defpackage.Ud
    public final int y() {
        switch (this.h) {
            case 0:
                return -this.i.l;
            default:
                return s();
        }
    }
}
