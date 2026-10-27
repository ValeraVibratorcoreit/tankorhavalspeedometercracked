package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class Zk implements Dg {
    public static final Zk i = new Zk();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final Fg f = new Fg(this);
    public final RunnableC0591t5 g = new RunnableC0591t5(this, 16);
    public final Vi h = new Vi(this);

    public final void a() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.e(EnumC0602tg.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                Tf.f(handler);
                handler.removeCallbacks(this.g);
            }
        }
    }

    @Override // defpackage.Dg
    public final AbstractC0695wg getLifecycle() {
        return this.f;
    }
}
