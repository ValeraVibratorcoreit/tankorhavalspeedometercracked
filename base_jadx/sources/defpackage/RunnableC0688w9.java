package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.zinovin.tankspeedometer.DownloadActivity;
import ru.zinovin.tankspeedometer.DownloadActivity2;

/* JADX INFO: renamed from: w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0688w9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ RunnableC0688w9(AtomicBoolean atomicBoolean, int i) {
        this.a = i;
        this.b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = this.b;
        switch (this.a) {
            case 0:
                C0388mi c0388mi = DownloadActivity.O;
                atomicBoolean.set(Ud.N());
                break;
            case 1:
                C0388mi c0388mi2 = DownloadActivity.O;
                atomicBoolean.set(Ud.N());
                break;
            case 2:
                C0388mi c0388mi3 = DownloadActivity2.G;
                atomicBoolean.set(Ud.N());
                break;
            default:
                C0388mi c0388mi4 = K9.d0;
                atomicBoolean.set(Ud.N());
                break;
        }
    }
}
