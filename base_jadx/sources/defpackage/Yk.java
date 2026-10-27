package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class Yk extends Qa {
    final /* synthetic */ Zk this$0;

    public Yk(Zk zk) {
        this.this$0 = zk;
    }

    @Override // defpackage.Qa, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Tf.j("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0701wm.b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Tf.g("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", fragmentFindFragmentByTag);
            ((FragmentC0701wm) fragmentFindFragmentByTag).a = this.this$0.h;
        }
    }

    @Override // defpackage.Qa, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Tf.j("activity", activity);
        Zk zk = this.this$0;
        int i = zk.b - 1;
        zk.b = i;
        if (i == 0) {
            Handler handler = zk.e;
            Tf.f(handler);
            handler.postDelayed(zk.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Tf.j("activity", activity);
        Wk.a(activity, new Xk(this.this$0));
    }

    @Override // defpackage.Qa, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Tf.j("activity", activity);
        Zk zk = this.this$0;
        int i = zk.a - 1;
        zk.a = i;
        if (i == 0 && zk.c) {
            zk.f.e(EnumC0602tg.ON_STOP);
            zk.d = true;
        }
    }
}
