package ru.zinovin.tankspeedometer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0318ka;
import defpackage.AbstractC0402n1;
import defpackage.C0714x4;
import defpackage.C0768yr;
import defpackage.Lf;
import defpackage.Tf;
import defpackage.Ud;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class StartActivity extends AbstractActivityC0495q1 {
    public final Lf y = Lf.a();

    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        String string;
        super.onCreate(bundle);
        C0768yr.e("T500.START", "StartActivity.onCreate()");
        AbstractC0318ka.a(this);
        setContentView(R.layout.start_activity);
        if (!Settings.canDrawOverlays(this)) {
            Toast.makeText(this, getString(R.string.text_overlay_perm_msg), 1).show();
        } else if (Ud.J()) {
            new Timer().schedule(new C0714x4(2), ((long) (Math.random() * 300000)) + 300000);
            boolean z3 = false;
            if (Boolean.TRUE.equals((Boolean) Tf.q("CheckPeriod.class", new Object[0]).a)) {
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    string = extras.getString("ipType", "1");
                    boolean z4 = extras.getBoolean("useNavi", false);
                    z2 = extras.getBoolean("naviFullscreen", false);
                    z = extras.getBoolean("musicAutoPlay", false);
                    z3 = z4;
                } else {
                    z = false;
                    z2 = false;
                    string = "1";
                }
                Lf lf = this.y;
                lf.u.f(string);
                lf.i(Boolean.valueOf(z3));
                lf.w.f(Boolean.valueOf(z2));
                lf.y.f(Boolean.valueOf(z));
                C0768yr.e("T500.START", "ipType=" + string);
                C0768yr.e("T500.START", "useNavi=" + z3);
                C0768yr.e("T500.START", "naviFullScreen=" + z2);
                C0768yr.e("T500.START", "musicAutoPlay=" + z);
                Class cls = string.equals("1") ? BasicInstrumentalPanel.class : SpedometerPanel.class;
                Context contextA = AbstractC0402n1.a();
                try {
                    contextA.startService(new Intent(contextA, (Class<?>) cls));
                } catch (Exception e) {
                    Toast.makeText(contextA, "ERROR " + e, 1).show();
                    C0768yr.c("T500.ERROR", "ERROR in startIpActivity()", e);
                }
            } else {
                Toast.makeText(this, getString(R.string.text_demo_period_expired_msg), 1).show();
            }
        } else {
            Toast.makeText(this, getString(R.string.text_usage_access_perm_msg), 1).show();
        }
        finish();
    }
}
