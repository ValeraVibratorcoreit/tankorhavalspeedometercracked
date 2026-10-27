package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class M4 {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(L5.a);
        Tf.i("(this as java.lang.String).getBytes(charset)", bytes);
        a = bytes;
    }

    public static final String a(L4 l4, long j) throws EOFException {
        Tf.j("$this$readUtf8Line", l4);
        if (j > 0) {
            long j2 = j - 1;
            if (l4.w(j2) == ((byte) 13)) {
                String strA = l4.A(j2, L5.a);
                l4.a(2L);
                return strA;
            }
        }
        String strA2 = l4.A(j, L5.a);
        l4.a(1L);
        return strA2;
    }

    public static final int b(L4 l4, C0514qk c0514qk, boolean z) {
        int i;
        int i2;
        Cn cn;
        byte[] bArr;
        int i3;
        Tf.j("$this$selectPrefix", l4);
        Tf.j("options", c0514qk);
        Cn cn2 = l4.a;
        int i4 = -2;
        if (cn2 == null) {
            return z ? -2 : -1;
        }
        int i5 = cn2.b;
        int i6 = cn2.c;
        byte[] bArr2 = cn2.a;
        Cn cn3 = cn2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = c0514qk.b;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (cn3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr2[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            cn3 = cn3.f;
                            Tf.f(cn3);
                            i2 = cn3.b;
                            i6 = cn3.c;
                            bArr2 = cn3.a;
                            if (cn3 == cn2) {
                                cn3 = null;
                            }
                        } else {
                            i2 = i13;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr2[i5] & 255) != iArr[i11]) {
                    return i7;
                }
                boolean z2 = i18 == i16;
                if (i17 == i6) {
                    Tf.f(cn3);
                    Cn cn4 = cn3.f;
                    Tf.f(cn4);
                    i3 = cn4.b;
                    int i19 = cn4.c;
                    bArr = cn4.a;
                    if (cn4 != cn2) {
                        cn = cn4;
                        i6 = i19;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        i6 = i19;
                        cn = null;
                    }
                } else {
                    cn = cn3;
                    bArr = bArr2;
                    i3 = i17;
                }
                if (z2) {
                    i = iArr[i18];
                    i2 = i3;
                    bArr2 = bArr;
                    cn3 = cn;
                    break;
                }
                i5 = i3;
                bArr2 = bArr;
                cn3 = cn;
                i11 = i18;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z ? i4 : i7;
    }
}
