package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Nc implements Mc {
    public final int a;
    public final int b = 1;
    public final /* synthetic */ Oc c;

    public Nc(Oc oc, int i) {
        this.c = oc;
        this.a = i;
    }

    @Override // defpackage.Mc
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Oc oc = this.c;
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = oc.w;
        int i = this.a;
        if (abstractComponentCallbacksC0784zc == null || i >= 0 || !abstractComponentCallbacksC0784zc.g().N(-1, 0)) {
            return oc.O(arrayList, arrayList2, i, this.b);
        }
        return false;
    }
}
