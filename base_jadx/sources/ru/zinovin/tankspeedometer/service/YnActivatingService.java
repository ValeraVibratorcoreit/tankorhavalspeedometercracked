package ru.zinovin.tankspeedometer.service;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import defpackage.AbstractC0390mk;
import defpackage.C0768yr;
import defpackage.Lf;
import defpackage.RunnableC0591t5;
import defpackage.Sf;
import java.util.Objects;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class YnActivatingService extends Service {
    public static final /* synthetic */ int d = 0;
    public SharedPreferences a;
    public boolean b;
    public final RunnableC0591t5 c;

    public YnActivatingService() {
        Lf.a();
        this.b = false;
        this.c = new RunnableC0591t5(this, 24);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        C0768yr.e("T500.YN_ACTIVATE", "YnActivatingService.onCreate()");
        this.b = false;
        super.onCreate();
        this.a = AbstractC0390mk.l(this);
        new Timer().schedule(new Sf(this, 4), 0L, 15000L);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            if (Objects.equals(intent.getAction(), "ACTION_STOP_SERVICE")) {
                C0768yr.e("T500.YN_ACTIVATE", "ACTION_STOP_SERVICE received");
                this.b = true;
            } else if (Objects.equals(intent.getAction(), "ACTION_START_OR_RESUME_SERVICE")) {
                C0768yr.e("T500.YN_ACTIVATE", "ACTION_START_SERVICE received");
                this.b = false;
            }
        }
        return 1;
    }
}
