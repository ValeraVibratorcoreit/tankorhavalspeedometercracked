package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N9 {
    public static final C0483pk f = C0483pk.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC0378m8.c);
    public static final C0483pk g = new C0483pk("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C0483pk.e);
    public static final C0483pk h;
    public static final C0483pk i;
    public static final C0225h8 j;
    public static final ArrayDeque k;
    public final InterfaceC0621u4 a;
    public final DisplayMetrics b;
    public final C0634uh c;
    public final List d;
    public final C0477pe e = C0477pe.a();

    static {
        L9 l9 = L9.b;
        Boolean bool = Boolean.FALSE;
        h = C0483pk.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        i = C0483pk.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new C0225h8(4);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = Qr.a;
        k = new ArrayDeque(0);
    }

    public N9(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC0621u4 interfaceC0621u4, C0634uh c0634uh) {
        this.d = arrayList;
        Ud.l("Argument must not be null", displayMetrics);
        this.b = displayMetrics;
        Ud.l("Argument must not be null", interfaceC0621u4);
        this.a = interfaceC0621u4;
        Ud.l("Argument must not be null", c0634uh);
        this.c = c0634uh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(defpackage.K2 r5, android.graphics.BitmapFactory.Options r6, defpackage.M9 r7, defpackage.InterfaceC0621u4 r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.f()
            r5.L()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = defpackage.AbstractC0244hr.b
            r4.lock()
            android.graphics.Bitmap r5 = r5.g(r6)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r5
        L1f:
            r5 = move-exception
            goto L48
        L21:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L32
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
        L32:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L47
            r8.k(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            java.util.concurrent.locks.Lock r6 = defpackage.AbstractC0244hr.b
            r6.unlock()
            return r5
        L46:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L47:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L48:
            java.util.concurrent.locks.Lock r6 = defpackage.AbstractC0244hr.b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.N9.c(K2, android.graphics.BitmapFactory$Options, M9, u4):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C0652v4 a(K2 k2, int i2, int i3, C0544rk c0544rk, M9 m9) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.c.c(byte[].class, 65536);
        synchronized (N9.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC0378m8 enumC0378m8 = (EnumC0378m8) c0544rk.c(f);
        Tk tk = (Tk) c0544rk.c(g);
        L9 l9 = (L9) c0544rk.c(L9.g);
        boolean zBooleanValue = ((Boolean) c0544rk.c(h)).booleanValue();
        C0483pk c0483pk = i;
        try {
            C0652v4 c0652v4B = C0652v4.b(this.a, b(k2, options2, l9, enumC0378m8, tk, c0544rk.c(c0483pk) != null && ((Boolean) c0544rk.c(c0483pk)).booleanValue(), i2, i3, zBooleanValue, m9));
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            return c0652v4B;
        } finally {
            f(options2);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.c.g(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0301  */
    /* JADX WARN: Code duplicated, block: B:112:0x0309  */
    /* JADX WARN: Code duplicated, block: B:114:0x030c  */
    /* JADX WARN: Code duplicated, block: B:116:0x030f  */
    /* JADX WARN: Code duplicated, block: B:126:0x033b  */
    /* JADX WARN: Code duplicated, block: B:127:0x033e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0346  */
    /* JADX WARN: Code duplicated, block: B:131:0x034a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0351 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0359  */
    /* JADX WARN: Code duplicated, block: B:138:0x035d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0365  */
    /* JADX WARN: Code duplicated, block: B:144:0x0368  */
    /* JADX WARN: Code duplicated, block: B:145:0x036e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0396  */
    /* JADX WARN: Code duplicated, block: B:150:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:162:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:164:0x0403  */
    /* JADX WARN: Code duplicated, block: B:169:0x0410  */
    /* JADX WARN: Code duplicated, block: B:171:0x0414  */
    /* JADX WARN: Code duplicated, block: B:172:0x0417  */
    /* JADX WARN: Code duplicated, block: B:176:0x042e  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:179:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:181:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:182:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:185:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:186:0x04da  */
    /* JADX WARN: Code duplicated, block: B:187:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:188:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:189:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:190:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:191:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:194:0x052a  */
    /* JADX WARN: Code duplicated, block: B:195:0x052f  */
    /* JADX WARN: Code duplicated, block: B:199:0x054e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0552 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:202:0x0316 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x025f  */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x0396, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:176:0x042e, please report this as an issue */
    public final Bitmap b(K2 k2, BitmapFactory.Options options, L9 l9, EnumC0378m8 enumC0378m8, Tk tk, boolean z, int i2, int i3, boolean z2, M9 m9) throws Throwable {
        int i4;
        boolean z3;
        int i5;
        int i6;
        int iRound;
        boolean z4;
        String str;
        int i7;
        boolean zC;
        boolean z5;
        String str2;
        boolean zHasAlpha;
        Bitmap.Config config;
        boolean z6;
        int i8;
        boolean z7;
        float f2;
        int i9;
        int iRound2;
        int i10;
        int i11;
        InterfaceC0621u4 interfaceC0621u4;
        Bitmap bitmapC;
        Matrix matrix;
        Bitmap.Config config2;
        Bitmap bitmap;
        boolean z8;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config3;
        int i12;
        int i13;
        int iFloor;
        int iFloor2;
        double dB;
        double d;
        double d2;
        int i14;
        int i15 = AbstractC0449oh.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC0621u4 interfaceC0621u5 = this.a;
        c(k2, options, m9, interfaceC0621u5);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i16 = iArr[0];
        int i17 = iArr[1];
        String str3 = options.outMimeType;
        boolean z9 = (i16 == -1 || i17 == -1) ? false : z;
        int iT = k2.t();
        switch (iT) {
            case 3:
            case 4:
                i4 = 180;
                break;
            case 5:
            case 6:
                i4 = 90;
                break;
            case 7:
            case 8:
                i4 = 270;
                break;
            default:
                i4 = 0;
                break;
        }
        switch (iT) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            if (i4 != 90) {
                i5 = 270;
                if (i4 != 270) {
                    i6 = i16;
                }
            } else {
                i5 = 270;
            }
            i6 = i17;
        } else {
            i5 = 270;
            i6 = i2;
        }
        if (i3 == Integer.MIN_VALUE) {
            iRound = (i4 == 90 || i4 == i5) ? i16 : i17;
        } else {
            iRound = i3;
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeU = k2.u();
        String str4 = ", density: ";
        String str5 = "x";
        String str6 = "Downsampler";
        boolean z10 = z9;
        if (i16 > 0) {
            if (i17 <= 0) {
                i7 = 3;
                z4 = false;
                str = ", target density: ";
            } else {
                if (i4 == 90 || i4 == 270) {
                    i12 = i16;
                    i13 = i17;
                } else {
                    i12 = i17;
                    i13 = i16;
                }
                float fB = l9.b(i13, i12, i6, iRound);
                z4 = false;
                if (fB <= 0.0f) {
                    throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + l9 + ", source: [" + i16 + "x" + i17 + "], target: [" + i6 + "x" + iRound + "]");
                }
                int i18 = i4;
                int iA = l9.a(i13, i12, i6, iRound);
                if (iA == 0) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                float f3 = i13;
                float f4 = i12;
                i6 = i6;
                int i19 = i13 / ((int) (((double) (fB * f3)) + 0.5d));
                int i20 = i12 / ((int) (((double) (fB * f4)) + 0.5d));
                int iMax = Math.max(1, Integer.highestOneBit(iA == 1 ? Math.max(i19, i20) : Math.min(i19, i20)));
                if (iA == 1 && iMax < 1.0f / fB) {
                    iMax <<= 1;
                }
                options.inSampleSize = iMax;
                if (imageHeaderParser$ImageTypeU == ImageHeaderParser$ImageType.JPEG) {
                    float fMin = Math.min(iMax, 8);
                    iFloor = (int) Math.ceil(f3 / fMin);
                    iFloor2 = (int) Math.ceil(f4 / fMin);
                    int i21 = iMax / 8;
                    if (i21 > 0) {
                        iFloor /= i21;
                        iFloor2 /= i21;
                    }
                } else if (imageHeaderParser$ImageTypeU == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeU == ImageHeaderParser$ImageType.PNG_A) {
                    float f5 = iMax;
                    iFloor = (int) Math.floor(f3 / f5);
                    iFloor2 = (int) Math.floor(f4 / f5);
                } else if (imageHeaderParser$ImageTypeU.isWebp()) {
                    float f6 = iMax;
                    iFloor = Math.round(f3 / f6);
                    iFloor2 = Math.round(f4 / f6);
                } else {
                    if (i13 % iMax == 0 && i12 % iMax == 0) {
                        iFloor2 = i12 / iMax;
                        iFloor = i13 / iMax;
                    } else {
                        options.inJustDecodeBounds = true;
                        c(k2, options, m9, interfaceC0621u5);
                        options.inJustDecodeBounds = false;
                        int[] iArr2 = {options.outWidth, options.outHeight};
                        iFloor = iArr2[0];
                        iFloor2 = iArr2[1];
                    }
                    dB = l9.b(iFloor, iFloor2, i6, iRound);
                    if (dB <= 1.0d) {
                        d = dB;
                    } else {
                        d = 1.0d / dB;
                    }
                    int iRound3 = (int) Math.round(d * 2.147483647E9d);
                    int i22 = (int) ((((double) iRound3) * dB) + 0.5d);
                    options.inTargetDensity = (int) (((dB / ((double) (i22 / iRound3))) * ((double) i22)) + 0.5d);
                    if (dB <= 1.0d) {
                        d2 = dB;
                    } else {
                        d2 = 1.0d / dB;
                    }
                    int iRound4 = (int) Math.round(d2 * 2.147483647E9d);
                    options.inDensity = iRound4;
                    i14 = options.inTargetDensity;
                    if (i14 > 0 || iRound4 <= 0 || i14 == iRound4) {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    } else {
                        options.inScaled = true;
                    }
                    str6 = "Downsampler";
                    if (Log.isLoggable(str6, 2)) {
                        StringBuilder sb = new StringBuilder("Calculate scaling, source: [");
                        i16 = i16;
                        sb.append(i16);
                        str5 = "x";
                        sb.append(str5);
                        i17 = i17;
                        sb.append(i17);
                        interfaceC0621u5 = interfaceC0621u5;
                        sb.append("], degreesToRotate: ");
                        sb.append(i18);
                        sb.append(", target: [");
                        sb.append(i6);
                        sb.append(str5);
                        sb.append(iRound);
                        sb.append("], power of two scaled: [");
                        sb.append(iFloor);
                        sb.append(str5);
                        sb.append(iFloor2);
                        sb.append("], exact scale factor: ");
                        sb.append(fB);
                        sb.append(", power of 2 sample size: ");
                        sb.append(iMax);
                        sb.append(", adjusted scale factor: ");
                        sb.append(dB);
                        str = ", target density: ";
                        sb.append(str);
                        sb.append(options.inTargetDensity);
                        str4 = ", density: ";
                        sb.append(str4);
                        sb.append(options.inDensity);
                        Log.v(str6, sb.toString());
                    } else {
                        interfaceC0621u5 = interfaceC0621u5;
                        str4 = str4;
                        str = r7;
                        i17 = i17;
                        str5 = "x";
                        i16 = i16;
                    }
                }
                dB = l9.b(iFloor, iFloor2, i6, iRound);
                if (dB <= 1.0d) {
                    d = dB;
                } else {
                    d = 1.0d / dB;
                }
                int iRound5 = (int) Math.round(d * 2.147483647E9d);
                int i23 = (int) ((((double) iRound5) * dB) + 0.5d);
                options.inTargetDensity = (int) (((dB / ((double) (i23 / iRound5))) * ((double) i23)) + 0.5d);
                if (dB <= 1.0d) {
                    d2 = dB;
                } else {
                    d2 = 1.0d / dB;
                }
                int iRound6 = (int) Math.round(d2 * 2.147483647E9d);
                options.inDensity = iRound6;
                i14 = options.inTargetDensity;
                if (i14 > 0) {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                str6 = "Downsampler";
                if (Log.isLoggable(str6, 2)) {
                    StringBuilder sb2 = new StringBuilder("Calculate scaling, source: [");
                    i16 = i16;
                    sb2.append(i16);
                    str5 = "x";
                    sb2.append(str5);
                    i17 = i17;
                    sb2.append(i17);
                    interfaceC0621u5 = interfaceC0621u5;
                    sb2.append("], degreesToRotate: ");
                    sb2.append(i18);
                    sb2.append(", target: [");
                    sb2.append(i6);
                    sb2.append(str5);
                    sb2.append(iRound);
                    sb2.append("], power of two scaled: [");
                    sb2.append(iFloor);
                    sb2.append(str5);
                    sb2.append(iFloor2);
                    sb2.append("], exact scale factor: ");
                    sb2.append(fB);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(iMax);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(dB);
                    str = ", target density: ";
                    sb2.append(str);
                    sb2.append(options.inTargetDensity);
                    str4 = ", density: ";
                    sb2.append(str4);
                    sb2.append(options.inDensity);
                    Log.v(str6, sb2.toString());
                } else {
                    interfaceC0621u5 = interfaceC0621u5;
                    str4 = str4;
                    str = r7;
                    i17 = i17;
                    str5 = "x";
                    i16 = i16;
                }
            }
            zC = this.e.c(i6, iRound, z10, z3);
            if (zC) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                z5 = false;
                options.inMutable = false;
            } else {
                z5 = false;
            }
            if (zC) {
                str2 = str6;
                if (enumC0378m8 != EnumC0378m8.a) {
                    try {
                        zHasAlpha = k2.u().hasAlpha();
                    } catch (IOException e) {
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "Cannot determine whether the image has alpha or not from header, format " + enumC0378m8, e);
                        }
                        zHasAlpha = z5;
                    }
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z6 = true;
                        options.inDither = true;
                    }
                } else {
                    z6 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                if (i16 >= 0 || i17 < 0 || !z2) {
                    i8 = options.inTargetDensity;
                    if (i8 > 0 || (i11 = options.inDensity) <= 0 || i8 == i11) {
                        z7 = z5;
                    } else {
                        z7 = z6;
                    }
                    if (z7) {
                        f2 = i8 / options.inDensity;
                    } else {
                        f2 = 1.0f;
                    }
                    i9 = options.inSampleSize;
                    float f7 = i9;
                    int iCeil = (int) Math.ceil(i16 / f7);
                    int iCeil2 = (int) Math.ceil(i17 / f7);
                    iRound2 = Math.round(iCeil * f2);
                    iRound = Math.round(iCeil2 * f2);
                    i10 = 2;
                    if (Log.isLoggable(str2, 2)) {
                        Log.v(str2, "Calculated target [" + iRound2 + str5 + iRound + "] for source [" + i16 + str5 + i17 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + str4 + options.inDensity + ", density multiplier: " + f2);
                    }
                } else {
                    iRound2 = i6;
                    i10 = 2;
                }
                if (iRound2 > 0 || iRound <= 0 || (config3 = options.inPreferredConfig) == Bitmap.Config.HARDWARE) {
                    interfaceC0621u4 = interfaceC0621u5;
                } else {
                    Bitmap.Config config4 = options.outConfig;
                    if (config4 != null) {
                        config3 = config4;
                    }
                    InterfaceC0621u4 interfaceC0621u6 = interfaceC0621u5;
                    options.inBitmap = interfaceC0621u6.h(iRound2, iRound, config3);
                    interfaceC0621u4 = interfaceC0621u6;
                }
                if (tk != null) {
                    if (tk == Tk.a || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z8) {
                        named = ColorSpace.Named.DISPLAY_P3;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                }
                bitmapC = c(k2, options, m9, interfaceC0621u4);
                m9.e(interfaceC0621u4, bitmapC);
                if (Log.isLoggable(str2, i10)) {
                    Log.v(str2, "Decoded " + d(bitmapC) + " from [" + i16 + str5 + i17 + "] " + str3 + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + str5 + i3 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0449oh.a(jElapsedRealtimeNanos));
                }
                if (bitmapC != null) {
                    return null;
                }
                bitmapC.setDensity(this.b.densityDpi);
                switch (iT) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (iT) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(z4, z4, bitmapC.getWidth(), bitmapC.getHeight());
                        matrix.mapRect(rectF);
                        int iRound7 = Math.round(rectF.width());
                        int iRound8 = Math.round(rectF.height());
                        if (bitmapC.getConfig() != null) {
                            config2 = bitmapC.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        Bitmap bitmapJ = interfaceC0621u4.j(iRound7, iRound8, config2);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        bitmapJ.setHasAlpha(bitmapC.hasAlpha());
                        AbstractC0244hr.a(bitmapC, bitmapJ, matrix);
                        bitmap = bitmapJ;
                        break;
                    default:
                        bitmap = bitmapC;
                        break;
                }
                if (!bitmapC.equals(bitmap)) {
                    return bitmap;
                }
                interfaceC0621u4.k(bitmapC);
                return bitmap;
            }
            str2 = str6;
            z6 = true;
            if (i16 >= 0) {
                i8 = options.inTargetDensity;
                if (i8 > 0) {
                    z7 = z5;
                } else {
                    z7 = z5;
                }
                if (z7) {
                    f2 = i8 / options.inDensity;
                } else {
                    f2 = 1.0f;
                }
                i9 = options.inSampleSize;
                float f8 = i9;
                int iCeil3 = (int) Math.ceil(i16 / f8);
                int iCeil4 = (int) Math.ceil(i17 / f8);
                iRound2 = Math.round(iCeil3 * f2);
                iRound = Math.round(iCeil4 * f2);
                i10 = 2;
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Calculated target [" + iRound2 + str5 + iRound + "] for source [" + i16 + str5 + i17 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + str4 + options.inDensity + ", density multiplier: " + f2);
                }
            } else {
                i8 = options.inTargetDensity;
                if (i8 > 0) {
                    z7 = z5;
                } else {
                    z7 = z5;
                }
                if (z7) {
                    f2 = i8 / options.inDensity;
                } else {
                    f2 = 1.0f;
                }
                i9 = options.inSampleSize;
                float f9 = i9;
                int iCeil5 = (int) Math.ceil(i16 / f9);
                int iCeil6 = (int) Math.ceil(i17 / f9);
                iRound2 = Math.round(iCeil5 * f2);
                iRound = Math.round(iCeil6 * f2);
                i10 = 2;
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Calculated target [" + iRound2 + str5 + iRound + "] for source [" + i16 + str5 + i17 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + str4 + options.inDensity + ", density multiplier: " + f2);
                }
            }
            if (iRound2 > 0) {
                interfaceC0621u4 = interfaceC0621u5;
            } else {
                interfaceC0621u4 = interfaceC0621u5;
            }
            if (tk != null) {
                if (tk == Tk.a) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z8) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options.inPreferredColorSpace = ColorSpace.get(named);
            }
            bitmapC = c(k2, options, m9, interfaceC0621u4);
            m9.e(interfaceC0621u4, bitmapC);
            if (Log.isLoggable(str2, i10)) {
                Log.v(str2, "Decoded " + d(bitmapC) + " from [" + i16 + str5 + i17 + "] " + str3 + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + str5 + i3 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0449oh.a(jElapsedRealtimeNanos));
            }
            if (bitmapC != null) {
                return null;
            }
            bitmapC.setDensity(this.b.densityDpi);
            switch (iT) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    matrix = new Matrix();
                    switch (iT) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF2 = new RectF(z4, z4, bitmapC.getWidth(), bitmapC.getHeight());
                    matrix.mapRect(rectF2);
                    int iRound9 = Math.round(rectF2.width());
                    int iRound10 = Math.round(rectF2.height());
                    if (bitmapC.getConfig() != null) {
                        config2 = bitmapC.getConfig();
                    } else {
                        config2 = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapJ2 = interfaceC0621u4.j(iRound9, iRound10, config2);
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    bitmapJ2.setHasAlpha(bitmapC.hasAlpha());
                    AbstractC0244hr.a(bitmapC, bitmapJ2, matrix);
                    bitmap = bitmapJ2;
                    break;
                default:
                    bitmap = bitmapC;
                    break;
            }
            if (!bitmapC.equals(bitmap)) {
                return bitmap;
            }
            interfaceC0621u4.k(bitmapC);
            return bitmap;
        }
        z4 = false;
        str = ", target density: ";
        i7 = 3;
        if (Log.isLoggable(str6, i7)) {
            Log.d(str6, "Unable to determine dimensions for: " + imageHeaderParser$ImageTypeU + " with target [" + i6 + str5 + iRound + "]");
        }
        zC = this.e.c(i6, iRound, z10, z3);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z5 = false;
            options.inMutable = false;
        } else {
            z5 = false;
        }
        if (zC) {
            str2 = str6;
            if (enumC0378m8 != EnumC0378m8.a) {
                zHasAlpha = k2.u().hasAlpha();
                if (zHasAlpha) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    z6 = true;
                    options.inDither = true;
                }
            } else {
                z6 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            if (i16 >= 0) {
                i8 = options.inTargetDensity;
                if (i8 > 0) {
                    z7 = z5;
                } else {
                    z7 = z5;
                }
                if (z7) {
                    f2 = i8 / options.inDensity;
                } else {
                    f2 = 1.0f;
                }
                i9 = options.inSampleSize;
                float f10 = i9;
                int iCeil7 = (int) Math.ceil(i16 / f10);
                int iCeil8 = (int) Math.ceil(i17 / f10);
                iRound2 = Math.round(iCeil7 * f2);
                iRound = Math.round(iCeil8 * f2);
                i10 = 2;
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Calculated target [" + iRound2 + str5 + iRound + "] for source [" + i16 + str5 + i17 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + str4 + options.inDensity + ", density multiplier: " + f2);
                }
            } else {
                i8 = options.inTargetDensity;
                if (i8 > 0) {
                    z7 = z5;
                } else {
                    z7 = z5;
                }
                if (z7) {
                    f2 = i8 / options.inDensity;
                } else {
                    f2 = 1.0f;
                }
                i9 = options.inSampleSize;
                float f11 = i9;
                int iCeil9 = (int) Math.ceil(i16 / f11);
                int iCeil10 = (int) Math.ceil(i17 / f11);
                iRound2 = Math.round(iCeil9 * f2);
                iRound = Math.round(iCeil10 * f2);
                i10 = 2;
                if (Log.isLoggable(str2, 2)) {
                    Log.v(str2, "Calculated target [" + iRound2 + str5 + iRound + "] for source [" + i16 + str5 + i17 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + str4 + options.inDensity + ", density multiplier: " + f2);
                }
            }
            if (iRound2 > 0) {
                interfaceC0621u4 = interfaceC0621u5;
            } else {
                interfaceC0621u4 = interfaceC0621u5;
            }
            if (tk != null) {
                if (tk == Tk.a) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z8) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options.inPreferredColorSpace = ColorSpace.get(named);
            }
            bitmapC = c(k2, options, m9, interfaceC0621u4);
            m9.e(interfaceC0621u4, bitmapC);
            if (Log.isLoggable(str2, i10)) {
                Log.v(str2, "Decoded " + d(bitmapC) + " from [" + i16 + str5 + i17 + "] " + str3 + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + str5 + i3 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0449oh.a(jElapsedRealtimeNanos));
            }
            if (bitmapC != null) {
                return null;
            }
            bitmapC.setDensity(this.b.densityDpi);
            switch (iT) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    matrix = new Matrix();
                    switch (iT) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF3 = new RectF(z4, z4, bitmapC.getWidth(), bitmapC.getHeight());
                    matrix.mapRect(rectF3);
                    int iRound11 = Math.round(rectF3.width());
                    int iRound12 = Math.round(rectF3.height());
                    if (bitmapC.getConfig() != null) {
                        config2 = bitmapC.getConfig();
                    } else {
                        config2 = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapJ3 = interfaceC0621u4.j(iRound11, iRound12, config2);
                    matrix.postTranslate(-rectF3.left, -rectF3.top);
                    bitmapJ3.setHasAlpha(bitmapC.hasAlpha());
                    AbstractC0244hr.a(bitmapC, bitmapJ3, matrix);
                    bitmap = bitmapJ3;
                    break;
                default:
                    bitmap = bitmapC;
                    break;
            }
            if (!bitmapC.equals(bitmap)) {
                return bitmap;
            }
            interfaceC0621u4.k(bitmapC);
            return bitmap;
        }
        str2 = str6;
        z6 = true;
        if (i16 >= 0) {
            i8 = options.inTargetDensity;
            if (i8 > 0) {
                z7 = z5;
            } else {
                z7 = z5;
            }
            if (z7) {
                f2 = i8 / options.inDensity;
            } else {
                f2 = 1.0f;
            }
            i9 = options.inSampleSize;
            float f12 = i9;
            int iCeil11 = (int) Math.ceil(i16 / f12);
            int iCeil12 = (int) Math.ceil(i17 / f12);
            iRound2 = Math.round(iCeil11 * f2);
            iRound = Math.round(iCeil12 * f2);
            i10 = 2;
            if (Log.isLoggable(str2, 2)) {
                Log.v(str2, "Calculated target [" + iRound2 + str5 + iRound + "] for source [" + i16 + str5 + i17 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + str4 + options.inDensity + ", density multiplier: " + f2);
            }
        } else {
            i8 = options.inTargetDensity;
            if (i8 > 0) {
                z7 = z5;
            } else {
                z7 = z5;
            }
            if (z7) {
                f2 = i8 / options.inDensity;
            } else {
                f2 = 1.0f;
            }
            i9 = options.inSampleSize;
            float f13 = i9;
            int iCeil13 = (int) Math.ceil(i16 / f13);
            int iCeil14 = (int) Math.ceil(i17 / f13);
            iRound2 = Math.round(iCeil13 * f2);
            iRound = Math.round(iCeil14 * f2);
            i10 = 2;
            if (Log.isLoggable(str2, 2)) {
                Log.v(str2, "Calculated target [" + iRound2 + str5 + iRound + "] for source [" + i16 + str5 + i17 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + str4 + options.inDensity + ", density multiplier: " + f2);
            }
        }
        if (iRound2 > 0) {
            interfaceC0621u4 = interfaceC0621u5;
        } else {
            interfaceC0621u4 = interfaceC0621u5;
        }
        if (tk != null) {
            if (tk == Tk.a) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            options.inPreferredColorSpace = ColorSpace.get(named);
        }
        bitmapC = c(k2, options, m9, interfaceC0621u4);
        m9.e(interfaceC0621u4, bitmapC);
        if (Log.isLoggable(str2, i10)) {
            Log.v(str2, "Decoded " + d(bitmapC) + " from [" + i16 + str5 + i17 + "] " + str3 + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + str5 + i3 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + AbstractC0449oh.a(jElapsedRealtimeNanos));
        }
        if (bitmapC != null) {
            return null;
        }
        bitmapC.setDensity(this.b.densityDpi);
        switch (iT) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                matrix = new Matrix();
                switch (iT) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF4 = new RectF(z4, z4, bitmapC.getWidth(), bitmapC.getHeight());
                matrix.mapRect(rectF4);
                int iRound13 = Math.round(rectF4.width());
                int iRound14 = Math.round(rectF4.height());
                if (bitmapC.getConfig() != null) {
                    config2 = bitmapC.getConfig();
                } else {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                Bitmap bitmapJ4 = interfaceC0621u4.j(iRound13, iRound14, config2);
                matrix.postTranslate(-rectF4.left, -rectF4.top);
                bitmapJ4.setHasAlpha(bitmapC.hasAlpha());
                AbstractC0244hr.a(bitmapC, bitmapJ4, matrix);
                bitmap = bitmapJ4;
                break;
            default:
                bitmap = bitmapC;
                break;
        }
        if (!bitmapC.equals(bitmap)) {
            return bitmap;
        }
        interfaceC0621u4.k(bitmapC);
        return bitmap;
    }
}
