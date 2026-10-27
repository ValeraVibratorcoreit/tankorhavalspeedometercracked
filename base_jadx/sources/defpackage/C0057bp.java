package defpackage;

/* JADX INFO: renamed from: bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0057bp implements Cloneable {
    public static final Object d = new Object();
    public int[] a;
    public Object[] b;
    public int c;

    public C0057bp() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.a = new int[i4];
        this.b = new Object[i4];
    }

    public final void a(int i, Object obj) {
        int i2 = this.c;
        if (i2 != 0 && i <= this.a[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (i2 >= this.a.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            int[] iArr = new int[i6];
            Object[] objArr = new Object[i6];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.a = iArr;
            this.b = objArr;
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c = i2 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0057bp clone() {
        try {
            C0057bp c0057bp = (C0057bp) super.clone();
            c0057bp.a = (int[]) this.a.clone();
            c0057bp.b = (Object[]) this.b.clone();
            return c0057bp;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object c(int i, Integer num) {
        Object obj;
        int iF = F4.f(this.c, i, this.a);
        return (iF < 0 || (obj = this.b[iF]) == d) ? num : obj;
    }

    public final void d(int i, Object obj) {
        int iF = F4.f(this.c, i, this.a);
        if (iF >= 0) {
            this.b[iF] = obj;
            return;
        }
        int i2 = ~iF;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == d) {
                this.a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.a = iArr;
            this.b = objArr2;
        }
        int i8 = this.c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.c - i2);
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i2]);
            sb.append('=');
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
