package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Dr extends F4 {
    public static Method A = null;
    public static Method B = null;
    public static boolean C = false;
    public static Class y;
    public static Constructor z;
    public final Class r;
    public final Constructor s;
    public final Method t;
    public final Method u;
    public final Method v;
    public final Method w;
    public final Method x;

    public Dr() throws NoSuchMethodException {
        Method methodN0;
        Constructor<?> constructor;
        Method methodM0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM0 = m0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodN0 = n0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodN0 = null;
            constructor = null;
            methodM0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.r = cls;
        this.s = constructor;
        this.t = methodM0;
        this.u = method;
        this.v = method2;
        this.w = method3;
        this.x = methodN0;
    }

    public static boolean f0(int i, String str, Object obj, boolean z2) throws NoSuchMethodException {
        j0();
        try {
            return ((Boolean) A.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void j0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (C) {
            return;
        }
        C = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        z = constructor;
        y = cls;
        A = method2;
        B = method;
    }

    public static Method m0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void d0(Object obj) {
        try {
            this.w.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean e0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.t.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Typeface g0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.r, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.x.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public final Typeface h0(Context context, C0413nc c0413nc, Resources resources, int i) throws NoSuchMethodException {
        j0();
        try {
            Object objNewInstance = z.newInstance(null);
            for (C0444oc c0444oc : c0413nc.a) {
                File fileS = Td.s(context);
                if (fileS == null) {
                    return null;
                }
                try {
                    if (!Td.j(fileS, resources, c0444oc.f)) {
                        return null;
                    }
                    if (!f0(c0444oc.b, fileS.getPath(), objNewInstance, c0444oc.c)) {
                        return null;
                    }
                    fileS.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileS.delete();
                }
            }
            j0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) y, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) B.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean i0(Object obj) {
        try {
            return ((Boolean) this.v.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean k0() {
        Method method = this.t;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object l0() {
        try {
            return this.s.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Method n0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.F4
    public final Typeface q(Context context, C0413nc c0413nc, Resources resources, int i) {
        if (!k0()) {
            return h0(context, c0413nc, resources, i);
        }
        Object objL0 = l0();
        if (objL0 == null) {
            return null;
        }
        for (C0444oc c0444oc : c0413nc.a) {
            if (!e0(context, objL0, c0444oc.a, c0444oc.e, c0444oc.b, c0444oc.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0444oc.d))) {
                d0(objL0);
                return null;
            }
        }
        if (i0(objL0)) {
            return g0(objL0);
        }
        return null;
    }

    @Override // defpackage.F4
    public final Typeface r(Context context, C0506qc[] c0506qcArr, int i) {
        Typeface typefaceG0;
        boolean zBooleanValue;
        if (c0506qcArr.length < 1) {
            return null;
        }
        if (!k0()) {
            C0506qc c0506qcY = y(c0506qcArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0506qcY.a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0506qcY.c).setItalic(c0506qcY.d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C0506qc c0506qc : c0506qcArr) {
            if (c0506qc.e == 0) {
                Uri uri = c0506qc.a;
                if (!map.containsKey(uri)) {
                    map.put(uri, Td.w(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objL0 = l0();
        if (objL0 == null) {
            return null;
        }
        int length = c0506qcArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            C0506qc c0506qc2 = c0506qcArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0506qc2.a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.u.invoke(objL0, byteBuffer, Integer.valueOf(c0506qc2.b), null, Integer.valueOf(c0506qc2.c), Integer.valueOf(c0506qc2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    d0(objL0);
                    return null;
                }
                z2 = true;
            }
            i2++;
            z2 = z2;
        }
        if (!z2) {
            d0(objL0);
            return null;
        }
        if (i0(objL0) && (typefaceG0 = g0(objL0)) != null) {
            return Typeface.create(typefaceG0, i);
        }
        return null;
    }

    @Override // defpackage.F4
    public final Typeface s(Context context, Resources resources, int i, String str, int i2) {
        if (!k0()) {
            return super.s(context, resources, i, str, i2);
        }
        Object objL0 = l0();
        if (objL0 == null) {
            return null;
        }
        if (!e0(context, objL0, str, 0, -1, -1, null)) {
            d0(objL0);
            return null;
        }
        if (i0(objL0)) {
            return g0(objL0);
        }
        return null;
    }
}
