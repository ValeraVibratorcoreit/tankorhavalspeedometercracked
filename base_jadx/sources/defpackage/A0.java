package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends Td {
    public final /* synthetic */ int h;

    public /* synthetic */ A0(int i) {
        this.h = i;
    }

    @Override // defpackage.Td
    public final Intent m(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.h) {
            case 0:
                String[] strArr = (String[]) obj;
                Tf.j("context", context);
                Tf.j("input", strArr);
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                Tf.i("Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)", intentPutExtra);
                return intentPutExtra;
            case 1:
                Intent intent = (Intent) obj;
                Tf.j("context", context);
                Tf.j("input", intent);
                return intent;
            default:
                Qf qf = (Qf) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = qf.b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = qf.a;
                        Tf.j("intentSender", intentSender);
                        qf = new Qf(intentSender, null, qf.c, qf.d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", qf);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // defpackage.Td
    public L r(Context context, Object obj) {
        switch (this.h) {
            case 0:
                String[] strArr = (String[]) obj;
                Tf.j("context", context);
                Tf.j("input", strArr);
                if (strArr.length == 0) {
                    return new L(Ta.a);
                }
                for (String str : strArr) {
                    if (F4.j(context, str) != 0) {
                        return null;
                    }
                }
                int iS0 = Jh.s0(strArr.length);
                if (iS0 < 16) {
                    iS0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new L(linkedHashMap);
            default:
                return super.r(context, obj);
        }
    }

    @Override // defpackage.Td
    public final Object y(Intent intent, int i) {
        switch (this.h) {
            case 0:
                Ta ta = Ta.a;
                if (i != -1 || intent == null) {
                    return ta;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return ta;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayListT = AbstractC0158f3.T(stringArrayExtra);
                Iterator it = arrayListT.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0376m6.u0(arrayListT), AbstractC0376m6.u0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C0761yk(it.next(), it2.next()));
                }
                return Jh.t0(arrayList2);
            case 1:
                return new C0772z0(intent, i);
            default:
                return new C0772z0(intent, i);
        }
    }
}
