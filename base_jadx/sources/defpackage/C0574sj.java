package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: renamed from: sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0574sj extends AbstractC0067c4 {
    public LinearLayout U;
    public final ArrayList V = new ArrayList();

    @Override // defpackage.AbstractC0067c4
    public final void Y(SettingsTopBar settingsTopBar) {
        settingsTopBar.c(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add("Default");
        for (String str : k().getStringArray(R.array.Themes)) {
            arrayList.add(str);
        }
        settingsTopBar.b(arrayList, this.T.z);
        settingsTopBar.setOnThemeSelected(new C0098d4(this, 4));
        settingsTopBar.a(R.string.text_restore_btn_text, new RunnableC0591t5(this, 15));
    }

    public final void c0() {
        this.U.removeAllViews();
        ArrayList arrayList = this.V;
        arrayList.clear();
        boolean zEquals = this.T.z.equals("Default");
        SharedPreferences sharedPreferencesT = T();
        boolean z = !zEquals && sharedPreferencesT.getBoolean("useDefaultSwitchNavi", true);
        In in = new In(I());
        Wn wnB0 = b0(R.string.pref_sw_default_settings_title, R.string.pref_sw_default_settings_on, R.string.pref_sw_default_settings_off, z, null);
        wnB0.setOnCheckedChange(new C0478pf(this, wnB0, 2));
        wnB0.setRowEnabled(!zEquals);
        in.addView(wnB0);
        in.addView(e0(sharedPreferencesT, "useSysNavi", R.string.pref_sw_usesysnavi_title, R.string.pref_sw_usesysnavi_on, R.string.pref_sw_usesysnavi_off));
        in.addView(e0(sharedPreferencesT, "useNavi", R.string.pref_sw_usenavi_title, R.string.pref_sw_usenavi_on, R.string.pref_sw_usenavi_off));
        in.addView(e0(sharedPreferencesT, "naviFullscreen", R.string.pref_sw_navifullscreen_title, R.string.pref_sw_navifullscreen_on, R.string.pref_sw_navifullscreen_off));
        boolean z2 = !z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Wn) it.next()).setRowEnabled(z2);
        }
        this.U.addView(in);
    }

    public final boolean d0() {
        String strR = R();
        boolean z = this.T.G(strR).getBoolean("useDefaultSwitchNavi", true);
        String str = this.T.z;
        if (str.equals(strR)) {
            return true;
        }
        return z && str.equals("Default");
    }

    public final Wn e0(SharedPreferences sharedPreferences, String str, int i, int i2, int i3) {
        Wn wnB0 = b0(i, i2, i3, sharedPreferences.getBoolean(str, false), new C0478pf(this, str, 3));
        this.V.add(wnB0);
        return wnB0;
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        SharedPreferences sharedPreferencesS = S();
        c0295jiV.addView(a0(R.string.pref_cat_common_settings_title));
        In in = new In(I());
        in.addView(U(R.string.pref_navi_app_title, R.array.navi_app, R.array.navi_package, sharedPreferencesS.getString("naviPackage", ""), new C0543rj(this, sharedPreferencesS, 0)));
        in.addView(Q(R.string.pref_in_user_navi_package_title, sharedPreferencesS.getString("naviUserPackage", ""), 1, new C0543rj(this, sharedPreferencesS, 1)));
        in.addView(Q(R.string.pref_in_navidelay_title, sharedPreferencesS.getString("naviStartDelay", "500"), 2, new C0543rj(this, sharedPreferencesS, 2)));
        in.addView(b0(R.string.pref_sw_naviactivation_title, R.string.pref_sw_naviactivation_on, R.string.pref_sw_naviactivation_off, sharedPreferencesS.getBoolean("useNaviActivation", true), new C0543rj(this, sharedPreferencesS, 3)));
        in.addView(b0(R.string.pref_sw_naviborder_title, R.string.pref_sw_naviborder_on, R.string.pref_sw_naviborder_off, sharedPreferencesS.getBoolean("showNaviBorder", true), new C0543rj(this, sharedPreferencesS, 4)));
        in.addView(b0(R.string.pref_sw_hud_title, R.string.pref_sw_hud_on, R.string.pref_sw_hud_off, sharedPreferencesS.getBoolean("useHud", false), new C0543rj(this, sharedPreferencesS, 5)));
        c0295jiV.addView(in);
        O(c0295jiV, 16);
        c0295jiV.addView(a0(R.string.pref_cat_navi_title));
        LinearLayout linearLayout = new LinearLayout(I());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        c0295jiV.addView(this.U);
        c0();
        return scrollViewW;
    }
}
