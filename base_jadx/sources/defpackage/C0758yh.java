package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0758yh {
    public final LinkedHashMap a;
    public int b;
    public final int c;
    public int d;
    public int e;

    public C0758yh(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.a.get(obj);
                if (obj2 != null) {
                    this.d++;
                    return obj2;
                }
                this.e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.b++;
                objPut = this.a.put(obj, obj2);
                if (objPut != null) {
                    this.b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                        break;
                    }
                    if (this.b > i && !this.a.isEmpty()) {
                        Map.Entry entry = (Map.Entry) this.a.entrySet().iterator().next();
                        Object key = entry.getKey();
                        entry.getValue();
                        this.a.remove(key);
                        this.b--;
                    }
                    return objPut;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        try {
            int i2 = this.d;
            int i3 = this.e + i2;
            i = i3 != 0 ? (i2 * 100) / i3 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.c + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + i + "%]";
    }
}
