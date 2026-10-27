package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 extends AbstractList implements List, InterfaceC0110dg {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    public final void a(Object obj) {
        c(this.c + 1);
        this.b[e(this.a + this.c)] = obj;
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == i2) {
            a(obj);
            return;
        }
        if (i == 0) {
            c(i2 + 1);
            int length2 = this.a;
            if (length2 == 0) {
                Object[] objArr = this.b;
                Tf.j("<this>", objArr);
                length2 = objArr.length;
            }
            int i3 = length2 - 1;
            this.a = i3;
            this.b[i3] = obj;
            this.c++;
            return;
        }
        c(i2 + 1);
        int iE = e(this.a + i);
        int i4 = this.c;
        if (i < ((i4 + 1) >> 1)) {
            if (iE == 0) {
                Object[] objArr2 = this.b;
                Tf.j("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = iE - 1;
            }
            int length3 = this.a;
            if (length3 == 0) {
                Object[] objArr3 = this.b;
                Tf.j("<this>", objArr3);
                length3 = objArr3.length;
            }
            int i5 = length3 - 1;
            int i6 = this.a;
            if (length >= i6) {
                Object[] objArr4 = this.b;
                objArr4[i5] = objArr4[i6];
                AbstractC0158f3.Q(objArr4, objArr4, i6, i6 + 1, length + 1);
            } else {
                Object[] objArr5 = this.b;
                AbstractC0158f3.Q(objArr5, objArr5, i6 - 1, i6, objArr5.length);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0158f3.Q(objArr6, objArr6, 0, 1, length + 1);
            }
            this.b[length] = obj;
            this.a = i5;
        } else {
            int iE2 = e(this.a + i4);
            if (iE < iE2) {
                Object[] objArr7 = this.b;
                AbstractC0158f3.Q(objArr7, objArr7, iE + 1, iE, iE2);
            } else {
                Object[] objArr8 = this.b;
                AbstractC0158f3.Q(objArr8, objArr8, 1, 0, iE2);
                Object[] objArr9 = this.b;
                objArr9[0] = objArr9[objArr9.length - 1];
                AbstractC0158f3.Q(objArr9, objArr9, iE + 1, iE, objArr9.length - 1);
            }
            this.b[iE] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Tf.j("elements", collection);
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.c;
        if (i == i3) {
            return addAll(collection);
        }
        c(collection.size() + i3);
        int iE = e(this.a + this.c);
        int iE2 = e(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i4 = this.a;
            int length = i4 - size;
            if (iE2 < i4) {
                Object[] objArr = this.b;
                AbstractC0158f3.Q(objArr, objArr, length, i4, objArr.length);
                if (size >= iE2) {
                    Object[] objArr2 = this.b;
                    AbstractC0158f3.Q(objArr2, objArr2, objArr2.length - size, 0, iE2);
                } else {
                    Object[] objArr3 = this.b;
                    AbstractC0158f3.Q(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    AbstractC0158f3.Q(objArr4, objArr4, 0, size, iE2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.b;
                AbstractC0158f3.Q(objArr5, objArr5, length, i4, iE2);
            } else {
                Object[] objArr6 = this.b;
                length += objArr6.length;
                int i5 = iE2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    AbstractC0158f3.Q(objArr6, objArr6, length, i4, iE2);
                } else {
                    AbstractC0158f3.Q(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.b;
                    AbstractC0158f3.Q(objArr7, objArr7, 0, this.a + length2, iE2);
                }
            }
            this.a = length;
            int length3 = iE2 - size;
            if (length3 < 0) {
                length3 += this.b.length;
            }
            b(length3, collection);
        } else {
            int i6 = iE2 + size;
            if (iE2 < iE) {
                int i7 = size + iE;
                Object[] objArr8 = this.b;
                if (i7 <= objArr8.length) {
                    AbstractC0158f3.Q(objArr8, objArr8, i6, iE2, iE);
                } else if (i6 >= objArr8.length) {
                    AbstractC0158f3.Q(objArr8, objArr8, i6 - objArr8.length, iE2, iE);
                } else {
                    int length4 = iE - (i7 - objArr8.length);
                    AbstractC0158f3.Q(objArr8, objArr8, 0, length4, iE);
                    Object[] objArr9 = this.b;
                    AbstractC0158f3.Q(objArr9, objArr9, i6, iE2, length4);
                }
            } else {
                Object[] objArr10 = this.b;
                AbstractC0158f3.Q(objArr10, objArr10, size, 0, iE);
                Object[] objArr11 = this.b;
                if (i6 >= objArr11.length) {
                    AbstractC0158f3.Q(objArr11, objArr11, i6 - objArr11.length, iE2, objArr11.length);
                } else {
                    AbstractC0158f3.Q(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.b;
                    AbstractC0158f3.Q(objArr12, objArr12, i6, iE2, objArr12.length - size);
                }
            }
            b(iE2, collection);
        }
        return true;
    }

    public final void b(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0158f3.Q(objArr, objArr2, 0, this.a, objArr.length);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        AbstractC0158f3.Q(objArr3, objArr2, length2 - i3, 0, i3);
        this.a = 0;
        this.b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iE = e(this.a + this.c);
        int i = this.a;
        if (i < iE) {
            AbstractC0158f3.S(this.b, i, iE);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            AbstractC0158f3.S(objArr, this.a, objArr.length);
            AbstractC0158f3.S(this.b, 0, iE);
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        Object[] objArr = this.b;
        Tf.j("<this>", objArr);
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int e(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.b[e(this.a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iE = e(this.a + this.c);
        int length = this.a;
        if (length < iE) {
            while (length < iE) {
                if (Tf.b(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iE) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (Tf.b(obj, this.b[length])) {
                i = this.a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iE; i2++) {
            if (Tf.b(obj, this.b[i2])) {
                length = i2 + this.b.length;
                i = this.a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iE = e(this.a + this.c);
        int i2 = this.a;
        if (i2 < iE) {
            length = iE - 1;
            if (i2 <= length) {
                while (!Tf.b(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iE) {
            for (int i3 = iE - 1; -1 < i3; i3--) {
                if (Tf.b(obj, this.b[i3])) {
                    length = i3 + this.b.length;
                    i = this.a;
                    return length - i;
                }
            }
            Object[] objArr = this.b;
            Tf.j("<this>", objArr);
            length = objArr.length - 1;
            int i4 = this.a;
            if (i4 <= length) {
                while (!Tf.b(obj, this.b[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        if (i == AbstractC0345l6.s0(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int iE = e(AbstractC0345l6.s0(this) + this.a);
            Object[] objArr = this.b;
            Object obj = objArr[iE];
            objArr[iE] = null;
            this.c--;
            return obj;
        }
        if (i == 0) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            Object[] objArr2 = this.b;
            int i3 = this.a;
            Object obj2 = objArr2[i3];
            objArr2[i3] = null;
            this.a = d(i3);
            this.c--;
            return obj2;
        }
        int iE2 = e(this.a + i);
        Object[] objArr3 = this.b;
        Object obj3 = objArr3[iE2];
        if (i < (this.c >> 1)) {
            int i4 = this.a;
            if (iE2 >= i4) {
                AbstractC0158f3.Q(objArr3, objArr3, i4 + 1, i4, iE2);
            } else {
                AbstractC0158f3.Q(objArr3, objArr3, 1, 0, iE2);
                Object[] objArr4 = this.b;
                objArr4[0] = objArr4[objArr4.length - 1];
                int i5 = this.a;
                AbstractC0158f3.Q(objArr4, objArr4, i5 + 1, i5, objArr4.length - 1);
            }
            Object[] objArr5 = this.b;
            int i6 = this.a;
            objArr5[i6] = null;
            this.a = d(i6);
        } else {
            int iE3 = e(AbstractC0345l6.s0(this) + this.a);
            if (iE2 <= iE3) {
                Object[] objArr6 = this.b;
                AbstractC0158f3.Q(objArr6, objArr6, iE2, iE2 + 1, iE3 + 1);
            } else {
                Object[] objArr7 = this.b;
                AbstractC0158f3.Q(objArr7, objArr7, iE2, iE2 + 1, objArr7.length);
                Object[] objArr8 = this.b;
                objArr8[objArr8.length - 1] = objArr8[0];
                AbstractC0158f3.Q(objArr8, objArr8, 0, 1, iE3 + 1);
            }
            this.b[iE3] = null;
        }
        this.c--;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iE;
        Tf.j("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iE2 = e(this.a + this.c);
            int i = this.a;
            if (i < iE2) {
                iE = i;
                while (i < iE2) {
                    Object obj = this.b[i];
                    if (!collection.contains(obj)) {
                        this.b[iE] = obj;
                        iE++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC0158f3.S(this.b, iE, iE2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iE = e(i2);
                for (int i3 = 0; i3 < iE2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[iE] = obj3;
                        iE = d(iE);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iE - this.a;
                if (length2 < 0) {
                    length2 += this.b.length;
                }
                this.c = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iE;
        Tf.j("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iE2 = e(this.a + this.c);
            int i = this.a;
            if (i < iE2) {
                iE = i;
                while (i < iE2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[iE] = obj;
                        iE++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC0158f3.S(this.b, iE, iE2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iE = e(i2);
                for (int i3 = 0; i3 < iE2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iE] = obj3;
                        iE = d(iE);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iE - this.a;
                if (length2 < 0) {
                    length2 += this.b.length;
                }
                this.c = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int iE = e(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iE];
        objArr[iE] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Tf.j("array", objArr);
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            Tf.g("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iE = e(this.a + this.c);
        int i2 = this.a;
        if (i2 < iE) {
            AbstractC0158f3.Q(this.b, objArr, 0, i2, iE);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            AbstractC0158f3.Q(objArr2, objArr, 0, this.a, objArr2.length);
            Object[] objArr3 = this.b;
            AbstractC0158f3.Q(objArr3, objArr, objArr3.length - this.a, 0, iE);
        }
        int length2 = objArr.length;
        int i3 = this.c;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        Tf.j("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        c(collection.size() + this.c);
        b(e(this.a + this.c), collection);
        return true;
    }
}
