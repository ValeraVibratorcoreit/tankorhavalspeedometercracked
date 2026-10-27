package ru.zinovin.tankspeedometer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0318ka;
import defpackage.AbstractC0402n1;
import defpackage.C0768yr;
import ru.zinovin.tankspeedometer.service.TboxMonitorService;

/* JADX INFO: loaded from: classes.dex */
public class ServicesStartActivity extends AbstractActivityC0495q1 {
    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0768yr.e("T500.SERVICE", "ServicesStartActivity.onCreate()");
        AbstractC0318ka.a(this);
        setContentView(R.layout.start_activity);
        C0768yr.e("T500.UTILS", "startTboxService() called");
        Context contextA = AbstractC0402n1.a();
        Intent intent = new Intent(contextA, (Class<?>) TboxMonitorService.class);
        intent.setAction("ACTION_START_OR_RESUME_SERVICE");
        contextA.startService(intent);
        finish();
    }
}
