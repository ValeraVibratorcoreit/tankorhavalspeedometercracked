package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0390mk {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final D1 e = new D1(1);
    public static final D1 f = new D1(2);
    public static final C0387mh g = new C0387mh(6);
    public static final int[] h = {R.attr.colorPrimary};
    public static final int[] i = {R.attr.colorPrimaryVariant};
    public static boolean j;
    public static Method k;

    public static Z1 E(String str) throws ProtocolException {
        int i2;
        String strSubstring;
        Tf.j("statusLine", str);
        boolean zU0 = Mp.U0(str, "HTTP/1.", false);
        EnumC0268il enumC0268il = EnumC0268il.HTTP_1_0;
        if (zU0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC0268il = EnumC0268il.HTTP_1_1;
            }
        } else {
            if (!Mp.U0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i2, i3);
            Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring2);
            int i4 = Integer.parseInt(strSubstring2);
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i2 + 4);
                Tf.i("(this as java.lang.String).substring(startIndex)", strSubstring);
            }
            return new Z1(enumC0268il, i4, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static void F(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static Qi G(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    Qi qi = new Qi();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    qi.d = byteBufferDuplicate;
                    qi.a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    qi.b = i7;
                    qi.c = ((ByteBuffer) qi.d).getShort(i7);
                    return qi;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void J(TextView textView, int i2) {
        Tf.d(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static int K(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0197 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #29 {all -> 0x0194, blocks: (B:95:0x0172, B:97:0x017e, B:108:0x0197, B:109:0x019c), top: B:260:0x0172 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x01a9 A[Catch: IllegalStateException -> 0x018d, IOException -> 0x018f, FileNotFoundException -> 0x0192, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x0192, IOException -> 0x018f, IllegalStateException -> 0x018d, blocks: (B:93:0x016a, B:98:0x0188, B:117:0x01a9, B:115:0x01a6, B:114:0x01a3), top: B:273:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e3 A[Catch: all -> 0x01f2, TRY_LEAVE, TryCatch #13 {all -> 0x01f2, blocks: (B:134:0x01d7, B:136:0x01e3, B:145:0x01f5), top: B:249:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x01f5 A[Catch: all -> 0x01f2, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x01f2, blocks: (B:134:0x01d7, B:136:0x01e3, B:145:0x01f5), top: B:249:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0213  */
    /* JADX WARN: Code duplicated, block: B:161:0x021d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0221  */
    /* JADX WARN: Code duplicated, block: B:170:0x023b A[Catch: all -> 0x025e, TRY_LEAVE, TryCatch #32 {all -> 0x025e, blocks: (B:167:0x0233, B:168:0x0235, B:170:0x023b), top: B:261:0x0233 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x028d  */
    /* JADX WARN: Code duplicated, block: B:216:0x0296  */
    /* JADX WARN: Code duplicated, block: B:221:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:260:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    /* JADX WARN: Code duplicated, block: B:97:0x017e A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #29 {all -> 0x0194, blocks: (B:95:0x0172, B:97:0x017e, B:108:0x0197, B:109:0x019c), top: B:260:0x0172 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void N(Context context, Executor executor, InterfaceC0053bl interfaceC0053bl, boolean z) throws Throwable {
        byte[] bArr;
        ?? A;
        IOException iOException;
        int i2;
        C0010a9[] c0010a9ArrE0;
        C0010a9[] c0010a9Arr;
        Z8 z8;
        InterfaceC0053bl interfaceC0053bl2;
        C0010a9[] c0010a9Arr2;
        ?? r6;
        byte[] bArr2;
        ?? r7;
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i3;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i4;
        FileInputStream fileInputStreamA;
        boolean zEquals;
        ?? r11;
        boolean z3;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            ?? r15 = 1;
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z3 = j2 == packageInfo.lastUpdateTime;
                            if (z3) {
                                interfaceC0053bl.b(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    AbstractC0238hl.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i5 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            Z8 z9 = new Z8(assets, executor, interfaceC0053bl, name, file2);
            byte[] bArr5 = z9.c;
            if (bArr5 == null) {
                z9.b(3, Integer.valueOf(i5));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                z9.b(4, null);
                            }
                            if (z2 || !z) {
                                r11 = 0;
                            } else {
                                r11 = r15;
                            }
                            AbstractC0238hl.c(context, r11);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            z9.b(4, null);
                            z2 = false;
                        }
                        A = z9.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        interfaceC0053bl.b(6, e2);
                        A = 0;
                    } catch (IOException e3) {
                        interfaceC0053bl.b(7, e3);
                        A = 0;
                    }
                    if (A != 0) {
                        try {
                            if (!Arrays.equals(bArr, Br.Y(A, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c0010a9ArrE0 = Br.e0(A, Br.Y(A, 4), z9.e);
                            try {
                                A.close();
                                A = A;
                            } catch (IOException e4) {
                                IOException iOException2 = e4;
                                interfaceC0053bl.b(7, iOException2);
                                A = iOException2;
                            }
                            z9.g = c0010a9ArrE0;
                        } catch (IOException e5) {
                            i2 = 7;
                            interfaceC0053bl.b(7, e5);
                            try {
                                A.close();
                            } catch (IOException e6) {
                                iOException = e6;
                                interfaceC0053bl.b(i2, iOException);
                                c0010a9ArrE0 = null;
                                A = A;
                                z9.g = c0010a9ArrE0;
                                c0010a9Arr = z9.g;
                                if (c0010a9Arr != null) {
                                    i4 = Build.VERSION.SDK_INT;
                                    A = 34;
                                    A = 34;
                                    A = 34;
                                    if (i4 <= 34) {
                                        switch (i4) {
                                            case 31:
                                            case 32:
                                            case 33:
                                            case 34:
                                                try {
                                                    fileInputStreamA = z9.a(assets, "dexopt/baseline.profm");
                                                    if (fileInputStreamA != null) {
                                                        try {
                                                            zEquals = Arrays.equals(Br.d, Br.Y(fileInputStreamA, 4));
                                                            if (!zEquals) {
                                                                throw new IllegalStateException("Invalid magic");
                                                            }
                                                            z9.g = Br.b0(fileInputStreamA, Br.Y(fileInputStreamA, 4), bArr5, c0010a9Arr);
                                                            fileInputStreamA.close();
                                                            z8 = z9;
                                                            A = zEquals;
                                                        } catch (Throwable th4) {
                                                            try {
                                                                fileInputStreamA.close();
                                                                throw th4;
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                                throw th4;
                                                            }
                                                        }
                                                    } else {
                                                        if (fileInputStreamA != null) {
                                                            fileInputStreamA.close();
                                                        }
                                                        z8 = null;
                                                    }
                                                } catch (FileNotFoundException e7) {
                                                    interfaceC0053bl.b(9, e7);
                                                } catch (IOException e8) {
                                                    interfaceC0053bl.b(7, e8);
                                                } catch (IllegalStateException e9) {
                                                    z9.g = null;
                                                    interfaceC0053bl.b(8, e9);
                                                }
                                                if (z8 == null) {
                                                    z8 = z9;
                                                }
                                                break;
                                            default:
                                                z8 = z9;
                                                break;
                                        }
                                    } else {
                                        z8 = z9;
                                    }
                                } else {
                                    z8 = z9;
                                }
                                interfaceC0053bl2 = z8.b;
                                c0010a9Arr2 = z8.g;
                                r6 = A;
                                if (c0010a9Arr2 != null) {
                                    if (!z8.f) {
                                        r6 = bArr4;
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        r6 = bArr4;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (Br.v0(byteArrayOutputStream, bArr4, c0010a9Arr2)) {
                                                z8.h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                z8.g = null;
                                                r6 = bArr4;
                                            } else {
                                                interfaceC0053bl2.b(5, null);
                                                z8.g = null;
                                                byteArrayOutputStream.close();
                                                r6 = bArr4;
                                            }
                                        } catch (Throwable th6) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th6;
                                            } catch (Throwable th7) {
                                                th6.addSuppressed(th7);
                                                throw th6;
                                            }
                                        }
                                    } catch (IOException e10) {
                                        interfaceC0053bl2.b(7, e10);
                                    } catch (IllegalStateException e11) {
                                        interfaceC0053bl2.b(8, e11);
                                    }
                                }
                                r6 = bArr4;
                                bArr2 = z8.h;
                                if (bArr2 == null) {
                                    z2 = false;
                                    r15 = 1;
                                } else {
                                    try {
                                        if (!z8.f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    fileOutputStream = new FileOutputStream(z8.d);
                                                    try {
                                                        try {
                                                            bArr3 = new byte[512];
                                                            while (true) {
                                                                i3 = byteArrayInputStream.read(bArr3);
                                                                if (i3 > 0) {
                                                                    fileOutputStream.write(bArr3, 0, i3);
                                                                } else {
                                                                    r15 = 1;
                                                                    try {
                                                                        z8.b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        z8.h = null;
                                                                        z8.g = null;
                                                                        z2 = true;
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th9) {
                                                                    th.addSuppressed(th9);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            Throwable th11 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th11;
                                                            } catch (Throwable th12) {
                                                                th11.addSuppressed(th12);
                                                                throw th11;
                                                            }
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                            } catch (FileNotFoundException e12) {
                                                e = e12;
                                                r6 = 1;
                                                z8.b(6, e);
                                                r7 = r6;
                                                z8.h = null;
                                                z8.g = null;
                                                z2 = false;
                                                r15 = r7;
                                            } catch (IOException e13) {
                                                e = e13;
                                                r6 = 1;
                                                z8.b(7, e);
                                                r7 = r6;
                                                z8.h = null;
                                                z8.g = null;
                                                z2 = false;
                                                r15 = r7;
                                            }
                                        } catch (FileNotFoundException e14) {
                                            e = e14;
                                            z8.b(6, e);
                                            r7 = r6;
                                            z8.h = null;
                                            z8.g = null;
                                            z2 = false;
                                            r15 = r7;
                                        } catch (IOException e15) {
                                            e = e15;
                                            z8.b(7, e);
                                            r7 = r6;
                                            z8.h = null;
                                            z8.g = null;
                                            z2 = false;
                                            r15 = r7;
                                        }
                                    } catch (Throwable th15) {
                                        z8.h = null;
                                        z8.g = null;
                                        throw th15;
                                    }
                                }
                                if (z2) {
                                    y(packageInfo, filesDir);
                                }
                                if (z2) {
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                }
                                AbstractC0238hl.c(context, r11);
                            }
                            c0010a9ArrE0 = null;
                            A = A;
                        } catch (IllegalStateException e16) {
                            try {
                                interfaceC0053bl.b(8, e16);
                                try {
                                    A.close();
                                } catch (IOException e17) {
                                    iOException = e17;
                                    i2 = 7;
                                    interfaceC0053bl.b(i2, iOException);
                                    c0010a9ArrE0 = null;
                                    A = A;
                                    z9.g = c0010a9ArrE0;
                                    c0010a9Arr = z9.g;
                                    if (c0010a9Arr != null) {
                                        i4 = Build.VERSION.SDK_INT;
                                        A = 34;
                                        A = 34;
                                        A = 34;
                                        if (i4 <= 34) {
                                            switch (i4) {
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                    fileInputStreamA = z9.a(assets, "dexopt/baseline.profm");
                                                    if (fileInputStreamA != null) {
                                                        zEquals = Arrays.equals(Br.d, Br.Y(fileInputStreamA, 4));
                                                        if (!zEquals) {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                        z9.g = Br.b0(fileInputStreamA, Br.Y(fileInputStreamA, 4), bArr5, c0010a9Arr);
                                                        fileInputStreamA.close();
                                                        z8 = z9;
                                                        A = zEquals;
                                                    } else {
                                                        if (fileInputStreamA != null) {
                                                            fileInputStreamA.close();
                                                        }
                                                        z8 = null;
                                                    }
                                                    if (z8 == null) {
                                                        z8 = z9;
                                                    }
                                                    break;
                                                default:
                                                    z8 = z9;
                                                    break;
                                            }
                                        } else {
                                            z8 = z9;
                                        }
                                    } else {
                                        z8 = z9;
                                    }
                                    interfaceC0053bl2 = z8.b;
                                    c0010a9Arr2 = z8.g;
                                    r6 = A;
                                    if (c0010a9Arr2 != null) {
                                        if (!z8.f) {
                                            r6 = bArr4;
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        r6 = bArr4;
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        byteArrayOutputStream.write(bArr);
                                        byteArrayOutputStream.write(bArr4);
                                        if (Br.v0(byteArrayOutputStream, bArr4, c0010a9Arr2)) {
                                            interfaceC0053bl2.b(5, null);
                                            z8.g = null;
                                            byteArrayOutputStream.close();
                                            r6 = bArr4;
                                        } else {
                                            z8.h = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            z8.g = null;
                                            r6 = bArr4;
                                        }
                                    }
                                    r6 = bArr4;
                                    bArr2 = z8.h;
                                    if (bArr2 == null) {
                                        if (!z8.f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        fileOutputStream = new FileOutputStream(z8.d);
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i3 = byteArrayInputStream.read(bArr3);
                                            if (i3 > 0) {
                                                fileOutputStream.write(bArr3, 0, i3);
                                            } else {
                                                r15 = 1;
                                                z8.b(1, null);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                z8.h = null;
                                                z8.g = null;
                                                z2 = true;
                                            }
                                            th = th;
                                            fileOutputStream.close();
                                            throw th;
                                        }
                                    }
                                    z2 = false;
                                    r15 = 1;
                                    if (z2) {
                                        y(packageInfo, filesDir);
                                    }
                                    if (z2) {
                                        r11 = 0;
                                    } else {
                                        r11 = 0;
                                    }
                                    AbstractC0238hl.c(context, r11);
                                }
                                c0010a9ArrE0 = null;
                                A = A;
                            } catch (Throwable th16) {
                                th = th16;
                                Throwable th17 = th;
                                try {
                                    A.close();
                                    throw th17;
                                } catch (IOException e18) {
                                    interfaceC0053bl.b(7, e18);
                                    throw th17;
                                }
                            }
                        }
                    }
                    c0010a9Arr = z9.g;
                    if (c0010a9Arr != null) {
                        i4 = Build.VERSION.SDK_INT;
                        A = 34;
                        A = 34;
                        A = 34;
                        if (i4 <= 34) {
                            switch (i4) {
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    fileInputStreamA = z9.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA != null) {
                                        zEquals = Arrays.equals(Br.d, Br.Y(fileInputStreamA, 4));
                                        if (!zEquals) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        z9.g = Br.b0(fileInputStreamA, Br.Y(fileInputStreamA, 4), bArr5, c0010a9Arr);
                                        fileInputStreamA.close();
                                        z8 = z9;
                                        A = zEquals;
                                    } else {
                                        if (fileInputStreamA != null) {
                                            fileInputStreamA.close();
                                        }
                                        z8 = null;
                                    }
                                    if (z8 == null) {
                                        z8 = z9;
                                    }
                                    break;
                                default:
                                    z8 = z9;
                                    break;
                            }
                        } else {
                            z8 = z9;
                        }
                    } else {
                        z8 = z9;
                    }
                    interfaceC0053bl2 = z8.b;
                    c0010a9Arr2 = z8.g;
                    r6 = A;
                    if (c0010a9Arr2 != null && (bArr4 = z8.c) != null) {
                        if (!z8.f) {
                            r6 = bArr4;
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        r6 = bArr4;
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.write(bArr4);
                        if (Br.v0(byteArrayOutputStream, bArr4, c0010a9Arr2)) {
                            interfaceC0053bl2.b(5, null);
                            z8.g = null;
                            byteArrayOutputStream.close();
                            r6 = bArr4;
                        } else {
                            z8.h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            z8.g = null;
                            r6 = bArr4;
                        }
                    }
                    r6 = bArr4;
                    bArr2 = z8.h;
                    if (bArr2 == null) {
                        if (!z8.f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream(z8.d);
                        bArr3 = new byte[512];
                        while (true) {
                            i3 = byteArrayInputStream.read(bArr3);
                            if (i3 > 0) {
                                fileOutputStream.write(bArr3, 0, i3);
                            } else {
                                r15 = 1;
                                z8.b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                z8.h = null;
                                z8.g = null;
                                z2 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z2 = false;
                    r15 = 1;
                    if (z2) {
                        y(packageInfo, filesDir);
                    }
                    if (z2) {
                        r11 = 0;
                    } else {
                        r11 = 0;
                    }
                    AbstractC0238hl.c(context, r11);
                } catch (Throwable th18) {
                    th = th18;
                }
                z9.f = true;
                bArr = Br.c;
            }
            z2 = false;
            if (z2) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            AbstractC0238hl.c(context, r11);
        } catch (PackageManager.NameNotFoundException e19) {
            interfaceC0053bl.b(7, e19);
            AbstractC0238hl.c(context, false);
        }
    }

    public static float O() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static void a(long j2, L4 l4, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        int i10 = 0;
        int i11 = 1;
        if (!(i3 < i4)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i12 = i3; i12 < i4; i12++) {
            if (((C0129e5) arrayList.get(i12)).b() < i9) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        C0129e5 c0129e5 = (C0129e5) arrayList.get(i3);
        C0129e5 c0129e6 = (C0129e5) arrayList.get(i4 - 1);
        int i13 = -1;
        if (i9 == c0129e5.b()) {
            int iIntValue = ((Number) arrayList2.get(i3)).intValue();
            int i14 = i3 + 1;
            C0129e5 c0129e7 = (C0129e5) arrayList.get(i14);
            i5 = i14;
            i6 = iIntValue;
            c0129e5 = c0129e7;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (c0129e5.e(i9) == c0129e6.e(i9)) {
            int iMin = Math.min(c0129e5.b(), c0129e6.b());
            for (int i15 = i9; i15 < iMin && c0129e5.e(i15) == c0129e6.e(i15); i15++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (l4.b / j3) + j2 + ((long) 2) + ((long) i10) + 1;
            l4.I(-i10);
            l4.I(i6);
            int i16 = i9 + i10;
            while (i9 < i16) {
                l4.I(c0129e5.e(i9) & 255);
                i9++;
            }
            if (i5 + 1 == i4) {
                if (i16 != ((C0129e5) arrayList.get(i5)).b()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                l4.I(((Number) arrayList2.get(i5)).intValue());
                return;
            } else {
                L4 l5 = new L4();
                l4.I(((int) ((l5.b / j3) + j4)) * (-1));
                a(j4, l5, i16, arrayList, i5, i4, arrayList2);
                l4.F(l5);
                return;
            }
        }
        for (int i17 = i5 + 1; i17 < i4; i17++) {
            if (((C0129e5) arrayList.get(i17 - 1)).e(i9) != ((C0129e5) arrayList.get(i17)).e(i9)) {
                i11++;
            }
        }
        long j5 = 4;
        long j6 = ((long) (i11 * 2)) + (l4.b / j5) + j2 + ((long) 2);
        l4.I(i11);
        l4.I(i6);
        for (int i18 = i5; i18 < i4; i18++) {
            int iE = ((C0129e5) arrayList.get(i18)).e(i9);
            if (i18 == i5 || iE != ((C0129e5) arrayList.get(i18 - 1)).e(i9)) {
                l4.I(iE & 255);
            }
        }
        L4 l6 = new L4();
        while (i5 < i4) {
            byte bE = ((C0129e5) arrayList.get(i5)).e(i9);
            int i19 = i5 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i4) {
                    i7 = i4;
                    break;
                } else {
                    if (bE != ((C0129e5) arrayList.get(i20)).e(i9)) {
                        i7 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i7 && i9 + 1 == ((C0129e5) arrayList.get(i5)).b()) {
                l4.I(((Number) arrayList2.get(i5)).intValue());
                i8 = i7;
            } else {
                l4.I(((int) ((l6.b / j5) + j6)) * i13);
                i8 = i7;
                a(j6, l6, i9 + 1, arrayList, i5, i8, arrayList2);
            }
            l6 = l6;
            i5 = i8;
            j5 = j5;
            i13 = -1;
        }
        l4.F(l6);
    }

    public static void b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.E, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                d(context, i, "Theme.MaterialComponents");
            }
        }
        d(context, h, "Theme.AppCompat");
    }

    public static void c(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0638ul.E, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void d(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(Vo.g("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Activity activity, EnumC0602tg enumC0602tg) {
        Tf.j("activity", activity);
        Tf.j("event", enumC0602tg);
        if (activity instanceof Dg) {
            AbstractC0695wg lifecycle = ((Dg) activity).getLifecycle();
            if (lifecycle instanceof Fg) {
                ((Fg) lifecycle).e(enumC0602tg);
            }
        }
    }

    public static int i(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueR = Tf.R(context, i2);
        if (typedValueR != null) {
            int i4 = typedValueR.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? I7.a(context, i4) : typedValueR.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static int j(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueT = Tf.T(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = typedValueT.resourceId;
        return i3 != 0 ? I7.a(context, i3) : typedValueT.data;
    }

    public static ColorStateList k(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !A.s(drawable)) {
            return null;
        }
        return A.d(drawable).getColorStateList();
    }

    public static SharedPreferences l(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public static AbstractC0093d n(int i2) {
        int iO = Vo.o(i2);
        if (iO == 0) {
            C0106dc c0106dc = new C0106dc();
            c0106dc.c = (Paint) Br.I().a;
            c0106dc.d = new float[3];
            c0106dc.e = 1.2f;
            return c0106dc;
        }
        if (iO != 1) {
            throw new IllegalArgumentException("wrong WHEEL_TYPE");
        }
        Go go = new Go();
        go.c = (Paint) Br.I().a;
        go.d = new float[3];
        return go;
    }

    public static void q(Activity activity) {
        Tf.j("activity", activity);
        if (Build.VERSION.SDK_INT >= 29) {
            C0670vm.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C0670vm());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0701wm(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static int r(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return AbstractC0747y6.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean s(int i2) {
        boolean z;
        if (i2 != 0) {
            ThreadLocal threadLocal = AbstractC0747y6.a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i2);
            int iGreen = Color.green(i2);
            int iBlue = Color.blue(i2);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = ((double) iRed) / 255.0d;
            double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) iGreen) / 255.0d;
            double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = ((double) iBlue) / 255.0d;
            double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z = false;
        }
        return z;
    }

    public static int u(int i2, int i3, float f2) {
        return AbstractC0747y6.b(AbstractC0747y6.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static Vp v(InterfaceC0107dd interfaceC0107dd) {
        return new Vp(interfaceC0107dd);
    }

    public static int w(int i2, int i3, int i4) throws IOException {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
    }

    public static float x(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void y(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static TypedArray z(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        b(context, attributeSet, i2, i3);
        c(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public void A(View view, int i2) {
    }

    public abstract void B(int i2);

    public abstract void C(View view, int i2, int i3);

    public abstract void D(View view, float f2, float f3);

    public abstract void H(boolean z);

    public abstract void I(boolean z);

    public abstract boolean L(View view, int i2);

    public abstract TransformationMethod M(TransformationMethod transformationMethod);

    public abstract int e(View view, int i2);

    public abstract int f(View view, int i2);

    public abstract List g(String str, List list);

    public abstract InputFilter[] m(InputFilter[] inputFilterArr);

    public int o(View view) {
        return 0;
    }

    public int p() {
        return 0;
    }

    public abstract boolean t();
}
