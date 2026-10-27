package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0129e5 implements Serializable, Comparable {
    public static final C0129e5 d = new C0129e5(new byte[0]);
    public transient int a;
    public transient String b;
    public final byte[] c;

    public C0129e5(byte[] bArr) {
        Tf.j("data", bArr);
        this.c = bArr;
    }

    public String a() {
        byte[] bArr = AbstractC0000a.a;
        byte[] bArr2 = this.c;
        Tf.j("$this$encodeBase64", bArr2);
        Tf.j("map", bArr);
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i2 + 2] = b5;
            bArr3[i2 + 3] = b5;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b6 = bArr2[i];
            byte b7 = bArr2[i5];
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b7 & 15) << 2];
            bArr3[i2 + 3] = (byte) 61;
        }
        return new String(bArr3, L5.a);
    }

    public int b() {
        return this.c.length;
    }

    public String c() {
        byte[] bArr = this.c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = Tf.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            e5 r10 = (defpackage.C0129e5) r10
            java.lang.String r0 = "other"
            defpackage.Tf.j(r0, r10)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L30
            byte r7 = r9.e(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.e(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2a
            int r4 = r4 + 1
            goto L15
        L2a:
            if (r7 >= r8) goto L2e
        L2c:
            r3 = r6
            goto L36
        L2e:
            r3 = r5
            goto L36
        L30:
            if (r0 != r1) goto L33
            goto L36
        L33:
            if (r0 >= r1) goto L2e
            goto L2c
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0129e5.compareTo(java.lang.Object):int");
    }

    public byte[] d() {
        return this.c;
    }

    public byte e(int i) {
        return this.c[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0129e5) {
            C0129e5 c0129e5 = (C0129e5) obj;
            int iB = c0129e5.b();
            byte[] bArr = this.c;
            if (iB == bArr.length && c0129e5.f(0, 0, bArr, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i, int i2, byte[] bArr, int i3) {
        Tf.j("other", bArr);
        if (i >= 0) {
            byte[] bArr2 = this.c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Td.a(bArr2, i, i2, bArr, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(C0129e5 c0129e5, int i) {
        Tf.j("other", c0129e5);
        return c0129e5.f(0, 0, this.c, i);
    }

    public C0129e5 h() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Tf.i("java.util.Arrays.copyOf(this, size)", bArrCopyOf);
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new C0129e5(bArrCopyOf);
            }
            i++;
        }
    }

    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c);
        this.a = iHashCode;
        return iHashCode;
    }

    public final String i() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        byte[] bArrD = d();
        Tf.j("$this$toUtf8String", bArrD);
        String str2 = new String(bArrD, L5.a);
        this.b = str2;
        return str2;
    }

    public void j(L4 l4, int i) {
        Tf.j("buffer", l4);
        l4.E(this.c, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:181:0x01a8 BREAK  A[LOOP:0: B:6:0x000f->B:239:0x000f]] */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.c;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 > i6 || 57343 < i6) {
                                    if (i6 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && 31 >= i6) || (127 <= i6 && 159 >= i6))) || i6 == 65533) {
                                            i3 = -1;
                                            break;
                                        }
                                        i3 += i6 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else {
                                        if (i4 == 64) {
                                            break;
                                        }
                                        i3 = -1;
                                        break;
                                    }
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 > i8 || 57343 < i8) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && 31 >= i8) || (127 <= i8 && 159 >= i8))) || i8 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i8 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && 31 >= i10) || (127 <= i10 && 159 >= i10))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || 31 < b2) && (127 > b2 || 159 < b2))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || 31 < b) && (127 > b || 159 < b))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strI = i();
            String strSubstring = strI.substring(0, i3);
            Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
            String strQ0 = Mp.Q0(Mp.Q0(Mp.Q0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strI.length()) {
                return "[text=" + strQ0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strQ0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 <= bArr.length) {
            sb.append((64 == bArr.length ? this : new C0129e5(AbstractC0158f3.R(0, 64, bArr))).c());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}
