package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0632uf extends AbstractC0067c4 {
    public final Pn c0(SharedPreferences sharedPreferences, int i, String str, String str2) {
        return Q(i, sharedPreferences.getString(str, str2), 8194, new C0601tf(this, sharedPreferences, str));
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        final SharedPreferences sharedPreferencesS = S();
        c0295jiV.addView(a0(R.string.pref_cat_tire_indicator_title));
        In in = new In(I());
        in.addView(Q(R.string.pref_in_tireslowvalue, sharedPreferencesS.getString("tiresLowValue", "210"), 2, new C0539rf(this, sharedPreferencesS)));
        c0295jiV.addView(in);
        O(c0295jiV, 16);
        c0295jiV.addView(a0(R.string.pref_cat_fuel_indicator_title));
        In in2 = new In(I());
        in2.addView(c0(sharedPreferencesS, R.string.pref_fuel_low_level_title, "fuel_low_level", "20"));
        in2.addView(c0(sharedPreferencesS, R.string.pref_fuel_critical_level_title, "fuel_critical_level", "12.5"));
        in2.addView(b0(R.string.pref_sw_fuel_tank_fix_title, R.string.pref_sw_fuel_tank_fix_on, R.string.pref_sw_fuel_tank_fix_off, sharedPreferencesS.getBoolean("fuel_tank_fix", false), new C0539rf(this, sharedPreferencesS)));
        final Pn pnC0 = c0(sharedPreferencesS, R.string.pref_fuel_tank_capacity_title, "fuel_tank_capacity", "80");
        final Pn pnC1 = c0(sharedPreferencesS, R.string.pref_fuel_conversion_coef_title, "fuel_conversion_coef", "0.71");
        boolean z = sharedPreferencesS.getBoolean("fuel_custom_tank_enabled", false);
        pnC0.setEnabled(z);
        pnC1.setEnabled(z);
        in2.addView(b0(R.string.pref_sw_fuel_custom_tank_title, R.string.pref_sw_fuel_custom_tank_on, R.string.pref_sw_fuel_custom_tank_off, z, new Vn() { // from class: sf
            @Override // defpackage.Vn
            public final void c(boolean z2) {
                C0632uf c0632uf = this.a;
                c0632uf.getClass();
                sharedPreferencesS.edit().putBoolean("fuel_custom_tank_enabled", z2).apply();
                c0632uf.X("fuel_custom_tank_enabled");
                pnC0.setEnabled(z2);
                pnC1.setEnabled(z2);
            }
        }));
        in2.addView(pnC0);
        in2.addView(pnC1);
        c0295jiV.addView(in2);
        O(c0295jiV, 16);
        c0295jiV.addView(a0(R.string.pref_cat_battery_indicator_title));
        In in3 = new In(I());
        in3.addView(c0(sharedPreferencesS, R.string.pref_battery_low_level_title, "battery_low_level", "20"));
        in3.addView(c0(sharedPreferencesS, R.string.pref_battery_critical_level_title, "battery_critical_level", "10"));
        c0295jiV.addView(in3);
        O(c0295jiV, 16);
        c0295jiV.addView(a0(R.string.pref_cat_coolant_indicator_title));
        In in4 = new In(I());
        in4.addView(c0(sharedPreferencesS, R.string.pref_coolant_warn_level_title, "coolant_warn_level", "105"));
        in4.addView(c0(sharedPreferencesS, R.string.pref_coolant_critical_level_title, "coolant_critical_level", "120"));
        c0295jiV.addView(in4);
        O(c0295jiV, 16);
        c0295jiV.addView(a0(R.string.pref_cat_koef_title));
        In in5 = new In(I());
        in5.addView(c0(sharedPreferencesS, R.string.pref_in_koefdef_title, "ipSpeedKDefault", "1.055"));
        in5.addView(c0(sharedPreferencesS, R.string.pref_in_speed1_title, "ipSpeed1", "76"));
        in5.addView(c0(sharedPreferencesS, R.string.pref_in_koef1_title, "ipSpeedK1", "1.046"));
        in5.addView(c0(sharedPreferencesS, R.string.pref_in_speed2_title, "ipSpeed2", "96"));
        in5.addView(c0(sharedPreferencesS, R.string.pref_in_koef2_title, "ipSpeedK2", "1.042"));
        c0295jiV.addView(in5);
        return scrollViewW;
    }
}
