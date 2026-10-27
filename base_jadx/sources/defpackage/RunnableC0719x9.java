package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0719x9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadActivity b;

    public /* synthetic */ RunnableC0719x9(DownloadActivity downloadActivity, int i) {
        this.a = i;
        this.b = downloadActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DownloadActivity downloadActivity = this.b;
                downloadActivity.L++;
                downloadActivity.Q();
                return;
            case 1:
                C0388mi c0388mi = DownloadActivity.O;
                this.b.G();
                return;
            case 2:
                DownloadActivity downloadActivity2 = this.b;
                downloadActivity2.L++;
                downloadActivity2.Q();
                return;
            case 3:
                C0388mi c0388mi2 = DownloadActivity.O;
                DownloadActivity downloadActivity3 = this.b;
                downloadActivity3.P(downloadActivity3.getString(R.string.text_download_interrupted));
                return;
            case 4:
                C0388mi c0388mi3 = DownloadActivity.O;
                DownloadActivity downloadActivity4 = this.b;
                downloadActivity4.getClass();
                C0768yr.e("T500.DOWNLOADER", "TankSpeedometer.apk was downloaded");
                downloadActivity4.G.post(new F9(0, downloadActivity4, 0));
                downloadActivity4.G();
                try {
                    File file = new File(downloadActivity4.getFilesDir(), "TankSpeedometer.apk");
                    if (!file.exists()) {
                        downloadActivity4.P(downloadActivity4.getString(R.string.text_no_apk_found_msg));
                        return;
                    }
                    Uri uriD = FileProvider.d(downloadActivity4, downloadActivity4.getPackageName() + ".fileprovider", file);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(uriD, "application/vnd.android.package-archive");
                    intent.setFlags(268435456);
                    intent.addFlags(1);
                    if (intent.resolveActivity(downloadActivity4.getPackageManager()) == null) {
                        downloadActivity4.P(downloadActivity4.getString(R.string.text_no_app_msg));
                        return;
                    }
                    if (downloadActivity4.E.isChecked() || downloadActivity4.H.equals("DEMO")) {
                        Tf.W("VERSION", "0.0.0");
                    }
                    Tf.W("SHOW_ABOUT", "true");
                    SharedPreferences.Editor editorEdit = AbstractC0390mk.l(AbstractC0402n1.a()).edit();
                    editorEdit.putBoolean("MICROMODE", false);
                    editorEdit.apply();
                    downloadActivity4.P(downloadActivity4.getString(R.string.text_installing_app_msg));
                    downloadActivity4.startActivity(intent);
                    downloadActivity4.finish();
                    return;
                } catch (Exception e) {
                    downloadActivity4.H(e, "installApk()");
                    return;
                }
            case 5:
                C0388mi c0388mi4 = DownloadActivity.O;
                DownloadActivity downloadActivity5 = this.b;
                downloadActivity5.P(downloadActivity5.getString(R.string.text_download_timeout));
                downloadActivity5.N();
                return;
            case 6:
                DownloadActivity downloadActivity6 = this.b;
                synchronized (downloadActivity6.N) {
                    try {
                        if (downloadActivity6.M.isEmpty()) {
                            downloadActivity6.E();
                        } else {
                            downloadActivity6.M();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                C0388mi c0388mi5 = DownloadActivity.O;
                DownloadActivity downloadActivity7 = this.b;
                downloadActivity7.P(downloadActivity7.getString(R.string.text_download_interrupted));
                downloadActivity7.finish();
                return;
        }
    }
}
