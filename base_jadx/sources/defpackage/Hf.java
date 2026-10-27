package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class Hf {
    public static final Hf e = new Hf(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public Hf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static Hf a(Hf hf, Hf hf2) {
        return b(Math.max(hf.a, hf2.a), Math.max(hf.b, hf2.b), Math.max(hf.c, hf2.c), Math.max(hf.d, hf2.d));
    }

    public static Hf b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new Hf(i, i2, i3, i4);
    }

    public static Hf c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Gf.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Hf.class != obj.getClass()) {
            return false;
        }
        Hf hf = (Hf) obj;
        return this.d == hf.d && this.a == hf.a && this.c == hf.c && this.b == hf.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
