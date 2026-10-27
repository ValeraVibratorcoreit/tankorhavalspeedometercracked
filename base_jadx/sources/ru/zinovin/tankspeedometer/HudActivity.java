package ru.zinovin.tankspeedometer;

import android.content.IntentFilter;
import android.os.Bundle;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0318ka;
import defpackage.C0768yr;
import defpackage.O1;

/* JADX INFO: loaded from: classes.dex */
public class HudActivity extends AbstractActivityC0495q1 {
    public final O1 y = new O1(this, 1);

    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0768yr.e("T500.HUD", "HudActivity.onCreate()");
        setContentView(R.layout.hud_activity);
        AbstractC0318ka.a(this);
        findViewById(R.id.hud_main).setVisibility(4);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_NAVI_SPEEDLIMIT");
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER");
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_NAVI_ETA");
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_HUD_STOP");
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER_VISIBILITY");
        registerReceiver(this.y, intentFilter, "ru.zinovin.tankspeedometer.NAVI_GUIDANCE_PERMISSION", null);
    }

    @Override // defpackage.AbstractActivityC0495q1, android.app.Activity
    public final void onDestroy() {
        C0768yr.e("T500.HUD", "onDestroy() call");
        unregisterReceiver(this.y);
        super.onDestroy();
    }
}
