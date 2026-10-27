package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import defpackage.Ah;
import defpackage.C0066c3;
import defpackage.C0163f8;
import defpackage.C0166fb;
import defpackage.C0225h8;
import defpackage.C0308k0;
import defpackage.C0450oi;
import defpackage.C0473pa;
import defpackage.C0481pi;
import defpackage.C0634uh;
import defpackage.C0665vh;
import defpackage.Em;
import defpackage.Fm;
import defpackage.InterfaceC0621u4;
import defpackage.Lo;
import defpackage.Qr;
import defpackage.Td;
import defpackage.ThreadFactoryC0555s0;
import defpackage.Vd;
import defpackage.Vo;
import defpackage.Yd;
import defpackage.Zd;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a h;
    public static volatile boolean i;
    public final InterfaceC0621u4 a;
    public final Ah b;
    public final Vd c;
    public final C0634uh d;
    public final Fm e;
    public final C0225h8 f;
    public final ArrayList g = new ArrayList();

    public a(Context context, C0166fb c0166fb, Ah ah, InterfaceC0621u4 interfaceC0621u4, C0634uh c0634uh, Fm fm, C0225h8 c0225h8, C0225h8 c0225h9, C0066c3 c0066c3, List list, ArrayList arrayList, Td td, C0308k0 c0308k0) {
        this.a = interfaceC0621u4;
        this.d = c0634uh;
        this.b = ah;
        this.e = fm;
        this.f = c0225h8;
        this.c = new Vd(context, c0634uh, new Lo(this, arrayList, td), new C0225h8(27), c0225h9, c0066c3, list, c0166fb, c0308k0);
    }

    public static a a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (h == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    i = true;
                    try {
                        b(context, generatedAppGlideModule);
                        i = false;
                    } catch (Throwable th) {
                        i = false;
                        throw th;
                    }
                }
            }
        }
        return h;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C0066c3 c0066c3 = new C0066c3();
        C0163f8 c0163f8 = new C0163f8(1);
        C0225h8 c0225h8 = new C0225h8(24);
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        Td.x(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Vo.l(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Vo.l(it2.next());
                throw null;
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Vo.l(it3.next());
            throw null;
        }
        ThreadFactoryC0555s0 threadFactoryC0555s0 = new ThreadFactoryC0555s0(1);
        if (Zd.c == 0) {
            Zd.c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = Zd.c;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Zd zd = new Zd(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new Yd(threadFactoryC0555s0, "source", false)));
        ThreadFactoryC0555s0 threadFactoryC0555s1 = new ThreadFactoryC0555s0(1);
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        Zd zd2 = new Zd(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new Yd(threadFactoryC0555s1, "disk-cache", true)));
        if (Zd.c == 0) {
            Zd.c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = Zd.c >= 4 ? 2 : 1;
        ThreadFactoryC0555s0 threadFactoryC0555s2 = new ThreadFactoryC0555s0(1);
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        Zd zd3 = new Zd(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, new PriorityBlockingQueue(), new Yd(threadFactoryC0555s2, "animation", true)));
        C0450oi c0450oi = new C0450oi(applicationContext);
        C0481pi c0481pi = new C0481pi();
        Context context2 = c0450oi.a;
        ActivityManager activityManager = c0450oi.b;
        int i4 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c0481pi.c = i4;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c0450oi.c.b;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = c0450oi.d;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i5 = iRound - i4;
        int i6 = iRound3 + iRound2;
        if (i6 <= i5) {
            c0481pi.b = iRound3;
            c0481pi.a = iRound2;
        } else {
            float f3 = i5 / (f2 + 2.0f);
            c0481pi.b = Math.round(2.0f * f3);
            c0481pi.a = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context2, c0481pi.b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c0481pi.a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context2, i4));
            sb.append(", memory class limited? ");
            sb.append(i6 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context2, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
        C0225h8 c0225h9 = new C0225h8(1);
        int i7 = c0481pi.a;
        InterfaceC0621u4 c0665vh = i7 > 0 ? new C0665vh(i7) : new C0473pa(17);
        C0634uh c0634uh = new C0634uh(c0481pi.c);
        Ah ah = new Ah(c0481pi.b);
        a aVar = new a(applicationContext, new C0166fb(ah, new C0308k0(applicationContext), zd2, zd, new Zd(new ThreadPoolExecutor(0, Integer.MAX_VALUE, Zd.b, timeUnit, new SynchronousQueue(), new Yd(new ThreadFactoryC0555s0(1), "source-unlimited", false))), zd3), ah, c0665vh, c0634uh, new Fm(), c0225h9, c0225h8, c0066c3, Collections.emptyList(), arrayList, generatedAppGlideModule, new C0308k0(c0163f8));
        applicationContext.registerComponentCallbacks(aVar);
        h = aVar;
    }

    public final void c(Em em) {
        synchronized (this.g) {
            try {
                if (!this.g.contains(em)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.g.remove(em);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Qr.a();
        this.b.e(0L);
        this.a.l();
        C0634uh c0634uh = this.d;
        synchronized (c0634uh) {
            c0634uh.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        long j;
        Qr.a();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((Em) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Ah ah = this.b;
        ah.getClass();
        if (i2 >= 40) {
            ah.e(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (ah) {
                j = ah.b;
            }
            ah.e(j / 2);
        }
        this.a.e(i2);
        C0634uh c0634uh = this.d;
        synchronized (c0634uh) {
            try {
                if (i2 >= 40) {
                    synchronized (c0634uh) {
                        c0634uh.b(0);
                    }
                } else if (i2 >= 20 || i2 == 15) {
                    c0634uh.b(c0634uh.e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
