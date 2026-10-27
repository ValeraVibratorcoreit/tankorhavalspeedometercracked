package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0389mj extends AbstractC0067c4 {
    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        SharedPreferences sharedPreferencesS = S();
        In in = new In(I());
        in.addView(U(R.string.pref_music_app_title, R.array.music_app, R.array.music_values, sharedPreferencesS.getString("musicApp", ""), new C0358lj(this, sharedPreferencesS, 0)));
        in.addView(Q(R.string.pref_in_user_package_title, sharedPreferencesS.getString("musicUserPackage", ""), 1, new C0358lj(this, sharedPreferencesS, 1)));
        in.addView(b0(R.string.pref_sw_ymautoplay_title, R.string.pref_sw_ymautoplay_on, R.string.pref_sw_ymautoplay_off, sharedPreferencesS.getBoolean("musicAutoPlay", false), new C0358lj(this, sharedPreferencesS, 2)));
        c0295jiV.addView(in);
        O(c0295jiV, 16);
        c0295jiV.addView(a0(R.string.pref_cat_ym_title));
        In in2 = new In(I());
        in2.addView(Q(R.string.pref_in_ymuser_title, sharedPreferencesS.getString("ymUser", ""), 1, new C0358lj(this, sharedPreferencesS, 3)));
        in2.addView(U(R.string.pref_list_ymlist_title, R.array.ym_list, R.array.ym_values, sharedPreferencesS.getString("ymPlayMode", ""), new C0358lj(this, sharedPreferencesS, 4)));
        in2.addView(Q(R.string.pref_in_ymlistid_title, sharedPreferencesS.getString("ymListId", ""), 1, new C0358lj(this, sharedPreferencesS, 5)));
        c0295jiV.addView(in2);
        return scrollViewW;
    }
}
