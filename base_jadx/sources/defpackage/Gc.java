package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Gc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Oc b;

    public /* synthetic */ Gc(Oc oc, int i) {
        this.a = i;
        this.b = oc;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                Oc oc = this.b;
                Lc lc = (Lc) oc.C.pollFirst();
                if (lc == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    C0296jj c0296jj = oc.c;
                    String str = lc.a;
                    if (c0296jj.i(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                C0772z0 c0772z0 = (C0772z0) obj;
                Oc oc2 = this.b;
                Lc lc2 = (Lc) oc2.C.pollFirst();
                if (lc2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    C0296jj c0296jj2 = oc2.c;
                    String str2 = lc2.a;
                    AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcI = c0296jj2.i(str2);
                    if (abstractComponentCallbacksC0784zcI == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        abstractComponentCallbacksC0784zcI.t(lc2.b, c0772z0.a, c0772z0.b);
                    }
                }
                break;
            default:
                C0772z0 c0772z1 = (C0772z0) obj;
                Oc oc3 = this.b;
                Lc lc3 = (Lc) oc3.C.pollFirst();
                if (lc3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    C0296jj c0296jj3 = oc3.c;
                    String str3 = lc3.a;
                    AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcI2 = c0296jj3.i(str3);
                    if (abstractComponentCallbacksC0784zcI2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        abstractComponentCallbacksC0784zcI2.t(lc3.b, c0772z1.a, c0772z1.b);
                    }
                }
                break;
        }
    }
}
