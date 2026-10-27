package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class E1 {
    public static final C1 a = new C1(new D1(0));
    public static final int b = -100;
    public static C0325kh c = null;
    public static C0325kh d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final C0127e3 g = new C0127e3();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean c(Context context) {
        if (e == null) {
            try {
                int i2 = M2.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) M2.class), L2.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void f(E1 e1) {
        synchronized (h) {
            try {
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    E1 e2 = (E1) ((WeakReference) it.next()).get();
                    if (e2 == e1 || e2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
