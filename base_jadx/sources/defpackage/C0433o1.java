package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0433o1 implements InterfaceC0702wn {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public C0433o1(C0711x1 c0711x1) {
        Tf.j("registry", c0711x1);
        this.b = new LinkedHashSet();
        c0711x1.f("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.InterfaceC0702wn
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0495q1) this.b).t().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.b));
                return bundle2;
        }
    }

    public C0433o1(AbstractActivityC0495q1 abstractActivityC0495q1) {
        this.b = abstractActivityC0495q1;
    }
}
