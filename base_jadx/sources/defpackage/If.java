package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Handler;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class If implements Mj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Kf b;

    public /* synthetic */ If(Kf kf, int i) {
        this.a = i;
        this.b = kf;
    }

    @Override // defpackage.Mj
    public final void w(Object obj) {
        int i;
        String string;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                final Kf kf = this.b;
                if (kf.g && bool.booleanValue()) {
                    if (((Boolean) kf.c.y.d()).booleanValue()) {
                        Handler handler = new Handler();
                        String string2 = kf.b.getString("musicApp", "ym");
                        if (string2.equals("userapp")) {
                            string = kf.b.getString("musicUserPackage", null);
                        } else {
                            int iIndexOf = Arrays.asList(kf.getResources().getStringArray(R.array.music_values)).indexOf(string2);
                            if (iIndexOf != -1) {
                                TypedArray typedArrayObtainTypedArray = kf.getResources().obtainTypedArray(R.array.music_package);
                                try {
                                    string = typedArrayObtainTypedArray.getString(iIndexOf);
                                    typedArrayObtainTypedArray.recycle();
                                } catch (Throwable th) {
                                    typedArrayObtainTypedArray.recycle();
                                    throw th;
                                }
                            } else {
                                string = "ru.yandex.music";
                            }
                        }
                        if (string == null) {
                            C0768yr.e("T500.ACTIVITY", "Music package is NULL");
                        } else {
                            handler.postDelayed(new H9(kf, kf, string, string2), 1000L);
                        }
                    }
                    final int i2 = 0;
                    new Thread(new Runnable() { // from class: Jf
                        @Override // java.lang.Runnable
                        public final void run() {
                            Jl jl;
                            switch (i2) {
                                case 0:
                                    Kf kf2 = kf;
                                    kf2.getClass();
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("vin", Tf.F(null, "persist.gwm.vehicle.vin"));
                                        jSONObject.put("password", Tf.H("password"));
                                        jSONObject.put("token", "");
                                        jSONObject.put("verification", "true");
                                        jSONObject.put("lang", kf2.getResources().getConfiguration().locale.getLanguage());
                                    } catch (JSONException e) {
                                        C0768yr.c("T500.ACTIVITY", e.getMessage(), e);
                                    }
                                    C0043bb c0043bbA = C0043bb.a(DownloadActivity.O, jSONObject.toString());
                                    Pj pj = new Pj();
                                    H0 h0 = new H0();
                                    h0.q("https://tankspeedometer.ru:9443/api/v2/cars/check-update");
                                    h0.j("POST", c0043bbA);
                                    try {
                                        C0117dn c0117dnC = new Dl(pj, h0.a()).c();
                                        try {
                                            if (c0117dnC.w() && (jl = c0117dnC.g) != null) {
                                                Tf.W("LALALA", new JSONObject(jl.y()).getString("init_date"));
                                                break;
                                            }
                                            c0117dnC.close();
                                            return;
                                        } catch (Throwable th2) {
                                            try {
                                                c0117dnC.close();
                                                break;
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } catch (Exception e2) {
                                        C0768yr.c("T500.ACTIVITY", e2.getMessage(), e2);
                                        return;
                                    }
                                    break;
                                default:
                                    Kf kf3 = kf;
                                    kf3.getClass();
                                    SharedPreferences sharedPreferences = kf3.getSharedPreferences("prefs_" + AbstractC0390mk.l(kf3).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchBack", true)) {
                                        sharedPreferences = kf3.getSharedPreferences("prefs_Default", 0);
                                    }
                                    if (F4.x(kf3, sharedPreferences)) {
                                        kf3.i = 10;
                                        Intent intent = new Intent("ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED");
                                        intent.putExtra("pref_key", "bgMode");
                                        kf3.sendBroadcast(intent);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }).start();
                    kf.g = false;
                }
                if (bool.booleanValue() && "sun".equals(Ud.H("bgMode", "static"))) {
                    Context contextA = AbstractC0402n1.a();
                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                    if (sharedPreferences.getBoolean("useDefaultSwitchBack", true)) {
                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                    }
                    if (sharedPreferences.getBoolean("bg_sun_auto_update", true) && (i = kf.i) < 10) {
                        kf.i = i + 1;
                        C0768yr.e("T500.ACTIVITY", "Fetching sunrise/sunset (attempt " + kf.i + ")");
                        final int i3 = 1;
                        new Thread(new Runnable() { // from class: Jf
                            @Override // java.lang.Runnable
                            public final void run() {
                                Jl jl;
                                switch (i3) {
                                    case 0:
                                        Kf kf2 = kf;
                                        kf2.getClass();
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("vin", Tf.F(null, "persist.gwm.vehicle.vin"));
                                            jSONObject.put("password", Tf.H("password"));
                                            jSONObject.put("token", "");
                                            jSONObject.put("verification", "true");
                                            jSONObject.put("lang", kf2.getResources().getConfiguration().locale.getLanguage());
                                        } catch (JSONException e) {
                                            C0768yr.c("T500.ACTIVITY", e.getMessage(), e);
                                        }
                                        C0043bb c0043bbA = C0043bb.a(DownloadActivity.O, jSONObject.toString());
                                        Pj pj = new Pj();
                                        H0 h0 = new H0();
                                        h0.q("https://tankspeedometer.ru:9443/api/v2/cars/check-update");
                                        h0.j("POST", c0043bbA);
                                        try {
                                            C0117dn c0117dnC = new Dl(pj, h0.a()).c();
                                            try {
                                                if (c0117dnC.w() && (jl = c0117dnC.g) != null) {
                                                    Tf.W("LALALA", new JSONObject(jl.y()).getString("init_date"));
                                                    break;
                                                }
                                                c0117dnC.close();
                                                return;
                                            } catch (Throwable th2) {
                                                try {
                                                    c0117dnC.close();
                                                    break;
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                }
                                                throw th2;
                                            }
                                        } catch (Exception e2) {
                                            C0768yr.c("T500.ACTIVITY", e2.getMessage(), e2);
                                            return;
                                        }
                                        break;
                                    default:
                                        Kf kf3 = kf;
                                        kf3.getClass();
                                        SharedPreferences sharedPreferences2 = kf3.getSharedPreferences("prefs_" + AbstractC0390mk.l(kf3).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                        if (sharedPreferences2.getBoolean("useDefaultSwitchBack", true)) {
                                            sharedPreferences2 = kf3.getSharedPreferences("prefs_Default", 0);
                                        }
                                        if (F4.x(kf3, sharedPreferences2)) {
                                            kf3.i = 10;
                                            Intent intent = new Intent("ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED");
                                            intent.putExtra("pref_key", "bgMode");
                                            kf3.sendBroadcast(intent);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }).start();
                        return;
                    }
                    return;
                }
                return;
            default:
                Kf kf2 = this.b;
                kf2.getClass();
                kf2.j = ((Integer) obj).intValue() == 1 ? "°F" : "°C";
                return;
        }
    }
}
