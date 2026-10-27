package defpackage;

import android.net.wifi.WifiManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: ut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0646ut extends AbstractC0067c4 {
    public WifiManager U;

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.U = (WifiManager) I().getApplicationContext().getSystemService("wifi");
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        In in = new In(I());
        Wn wn = new Wn(I());
        wn.setTitle(R.string.ts_wifi_switch_title);
        WifiManager wifiManager = this.U;
        wn.setChecked(wifiManager != null && wifiManager.isWifiEnabled());
        wn.setOnCheckedChange(new C0098d4(this, 11));
        in.addView(wn);
        c0295jiV.addView(in);
        O(c0295jiV, 16);
        In in2 = new In(I());
        Pn pn = new Pn(I());
        pn.setTitle(R.string.ts_wifi_name_title);
        pn.setInputTypeFlags(1);
        in2.addView(pn);
        Pn pn2 = new Pn(I());
        pn2.setTitle(R.string.ts_wifi_pass_title);
        pn2.setInputTypeFlags(129);
        in2.addView(pn2);
        c0295jiV.addView(in2);
        O(c0295jiV, 12);
        View viewZ = Z(R.string.text_add_wifi_btn, new B9(this, pn, pn2, 3));
        viewZ.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c0295jiV.addView(viewZ);
        return scrollViewW;
    }
}
