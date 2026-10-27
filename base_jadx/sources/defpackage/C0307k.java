package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0307k implements Iterator, InterfaceC0110dg {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ C0307k(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                return this.b < ((AbstractC0400n) this.c).a();
            case 1:
                return this.b < ((Object[]) this.c).length;
        }
        while (true) {
            int i = this.b;
            it = (Iterator) this.c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return ((AbstractC0400n) this.c).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
        while (true) {
            int i3 = this.b;
            it = (Iterator) this.c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0307k(C0104da c0104da) {
        this.a = 2;
        this.c = c0104da.a.iterator();
        this.b = c0104da.b;
    }
}
