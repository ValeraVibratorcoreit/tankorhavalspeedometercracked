package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class J8 implements Runnable {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ J8() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                C0118dp c0118dp = (C0118dp) this.c;
                if (list.contains(c0118dp)) {
                    list.remove(c0118dp);
                    ((O8) this.d).getClass();
                    Vo.a(c0118dp.c.E, c0118dp.a);
                }
                break;
            case 1:
                try {
                    objCall = ((Callable) this.b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.d).post(new RunnableC0248i0(4, (C0260ic) ((InterfaceC0748y7) this.c), objCall, false));
                break;
            default:
                Et.h((View) this.b, (C0426np) this.c);
                ((ValueAnimator) this.d).start();
                break;
        }
    }

    public J8(O8 o8, ArrayList arrayList, C0118dp c0118dp) {
        this.d = o8;
        this.b = arrayList;
        this.c = c0118dp;
    }

    public J8(View view, It it, C0426np c0426np, ValueAnimator valueAnimator) {
        this.b = view;
        this.c = c0426np;
        this.d = valueAnimator;
    }
}
