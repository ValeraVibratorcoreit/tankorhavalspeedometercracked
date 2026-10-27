package defpackage;

import android.content.Context;
import android.view.View;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186g0 extends Fi {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ C0339l0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186g0(C0339l0 c0339l0, Context context, MenuC0604ti menuC0604ti, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, menuC0604ti, context, view, true);
        this.n = c0339l0;
        this.g = 8388613;
        C0308k0 c0308k0 = c0339l0.w;
        this.i = c0308k0;
        Di di = this.j;
        if (di != null) {
            di.f(c0308k0);
        }
    }

    @Override // defpackage.Fi
    public final void c() {
        switch (this.m) {
            case 0:
                this.n.t = null;
                super.c();
                break;
            default:
                C0339l0 c0339l0 = this.n;
                MenuC0604ti menuC0604ti = c0339l0.c;
                if (menuC0604ti != null) {
                    menuC0604ti.c(true);
                }
                c0339l0.s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186g0(C0339l0 c0339l0, Context context, Np np, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, np, context, view, false);
        this.n = c0339l0;
        if (!np.A.f()) {
            View view2 = c0339l0.i;
            this.f = view2 == null ? (View) c0339l0.h : view2;
        }
        C0308k0 c0308k0 = c0339l0.w;
        this.i = c0308k0;
        Di di = this.j;
        if (di != null) {
            di.f(c0308k0);
        }
    }
}
