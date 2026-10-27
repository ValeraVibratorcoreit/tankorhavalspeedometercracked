package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Jh extends Ud {
    public static int s0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map t0(ArrayList arrayList) {
        Ta ta = Ta.a;
        int size = arrayList.size();
        if (size == 0) {
            return ta;
        }
        if (size == 1) {
            C0761yk c0761yk = (C0761yk) arrayList.get(0);
            Tf.j("pair", c0761yk);
            Map mapSingletonMap = Collections.singletonMap(c0761yk.a, c0761yk.b);
            Tf.i("singletonMap(pair.first, pair.second)", mapSingletonMap);
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0761yk c0761yk2 = (C0761yk) it.next();
            linkedHashMap.put(c0761yk2.a, c0761yk2.b);
        }
        return linkedHashMap;
    }

    public static final Map u0(Map map) {
        Tf.j("<this>", map);
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Tf.i("with(entries.iterator().…ingletonMap(key, value) }", mapSingletonMap);
        return mapSingletonMap;
    }
}
