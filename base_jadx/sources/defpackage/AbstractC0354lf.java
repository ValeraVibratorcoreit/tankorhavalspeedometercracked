package defpackage;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* JADX INFO: renamed from: lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0354lf {
    public static int a(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri d(Object obj) {
        return ((Icon) obj).getUri();
    }
}
