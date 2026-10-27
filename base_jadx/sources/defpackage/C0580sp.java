package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0580sp {
    public int[] a;
    public final C0096d2 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public Qd l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[256];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public C0580sp(C0096d2 c0096d2, Qd qd, ByteBuffer byteBuffer, int i) {
        this.c = c0096d2;
        this.l = new Qd();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = qd;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = qd.e.iterator();
                while (it.hasNext()) {
                    if (((Ld) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i2 = qd.f;
                this.r = i2 / iHighestOneBit;
                int i3 = qd.g;
                this.q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C0634uh c0634uh = (C0634uh) this.c.c;
                this.i = c0634uh == null ? new byte[i4] : (byte[]) c0634uh.c(byte[].class, i4);
                C0096d2 c0096d3 = this.c;
                int i5 = this.r * this.q;
                C0634uh c0634uh2 = (C0634uh) c0096d3.c;
                this.j = c0634uh2 == null ? new int[i5] : (int[]) c0634uh2.c(int[].class, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap bitmapH = ((InterfaceC0621u4) this.c.b).h(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapH.setHasAlpha(true);
        return bitmapH;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("sp", 3)) {
                    Log.d("sp", "Unable to decode frame, frameCount=" + this.l.c + ", framePointer=" + this.k);
                }
                this.o = 1;
            }
            int i = this.o;
            if (i != 1 && i != 2) {
                this.o = 0;
                if (this.e == null) {
                    C0634uh c0634uh = (C0634uh) this.c.c;
                    this.e = c0634uh == null ? new byte[255] : (byte[]) c0634uh.c(byte[].class, 255);
                }
                Ld ld = (Ld) this.l.e.get(this.k);
                int i2 = this.k - 1;
                Ld ld2 = i2 >= 0 ? (Ld) this.l.e.get(i2) : null;
                int[] iArr = ld.k;
                if (iArr == null) {
                    iArr = this.l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("sp", 3)) {
                        Log.d("sp", "No valid color table found for frame #" + this.k);
                    }
                    this.o = 1;
                    return null;
                }
                if (ld.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[ld.h] = 0;
                    if (ld.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return d(ld, ld2);
            }
            if (Log.isLoggable("sp", 3)) {
                Log.d("sp", "Unable to decode frame, status=" + this.o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v32, types: [short] */
    /* JADX WARN: Type inference failed for: r5v34 */
    public final Bitmap d(Ld ld, Ld ld2) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short s;
        int i9;
        Bitmap bitmap;
        int i10;
        int[] iArr = this.j;
        C0096d2 c0096d2 = this.c;
        byte b2 = 0;
        if (ld2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                ((InterfaceC0621u4) c0096d2.b).k(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (ld2 != null && ld2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (ld2 != null && (i9 = ld2.g) > 0) {
            if (i9 == 2) {
                if (ld.f) {
                    i10 = 0;
                } else {
                    Qd qd = this.l;
                    i10 = qd.k;
                    if (ld.k != null && qd.j == ld.h) {
                        i10 = 0;
                    }
                }
                int i11 = ld2.d;
                int i12 = this.p;
                int i13 = i11 / i12;
                int i14 = ld2.b / i12;
                int i15 = ld2.c / i12;
                int i16 = ld2.a / i12;
                int i17 = this.r;
                int i18 = (i14 * i17) + i16;
                int i19 = (i13 * i17) + i18;
                while (i18 < i19) {
                    int i20 = i18 + i15;
                    for (int i21 = i18; i21 < i20; i21++) {
                        iArr[i21] = i10;
                    }
                    i18 += this.r;
                }
            } else if (i9 == 3 && (bitmap = this.m) != null) {
                int i22 = this.r;
                bitmap.getPixels(iArr, 0, i22, 0, 0, i22, this.q);
            }
        }
        this.d.position(ld.j);
        int i23 = ld.c * ld.d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i23) {
            C0634uh c0634uh = (C0634uh) c0096d2.c;
            this.i = c0634uh == null ? new byte[i23] : (byte[]) c0634uh.c(byte[].class, i23);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int i24 = this.d.get() & 255;
        int i25 = 1 << i24;
        int i26 = i25 + 1;
        int i27 = i25 + 2;
        int i28 = i24 + 1;
        int i29 = (1 << i28) - 1;
        for (int i30 = 0; i30 < i25; i30++) {
            sArr[i30] = 0;
            bArr3[i30] = (byte) i30;
        }
        byte[] bArr5 = this.e;
        int i31 = i28;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = i27;
        int i41 = i29;
        int i42 = -1;
        while (true) {
            if (i32 >= i23) {
                b = b2;
                break;
            }
            if (i33 == 0) {
                int i43 = this.d.get() & 255;
                if (i43 > 0) {
                    ByteBuffer byteBuffer = this.d;
                    byteBuffer.get(this.e, 0, Math.min(i43, byteBuffer.remaining()));
                }
                if (i43 <= 0) {
                    this.o = 3;
                    b = 0;
                    break;
                }
                i33 = i43;
                i34 = 0;
            } else {
                i28 = i28;
                i32 = i32;
            }
            i36 += (bArr5[i34] & 255) << i35;
            i34++;
            i33--;
            i42 = i42;
            int i44 = i35 + 8;
            i40 = i40;
            i31 = i31;
            i32 = i32;
            bArr5 = bArr5;
            i38 = i38;
            while (true) {
                if (i44 < i31) {
                    i35 = i44;
                    b2 = 0;
                    break;
                }
                iArr = iArr;
                int i45 = i36 & i41;
                i36 >>= i31;
                i44 -= i31;
                if (i45 == i25) {
                    i40 = i27;
                    i41 = i29;
                    i31 = i28;
                    i42 = -1;
                } else {
                    if (i45 == i26) {
                        iArr = iArr;
                        i35 = i44;
                        b2 = 0;
                        break;
                    }
                    if (i42 == -1) {
                        bArr2[i37] = bArr3[i45];
                        i37++;
                        i32++;
                        i38 = i45;
                        i42 = i38;
                        i44 = i44;
                    } else {
                        if (i45 >= i40) {
                            bArr4[i39] = (byte) i38;
                            i39++;
                            s = i42;
                        } else {
                            s = i45;
                        }
                        while (s >= i25) {
                            bArr4[i39] = bArr3[s];
                            i39++;
                            s = sArr[s];
                        }
                        int i46 = bArr3[s] & 255;
                        byte b3 = (byte) i46;
                        bArr2[i37] = b3;
                        while (true) {
                            i37++;
                            i32++;
                            if (i39 <= 0) {
                                break;
                            }
                            i39--;
                            bArr2[i37] = bArr4[i39];
                        }
                        if (i40 < 4096) {
                            sArr[i40] = (short) i42;
                            bArr3[i40] = b3;
                            i40++;
                            if ((i40 & i41) == 0 && i40 < 4096) {
                                i31++;
                                i41 += i40;
                            }
                        }
                        i42 = i45;
                        i44 = i44;
                        i38 = i46;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i37, i23, b);
        if (ld.e || this.p != 1) {
            int[] iArr2 = this.j;
            int i47 = ld.d;
            int i48 = this.p;
            int i49 = i47 / i48;
            int i50 = ld.b / i48;
            int i51 = ld.c / i48;
            int i52 = ld.a / i48;
            boolean z = this.k == 0;
            int i53 = this.r;
            int i54 = this.q;
            byte[] bArr6 = this.i;
            int[] iArr3 = this.a;
            Boolean bool = this.s;
            int i55 = 8;
            int i56 = 0;
            int i57 = 0;
            int i58 = 1;
            while (i56 < i49) {
                Boolean bool2 = bool;
                if (ld.e) {
                    if (i57 >= i49) {
                        int i59 = i58 + 1;
                        i = i49;
                        if (i59 == 2) {
                            i57 = 4;
                        } else if (i59 == 3) {
                            i55 = 4;
                            i58 = i59;
                            i57 = 2;
                        } else if (i59 == 4) {
                            i58 = i59;
                            i57 = 1;
                            i55 = 2;
                        }
                        i58 = i59;
                    } else {
                        i = i49;
                    }
                    i2 = i57 + i55;
                } else {
                    i = i49;
                    i2 = i57;
                    i57 = i56;
                }
                int i60 = i57 + i50;
                boolean z2 = i48 == 1;
                if (i60 < i54) {
                    int i61 = i60 * i53;
                    int i62 = i61 + i52;
                    int i63 = i62 + i51;
                    int i64 = i61 + i53;
                    if (i64 < i63) {
                        i63 = i64;
                    }
                    int i65 = i56 * i48 * ld.c;
                    if (z2) {
                        bool = bool2;
                        int i66 = i62;
                        while (i66 < i63) {
                            int i67 = i51;
                            int i68 = iArr3[bArr6[i65] & 255];
                            if (i68 != 0) {
                                iArr2[i66] = i68;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i65 += i48;
                            i66++;
                            i51 = i67;
                        }
                        i3 = i51;
                    } else {
                        i3 = i51;
                        int i69 = ((i63 - i62) * i48) + i65;
                        bool = bool2;
                        int i70 = i62;
                        while (i70 < i63) {
                            int i71 = i63;
                            int i72 = ld.c;
                            int i73 = i52;
                            int i74 = i53;
                            int i75 = i65;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            while (true) {
                                if (i75 >= this.p + i65) {
                                    i7 = i54;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i7 = i54;
                                if (i75 >= bArr7.length || i75 >= i69) {
                                    break;
                                }
                                int i81 = this.a[bArr7[i75] & 255];
                                if (i81 != 0) {
                                    i76 += (i81 >> 24) & 255;
                                    i77 += (i81 >> 16) & 255;
                                    i78 += (i81 >> 8) & 255;
                                    i79 += i81 & 255;
                                    i80++;
                                }
                                i75++;
                                i54 = i7;
                            }
                            int i82 = i72 + i65;
                            for (int i83 = i82; i83 < this.p + i82; i83++) {
                                byte[] bArr8 = this.i;
                                if (i83 >= bArr8.length || i83 >= i69) {
                                    break;
                                }
                                int i84 = this.a[bArr8[i83] & 255];
                                if (i84 != 0) {
                                    i76 += (i84 >> 24) & 255;
                                    i77 += (i84 >> 16) & 255;
                                    i78 += (i84 >> 8) & 255;
                                    i79 += i84 & 255;
                                    i80++;
                                }
                            }
                            int i85 = i80 == 0 ? 0 : ((i76 / i80) << 24) | ((i77 / i80) << 16) | ((i78 / i80) << 8) | (i79 / i80);
                            if (i85 != 0) {
                                iArr2[i70] = i85;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i65 += i48;
                            i70++;
                            i63 = i71;
                            i52 = i73;
                            i53 = i74;
                            i54 = i7;
                        }
                    }
                    i4 = i52;
                    i5 = i53;
                    i6 = i54;
                } else {
                    i3 = i51;
                    i4 = i52;
                    i5 = i53;
                    i6 = i54;
                    bool = bool2;
                }
                i56++;
                i49 = i;
                i57 = i2;
                i50 = i50;
                i51 = i3;
                i52 = i4;
                i53 = i5;
                i54 = i6;
            }
            Boolean bool3 = bool;
            if (this.s == null) {
                this.s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr4 = this.j;
            int i86 = ld.d;
            int i87 = ld.b;
            int i88 = ld.c;
            int i89 = ld.a;
            byte b4 = this.k == 0 ? (byte) 1 : b;
            int i90 = this.r;
            byte[] bArr9 = this.i;
            int[] iArr5 = this.a;
            byte b5 = -1;
            for (int i91 = b; i91 < i86; i91++) {
                int i92 = (i91 + i87) * i90;
                int i93 = i92 + i89;
                int i94 = i93 + i88;
                int i95 = i92 + i90;
                if (i95 < i94) {
                    i94 = i95;
                }
                int i96 = ld.c * i91;
                while (i93 < i94) {
                    int i97 = i86;
                    byte b6 = bArr9[i96];
                    int i98 = i87;
                    int i99 = b6 & 255;
                    if (i99 != b5) {
                        int i100 = iArr5[i99];
                        if (i100 != 0) {
                            iArr4[i93] = i100;
                        } else {
                            b5 = b6;
                        }
                    }
                    i96++;
                    i93++;
                    i86 = i97;
                    i87 = i98;
                }
            }
            Boolean bool4 = this.s;
            this.s = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || !(this.s != null || b4 == 0 || b5 == -1));
        }
        if (this.n && ((i8 = ld.g) == 0 || i8 == 1)) {
            if (this.m == null) {
                this.m = a();
            }
            Bitmap bitmap3 = this.m;
            int i101 = this.r;
            bitmap3.setPixels(iArr, 0, i101, 0, 0, i101, this.q);
        }
        Bitmap bitmapA = a();
        int i102 = this.r;
        bitmapA.setPixels(iArr, 0, i102, 0, 0, i102, this.q);
        return bitmapA;
    }
}
