package ru.zinovin.tankspeedometer;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import defpackage.C0768yr;
import defpackage.RunnableC0737xr;

/* JADX INFO: loaded from: classes.dex */
public class TankSpeedometerApp extends Application implements ComponentCallbacks2 {
    public boolean a = false;

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        C0768yr c0768yr = C0768yr.g;
        if (c0768yr != null) {
            c0768yr.d.removeCallbacksAndMessages(null);
            C0768yr.g.c.quitSafely();
            C0768yr c0768yr2 = C0768yr.g;
            if (c0768yr2 == null || !c0768yr2.e.compareAndSet(false, true)) {
                return;
            }
            C0768yr c0768yr3 = C0768yr.g;
            c0768yr3.d.post(new RunnableC0737xr(c0768yr3, 1));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        C0768yr.f(this);
        C0768yr.e("T500.APP", "TankSpeedometerApp.onCreate()");
        registerComponentCallbacks(this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        C0768yr.e("T500.APP", "TankSpeedometerApp.onLowMemory()");
        a();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 80) {
            C0768yr.e("T500.APP", "TankSpeedometerApp.onTrimMemory()=" + i);
            a();
        }
    }
}
