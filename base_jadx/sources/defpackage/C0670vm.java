package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0670vm implements Application.ActivityLifecycleCallbacks {
    public static final C0639um Companion = new C0639um();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        Tf.j("activity", activity);
        activity.registerActivityLifecycleCallbacks(new C0670vm());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Tf.j("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Tf.j("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Tf.j("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        Tf.j("activity", activity);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.h(activity, EnumC0602tg.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        Tf.j("activity", activity);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.h(activity, EnumC0602tg.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        Tf.j("activity", activity);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.h(activity, EnumC0602tg.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        Tf.j("activity", activity);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.h(activity, EnumC0602tg.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        Tf.j("activity", activity);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.h(activity, EnumC0602tg.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        Tf.j("activity", activity);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.h(activity, EnumC0602tg.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Tf.j("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Tf.j("activity", activity);
        Tf.j("bundle", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Tf.j("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Tf.j("activity", activity);
    }
}
