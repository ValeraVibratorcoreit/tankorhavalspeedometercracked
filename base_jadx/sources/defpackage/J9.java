package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ K9 b;
    public final /* synthetic */ String c;

    public /* synthetic */ J9(K9 k9, String str, int i) {
        this.a = i;
        this.b = k9;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.c;
        K9 k9 = this.b;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = K9.d0;
                Toast.makeText(k9.I(), str, 1).show();
                break;
            case 1:
                C0388mi c0388mi2 = K9.d0;
                k9.getClass();
                C0768yr.e("T500.DOWNLOADER", str + " was downloaded");
                k9.Q(new F9(0, k9, 2));
                k9.O();
                try {
                    File file = new File(k9.I().getFilesDir(), str);
                    if (file.exists()) {
                        Uri uriD = FileProvider.d(k9.I(), k9.I().getPackageName() + ".fileprovider", file);
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setDataAndType(uriD, "application/vnd.android.package-archive");
                        intent.setFlags(268435456);
                        intent.addFlags(1);
                        if (intent.resolveActivity(k9.I().getPackageManager()) != null) {
                            k9.R(k9.m(R.string.text_installing_app2_msg, str));
                            k9.M(intent);
                        } else {
                            k9.R(k9.l(R.string.text_no_app_msg));
                        }
                    } else {
                        k9.R(k9.m(R.string.text_no_apk_found2_msg, str));
                    }
                } catch (Exception e) {
                    k9.P(e, "installApk()");
                    return;
                }
                break;
            default:
                C0388mi c0388mi3 = K9.d0;
                k9.getClass();
                C0768yr.e("T500.DOWNLOADER", "Server's answer: " + str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("message")) {
                        k9.R(k9.l(R.string.text_server_err_msg) + jSONObject.getString("message"));
                    }
                    k9.O();
                } catch (JSONException e2) {
                    k9.P(e2, "processErrorResponse()");
                }
                break;
        }
    }
}
