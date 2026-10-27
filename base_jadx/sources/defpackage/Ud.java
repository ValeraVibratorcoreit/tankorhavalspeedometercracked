package defpackage;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import ru.zinovin.tankspeedometer.HudActivity;
import ru.zinovin.tankspeedometer.StartActivity;
import ru.zinovin.tankspeedometer.service.InternetMonitorService;
import ru.zinovin.tankspeedometer.service.LogcatService;
import ru.zinovin.tankspeedometer.service.TboxMonitorService;
import ru.zinovin.tankspeedometer.service.YnActivatingService;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ud {
    public static final String[] a = {"morning", "day", "evening", "night"};
    public static final Q9 b = new Q9(17);
    public static final C0387mh c = new C0387mh(19);
    public static final int[] d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_focused};
    public static final int[] f = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] g = {R.attr.state_selected};

    public static int A() {
        return F(2, z());
    }

    public static ArrayList D() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"about_ru.txt", "about_en.txt", "about_ar.txt", "Gif.class", "MicroMode.class", "lala", "CheckPeriod.class", "t500_speed.png", "t500_rpm.png", "needle_tank500.png", "t300_speed.png", "t300_rpm.png", "t300_needle.png", "t300_speed_el.png", "t300_rpm_el.png", "t300_needle_el.png", "kia_speed.png", "kia_rpm.png", "kia_needle.png", "kia_speed_mini.png", "kia_rpm_mini.png", "night_needle.png", "night_central_speed.png", "night_central_rpm.png", "night_center_speed_transparent.png", "night_center_rpm_transparent.png", "night_needle_short.png"};
        for (int i = 0; i < 27; i++) {
            String str = strArr[i];
            P2 p2 = new P2();
            p2.a = str;
            p2.b = 1;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public static int F(int i, String str) {
        Context contextA = AbstractC0402n1.a();
        try {
            Class<?> cls = Class.forName("android.app.ActivityManager");
            Object objInvoke = cls.getMethod("getService", null).invoke(cls, null);
            return ((Integer) objInvoke.getClass().getMethod("getStackIdOnDisplay", String.class, Integer.TYPE).invoke(objInvoke, str, Integer.valueOf(i))).intValue();
        } catch (Exception e2) {
            Toast.makeText(contextA, "ERROR " + e2, 1).show();
            return -1;
        }
    }

    public static String G(String str) {
        return H("bg_sun_" + str + "_time", "day".equals(str) ? "06:00" : "18:00");
    }

    public static String H(String str, String str2) {
        Context contextA = AbstractC0402n1.a();
        SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
        if (sharedPreferences.getBoolean("useDefaultSwitchBack", true)) {
            sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
        }
        return sharedPreferences.getString(str, str2);
    }

    public static String I(String str) {
        String str2;
        if ("morning".equals(str)) {
            str2 = "06:00";
        } else if ("day".equals(str)) {
            str2 = "10:00";
        } else {
            str2 = "evening".equals(str) ? "18:00" : "22:00";
        }
        return H("bg_time_" + str + "_time", str2);
    }

    public static boolean J() {
        UsageStatsManager usageStatsManager = (UsageStatsManager) AbstractC0402n1.a().getSystemService("usagestats");
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<UsageStats> listQueryUsageStats = usageStatsManager.queryUsageStats(0, jCurrentTimeMillis - 1000000, jCurrentTimeMillis);
        return (listQueryUsageStats == null || listQueryUsageStats.isEmpty()) ? false : true;
    }

    public static boolean K(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static boolean L() {
        String string = (String) Lf.a().I.d();
        if (string.equals("userapp")) {
            string = AbstractC0390mk.l(AbstractC0402n1.a()).getString("naviUserPackage", "ru.yandex.yandexnavi");
        }
        return string.split("\\|").length > 1;
    }

    public static boolean N() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        AbstractC0402n1.a();
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC0402n1.a().getSystemService("connectivity");
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3))) {
            try {
                try {
                    Socket socket = new Socket();
                    try {
                        socket.connect(new InetSocketAddress("8.8.8.8", 53), 1000);
                        C0768yr.e("T500.INET", "Connection with 8.8.8.8 successfully established");
                        socket.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            socket.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    C0768yr.c("T500.ERROR", "ERROR in isInternetAvailable()", e2);
                }
            } catch (IOException unused) {
                C0768yr.b("T500.INET", "There is no connection with 8.8.8.8");
                try {
                    Socket socket2 = new Socket();
                    try {
                        socket2.connect(new InetSocketAddress("77.88.8.8", 53), 1000);
                        C0768yr.e("T500.INET", "Connection with 77.88.8.8 successfully established");
                        socket2.close();
                        return true;
                    } catch (Throwable th3) {
                        try {
                            socket2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (IOException unused2) {
                    C0768yr.b("T500.INET", "There is no connection with 77.88.8.8");
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean O(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static List R(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Tf.i("singletonList(element)", listSingletonList);
        return listSingletonList;
    }

    public static int S(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static void T() {
        Context contextA = AbstractC0402n1.a();
        try {
            AbstractC0402n1.a().getPackageManager().getPackageInfo("ru.zinovin.navimanager", 0);
            Intent launchIntentForPackage = contextA.getPackageManager().getLaunchIntentForPackage("ru.zinovin.navimanager");
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(335544320);
                try {
                    PendingIntent.getActivity(contextA, 0, launchIntentForPackage, 134217728).send();
                } catch (PendingIntent.CanceledException e2) {
                    Toast.makeText(contextA, "ERROR " + e2, 1).show();
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static Typeface U(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, Td.f(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static int V(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static C0569se W(String... strArr) throws CloneNotSupportedException {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        String[] strArr2 = (String[]) objClone;
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            String str = strArr2[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null".toString());
            }
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            strArr2[i] = Mp.W0(str).toString();
        }
        Nf nfM = Td.M(Td.O(0, strArr2.length), 2);
        int i2 = nfM.a;
        int i3 = nfM.b;
        int i4 = nfM.c;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                j(str2);
                m(str3, str2);
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        return new C0569se(strArr2);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x006a A[EDGE_INSN: B:116:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x0189  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191  */
    /* JADX WARN: Code duplicated, block: B:83:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x019d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    public static C0160f5 Z(C0569se c0569se) {
        int i;
        int i2;
        int length;
        int length2;
        int i3;
        String string;
        boolean z;
        String string2;
        int i4;
        C0569se c0569se2 = c0569se;
        Tf.j("headers", c0569se2);
        int size = c0569se.size();
        int i5 = 0;
        boolean z2 = true;
        String str = null;
        boolean z3 = false;
        boolean z4 = false;
        int iX = -1;
        int iX2 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int iX3 = -1;
        int iX4 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i5 < size) {
            String strB = c0569se2.b(i5);
            String strD = c0569se2.d(i5);
            if (Mp.F0(strB, "Cache-Control")) {
                if (str == null) {
                    str = strD;
                }
                i2 = 0;
                while (i2 < strD.length()) {
                    length = strD.length();
                    length2 = i2;
                    while (true) {
                        if (length2 < length) {
                            i3 = size;
                            length2 = strD.length();
                            break;
                        }
                        i3 = size;
                        if (Mp.C0("=,;", strD.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i3;
                    }
                    String strSubstring = strD.substring(i2, length2);
                    Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring);
                    string = Mp.W0(strSubstring).toString();
                    if (length2 != strD.length() || strD.charAt(length2) == ',' || strD.charAt(length2) == ';') {
                        z = z2;
                        i2 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = Rr.a;
                        int length4 = strD.length();
                        while (true) {
                            if (length3 >= length4) {
                                i4 = 1;
                                length3 = strD.length();
                                break;
                            }
                            char cCharAt = strD.charAt(length3);
                            int i6 = length4;
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                i4 = 1;
                                break;
                            }
                            length3++;
                            length4 = i6;
                        }
                        if (length3 < strD.length()) {
                            z = z2;
                            if (strD.charAt(length3) == '\"') {
                                int i7 = length3 + i4;
                                int iI0 = Mp.I0(strD, '\"', i7, false, 4);
                                string2 = strD.substring(i7, iI0);
                                Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", string2);
                                i2 = iI0 + 1;
                            }
                        } else {
                            z = z2;
                        }
                        int length5 = strD.length();
                        int length6 = length3;
                        while (true) {
                            if (length6 >= length5) {
                                length6 = strD.length();
                                break;
                            }
                            int i8 = length5;
                            if (Mp.C0(",;", strD.charAt(length6))) {
                                break;
                            }
                            length6++;
                            length5 = i8;
                        }
                        String strSubstring2 = strD.substring(length3, length6);
                        Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring2);
                        string2 = Mp.W0(strSubstring2).toString();
                        i2 = length6;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iX = Rr.x(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iX2 = Rr.x(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iX3 = Rr.x(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iX4 = Rr.x(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z9 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z10 = true;
                    }
                    size = i3;
                    z2 = z;
                }
                i = size;
                i5++;
                c0569se2 = c0569se;
                size = i;
            } else {
                if (!Mp.F0(strB, "Pragma")) {
                    i = size;
                }
                i5++;
                c0569se2 = c0569se;
                size = i;
            }
            z2 = false;
            i2 = 0;
            while (i2 < strD.length()) {
                length = strD.length();
                length2 = i2;
                while (true) {
                    if (length2 < length) {
                        i3 = size;
                        length2 = strD.length();
                        break;
                    }
                    i3 = size;
                    if (Mp.C0("=,;", strD.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i3;
                }
                String strSubstring3 = strD.substring(i2, length2);
                Tf.i("(this as java.lang.Strin…ing(startIndex, endIndex)", strSubstring3);
                string = Mp.W0(strSubstring3).toString();
                if (length2 != strD.length()) {
                    z = z2;
                    i2 = length2 + 1;
                    string2 = null;
                } else {
                    z = z2;
                    i2 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iX = Rr.x(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iX2 = Rr.x(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iX3 = Rr.x(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iX4 = Rr.x(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z9 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z10 = true;
                }
                size = i3;
                z2 = z;
            }
            i = size;
            i5++;
            c0569se2 = c0569se;
            size = i;
        }
        return new C0160f5(z3, z4, iX, iX2, z5, z6, z7, iX3, iX4, z8, z9, z10, !z2 ? null : str);
    }

    public static final void a(AbstractC0273iq abstractC0273iq, C0303jq c0303jq, String str) {
        C0334kq.i.fine(c0303jq.f + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC0273iq.c);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean b(int i, Rect rect, Rect rect2, Rect rect3) {
        int iS;
        int i2;
        int i3;
        boolean zC = c(i, rect, rect2);
        if (c(i, rect, rect3) || !zC) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i != 17 && i != 66) {
                            iS = S(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iS < Math.max(1, i2 - i3)) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i != 17) {
                        iS = S(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iS < Math.max(1, i2 - i3)) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i != 17) {
                    iS = S(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iS < Math.max(1, i2 - i3)) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i != 17) {
                iS = S(i, rect, rect2);
                if (i != 17) {
                    i2 = rect.left;
                    i3 = rect3.left;
                } else if (i != 33) {
                    i2 = rect.top;
                    i3 = rect3.top;
                } else if (i != 66) {
                    i2 = rect3.right;
                    i3 = rect.right;
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = rect3.bottom;
                    i3 = rect.bottom;
                }
                if (iS < Math.max(1, i2 - i3)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void c0(int i, int i2) {
        Context contextA = AbstractC0402n1.a();
        if (i > 0) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityManager");
                Object objInvoke = cls.getMethod("getService", null).invoke(cls, null);
                Class<?> cls2 = objInvoke.getClass();
                Class cls3 = Integer.TYPE;
                cls2.getMethod("removeStackOnDisplay", cls3, cls3).invoke(objInvoke, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (Exception e2) {
                Toast.makeText(contextA, "ERROR " + e2, 1).show();
            }
        }
    }

    public static File d0(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                File file = new File(externalFilesDir, str);
                if (file.exists()) {
                    return file;
                }
            }
            File file2 = new File(context.getFilesDir(), str);
            if (file2.exists()) {
                return file2;
            }
        }
        return null;
    }

    public static void e0() {
        Context contextA = AbstractC0402n1.a();
        Intent intent = new Intent();
        intent.setAction("ru.zinovin.tankspeedometer.T500_IP_STOP");
        contextA.sendBroadcast(intent);
        Intent intent2 = new Intent();
        intent2.setAction("ru.zinovin.tankspeedometer.T500_HUD_STOP");
        contextA.sendBroadcast(intent2);
    }

    public static final void f0(View view, InterfaceC0733xn interfaceC0733xn) {
        Tf.j("<this>", view);
        view.setTag(ru.zinovin.tankspeedometer.R.id.view_tree_saved_state_registry_owner, interfaceC0733xn);
    }

    public static void g0(Drawable drawable, int i) {
        O9.g(drawable, i);
    }

    public static void h0(Drawable drawable, ColorStateList colorStateList) {
        O9.h(drawable, colorStateList);
    }

    public static void i(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i0(Drawable drawable, PorterDuff.Mode mode) {
        O9.i(drawable, mode);
    }

    public static void j(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty".toString());
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || '~' < cCharAt) {
                throw new IllegalArgumentException(Rr.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static boolean j0(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static void k(Object obj) {
        l("Argument must not be null", obj);
    }

    public static void l(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void l0(boolean z) {
        AbstractC0402n1.a();
        String string = AbstractC0390mk.l(AbstractC0402n1.a()).getString("ipType", "1");
        boolean zP = Td.p("naviFullscreen");
        boolean z2 = string.equals("3") && Td.p("useNavi");
        Context contextA = AbstractC0402n1.a();
        Intent intent = new Intent(contextA, (Class<?>) StartActivity.class);
        intent.putExtra("ipType", string);
        intent.putExtra("useNavi", z2);
        intent.putExtra("naviFullscreen", zP);
        intent.putExtra("musicAutoPlay", z);
        intent.addFlags(335544320);
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        try {
            ActivityOptions.class.getMethod("setLaunchWindowingMode", Integer.TYPE).invoke(activityOptionsMakeBasic, 6);
        } catch (Exception e2) {
            Toast.makeText(contextA, "ERROR " + e2, 1).show();
            C0768yr.c("T500.ERROR", "ERROR in startApp()", e2);
        }
        activityOptionsMakeBasic.setLaunchDisplayId(2);
        contextA.startActivity(intent, activityOptionsMakeBasic.toBundle());
        if (z2) {
            n0(zP);
        }
        if (AbstractC0390mk.l(AbstractC0402n1.a()).getBoolean("useHud", false)) {
            new Handler().postDelayed(new E0(0), 100L);
        }
    }

    public static void m(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || '~' < cCharAt)) {
                throw new IllegalArgumentException(Rr.i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str).toString());
            }
        }
    }

    public static void m0() {
        Context contextA = AbstractC0402n1.a();
        if (((DisplayManager) contextA.getSystemService("display")).getDisplays().length <= 3) {
            C0768yr.e("T500.UTILS", "There is no HUD");
            return;
        }
        Intent intent = new Intent(contextA, (Class<?>) HudActivity.class);
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        intent.addFlags(335613952);
        try {
            ActivityOptions.class.getMethod("setLaunchWindowingMode", Integer.TYPE).invoke(activityOptionsMakeBasic, 6);
        } catch (Exception e2) {
            Toast.makeText(contextA, "ERROR " + e2, 1).show();
            C0768yr.c("T500.ERROR", "ERROR in startHudActivity()", e2);
        }
        activityOptionsMakeBasic.setLaunchDisplayId(3);
        contextA.startActivity(intent, activityOptionsMakeBasic.toBundle());
    }

    public static C0652v4 n(InterfaceC0621u4 interfaceC0621u4, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC0244hr.b;
                    lock.lock();
                    Bitmap bitmapJ = interfaceC0621u4.j(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapJ);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapJ;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
                z = true;
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC0621u4 = b;
        }
        return C0652v4.b(interfaceC0621u4, bitmap);
    }

    public static void n0(boolean z) {
        Context contextA = AbstractC0402n1.a();
        if (Td.p("useSysNavi")) {
            return;
        }
        new Handler().postDelayed(new F0(contextA, z), Integer.parseInt(AbstractC0390mk.l(contextA).getString("naviStartDelay", "500")));
    }

    public static C0577sm o(a aVar, List list) {
        Mm u4;
        Mm c0467p4;
        InterfaceC0621u4 interfaceC0621u4 = aVar.a;
        Vd vd = aVar.c;
        Context applicationContext = vd.getApplicationContext();
        C0308k0 c0308k0 = vd.h;
        C0577sm c0577sm = new C0577sm();
        C0718x8 c0718x8 = new C0718x8();
        Ya ya = c0577sm.g;
        synchronized (ya) {
            ya.a.add(c0718x8);
        }
        int i = Build.VERSION.SDK_INT;
        Cb cb = new Cb();
        Ya ya2 = c0577sm.g;
        synchronized (ya2) {
            ya2.a.add(cb);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = c0577sm.e();
        C0634uh c0634uh = aVar.d;
        Y4 y4 = new Y4(applicationContext, arrayListE, interfaceC0621u4, c0634uh);
        C0460os c0460os = new C0460os(interfaceC0621u4, new C0429ns());
        N9 n9 = new N9(c0577sm.e(), resources.getDisplayMetrics(), interfaceC0621u4, c0634uh);
        if (((Map) c0308k0.b).containsKey(Td.class)) {
            c0467p4 = new V4(1);
            u4 = new V4(0);
        } else {
            u4 = new U4(n9, 0);
            c0467p4 = new C0467p4(n9, 2, c0634uh);
        }
        int i2 = 1;
        C0187g1 c0187g1 = new C0187g1(new C0096d2(arrayListE, i2, c0634uh), i2);
        Class<InputStream> cls = InputStream.class;
        c0577sm.d("Animation", InputStream.class, Drawable.class, c0187g1);
        c0577sm.d("Animation", ByteBuffer.class, Drawable.class, new C0187g1(new C0096d2(arrayListE, 1, c0634uh), 0));
        Pm pm = new Pm(applicationContext);
        C0528r4 c0528r4 = new C0528r4(c0634uh);
        Q0 q0 = new Q0();
        C0225h8 c0225h8 = new C0225h8(22);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c0577sm.a(ByteBuffer.class, new C0473pa(22));
        c0577sm.a(InputStream.class, new Vi(c0634uh));
        c0577sm.d("Bitmap", ByteBuffer.class, Bitmap.class, u4);
        c0577sm.d("Bitmap", InputStream.class, Bitmap.class, c0467p4);
        String str = Build.FINGERPRINT;
        boolean z = !"robolectric".equals(str);
        Class<ParcelFileDescriptor> cls2 = ParcelFileDescriptor.class;
        if (z) {
            c0577sm.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new U4(n9, 1));
        }
        c0577sm.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C0460os(interfaceC0621u4, new C0387mh(28)));
        c0577sm.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c0460os);
        C0473pa c0473pa = C0473pa.n;
        c0577sm.c(Bitmap.class, Bitmap.class, c0473pa);
        c0577sm.d("Bitmap", Bitmap.class, Bitmap.class, new Sb(1));
        c0577sm.b(Bitmap.class, c0528r4);
        c0577sm.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0467p4(resources, u4));
        c0577sm.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0467p4(resources, c0467p4));
        c0577sm.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0467p4(resources, c0460os));
        c0577sm.b(BitmapDrawable.class, new C0096d2(interfaceC0621u4, 5, c0528r4));
        c0577sm.d("Animation", InputStream.class, Id.class, new C0797zp(arrayListE, y4, c0634uh));
        c0577sm.d("Animation", ByteBuffer.class, Id.class, y4);
        c0577sm.b(Id.class, new C0225h8(23));
        c0577sm.c(C0580sp.class, C0580sp.class, c0473pa);
        c0577sm.d("Bitmap", C0580sp.class, Bitmap.class, new C0559s4(interfaceC0621u4));
        c0577sm.d("legacy_append", Uri.class, Drawable.class, pm);
        c0577sm.d("legacy_append", Uri.class, Bitmap.class, new C0467p4(pm, 1, interfaceC0621u4));
        c0577sm.h(new Z4(0));
        c0577sm.c(File.class, ByteBuffer.class, new C0473pa(23));
        c0577sm.c(File.class, InputStream.class, new Ub(new C0225h8(18)));
        c0577sm.d("legacy_append", File.class, File.class, new Sb(0));
        c0577sm.c(File.class, ParcelFileDescriptor.class, new Ub(new C0225h8(17)));
        c0577sm.c(File.class, File.class, c0473pa);
        c0577sm.h(new Ef(c0634uh));
        if (!"robolectric".equals(str)) {
            c0577sm.h(new Z4(2));
        }
        S3 s3 = new S3(applicationContext, 3);
        S3 s4 = new S3(applicationContext, 1);
        S3 s5 = new S3(applicationContext, 2);
        Class cls3 = Integer.TYPE;
        c0577sm.c(cls3, InputStream.class, s3);
        c0577sm.c(Integer.class, InputStream.class, s3);
        c0577sm.c(cls3, AssetFileDescriptor.class, s4);
        c0577sm.c(Integer.class, AssetFileDescriptor.class, s4);
        c0577sm.c(cls3, Drawable.class, s5);
        c0577sm.c(Integer.class, Drawable.class, s5);
        c0577sm.c(Uri.class, InputStream.class, new S3(applicationContext, 9));
        c0577sm.c(Uri.class, AssetFileDescriptor.class, new S3(applicationContext, 8));
        C0498q4 c0498q4 = new C0498q4(resources, 3);
        C0498q4 c0498q5 = new C0498q4(resources, 1);
        C0498q4 c0498q6 = new C0498q4(resources, 2);
        c0577sm.c(Integer.class, Uri.class, c0498q4);
        c0577sm.c(cls3, Uri.class, c0498q4);
        c0577sm.c(Integer.class, AssetFileDescriptor.class, c0498q5);
        c0577sm.c(cls3, AssetFileDescriptor.class, c0498q5);
        c0577sm.c(Integer.class, InputStream.class, c0498q6);
        c0577sm.c(cls3, InputStream.class, c0498q6);
        c0577sm.c(String.class, InputStream.class, new C0308k0(9));
        c0577sm.c(Uri.class, InputStream.class, new C0308k0(9));
        c0577sm.c(String.class, InputStream.class, new C0387mh(18));
        c0577sm.c(String.class, ParcelFileDescriptor.class, new C0387mh(17));
        c0577sm.c(String.class, AssetFileDescriptor.class, new C0387mh(16));
        c0577sm.c(Uri.class, InputStream.class, new C0251i3(applicationContext.getAssets(), 1));
        c0577sm.c(Uri.class, AssetFileDescriptor.class, new C0251i3(applicationContext.getAssets(), 0));
        c0577sm.c(Uri.class, InputStream.class, new S3(applicationContext, 6));
        c0577sm.c(Uri.class, InputStream.class, new S3(applicationContext, 7));
        if (i >= 29) {
            c0577sm.c(Uri.class, InputStream.class, new C0298jl(applicationContext, cls));
            c0577sm.c(Uri.class, ParcelFileDescriptor.class, new C0298jl(applicationContext, cls2));
        }
        c0577sm.c(Uri.class, InputStream.class, new Eq(contentResolver, 4));
        c0577sm.c(Uri.class, ParcelFileDescriptor.class, new Eq(contentResolver, 3));
        c0577sm.c(Uri.class, AssetFileDescriptor.class, new Eq(contentResolver, 2));
        c0577sm.c(Uri.class, InputStream.class, new C0387mh(26));
        c0577sm.c(URL.class, InputStream.class, new C0387mh(25));
        c0577sm.c(Uri.class, File.class, new S3(applicationContext, 5));
        c0577sm.c(C0046be.class, InputStream.class, new C0308k0(19));
        c0577sm.c(byte[].class, ByteBuffer.class, new C0473pa(19));
        c0577sm.c(byte[].class, InputStream.class, new C0473pa(21));
        c0577sm.c(Uri.class, Uri.class, c0473pa);
        c0577sm.c(Drawable.class, Drawable.class, c0473pa);
        c0577sm.d("legacy_append", Drawable.class, Drawable.class, new Sb(2));
        c0577sm.i(Bitmap.class, BitmapDrawable.class, new C0498q4(resources, 0));
        c0577sm.i(Bitmap.class, byte[].class, q0);
        c0577sm.i(Drawable.class, byte[].class, new K2(interfaceC0621u4, q0, c0225h8, 9));
        c0577sm.i(Id.class, byte[].class, c0225h8);
        C0460os c0460os2 = new C0460os(interfaceC0621u4, new C0387mh(29));
        c0577sm.d("legacy_append", ByteBuffer.class, Bitmap.class, c0460os2);
        c0577sm.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0467p4(resources, c0460os2));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return c0577sm;
        }
        Vo.l(it.next());
        throw null;
    }

    public static void o0() {
        C0768yr.e("T500.UTILS", "stopAndStart()");
        Lf lfA = Lf.a();
        lfA.I.f(AbstractC0390mk.l(AbstractC0402n1.a()).getString("naviPackage", "ru.yandex.yandexnavi"));
        e0();
        p0(true);
        l0(false);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pq p(String str) {
        Tf.j("javaName", str);
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return Pq.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return Pq.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return Pq.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return Pq.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return Pq.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static void p0(boolean z) {
        boolean z2;
        C0768yr.e("T500.UTILS", "stopNavi(). allDisplays=" + z);
        int iF = F(2, z());
        if (iF != -1) {
            C0768yr.e("T500.UTILS", "stopYnService() called");
            Context contextA = AbstractC0402n1.a();
            Intent intent = new Intent(contextA, (Class<?>) YnActivatingService.class);
            intent.setAction("ACTION_STOP_SERVICE");
            contextA.startService(intent);
            z2 = true;
        } else {
            z2 = false;
        }
        C0768yr.e("T500.UTILS", "display=2, navi stackid=" + iF);
        c0(iF, 2);
        int iF2 = F(0, z());
        if (z) {
            C0768yr.e("T500.UTILS", "display=0, navi stackid=" + iF2);
            c0(iF2, 0);
            z2 = true;
        }
        boolean z3 = iF2 == -1 ? z2 : false;
        Context contextA2 = AbstractC0402n1.a();
        Intent intent2 = new Intent();
        intent2.setAction("ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER_VISIBILITY");
        intent2.putExtra("visibility", !z3);
        contextA2.sendBroadcast(intent2, "ru.zinovin.tankspeedometer.NAVI_GUIDANCE_PERMISSION");
    }

    public static final String q(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static void q0() {
        Context contextA = AbstractC0402n1.a();
        C0768yr.e("T500.UTILS", "stopLogcatService() called");
        Context contextA2 = AbstractC0402n1.a();
        Intent intent = new Intent(contextA2, (Class<?>) LogcatService.class);
        intent.setAction("ACTION_STOP_SERVICE");
        contextA2.startService(intent);
        Intent intent2 = new Intent(contextA, (Class<?>) InternetMonitorService.class);
        intent2.setAction("ACTION_STOP_SERVICE");
        contextA.startService(intent2);
        C0768yr.e("T500.UTILS", "stopYnService() called");
        Context contextA3 = AbstractC0402n1.a();
        Intent intent3 = new Intent(contextA3, (Class<?>) YnActivatingService.class);
        intent3.setAction("ACTION_STOP_SERVICE");
        contextA3.startService(intent3);
        C0768yr.e("T500.UTILS", "stopTboxService() called");
        Context contextA4 = AbstractC0402n1.a();
        Intent intent4 = new Intent(contextA4, (Class<?>) TboxMonitorService.class);
        intent4.setAction("ACTION_STOP_SERVICE");
        contextA4.startService(intent4);
    }

    public static int r(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC0747y6.d(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static String u(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return str.concat(".json");
        }
        return str.substring(0, iLastIndexOf) + ".json";
    }

    public static Bq v(Dg dg) {
        Context contextA = AbstractC0402n1.a();
        boolean zS = Br.s("transparentBackgroundInCenter", false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C0613tr(contextA, dg));
        int i = ru.zinovin.tankspeedometer.R.drawable.center_panel_default;
        float f2 = 48.0f;
        arrayList3.add(new V(contextA, dg, f2, zS ? ru.zinovin.tankspeedometer.R.drawable.transparent_background : ru.zinovin.tankspeedometer.R.drawable.center_panel_default, 2));
        arrayList3.add(new V(contextA, dg, f2, zS ? ru.zinovin.tankspeedometer.R.drawable.transparent_background : ru.zinovin.tankspeedometer.R.drawable.center_panel_default, 1));
        arrayList3.add(new V(contextA, dg, f2, zS ? ru.zinovin.tankspeedometer.R.drawable.transparent_background : ru.zinovin.tankspeedometer.R.drawable.center_panel_default, 0));
        if (zS) {
            i = ru.zinovin.tankspeedometer.R.drawable.transparent_background;
        }
        arrayList3.add(new Oq(contextA, dg, ru.zinovin.tankspeedometer.R.layout.tires_big_fragment, i));
        K2 k2 = new K2(16, false);
        k2.b = new ArrayList(arrayList);
        k2.c = new ArrayList(arrayList2);
        k2.d = new ArrayList(arrayList3);
        return new Bq(k2, k2);
    }

    public static Bq w(Dg dg) {
        Context contextA = AbstractC0402n1.a();
        boolean zS = Br.s("transparentBackgroundInCenter", false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C0613tr(contextA, dg));
        int i = ru.zinovin.tankspeedometer.R.drawable.center_panel_default;
        arrayList3.add(new C0675vr(contextA, dg, 48.0f, zS ? ru.zinovin.tankspeedometer.R.drawable.transparent_background : ru.zinovin.tankspeedometer.R.drawable.center_panel_default));
        if (zS) {
            i = ru.zinovin.tankspeedometer.R.drawable.transparent_background;
        }
        arrayList3.add(new Oq(contextA, dg, ru.zinovin.tankspeedometer.R.layout.tires_big_fragment, i));
        K2 k2 = new K2(16, false);
        k2.b = new ArrayList(arrayList);
        k2.c = new ArrayList(arrayList2);
        k2.d = new ArrayList(arrayList3);
        return new Bq(k2, k2);
    }

    public static String z() {
        String string = (String) Lf.a().I.d();
        C0768yr.e("T500.UTILS", "getNaviPackage()=" + string);
        if (string.equals("userapp")) {
            string = AbstractC0390mk.l(AbstractC0402n1.a()).getString("naviUserPackage", "ru.yandex.yandexnavi");
        }
        String[] strArrSplit = string.split("\\|");
        return (strArrSplit.length >= 2 ? strArrSplit[1].trim() : strArrSplit[0].trim()).split("/")[0].trim();
    }

    public abstract int B(View view);

    public abstract int C(CoordinatorLayout coordinatorLayout);

    public abstract int E();

    public abstract boolean M(float f2);

    public abstract boolean P(View view);

    public abstract boolean Q(float f2, float f3);

    public abstract void X(Throwable th);

    public abstract void Y(C0296jj c0296jj);

    public abstract void a0(C0616u c0616u, C0616u c0616u2);

    public abstract void b0(C0616u c0616u, Thread thread);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i);

    public abstract boolean f(AbstractFutureC0647v abstractFutureC0647v, r rVar);

    public abstract boolean g(AbstractFutureC0647v abstractFutureC0647v, Object obj, Object obj2);

    public abstract boolean h(AbstractFutureC0647v abstractFutureC0647v, C0616u c0616u, C0616u c0616u2);

    public abstract boolean k0(View view, float f2);

    public abstract void r0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int s();

    public abstract int t();

    public abstract int x();

    public abstract int y();
}
