package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0142ei extends C0126e2 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iJ = AbstractC0390mk.j(this, ru.zinovin.tankspeedometer.R.attr.colorControlActivated);
            int iJ2 = AbstractC0390mk.j(this, ru.zinovin.tankspeedometer.R.attr.colorOnSurface);
            int iJ3 = AbstractC0390mk.j(this, ru.zinovin.tankspeedometer.R.attr.colorSurface);
            this.e = new ColorStateList(g, new int[]{AbstractC0390mk.u(iJ3, iJ, 1.0f), AbstractC0390mk.u(iJ3, iJ2, 0.54f), AbstractC0390mk.u(iJ3, iJ2, 0.38f), AbstractC0390mk.u(iJ3, iJ2, 0.38f)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && R6.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            R6.c(this, getMaterialThemeColorsTintList());
        } else {
            R6.c(this, null);
        }
    }
}
