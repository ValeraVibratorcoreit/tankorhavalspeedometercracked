package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Lo implements InterfaceC0015ae {
    public static volatile Lo e;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public Lo() {
        this.a = 2;
        this.c = Collections.newSetFromMap(new WeakHashMap());
        this.d = new HashSet();
    }

    public static Lo b(Context context) {
        if (e == null) {
            synchronized (Lo.class) {
                try {
                    if (e == null) {
                        e = new Lo(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public boolean a(InterfaceC0732xm interfaceC0732xm) {
        boolean z = true;
        if (interfaceC0732xm == null) {
            return true;
        }
        boolean zRemove = ((Set) this.c).remove(interfaceC0732xm);
        if (!((HashSet) this.d).remove(interfaceC0732xm) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC0732xm.clear();
        }
        return z;
    }

    public void c() {
        if (this.b || ((HashSet) this.d).isEmpty()) {
            return;
        }
        C0441o9 c0441o9 = (C0441o9) this.c;
        InterfaceC0015ae interfaceC0015ae = (InterfaceC0015ae) c0441o9.c;
        boolean z = false;
        c0441o9.a = ((ConnectivityManager) interfaceC0015ae.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) interfaceC0015ae.get()).registerDefaultNetworkCallback((Ko) c0441o9.d);
            z = true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e2);
            }
        }
        this.b = z;
    }

    public void d() {
        InterfaceC0733xn interfaceC0733xn = (InterfaceC0733xn) this.c;
        AbstractC0695wg lifecycle = interfaceC0733xn.getLifecycle();
        if (((Fg) lifecycle).c != EnumC0633ug.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Kl(interfaceC0733xn));
        C0711x1 c0711x1 = (C0711x1) this.d;
        c0711x1.getClass();
        if (!(!c0711x1.c)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new F6(c0711x1, 2));
        c0711x1.c = true;
        this.b = true;
    }

    public void e(Bundle bundle) {
        if (!this.b) {
            d();
        }
        Fg fg = (Fg) ((InterfaceC0733xn) this.c).getLifecycle();
        if (!(!(fg.c.compareTo(EnumC0633ug.d) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + fg.c).toString());
        }
        C0711x1 c0711x1 = (C0711x1) this.d;
        if (!c0711x1.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!c0711x1.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        c0711x1.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0711x1.d = true;
    }

    public void f(Bundle bundle) {
        Tf.j("outBundle", bundle);
        C0711x1 c0711x1 = (C0711x1) this.d;
        c0711x1.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0711x1.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0455on c0455on = (C0455on) c0711x1.f;
        c0455on.getClass();
        C0393mn c0393mn = new C0393mn(c0455on);
        c0455on.c.put(c0393mn, Boolean.FALSE);
        while (c0393mn.hasNext()) {
            Map.Entry entry = (Map.Entry) c0393mn.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0702wn) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void g() {
        for (InterfaceC0732xm interfaceC0732xm : Qr.e((Set) this.c)) {
            if (!interfaceC0732xm.j() && !interfaceC0732xm.l()) {
                interfaceC0732xm.clear();
                if (this.b) {
                    ((HashSet) this.d).add(interfaceC0732xm);
                } else {
                    interfaceC0732xm.f();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC0015ae
    public Object get() {
        if (this.b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.b = true;
        try {
            return Ud.o((a) this.c, (List) this.d);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.c).size() + ", isPaused=" + this.b + "}";
            default:
                return super.toString();
        }
    }

    public Lo(InterfaceC0733xn interfaceC0733xn) {
        this.a = 3;
        this.c = interfaceC0733xn;
        this.d = new C0711x1();
    }

    public Lo(Context context) {
        this.a = 0;
        this.d = new HashSet();
        this.c = new C0441o9(new G7(new S3(context, 10)), new Io(this));
    }

    public Lo(a aVar, ArrayList arrayList, Td td) {
        this.a = 1;
        this.c = aVar;
        this.d = arrayList;
    }
}
