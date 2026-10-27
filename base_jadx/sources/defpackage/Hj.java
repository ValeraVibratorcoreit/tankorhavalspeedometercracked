package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Hj {
    public final NotificationManager a;

    static {
        new HashSet();
    }

    public Hj(Context context) {
        this.a = (NotificationManager) context.getSystemService("notification");
    }
}
