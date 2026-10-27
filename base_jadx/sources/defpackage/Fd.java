package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Fd implements Iterator, InterfaceC0110dg {
    public Object a;
    public int b = -2;
    public final /* synthetic */ Gd c;

    public Fd(Gd gd) {
        this.c = gd;
    }

    public final void a() {
        Object objC;
        int i = this.b;
        Gd gd = this.c;
        if (i == -2) {
            objC = gd.a.a();
        } else {
            InterfaceC0445od interfaceC0445od = gd.b;
            Object obj = this.a;
            Tf.f(obj);
            objC = interfaceC0445od.c(obj);
        }
        this.a = objC;
        this.b = objC == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b < 0) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b < 0) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.a;
        Tf.g("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
        this.b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
