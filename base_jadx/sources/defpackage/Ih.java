package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Ih implements Collection {
    public final /* synthetic */ C0035b3 a;

    public Ih(C0035b3 c0035b3) {
        this.a = c0035b3;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Fh(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0035b3 c0035b3 = this.a;
        int iF = c0035b3.f(obj);
        if (iF < 0) {
            return false;
        }
        c0035b3.h(iF);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0035b3 c0035b3 = this.a;
        int iD = c0035b3.d();
        int i = 0;
        boolean z = false;
        while (i < iD) {
            if (collection.contains(c0035b3.b(i, 1))) {
                c0035b3.h(i);
                i--;
                iD--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0035b3 c0035b3 = this.a;
        int iD = c0035b3.d();
        int i = 0;
        boolean z = false;
        while (i < iD) {
            if (!collection.contains(c0035b3.b(i, 1))) {
                c0035b3.h(i);
                i--;
                iD--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.d();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.k(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0035b3 c0035b3 = this.a;
        int iD = c0035b3.d();
        Object[] objArr = new Object[iD];
        for (int i = 0; i < iD; i++) {
            objArr[i] = c0035b3.b(i, 1);
        }
        return objArr;
    }
}
