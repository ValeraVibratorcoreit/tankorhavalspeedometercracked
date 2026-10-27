package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class P6 extends Activity implements Ss, InterfaceC0508qe, InterfaceC0733xn, InterfaceC0052bk, D0, InterfaceC0083ck, InterfaceC0297jk, InterfaceC0175fk, InterfaceC0206gk, InterfaceC0666vi, Dg, InterfaceC0202gg {
    public static final /* synthetic */ int r = 0;
    public final Fg a = new Fg(this);
    public final G7 b = new G7();
    public final K2 c;
    public final Lo d;
    public Rs e;
    public final L6 f;
    public final Vp g;
    public final N6 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public boolean o;
    public boolean p;
    public final Vp q;

    public P6() {
        AbstractActivityC0495q1 abstractActivityC0495q1 = (AbstractActivityC0495q1) this;
        this.c = new K2(new E6(abstractActivityC0495q1, 0));
        Lo lo = new Lo((InterfaceC0733xn) this);
        this.d = lo;
        this.f = new L6(abstractActivityC0495q1);
        this.g = new Vp(new O6(abstractActivityC0495q1, 1));
        new AtomicInteger();
        this.h = new N6(abstractActivityC0495q1);
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        Fg fg = this.a;
        if (fg == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        fg.a(new F6(abstractActivityC0495q1, 0));
        this.a.a(new F6(abstractActivityC0495q1, 1));
        this.a.a(new Kl(abstractActivityC0495q1, 1));
        lo.d();
        Tf.o(this);
        ((C0711x1) lo.d).f("android:support:activity-result", new G6(abstractActivityC0495q1, 0));
        h(new H6(abstractActivityC0495q1, 0));
        this.q = new Vp(new O6(abstractActivityC0495q1, 2));
    }

    @Override // defpackage.InterfaceC0508qe
    public final C0420nj a() {
        C0420nj c0420nj = new C0420nj(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0420nj.a;
        if (application != null) {
            C0429ns c0429ns = F4.q;
            Application application2 = getApplication();
            Tf.i("application", application2);
            linkedHashMap.put(c0429ns, application2);
        }
        linkedHashMap.put(Tf.d, this);
        linkedHashMap.put(Tf.e, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(Tf.f, extras);
        }
        return c0420nj;
    }

    @Override // defpackage.InterfaceC0733xn
    public final C0711x1 b() {
        return (C0711x1) this.d.d;
    }

    @Override // defpackage.InterfaceC0202gg
    public final boolean c(KeyEvent keyEvent) {
        Tf.j("event", keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.Ss
    public final Rs d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        if (this.e == null) {
            K6 k6 = (K6) getLastNonConfigurationInstance();
            if (k6 != null) {
                this.e = k6.a;
            }
            if (this.e == null) {
                this.e = new Rs();
            }
        }
        Rs rs = this.e;
        Tf.f(rs);
        return rs;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Tf.j("event", keyEvent);
        Tf.i("window.decorView", getWindow().getDecorView());
        WeakHashMap weakHashMap = Gs.a;
        return c(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Tf.j("event", keyEvent);
        Tf.i("window.decorView", getWindow().getDecorView());
        WeakHashMap weakHashMap = Gs.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final void f(Ic ic) {
        Tf.j("provider", ic);
        K2 k2 = this.c;
        ((CopyOnWriteArrayList) k2.d).add(ic);
        ((Runnable) k2.c).run();
    }

    public final void g(InterfaceC0748y7 interfaceC0748y7) {
        Tf.j("listener", interfaceC0748y7);
        this.i.add(interfaceC0748y7);
    }

    @Override // defpackage.Dg
    public final AbstractC0695wg getLifecycle() {
        return this.a;
    }

    public final void h(InterfaceC0114dk interfaceC0114dk) {
        G7 g7 = this.b;
        g7.getClass();
        Context context = (Context) g7.b;
        if (context != null) {
            interfaceC0114dk.a(context);
        }
        ((CopyOnWriteArraySet) g7.a).add(interfaceC0114dk);
    }

    public final void i(Fc fc) {
        Tf.j("listener", fc);
        this.l.add(fc);
    }

    public final void j(Fc fc) {
        Tf.j("listener", fc);
        this.m.add(fc);
    }

    public final void k(Fc fc) {
        Tf.j("listener", fc);
        this.j.add(fc);
    }

    public final C0021ak l() {
        return (C0021ak) this.q.a();
    }

    public final void m(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.q(this);
    }

    public final void n(Bundle bundle) {
        Tf.j("outState", bundle);
        this.a.g(EnumC0633ug.c);
        super.onSaveInstanceState(bundle);
    }

    public final void o(Ic ic) {
        Tf.j("provider", ic);
        K2 k2 = this.c;
        ((CopyOnWriteArrayList) k2.d).remove(ic);
        Vo.l(((HashMap) k2.b).remove(ic));
        ((Runnable) k2.c).run();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        l().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Tf.j("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((InterfaceC0748y7) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.e(bundle);
        G7 g7 = this.b;
        g7.getClass();
        g7.b = this;
        Iterator it = ((CopyOnWriteArraySet) g7.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0114dk) it.next()).a(this);
        }
        m(bundle);
        int i = FragmentC0701wm.b;
        AbstractC0390mk.q(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        Tf.j("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((Ic) it.next()).a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Tf.j("item", menuItem);
        boolean z = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            if (((Ic) it.next()).a.o()) {
                return z;
            }
        }
        z = false;
        return z;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.o) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((InterfaceC0748y7) it.next()).accept(new C0327kj(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Tf.j("intent", intent);
        super.onNewIntent(intent);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((InterfaceC0748y7) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Tf.j("menu", menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((Ic) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0748y7) it.next()).accept(new Fk(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        Tf.j("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.d).iterator();
        while (it.hasNext()) {
            ((Ic) it.next()).a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Tf.j("permissions", strArr);
        Tf.j("grantResults", iArr);
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        K6 k6;
        Rs rs = this.e;
        if (rs == null && (k6 = (K6) getLastNonConfigurationInstance()) != null) {
            rs = k6.a;
        }
        if (rs == null) {
            return null;
        }
        K6 k7 = new K6();
        k7.a = rs;
        return k7;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Tf.j("outState", bundle);
        Fg fg = this.a;
        if (fg instanceof Fg) {
            Tf.g("null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry", fg);
            fg.g(EnumC0633ug.c);
        }
        n(bundle);
        this.d.f(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((InterfaceC0748y7) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void p(Fc fc) {
        Tf.j("listener", fc);
        this.i.remove(fc);
    }

    public final void q(Fc fc) {
        Tf.j("listener", fc);
        this.l.remove(fc);
    }

    public final void r(Fc fc) {
        Tf.j("listener", fc);
        this.m.remove(fc);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Tf.J()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0076cd c0076cd = (C0076cd) this.g.a();
            synchronized (c0076cd.a) {
                try {
                    c0076cd.b = true;
                    Iterator it = c0076cd.c.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0107dd) it.next()).a();
                    }
                    c0076cd.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void s(Fc fc) {
        Tf.j("listener", fc);
        this.j.remove(fc);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        View decorView = getWindow().getDecorView();
        Tf.i("window.decorView", decorView);
        F4.X(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Tf.i("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        Tf.i("window.decorView", decorView3);
        Ud.f0(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Tf.i("window.decorView", decorView4);
        Td.D(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Tf.i("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        Tf.i("window.decorView", decorView6);
        L6 l6 = this.f;
        l6.getClass();
        if (!l6.c) {
            l6.c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(l6);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        Tf.j("intent", intent);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        Tf.j("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        Tf.j("intent", intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Tf.j("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Tf.j("newConfig", configuration);
        this.o = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.o = false;
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((InterfaceC0748y7) it.next()).accept(new C0327kj(z));
            }
        } catch (Throwable th) {
            this.o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Tf.j("newConfig", configuration);
        this.p = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.p = false;
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((InterfaceC0748y7) it.next()).accept(new Fk(z));
            }
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }
}
