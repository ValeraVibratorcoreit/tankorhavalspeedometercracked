package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Fh implements Iterator {
    public final int a;
    public int b;
    public int c;
    public boolean d = false;
    public final /* synthetic */ C0035b3 e;

    public Fh(C0035b3 c0035b3, int i) {
        this.e = c0035b3;
        this.a = i;
        this.b = c0035b3.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = this.e.b(this.c, this.a);
        this.c++;
        this.d = true;
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        int i = this.c - 1;
        this.c = i;
        this.b--;
        this.d = false;
        this.e.h(i);
    }
}
