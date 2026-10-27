package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.zinovin.tankspeedometer.BasicInstrumentalPanel;
import ru.zinovin.tankspeedometer.MainActivity;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.SpedometerPanel;
import ru.zinovin.tankspeedometer.view.BatteryLevelIndicatorView;
import ru.zinovin.tankspeedometer.view.FuelLevelIndicatorView;
import ru.zinovin.tankspeedometer.view.LevelIndicatorView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class U2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ U2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x006b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0242  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Lf lf;
        Float fC;
        byte b = 4;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                V2 v2 = (V2) obj;
                v2.getClass();
                str.getClass();
                if (str.equals("fuel_critical_level")) {
                    v2.setWarnLevel(Float.parseFloat(sharedPreferences.getString(str, "12.5")));
                    v2.invalidate();
                    break;
                } else if (str.equals("fuel_low_level")) {
                    v2.setNormalLevel(Float.parseFloat(sharedPreferences.getString(str, "20.0")));
                    v2.invalidate();
                    break;
                }
                break;
            case 1:
                W2 w2 = (W2) obj;
                w2.getClass();
                str.getClass();
                if (str.equals("coolant_warn_level")) {
                    w2.setWarnLevel(Float.parseFloat(sharedPreferences.getString(str, "105.0")));
                    w2.invalidate();
                    break;
                } else if (str.equals("coolant_critical_level")) {
                    w2.setCriticalLevel(Float.parseFloat(sharedPreferences.getString(str, "120.0")));
                    w2.invalidate();
                    break;
                }
                break;
            case 2:
                int i = BasicInstrumentalPanel.B;
                BasicInstrumentalPanel basicInstrumentalPanel = (BasicInstrumentalPanel) obj;
                basicInstrumentalPanel.getClass();
                if (("fuel_custom_tank_enabled".equals(str) || "fuel_tank_capacity".equals(str) || "fuel_conversion_coef".equals(str)) && (fC = (lf = basicInstrumentalPanel.c).c()) != null && fC.floatValue() >= 0.0f) {
                    C0768yr.e("T500.BasicInstrPanel", "Fuel settings changed (" + str + "), refreshing display");
                    lf.g(fC);
                }
                break;
            case 3:
                int i2 = BatteryLevelIndicatorView.n;
                BatteryLevelIndicatorView batteryLevelIndicatorView = (BatteryLevelIndicatorView) obj;
                batteryLevelIndicatorView.getClass();
                str.getClass();
                if (str.equals("battery_low_level")) {
                    batteryLevelIndicatorView.setNormalLevel(Float.parseFloat(sharedPreferences.getString(str, "20")));
                    batteryLevelIndicatorView.invalidate();
                    break;
                } else if (str.equals("battery_critical_level")) {
                    batteryLevelIndicatorView.setWarnLevel(Float.parseFloat(sharedPreferences.getString(str, "10")));
                    batteryLevelIndicatorView.invalidate();
                    break;
                }
                break;
            case 4:
                int i3 = FuelLevelIndicatorView.n;
                FuelLevelIndicatorView fuelLevelIndicatorView = (FuelLevelIndicatorView) obj;
                fuelLevelIndicatorView.getClass();
                str.getClass();
                if (str.equals("fuel_critical_level")) {
                    fuelLevelIndicatorView.setWarnLevel(Float.parseFloat(sharedPreferences.getString(str, "12.5")));
                    fuelLevelIndicatorView.invalidate();
                    break;
                } else if (str.equals("fuel_low_level")) {
                    fuelLevelIndicatorView.setNormalLevel(Float.parseFloat(sharedPreferences.getString(str, "20.0")));
                    fuelLevelIndicatorView.invalidate();
                    break;
                }
                break;
            case 5:
                int i4 = LevelIndicatorView.p;
                LevelIndicatorView levelIndicatorView = (LevelIndicatorView) obj;
                levelIndicatorView.getClass();
                str.getClass();
                if (str.equals("coolant_warn_level")) {
                    levelIndicatorView.setWarnLevel(Float.parseFloat(sharedPreferences.getString(str, "105.0")));
                    levelIndicatorView.invalidate();
                    break;
                } else if (str.equals("coolant_critical_level")) {
                    levelIndicatorView.setCriticalLevel(Float.parseFloat(sharedPreferences.getString(str, "120.0")));
                    levelIndicatorView.invalidate();
                    break;
                }
                break;
            case 6:
                int i5 = MainActivity.M;
                MainActivity mainActivity = (MainActivity) obj;
                mainActivity.getClass();
                str.getClass();
                switch (str) {
                    case "language":
                        C0768yr.e("T500.MAIN", "Changed preference ".concat(str));
                        sharedPreferences.getString(str, "sys");
                        mainActivity.recreate();
                        break;
                    case "naviPackage":
                        boolean z = false;
                        mainActivity.I.edit().commit();
                        if (Ud.A() != -1) {
                            Ud.p0(true);
                            z = true;
                        }
                        mainActivity.L.I.f(sharedPreferences.getString(str, "ru.yandex.yandexnavi"));
                        Handler handler = new Handler();
                        String string = sharedPreferences.getString(str, "ru.yandex.yandexnavi");
                        Intent intent = new Intent();
                        intent.setAction("ru.zinovin.tankspeedometer.T500_NAVIPACKAGE_CHANGED");
                        intent.putExtra("naviPackage", string);
                        mainActivity.sendBroadcast(intent, "ru.zinovin.tankspeedometer.NAVIPACKAGE_CHANGED_PERMISSION");
                        if (z) {
                            handler.postDelayed(new RunnableC0591t5(mainActivity, 13), 100L);
                            break;
                        }
                        break;
                    case "ipType":
                    case "carModel":
                        C0768yr.e("T500.MAIN", "Changed preference ".concat(str));
                        Ud.o0();
                        break;
                    case "useHud":
                        C0768yr.e("T500.MAIN", "Changed preference ".concat(str));
                        if (sharedPreferences.getBoolean(str, false)) {
                            Ud.m0();
                            break;
                        } else {
                            Intent intent2 = new Intent();
                            intent2.setAction("ru.zinovin.tankspeedometer.T500_HUD_STOP");
                            mainActivity.sendBroadcast(intent2);
                            break;
                        }
                        break;
                    case "usePreferences":
                        mainActivity.K = sharedPreferences.getBoolean(str, true);
                        C0768yr.e("T500.MAIN", "Changed usePreferences=" + mainActivity.K);
                        break;
                }
                break;
            case 7:
                int i6 = SpedometerPanel.s0;
                SpedometerPanel spedometerPanel = (SpedometerPanel) obj;
                spedometerPanel.getClass();
                str.getClass();
                switch (str) {
                    case "showNaviBorder":
                        C0768yr.e("T500.ACTIVITY", "Changed preference ".concat(str));
                        if (spedometerPanel.c0) {
                            if (!sharedPreferences.getBoolean(str, true)) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) spedometerPanel.c(R.id.naviBorder);
                                if (constraintLayout != null) {
                                    constraintLayout.removeAllViews();
                                }
                            } else {
                                spedometerPanel.a(spedometerPanel.F(), spedometerPanel.d0);
                            }
                            break;
                        }
                        break;
                    case "ipSpeedKDefault":
                        spedometerPanel.Q = Float.parseFloat(sharedPreferences.getString(str, "1.055"));
                        break;
                    case "fuel_conversion_coef":
                    case "fuel_tank_capacity":
                    case "fuel_custom_tank_enabled":
                        C0768yr.e("T500.ACTIVITY", "Fuel settings changed (" + str + "), refreshing display");
                        Lf lf2 = spedometerPanel.c;
                        Float fC2 = lf2.c();
                        if (fC2 != null && fC2.floatValue() >= 0.0f) {
                            lf2.g(fC2);
                            break;
                        }
                        break;
                    case "ipSpeedK1":
                        spedometerPanel.R = Float.parseFloat(sharedPreferences.getString(str, "1.046"));
                        break;
                    case "ipSpeedK2":
                        spedometerPanel.S = Float.parseFloat(sharedPreferences.getString(str, "1.042"));
                        break;
                    case "extFirmware":
                        C0768yr.e("T500.ACTIVITY", "Changed preference ".concat(str));
                        spedometerPanel.l = sharedPreferences.getBoolean(str, true);
                        spedometerPanel.Z = new Af(spedometerPanel.getApplicationContext(), spedometerPanel);
                        spedometerPanel.t(true);
                        spedometerPanel.r();
                        break;
                    case "ipSpeed1":
                        spedometerPanel.T = Float.parseFloat(sharedPreferences.getString(str, "76"));
                        break;
                    case "ipSpeed2":
                        spedometerPanel.U = Float.parseFloat(sharedPreferences.getString(str, "96"));
                        break;
                    case "selectedTheme":
                        C0768yr.e("T500.ACTIVITY", "Changed preference ".concat(str));
                        spedometerPanel.v(spedometerPanel.D());
                        break;
                }
                break;
            case 8:
                C0211gp c0211gp = (C0211gp) obj;
                c0211gp.getClass();
                str.getClass();
                switch (str.hashCode()) {
                    case -1771153706:
                        if (!str.equals("ipSpeedKDefault")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 773313702:
                        if (!str.equals("ipSpeedK1")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 773313703:
                        if (!str.equals("ipSpeedK2")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 1410418897:
                        if (!str.equals("ipSpeed1")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case 1410418898:
                        if (!str.equals("ipSpeed2")) {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        c0211gp.h = Float.parseFloat(sharedPreferences.getString(str, "1.055"));
                        break;
                    case 1:
                        c0211gp.i = Float.parseFloat(sharedPreferences.getString(str, "1.046"));
                        break;
                    case 2:
                        c0211gp.j = Float.parseFloat(sharedPreferences.getString(str, "1.042"));
                        break;
                    case 3:
                        c0211gp.k = Float.parseFloat(sharedPreferences.getString(str, "76"));
                        break;
                    case 4:
                        c0211gp.l = Float.parseFloat(sharedPreferences.getString(str, "96"));
                        break;
                }
                break;
            default:
                Oq oq = (Oq) obj;
                oq.getClass();
                if ("tiresLowValue".equals(str)) {
                    oq.l = Float.parseFloat(sharedPreferences.getString(str, "210"));
                    oq.e((String) oq.e.z.d());
                }
                break;
        }
    }
}
