package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class F4 implements Qs {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = new int[0];
    public static final Object[] h = new Object[0];
    public static final D3 i = new D3(2);
    public static final byte[] j = {48, 49, 53, 0};
    public static final byte[] k = {48, 49, 48, 0};
    public static final byte[] l = {48, 48, 57, 0};
    public static final byte[] m = {48, 48, 53, 0};
    public static final byte[] n = {48, 48, 49, 0};
    public static final byte[] o = {48, 48, 49, 0};
    public static final byte[] p = {48, 48, 50, 0};
    public static final C0429ns q = new C0429ns();

    public F4() {
        new ConcurrentHashMap();
    }

    public static EnumC0268il A(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return EnumC0268il.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC0268il.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC0268il.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC0268il.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC0268il.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC0268il.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static C0308k0 B() {
        C0308k0 c0308k0E = E();
        Mf mf = (Mf) c0308k0E.b;
        mf.g = ru.zinovin.tankspeedometer.R.drawable.audi3_speed;
        mf.h = ru.zinovin.tankspeedometer.R.drawable.audi3_rpm;
        mf.i = ru.zinovin.tankspeedometer.R.drawable.needle_audi3;
        return c0308k0E;
    }

    public static ColorStateList C(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        Xm xm;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        Ym ym = new Ym(resources, theme);
        synchronized (AbstractC0024an.c) {
            try {
                SparseArray sparseArray = (SparseArray) AbstractC0024an.b.get(ym);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (xm = (Xm) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (xm.b.equals(resources.getConfiguration())) {
                        if (theme != null || xm.c != 0) {
                            if (theme == null || xm.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = xm.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = AbstractC0024an.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = AbstractC0716x6.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return Wm.b(resources, i2, theme);
        }
        synchronized (AbstractC0024an.c) {
            try {
                WeakHashMap weakHashMap = AbstractC0024an.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(ym);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(ym, sparseArray2);
                }
                sparseArray2.append(i2, new Xm(colorStateListA, ym.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static C0308k0 E() {
        C0308k0 c0308k0 = new C0308k0(23);
        Mf mf = (Mf) c0308k0.b;
        mf.a = "speedometer_default";
        mf.p = 240.0f;
        mf.q = -135;
        mf.r = 135;
        mf.t = "km/h";
        mf.u = 8.0f;
        mf.v = -135;
        mf.w = 135;
        mf.y = "rpmx1000";
        mf.d = ru.zinovin.tankspeedometer.R.drawable.standard_background;
        mf.e = ru.zinovin.tankspeedometer.R.drawable.digital_background_navi_full;
        mf.f = ru.zinovin.tankspeedometer.R.drawable.standard_background;
        mf.c = false;
        mf.getClass();
        mf.z = true;
        mf.B = -1;
        mf.C = -7829368;
        mf.A = "speedometer_default_micro";
        return c0308k0;
    }

    public static Drawable F(Context context, int i2) {
        return Tm.c().e(context, i2);
    }

    public static Q0 G(Context context, H0 h0) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) h0.b;
        int i2 = 0;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) h0.c;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        D3 d3 = i;
        Collections.sort(arrayList, d3);
        List listQ = (List) h0.e;
        if (listQ == null) {
            listQ = Tf.Q(resources, 0);
        }
        int i3 = 0;
        loop1: while (true) {
            cursorQuery = null;
            if (i3 >= listQ.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listQ.get(i3));
            Collections.sort(arrayList2, d3);
            if (arrayList.size() == arrayList2.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                        break;
                    }
                    i4++;
                }
            }
            i3++;
        }
        int i5 = 1;
        if (providerInfoResolveContentProvider == null) {
            return new Q0(i5, cursorQuery);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) h0.d};
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e2) {
                    Log.w("FontsProvider", "Unable to query the content provider", e2);
                }
            }
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new C0506qc(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            return new Q0(i2, (C0506qc[]) arrayList3.toArray(new C0506qc[0]));
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }

    public static C0308k0 H() {
        C0308k0 c0308k0E = E();
        Mf mf = (Mf) c0308k0E.b;
        mf.b = true;
        mf.j = "kia_speed_mini.png";
        mf.k = "kia_rpm_mini.png";
        mf.n = "kia_needle.png";
        mf.p = 220.0f;
        mf.q = -124;
        mf.r = 124;
        mf.t = "km/h";
        mf.v = -124;
        mf.w = 124;
        mf.y = "x1000rpm";
        mf.c = true;
        return c0308k0E;
    }

    public static C0308k0 I() {
        C0308k0 c0308k0E = E();
        Mf mf = (Mf) c0308k0E.b;
        mf.a = "speedometer_kia_big";
        mf.b = true;
        mf.j = "kia_speed.png";
        mf.k = "kia_rpm.png";
        mf.n = "kia_needle.png";
        mf.p = 220.0f;
        mf.q = -124;
        mf.r = 124;
        mf.t = "km/h";
        mf.v = -124;
        mf.w = 124;
        mf.y = "x1000rpm";
        mf.d = ru.zinovin.tankspeedometer.R.drawable.kia_background;
        mf.e = ru.zinovin.tankspeedometer.R.drawable.kia_background_navi_full;
        mf.f = ru.zinovin.tankspeedometer.R.drawable.kia_background_navi_window;
        mf.c = true;
        mf.z = false;
        return c0308k0E;
    }

    public static double[] J(Context context) {
        Location lastKnownLocation;
        Location lastKnownLocation2;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                boolean z = j(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
                boolean z2 = j(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
                if (z && (lastKnownLocation2 = locationManager.getLastKnownLocation("gps")) != null) {
                    return new double[]{lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude()};
                }
                if ((z || z2) && (lastKnownLocation = locationManager.getLastKnownLocation("network")) != null) {
                    return new double[]{lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude()};
                }
            }
        } catch (SecurityException e2) {
            C0768yr.c("T500.Sunrise", "Location permission denied", e2);
        } catch (Exception e3) {
            C0768yr.c("T500.Sunrise", "Error getting location", e3);
        }
        return new double[]{55.7558d, 37.6173d};
    }

    public static C0308k0 K() {
        C0308k0 c0308k0E = E();
        Mf mf = (Mf) c0308k0E.b;
        mf.a = "speedometer_night_central";
        mf.b = true;
        mf.d = ru.zinovin.tankspeedometer.R.drawable.night_center_background_navi_window;
        mf.e = ru.zinovin.tankspeedometer.R.drawable.night_center_background_navi_window;
        mf.f = ru.zinovin.tankspeedometer.R.drawable.night_center_background_navi_window;
        mf.j = "night_central_speed.png";
        mf.k = "night_central_rpm.png";
        mf.l = "night_center_speed_transparent.png";
        mf.m = "night_center_rpm_transparent.png";
        mf.n = "night_needle.png";
        mf.o = "night_needle_short.png";
        mf.p = 220.0f;
        mf.q = -124;
        mf.r = 124;
        mf.v = -124;
        mf.w = 124;
        mf.z = false;
        return c0308k0E;
    }

    public static Intent L(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strN = N(activity, activity.getComponentName());
            if (strN == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, strN);
            try {
                return N(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strN + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent M(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strN = N(context, componentName);
        if (strN == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strN);
        return N(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String N(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static String O() {
        String strH = Ud.H("bgMode", "static");
        if (!"time".equals(strH)) {
            if (!"sun".equals(strH)) {
                return Ud.H("selectedBackground", "BUILD_IN_NONE");
            }
            String str = new SimpleDateFormat("HH:mm", Locale.US).format(new Date());
            return (str.compareTo(Ud.G("day")) < 0 || str.compareTo(Ud.G("night")) >= 0) ? Ud.H("bg_sun_night_img", "BUILD_IN_NONE") : Ud.H("bg_sun_day_img", "BUILD_IN_NONE");
        }
        String str2 = new SimpleDateFormat("HH:mm", Locale.US).format(new Date());
        for (int i2 = 3; i2 >= 0; i2--) {
            String[] strArr = Ud.a;
            if (str2.compareTo(Ud.I(strArr[i2])) >= 0) {
                return Ud.H("bg_time_" + strArr[i2] + "_img", "BUILD_IN_NONE");
            }
        }
        return Ud.H("bg_time_night_img", "BUILD_IN_NONE");
    }

    public static C0308k0 P() {
        C0308k0 c0308k0E = E();
        Mf mf = (Mf) c0308k0E.b;
        mf.a = "speedometer_t300_el";
        mf.b = true;
        mf.j = "t300_speed_el.png";
        mf.k = "t300_rpm_el.png";
        mf.n = "t300_needle_el.png";
        mf.q = -131;
        mf.r = 134;
        mf.s = ru.zinovin.tankspeedometer.R.drawable.t300_speed_el_bottom;
        mf.v = -131;
        mf.w = 134;
        mf.x = ru.zinovin.tankspeedometer.R.drawable.t300_rpm_el_bottom;
        mf.c = true;
        return c0308k0E;
    }

    public static C0308k0 Q() {
        C0308k0 c0308k0E = E();
        Mf mf = (Mf) c0308k0E.b;
        mf.a = "speedometer_t300";
        mf.b = true;
        mf.j = "t300_speed.png";
        mf.k = "t300_rpm.png";
        mf.n = "t300_needle.png";
        mf.q = -132;
        mf.r = 133;
        mf.v = -132;
        mf.w = 133;
        mf.c = true;
        return c0308k0E;
    }

    public static C0308k0 R() {
        C0308k0 c0308k0E = E();
        Mf mf = (Mf) c0308k0E.b;
        mf.a = "speedometer_t500";
        mf.b = true;
        mf.j = "t500_speed.png";
        mf.k = "t500_rpm.png";
        mf.n = "needle_tank500.png";
        mf.q = -115;
        mf.r = 115;
        mf.v = -107;
        mf.w = 107;
        mf.c = true;
        return c0308k0E;
    }

    public static boolean S(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean T() {
        return G4.d;
    }

    public static String U(String str) {
        try {
            try {
                return OffsetDateTime.parse(str).atZoneSameInstant(ZoneId.systemDefault()).toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm"));
            } catch (Exception unused) {
                return (str == null || str.length() < 16) ? "06:00" : str.substring(11, 16);
            }
        } catch (Exception unused2) {
            return LocalTime.ofInstant(Instant.parse(str), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm"));
        }
    }

    public static void V(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        O9.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void W(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                throw new IllegalArgumentException(Vo.h(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = strArr[i5];
                    i4++;
                }
            }
        }
        if (activity instanceof InterfaceC0710x0) {
            ((InterfaceC0710x0) activity).getClass();
        }
        AbstractC0617u0.b(activity, strArr, i2);
    }

    public static final void X(View view, Dg dg) {
        Tf.j("<this>", view);
        view.setTag(ru.zinovin.tankspeedometer.R.id.view_tree_lifecycle_owner, dg);
    }

    public static void Y(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0770yt.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void Z(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = Gs.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static void a0(View view, C0204gi c0204gi) {
        C0565sa c0565sa = c0204gi.a.b;
        if (c0565sa == null || !c0565sa.a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = Gs.a;
            fI += AbstractC0676vs.i((View) parent);
        }
        C0173fi c0173fi = c0204gi.a;
        if (c0173fi.m != fI) {
            c0173fi.m = fI;
            c0204gi.o();
        }
    }

    public static Context b0(Context context, String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    public static boolean c0(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static void d(Throwable th, Throwable th2) {
        Tf.j("<this>", th);
        Tf.j("exception", th2);
        if (th != th2) {
            Jk.a.a(th, th2);
        }
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                O9.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                O9.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                O9.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int f(int i2, int i3, int[] iArr) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static int g(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static boolean h(Dk[] dkArr, Dk[] dkArr2) {
        if (dkArr == null || dkArr2 == null || dkArr.length != dkArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < dkArr.length; i2++) {
            Dk dk = dkArr[i2];
            char c2 = dk.a;
            Dk dk2 = dkArr2[i2];
            if (c2 != dk2.a || dk.b.length != dk2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static void i(int i2) {
        Pf pf = new Pf(2, 36, 1);
        if (2 > i2 || i2 > pf.b) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new Pf(2, 36, 1));
        }
    }

    public static int j(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return Gj.a(new Hj(context).a) ? 0 : -1;
    }

    public static int k(C0269im c0269im, AbstractC0658va abstractC0658va, View view, View view2, Wl wl, boolean z) {
        if (wl.v() == 0 || c0269im.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(Wl.H(view) - Wl.H(view2)) + 1;
        }
        return Math.min(abstractC0658va.l(), abstractC0658va.b(view2) - abstractC0658va.e(view));
    }

    public static int l(C0269im c0269im, AbstractC0658va abstractC0658va, View view, View view2, Wl wl, boolean z, boolean z2) {
        if (wl.v() == 0 || c0269im.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0269im.b() - Math.max(Wl.H(view), Wl.H(view2))) - 1) : Math.max(0, Math.min(Wl.H(view), Wl.H(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0658va.b(view2) - abstractC0658va.e(view)) / (Math.abs(Wl.H(view) - Wl.H(view2)) + 1))) + (abstractC0658va.k() - abstractC0658va.e(view)));
        }
        return iMax;
    }

    public static int m(C0269im c0269im, AbstractC0658va abstractC0658va, View view, View view2, Wl wl, boolean z) {
        if (wl.v() == 0 || c0269im.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0269im.b();
        }
        return (int) (((abstractC0658va.b(view2) - abstractC0658va.e(view)) / (Math.abs(Wl.H(view) - Wl.H(view2)) + 1)) * c0269im.b());
    }

    public static ImageView.ScaleType n(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 != 5) {
            return i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static float[] o(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static F4 p(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new U7();
        }
        return new C0147en();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    public static Dk[] t(String str) {
        int i2;
        String strTrim;
        float[] fArrO;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i4, i5).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArrO = new float[i3];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i6 = i3;
                                    int i7 = 1;
                                    while (i7 < length) {
                                        int i8 = i3;
                                        int i9 = i8;
                                        int i10 = i9;
                                        int i11 = i10;
                                        for (int i12 = i7; i12 < strTrim.length(); i12++) {
                                            char cCharAt2 = strTrim.charAt(i12);
                                            if (cCharAt2 == ' ') {
                                                i8 = 0;
                                                i10 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i8 = 0;
                                                        i10 = 1;
                                                        break;
                                                    case '-':
                                                        if (i12 == i7 || i8 != 0) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i9 == 0) {
                                                            i8 = 0;
                                                            i9 = 1;
                                                        } else {
                                                            i8 = 0;
                                                            i10 = 1;
                                                            i11 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                            } else {
                                                i8 = 1;
                                            }
                                            if (i10 != 0) {
                                                if (i7 < i12) {
                                                    fArr[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                                    i6++;
                                                }
                                                if (i11 != 0) {
                                                    i7 = i12;
                                                } else {
                                                    i7 = i12 + 1;
                                                }
                                                i3 = 0;
                                            }
                                        }
                                        if (i7 < i12) {
                                            fArr[i6] = Float.parseFloat(strTrim.substring(i7, i12));
                                            i6++;
                                        }
                                        if (i11 != 0) {
                                            i7 = i12;
                                        } else {
                                            i7 = i12 + 1;
                                        }
                                        i3 = 0;
                                    }
                                    fArrO = o(fArr, i6);
                                    i3 = 0;
                                } catch (NumberFormatException e2) {
                                    throw new RuntimeException(Vo.g("error in parsing \"", strTrim, "\""), e2);
                                }
                            }
                            arrayList.add(new Dk(strTrim.charAt(i3), fArrO));
                        }
                        i4 = i5;
                        i5++;
                        i3 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i5++;
            }
            strTrim = str.substring(i4, i5).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    fArrO = new float[i3];
                } else {
                    fArrO = new float[i3];
                }
                arrayList.add(new Dk(strTrim.charAt(i3), fArrO));
            }
            i4 = i5;
            i5++;
            i3 = 0;
        }
        if (i5 - i4 != 1 || i4 >= str.length()) {
            i2 = 0;
        } else {
            i2 = 0;
            arrayList.add(new Dk(str.charAt(i4), new float[0]));
        }
        return (Dk[]) arrayList.toArray(new Dk[i2]);
    }

    public static Path u(String str) {
        Path path = new Path();
        try {
            Dk.b(t(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static Dk[] v(Dk[] dkArr) {
        Dk[] dkArr2 = new Dk[dkArr.length];
        for (int i2 = 0; i2 < dkArr.length; i2++) {
            dkArr2[i2] = new Dk(dkArr[i2]);
        }
        return dkArr2;
    }

    public static final boolean w(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean x(Context context, SharedPreferences sharedPreferences) {
        Jl jl;
        try {
            double[] dArrJ = J(context);
            double d2 = dArrJ[0];
            double d3 = dArrJ[1];
            C0768yr.e("T500.Sunrise", "Fetching sunrise/sunset for lat=" + d2 + " lng=" + d3);
            Locale locale = Locale.US;
            Oj oj = new Oj();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Tf.j("unit", timeUnit);
            oj.r = Rr.b(10L, timeUnit);
            oj.s = Rr.b(10L, timeUnit);
            Pj pj = new Pj(oj);
            H0 h0 = new H0();
            h0.q("https://api.sunrise-sunset.org/json?lat=" + d2 + "&lng=" + d3 + "&formatted=0");
            C0117dn c0117dnC = new Dl(pj, h0.a()).c();
            try {
                if (c0117dnC.w() && (jl = c0117dnC.g) != null) {
                    JSONObject jSONObject = new JSONObject(jl.y());
                    if ("OK".equals(jSONObject.optString("status"))) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("results");
                        String string = jSONObject2.getString("sunrise");
                        String string2 = jSONObject2.getString("sunset");
                        String strU = U(string);
                        String strU2 = U(string2);
                        C0768yr.e("T500.Sunrise", "Sunrise: " + strU + " Sunset: " + strU2);
                        sharedPreferences.edit().putString("bg_sun_day_time", strU).putString("bg_sun_night_time", strU2).apply();
                        c0117dnC.close();
                        return true;
                    }
                    C0768yr.b("T500.Sunrise", "API error: " + jSONObject.optString("status"));
                }
                c0117dnC.close();
            } catch (Throwable th) {
                try {
                    c0117dnC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            C0768yr.c("T500.Sunrise", "Error fetching sunrise/sunset", e2);
        }
        return false;
    }

    public static C0584st z(C0655v7 c0655v7, int i2, ArrayList arrayList, C0584st c0584st) {
        int i3;
        int i4 = i2 == 0 ? c0655v7.n0 : c0655v7.o0;
        if (i4 != -1 && (c0584st == null || i4 != c0584st.b)) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                C0584st c0584st2 = (C0584st) arrayList.get(i5);
                if (c0584st2.b == i4) {
                    if (c0584st != null) {
                        c0584st.c(i2, c0584st2);
                        arrayList.remove(c0584st);
                    }
                    c0584st = c0584st2;
                    break;
                }
            }
        } else if (i4 != -1) {
            return c0584st;
        }
        if (c0584st == null) {
            if (c0655v7 instanceof AbstractC0662ve) {
                AbstractC0662ve abstractC0662ve = (AbstractC0662ve) c0655v7;
                int i6 = 0;
                while (true) {
                    if (i6 >= abstractC0662ve.r0) {
                        i3 = -1;
                        break;
                    }
                    C0655v7 c0655v8 = abstractC0662ve.q0[i6];
                    if ((i2 == 0 && (i3 = c0655v8.n0) != -1) || (i2 == 1 && (i3 = c0655v8.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        C0584st c0584st3 = (C0584st) arrayList.get(i7);
                        if (c0584st3.b == i3) {
                            c0584st = c0584st3;
                            break;
                        }
                    }
                }
            }
            if (c0584st == null) {
                c0584st = new C0584st();
                c0584st.a = new ArrayList();
                c0584st.d = null;
                c0584st.e = -1;
                int i8 = C0584st.f;
                C0584st.f = i8 + 1;
                c0584st.b = i8;
                c0584st.c = i2;
            }
            arrayList.add(c0584st);
        }
        ArrayList arrayList2 = c0584st.a;
        if (!arrayList2.contains(c0655v7)) {
            arrayList2.add(c0655v7);
            if (c0655v7 instanceof C0138ee) {
                C0138ee c0138ee = (C0138ee) c0655v7;
                c0138ee.t0.c(c0138ee.u0 == 0 ? 1 : 0, c0584st, arrayList);
            }
            int i9 = c0584st.b;
            if (i2 == 0) {
                c0655v7.n0 = i9;
                c0655v7.I.c(i2, c0584st, arrayList);
                c0655v7.K.c(i2, c0584st, arrayList);
            } else {
                c0655v7.o0 = i9;
                c0655v7.J.c(i2, c0584st, arrayList);
                c0655v7.M.c(i2, c0584st, arrayList);
                c0655v7.L.c(i2, c0584st, arrayList);
            }
            c0655v7.P.c(i2, c0584st, arrayList);
        }
        return c0584st;
    }

    public abstract void D(C0796zo c0796zo, float f2, float f3);

    public abstract Typeface q(Context context, C0413nc c0413nc, Resources resources, int i2);

    public abstract Typeface r(Context context, C0506qc[] c0506qcArr, int i2);

    public Typeface s(Context context, Resources resources, int i2, String str, int i3) {
        File fileS = Td.s(context);
        if (fileS == null) {
            return null;
        }
        try {
            if (Td.j(fileS, resources, i2)) {
                return Typeface.createFromFile(fileS.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileS.delete();
        }
    }

    public C0506qc y(C0506qc[] c0506qcArr, int i2) {
        C0387mh c0387mh = new C0387mh(24);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        C0506qc c0506qc = null;
        int i4 = Integer.MAX_VALUE;
        for (C0506qc c0506qc2 : c0506qcArr) {
            int iAbs = (Math.abs(c0387mh.k(c0506qc2) - i3) * 2) + (c0387mh.m(c0506qc2) == z ? 0 : 1);
            if (c0506qc == null || i4 > iAbs) {
                c0506qc = c0506qc2;
                i4 = iAbs;
            }
        }
        return c0506qc;
    }
}
