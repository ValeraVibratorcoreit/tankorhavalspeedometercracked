package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H6 implements InterfaceC0114dk {
    public final /* synthetic */ int a;
    public final /* synthetic */ P6 b;

    public /* synthetic */ H6(AbstractActivityC0495q1 abstractActivityC0495q1, int i) {
        this.a = i;
        this.b = abstractActivityC0495q1;
    }

    @Override // defpackage.InterfaceC0114dk
    public final void a(Context context) {
        switch (this.a) {
            case 0:
                P6 p6 = this.b;
                Tf.j("this$0", p6);
                Tf.j("it", context);
                Bundle bundleC = ((C0711x1) p6.d.d).c("android:support:activity-result");
                if (bundleC != null) {
                    N6 n6 = p6.h;
                    n6.getClass();
                    ArrayList<Integer> integerArrayList = bundleC.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleC.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        n6.d.addAll(stringArrayList2);
                    }
                    Bundle bundle = bundleC.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = n6.g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = n6.b;
                        boolean zContainsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = n6.a;
                        if (zContainsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof InterfaceC0110dg) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    Tf.V(classCastException, Br.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        Tf.i("rcs[i]", num2);
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        Tf.i("keys[i]", str2);
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                Bc bc = (Bc) ((AbstractActivityC0495q1) this.b).s.b;
                bc.m.b(bc, bc, null);
                return;
        }
    }
}
