package ru.zinovin.tankspeedometer.view;

import android.content.Intent;
import android.os.Bundle;
import defpackage.AbstractActivityC0495q1;
import ru.zinovin.tankspeedometer.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public class ImageSelectionActivity extends AbstractActivityC0495q1 {
    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("ts_target_section", "setting_background");
        intent.addFlags(603979776);
        startActivity(intent);
        finish();
    }
}
