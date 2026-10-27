package ru.zinovin.tankspeedometer;

import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractActivityC0495q1;

/* JADX INFO: loaded from: classes.dex */
public class BackupActivity extends AbstractActivityC0495q1 {
    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("ts_target_section", "setting_manage");
        intent.putExtra("ts_target_tab", 2);
        intent.addFlags(603979776);
        startActivity(intent);
        finish();
    }
}
