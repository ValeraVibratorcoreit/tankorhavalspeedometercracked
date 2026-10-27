package defpackage;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0035b3 {
    public Gh a;
    public Gh b;
    public Ih c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0035b3(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    public static boolean j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final void a() {
        switch (this.d) {
            case 0:
                ((C0066c3) this.e).clear();
                break;
            default:
                ((C0127e3) this.e).clear();
                break;
        }
    }

    public final Object b(int i, int i2) {
        switch (this.d) {
            case 0:
                return ((C0066c3) this.e).b[(i << 1) + i2];
            default:
                return ((C0127e3) this.e).b[i];
        }
    }

    public final Map c() {
        switch (this.d) {
            case 0:
                return (C0066c3) this.e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.d) {
            case 0:
                return ((C0066c3) this.e).c;
            default:
                return ((C0127e3) this.e).c;
        }
    }

    public final int e(Object obj) {
        switch (this.d) {
            case 0:
                return ((C0066c3) this.e).e(obj);
            default:
                return ((C0127e3) this.e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.d) {
            case 0:
                return ((C0066c3) this.e).g(obj);
            default:
                return ((C0127e3) this.e).indexOf(obj);
        }
    }

    public final void g(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((C0066c3) this.e).put(obj, obj2);
                break;
            default:
                ((C0127e3) this.e).add(obj);
                break;
        }
    }

    public final void h(int i) {
        switch (this.d) {
            case 0:
                ((C0066c3) this.e).j(i);
                break;
            default:
                ((C0127e3) this.e).e(i);
                break;
        }
    }

    public final Object i(int i, Object obj) {
        switch (this.d) {
            case 0:
                return ((C0066c3) this.e).k(i, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final Object[] k(int i, Object[] objArr) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i2 = 0; i2 < iD; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }
}
