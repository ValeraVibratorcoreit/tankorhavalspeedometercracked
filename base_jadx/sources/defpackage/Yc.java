package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class Yc {
    public static final Xc a = Xc.a;

    public static Xc a(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        while (abstractComponentCallbacksC0784zc != null) {
            if (abstractComponentCallbacksC0784zc.p()) {
                abstractComponentCallbacksC0784zc.j();
            }
            abstractComponentCallbacksC0784zc = abstractComponentCallbacksC0784zc.u;
        }
        return a;
    }

    public static void b(Tc tc) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(tc.a.getClass().getName()), tc);
        }
    }

    public static final void c(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc, String str) {
        Tf.j("fragment", abstractComponentCallbacksC0784zc);
        Tf.j("previousFragmentId", str);
        b(new Tc(abstractComponentCallbacksC0784zc, "Attempting to reuse fragment " + abstractComponentCallbacksC0784zc + " with previous ID " + str));
        a(abstractComponentCallbacksC0784zc).getClass();
    }
}
