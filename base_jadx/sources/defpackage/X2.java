package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class X2 extends Td {
    public static volatile X2 i;
    public final Q8 h = new Q8();

    public static X2 R() {
        if (i != null) {
            return i;
        }
        synchronized (X2.class) {
            try {
                if (i == null) {
                    i = new X2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final void S(Runnable runnable) {
        Q8 q8 = this.h;
        if (q8.i == null) {
            synchronized (q8.h) {
                try {
                    if (q8.i == null) {
                        q8.i = Handler.createAsync(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        q8.i.post(runnable);
    }
}
