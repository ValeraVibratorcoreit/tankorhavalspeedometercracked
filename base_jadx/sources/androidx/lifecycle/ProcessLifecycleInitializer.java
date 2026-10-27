package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.AbstractC0757yg;
import defpackage.C0726xg;
import defpackage.Cf;
import defpackage.EnumC0602tg;
import defpackage.K2;
import defpackage.Sa;
import defpackage.Tf;
import defpackage.Yk;
import defpackage.Zk;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements Cf {
    @Override // defpackage.Cf
    public final List a() {
        return Sa.a;
    }

    @Override // defpackage.Cf
    public final Object b(Context context) {
        Tf.j("context", context);
        K2 k2V = K2.v(context);
        Tf.i("getInstance(context)", k2V);
        if (!((HashSet) k2V.c).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        if (!AbstractC0757yg.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Tf.g("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0726xg());
        }
        Zk zk = Zk.i;
        zk.getClass();
        zk.e = new Handler();
        zk.f.e(EnumC0602tg.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Tf.g("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new Yk(zk));
        return zk;
    }
}
