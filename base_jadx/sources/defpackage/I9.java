package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.DownloadActivity2;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadActivity2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ I9(DownloadActivity2 downloadActivity2, String str, int i) {
        this.a = i;
        this.b = downloadActivity2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.c;
        DownloadActivity2 downloadActivity2 = this.b;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity2.G;
                Toast.makeText(downloadActivity2.getApplicationContext(), str, 1).show();
                break;
            case 1:
                C0388mi c0388mi2 = DownloadActivity2.G;
                downloadActivity2.getClass();
                C0768yr.e("T500.DOWNLOADER", str + " was downloaded");
                downloadActivity2.E.post(new F9(0, downloadActivity2, 1));
                downloadActivity2.E();
                try {
                    File file = new File(downloadActivity2.getFilesDir(), str);
                    if (file.exists()) {
                        Uri uriD = FileProvider.d(downloadActivity2, downloadActivity2.getPackageName() + ".fileprovider", file);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(uriD, "application/vnd.android.package-archive");
                        intent.setFlags(268435456);
                        intent.addFlags(1);
                        if (intent.resolveActivity(downloadActivity2.getPackageManager()) != null) {
                            downloadActivity2.G(downloadActivity2.getString(R.string.text_installing_app2_msg, str));
                            downloadActivity2.startActivity(intent);
                        } else {
                            downloadActivity2.G(downloadActivity2.getString(R.string.text_no_app_msg));
                        }
                    } else {
                        downloadActivity2.G(downloadActivity2.getString(R.string.text_no_apk_found2_msg, str));
                    }
                } catch (Exception e) {
                    downloadActivity2.F(e, "installApk()");
                    return;
                }
                break;
            default:
                C0388mi c0388mi3 = DownloadActivity2.G;
                downloadActivity2.getClass();
                C0768yr.e("T500.DOWNLOADER", "Server's answer: " + str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("message")) {
                        downloadActivity2.G(downloadActivity2.getString(R.string.text_server_err_msg) + jSONObject.getString("message"));
                    }
                    downloadActivity2.E();
                } catch (JSONException e2) {
                    downloadActivity2.F(e2, "processErrorResponse()");
                }
                break;
        }
    }
}
