package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class N6 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ P6 h;

    public N6(AbstractActivityC0495q1 abstractActivityC0495q1) {
        this.h = abstractActivityC0495q1;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        B0 b0 = (B0) this.e.get(str);
        if ((b0 != null ? b0.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                b0.a.a(b0.b.y(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new C0772z0(intent, i2));
        return true;
    }

    public final void b(int i, Td td, Object obj) {
        Bundle bundle;
        Tf.j("contract", td);
        P6 p6 = this.h;
        L lR = td.r(p6, obj);
        if (lR != null) {
            new Handler(Looper.getMainLooper()).post(new M6(i, this, lR, 0));
            return;
        }
        Intent intentM = td.m(p6, obj);
        if (intentM.getExtras() != null) {
            Bundle extras = intentM.getExtras();
            Tf.f(extras);
            if (extras.getClassLoader() == null) {
                intentM.setExtrasClassLoader(p6.getClassLoader());
            }
        }
        if (intentM.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentM.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentM.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentM.getAction())) {
            String[] stringArrayExtra = intentM.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            F4.W(p6, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentM.getAction())) {
            p6.startActivityForResult(intentM, i, bundle);
            return;
        }
        Qf qf = (Qf) intentM.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            Tf.f(qf);
            p6.startIntentSenderForResult(qf.a, i, qf.b, qf.c, qf.d, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new M6(i, this, e, 1));
        }
    }

    public final K2 c(String str, Td td, Gc gc) {
        Object parcelable;
        Number number;
        int iIntValue;
        LinkedHashMap linkedHashMap;
        Tf.j("key", str);
        LinkedHashMap linkedHashMap2 = this.b;
        if (((Integer) linkedHashMap2.get(str)) == null) {
            Iterator it = new C0193g7(new Gd(new C0276j())).iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                number = (Number) it.next();
                iIntValue = number.intValue();
                linkedHashMap = this.a;
            } while (!(!linkedHashMap.containsKey(Integer.valueOf(iIntValue))));
            int iIntValue2 = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue2), str);
            linkedHashMap2.put(str, Integer.valueOf(iIntValue2));
        }
        this.e.put(str, new B0(gc, td));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            gc.a(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.g;
        if (i >= 34) {
            parcelable = Q4.a(bundle, str, C0772z0.class);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0772z0.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0772z0 c0772z0 = (C0772z0) parcelable;
        if (c0772z0 != null) {
            bundle.remove(str);
            gc.a(td.y(c0772z0.b, c0772z0.a));
        }
        return new K2(this, str, td, 2);
    }
}
