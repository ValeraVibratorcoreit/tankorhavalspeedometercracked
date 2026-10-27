package ru.zinovin.tankspeedometer;

import android.os.Bundle;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0318ka;
import defpackage.C0768yr;

/* JADX INFO: loaded from: classes.dex */
public class FakeActivity extends AbstractActivityC0495q1 {
    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0768yr.e("T500.FAKE", "onCreate() start");
        AbstractC0318ka.a(this);
        setContentView(R.layout.start_activity);
        finish();
    }
}
