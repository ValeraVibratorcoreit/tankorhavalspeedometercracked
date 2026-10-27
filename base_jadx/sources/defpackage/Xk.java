package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class Xk extends Qa {
    final /* synthetic */ Zk this$0;

    public Xk(Zk zk) {
        this.this$0 = zk;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        Tf.j("activity", activity);
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        Tf.j("activity", activity);
        Zk zk = this.this$0;
        int i = zk.a + 1;
        zk.a = i;
        if (i == 1 && zk.d) {
            zk.f.e(EnumC0602tg.ON_START);
            zk.d = false;
        }
    }
}
