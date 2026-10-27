package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Gh implements Set {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0035b3 b;

    public /* synthetic */ Gh(C0035b3 c0035b3, int i) {
        this.a = i;
        this.b = c0035b3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                C0035b3 c0035b3 = this.b;
                int iD = c0035b3.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    c0035b3.g(entry.getKey(), entry.getValue());
                }
                return iD != c0035b3.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0035b3 c0035b3 = this.b;
                int iE = c0035b3.e(key);
                if (iE < 0) {
                    return false;
                }
                Object objB = c0035b3.b(iE, 1);
                Object value = entry.getValue();
                return objB == value || (objB != null && objB.equals(value));
            default:
                return this.b.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Map mapC = this.b.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapC.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                break;
        }
        return C0035b3.j(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.a) {
            case 0:
                C0035b3 c0035b3 = this.b;
                int iHashCode = 0;
                for (int iD = c0035b3.d() - 1; iD >= 0; iD--) {
                    Object objB = c0035b3.b(iD, 0);
                    Object objB2 = c0035b3.b(iD, 1);
                    iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
                }
                return iHashCode;
            default:
                C0035b3 c0035b4 = this.b;
                int iHashCode2 = 0;
                for (int iD2 = c0035b4.d() - 1; iD2 >= 0; iD2--) {
                    Object objB3 = c0035b4.b(iD2, 0);
                    iHashCode2 += objB3 == null ? 0 : objB3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return this.b.d() == 0;
            default:
                return this.b.d() == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new Hh(this.b);
            default:
                return new Fh(this.b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0035b3 c0035b3 = this.b;
                int iE = c0035b3.e(obj);
                if (iE < 0) {
                    return false;
                }
                c0035b3.h(iE);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapC = this.b.c();
                int size = mapC.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapC.remove(it.next());
                }
                return size != mapC.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapC = this.b.c();
                int size = mapC.size();
                Iterator it = mapC.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapC.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.b.k(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0035b3 c0035b3 = this.b;
                int iD = c0035b3.d();
                Object[] objArr = new Object[iD];
                for (int i = 0; i < iD; i++) {
                    objArr[i] = c0035b3.b(i, 0);
                }
                return objArr;
        }
    }
}
