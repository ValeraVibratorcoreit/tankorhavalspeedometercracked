package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0582sr {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public C0582sr(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0582sr)) {
            return false;
        }
        C0582sr c0582sr = (C0582sr) obj;
        return this.b == c0582sr.b && this.a.equals(c0582sr.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String strF = Vo.f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n", "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strF = strF + "    " + str + ": " + map.get(str) + "\n";
        }
        return strF;
    }
}
