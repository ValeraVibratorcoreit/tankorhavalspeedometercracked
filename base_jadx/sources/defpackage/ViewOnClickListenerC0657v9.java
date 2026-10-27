package defpackage;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.view.View;
import android.widget.EditText;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.jni.JniUtils;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0657v9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadActivity b;

    public /* synthetic */ ViewOnClickListenerC0657v9(DownloadActivity downloadActivity, int i) {
        this.a = i;
        this.b = downloadActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = 1;
        int i = 0;
        final DownloadActivity downloadActivity = this.b;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity.O;
                EditText editText = (EditText) downloadActivity.findViewById(R.id.wifiName);
                EditText editText2 = (EditText) downloadActivity.findViewById(R.id.wifiPassword);
                if (editText.getText().toString().isEmpty() || editText2.getText().toString().isEmpty()) {
                    downloadActivity.P(downloadActivity.getString(R.string.text_empty_pass_name_warn));
                } else {
                    String string = editText.getText().toString();
                    String string2 = editText2.getText().toString();
                    WifiManager wifiManager = (WifiManager) downloadActivity.getApplicationContext().getSystemService("wifi");
                    WifiConfiguration wifiConfiguration = new WifiConfiguration();
                    wifiConfiguration.SSID = Vo.g("\"", string, "\"");
                    wifiConfiguration.preSharedKey = Vo.g("\"", string2, "\"");
                    int iAddNetwork = wifiManager.addNetwork(wifiConfiguration);
                    wifiManager.disconnect();
                    wifiManager.enableNetwork(iAddNetwork, true);
                    wifiManager.reconnect();
                    downloadActivity.P(String.format(downloadActivity.getString(R.string.text_wifi_added_msg), string));
                }
                break;
            case 1:
                C0388mi c0388mi2 = DownloadActivity.O;
                downloadActivity.L();
                break;
            default:
                C0388mi c0388mi3 = DownloadActivity.O;
                downloadActivity.getClass();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Thread thread = new Thread(new RunnableC0688w9(atomicBoolean, i));
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    downloadActivity.H(e, "allowAction()");
                }
                if (atomicBoolean.get()) {
                    if (downloadActivity.A.getText().toString().isEmpty()) {
                        downloadActivity.P(downloadActivity.getString(R.string.text_empty_password_warn));
                        break;
                    } else {
                        downloadActivity.y.setEnabled(false);
                        downloadActivity.z.setEnabled(false);
                        Tf.W("password", downloadActivity.A.getText().toString().trim());
                        Tf.W("authcode", downloadActivity.B.getText().toString().trim());
                        downloadActivity.C.setVisibility(0);
                        downloadActivity.D.setVisibility(0);
                        String str = downloadActivity.H;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -2084521848:
                                b = !str.equals("DOWNLOAD") ? (byte) -1 : (byte) 0;
                                break;
                            case -1785516855:
                                if (!str.equals("UPDATE")) {
                                    b = -1;
                                }
                                break;
                            case 2094563:
                                b = !str.equals("DEMO") ? (byte) -1 : (byte) 2;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                downloadActivity.I(downloadActivity.A.getText().toString(), downloadActivity.B.getText().toString());
                                break;
                            case 1:
                                final boolean zIsChecked = downloadActivity.E.isChecked();
                                final boolean zIsChecked2 = downloadActivity.F.isChecked();
                                new Thread(new Runnable() { // from class: A9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z = zIsChecked2;
                                        C0388mi c0388mi4 = DownloadActivity.O;
                                        DownloadActivity downloadActivity2 = downloadActivity;
                                        downloadActivity2.getClass();
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("vin", Tf.F(downloadActivity2, "persist.gwm.vehicle.vin"));
                                            jSONObject.put("password", downloadActivity2.A.getText().toString().trim());
                                            jSONObject.put("token", downloadActivity2.B.getText().toString().trim());
                                            jSONObject.put("digits", JniUtils.getData(downloadActivity2));
                                            jSONObject.put("lang", downloadActivity2.getResources().getConfiguration().locale.getLanguage());
                                        } catch (JSONException e2) {
                                            downloadActivity2.H(e2, "checkForUpdate()");
                                        }
                                        C0043bb c0043bbA = C0043bb.a(DownloadActivity.O, jSONObject.toString());
                                        Pj pj = new Pj();
                                        H0 h0 = new H0();
                                        h0.q("https://tankspeedometer.ru:9443/api/v2/cars/check-update");
                                        h0.j("POST", c0043bbA);
                                        try {
                                            C0117dn c0117dnC = new Dl(pj, h0.a()).c();
                                            try {
                                                boolean zW = c0117dnC.w();
                                                Jl jl = c0117dnC.g;
                                                if (!zW) {
                                                    downloadActivity2.G.post(new E9(downloadActivity2, jl.y(), 0));
                                                    downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                                } else if (jl != null) {
                                                    JSONObject jSONObject2 = new JSONObject(jl.y());
                                                    String string3 = jSONObject2.getString("version");
                                                    jSONObject2.getString("url");
                                                    downloadActivity2.G.post(new RunnableC0781z9(jSONObject2.getString("init_date"), 1));
                                                    if (zIsChecked || Tf.l(Tf.x(), string3) < 0 || downloadActivity2.H.equals("DEMO")) {
                                                        downloadActivity2.G.post(new D9(downloadActivity2, z, 0));
                                                    } else {
                                                        downloadActivity2.P(downloadActivity2.getString(R.string.text_last_version_msg));
                                                        downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                                    }
                                                } else {
                                                    downloadActivity2.P(downloadActivity2.getString(R.string.text_empty_answer_msg));
                                                    downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                                }
                                                c0117dnC.close();
                                            } catch (Throwable th) {
                                                try {
                                                    c0117dnC.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e3) {
                                            downloadActivity2.H(e3, "checkForUpdate()");
                                            downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                        }
                                    }
                                }).start();
                                break;
                            case 2:
                                final boolean zIsChecked3 = downloadActivity.E.isChecked();
                                final boolean zIsChecked4 = downloadActivity.F.isChecked();
                                new Thread(new Runnable() { // from class: A9
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z = zIsChecked4;
                                        C0388mi c0388mi4 = DownloadActivity.O;
                                        DownloadActivity downloadActivity2 = downloadActivity;
                                        downloadActivity2.getClass();
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("vin", Tf.F(downloadActivity2, "persist.gwm.vehicle.vin"));
                                            jSONObject.put("password", downloadActivity2.A.getText().toString().trim());
                                            jSONObject.put("token", downloadActivity2.B.getText().toString().trim());
                                            jSONObject.put("digits", JniUtils.getData(downloadActivity2));
                                            jSONObject.put("lang", downloadActivity2.getResources().getConfiguration().locale.getLanguage());
                                        } catch (JSONException e2) {
                                            downloadActivity2.H(e2, "checkForUpdate()");
                                        }
                                        C0043bb c0043bbA = C0043bb.a(DownloadActivity.O, jSONObject.toString());
                                        Pj pj = new Pj();
                                        H0 h0 = new H0();
                                        h0.q("https://tankspeedometer.ru:9443/api/v2/cars/check-update");
                                        h0.j("POST", c0043bbA);
                                        try {
                                            C0117dn c0117dnC = new Dl(pj, h0.a()).c();
                                            try {
                                                boolean zW = c0117dnC.w();
                                                Jl jl = c0117dnC.g;
                                                if (!zW) {
                                                    downloadActivity2.G.post(new E9(downloadActivity2, jl.y(), 0));
                                                    downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                                } else if (jl != null) {
                                                    JSONObject jSONObject2 = new JSONObject(jl.y());
                                                    String string3 = jSONObject2.getString("version");
                                                    jSONObject2.getString("url");
                                                    downloadActivity2.G.post(new RunnableC0781z9(jSONObject2.getString("init_date"), 1));
                                                    if (zIsChecked3 || Tf.l(Tf.x(), string3) < 0 || downloadActivity2.H.equals("DEMO")) {
                                                        downloadActivity2.G.post(new D9(downloadActivity2, z, 0));
                                                    } else {
                                                        downloadActivity2.P(downloadActivity2.getString(R.string.text_last_version_msg));
                                                        downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                                    }
                                                } else {
                                                    downloadActivity2.P(downloadActivity2.getString(R.string.text_empty_answer_msg));
                                                    downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                                }
                                                c0117dnC.close();
                                            } catch (Throwable th) {
                                                try {
                                                    c0117dnC.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e3) {
                                            downloadActivity2.H(e3, "checkForUpdate()");
                                            downloadActivity2.G.post(new RunnableC0719x9(downloadActivity2, 1));
                                        }
                                    }
                                }).start();
                                break;
                        }
                    }
                } else {
                    downloadActivity.P(downloadActivity.getString(R.string.text_no_internet_msg));
                    break;
                }
                break;
        }
    }
}
