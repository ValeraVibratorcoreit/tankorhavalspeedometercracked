package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0093d implements A6, Yi {
    public Object a;
    public Object b;

    public /* synthetic */ AbstractC0093d(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public void d() {
        O1 o1 = (O1) this.a;
        if (o1 != null) {
            try {
                ((R1) this.b).k.unregisterReceiver(o1);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void e() {
        C0118dp c0118dp = (C0118dp) this.a;
        HashSet hashSet = c0118dp.e;
        if (hashSet.remove((C0529r5) this.b) && hashSet.isEmpty()) {
            c0118dp.b();
        }
    }

    public abstract IntentFilter f();

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof Tp)) {
            return menuItem;
        }
        Tp tp = (Tp) menuItem;
        if (((Fo) this.b) == null) {
            this.b = new Fo();
        }
        MenuItem menuItem2 = (MenuItem) ((Fo) this.b).getOrDefault(tp, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        Ci ci = new Ci((Context) this.a, tp);
        ((Fo) this.b).put(tp, ci);
        return ci;
    }

    public abstract void i();

    public void j() {
        d();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        if (((O1) this.a) == null) {
            this.a = new O1(this, 0);
        }
        ((R1) this.b).k.registerReceiver((O1) this.a, intentFilterF);
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        Class cls = (Class) this.b;
        return new C0360ll((Context) this.a, c0296jj.e(File.class, cls), c0296jj.e(Uri.class, cls), cls);
    }

    public AbstractC0093d() {
        this.b = new ArrayList();
    }

    public AbstractC0093d(Context context) {
        this.a = context;
    }

    public AbstractC0093d(R1 r1) {
        this.b = r1;
    }
}
