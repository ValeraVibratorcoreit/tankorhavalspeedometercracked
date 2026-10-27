package defpackage;

import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ E9(DownloadActivity downloadActivity, String str, int i) {
        this.a = i;
        this.b = downloadActivity;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DownloadActivity downloadActivity = this.b;
        String str = this.c;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity.O;
                downloadActivity.getClass();
                C0768yr.e("T500.DOWNLOADER", "Server's answer: " + str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("message")) {
                        downloadActivity.P(downloadActivity.getString(R.string.text_server_err_msg) + jSONObject.getString("message"));
                    }
                    downloadActivity.G();
                } catch (JSONException e) {
                    downloadActivity.H(e, "processErrorResponse()");
                    return;
                }
                break;
            default:
                C0388mi c0388mi2 = DownloadActivity.O;
                downloadActivity.getClass();
                try {
                    Toast.makeText(downloadActivity.getApplicationContext(), str, 1).show();
                } catch (Exception e2) {
                    C0768yr.c("T500.DOWNLOADER", "Error showing toast", e2);
                }
                break;
        }
    }
}
