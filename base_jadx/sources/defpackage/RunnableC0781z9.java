package defpackage;

import ru.zinovin.tankspeedometer.DownloadActivity;

/* JADX INFO: renamed from: z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0781z9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ RunnableC0781z9(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.b;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity.O;
                Tf.W("LALALA", str);
                break;
            default:
                C0388mi c0388mi2 = DownloadActivity.O;
                Tf.W("LALALA", str);
                break;
        }
    }
}
