package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0634uh {
    public final C0096d2 a = new C0096d2(20);
    public final C0603th b = new C0603th(0);
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public C0634uh(int i) {
        this.e = i;
    }

    public final void a(Class cls, int i) {
        NavigableMap navigableMapF = f(cls);
        Integer num = (Integer) navigableMapF.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapF.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapF.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void b(int i) {
        while (this.f > i) {
            Object objV = this.a.V();
            Ud.k(objV);
            R4 r4D = d(objV.getClass());
            this.f -= r4D.b() * r4D.a(objV);
            a(objV.getClass(), r4D.a(objV));
            if (Log.isLoggable(r4D.c(), 2)) {
                Log.v(r4D.c(), "evicted: " + r4D.a(objV));
            }
        }
    }

    public final synchronized Object c(Class cls, int i) {
        C0572sh c0572sh;
        int i2;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) {
                C0603th c0603th = this.b;
                Mk mkB = (Mk) ((ArrayDeque) c0603th.a).poll();
                if (mkB == null) {
                    mkB = c0603th.b();
                }
                c0572sh = (C0572sh) mkB;
                c0572sh.b = i;
                c0572sh.c = cls;
            } else {
                C0603th c0603th2 = this.b;
                int iIntValue = num.intValue();
                Mk mkB2 = (Mk) ((ArrayDeque) c0603th2.a).poll();
                if (mkB2 == null) {
                    mkB2 = c0603th2.b();
                }
                c0572sh = (C0572sh) mkB2;
                c0572sh.b = iIntValue;
                c0572sh.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(c0572sh, cls);
    }

    public final R4 d(Class cls) {
        HashMap map = this.d;
        R4 r4 = (R4) map.get(cls);
        if (r4 == null) {
            if (cls.equals(int[].class)) {
                r4 = new R4(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                r4 = new R4(0);
            }
            map.put(cls, r4);
        }
        return r4;
    }

    public final Object e(C0572sh c0572sh, Class cls) {
        R4 r4D = d(cls);
        Object objE = this.a.E(c0572sh);
        if (objE != null) {
            this.f -= r4D.b() * r4D.a(objE);
            a(cls, r4D.a(objE));
        }
        if (objE != null) {
            return objE;
        }
        if (Log.isLoggable(r4D.c(), 2)) {
            Log.v(r4D.c(), "Allocated " + c0572sh.b + " bytes");
        }
        return r4D.d(c0572sh.b);
    }

    public final NavigableMap f(Class cls) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        R4 r4D = d(cls);
        int iA = r4D.a(obj);
        int iB = r4D.b() * iA;
        if (iB <= this.e / 2) {
            C0603th c0603th = this.b;
            Mk mkB = (Mk) ((ArrayDeque) c0603th.a).poll();
            if (mkB == null) {
                mkB = c0603th.b();
            }
            C0572sh c0572sh = (C0572sh) mkB;
            c0572sh.b = iA;
            c0572sh.c = cls;
            this.a.T(c0572sh, obj);
            NavigableMap navigableMapF = f(cls);
            Integer num = (Integer) navigableMapF.get(Integer.valueOf(c0572sh.b));
            Integer numValueOf = Integer.valueOf(c0572sh.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapF.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            b(this.e);
        }
    }
}
