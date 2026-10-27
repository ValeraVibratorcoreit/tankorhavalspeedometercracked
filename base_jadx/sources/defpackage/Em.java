package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Em implements ComponentCallbacks2, Bg {
    public static final Gm k;
    public final a a;
    public final Context b;
    public final InterfaceC0664vg c;
    public final Lo d;
    public final C0225h8 e;
    public final C0243hq f;
    public final RunnableC0524r0 g;
    public final InterfaceC0008a7 h;
    public final CopyOnWriteArrayList i;
    public final Gm j;

    static {
        Gm gm = (Gm) new Gm().c(Bitmap.class);
        gm.t = true;
        k = gm;
        ((Gm) new Gm().c(Id.class)).t = true;
    }

    public Em(a aVar, InterfaceC0664vg interfaceC0664vg, C0225h8 c0225h8, Context context) {
        Gm gm;
        Lo lo = new Lo();
        C0225h8 c0225h9 = aVar.f;
        this.f = new C0243hq();
        RunnableC0524r0 runnableC0524r0 = new RunnableC0524r0(this, 13);
        this.g = runnableC0524r0;
        this.a = aVar;
        this.c = interfaceC0664vg;
        this.e = c0225h8;
        this.d = lo;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        Dm dm = new Dm(this, lo);
        c0225h9.getClass();
        boolean z = F4.j(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC0008a7 c0594t8 = z ? new C0594t8(applicationContext, dm) : new Ij();
        this.h = c0594t8;
        synchronized (aVar.g) {
            if (aVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.g.add(this);
        }
        char[] cArr = Qr.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            Qr.f().post(runnableC0524r0);
        } else {
            interfaceC0664vg.g(this);
        }
        interfaceC0664vg.g(c0594t8);
        this.i = new CopyOnWriteArrayList(aVar.c.e);
        Vd vd = aVar.c;
        synchronized (vd) {
            try {
                if (vd.j == null) {
                    vd.d.getClass();
                    Gm gm2 = new Gm();
                    gm2.t = true;
                    vd.j = gm2;
                }
                gm = vd.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            Gm gm3 = (Gm) gm.clone();
            if (gm3.t && !gm3.v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            gm3.v = true;
            gm3.t = true;
            this.j = gm3;
        }
    }

    @Override // defpackage.Bg
    public final synchronized void f() {
        this.f.f();
        m();
    }

    @Override // defpackage.Bg
    public final synchronized void j() {
        n();
        this.f.j();
    }

    @Override // defpackage.Bg
    public final synchronized void k() {
        this.f.k();
        synchronized (this) {
            try {
                Iterator it = Qr.e(this.f.a).iterator();
                while (it.hasNext()) {
                    l((InterfaceC0212gq) it.next());
                }
                this.f.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        Lo lo = this.d;
        Iterator it2 = Qr.e((Set) lo.c).iterator();
        while (it2.hasNext()) {
            lo.a((InterfaceC0732xm) it2.next());
        }
        ((HashSet) lo.d).clear();
        this.c.f(this);
        this.c.f(this.h);
        Qr.f().removeCallbacks(this.g);
        this.a.c(this);
    }

    public final void l(InterfaceC0212gq interfaceC0212gq) {
        if (interfaceC0212gq == null) {
            return;
        }
        boolean zO = o(interfaceC0212gq);
        InterfaceC0732xm interfaceC0732xmG = interfaceC0212gq.g();
        if (zO) {
            return;
        }
        a aVar = this.a;
        synchronized (aVar.g) {
            try {
                Iterator it = aVar.g.iterator();
                while (it.hasNext()) {
                    if (((Em) it.next()).o(interfaceC0212gq)) {
                    }
                }
                if (interfaceC0732xmG != null) {
                    interfaceC0212gq.b(null);
                    interfaceC0732xmG.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m() {
        Lo lo = this.d;
        lo.b = true;
        for (InterfaceC0732xm interfaceC0732xm : Qr.e((Set) lo.c)) {
            if (interfaceC0732xm.isRunning()) {
                interfaceC0732xm.d();
                ((HashSet) lo.d).add(interfaceC0732xm);
            }
        }
    }

    public final synchronized void n() {
        Lo lo = this.d;
        lo.b = false;
        for (InterfaceC0732xm interfaceC0732xm : Qr.e((Set) lo.c)) {
            if (!interfaceC0732xm.j() && !interfaceC0732xm.isRunning()) {
                interfaceC0732xm.f();
            }
        }
        ((HashSet) lo.d).clear();
    }

    public final synchronized boolean o(InterfaceC0212gq interfaceC0212gq) {
        InterfaceC0732xm interfaceC0732xmG = interfaceC0212gq.g();
        if (interfaceC0732xmG == null) {
            return true;
        }
        if (!this.d.a(interfaceC0732xmG)) {
            return false;
        }
        this.f.a.remove(interfaceC0212gq);
        interfaceC0212gq.b(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }
}
