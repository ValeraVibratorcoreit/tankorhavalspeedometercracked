package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Kl implements InterfaceC0788zg {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ Kl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0788zg
    public final void n(Dg dg, EnumC0602tg enumC0602tg) {
        View view;
        switch (this.a) {
            case 0:
                if (enumC0602tg != EnumC0602tg.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                dg.getLifecycle().b(this);
                InterfaceC0733xn interfaceC0733xn = (InterfaceC0733xn) this.b;
                Bundle bundleC = interfaceC0733xn.b().c("androidx.savedstate.Restarter");
                if (bundleC == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleC.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, Kl.class.getClassLoader()).asSubclass(InterfaceC0671vn.class);
                        Tf.i("{\n                Class.…class.java)\n            }", clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                Tf.i("{\n                constr…wInstance()\n            }", objNewInstance);
                                if (!(interfaceC0733xn instanceof Ss)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                                Rs rsD = ((Ss) interfaceC0733xn).d();
                                C0711x1 c0711x1B = interfaceC0733xn.b();
                                rsD.getClass();
                                LinkedHashMap linkedHashMap = rsD.a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    Tf.j("key", str2);
                                    Os os = (Os) linkedHashMap.get(str2);
                                    Tf.f(os);
                                    Br.f(os, c0711x1B, interfaceC0733xn.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c0711x1B.g();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException("Failed to instantiate " + str, e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(Vo.g("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                P6 p6 = (P6) this.b;
                if (p6.e == null) {
                    K6 k6 = (K6) p6.getLastNonConfigurationInstance();
                    if (k6 != null) {
                        p6.e = k6.a;
                    }
                    if (p6.e == null) {
                        p6.e = new Rs();
                    }
                }
                p6.a.b(this);
                return;
            case 2:
                new HashMap();
                Ed[] edArr = (Ed[]) this.b;
                if (edArr.length > 0) {
                    Ed ed = edArr[0];
                    throw null;
                }
                if (edArr.length <= 0) {
                    return;
                }
                Ed ed2 = edArr[0];
                throw null;
            case 3:
                if (enumC0602tg != EnumC0602tg.ON_STOP || (view = ((AbstractComponentCallbacksC0784zc) this.b).E) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (enumC0602tg != EnumC0602tg.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0602tg).toString());
                }
                dg.getLifecycle().b(this);
                ((C0609tn) this.b).b();
                return;
        }
    }

    public Kl(InterfaceC0733xn interfaceC0733xn) {
        this.a = 0;
        Tf.j("owner", interfaceC0733xn);
        this.b = interfaceC0733xn;
    }
}
