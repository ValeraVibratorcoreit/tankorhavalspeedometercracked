package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0727xh {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    public C0727xh(long j) {
        this.b = j;
    }

    public final synchronized Object a(Object obj) {
        C0696wh c0696wh;
        c0696wh = (C0696wh) this.a.get(obj);
        return c0696wh != null ? c0696wh.a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j = iB;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        C0696wh c0696wh = (C0696wh) this.a.put(obj, obj2 == null ? null : new C0696wh(obj2, iB));
        if (c0696wh != null) {
            this.c -= (long) c0696wh.b;
            if (!c0696wh.a.equals(obj2)) {
                c(obj, c0696wh.a);
            }
        }
        e(this.b);
        return c0696wh != null ? c0696wh.a : null;
    }

    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C0696wh c0696wh = (C0696wh) entry.getValue();
            this.c -= (long) c0696wh.b;
            Object key = entry.getKey();
            it.remove();
            c(key, c0696wh.a);
        }
    }
}
