package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0338l extends C0307k implements ListIterator {
    public final /* synthetic */ AbstractC0400n d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338l(AbstractC0400n abstractC0400n, int i) {
        super(abstractC0400n, 0);
        this.d = abstractC0400n;
        int iA = abstractC0400n.a();
        if (i >= 0 && i <= iA) {
            this.b = i;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + iA);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
