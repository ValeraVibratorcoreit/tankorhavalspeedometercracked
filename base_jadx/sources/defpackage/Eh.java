package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class Eh extends AbstractC0067c4 {
    public final void c0(C0295ji c0295ji, Button button, Button button2) {
        LinearLayout linearLayout = new LinearLayout(I());
        linearLayout.setOrientation(0);
        d0(button, true);
        linearLayout.addView(button);
        d0(button2, false);
        linearLayout.addView(button2);
        c0295ji.addView(linearLayout);
    }

    public final void d0(Button button, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.bottomMargin = P(12);
        if (z) {
            layoutParams.setMarginEnd(P(12));
        }
        button.setLayoutParams(layoutParams);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        SharedPreferences sharedPreferencesS = S();
        In in = new In(I());
        Wn wn = new Wn(I());
        wn.setTitle(R.string.text_tbox_sw_text);
        wn.setChecked(sharedPreferencesS.getBoolean("tboxSwitch", false));
        wn.setOnCheckedChange(new C0601tf(this, wn, sharedPreferencesS));
        in.addView(wn);
        in.addView(b0(R.string.text_debug_sw_text, 0, 0, sharedPreferencesS.getBoolean("debugSwitch", false), new N3(sharedPreferencesS, 1)));
        c0295jiV.addView(in);
        O(c0295jiV, 16);
        c0(c0295jiV, Z(R.string.text_start_btn, new E0(1)), Z(R.string.text_stop_btn, new E0(2)));
        c0(c0295jiV, Z(R.string.text_stop_navi_btn, new E0(3)), Z(R.string.text_android_btn, new RunnableC0591t5(this, 14)));
        return scrollViewW;
    }
}
