package ru.zinovin.tankspeedometer;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0318ka;
import defpackage.AbstractC0390mk;
import defpackage.C0388mi;
import defpackage.C0768yr;
import defpackage.F4;
import defpackage.I9;
import defpackage.Tf;
import defpackage.ViewOnClickListenerC0069c6;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class DownloadActivity2 extends AbstractActivityC0495q1 {
    public static final C0388mi G;
    public TextInputEditText A;
    public ProgressBar B;
    public TextView C;
    public CheckBox D;
    public Handler E;
    public AutoCompleteTextView F;
    public Button y;
    public TextInputEditText z;

    static {
        Pattern pattern = C0388mi.c;
        G = Tf.r("application/json; charset=utf-8");
    }

    public final void E() {
        this.y.setEnabled(true);
        this.C.setVisibility(4);
        this.B.setVisibility(4);
    }

    public final void F(Exception exc, String str) {
        G("ERROR" + exc);
        C0768yr.c("T500.ERROR", "ERROR in ".concat(str), exc);
    }

    public final void G(String str) {
        runOnUiThread(new I9(this, str, 0));
    }

    @Override // defpackage.AbstractActivityC0495q1, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String string = AbstractC0390mk.l(context).getString("language", "sys");
        Locale locale = context.getResources().getConfiguration().locale;
        if (string.equals("sys")) {
            string = locale.getLanguage();
        }
        super.attachBaseContext(F4.b0(context, string));
    }

    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0318ka.a(this);
        getIntent().getExtras();
        setContentView(R.layout.download_activity_2);
        D((MaterialToolbar) findViewById(R.id.toolbar));
        if (u() != null) {
            u().k0(true);
            u().m0(getString(R.string.text_download2_btn));
        }
        this.E = new Handler(Looper.getMainLooper());
        if (F4.j(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            F4.W(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            finish();
        }
        this.D = (CheckBox) findViewById(R.id.betaDownload);
        this.y = (Button) findViewById(R.id.btnDownload);
        ((TextView) findViewById(R.id.vin)).setText("VIN: " + Tf.F(this, "persist.gwm.vehicle.vin"));
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.password);
        this.z = textInputEditText;
        textInputEditText.setText(Tf.H("password"));
        TextInputEditText textInputEditText2 = (TextInputEditText) findViewById(R.id.authcode);
        this.A = textInputEditText2;
        textInputEditText2.setText(Tf.H("authcode"));
        this.B = (ProgressBar) findViewById(R.id.progressBar);
        this.C = (TextView) findViewById(R.id.progressText);
        ((TextView) findViewById(R.id.model)).setText(getString(R.string.text_car_model1, Tf.v(this)));
        this.F = (AutoCompleteTextView) findViewById(R.id.appList);
        ArrayList arrayList = new ArrayList();
        arrayList.add("NaviOnIP");
        arrayList.add("TouchControl");
        arrayList.add("NaviManager");
        arrayList.add("HiddenControl");
        this.F.setAdapter(new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, arrayList));
        this.y.setOnClickListener(new ViewOnClickListenerC0069c6(this, 1));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
