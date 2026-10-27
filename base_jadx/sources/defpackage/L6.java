package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class L6 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long a = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable b;
    public boolean c;
    public final /* synthetic */ P6 d;

    public L6(AbstractActivityC0495q1 abstractActivityC0495q1) {
        this.d = abstractActivityC0495q1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Tf.j("runnable", runnable);
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        Tf.i("window.decorView", decorView);
        if (!this.c) {
            decorView.postOnAnimation(new RunnableC0591t5(this, 2));
        } else if (Tf.b(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        C0076cd c0076cd = (C0076cd) this.d.g.a();
        synchronized (c0076cd.a) {
            z = c0076cd.b;
        }
        if (z) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
