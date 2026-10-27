package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0145el {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
