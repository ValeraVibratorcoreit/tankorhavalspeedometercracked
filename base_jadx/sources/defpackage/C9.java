package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ru.zinovin.tankspeedometer.DownloadActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadActivity b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ C9(DownloadActivity downloadActivity, CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = downloadActivity;
        this.c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DownloadActivity downloadActivity = this.b;
        CountDownLatch countDownLatch = this.c;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity.O;
                downloadActivity.getClass();
                try {
                    boolean zAwait = countDownLatch.await(3L, TimeUnit.MINUTES);
                    if (downloadActivity.J()) {
                        downloadActivity.G.post(new D9(downloadActivity, zAwait, 1));
                    }
                } catch (InterruptedException unused) {
                    if (downloadActivity.J()) {
                        downloadActivity.G.post(new RunnableC0719x9(downloadActivity, 3));
                        return;
                    }
                    return;
                }
                break;
            default:
                C0388mi c0388mi2 = DownloadActivity.O;
                downloadActivity.getClass();
                try {
                    if (countDownLatch.await(20L, TimeUnit.MINUTES)) {
                        downloadActivity.G.post(new RunnableC0719x9(downloadActivity, 6));
                    } else {
                        downloadActivity.G.post(new RunnableC0719x9(downloadActivity, 5));
                    }
                } catch (InterruptedException unused2) {
                    downloadActivity.G.post(new RunnableC0719x9(downloadActivity, 7));
                    return;
                }
                break;
        }
    }
}
