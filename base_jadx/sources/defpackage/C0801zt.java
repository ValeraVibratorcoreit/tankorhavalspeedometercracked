package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0801zt extends Zs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bt b;

    public /* synthetic */ C0801zt(Bt bt, int i) {
        this.a = i;
        this.b = bt;
    }

    @Override // defpackage.Ys
    public final void a() {
        View view;
        Bt bt = this.b;
        switch (this.a) {
            case 0:
                if (bt.x && (view = bt.p) != null) {
                    view.setTranslationY(0.0f);
                    bt.m.setTranslationY(0.0f);
                }
                bt.m.setVisibility(8);
                bt.m.setTransitioning(false);
                bt.B = null;
                InterfaceC0463p0 interfaceC0463p0 = bt.t;
                if (interfaceC0463p0 != null) {
                    interfaceC0463p0.n(bt.s);
                    bt.s = null;
                    bt.t = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = bt.l;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Gs.a;
                    AbstractC0614ts.c(actionBarOverlayLayout);
                }
                break;
            default:
                bt.B = null;
                bt.m.requestLayout();
                break;
        }
    }
}
