package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0784zc implements ComponentCallbacks, View.OnCreateContextMenuListener, Dg, Ss, InterfaceC0508qe, InterfaceC0733xn {
    public static final Object S = new Object();
    public boolean A;
    public boolean C;
    public ViewGroup D;
    public View E;
    public boolean F;
    public C0722xc H;
    public boolean I;
    public boolean J;
    public String K;
    public Fg M;
    public C0014ad N;
    public Lo P;
    public final ArrayList Q;
    public final C0660vc R;
    public Bundle b;
    public SparseArray c;
    public Bundle d;
    public Bundle f;
    public AbstractComponentCallbacksC0784zc g;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public Oc r;
    public Bc s;
    public AbstractComponentCallbacksC0784zc u;
    public int v;
    public int w;
    public String x;
    public boolean y;
    public boolean z;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String h = null;
    public Boolean j = null;
    public Oc t = new Oc();
    public final boolean B = true;
    public boolean G = true;
    public EnumC0633ug L = EnumC0633ug.e;
    public final C0451oj O = new C0451oj();

    public AbstractComponentCallbacksC0784zc() {
        new AtomicInteger();
        this.Q = new ArrayList();
        this.R = new C0660vc(this);
        n();
    }

    public void A() {
        this.C = true;
    }

    public void B(Bundle bundle) {
    }

    public void C() {
        this.C = true;
    }

    public void D() {
        this.C = true;
    }

    public void E(View view) {
    }

    public void F(Bundle bundle) {
        this.C = true;
    }

    public void G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t.L();
        this.p = true;
        this.N = new C0014ad(this, d());
        View viewW = w(layoutInflater, viewGroup);
        this.E = viewW;
        if (viewW == null) {
            if (this.N.c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.N = null;
            return;
        }
        this.N.e();
        F4.X(this.E, this.N);
        View view = this.E;
        C0014ad c0014ad = this.N;
        Tf.j("<this>", view);
        view.setTag(R.id.view_tree_view_model_store_owner, c0014ad);
        Ud.f0(this.E, this.N);
        this.O.e(this.N);
    }

    public final AbstractActivityC0495q1 H() {
        AbstractActivityC0495q1 abstractActivityC0495q1F = f();
        if (abstractActivityC0495q1F != null) {
            return abstractActivityC0495q1F;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context I() {
        Context contextH = h();
        if (contextH != null) {
            return contextH;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View J() {
        View view = this.E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void K(int i, int i2, int i3, int i4) {
        if (this.H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        e().b = i;
        e().c = i2;
        e().d = i3;
        e().e = i4;
    }

    public final void L(Bundle bundle) {
        Oc oc = this.r;
        if (oc != null && (oc.E || oc.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f = bundle;
    }

    public final void M(Intent intent) {
        Bc bc = this.s;
        if (bc != null) {
            bc.k.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final void N(Intent intent, int i) throws Exception {
        if (this.s == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        Oc ocJ = j();
        if (ocJ.z == null) {
            Bc bc = ocJ.t;
            if (i == -1) {
                bc.k.startActivity(intent, null);
                return;
            } else {
                bc.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        String str = this.e;
        Lc lc = new Lc();
        lc.a = str;
        lc.b = i;
        ocJ.C.addLast(lc);
        K2 k2 = ocJ.z;
        N6 n6 = (N6) k2.b;
        LinkedHashMap linkedHashMap = n6.b;
        String str2 = (String) k2.c;
        Object obj = linkedHashMap.get(str2);
        Td td = (Td) k2.d;
        if (obj == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + td + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj).intValue();
        ArrayList arrayList = n6.d;
        arrayList.add(str2);
        try {
            n6.b(iIntValue, td, intent);
        } catch (Exception e) {
            arrayList.remove(str2);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC0508qe
    public final C0420nj a() {
        Application application;
        Context applicationContext = I().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + I().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0420nj c0420nj = new C0420nj(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0420nj.a;
        if (application != null) {
            linkedHashMap.put(F4.q, application);
        }
        linkedHashMap.put(Tf.d, this);
        linkedHashMap.put(Tf.e, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(Tf.f, bundle);
        }
        return c0420nj;
    }

    @Override // defpackage.InterfaceC0733xn
    public final C0711x1 b() {
        return (C0711x1) this.P.d;
    }

    public Br c() {
        return new C0691wc(this);
    }

    @Override // defpackage.Ss
    public final Rs d() {
        if (this.r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.r.L.d;
        Rs rs = (Rs) map.get(this.e);
        if (rs != null) {
            return rs;
        }
        Rs rs2 = new Rs();
        map.put(this.e, rs2);
        return rs2;
    }

    public final C0722xc e() {
        if (this.H == null) {
            C0722xc c0722xc = new C0722xc();
            Object obj = S;
            c0722xc.g = obj;
            c0722xc.h = obj;
            c0722xc.i = obj;
            c0722xc.j = 1.0f;
            c0722xc.k = null;
            this.H = c0722xc;
        }
        return this.H;
    }

    public final AbstractActivityC0495q1 f() {
        Bc bc = this.s;
        if (bc == null) {
            return null;
        }
        return (AbstractActivityC0495q1) bc.j;
    }

    public final Oc g() {
        if (this.s != null) {
            return this.t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // defpackage.Dg
    public final AbstractC0695wg getLifecycle() {
        return this.M;
    }

    public final Context h() {
        Bc bc = this.s;
        if (bc == null) {
            return null;
        }
        return bc.k;
    }

    public final int i() {
        EnumC0633ug enumC0633ug = this.L;
        return (enumC0633ug == EnumC0633ug.b || this.u == null) ? enumC0633ug.ordinal() : Math.min(enumC0633ug.ordinal(), this.u.i());
    }

    public final Oc j() {
        Oc oc = this.r;
        if (oc != null) {
            return oc;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Resources k() {
        return I().getResources();
    }

    public final String l(int i) {
        return k().getString(i);
    }

    public final String m(int i, Object... objArr) {
        return k().getString(i, objArr);
    }

    public final void n() {
        this.M = new Fg(this);
        this.P = new Lo(this);
        ArrayList arrayList = this.Q;
        C0660vc c0660vc = this.R;
        if (arrayList.contains(c0660vc)) {
            return;
        }
        if (this.a < 0) {
            arrayList.add(c0660vc);
            return;
        }
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = c0660vc.a;
        abstractComponentCallbacksC0784zc.P.d();
        Tf.o(abstractComponentCallbacksC0784zc);
    }

    public final void o() {
        n();
        this.K = this.e;
        this.e = UUID.randomUUID().toString();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.q = 0;
        this.r = null;
        this.t = new Oc();
        this.s = null;
        this.v = 0;
        this.w = 0;
        this.x = null;
        this.y = false;
        this.z = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        H().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.C = true;
    }

    public final boolean p() {
        return this.s != null && this.k;
    }

    public final boolean q() {
        if (!this.y) {
            Oc oc = this.r;
            if (oc == null) {
                return false;
            }
            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.u;
            oc.getClass();
            if (!(abstractComponentCallbacksC0784zc == null ? false : abstractComponentCallbacksC0784zc.q())) {
                return false;
            }
        }
        return true;
    }

    public final boolean r() {
        return this.q > 0;
    }

    public void s() {
        this.C = true;
    }

    public void t(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.v));
        }
        if (this.x != null) {
            sb.append(" tag=");
            sb.append(this.x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Context context) {
        this.C = true;
        Bc bc = this.s;
        if ((bc == null ? null : bc.j) != null) {
            this.C = true;
        }
    }

    public void v(Bundle bundle) {
        Parcelable parcelable;
        this.C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.t.R(parcelable);
            Oc oc = this.t;
            oc.E = false;
            oc.F = false;
            oc.L.g = false;
            oc.t(1);
        }
        Oc oc2 = this.t;
        if (oc2.s >= 1) {
            return;
        }
        oc2.E = false;
        oc2.F = false;
        oc2.L.g = false;
        oc2.t(1);
    }

    public View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void x() {
        this.C = true;
    }

    public void y() {
        this.C = true;
    }

    public LayoutInflater z(Bundle bundle) {
        Bc bc = this.s;
        if (bc == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0495q1 abstractActivityC0495q1 = bc.n;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0495q1.getLayoutInflater().cloneInContext(abstractActivityC0495q1);
        layoutInflaterCloneInContext.setFactory2(this.t.f);
        return layoutInflaterCloneInContext;
    }
}
