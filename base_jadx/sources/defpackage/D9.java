package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.jni.JniUtils;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ D9(DownloadActivity downloadActivity, boolean z, int i) {
        this.a = i;
        this.b = downloadActivity;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z = this.c;
                DownloadActivity downloadActivity = this.b;
                String str = downloadActivity.H.equals("DEMO") ? "https://tankspeedometer.ru:9443/api/v2/cars/download-demo" : "https://tankspeedometer.ru:9443/api/cars/download";
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("vin", Tf.F(downloadActivity, "persist.gwm.vehicle.vin"));
                    jSONObject.put("version", Tf.x());
                    jSONObject.put("password", downloadActivity.A.getText().toString().trim());
                    jSONObject.put("token", downloadActivity.B.getText().toString().trim());
                    jSONObject.put("beta", z);
                    jSONObject.put("digits", JniUtils.getData(downloadActivity));
                    jSONObject.put("lang", downloadActivity.getResources().getConfiguration().locale.getLanguage());
                    break;
                } catch (JSONException e) {
                    downloadActivity.H(e, "downloadAndInstallApk()");
                }
                new Thread(new B9(downloadActivity, str, jSONObject, 1)).start();
                return;
            default:
                DownloadActivity downloadActivity2 = this.b;
                boolean z2 = this.c;
                synchronized (downloadActivity2.N) {
                    try {
                        if (!z2) {
                            downloadActivity2.P(downloadActivity2.getString(R.string.text_download_timeout));
                            if (downloadActivity2.J()) {
                                downloadActivity2.N();
                            }
                        } else if (downloadActivity2.M.isEmpty()) {
                            downloadActivity2.E();
                        } else if (downloadActivity2.J()) {
                            downloadActivity2.O();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
