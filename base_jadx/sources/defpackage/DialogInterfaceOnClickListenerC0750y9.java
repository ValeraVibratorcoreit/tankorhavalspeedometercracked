package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.MainActivity;

/* JADX INFO: renamed from: y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0750y9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadActivity b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0750y9(DownloadActivity downloadActivity, int i) {
        this.a = i;
        this.b = downloadActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadActivity downloadActivity = this.b;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity.O;
                downloadActivity.L();
                break;
            case 1:
                C0388mi c0388mi2 = DownloadActivity.O;
                downloadActivity.finish();
                break;
            case 2:
                C0388mi c0388mi3 = DownloadActivity.O;
                downloadActivity.getClass();
                downloadActivity.I(Tf.H("password"), Tf.H("authcode"));
                break;
            case 3:
                C0388mi c0388mi4 = DownloadActivity.O;
                downloadActivity.finish();
                break;
            case 4:
                C0388mi c0388mi5 = DownloadActivity.O;
                downloadActivity.L();
                break;
            case 5:
                C0388mi c0388mi6 = DownloadActivity.O;
                downloadActivity.getClass();
                Tf.W("VERSION", Tf.x());
                downloadActivity.K();
                downloadActivity.startActivity(new Intent(downloadActivity, (Class<?>) MainActivity.class));
                downloadActivity.finish();
                break;
            default:
                C0388mi c0388mi7 = DownloadActivity.O;
                downloadActivity.finish();
                break;
        }
    }
}
