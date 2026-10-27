package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0609tn implements InterfaceC0702wn {
    public final C0711x1 a;
    public boolean b;
    public Bundle c;
    public final Vp d;

    public C0609tn(C0711x1 c0711x1, Ss ss) {
        Tf.j("savedStateRegistry", c0711x1);
        Tf.j("viewModelStoreOwner", ss);
        this.a = c0711x1;
        this.d = AbstractC0390mk.v(new C0415ne(ss, 2));
    }

    @Override // defpackage.InterfaceC0702wn
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0640un) this.d.a()).b.entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((AbstractC0517qn) entry.getValue()).getClass();
        throw null;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleC = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
        this.c = bundle;
        this.b = true;
    }
}
