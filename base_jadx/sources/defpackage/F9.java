package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.DownloadActivity2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ F9(int i, Object obj, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DownloadActivity downloadActivity = (DownloadActivity) this.c;
                ProgressBar progressBar = downloadActivity.C;
                int i = this.b;
                progressBar.setProgress(i);
                downloadActivity.D.setText(i + "%");
                break;
            case 1:
                DownloadActivity2 downloadActivity2 = (DownloadActivity2) this.c;
                ProgressBar progressBar2 = downloadActivity2.B;
                int i2 = this.b;
                progressBar2.setProgress(i2);
                downloadActivity2.C.setText(i2 + "%");
                break;
            case 2:
                K9 k9 = (K9) this.c;
                ProgressBar progressBar3 = k9.W;
                int i3 = this.b;
                progressBar3.setProgress(i3);
                k9.X.setText(i3 + "%");
                break;
            case 3:
                ((Br) this.c).O(this.b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.b, false);
                }
                break;
        }
    }
}
