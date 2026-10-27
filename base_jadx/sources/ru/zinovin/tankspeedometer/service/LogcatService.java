package ru.zinovin.tankspeedometer.service;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import defpackage.AbstractC0390mk;
import defpackage.C0120dr;
import defpackage.C0768yr;
import defpackage.Lf;
import defpackage.RunnableC0591t5;
import defpackage.Sf;
import defpackage.Tf;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class LogcatService extends Service {
    public static final /* synthetic */ int e = 0;
    public int c;
    public boolean a = false;
    public final Lf b = Lf.a();
    public final RunnableC0591t5 d = new RunnableC0591t5(this, 12);

    public static boolean a(LogcatService logcatService, String str) {
        logcatService.getClass();
        String strF = Tf.F(null, "persist.vendor.gwm.cfg.project.code");
        strF.getClass();
        String str2 = "curPage=Page{packageName='com.gwm.app.scenemode'";
        switch (strF) {
            case "112":
            case "126":
            case "128":
            case "134":
            case "138":
            case "175":
            case "189":
            case "190":
            case "195":
            case "213":
            case "215":
            case "250":
                break;
            case "193":
            case "203":
            case "245":
                if (!AbstractC0390mk.l(logcatService).getBoolean("extFirmware", true)) {
                    return str.contains("curPage=Page{packageName='com.gwm.app.carphone'") || str.contains("curPage=Page{packageName='com.gdc.carplay'");
                }
                break;
            default:
                str2 = "";
                break;
        }
        return str.contains(str2);
    }

    public static /* synthetic */ void c(LogcatService logcatService) {
        logcatService.c--;
    }

    public static void d(LogcatService logcatService) {
        SharedPreferences.Editor editorEdit = logcatService.getSharedPreferences("DATA_PREFS", 0).edit();
        Lf lf = logcatService.b;
        C0120dr c0120dr = lf.q;
        if (c0120dr.l) {
            editorEdit.putFloat("ODO_ACCUMULATED", ((Float) c0120dr.d()).floatValue());
        }
        C0120dr c0120dr2 = lf.o;
        if (c0120dr2.l) {
            editorEdit.putFloat("ODO_JOURNEY", ((Float) c0120dr2.d()).floatValue());
        }
        editorEdit.putString("ODO_JOURNEY_TIME", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        C0120dr c0120dr3 = lf.k;
        if (c0120dr3.l) {
            editorEdit.putFloat("AVG_FUEL_CONS_JOURNEY", ((Float) lf.l.d()).floatValue());
        }
        C0120dr c0120dr4 = lf.m;
        if (c0120dr4.l) {
            editorEdit.putFloat("AVG_SPEED_JOURNEY", ((Float) c0120dr4.d()).floatValue());
        }
        C0120dr c0120dr5 = lf.n;
        if (c0120dr5.l) {
            editorEdit.putInt("DRIVE_TIME_JOURNEY", ((Integer) c0120dr5.d()).intValue());
        }
        C0120dr c0120dr6 = lf.p;
        if (c0120dr6.l) {
            editorEdit.putFloat("ODO_TOTAL", ((Float) c0120dr6.d()).floatValue());
        }
        if (lf.g.l) {
            editorEdit.putFloat("REMAIN_FUEL", lf.c().floatValue());
        }
        C0120dr c0120dr7 = lf.h;
        if (c0120dr7.l) {
            editorEdit.putFloat("REMAIN_SUB_FUEL", ((Float) c0120dr7.d()).floatValue());
        }
        if (c0120dr3.l) {
            editorEdit.putFloat("AVG_FUEL_CONS", ((Float) lf.k.d()).floatValue());
        }
        C0120dr c0120dr8 = lf.i;
        if (c0120dr8.l) {
            editorEdit.putFloat("REMAIN_ODOMETER", ((Float) c0120dr8.d()).floatValue());
        }
        C0120dr c0120dr9 = lf.j;
        if (c0120dr9.l) {
            editorEdit.putFloat("REMAIN_SUB_ODOMETER", ((Float) c0120dr9.d()).floatValue());
        }
        if (!"0.0,-50.0,0.0,-50.0,0.0,-50.0,0.0,-50.0".equals((String) lf.z.d())) {
            C0120dr c0120dr10 = lf.z;
            if (c0120dr10.l) {
                editorEdit.putString("TIRES", (String) c0120dr10.d());
            }
        }
        if (lf.s.l) {
            C0768yr.e("T500.SERVICE", "SAVE OUTSIDE_TEMP=" + lf.b());
            editorEdit.putFloat("OUTSIDE_TEMP", lf.b().floatValue());
            editorEdit.putString("OUTSIDE_TEMP_TIME", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        }
        C0120dr c0120dr11 = lf.B;
        if (c0120dr11.l) {
            editorEdit.putInt("TEMP_UNIT", ((Integer) c0120dr11.d()).intValue());
        }
        C0120dr c0120dr12 = lf.C;
        if (c0120dr12.l) {
            editorEdit.putInt("TIRE_TEMP_UNIT", ((Integer) c0120dr12.d()).intValue());
        }
        C0120dr c0120dr13 = lf.A;
        if (c0120dr13.l) {
            editorEdit.putInt("TPMS_UNIT", ((Integer) c0120dr13.d()).intValue());
        }
        C0120dr c0120dr14 = lf.D;
        if (c0120dr14.l) {
            editorEdit.putInt("LANGUAGE", ((Integer) c0120dr14.d()).intValue());
        }
        if (lf.E.l) {
            editorEdit.putBoolean("RIGHT_FRAME_ACTIVE", lf.d().booleanValue());
        }
        C0120dr c0120dr15 = lf.H;
        if (c0120dr15.l) {
            editorEdit.putInt("SUB_TANK_STATE", ((Integer) c0120dr15.d()).intValue());
        }
        C0120dr c0120dr16 = lf.f;
        if (c0120dr16.l) {
            editorEdit.putFloat("EV_BATTERY", ((Float) c0120dr16.d()).floatValue());
        }
        C0120dr c0120dr17 = lf.F;
        if (c0120dr17.l) {
            editorEdit.putFloat("EV_REMAIN_ODOMETER", ((Float) c0120dr17.d()).floatValue());
        }
        editorEdit.apply();
    }

    public static float f(LogcatService logcatService, String str) {
        logcatService.getClass();
        String[] strArrSplit = str.split("=");
        String str2 = strArrSplit.length > 1 ? strArrSplit[1] : "";
        if (str2.isEmpty()) {
            return 0.0f;
        }
        return Float.parseFloat(str2);
    }

    public static int g(LogcatService logcatService, String str) {
        logcatService.getClass();
        String[] strArrSplit = str.split("=");
        String str2 = strArrSplit.length > 1 ? strArrSplit[1] : "";
        if (str2.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(str2);
    }

    public static void h() {
        Tf.q("MicroMode.class", new Object[0]);
    }

    public static boolean i(LogcatService logcatService, String str) {
        logcatService.getClass();
        return str.contains("curPage=Page{packageName='com.gwm.media.entry'");
    }

    public static boolean j(LogcatService logcatService, String str) {
        logcatService.getClass();
        String strF = Tf.F(null, "persist.vendor.gwm.cfg.project.code");
        strF.getClass();
        String str2 = "oriPage=Page{packageName='com.gwm.app.scenemode'";
        switch (strF) {
            case "112":
            case "126":
            case "128":
            case "134":
            case "138":
            case "175":
            case "189":
            case "190":
            case "195":
            case "213":
            case "215":
            case "250":
                break;
            case "193":
            case "203":
            case "245":
                if (!AbstractC0390mk.l(logcatService).getBoolean("extFirmware", true)) {
                    return str.contains("oriPage=Page{packageName='com.gwm.app.carphone'") || str.contains("oriPage=Page{packageName='com.gdc.carplay'");
                }
                break;
            default:
                str2 = "";
                break;
        }
        return str.contains(str2);
    }

    public static boolean k(LogcatService logcatService, String str) {
        logcatService.getClass();
        return str.contains("oriPage=Page{packageName='com.gwm.media.entry'");
    }

    public final void l() {
        try {
            Runtime.getRuntime().exec("logcat -c");
            new Timer().schedule(new Sf(this, 2), 0L);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C0768yr.e("T500.SERVICE", "LogcatService.onCreate()");
        l();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a = true;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            action.getClass();
            if (action.equals("ACTION_STOP_SERVICE")) {
                C0768yr.e("T500.SERVICE", "ACTION_STOP_SERVICE received");
                this.a = true;
                stopSelf();
            } else if (action.equals("ACTION_START_OR_RESUME_SERVICE")) {
                C0768yr.e("T500.SERVICE", "ACTION_START_SERVICE received");
            }
        }
        return 1;
    }
}
