package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParser;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class Br {
    public static final Object[] a = new Object[0];
    public static final C0225h8 b = new C0225h8(14);
    public static final byte[] c = {112, 114, 111, 0};
    public static final byte[] d = {112, 114, 109, 0};
    public static final V5 e = new V5(4);
    public static boolean f = true;
    public static boolean g = true;
    public static Field h;
    public static boolean i;

    public static String A(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static void A0(ByteArrayOutputStream byteArrayOutputStream, int i2) throws IOException {
        z0(byteArrayOutputStream, i2, 2);
    }

    public static ArrayList B(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean G(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean H(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static Vi I() {
        Vi vi = new Vi();
        vi.a = new Paint(1);
        return vi;
    }

    public static TypedArray J(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void L(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float T(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0287ja.c(edgeEffect, f2, f3);
        }
        AbstractC0258ia.a(edgeEffect, f2, f3);
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a6  */
    public static long V(int i2, String str) {
        int iO = o(str, 0, i2, false);
        Matcher matcher = K7.m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iJ0 = -1;
        int i6 = -1;
        int i7 = -1;
        while (iO < i2) {
            int iO2 = o(str, iO + 1, i2, true);
            matcher.region(iO, iO2);
            if (i4 == -1 && matcher.usePattern(K7.m).matches()) {
                String strGroup = matcher.group(1);
                Tf.i("matcher.group(1)", strGroup);
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                Tf.i("matcher.group(2)", strGroup2);
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                Tf.i("matcher.group(3)", strGroup3);
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(K7.l).matches()) {
                String strGroup4 = matcher.group(1);
                Tf.i("matcher.group(1)", strGroup4);
                i5 = Integer.parseInt(strGroup4);
            } else if (iJ0 == -1) {
                Pattern pattern = K7.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    Tf.i("matcher.group(1)", strGroup5);
                    Locale locale = Locale.US;
                    Tf.i("Locale.US", locale);
                    String lowerCase = strGroup5.toLowerCase(locale);
                    Tf.i("(this as java.lang.String).toLowerCase(locale)", lowerCase);
                    String strPattern = pattern.pattern();
                    Tf.i("MONTH_PATTERN.pattern()", strPattern);
                    iJ0 = Mp.J0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i3 != -1 && matcher.usePattern(K7.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    Tf.i("matcher.group(1)", strGroup6);
                    i3 = Integer.parseInt(strGroup6);
                }
            } else if (i3 != -1) {
            }
            iO = o(str, iO2 + 1, i2, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += 2000;
        }
        if (!(i3 >= 1601)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iJ0 == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (1 > i5 || 31 < i5) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i4 < 0 || 23 < i4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i6 < 0 || 59 < i6) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i7 < 0 || 59 < i7) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Rr.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iJ0 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean W(String str) {
        Tf.j("method", str);
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static void X(String str) {
        Context contextA = AbstractC0402n1.a();
        SharedPreferences.Editor editorEdit = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0).edit();
        editorEdit.putString("INFO_PANEL", str);
        editorEdit.commit();
    }

    public static byte[] Y(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                throw new IllegalStateException(Vo.e(i2, "Not enough bytes to read: "));
            }
            i3 += i4;
        }
        return bArr;
    }

    public static int[] Z(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iF0 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iF0 += (int) f0(byteArrayInputStream, 2);
            iArr[i3] = iF0;
        }
        return iArr;
    }

    public static byte[] a0(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static C0010a9[] b0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0010a9[] c0010a9Arr) throws IOException {
        byte[] bArr3 = F4.o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, F4.p)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iF0 = (int) f0(fileInputStream, 2);
            byte[] bArrA0 = a0(fileInputStream, (int) f0(fileInputStream, 4), (int) f0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA0);
            try {
                C0010a9[] c0010a9ArrD0 = d0(byteArrayInputStream, bArr2, iF0, c0010a9Arr);
                byteArrayInputStream.close();
                return c0010a9ArrD0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(F4.j, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iF1 = (int) f0(fileInputStream, 1);
        byte[] bArrA1 = a0(fileInputStream, (int) f0(fileInputStream, 4), (int) f0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrA1);
        try {
            C0010a9[] c0010a9ArrC0 = c0(byteArrayInputStream2, iF1, c0010a9Arr);
            byteArrayInputStream2.close();
            return c0010a9ArrC0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void c(StringBuilder sb, Object obj, InterfaceC0445od interfaceC0445od) {
        if (interfaceC0445od != null) {
            sb.append((CharSequence) interfaceC0445od.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static C0010a9[] c0(ByteArrayInputStream byteArrayInputStream, int i2, C0010a9[] c0010a9Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0010a9[0];
        }
        if (i2 != c0010a9Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iF0 = (int) f0(byteArrayInputStream, 2);
            iArr[i3] = (int) f0(byteArrayInputStream, 2);
            strArr[i3] = new String(Y(byteArrayInputStream, iF0), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0010a9 c0010a9 = c0010a9Arr[i4];
            if (!c0010a9.b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0010a9.e = i5;
            c0010a9.h = Z(byteArrayInputStream, i5);
        }
        return c0010a9Arr;
    }

    public static C0010a9[] d0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0010a9[] c0010a9Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C0010a9[0];
        }
        if (i2 != c0010a9Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            f0(byteArrayInputStream, 2);
            String str = new String(Y(byteArrayInputStream, (int) f0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jF0 = f0(byteArrayInputStream, 4);
            int iF0 = (int) f0(byteArrayInputStream, 2);
            C0010a9 c0010a9 = null;
            if (c0010a9Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < c0010a9Arr.length; i4++) {
                    if (c0010a9Arr[i4].b.equals(strSubstring)) {
                        c0010a9 = c0010a9Arr[i4];
                        break;
                    }
                }
            }
            if (c0010a9 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0010a9.d = jF0;
            int[] iArrZ = Z(byteArrayInputStream, iF0);
            if (Arrays.equals(bArr, F4.n)) {
                c0010a9.e = iF0;
                c0010a9.h = iArrZ;
            }
        }
        return c0010a9Arr;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0285  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:203:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:207:0x0303  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:408:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:409:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:412:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:413:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:416:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:417:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:421:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:424:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:426:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x0707 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    public static void e(C0686w7 c0686w7, Qg qg, ArrayList arrayList, int i2) {
        int i3;
        E5[] e5Arr;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C0224h7[] c0224h7Arr;
        int i6;
        E5[] e5Arr2;
        C0655v7 c0655v7;
        int i7;
        int i8;
        int i9;
        C0655v7 c0655v8;
        Wo wo;
        Wo wo2;
        C0224h7 c0224h7;
        C0224h7 c0224h8;
        Wo wo3;
        C0655v7 c0655v9;
        C0224h7[] c0224h7Arr2;
        C0655v7 c0655v10;
        int i10;
        C0224h7 c0224h9;
        C0224h7 c0224h10;
        Wo wo4;
        C0224h7 c0224h11;
        Wo wo5;
        int size;
        boolean z5;
        C0224h7 c0224h12;
        C0655v7 c0655v11;
        int i11;
        C0655v7 c0655v12;
        C0686w7 c0686w8 = c0686w7;
        int i12 = 2;
        if (i2 == 0) {
            i3 = c0686w8.z0;
            e5Arr = c0686w8.C0;
            i4 = 0;
        } else {
            i3 = c0686w8.A0;
            e5Arr = c0686w8.B0;
            i4 = 2;
        }
        int i13 = 0;
        while (i13 < i3) {
            E5 e5 = e5Arr[i13];
            boolean z6 = e5.q;
            C0655v7 c0655v13 = e5.a;
            int i14 = 3;
            int i15 = 1;
            int i16 = 8;
            if (z6) {
                i5 = i13;
                z = true;
            } else {
                int i17 = e5.l;
                int i18 = i17 * 2;
                C0655v7 c0655v14 = c0655v13;
                C0655v7 c0655v15 = c0655v14;
                boolean z7 = false;
                while (!z7) {
                    e5.i += i15;
                    c0655v14.m0[i17] = null;
                    c0655v14.l0[i17] = null;
                    int i19 = c0655v14.g0;
                    C0224h7[] c0224h7Arr3 = c0655v14.Q;
                    if (i19 != i16) {
                        c0655v14.j(i17);
                        c0224h7Arr3[i18].e();
                        int i20 = i18 + 1;
                        c0224h7Arr3[i20].e();
                        c0224h7Arr3[i18].e();
                        c0224h7Arr3[i20].e();
                        if (e5.b == null) {
                            e5.b = c0655v14;
                        }
                        e5.d = c0655v14;
                        int i21 = c0655v14.p0[i17];
                        if (i21 == i14) {
                            int i22 = c0655v14.t[i17];
                            if (i22 == 0 || i22 == i14 || i22 == i12) {
                                e5.j++;
                                float f2 = c0655v14.k0[i17];
                                if (f2 > 0.0f) {
                                    e5.k += f2;
                                }
                                if (c0655v14.g0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f2 < 0.0f) {
                                        e5.n = true;
                                    } else {
                                        e5.o = true;
                                    }
                                    if (e5.h == null) {
                                        e5.h = new ArrayList();
                                    }
                                    e5.h.add(c0655v14);
                                }
                                if (e5.f == null) {
                                    e5.f = c0655v14;
                                }
                                C0655v7 c0655v16 = e5.g;
                                if (c0655v16 != null) {
                                    c0655v16.l0[i17] = c0655v14;
                                }
                                e5.g = c0655v14;
                            }
                            if (i17 == 0) {
                                if (c0655v14.r == 0 && c0655v14.u == 0) {
                                    int i23 = c0655v14.v;
                                }
                            } else if (c0655v14.s == 0 && c0655v14.x == 0) {
                                int i24 = c0655v14.y;
                            }
                        } else {
                            i13 = i13;
                        }
                    } else {
                        i13 = i13;
                    }
                    C0655v7 c0655v17 = c0655v15;
                    if (c0655v17 != c0655v14) {
                        c0655v17.m0[i17] = c0655v14;
                    }
                    C0224h7 c0224h13 = c0224h7Arr3[i18 + 1].f;
                    if (c0224h13 != null) {
                        c0655v12 = c0224h13.d;
                        C0224h7 c0224h14 = c0655v12.Q[i18].f;
                        if (c0224h14 == null || c0224h14.d != c0655v14) {
                            c0655v12 = null;
                        }
                    } else {
                        c0655v12 = null;
                    }
                    if (c0655v12 == null) {
                        c0655v12 = c0655v14;
                        z7 = true;
                    }
                    c0655v15 = c0655v14;
                    i13 = i13;
                    i15 = 1;
                    i16 = 8;
                    i12 = 2;
                    c0655v14 = c0655v12;
                    i14 = 3;
                }
                i5 = i13;
                C0655v7 c0655v18 = e5.b;
                if (c0655v18 != null) {
                    c0655v18.Q[i18].e();
                }
                C0655v7 c0655v19 = e5.d;
                if (c0655v19 != null) {
                    c0655v19.Q[i18 + 1].e();
                }
                e5.c = c0655v14;
                if (i17 == 0 && e5.m) {
                    e5.e = c0655v14;
                } else {
                    e5.e = c0655v13;
                }
                e5.p = e5.o && e5.n;
                z = true;
            }
            e5.q = z;
            if (arrayList == 0 || arrayList.contains(c0655v13)) {
                C0655v7 c0655v20 = e5.c;
                C0655v7 c0655v21 = e5.b;
                C0655v7 c0655v22 = e5.d;
                C0655v7 c0655v23 = e5.e;
                float f3 = e5.k;
                boolean z8 = c0686w8.p0[i2] == 2;
                if (i2 == 0) {
                    int i25 = c0655v23.i0;
                    boolean z9 = i25 == 0;
                    z4 = i25 == 1;
                    z2 = i25 == 2;
                    z3 = z9;
                } else {
                    int i26 = c0655v23.j0;
                    boolean z10 = i26 == 0;
                    boolean z11 = i26 == 1;
                    z2 = i26 == 2;
                    z3 = z10;
                    z4 = z11;
                }
                boolean z12 = false;
                while (true) {
                    c0224h7Arr = c0686w8.Q;
                    if (z12) {
                        break;
                    }
                    C0224h7 c0224h15 = c0655v13.Q[i4];
                    int i27 = z2 ? 1 : 4;
                    int iE = c0224h15.e();
                    boolean z13 = z12;
                    int[] iArr = c0655v13.p0;
                    int i28 = i3;
                    E5[] e5Arr3 = e5Arr;
                    boolean z14 = iArr[i2] == 3 && c0655v13.t[i2] == 0;
                    C0224h7 c0224h16 = c0224h15.f;
                    if (c0224h16 != null && c0655v13 != c0655v13) {
                        iE = c0224h16.e() + iE;
                    }
                    int i29 = iE;
                    if (z2 && c0655v13 != c0655v13 && c0655v13 != c0655v21) {
                        i27 = 8;
                    }
                    C0224h7 c0224h17 = c0224h15.f;
                    if (c0224h17 != null) {
                        if (c0655v13 == c0655v21) {
                            qg.f(c0224h15.i, c0224h17.i, i29, 6);
                        } else {
                            qg.f(c0224h15.i, c0224h17.i, i29, 8);
                        }
                        if (z14 && !z2) {
                            i27 = 5;
                        }
                        qg.e(c0224h15.i, c0224h15.f.i, i29, (c0655v13 == c0655v21 && z2 && c0655v13.S[i2]) ? 5 : i27);
                    } else {
                        e5 = e5;
                        c0655v13 = c0655v13;
                    }
                    C0224h7[] c0224h7Arr4 = c0655v13.Q;
                    if (z8) {
                        if (c0655v13.g0 == 8 || iArr[i2] != 3) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            qg.f(c0224h7Arr4[i4 + 1].i, c0224h7Arr4[i4].i, 0, 5);
                        }
                        qg.f(c0224h7Arr4[i4].i, c0224h7Arr[i4].i, i11, 8);
                    }
                    C0224h7 c0224h18 = c0224h7Arr4[i4 + 1].f;
                    if (c0224h18 != null) {
                        c0655v11 = c0224h18.d;
                        C0224h7 c0224h19 = c0655v11.Q[i4].f;
                        if (c0224h19 == null || c0224h19.d != c0655v13) {
                            c0655v11 = null;
                        }
                    } else {
                        c0655v11 = null;
                    }
                    if (c0655v11 != null) {
                        c0655v13 = c0655v11;
                        z12 = z13;
                    } else {
                        z12 = true;
                    }
                    c0655v23 = c0655v23;
                    i3 = i28;
                    e5Arr = e5Arr3;
                    c0655v13 = c0655v13;
                    e5 = e5;
                }
                E5 e6 = e5;
                C0655v7 c0655v24 = c0655v23;
                C0655v7 c0655v25 = c0655v13;
                i6 = i3;
                e5Arr2 = e5Arr;
                if (c0655v22 != null) {
                    int i30 = i4 + 1;
                    if (c0655v20.Q[i30].f != null) {
                        C0224h7 c0224h20 = c0655v22.Q[i30];
                        if (c0655v22.p0[i2] == 3 && c0655v22.t[i2] == 0 && !z2) {
                            C0224h7 c0224h21 = c0224h20.f;
                            if (c0224h21.d == c0686w8) {
                                qg.e(c0224h20.i, c0224h21.i, -c0224h20.e(), 5);
                            } else if (z2) {
                                c0224h12 = c0224h20.f;
                                if (c0224h12.d == c0686w8) {
                                    qg.e(c0224h20.i, c0224h12.i, -c0224h20.e(), 4);
                                }
                            }
                        } else if (z2) {
                            c0224h12 = c0224h20.f;
                            if (c0224h12.d == c0686w8) {
                                qg.e(c0224h20.i, c0224h12.i, -c0224h20.e(), 4);
                            }
                        }
                        qg.g(c0224h20.i, c0655v20.Q[i30].f.i, -c0224h20.e(), 6);
                    }
                }
                if (z8) {
                    int i31 = i4 + 1;
                    Wo wo6 = c0224h7Arr[i31].i;
                    C0224h7 c0224h22 = c0655v20.Q[i31];
                    qg.f(wo6, c0224h22.i, c0224h22.e(), 8);
                }
                ArrayList arrayList2 = e6.h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f4 = (!e6.n || e6.p) ? f3 : e6.j;
                    C0655v7 c0655v26 = null;
                    float f5 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        C0655v7 c0655v27 = (C0655v7) arrayList2.get(i32);
                        float f6 = c0655v27.k0[i2];
                        C0224h7[] c0224h7Arr5 = c0655v27.Q;
                        if (f6 < 0.0f) {
                            if (e6.p) {
                                Wo wo7 = c0224h7Arr5[i4 + 1].i;
                                Wo wo8 = c0224h7Arr5[i4].i;
                                z5 = false;
                                qg.e(wo7, wo8, 0, 4);
                            } else {
                                f6 = 1.0f;
                            }
                            arrayList2 = arrayList2;
                            size = size;
                            i32++;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f6 == 0.0f) {
                            Wo wo9 = c0224h7Arr5[i4 + 1].i;
                            Wo wo10 = c0224h7Arr5[i4].i;
                            z5 = false;
                            qg.e(wo9, wo10, 0, 8);
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (c0655v26 != null) {
                                C0224h7[] c0224h7Arr6 = c0655v26.Q;
                                Wo wo11 = c0224h7Arr6[i4].i;
                                int i33 = i4 + 1;
                                Wo wo12 = c0224h7Arr6[i33].i;
                                Wo wo13 = c0224h7Arr5[i4].i;
                                Wo wo14 = c0224h7Arr5[i33].i;
                                C0097d3 c0097d3L = qg.l();
                                c0097d3L.b = 0.0f;
                                if (f4 == 0.0f || f5 == f6) {
                                    c0097d3L.d.j(wo11, 1.0f);
                                    c0097d3L.d.j(wo12, -1.0f);
                                    c0097d3L.d.j(wo14, 1.0f);
                                    c0097d3L.d.j(wo13, -1.0f);
                                } else if (f5 == 0.0f) {
                                    c0097d3L.d.j(wo11, 1.0f);
                                    c0097d3L.d.j(wo12, -1.0f);
                                } else if (f6 == 0.0f) {
                                    c0097d3L.d.j(wo13, 1.0f);
                                    c0097d3L.d.j(wo14, -1.0f);
                                } else {
                                    float f7 = (f5 / f4) / (f6 / f4);
                                    c0097d3L.d.j(wo11, 1.0f);
                                    c0097d3L.d.j(wo12, -1.0f);
                                    c0097d3L.d.j(wo14, f7);
                                    c0097d3L.d.j(wo13, -f7);
                                }
                                qg.c(c0097d3L);
                            } else {
                                f6 = f6;
                            }
                            f5 = f6;
                            c0655v26 = c0655v27;
                        }
                        i32++;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                }
                if (c0655v21 == null || !(c0655v21 == c0655v22 || z2)) {
                    c0655v7 = c0655v22;
                    i7 = i5;
                    if (!z3 || c0655v21 == null) {
                        int i34 = 8;
                        if (z4 && c0655v21 != null) {
                            int i35 = e6.j;
                            boolean z15 = i35 > 0 && e6.i == i35;
                            C0655v7 c0655v28 = c0655v21;
                            C0655v7 c0655v29 = c0655v28;
                            while (c0655v29 != null) {
                                C0655v7 c0655v30 = c0655v29.m0[i2];
                                while (c0655v30 != null && c0655v30.g0 == i34) {
                                    c0655v30 = c0655v30.m0[i2];
                                }
                                if (c0655v29 == c0655v21 || c0655v29 == c0655v7 || c0655v30 == null) {
                                    c0655v28 = c0655v28;
                                    i7 = i7;
                                    i9 = i34;
                                } else {
                                    C0655v7 c0655v31 = c0655v30 == c0655v7 ? null : c0655v30;
                                    C0224h7[] c0224h7Arr7 = c0655v29.Q;
                                    C0224h7 c0224h23 = c0224h7Arr7[i4];
                                    Wo wo15 = c0224h23.i;
                                    int i36 = i4 + 1;
                                    Wo wo16 = c0655v28.Q[i36].i;
                                    int iE2 = c0224h23.e();
                                    int iE3 = c0224h7Arr7[i36].e();
                                    if (c0655v31 != null) {
                                        c0224h7 = c0655v31.Q[i4];
                                        wo = c0224h7.i;
                                        c0655v8 = c0655v31;
                                        C0224h7 c0224h24 = c0224h7.f;
                                        wo2 = c0224h24 != null ? c0224h24.i : null;
                                    } else {
                                        c0655v8 = c0655v31;
                                        C0224h7 c0224h25 = c0655v7.Q[i4];
                                        wo = c0224h25 != null ? c0224h25.i : null;
                                        wo2 = c0224h7Arr7[i36].i;
                                        c0224h7 = c0224h25;
                                    }
                                    int iE4 = c0224h7 != null ? c0224h7.e() + iE3 : iE3;
                                    int iE5 = c0655v28.Q[i36].e() + iE2;
                                    int i37 = z15 ? 8 : 4;
                                    if (wo15 == null || wo16 == null || wo == null || wo2 == null) {
                                        i9 = 8;
                                    } else {
                                        i9 = 8;
                                        qg.b(wo15, wo16, iE5, 0.5f, wo, wo2, iE4, i37);
                                    }
                                    c0655v30 = c0655v8;
                                }
                                c0655v28 = c0655v29.g0 != i9 ? c0655v29 : c0655v28;
                                c0655v29 = c0655v30;
                                i34 = i9;
                                i7 = i7;
                            }
                            i8 = i7;
                            C0224h7 c0224h26 = c0655v21.Q[i4];
                            C0224h7 c0224h27 = c0655v25.Q[i4].f;
                            int i38 = i4 + 1;
                            C0224h7 c0224h28 = c0655v7.Q[i38];
                            C0224h7 c0224h29 = c0655v20.Q[i38].f;
                            if (c0224h27 != null) {
                                if (c0655v21 != c0655v7) {
                                    qg.e(c0224h26.i, c0224h27.i, c0224h26.e(), 5);
                                } else if (c0224h29 != null) {
                                    qg.b(c0224h26.i, c0224h27.i, c0224h26.e(), 0.5f, c0224h28.i, c0224h29.i, c0224h28.e(), 5);
                                }
                            }
                            if (c0224h29 != null && c0655v21 != c0655v7) {
                                qg.e(c0224h28.i, c0224h29.i, -c0224h28.e(), 5);
                            }
                        }
                        if ((z3 || z4) && c0655v21 != null && c0655v21 != c0655v7) {
                            c0224h7Arr2 = c0655v21.Q;
                            C0224h7 c0224h30 = c0224h7Arr2[i4];
                            if (c0655v7 == null) {
                                c0655v10 = c0655v21;
                            } else {
                                c0655v10 = c0655v7;
                            }
                            i10 = i4 + 1;
                            C0224h7[] c0224h7Arr8 = c0655v10.Q;
                            c0224h9 = c0224h7Arr8[i10];
                            c0224h10 = c0224h30.f;
                            if (c0224h10 != null) {
                                wo4 = c0224h10.i;
                            } else {
                                wo4 = null;
                            }
                            c0224h11 = c0224h9.f;
                            if (c0224h11 != null) {
                                wo5 = c0224h11.i;
                            } else {
                                wo5 = null;
                            }
                            if (c0655v20 != c0655v10) {
                                C0224h7 c0224h31 = c0655v20.Q[i10].f;
                                wo5 = c0224h31 != null ? c0224h31.i : null;
                            }
                            if (c0655v21 == c0655v10) {
                                c0224h9 = c0224h7Arr2[i10];
                            }
                            if (wo4 == null && wo5 != null) {
                                qg.b(c0224h30.i, wo4, c0224h30.e(), 0.5f, wo5, c0224h9.i, c0224h7Arr8[i10].e(), 5);
                            }
                        }
                    } else {
                        int i39 = e6.j;
                        boolean z16 = i39 > 0 && e6.i == i39;
                        C0655v7 c0655v32 = c0655v21;
                        C0655v7 c0655v33 = c0655v32;
                        while (c0655v33 != null) {
                            C0655v7 c0655v34 = c0655v33.m0[i2];
                            while (c0655v34 != null && c0655v34.g0 == 8) {
                                c0655v34 = c0655v34.m0[i2];
                            }
                            if (c0655v34 != null || c0655v33 == c0655v7) {
                                C0224h7[] c0224h7Arr9 = c0655v33.Q;
                                C0224h7 c0224h32 = c0224h7Arr9[i4];
                                Wo wo17 = c0224h32.i;
                                C0224h7 c0224h33 = c0224h32.f;
                                Wo wo18 = c0224h33 != null ? c0224h33.i : null;
                                if (c0655v32 != c0655v33) {
                                    wo18 = c0655v32.Q[i4 + 1].i;
                                } else if (c0655v33 == c0655v21) {
                                    C0224h7 c0224h34 = c0655v25.Q[i4].f;
                                    wo18 = c0224h34 != null ? c0224h34.i : null;
                                }
                                int iE6 = c0224h32.e();
                                int i40 = i4 + 1;
                                int iE7 = c0224h7Arr9[i40].e();
                                if (c0655v34 != null) {
                                    c0224h8 = c0655v34.Q[i4];
                                    wo3 = c0224h8.i;
                                } else {
                                    c0224h8 = c0655v20.Q[i40].f;
                                    wo3 = c0224h8 != null ? c0224h8.i : null;
                                }
                                Wo wo19 = c0224h7Arr9[i40].i;
                                if (c0224h8 != null) {
                                    iE7 = c0224h8.e() + iE7;
                                }
                                int iE8 = c0655v32.Q[i40].e() + iE6;
                                if (wo17 == null || wo18 == null || wo3 == null || wo19 == null) {
                                    c0655v9 = c0655v34;
                                } else {
                                    if (c0655v33 == c0655v21) {
                                        iE8 = c0655v21.Q[i4].e();
                                    }
                                    if (c0655v33 == c0655v7) {
                                        iE7 = c0655v7.Q[i40].e();
                                    }
                                    int i41 = iE7;
                                    c0655v9 = c0655v34;
                                    qg.b(wo17, wo18, iE8, 0.5f, wo3, wo19, i41, z16 ? 8 : 5);
                                }
                            } else {
                                c0655v9 = c0655v34;
                            }
                            c0655v32 = c0655v33.g0 != 8 ? c0655v33 : c0655v32;
                            c0655v33 = c0655v9;
                        }
                    }
                } else {
                    C0224h7 c0224h35 = c0655v25.Q[i4];
                    int i42 = i4 + 1;
                    C0224h7 c0224h36 = c0655v20.Q[i42];
                    C0224h7 c0224h37 = c0224h35.f;
                    Wo wo20 = c0224h37 != null ? c0224h37.i : null;
                    C0224h7 c0224h38 = c0224h36.f;
                    Wo wo21 = c0224h38 != null ? c0224h38.i : null;
                    C0224h7 c0224h39 = c0655v21.Q[i4];
                    if (c0655v22 != null) {
                        c0224h36 = c0655v22.Q[i42];
                    }
                    if (wo20 == null || wo21 == null) {
                        c0655v7 = c0655v22;
                        i7 = i5;
                    } else {
                        c0655v7 = c0655v22;
                        i7 = i5;
                        qg.b(c0224h39.i, wo20, c0224h39.e(), i2 == 0 ? c0655v24.d0 : c0655v24.e0, wo21, c0224h36.i, c0224h36.e(), 7);
                    }
                }
                i8 = i7;
                if (z3) {
                    c0224h7Arr2 = c0655v21.Q;
                    C0224h7 c0224h310 = c0224h7Arr2[i4];
                    if (c0655v7 == null) {
                        c0655v10 = c0655v21;
                    } else {
                        c0655v10 = c0655v7;
                    }
                    i10 = i4 + 1;
                    C0224h7[] c0224h7Arr10 = c0655v10.Q;
                    c0224h9 = c0224h7Arr10[i10];
                    c0224h10 = c0224h310.f;
                    if (c0224h10 != null) {
                        wo4 = c0224h10.i;
                    } else {
                        wo4 = null;
                    }
                    c0224h11 = c0224h9.f;
                    if (c0224h11 != null) {
                        wo5 = c0224h11.i;
                    } else {
                        wo5 = null;
                    }
                    if (c0655v20 != c0655v10) {
                        C0224h7 c0224h311 = c0655v20.Q[i10].f;
                        wo5 = c0224h311 != null ? c0224h311.i : null;
                    }
                    if (c0655v21 == c0655v10) {
                        c0224h9 = c0224h7Arr2[i10];
                    }
                    if (wo4 == null) {
                    }
                } else {
                    c0224h7Arr2 = c0655v21.Q;
                    C0224h7 c0224h312 = c0224h7Arr2[i4];
                    if (c0655v7 == null) {
                        c0655v10 = c0655v21;
                    } else {
                        c0655v10 = c0655v7;
                    }
                    i10 = i4 + 1;
                    C0224h7[] c0224h7Arr11 = c0655v10.Q;
                    c0224h9 = c0224h7Arr11[i10];
                    c0224h10 = c0224h312.f;
                    if (c0224h10 != null) {
                        wo4 = c0224h10.i;
                    } else {
                        wo4 = null;
                    }
                    c0224h11 = c0224h9.f;
                    if (c0224h11 != null) {
                        wo5 = c0224h11.i;
                    } else {
                        wo5 = null;
                    }
                    if (c0655v20 != c0655v10) {
                        C0224h7 c0224h313 = c0655v20.Q[i10].f;
                        wo5 = c0224h313 != null ? c0224h313.i : null;
                    }
                    if (c0655v21 == c0655v10) {
                        c0224h9 = c0224h7Arr2[i10];
                    }
                    if (wo4 == null) {
                    }
                }
            } else {
                i6 = i3;
                e5Arr2 = e5Arr;
                i8 = i5;
            }
            i13 = i8 + 1;
            i12 = 2;
            c0686w8 = c0686w7;
            i3 = i6;
            e5Arr = e5Arr2;
        }
    }

    public static C0010a9[] e0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, F4.k)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iF0 = (int) f0(fileInputStream, 1);
        byte[] bArrA0 = a0(fileInputStream, (int) f0(fileInputStream, 4), (int) f0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA0);
        try {
            C0010a9[] c0010a9ArrG0 = g0(byteArrayInputStream, str, iF0);
            byteArrayInputStream.close();
            return c0010a9ArrG0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void f(Os os, C0711x1 c0711x1, AbstractC0695wg abstractC0695wg) {
        AutoCloseable autoCloseable;
        Tf.j("registry", c0711x1);
        Tf.j("lifecycle", abstractC0695wg);
        Ps ps = os.a;
        if (ps != null) {
            synchronized (ps.a) {
                autoCloseable = (AutoCloseable) ps.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    public static long f0(InputStream inputStream, int i2) throws IOException {
        byte[] bArrY = Y(inputStream, i2);
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += ((long) (bArrY[i3] & 255)) << (i3 * 8);
        }
        return j;
    }

    public static C0404n3 g() throws InterruptedException {
        C0404n3 c0404n3 = C0404n3.j;
        Tf.f(c0404n3);
        C0404n3 c0404n4 = c0404n3.f;
        if (c0404n4 == null) {
            long jNanoTime = System.nanoTime();
            C0404n3.class.wait(C0404n3.h);
            C0404n3 c0404n5 = C0404n3.j;
            Tf.f(c0404n5);
            if (c0404n5.f != null || System.nanoTime() - jNanoTime < C0404n3.i) {
                return null;
            }
            return C0404n3.j;
        }
        long jNanoTime2 = c0404n4.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C0404n3.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        C0404n3 c0404n6 = C0404n3.j;
        Tf.f(c0404n6);
        c0404n6.f = c0404n4.f;
        c0404n4.f = null;
        return c0404n4;
    }

    public static C0010a9[] g0(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0010a9[0];
        }
        C0010a9[] c0010a9Arr = new C0010a9[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iF0 = (int) f0(byteArrayInputStream, 2);
            int iF1 = (int) f0(byteArrayInputStream, 2);
            c0010a9Arr[i3] = new C0010a9(str, new String(Y(byteArrayInputStream, iF0), StandardCharsets.UTF_8), f0(byteArrayInputStream, 4), iF1, (int) f0(byteArrayInputStream, 4), (int) f0(byteArrayInputStream, 4), new int[iF1], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0010a9 c0010a9 = c0010a9Arr[i4];
            int iAvailable = byteArrayInputStream.available() - c0010a9.f;
            int iF2 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c0010a9.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iF2 += (int) f0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iF2), 1);
                for (int iF3 = (int) f0(byteArrayInputStream, 2); iF3 > 0; iF3--) {
                    f0(byteArrayInputStream, 2);
                    int iF4 = (int) f0(byteArrayInputStream, 1);
                    if (iF4 != 6 && iF4 != 7) {
                        while (iF4 > 0) {
                            f0(byteArrayInputStream, 1);
                            for (int iF5 = (int) f0(byteArrayInputStream, 1); iF5 > 0; iF5--) {
                                f0(byteArrayInputStream, 2);
                            }
                            iF4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0010a9.h = Z(byteArrayInputStream, c0010a9.e);
            int i5 = c0010a9.g;
            BitSet bitSetValueOf = BitSet.valueOf(Y(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = bitSetValueOf.get(i6) ? 2 : 0;
                if (bitSetValueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return c0010a9Arr;
    }

    public static ArrayList h(Context context) {
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        String[] stringArray = context.getResources().getStringArray(R.array.Themes);
        String[] stringArray2 = context.getResources().getStringArray(R.array.ThemeImages);
        String[] stringArray3 = context.getResources().getStringArray(R.array.ThemeTexts);
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            String str = stringArray[i2];
            Mf mfG = C0426np.g(str);
            if (mfG.b) {
                String[] strArr = {mfG.j, mfG.k, mfG.n};
                String[] strArr2 = {"SpeedBackgroundExt", "RpmBackgroundExt", "NeedleExt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < 3; i3++) {
                    if (strArr[i3] == null) {
                        C0768yr.b("T500.THEMES", "The parameter '" + strArr2[i3] + "' is not set in the theme '" + str + "'");
                    } else {
                        File file = new File(context.getFilesDir(), strArr[i3]);
                        if (!file.isFile() || !file.exists()) {
                            arrayList2.add("The resource '" + strArr[i3] + "' is not found in the theme '" + str + "', parameter '" + strArr2[i3] + "'");
                        }
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C0768yr.b("T500.THEMES", (String) it.next());
                }
                zIsEmpty = arrayList2.isEmpty();
            } else {
                zIsEmpty = true;
            }
            if (zIsEmpty) {
                arrayList.add(new Yn(stringArray[i2], context.getResources().getIdentifier(stringArray2[i2], "drawable", context.getPackageName()), stringArray3[i2]));
            }
        }
        return arrayList;
    }

    public static int h0(Context context, int i2, int i3) {
        TypedValue typedValueR = Tf.R(context, i2);
        return (typedValueR == null || typedValueR.type != 16) ? i3 : typedValueR.data;
    }

    public static TimeInterpolator i0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!H(strValueOf, "cubic-bezier") && !H(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!H(strValueOf, "cubic-bezier")) {
            if (H(strValueOf, "path")) {
                return Ck.c(F4.u(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return Ck.b(y(strArrSplit, 0), y(strArrSplit, 1), y(strArrSplit, 2), y(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static byte[] l(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static BitmapShader m(int i2) {
        int iMax = Math.max(8, (i2 / 2) * 2);
        Paint paint = (Paint) I().a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iRound = Math.round(iMax / 2.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = 0;
            while (i4 < 2) {
                if ((i3 + i4) % 2 == 0) {
                    paint.setColor(-1);
                } else {
                    paint.setColor(-3092272);
                }
                int i5 = i4 + 1;
                canvas.drawRect(i3 * iRound, i4 * iRound, (i3 + 1) * iRound, i5 * iRound, paint);
                i4 = i5;
            }
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        return new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
    }

    public static byte[] n(C0010a9[] c0010a9Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C0010a9 c0010a9 : c0010a9Arr) {
            length += ((((c0010a9.g * 2) + 7) & (-8)) / 8) + (c0010a9.e * 2) + q(c0010a9.a, c0010a9.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0010a9.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, F4.l)) {
            for (C0010a9 c0010a10 : c0010a9Arr) {
                w0(byteArrayOutputStream, c0010a10, q(c0010a10.a, c0010a10.b, bArr));
                y0(byteArrayOutputStream, c0010a10);
                int[] iArr = c0010a10.h;
                int length2 = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = iArr[i2];
                    A0(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                x0(byteArrayOutputStream, c0010a10);
            }
        } else {
            for (C0010a9 c0010a11 : c0010a9Arr) {
                w0(byteArrayOutputStream, c0010a11, q(c0010a11.a, c0010a11.b, bArr));
            }
            for (C0010a9 c0010a12 : c0010a9Arr) {
                y0(byteArrayOutputStream, c0010a12);
                int[] iArr2 = c0010a12.h;
                int length3 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length3) {
                    int i7 = iArr2[i5];
                    A0(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                x0(byteArrayOutputStream, c0010a12);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static int o(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String q(String str, String str2, byte[] bArr) {
        byte[] bArr2 = F4.n;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = F4.m;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return Vo.h(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static int r(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static void r0(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            Ls.b(viewGroup, z);
        } else if (f) {
            try {
                Ls.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public static boolean s(String str, boolean z) {
        Context contextA = AbstractC0402n1.a();
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
        if (sharedPreferences.getBoolean("useDefaultSwitchCommon", true)) {
            sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
        }
        return sharedPreferences.getBoolean(str, z);
    }

    public static K2 s0(int i2, Hb hb) {
        return new K2(new Pk(i2), hb, b);
    }

    public static ColorStateList t(Context context, K2 k2, int i2) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) k2.b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListC = F4.C(context, resourceId)) == null) ? k2.p(i2) : colorStateListC;
    }

    public static final Object[] t0(Collection collection) {
        Tf.j("collection", collection);
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                Tf.i("copyOf(result, newSize)", objArrCopyOf);
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                Tf.i("copyOf(result, size)", objArrCopyOf2);
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static ColorStateList u(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListC = F4.C(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListC;
    }

    public static final Object[] u0(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        Tf.j("collection", collection);
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Tf.g("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                Tf.i("copyOf(result, newSize)", objArrCopyOf);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                Tf.i("copyOf(result, size)", objArrCopyOf2);
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static boolean v0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0010a9[] c0010a9Arr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = F4.j;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = F4.k;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrN = n(c0010a9Arr, bArr3);
                z0(byteArrayOutputStream, c0010a9Arr.length, 1);
                z0(byteArrayOutputStream, bArrN.length, 4);
                byte[] bArrL = l(bArrN);
                z0(byteArrayOutputStream, bArrL.length, 4);
                byteArrayOutputStream.write(bArrL);
                return true;
            }
            byte[] bArr4 = F4.m;
            if (Arrays.equals(bArr, bArr4)) {
                z0(byteArrayOutputStream, c0010a9Arr.length, 1);
                for (C0010a9 c0010a9 : c0010a9Arr) {
                    int size = c0010a9.i.size() * 4;
                    String strQ = q(c0010a9.a, c0010a9.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    A0(byteArrayOutputStream, strQ.getBytes(charset).length);
                    A0(byteArrayOutputStream, c0010a9.h.length);
                    z0(byteArrayOutputStream, size, 4);
                    z0(byteArrayOutputStream, c0010a9.c, 4);
                    byteArrayOutputStream.write(strQ.getBytes(charset));
                    Iterator it = c0010a9.i.keySet().iterator();
                    while (it.hasNext()) {
                        A0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        A0(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0010a9.h) {
                        A0(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = F4.l;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrN2 = n(c0010a9Arr, bArr5);
                z0(byteArrayOutputStream, c0010a9Arr.length, 1);
                z0(byteArrayOutputStream, bArrN2.length, 4);
                byte[] bArrL2 = l(bArrN2);
                z0(byteArrayOutputStream, bArrL2.length, 4);
                byteArrayOutputStream.write(bArrL2);
                return true;
            }
            byte[] bArr6 = F4.n;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            A0(byteArrayOutputStream, c0010a9Arr.length);
            for (C0010a9 c0010a10 : c0010a9Arr) {
                String strQ2 = q(c0010a10.a, c0010a10.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                A0(byteArrayOutputStream, strQ2.getBytes(charset2).length);
                TreeMap treeMap = c0010a10.i;
                A0(byteArrayOutputStream, treeMap.size());
                A0(byteArrayOutputStream, c0010a10.h.length);
                z0(byteArrayOutputStream, c0010a10.c, 4);
                byteArrayOutputStream.write(strQ2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    A0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0010a10.h) {
                    A0(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            A0(byteArrayOutputStream2, c0010a9Arr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0010a9 c0010a11 : c0010a9Arr) {
                z0(byteArrayOutputStream2, c0010a11.c, 4);
                z0(byteArrayOutputStream2, c0010a11.d, 4);
                z0(byteArrayOutputStream2, c0010a11.g, 4);
                String strQ3 = q(c0010a11.a, c0010a11.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strQ3.getBytes(charset3).length;
                A0(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strQ3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            cu cuVar = new cu(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(cuVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0010a9Arr.length) {
                try {
                    C0010a9 c0010a12 = c0010a9Arr[i7];
                    A0(byteArrayOutputStream3, i7);
                    A0(byteArrayOutputStream3, c0010a12.e);
                    i8 = i8 + 4 + (c0010a12.e * 2);
                    int[] iArr = c0010a12.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        A0(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            cu cuVar2 = new cu(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(cuVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c0010a9Arr.length) {
                try {
                    C0010a9 c0010a13 = c0010a9Arr[i11];
                    Iterator it3 = c0010a13.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        x0(byteArrayOutputStream5, c0010a13);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            y0(byteArrayOutputStream6, c0010a13);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            A0(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            z0(byteArrayOutputStream4, length4, 4);
                            A0(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            cu cuVar3 = new cu(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(cuVar3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + ((long) (arrayList2.size() * 16));
            z0(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                cu cuVar4 = (cu) arrayList2.get(i14);
                int i15 = cuVar4.a;
                if (i15 == 1) {
                    j = 0;
                } else if (i15 == 2) {
                    j = 1;
                } else if (i15 == 3) {
                    j = 2;
                } else if (i15 == 4) {
                    j = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                z0(byteArrayOutputStream, j, 4);
                z0(byteArrayOutputStream, size2, 4);
                boolean z = cuVar4.c;
                byte[] bArr7 = cuVar4.b;
                if (z) {
                    long length5 = bArr7.length;
                    byte[] bArrL3 = l(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrL3);
                    z0(byteArrayOutputStream, bArrL3.length, 4);
                    z0(byteArrayOutputStream, length5, 4);
                    length = bArrL3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    z0(byteArrayOutputStream, bArr7.length, 4);
                    z0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static float w(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0287ja.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void w0(ByteArrayOutputStream byteArrayOutputStream, C0010a9 c0010a9, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        A0(byteArrayOutputStream, str.getBytes(charset).length);
        A0(byteArrayOutputStream, c0010a9.e);
        z0(byteArrayOutputStream, c0010a9.f, 4);
        z0(byteArrayOutputStream, c0010a9.c, 4);
        z0(byteArrayOutputStream, c0010a9.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static Drawable x(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableF;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableF = F4.F(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableF;
    }

    public static void x0(ByteArrayOutputStream byteArrayOutputStream, C0010a9 c0010a9) throws IOException {
        byte[] bArr = new byte[(((c0010a9.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0010a9.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i2 = iIntValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i3 = iIntValue + c0010a9.g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static float y(String[] strArr, int i2) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static void y0(ByteArrayOutputStream byteArrayOutputStream, C0010a9 c0010a9) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : c0010a9.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                A0(byteArrayOutputStream, iIntValue - i2);
                A0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static Z1 z(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        Z1 z1B;
        if (E(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new Z1((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                z1B = Z1.b(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                z1B = null;
            }
            if (z1B != null) {
                return z1B;
            }
        }
        return new Z1((Shader) null, (ColorStateList) null, 0);
    }

    public static void z0(ByteArrayOutputStream byteArrayOutputStream, long j, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public abstract Context C();

    public float D(View view) {
        if (g) {
            try {
                return AbstractC0184ft.a(view);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        return view.getAlpha();
    }

    public boolean F() {
        return false;
    }

    public abstract void K();

    public void M() {
    }

    public abstract View N(int i2);

    public abstract void O(int i2);

    public abstract void P(Typeface typeface);

    public abstract boolean Q();

    public abstract boolean R(int i2, KeyEvent keyEvent);

    public boolean S(KeyEvent keyEvent) {
        return false;
    }

    public boolean U() {
        return false;
    }

    public void i(int i2) {
        new Handler(Looper.getMainLooper()).post(new F9(i2, this, 3));
    }

    public boolean j() {
        return false;
    }

    public abstract void j0(boolean z);

    public abstract boolean k();

    public abstract void k0(boolean z);

    public abstract void l0(boolean z);

    public abstract void m0(String str);

    public void n0(View view, float f2) {
        if (g) {
            try {
                AbstractC0184ft.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        view.setAlpha(f2);
    }

    public void o0(View view, int i2) {
        if (!i) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            i = true;
        }
        Field field = h;
        if (field != null) {
            try {
                h.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void p(boolean z);

    public abstract void p0(CharSequence charSequence);

    public AbstractC0494q0 q0(C0096d2 c0096d2) {
        return null;
    }

    public abstract int v();
}
