package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class Ca implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC0090cr.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0782za.k != null) {
                C0782za.a().c();
            }
        } finally {
            int i2 = AbstractC0090cr.a;
            Trace.endSection();
        }
    }
}
