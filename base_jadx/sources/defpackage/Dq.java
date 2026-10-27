package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: loaded from: classes.dex */
public class Dq extends AbstractC0067c4 {
    public static final String[] W = {"speedFromLeft", "bigMeters", "infoInCenter", "speedInCenter", "transparentBackgroundInCenter", "showLabelInMeter"};
    public static final int[] X = {R.string.pref_sw_speedleft_title, R.string.pref_sw_bigmeters_title, R.string.pref_sw_infoincenter_title, R.string.pref_sw_speed_in_center_title, R.string.pref_sw_trback_in_center_title, R.string.pref_sw_showlabel_title};
    public static final int[] Y = {R.string.pref_sw_speedleft_on, R.string.pref_sw_bigmeters_on, R.string.pref_sw_infoincenter_on, R.string.pref_sw_speed_in_center_on, R.string.pref_sw_trback_in_center_on, R.string.pref_sw_showlabel_on};
    public static final int[] Z = {R.string.pref_sw_speedleft_off, R.string.pref_sw_bigmeters_off, R.string.pref_sw_infoincenter_off, R.string.pref_sw_speed_in_center_off, R.string.pref_sw_trback_in_center_off, R.string.pref_sw_showlabel_off};
    public LinearLayout U;
    public final ArrayList V = new ArrayList();

    @Override // defpackage.AbstractC0067c4
    public final void Y(SettingsTopBar settingsTopBar) {
        settingsTopBar.c(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Default");
        arrayList.addAll(Arrays.asList(k().getStringArray(R.array.Themes)));
        settingsTopBar.b(arrayList, this.T.z);
        settingsTopBar.setOnThemeSelected(new C0098d4(this, 10));
        settingsTopBar.a(R.string.text_restore_btn_text, new RunnableC0591t5(this, 23));
    }

    public final void c0() {
        this.U.removeAllViews();
        ArrayList arrayList = this.V;
        arrayList.clear();
        boolean zEquals = this.T.z.equals("Default");
        SharedPreferences sharedPreferencesT = T();
        boolean z = !zEquals && sharedPreferencesT.getBoolean("useDefaultSwitchCommon", true);
        In in = new In(I());
        Wn wnB0 = b0(R.string.pref_sw_default_settings_title, R.string.pref_sw_default_settings_on, R.string.pref_sw_default_settings_off, z, null);
        wnB0.setOnCheckedChange(new C0478pf(this, wnB0, 4));
        wnB0.setRowEnabled(!zEquals);
        in.addView(wnB0);
        for (int i = 0; i < 6; i++) {
            String str = W[i];
            Wn wnB1 = b0(X[i], Y[i], Z[i], sharedPreferencesT.getBoolean(str, str.equals("speedFromLeft") || str.equals("showLabelInMeter")), new C0478pf(this, str, 5));
            arrayList.add(wnB1);
            in.addView(wnB1);
        }
        boolean z2 = !z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Wn) it.next()).setRowEnabled(z2);
        }
        this.U.addView(in);
    }

    public final boolean d0() {
        String strR = R();
        boolean z = this.T.G(strR).getBoolean("useDefaultSwitchCommon", true);
        String str = this.T.z;
        if (str.equals(strR)) {
            return true;
        }
        return z && str.equals("Default");
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        LinearLayout linearLayout = new LinearLayout(I());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        c0295jiV.addView(this.U);
        c0();
        return scrollViewW;
    }
}
