package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Z5 {
    public final HashMap a = new HashMap();
    public final Map b;

    public Z5(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0602tg enumC0602tg = (EnumC0602tg) entry.getValue();
            List arrayList = (List) this.a.get(enumC0602tg);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(enumC0602tg, arrayList);
            }
            arrayList.add((C0007a6) entry.getKey());
        }
    }

    public static void a(List list, Dg dg, EnumC0602tg enumC0602tg, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0007a6 c0007a6 = (C0007a6) list.get(size);
                c0007a6.getClass();
                try {
                    int i = c0007a6.a;
                    Method method = c0007a6.b;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, dg);
                    } else if (i == 2) {
                        method.invoke(obj, dg, enumC0602tg);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
