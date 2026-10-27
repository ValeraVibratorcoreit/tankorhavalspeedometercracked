package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0238hl {
    public static final Hm a = new Hm();
    public static final Object b = new Object();
    public static C0387mh c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0176fl.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0387mh b() {
        C0387mh c0387mh = new C0387mh(9);
        c = c0387mh;
        Hm hm = a;
        hm.getClass();
        if (AbstractFutureC0647v.f.g(hm, null, c0387mh)) {
            AbstractFutureC0647v.b(hm);
        }
        return c;
    }

    public static void c(Context context, boolean z) {
        C0207gl c0207glA;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i2 = 0;
                boolean z2 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z3 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            c0207glA = C0207gl.a(file3);
                        } catch (IOException unused) {
                            b();
                            return;
                        }
                    } else {
                        c0207glA = null;
                    }
                    if (c0207glA != null && c0207glA.c == jA && (i = c0207glA.b) != 2) {
                        i2 = i;
                    } else if (z2) {
                        i2 = 1;
                    } else if (z3) {
                        i2 = 2;
                    }
                    if (z && z3 && i2 != 1) {
                        i2 = 2;
                    }
                    C0207gl c0207gl = new C0207gl(1, (c0207glA == null || c0207glA.b != 2 || i2 != 1 || length >= c0207glA.d) ? i2 : 3, jA, length2);
                    if (c0207glA == null || !c0207glA.equals(c0207gl)) {
                        try {
                            c0207gl.b(file3);
                        } catch (IOException unused2) {
                        }
                    }
                    b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    b();
                }
            }
        }
    }
}
