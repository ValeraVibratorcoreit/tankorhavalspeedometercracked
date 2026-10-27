package defpackage;

import android.graphics.Typeface;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.service.TboxMonitorService;

/* JADX INFO: renamed from: i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0248i0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0248i0(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0542ri interfaceC0542ri;
        switch (this.a) {
            case 0:
                C0339l0 c0339l0 = (C0339l0) this.c;
                MenuC0604ti menuC0604ti = c0339l0.c;
                if (menuC0604ti != null && (interfaceC0542ri = menuC0604ti.e) != null) {
                    interfaceC0542ri.k(menuC0604ti);
                }
                View view = (View) c0339l0.h;
                if (view != null && view.getWindowToken() != null) {
                    C0186g0 c0186g0 = (C0186g0) this.b;
                    if (c0186g0.b()) {
                        c0339l0.s = c0186g0;
                    } else if (c0186g0.f != null) {
                        c0186g0.d(0, 0, false, false);
                        c0339l0.s = c0186g0;
                    }
                }
                c0339l0.u = null;
                break;
            case 1:
                Br br = (Br) ((Vi) this.b).a;
                if (br != null) {
                    br.P((Typeface) this.c);
                }
                break;
            case 2:
                C0477pe c0477peA = C0477pe.a();
                c0477peA.getClass();
                Qr.a();
                c0477peA.d.set(true);
                ((Xb) this.c).b.b = true;
                ((Xb) this.c).a.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener) this.b);
                ((Xb) this.c).b.a.clear();
                break;
            case 3:
                Yd yd = (Yd) this.c;
                if (yd.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.b).run();
                } catch (Throwable th) {
                    yd.c.y(th);
                    return;
                }
                break;
            case 4:
                ((InterfaceC0748y7) this.b).accept(this.c);
                break;
            case 5:
                Ks ks = ((SwipeDismissBehavior) this.c).a;
                if (ks != null && ks.f()) {
                    WeakHashMap weakHashMap = Gs.a;
                    ((View) this.b).postOnAnimation(this);
                    break;
                }
                break;
            default:
                Toast.makeText((TboxMonitorService) this.c, (String) this.b, 1).show();
                break;
        }
    }

    public /* synthetic */ RunnableC0248i0(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public RunnableC0248i0(TboxMonitorService tboxMonitorService) {
        this.a = 6;
        this.c = tboxMonitorService;
        this.b = "TBOX правило отсутствует. Включаем блокировку";
    }

    public RunnableC0248i0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 5;
        this.c = swipeDismissBehavior;
        this.b = view;
    }
}
