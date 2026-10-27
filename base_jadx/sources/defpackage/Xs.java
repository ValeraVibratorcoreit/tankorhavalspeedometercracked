package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Xs {
    public Interpolator c;
    public Ys d;
    public boolean e;
    public long b = -1;
    public final Zq f = new Zq(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Ws) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (Ws ws : this.a) {
            long j = this.b;
            if (j >= 0) {
                ws.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) ws.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                ws.d(this.f);
            }
            View view2 = (View) ws.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
