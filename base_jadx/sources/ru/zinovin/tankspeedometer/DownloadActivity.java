package ru.zinovin.tankspeedometer;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0390mk;
import defpackage.B1;
import defpackage.B9;
import defpackage.C0388mi;
import defpackage.C0768yr;
import defpackage.C9;
import defpackage.DialogInterfaceOnClickListenerC0750y9;
import defpackage.E9;
import defpackage.F4;
import defpackage.Lh;
import defpackage.M0;
import defpackage.Om;
import defpackage.P2;
import defpackage.RunnableC0688w9;
import defpackage.Tf;
import defpackage.Ud;
import defpackage.ViewOnClickListenerC0657v9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.jni.JniUtils;
import ru.zinovin.tankspeedometer.DownloadActivity;

/* JADX INFO: loaded from: classes.dex */
public class DownloadActivity extends AbstractActivityC0495q1 {
    public static final C0388mi O;
    public TextInputEditText A;
    public TextInputEditText B;
    public ProgressBar C;
    public TextView D;
    public CheckBox E;
    public CheckBox F;
    public Handler G;
    public ExecutorService J;
    public int K;
    public Button y;
    public Button z;
    public String H = "UPDATE";
    public boolean I = false;
    public int L = 0;
    public final ArrayList M = new ArrayList();
    public final Object N = new Object();

    static {
        Pattern pattern = C0388mi.c;
        O = Tf.r("application/json; charset=utf-8");
    }

    public final void E() {
        Tf.W("VERSION", Tf.x());
        K();
        startActivity(new Intent(this, (Class<?>) MainActivity.class));
        finish();
    }

    public final boolean F(String str, String str2, String str3) {
        C0388mi c0388mi = Om.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vin", Tf.F(null, "persist.gwm.vehicle.vin"));
            jSONObject.put("version", Tf.x());
            jSONObject.put("password", str2 != null ? str2.trim() : "");
            jSONObject.put("token", str3 != null ? str3.trim() : "");
            jSONObject.put("resource", str);
            jSONObject.put("digits", JniUtils.getData(this));
            jSONObject.put("lang", Locale.getDefault().getLanguage());
            return Om.a(this, jSONObject, str);
        } catch (JSONException e) {
            C0768yr.c("T500.ResourceDL", "JSON error for resource: " + str, e);
            return false;
        } catch (Exception e2) {
            C0768yr.c("T500.ResourceDL", "Unexpected error for resource: " + str, e2);
            return false;
        }
    }

    public final void G() {
        this.y.setEnabled(true);
        this.z.setEnabled(true);
        this.D.setVisibility(4);
        this.C.setVisibility(4);
    }

    public final void H(Exception exc, String str) {
        if (!isFinishing() && !isDestroyed()) {
            P("ERROR: " + exc.getMessage());
        }
        C0768yr.c("T500.ERROR", "ERROR in ".concat(str), exc);
    }

    public final void I(final String str, final String str2) {
        ArrayList<P2> arrayListD = Ud.D();
        this.K = arrayListD.size();
        synchronized (this.N) {
            this.M.clear();
        }
        this.L = 0;
        this.C.setMax(this.K);
        this.C.setProgress(0);
        this.D.setText(String.format(getString(R.string.text_download_progress), 0, Integer.valueOf(this.K)));
        final CountDownLatch countDownLatch = new CountDownLatch(this.K);
        for (final P2 p2 : arrayListD) {
            this.J.execute(new Runnable() { // from class: G9
                @Override // java.lang.Runnable
                public final void run() {
                    DownloadActivity downloadActivity = this.a;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    P2 p3 = p2;
                    String str3 = str;
                    String str4 = str2;
                    downloadActivity.getClass();
                    boolean zF = downloadActivity.F(p3.a, str3, str4);
                    synchronized (downloadActivity.N) {
                        try {
                            if (zF) {
                                downloadActivity.G.post(new RunnableC0719x9(downloadActivity, 0));
                            } else {
                                downloadActivity.M.add(p3.a);
                                String str5 = "Failed to download: " + p3.a;
                                C0768yr c0768yr = C0768yr.g;
                                Log.w("T500.DOWNLOADER", str5);
                                C0768yr c0768yr2 = C0768yr.g;
                                if (c0768yr2 != null) {
                                    c0768yr2.g("WARN", "T500.DOWNLOADER", str5);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    countDownLatch2.countDown();
                }
            });
        }
        new Thread(new C9(this, countDownLatch, 1)).start();
    }

    public final boolean J() {
        return (isFinishing() || isDestroyed()) ? false : true;
    }

    public final boolean K() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Thread thread = new Thread(new B1(this, 7, atomicBoolean));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            H(e, "isCarValid()");
        }
        return atomicBoolean.get();
    }

    public final void L() {
        if (J()) {
            synchronized (this.N) {
                try {
                    if (this.M.isEmpty()) {
                        if (J()) {
                            E();
                        }
                        return;
                    }
                    ArrayList<P2> arrayListD = Ud.D();
                    ArrayList arrayList = new ArrayList();
                    for (P2 p2 : arrayListD) {
                        if (this.M.contains(p2.a)) {
                            arrayList.add(p2);
                        }
                    }
                    this.K = arrayList.size();
                    this.L = 0;
                    if (J()) {
                        this.C.setMax(this.K);
                        this.C.setVisibility(0);
                        this.D.setVisibility(0);
                        Q();
                        Button button = this.y;
                        if (button != null) {
                            button.setEnabled(false);
                        }
                        Button button2 = this.z;
                        if (button2 != null) {
                            button2.setEnabled(false);
                        }
                    }
                    new ArrayList(this.M);
                    this.M.clear();
                    CountDownLatch countDownLatch = new CountDownLatch(this.K);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.J.execute(new B9(this, (P2) it.next(), countDownLatch, 0));
                    }
                    new Thread(new C9(this, countDownLatch, 0)).start();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void M() {
        this.C.setVisibility(4);
        this.D.setVisibility(4);
        Button button = this.y;
        if (button != null) {
            button.setEnabled(true);
            this.y.setText(getString(R.string.text_retry_failed));
            this.y.setOnClickListener(new ViewOnClickListenerC0657v9(this, 1));
        }
        Button button2 = this.z;
        if (button2 != null) {
            button2.setEnabled(true);
        }
        Resources resources = getResources();
        ArrayList arrayList = this.M;
        String quantityString = resources.getQuantityString(R.plurals.text_download_failed, arrayList.size(), Integer.valueOf(arrayList.size()));
        Lh lh = new Lh(this);
        lh.k(R.string.text_download_error);
        String str = quantityString + "\n\n" + getString(R.string.text_retry_question);
        M0 m0 = (M0) lh.b;
        m0.f = str;
        lh.j(new DialogInterfaceOnClickListenerC0750y9(this, 0));
        lh.i(R.string.text_cancel, new DialogInterfaceOnClickListenerC0750y9(this, 1));
        m0.m = false;
        try {
            lh.g();
        } catch (Exception e) {
            C0768yr.c("T500.DOWNLOADER", "Error showing dialog", e);
            finish();
        }
    }

    public final void N() {
        Lh lh = new Lh(this);
        lh.k(R.string.text_download_timeout);
        lh.h();
        lh.j(new DialogInterfaceOnClickListenerC0750y9(this, 2));
        lh.i(R.string.text_exit, new DialogInterfaceOnClickListenerC0750y9(this, 3));
        ((M0) lh.b).m = false;
        try {
            lh.g();
        } catch (Exception e) {
            C0768yr.c("T500.DOWNLOADER", "Error showing dialog", e);
            finish();
        }
    }

    public final void O() {
        this.C.setVisibility(4);
        this.D.setVisibility(4);
        Resources resources = getResources();
        ArrayList arrayList = this.M;
        String quantityString = resources.getQuantityString(R.plurals.text_some_resources_failed, arrayList.size(), Integer.valueOf(arrayList.size()));
        Lh lh = new Lh(this);
        lh.k(R.string.text_download_error);
        String str = quantityString + "\n\n" + getString(R.string.text_skip_or_retry);
        M0 m0 = (M0) lh.b;
        m0.f = str;
        lh.j(new DialogInterfaceOnClickListenerC0750y9(this, 4));
        DialogInterfaceOnClickListenerC0750y9 dialogInterfaceOnClickListenerC0750y9 = new DialogInterfaceOnClickListenerC0750y9(this, 5);
        m0.k = m0.a.getText(R.string.text_skip);
        m0.l = dialogInterfaceOnClickListenerC0750y9;
        lh.i(R.string.text_cancel, new DialogInterfaceOnClickListenerC0750y9(this, 6));
        m0.m = false;
        try {
            lh.g();
        } catch (Exception e) {
            C0768yr.c("T500.DOWNLOADER", "Error showing dialog", e);
            Tf.W("VERSION", Tf.x());
            K();
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
            finish();
        }
    }

    public final void P(String str) {
        if (this.I || isFinishing() || isDestroyed()) {
            return;
        }
        runOnUiThread(new E9(this, str, 1));
    }

    public final void Q() {
        this.C.setProgress(this.L);
        this.D.setText(String.format(getString(R.string.text_download_progress), Integer.valueOf(this.L), Integer.valueOf(this.K)));
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
        Bundle extras = getIntent().getExtras();
        this.H = extras.getString("DOWNLOAD_MODE", "UPDATE");
        boolean z = extras.getBoolean("MANUAL_DOWNLOAD");
        setContentView(R.layout.download_activity);
        D((MaterialToolbar) findViewById(R.id.toolbar));
        if (u() != null) {
            u().k0(true);
            u().m0(getString(R.string.text_update_btn));
        }
        this.G = new Handler(Looper.getMainLooper());
        this.J = Executors.newFixedThreadPool(3);
        if (F4.j(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            F4.W(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            finish();
        }
        if (!z && !this.H.equals("UPDATE") && !this.H.equals("DEMO")) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Thread thread = new Thread(new RunnableC0688w9(atomicBoolean, 1));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                H(e, "silentDownload()");
            }
            if (atomicBoolean.get() && K()) {
                this.I = true;
                C0768yr.e("T500.DOWNLOADER", "Resources can be downloaded in silent mode");
                setContentView(R.layout.resource_download_activity);
                this.C = (ProgressBar) findViewById(R.id.progressBar);
                this.D = (TextView) findViewById(R.id.progressText);
                I(Tf.H("password"), Tf.H("authcode"));
                return;
            }
        }
        this.I = false;
        this.E = (CheckBox) findViewById(R.id.forceDownload);
        this.F = (CheckBox) findViewById(R.id.betaDownload);
        Button button = (Button) findViewById(R.id.btnDownload);
        this.y = button;
        button.setEnabled(false);
        if (this.H.equals("DOWNLOAD")) {
            this.y.setText(getString(R.string.text_download_res_btn));
            this.E.setVisibility(4);
            this.F.setVisibility(4);
        } else if (this.H.equals("DEMO")) {
            this.y.setText(getString(R.string.text_demo_res_btn));
            this.E.setVisibility(4);
            this.F.setVisibility(4);
        }
        ((TextView) findViewById(R.id.vin)).setText("VIN: " + Tf.F(this, "persist.gwm.vehicle.vin"));
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.password);
        this.A = textInputEditText;
        textInputEditText.setText(Tf.H("password"));
        TextInputEditText textInputEditText2 = (TextInputEditText) findViewById(R.id.authcode);
        this.B = textInputEditText2;
        textInputEditText2.setText(Tf.H("authcode"));
        this.C = (ProgressBar) findViewById(R.id.progressBar);
        this.D = (TextView) findViewById(R.id.progressText);
        TextView textView = (TextView) findViewById(R.id.model);
        StringBuilder sb = new StringBuilder();
        sb.append(Tf.v(this));
        sb.append("/");
        sb.append(Tf.F(this, "persist.gwm.car.mode1") + "-" + Tf.F(this, "persist.gwm.car.mode2"));
        String string = sb.toString();
        ((TextView) findViewById(R.id.version)).setText(getString(R.string.text_version, Tf.s()));
        textView.setText(getString(R.string.text_car_model1, string));
        Button button2 = (Button) findViewById(R.id.btnAddWifi);
        this.z = button2;
        button2.setOnClickListener(new ViewOnClickListenerC0657v9(this, 0));
        this.y.setEnabled(true);
        this.y.setOnClickListener(new ViewOnClickListenerC0657v9(this, 2));
    }

    @Override // defpackage.AbstractActivityC0495q1, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.J;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.J.shutdownNow();
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
