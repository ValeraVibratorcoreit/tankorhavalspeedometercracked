package ru.zinovin.tankspeedometer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.C0768yr;
import defpackage.Lf;
import defpackage.RunnableC0591t5;
import defpackage.Sf;
import java.util.Objects;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class InternetMonitorService extends Service {
    public static final /* synthetic */ int d = 0;
    public Timer b;
    public final Lf a = Lf.a();
    public final RunnableC0591t5 c = new RunnableC0591t5(this, 11);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        C0768yr.e("T500.INET", "InternetMonitorService.onCreate()");
        super.onCreate();
        Timer timer = new Timer();
        this.b = timer;
        timer.schedule(new Sf(this, 0), 0L, 15000L);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !Objects.equals(intent.getAction(), "ACTION_STOP_SERVICE")) {
            return 1;
        }
        C0768yr.e("T500.INET", "ACTION_STOP_SERVICE received");
        this.b.cancel();
        this.b.purge();
        stopSelf();
        return 1;
    }
}
