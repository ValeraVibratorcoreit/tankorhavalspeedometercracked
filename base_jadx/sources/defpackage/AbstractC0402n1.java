package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0402n1 {
    public static Context a;

    static {
        new WeakReference(null);
    }

    public static Context a() {
        if (a == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                a = ((Context) cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null)).getApplicationContext();
            } catch (Exception e) {
                throw new IllegalStateException("AppContext not initialized and cannot be auto-initialized", e);
            }
        }
        return a;
    }
}
