package defpackage;

import java.util.RandomAccess;

/* JADX INFO: renamed from: m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0369m extends AbstractC0400n implements RandomAccess {
    public final AbstractC0400n a;
    public final int b;
    public final int c;

    public C0369m(AbstractC0400n abstractC0400n, int i, int i2) {
        Tf.j("list", abstractC0400n);
        this.a = abstractC0400n;
        this.b = i;
        int iA = abstractC0400n.a();
        if (i < 0 || i2 > iA) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + iA);
        }
        if (i <= i2) {
            this.c = i2 - i;
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    @Override // defpackage.AbstractC0400n
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a.get(this.b + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}
