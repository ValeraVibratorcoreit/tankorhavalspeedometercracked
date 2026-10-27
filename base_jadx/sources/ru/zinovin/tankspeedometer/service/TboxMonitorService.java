package ru.zinovin.tankspeedometer.service;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0402n1;
import defpackage.C0768yr;
import defpackage.RunnableC0591t5;
import defpackage.Sf;
import java.util.Objects;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class TboxMonitorService extends Service {
    public static final /* synthetic */ int d = 0;
    public Timer a;
    public SharedPreferences b;
    public final RunnableC0591t5 c = new RunnableC0591t5(this, 21);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        C0768yr.e("T500.TBOX", "TboxMonitorService.onCreate()");
        super.onCreate();
        this.b = AbstractC0390mk.l(AbstractC0402n1.a());
        Timer timer = new Timer();
        this.a = timer;
        timer.schedule(new Sf(this, 3), 0L, 30000L);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !Objects.equals(intent.getAction(), "ACTION_STOP_SERVICE")) {
            return 1;
        }
        C0768yr.e("T500.TBOX", "ACTION_STOP_SERVICE received");
        this.a.cancel();
        this.a.purge();
        stopSelf();
        return 1;
    }
}
