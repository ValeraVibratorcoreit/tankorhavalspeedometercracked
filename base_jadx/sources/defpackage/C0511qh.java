package defpackage;

/* JADX INFO: renamed from: qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0511qh implements Cloneable {
    public static final Object e = new Object();
    public boolean a = false;
    public long[] b;
    public Object[] c;
    public int d;

    public C0511qh() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.b = new long[i4];
        this.c = new Object[i4];
    }

    public final void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0511qh clone() {
        try {
            C0511qh c0511qh = (C0511qh) super.clone();
            c0511qh.b = (long[]) this.b.clone();
            c0511qh.c = (Object[]) this.c.clone();
            return c0511qh;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i = this.d;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public final Object d(long j, Long l) {
        Object obj;
        int iG = F4.g(this.b, this.d, j);
        return (iG < 0 || (obj = this.c[iG]) == e) ? l : obj;
    }

    public final void e(long j, Object obj) {
        int iG = F4.g(this.b, this.d, j);
        if (iG >= 0) {
            this.c[iG] = obj;
            return;
        }
        int i = ~iG;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == e) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a && i2 >= this.b.length) {
            c();
            i = ~F4.g(this.b, this.d, j);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int i4 = (i3 + 1) * 8;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.b = jArr;
            this.c = objArr2;
        }
        int i8 = this.d - i;
        if (i8 != 0) {
            long[] jArr3 = this.b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.c;
            System.arraycopy(objArr4, i, objArr4, i9, this.d - i);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final int f() {
        if (this.a) {
            c();
        }
        return this.d;
    }

    public final Object g(int i) {
        if (this.a) {
            c();
        }
        return this.c[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.a) {
                c();
            }
            sb.append(this.b[i]);
            sb.append('=');
            Object objG = g(i);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
