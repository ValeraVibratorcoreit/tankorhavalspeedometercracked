package defpackage;

import android.os.Process;

/* JADX INFO: renamed from: k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0311k3 extends Thread {
    public final /* synthetic */ int a = 1;

    public /* synthetic */ C0311k3(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C0404n3 c0404n3G;
        switch (this.a) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                synchronized (C0404n3.class) {
                    C0404n3 c0404n3 = C0404n3.j;
                    c0404n3G = Br.g();
                    if (c0404n3G == C0404n3.j) {
                        C0404n3.j = null;
                        return;
                    }
                }
                if (c0404n3G != null) {
                    c0404n3G.k();
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }

    public /* synthetic */ C0311k3(String str) {
        super(str);
    }
}
