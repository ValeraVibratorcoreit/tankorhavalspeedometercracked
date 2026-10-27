package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class Q3 extends AbstractC0067c4 {
    public S3 U;
    public Pn V;

    public final void c0(Runnable runnable) {
        if (!p() || f() == null) {
            return;
        }
        H().runOnUiThread(runnable);
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final void t(int i, int i2, Intent intent) {
        super.t(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            if (intent == null || intent.getData() == null) {
                Toast.makeText(I(), R.string.ts_restore_no_file_msg, 0).show();
            } else {
                new Thread(new B1(this, 3, intent.getData())).start();
            }
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC0784zc
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context contextI = I();
        S3 s3 = new S3();
        s3.b = contextI;
        this.U = s3;
        ScrollView scrollViewW = W();
        C0295ji c0295jiV = V();
        scrollViewW.addView(c0295jiV);
        SharedPreferences sharedPreferencesS = S();
        In in = new In(I());
        Pn pn = new Pn(I());
        this.V = pn;
        pn.setTitle(R.string.ts_backup_name_title);
        Pn pn2 = this.V;
        this.U.getClass();
        pn2.setValue(S3.k());
        in.addView(this.V);
        in.addView(b0(R.string.text_psw_backup_sw_text, 0, 0, sharedPreferencesS.getBoolean("pswBackupSwitch", false), new N3(sharedPreferencesS, 0)));
        c0295jiV.addView(in);
        O(c0295jiV, 12);
        LinearLayout linearLayout = new LinearLayout(I());
        linearLayout.setOrientation(0);
        Button buttonZ = Z(R.string.text_backup_btn, new O3(this, 0));
        buttonZ.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(buttonZ);
        Button buttonZ2 = Z(R.string.text_restore_btn, new O3(this, 1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginStart(P(12));
        buttonZ2.setLayoutParams(layoutParams);
        linearLayout.addView(buttonZ2);
        c0295jiV.addView(linearLayout);
        return scrollViewW;
    }
}
