package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class Td {
    public static final Object a = new Object();
    public static final C0343l4 b = new C0343l4();
    public static final int[] c = {R.attr.theme, ru.zinovin.tankspeedometer.R.attr.theme};
    public static final int[] d = {ru.zinovin.tankspeedometer.R.attr.materialThemeOverlay};
    public static final Object e = new Object();
    public static Method f;
    public static boolean g;

    public static void A(Context context, String str, String str2, boolean z) {
        context.getSharedPreferences("prefs_" + str, 0).edit().putBoolean(str2, z).apply();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
      0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String B(Context context) {
        String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int C(En en, int i) {
        int i2;
        Tf.j("$this$segment", en);
        int i3 = i + 1;
        int length = en.e.length;
        int[] iArr = en.f;
        Tf.j("$this$binarySearch", iArr);
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final void D(View view, InterfaceC0052bk interfaceC0052bk) {
        Tf.j("<this>", view);
        Tf.j("onBackPressedDispatcherOwner", interfaceC0052bk);
        view.setTag(ru.zinovin.tankspeedometer.R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0052bk);
    }

    public static void G(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void I(int i, C0377m7 c0377m7, C0655v7 c0655v7, boolean z) {
        float f2 = c0655v7.d0;
        C0224h7 c0224h7 = c0655v7.I;
        int iD = c0224h7.f.d();
        C0224h7 c0224h8 = c0655v7.K;
        int iD2 = c0224h8.f.d();
        int iE = c0224h7.e() + iD;
        int iE2 = iD2 - c0224h8.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = c0655v7.q();
        int i2 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i2 = (iD - iD2) - iQ;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + iD;
        int i4 = i3 + iQ;
        if (iD > iD2) {
            i4 = i3 - iQ;
        }
        c0655v7.J(i3, i4);
        v(i + 1, c0377m7, c0655v7, z);
    }

    public static void J(int i, C0655v7 c0655v7, C0377m7 c0377m7, C0655v7 c0655v8, boolean z) {
        float f2 = c0655v8.d0;
        C0224h7 c0224h7 = c0655v8.I;
        int iE = c0224h7.e() + c0224h7.f.d();
        C0224h7 c0224h8 = c0655v8.K;
        int iD = c0224h8.f.d() - c0224h8.e();
        if (iD >= iE) {
            int iQ = c0655v8.q();
            if (c0655v8.g0 != 8) {
                int i2 = c0655v8.r;
                if (i2 == 2) {
                    iQ = (int) (c0655v8.d0 * 0.5f * (c0655v7 instanceof C0686w7 ? c0655v7.q() : c0655v7.T.q()));
                } else if (i2 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(c0655v8.u, iQ);
                int i3 = c0655v8.v;
                if (i3 > 0) {
                    iQ = Math.min(i3, iQ);
                }
            }
            int i4 = iE + ((int) ((f2 * ((iD - iE) - iQ)) + 0.5f));
            c0655v8.J(i4, iQ + i4);
            v(i + 1, c0377m7, c0655v8, z);
        }
    }

    public static void K(int i, C0377m7 c0377m7, C0655v7 c0655v7) {
        float f2 = c0655v7.e0;
        C0224h7 c0224h7 = c0655v7.J;
        int iD = c0224h7.f.d();
        C0224h7 c0224h8 = c0655v7.L;
        int iD2 = c0224h8.f.d();
        int iE = c0224h7.e() + iD;
        int iE2 = iD2 - c0224h8.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = c0655v7.k();
        int i2 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i2 = (iD - iD2) - iK;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = iD + i3;
        int i5 = i4 + iK;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iK;
        }
        c0655v7.K(i4, i5);
        P(i + 1, c0377m7, c0655v7);
    }

    public static void L(int i, C0655v7 c0655v7, C0377m7 c0377m7, C0655v7 c0655v8) {
        float f2 = c0655v8.e0;
        C0224h7 c0224h7 = c0655v8.J;
        int iE = c0224h7.e() + c0224h7.f.d();
        C0224h7 c0224h8 = c0655v8.L;
        int iD = c0224h8.f.d() - c0224h8.e();
        if (iD >= iE) {
            int iK = c0655v8.k();
            if (c0655v8.g0 != 8) {
                int i2 = c0655v8.s;
                if (i2 == 2) {
                    iK = (int) (f2 * 0.5f * (c0655v7 instanceof C0686w7 ? c0655v7.k() : c0655v7.T.k()));
                } else if (i2 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(c0655v8.x, iK);
                int i3 = c0655v8.y;
                if (i3 > 0) {
                    iK = Math.min(i3, iK);
                }
            }
            int i4 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            c0655v8.K(i4, iK + i4);
            P(i + 1, c0377m7, c0655v8);
        }
    }

    public static Nf M(Nf nf, int i) {
        Tf.j("<this>", nf);
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            if (nf.c <= 0) {
                i = -i;
            }
            return new Nf(nf.a, nf.b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static void N(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static Pf O(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new Pf(i, i2 - 1, 1);
        }
        Pf pf = Pf.d;
        return Pf.d;
    }

    public static void P(int i, C0377m7 c0377m7, C0655v7 c0655v7) {
        C0224h7 c0224h7;
        C0224h7 c0224h8;
        C0224h7 c0224h9;
        C0224h7 c0224h10;
        C0224h7 c0224h11;
        if (c0655v7.n) {
            return;
        }
        if (!(c0655v7 instanceof C0686w7) && c0655v7.z() && c(c0655v7)) {
            C0686w7.V(c0655v7, c0377m7, new C0343l4());
        }
        C0224h7 c0224h7I = c0655v7.i(3);
        C0224h7 c0224h7I2 = c0655v7.i(5);
        int iD = c0224h7I.d();
        int iD2 = c0224h7I2.d();
        HashSet<C0224h7> hashSet = c0224h7I.a;
        if (hashSet != null && c0224h7I.c) {
            for (C0224h7 c0224h12 : hashSet) {
                C0655v7 c0655v8 = c0224h12.d;
                int i2 = i + 1;
                boolean zC = c(c0655v8);
                if (c0655v8.z() && zC) {
                    C0686w7.V(c0655v8, c0377m7, new C0343l4());
                }
                C0224h7 c0224h13 = c0655v8.J;
                C0224h7 c0224h14 = c0655v8.L;
                boolean z = (c0224h12 == c0224h13 && (c0224h11 = c0224h14.f) != null && c0224h11.c) || (c0224h12 == c0224h14 && (c0224h10 = c0224h13.f) != null && c0224h10.c);
                int i3 = c0655v8.p0[1];
                if (i3 != 3 || zC) {
                    if (!c0655v8.z()) {
                        if (c0224h12 == c0224h13 && c0224h14.f == null) {
                            int iE = c0224h13.e() + iD;
                            c0655v8.K(iE, c0655v8.k() + iE);
                            P(i2, c0377m7, c0655v8);
                        } else if (c0224h12 == c0224h14 && c0224h13.f == null) {
                            int iE2 = iD - c0224h14.e();
                            c0655v8.K(iE2 - c0655v8.k(), iE2);
                            P(i2, c0377m7, c0655v8);
                        } else if (z && !c0655v8.y()) {
                            K(i2, c0377m7, c0655v8);
                        }
                    }
                } else if (i3 == 3 && c0655v8.y >= 0 && c0655v8.x >= 0 && (c0655v8.g0 == 8 || (c0655v8.s == 0 && c0655v8.W == 0.0f))) {
                    if (!c0655v8.y() && !c0655v8.F && z && !c0655v8.y()) {
                        L(i2, c0655v7, c0377m7, c0655v8);
                    }
                }
            }
        }
        if (c0655v7 instanceof C0138ee) {
            return;
        }
        HashSet<C0224h7> hashSet2 = c0224h7I2.a;
        if (hashSet2 != null && c0224h7I2.c) {
            for (C0224h7 c0224h15 : hashSet2) {
                C0655v7 c0655v9 = c0224h15.d;
                int i4 = i + 1;
                boolean zC2 = c(c0655v9);
                if (c0655v9.z() && zC2) {
                    C0686w7.V(c0655v9, c0377m7, new C0343l4());
                }
                C0224h7 c0224h16 = c0655v9.J;
                C0224h7 c0224h17 = c0655v9.L;
                boolean z2 = (c0224h15 == c0224h16 && (c0224h9 = c0224h17.f) != null && c0224h9.c) || (c0224h15 == c0224h17 && (c0224h8 = c0224h16.f) != null && c0224h8.c);
                int i5 = c0655v9.p0[1];
                if (i5 != 3 || zC2) {
                    if (!c0655v9.z()) {
                        if (c0224h15 == c0224h16 && c0224h17.f == null) {
                            int iE3 = c0224h16.e() + iD2;
                            c0655v9.K(iE3, c0655v9.k() + iE3);
                            P(i4, c0377m7, c0655v9);
                        } else if (c0224h15 == c0224h17 && c0224h16.f == null) {
                            int iE4 = iD2 - c0224h17.e();
                            c0655v9.K(iE4 - c0655v9.k(), iE4);
                            P(i4, c0377m7, c0655v9);
                        } else if (z2 && !c0655v9.y()) {
                            K(i4, c0377m7, c0655v9);
                        }
                    }
                } else if (i5 == 3 && c0655v9.y >= 0 && c0655v9.x >= 0) {
                    if (c0655v9.g0 != 8) {
                        if (c0655v9.s == 0) {
                            if (c0655v9.W == 0.0f) {
                            }
                        }
                    }
                    if (!c0655v9.y() && !c0655v9.F && z2 && !c0655v9.y()) {
                        L(i4, c0655v7, c0377m7, c0655v9);
                    }
                }
            }
        }
        C0224h7 c0224h7I3 = c0655v7.i(6);
        if (c0224h7I3.a != null && c0224h7I3.c) {
            int iD3 = c0224h7I3.d();
            for (C0224h7 c0224h18 : c0224h7I3.a) {
                C0655v7 c0655v10 = c0224h18.d;
                int i6 = i + 1;
                boolean zC3 = c(c0655v10);
                if (c0655v10.z() && zC3) {
                    C0686w7.V(c0655v10, c0377m7, new C0343l4());
                }
                if (c0655v10.p0[1] != 3 || zC3) {
                    if (!c0655v10.z() && c0224h18 == (c0224h7 = c0655v10.M)) {
                        int iE5 = c0224h18.e() + iD3;
                        if (c0655v10.E) {
                            int i7 = iE5 - c0655v10.a0;
                            int i8 = c0655v10.V + i7;
                            c0655v10.Z = i7;
                            c0655v10.J.l(i7);
                            c0655v10.L.l(i8);
                            c0224h7.l(iE5);
                            c0655v10.l = true;
                        }
                        P(i6, c0377m7, c0655v10);
                    }
                }
            }
        }
        c0655v7.n = true;
    }

    public static Context Q(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof J7) && ((J7) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        J7 j7 = new J7(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            j7.getTheme().applyStyle(resourceId2, true);
        }
        return j7;
    }

    public static final boolean a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Tf.j("a", bArr);
        Tf.j("b", bArr2);
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static boolean c(C0655v7 c0655v7) {
        int[] iArr = c0655v7.p0;
        int i = iArr[0];
        int i2 = iArr[1];
        C0655v7 c0655v8 = c0655v7.T;
        C0686w7 c0686w7 = c0655v8 != null ? (C0686w7) c0655v8 : null;
        if (c0686w7 != null) {
            int i3 = c0686w7.p0[0];
        }
        if (c0686w7 != null) {
            int i4 = c0686w7.p0[1];
        }
        boolean z = i == 1 || c0655v7.A() || i == 2 || (i == 3 && c0655v7.r == 0 && c0655v7.W == 0.0f && c0655v7.t(0)) || (i == 3 && c0655v7.r == 1 && c0655v7.u(0, c0655v7.q()));
        boolean z2 = i2 == 1 || c0655v7.B() || i2 == 2 || (i2 == 3 && c0655v7.s == 0 && c0655v7.W == 0.0f && c0655v7.t(1)) || (i2 == 3 && c0655v7.s == 1 && c0655v7.u(1, c0655v7.k()));
        if (c0655v7.W <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static final void d(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static int e(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = N2.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerC = O2.c(context);
                iC = O2.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = O2.a(appOpsManagerC, strD, iMyUid, O2.b(context));
                }
            } else {
                iC = N2.c((AppOpsManager) N2.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static int f(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static final void g(P4 p4, Throwable th) throws IOException {
        if (p4 != null) {
            if (th == null) {
                p4.close();
                return;
            }
            try {
                p4.close();
            } catch (Throwable th2) {
                F4.d(th, th2);
            }
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static boolean j(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zK = k(file, inputStreamOpenRawResource);
                h(inputStreamOpenRawResource);
                return zK;
            } catch (Throwable th) {
                th = th;
                h(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean k(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            h(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static C0198gc l(Context context) {
        ProviderInfo providerInfo;
        H0 h0;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        Tf.h("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            h0 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                h0 = new H0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                h0 = null;
            }
        }
        if (h0 == null) {
            return null;
        }
        return new C0198gc(new C0167fc(context, h0));
    }

    public static boolean n(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = n(file2) && z;
        }
        return z;
    }

    public static C0446oe o(SSLSession sSLSession) throws IOException {
        List listL;
        List listL2 = Sa.a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        int iHashCode = cipherSuite.hashCode();
        if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        W5 w5V = W5.t.v(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        Pq pqP = Ud.p(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listL = peerCertificates != null ? Rr.l((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : listL2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listL2 = Rr.l((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new C0446oe(pqP, w5V, listL2, new C0415ne(listL, 0));
    }

    public static boolean p(String str) {
        Context contextA = AbstractC0402n1.a();
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
        if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
            sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
        }
        return sharedPreferences.getBoolean(str, false);
    }

    public static int q(ArrayList arrayList, InputStream inputStream, C0634uh c0634uh) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new Ll(inputStream, c0634uh);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                int iB = ((InterfaceC0416nf) arrayList.get(i)).b(inputStream, c0634uh);
                inputStream.reset();
                if (iB != -1) {
                    return iB;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static File s(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static ImageHeaderParser$ImageType t(List list, InputStream inputStream, C0634uh c0634uh) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new Ll(inputStream, c0634uh);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeD = ((InterfaceC0416nf) list.get(i)).d(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeD != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeD;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType u(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((InterfaceC0416nf) list.get(i)).a(byteBuffer);
                AbstractC0099d5.c(byteBuffer);
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th) {
                AbstractC0099d5.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static void v(int i, C0377m7 c0377m7, C0655v7 c0655v7, boolean z) {
        C0224h7 c0224h7;
        C0224h7 c0224h8;
        C0224h7 c0224h9;
        C0224h7 c0224h10;
        if (c0655v7.m) {
            return;
        }
        if (!(c0655v7 instanceof C0686w7) && c0655v7.z() && c(c0655v7)) {
            C0686w7.V(c0655v7, c0377m7, new C0343l4());
        }
        C0224h7 c0224h7I = c0655v7.i(2);
        C0224h7 c0224h7I2 = c0655v7.i(4);
        int iD = c0224h7I.d();
        int iD2 = c0224h7I2.d();
        HashSet<C0224h7> hashSet = c0224h7I.a;
        char c2 = 0;
        if (hashSet != null && c0224h7I.c) {
            for (C0224h7 c0224h11 : hashSet) {
                C0655v7 c0655v8 = c0224h11.d;
                int i2 = i + 1;
                boolean zC = c(c0655v8);
                if (c0655v8.z() && zC) {
                    C0686w7.V(c0655v8, c0377m7, new C0343l4());
                }
                C0224h7 c0224h12 = c0655v8.I;
                C0224h7 c0224h13 = c0655v8.K;
                char c3 = ((c0224h11 == c0224h12 && (c0224h10 = c0224h13.f) != null && c0224h10.c) || (c0224h11 == c0224h13 && (c0224h9 = c0224h12.f) != null && c0224h9.c)) ? (char) 1 : c2;
                int i3 = c0655v8.p0[c2];
                if (i3 != 3 || zC) {
                    if (!c0655v8.z()) {
                        if (c0224h11 == c0224h12 && c0224h13.f == null) {
                            int iE = c0224h12.e() + iD;
                            c0655v8.J(iE, c0655v8.q() + iE);
                            v(i2, c0377m7, c0655v8, z);
                        } else if (c0224h11 == c0224h13 && c0224h12.f == null) {
                            int iE2 = iD - c0224h13.e();
                            c0655v8.J(iE2 - c0655v8.q(), iE2);
                            v(i2, c0377m7, c0655v8, z);
                        } else if (c3 != 0 && !c0655v8.x()) {
                            I(i2, c0377m7, c0655v8, z);
                        }
                    }
                } else if (i3 == 3 && c0655v8.v >= 0 && c0655v8.u >= 0 && ((c0655v8.g0 == 8 || (c0655v8.r == 0 && c0655v8.W == 0.0f)) && !c0655v8.x() && !c0655v8.F && c3 != 0 && !c0655v8.x())) {
                    J(i2, c0655v7, c0377m7, c0655v8, z);
                }
                c2 = 0;
            }
        }
        if (c0655v7 instanceof C0138ee) {
            return;
        }
        HashSet<C0224h7> hashSet2 = c0224h7I2.a;
        if (hashSet2 != null && c0224h7I2.c) {
            for (C0224h7 c0224h14 : hashSet2) {
                C0655v7 c0655v9 = c0224h14.d;
                int i4 = i + 1;
                boolean zC2 = c(c0655v9);
                if (c0655v9.z() && zC2) {
                    C0686w7.V(c0655v9, c0377m7, new C0343l4());
                }
                C0224h7 c0224h15 = c0655v9.I;
                C0224h7 c0224h16 = c0655v9.K;
                boolean z2 = (c0224h14 == c0224h15 && (c0224h8 = c0224h16.f) != null && c0224h8.c) || (c0224h14 == c0224h16 && (c0224h7 = c0224h15.f) != null && c0224h7.c);
                int i5 = c0655v9.p0[0];
                if (i5 != 3 || zC2) {
                    if (!c0655v9.z()) {
                        if (c0224h14 == c0224h15 && c0224h16.f == null) {
                            int iE3 = c0224h15.e() + iD2;
                            c0655v9.J(iE3, c0655v9.q() + iE3);
                            v(i4, c0377m7, c0655v9, z);
                        } else if (c0224h14 == c0224h16 && c0224h15.f == null) {
                            int iE4 = iD2 - c0224h16.e();
                            c0655v9.J(iE4 - c0655v9.q(), iE4);
                            v(i4, c0377m7, c0655v9, z);
                        } else if (z2 && !c0655v9.x()) {
                            I(i4, c0377m7, c0655v9, z);
                        }
                    }
                } else if (i5 == 3 && c0655v9.v >= 0 && c0655v9.u >= 0) {
                    if (c0655v9.g0 != 8) {
                        if (c0655v9.r == 0) {
                            if (c0655v9.W == 0.0f) {
                            }
                        }
                    }
                    if (!c0655v9.x() && !c0655v9.F && z2 && !c0655v9.x()) {
                        J(i4, c0655v7, c0377m7, c0655v9, z);
                    }
                }
            }
        }
        c0655v7.m = true;
    }

    public static MappedByteBuffer w(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static void x(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e2) {
                N(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                N(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                N(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                N(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void z(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public abstract void E(boolean z);

    public abstract void F(boolean z);

    public abstract void H();

    public abstract Intent m(Context context, Object obj);

    public L r(Context context, Object obj) {
        Tf.j("context", context);
        return null;
    }

    public abstract Object y(Intent intent, int i);
}
