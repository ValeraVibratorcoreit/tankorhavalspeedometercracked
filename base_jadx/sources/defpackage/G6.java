package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G6 implements InterfaceC0702wn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ G6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0702wn
    public final Bundle a() {
        AbstractActivityC0495q1 abstractActivityC0495q1;
        switch (this.a) {
            case 0:
                P6 p6 = (P6) this.b;
                Tf.j("this$0", p6);
                Bundle bundle = new Bundle();
                N6 n6 = p6.h;
                n6.getClass();
                LinkedHashMap linkedHashMap = n6.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(n6.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(n6.g));
                return bundle;
            case 1:
                break;
            default:
                return ((Oc) this.b).S();
        }
        do {
            abstractActivityC0495q1 = (AbstractActivityC0495q1) this.b;
        } while (AbstractActivityC0495q1.x(abstractActivityC0495q1.v()));
        abstractActivityC0495q1.t.e(EnumC0602tg.ON_STOP);
        return new Bundle();
    }
}
