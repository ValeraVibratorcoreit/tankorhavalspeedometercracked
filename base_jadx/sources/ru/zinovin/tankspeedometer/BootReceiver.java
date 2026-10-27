package ru.zinovin.tankspeedometer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0402n1;
import defpackage.C0714x4;
import defpackage.C0768yr;
import defpackage.Lf;
import defpackage.Td;
import defpackage.Tf;
import defpackage.Ud;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class BootReceiver extends BroadcastReceiver {
    public final Lf a = Lf.a();
    public boolean b = false;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Context context2;
        String str;
        byte b;
        Lf lf = this.a;
        try {
            if (AbstractC0402n1.a == null) {
                AbstractC0402n1.a = context.getApplicationContext();
            }
            C0768yr.f(context);
            SharedPreferences sharedPreferencesL = AbstractC0390mk.l(context);
            boolean z = sharedPreferencesL.getBoolean("autoStart", false);
            String strS = Tf.s();
            try {
                boolean z2 = strS.startsWith("0.0") || Tf.l(strS, Tf.x()) < 0;
                if (intent != null) {
                    try {
                        str = "Received action: " + intent.getAction();
                    } catch (Exception e) {
                        e = e;
                        context2 = context;
                        Toast.makeText(context2, "ERROR " + e, 1).show();
                        C0768yr.c("T500.BOOTRECEIVER", "BOOT ERROR", e);
                    }
                } else {
                    str = "Intent is NULL";
                }
                C0768yr.e("T500.BOOTRECEIVER", str);
                C0768yr.e("T500.BOOTRECEIVER", "autoStart=" + z);
                C0768yr.e("T500.BOOTRECEIVER", "version in settings ".concat(strS));
                C0768yr.e("T500.BOOTRECEIVER", "isNeedDownload=" + z2);
                if (intent != null) {
                    switch (intent.getAction()) {
                        case "android.intent.action.LOCKED_BOOT_COMPLETED":
                            b = 0;
                            break;
                        case "ru.zinovin.tankspeedometer.T500_IP_RESTART":
                            b = 3;
                            break;
                        case "android.intent.action.BOOT_COMPLETED":
                            b = 1;
                            break;
                        case "android.intent.action.USER_PRESENT":
                            b = 2;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0 || b == 1 || b == 2) {
                        context2 = context;
                        try {
                            if (this.b) {
                                return;
                            }
                            Intent intent2 = new Intent(context2, (Class<?>) ServicesStartActivity.class);
                            intent2.addFlags(335544320);
                            context2.startActivity(intent2);
                            new Timer().schedule(new C0714x4(0), ((long) (Math.random() * 300000)) + 300000);
                            if (z && !z2) {
                                Ud.p0(true);
                                Ud.l0(AbstractC0390mk.l(AbstractC0402n1.a()).getBoolean("musicAutoPlay", false));
                            }
                            this.b = true;
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            Toast.makeText(context2, "ERROR " + e, 1).show();
                            C0768yr.c("T500.BOOTRECEIVER", "BOOT ERROR", e);
                        }
                    }
                    if (b == 3) {
                        try {
                            new Timer().schedule(new C0714x4(1), ((long) (Math.random() * 300000)) + 300000);
                            boolean booleanExtra = intent.getBooleanExtra("useNavi", false);
                            lf.i(Boolean.valueOf(booleanExtra));
                            String string = sharedPreferencesL.getString("ipType", "1");
                            if (!string.equals((String) lf.u.d())) {
                                Ud.e0();
                            }
                            lf.u.f(string);
                            boolean z3 = string.equals("3") && Td.p("naviFullscreen");
                            lf.w.f(Boolean.valueOf(z3));
                            C0768yr.e("T500.BOOTRECEIVER", "T500_IP_RESTART received");
                            C0768yr.e("T500.BOOTRECEIVER", "ipType=".concat(string));
                            C0768yr.e("T500.BOOTRECEIVER", "useNavi=" + booleanExtra);
                            C0768yr.e("T500.BOOTRECEIVER", "naviFullScreen=" + z3);
                            lf.y.f(Boolean.FALSE);
                            Ud.p0(true);
                            lf.I.f(sharedPreferencesL.getString("naviPackage", "ru.yandex.yandexnavi"));
                            context2 = context;
                            try {
                                Intent intent3 = new Intent(context2, (Class<?>) (string.equals("1") ? BasicInstrumentalPanel.class : SpedometerPanel.class));
                                intent3.setAction("ru.zinovin.tankspeedometer.T500_IP_RESTART");
                                SharedPreferences.Editor editorEdit = sharedPreferencesL.edit();
                                editorEdit.putBoolean("usePreferences", true);
                                editorEdit.commit();
                                context2.startService(intent3);
                                if (booleanExtra) {
                                    Ud.n0(z3);
                                }
                            } catch (Exception e3) {
                                e = e3;
                                Toast.makeText(context2, "ERROR " + e, 1).show();
                                C0768yr.c("T500.BOOTRECEIVER", "BOOT ERROR", e);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            context2 = context;
                        }
                    }
                }
            } catch (Exception e5) {
                e = e5;
                context2 = context;
            }
        } catch (Exception e6) {
            e = e6;
            context2 = context;
        }
    }
}
