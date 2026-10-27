package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: renamed from: oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0450oi {
    public final Context a;
    public final ActivityManager b;
    public final C0308k0 c;
    public final float d;

    public C0450oi(Context context) {
        this.d = 1;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.c = new C0308k0(context.getResources().getDisplayMetrics(), 28);
        if (activityManager.isLowRamDevice()) {
            this.d = 0.0f;
        }
    }
}
