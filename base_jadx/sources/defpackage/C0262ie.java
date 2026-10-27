package defpackage;

import android.os.IBinder;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0262ie implements IBinder.DeathRecipient {
    public final WeakReference a;

    public C0262ie(C0291je c0291je) {
        this.a = new WeakReference(c0291je);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        C0768yr.e("T500.GwmReader", "Сервис GWM умер, переподключение...");
        C0291je c0291je = (C0291je) this.a.get();
        if (c0291je == null || !c0291je.d) {
            return;
        }
        c0291je.d = false;
        if (c0291je.i != null) {
            C0096d2.P(false);
        }
        c0291je.f.postDelayed(new RunnableC0231he(c0291je, 0), 5000L);
    }
}
