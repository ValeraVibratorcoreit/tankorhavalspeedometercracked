package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class Bm extends Thread {
    public final int a;

    public Bm(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
