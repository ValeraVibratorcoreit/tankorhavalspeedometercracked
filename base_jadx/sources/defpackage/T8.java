package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class T8 implements Iterator, InterfaceC0110dg {
    public int a = -1;
    public int b;
    public int c;
    public Pf d;
    public int e;
    public final /* synthetic */ U8 f;

    public T8(U8 u8) {
        this.f = u8;
        int i = u8.b;
        int length = u8.a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.b = i;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void a() {
        C0761yk c0761ykD;
        int i = this.c;
        if (i < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        U8 u8 = this.f;
        int i2 = u8.c;
        CharSequence charSequence = u8.a;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
            if (i3 >= i2) {
                this.d = new Pf(this.b, Mp.G0(charSequence), 1);
                this.c = -1;
            } else if (i > charSequence.length()) {
                this.d = new Pf(this.b, Mp.G0(charSequence), 1);
                this.c = -1;
            } else {
                c0761ykD = u8.d.d(charSequence, Integer.valueOf(this.c));
                if (c0761ykD == null) {
                    this.d = new Pf(this.b, Mp.G0(charSequence), 1);
                    this.c = -1;
                } else {
                    int iIntValue = ((Number) c0761ykD.a).intValue();
                    int iIntValue2 = ((Number) c0761ykD.b).intValue();
                    this.d = Td.O(this.b, iIntValue);
                    int i4 = iIntValue + iIntValue2;
                    this.b = i4;
                    this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i > charSequence.length()) {
            this.d = new Pf(this.b, Mp.G0(charSequence), 1);
            this.c = -1;
        } else {
            c0761ykD = u8.d.d(charSequence, Integer.valueOf(this.c));
            if (c0761ykD == null) {
                this.d = new Pf(this.b, Mp.G0(charSequence), 1);
                this.c = -1;
            } else {
                int iIntValue3 = ((Number) c0761ykD.a).intValue();
                int iIntValue4 = ((Number) c0761ykD.b).intValue();
                this.d = Td.O(this.b, iIntValue3);
                int i5 = iIntValue3 + iIntValue4;
                this.b = i5;
                this.c = i5 + (iIntValue4 == 0 ? 1 : 0);
            }
        }
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            throw new NoSuchElementException();
        }
        Pf pf = this.d;
        Tf.g("null cannot be cast to non-null type kotlin.ranges.IntRange", pf);
        this.d = null;
        this.a = -1;
        return pf;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
