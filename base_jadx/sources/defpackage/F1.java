package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class F1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ R1 b;

    public /* synthetic */ F1(R1 r1, int i) {
        this.a = i;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                R1 r1 = this.b;
                if ((r1.a0 & 1) != 0) {
                    r1.v(0);
                }
                if ((r1.a0 & 4096) != 0) {
                    r1.v(108);
                }
                r1.Z = false;
                r1.a0 = 0;
                break;
            default:
                R1 r2 = this.b;
                r2.w.showAtLocation(r2.v, 55, 0, 0);
                Ws ws = r2.y;
                if (ws != null) {
                    ws.b();
                }
                if (!(r2.A && (viewGroup = r2.B) != null && viewGroup.isLaidOut())) {
                    r2.v.setAlpha(1.0f);
                    r2.v.setVisibility(0);
                } else {
                    r2.v.setAlpha(0.0f);
                    Ws wsA = Gs.a(r2.v);
                    wsA.a(1.0f);
                    r2.y = wsA;
                    wsA.d(new H1(this, 0));
                }
                break;
        }
    }
}
