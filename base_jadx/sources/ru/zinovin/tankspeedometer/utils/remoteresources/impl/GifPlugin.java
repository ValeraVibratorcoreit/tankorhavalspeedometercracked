package ru.zinovin.tankspeedometer.utils.remoteresources.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.a;
import defpackage.AbstractC0402n1;
import defpackage.AbstractC0763ym;
import defpackage.B5;
import defpackage.C0033b1;
import defpackage.C0590t4;
import defpackage.C0794zm;
import defpackage.C5;
import defpackage.Em;
import defpackage.Gm;
import defpackage.InterfaceC0171fg;
import defpackage.InterfaceC0212gq;
import defpackage.K0;
import defpackage.L9;
import defpackage.Lj;
import defpackage.Qr;
import defpackage.T2;
import defpackage.Ud;
import defpackage.Z3;
import defpackage.Zb;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin;

/* JADX INFO: loaded from: classes.dex */
public class GifPlugin implements RemotePlugin {
    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final Object execute(String str, Object[] objArr) {
        Z3 z3G;
        InterfaceC0212gq c0590t4;
        PackageInfo packageInfo;
        Context contextA = AbstractC0402n1.a();
        boolean zEndsWith = ((String) objArr[0]).toLowerCase().endsWith(".gif");
        ImageView imageView = (ImageView) objArr[1];
        Drawable drawable = (Drawable) objArr[2];
        Uri uri = (Uri) objArr[3];
        if (zEndsWith) {
            Gm gm = (Gm) new Gm().p(new K0(contextA, drawable), true);
            Ud.l("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", contextA);
            Em emB = a.a(contextA).e.b(contextA);
            emB.getClass();
            C0794zm c0794zm = new C0794zm(emB.a, emB, Drawable.class, emB.b);
            C0794zm c0794zmX = c0794zm.x(uri);
            if (uri != null && "android.resource".equals(uri.getScheme())) {
                Context context = c0794zm.A;
                C0794zm c0794zm2 = (C0794zm) c0794zmX.o(context.getTheme());
                ConcurrentHashMap concurrentHashMap = T2.a;
                String packageName = context.getPackageName();
                ConcurrentHashMap concurrentHashMap2 = T2.a;
                InterfaceC0171fg interfaceC0171fg = (InterfaceC0171fg) concurrentHashMap2.get(packageName);
                if (interfaceC0171fg == null) {
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                        packageInfo = null;
                    }
                    Lj lj = new Lj(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
                    interfaceC0171fg = (InterfaceC0171fg) concurrentHashMap2.putIfAbsent(packageName, lj);
                    if (interfaceC0171fg == null) {
                        interfaceC0171fg = lj;
                    }
                }
                c0794zmX = (C0794zm) c0794zm2.m(new C0033b1(context.getResources().getConfiguration().uiMode & 48, interfaceC0171fg));
            }
            C0794zm c0794zmA = c0794zmX.a(gm);
            c0794zmA.getClass();
            Qr.a();
            Ud.k(imageView);
            if (!Z3.f(c0794zmA.a, 2048) && c0794zmA.n && imageView.getScaleType() != null) {
                switch (AbstractC0763ym.a[imageView.getScaleType().ordinal()]) {
                    case 1:
                        z3G = c0794zmA.clone().g(L9.d, new B5());
                        break;
                    case 2:
                        z3G = c0794zmA.clone().g(L9.c, new C5());
                        z3G.y = true;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        z3G = c0794zmA.clone().g(L9.b, new Zb());
                        z3G.y = true;
                        break;
                    case 6:
                        z3G = c0794zmA.clone().g(L9.c, new C5());
                        z3G.y = true;
                        break;
                    default:
                        z3G = c0794zmA;
                        break;
                }
            } else {
                z3G = c0794zmA;
            }
            c0794zmA.D.c.getClass();
            Class cls = c0794zmA.C;
            if (Bitmap.class.equals(cls)) {
                c0590t4 = new C0590t4(imageView, 0);
            } else {
                if (!Drawable.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                }
                c0590t4 = new C0590t4(imageView, 1);
            }
            c0794zmA.w(c0590t4, z3G);
        }
        return Boolean.valueOf(zEndsWith);
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getName() {
        return "GifPlugin";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getVersion() {
        return "1.0";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final void initialize(Context context) {
    }
}
