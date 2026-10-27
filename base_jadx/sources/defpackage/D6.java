package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class D6 extends AbstractC0067c4 {
    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        SharedPreferences sharedPreferencesS = S();
        In in = new In(I());
        in.addView(b0(R.string.pref_sw_autostart_title, R.string.pref_sw_autostart_on, R.string.pref_sw_autostart_off, sharedPreferencesS.getBoolean("autoStart", false), new C6(this, sharedPreferencesS, 0)));
        in.addView(U(R.string.pref_lang_ui_text, R.array.lang_list, R.array.lang_list_values, sharedPreferencesS.getString("language", "sys"), new C6(this, sharedPreferencesS, 1)));
        in.addView(U(R.string.text_car_model, R.array.car_list, R.array.car_list_values, sharedPreferencesS.getString("carModel", ""), new C6(this, sharedPreferencesS, 2)));
        in.addView(b0(R.string.pref_sw_extfirmware_title, R.string.pref_sw_extfirmware_on, R.string.pref_sw_extfirmware_off, sharedPreferencesS.getBoolean("extFirmware", true), new C6(this, sharedPreferencesS, 3)));
        c0295jiV.addView(in);
        return scrollViewW;
    }
}
