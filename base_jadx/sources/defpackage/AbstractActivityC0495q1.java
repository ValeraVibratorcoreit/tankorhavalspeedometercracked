package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0495q1 extends P6 implements InterfaceC0618u1, InterfaceC0710x0 {
    public boolean u;
    public boolean v;
    public R1 x;
    public final C0308k0 s = new C0308k0(new Bc(this), 17);
    public final Fg t = new Fg(this);
    public boolean w = true;

    public AbstractActivityC0495q1() {
        ((C0711x1) this.d.d).f("android:support:lifecycle", new G6(this, 1));
        final int i = 0;
        g(new InterfaceC0748y7(this) { // from class: Ac
            public final /* synthetic */ AbstractActivityC0495q1 b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0748y7
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.b.s.y();
                        break;
                    default:
                        this.b.s.y();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.k.add(new InterfaceC0748y7(this) { // from class: Ac
            public final /* synthetic */ AbstractActivityC0495q1 b;

            {
                this.b = this;
            }

            @Override // defpackage.InterfaceC0748y7
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.s.y();
                        break;
                    default:
                        this.b.s.y();
                        break;
                }
            }
        });
        h(new H6(this, 1));
        ((C0711x1) this.d.d).f("androidx:appcompat", new C0433o1(this));
        h(new C0464p1(this));
    }

    public static boolean x(Oc oc) {
        EnumC0633ug enumC0633ug = EnumC0633ug.c;
        boolean zX = false;
        for (AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc : oc.c.r()) {
            if (abstractComponentCallbacksC0784zc != null) {
                Bc bc = abstractComponentCallbacksC0784zc.s;
                if ((bc == null ? null : bc.n) != null) {
                    zX |= x(abstractComponentCallbacksC0784zc.g());
                }
                C0014ad c0014ad = abstractComponentCallbacksC0784zc.N;
                EnumC0633ug enumC0633ug2 = EnumC0633ug.d;
                if (c0014ad != null) {
                    c0014ad.e();
                    if (c0014ad.c.c.compareTo(enumC0633ug2) >= 0) {
                        abstractComponentCallbacksC0784zc.N.c.g(enumC0633ug);
                        zX = true;
                    }
                }
                if (abstractComponentCallbacksC0784zc.M.c.compareTo(enumC0633ug2) >= 0) {
                    abstractComponentCallbacksC0784zc.M.g(enumC0633ug);
                    zX = true;
                }
            }
        }
        return zX;
    }

    public final void A() {
        super.onPostResume();
        this.t.e(EnumC0602tg.ON_RESUME);
        Oc oc = ((Bc) this.s.b).m;
        oc.E = false;
        oc.F = false;
        oc.L.g = false;
        oc.t(7);
    }

    public final void B() {
        C0308k0 c0308k0 = this.s;
        c0308k0.y();
        super.onStart();
        this.w = false;
        boolean z = this.u;
        Bc bc = (Bc) c0308k0.b;
        if (!z) {
            this.u = true;
            Oc oc = bc.m;
            oc.E = false;
            oc.F = false;
            oc.L.g = false;
            oc.t(4);
        }
        bc.m.y(true);
        this.t.e(EnumC0602tg.ON_START);
        Oc oc2 = bc.m;
        oc2.E = false;
        oc2.F = false;
        oc2.L.g = false;
        oc2.t(5);
    }

    public final void C() {
        super.onStop();
        this.w = true;
        while (x(v())) {
        }
        Oc oc = ((Bc) this.s.b).m;
        oc.F = true;
        oc.L.g = true;
        oc.t(4);
        this.t.e(EnumC0602tg.ON_STOP);
    }

    public final void D(MaterialToolbar materialToolbar) {
        R1 r1 = (R1) t();
        if (r1.j instanceof Activity) {
            r1.A();
            Br br = r1.o;
            if (br instanceof Bt) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            r1.p = null;
            if (br != null) {
                br.M();
            }
            r1.o = null;
            if (materialToolbar != null) {
                Object obj = r1.j;
                Yq yq = new Yq(materialToolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : r1.q, r1.m);
                r1.o = yq;
                r1.m.b = yq.l;
                materialToolbar.setBackInvokedCallbackEnabled(true);
            } else {
                r1.m.b = null;
            }
            r1.b();
        }
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        R1 r1 = (R1) t();
        r1.w();
        ((ViewGroup) r1.B.findViewById(R.id.content)).addView(view, layoutParams);
        r1.m.a(r1.l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01de  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:136:0x020d A[Catch: all -> 0x0201, TRY_LEAVE, TryCatch #0 {, blocks: (B:127:0x01ef, B:129:0x01f3, B:135:0x020b, B:136:0x020d, B:138:0x0211, B:144:0x0221, B:143:0x0218, B:134:0x0204), top: B:154:0x01ef, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0175  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        J7 j7;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41 = 0;
        R1 r1 = (R1) t();
        r1.P = true;
        int i42 = r1.T;
        if (i42 == -100) {
            i42 = E1.b;
        }
        int iC = r1.C(context, i42);
        if (E1.c(context) && E1.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (E1.i) {
                    try {
                        C0325kh c0325kh = E1.c;
                        if (c0325kh == null) {
                            if (E1.d == null) {
                                E1.d = C0325kh.a(Td.B(context));
                            }
                            if (!E1.d.a.a.isEmpty()) {
                                E1.c = E1.d;
                            }
                        } else if (!c0325kh.equals(E1.d)) {
                            C0325kh c0325kh2 = E1.c;
                            E1.d = c0325kh2;
                            Td.z(context, c0325kh2.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!E1.f) {
                E1.a.execute(new RunnableC0742y1(context, i41));
            }
        }
        C0325kh c0325khP = R1.p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(R1.t(context, iC, c0325khP, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof J7) {
                    try {
                        ((J7) context).a(R1.t(context, iC, c0325khP, null, false));
                    } catch (IllegalStateException unused2) {
                        if (R1.k0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    J1.a(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    i25 = configuration.colorMode & 3;
                                    i26 = configuration2.colorMode & 3;
                                    if (i25 != i26) {
                                        configuration3.colorMode |= i26;
                                    }
                                    i27 = configuration.colorMode & 12;
                                    i28 = configuration2.colorMode & 12;
                                    if (i27 != i28) {
                                        configuration3.colorMode |= i28;
                                    }
                                    i29 = configuration.uiMode & 15;
                                    i30 = configuration2.uiMode & 15;
                                    if (i29 != i30) {
                                        configuration3.uiMode |= i30;
                                    }
                                    i31 = configuration.uiMode & 48;
                                    i32 = configuration2.uiMode & 48;
                                    if (i31 != i32) {
                                        configuration3.uiMode |= i32;
                                    }
                                    i33 = configuration.screenWidthDp;
                                    i34 = configuration2.screenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.screenWidthDp = i34;
                                    }
                                    i35 = configuration.screenHeightDp;
                                    i36 = configuration2.screenHeightDp;
                                    if (i35 != i36) {
                                        configuration3.screenHeightDp = i36;
                                    }
                                    i37 = configuration.smallestScreenWidthDp;
                                    i38 = configuration2.smallestScreenWidthDp;
                                    if (i37 != i38) {
                                        configuration3.smallestScreenWidthDp = i38;
                                    }
                                    i39 = configuration.densityDpi;
                                    i40 = configuration2.densityDpi;
                                    if (i39 != i40) {
                                        configuration3.densityDpi = i40;
                                    }
                                }
                            }
                            Configuration configurationT = R1.t(context, iC, c0325khP, configuration3, true);
                            j7 = new J7(context, ru.zinovin.tankspeedometer.R.style.Theme_AppCompat_Empty);
                            j7.a(configurationT);
                            try {
                                if (context.getTheme() != null) {
                                    theme = j7.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        Zm.a(theme);
                                    } else {
                                        synchronized (Td.e) {
                                            if (Td.g) {
                                                method = Td.f;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    Td.f = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                                }
                                                Td.g = true;
                                                method = Td.f;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                                        Td.f = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = j7;
                        }
                    }
                } else if (R1.k0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            J1.a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            i25 = configuration.colorMode & 3;
                            i26 = configuration2.colorMode & 3;
                            if (i25 != i26) {
                                configuration3.colorMode |= i26;
                            }
                            i27 = configuration.colorMode & 12;
                            i28 = configuration2.colorMode & 12;
                            if (i27 != i28) {
                                configuration3.colorMode |= i28;
                            }
                            i29 = configuration.uiMode & 15;
                            i30 = configuration2.uiMode & 15;
                            if (i29 != i30) {
                                configuration3.uiMode |= i30;
                            }
                            i31 = configuration.uiMode & 48;
                            i32 = configuration2.uiMode & 48;
                            if (i31 != i32) {
                                configuration3.uiMode |= i32;
                            }
                            i33 = configuration.screenWidthDp;
                            i34 = configuration2.screenWidthDp;
                            if (i33 != i34) {
                                configuration3.screenWidthDp = i34;
                            }
                            i35 = configuration.screenHeightDp;
                            i36 = configuration2.screenHeightDp;
                            if (i35 != i36) {
                                configuration3.screenHeightDp = i36;
                            }
                            i37 = configuration.smallestScreenWidthDp;
                            i38 = configuration2.smallestScreenWidthDp;
                            if (i37 != i38) {
                                configuration3.smallestScreenWidthDp = i38;
                            }
                            i39 = configuration.densityDpi;
                            i40 = configuration2.densityDpi;
                            if (i39 != i40) {
                                configuration3.densityDpi = i40;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationT2 = R1.t(context, iC, c0325khP, configuration3, true);
                    j7 = new J7(context, ru.zinovin.tankspeedometer.R.style.Theme_AppCompat_Empty);
                    j7.a(configurationT2);
                    if (context.getTheme() != null) {
                        theme = j7.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            Zm.a(theme);
                        } else {
                            synchronized (Td.e) {
                                if (Td.g) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    Td.f = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    Td.g = true;
                                    method = Td.f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = Td.f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = j7;
                }
            }
        } else if (context instanceof J7) {
            ((J7) context).a(R1.t(context, iC, c0325khP, null, false));
        } else if (R1.k0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    J1.a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    i25 = configuration.colorMode & 3;
                    i26 = configuration2.colorMode & 3;
                    if (i25 != i26) {
                        configuration3.colorMode |= i26;
                    }
                    i27 = configuration.colorMode & 12;
                    i28 = configuration2.colorMode & 12;
                    if (i27 != i28) {
                        configuration3.colorMode |= i28;
                    }
                    i29 = configuration.uiMode & 15;
                    i30 = configuration2.uiMode & 15;
                    if (i29 != i30) {
                        configuration3.uiMode |= i30;
                    }
                    i31 = configuration.uiMode & 48;
                    i32 = configuration2.uiMode & 48;
                    if (i31 != i32) {
                        configuration3.uiMode |= i32;
                    }
                    i33 = configuration.screenWidthDp;
                    i34 = configuration2.screenWidthDp;
                    if (i33 != i34) {
                        configuration3.screenWidthDp = i34;
                    }
                    i35 = configuration.screenHeightDp;
                    i36 = configuration2.screenHeightDp;
                    if (i35 != i36) {
                        configuration3.screenHeightDp = i36;
                    }
                    i37 = configuration.smallestScreenWidthDp;
                    i38 = configuration2.smallestScreenWidthDp;
                    if (i37 != i38) {
                        configuration3.smallestScreenWidthDp = i38;
                    }
                    i39 = configuration.densityDpi;
                    i40 = configuration2.densityDpi;
                    if (i39 != i40) {
                        configuration3.densityDpi = i40;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationT3 = R1.t(context, iC, c0325khP, configuration3, true);
            j7 = new J7(context, ru.zinovin.tankspeedometer.R.style.Theme_AppCompat_Empty);
            j7.a(configurationT3);
            if (context.getTheme() != null) {
                theme = j7.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    Zm.a(theme);
                } else {
                    synchronized (Td.e) {
                        if (Td.g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            Td.f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            Td.g = true;
                            method = Td.f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = Td.f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = j7;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        Br brU = u();
        if (getWindow().hasFeature(0)) {
            if (brU == null || !brU.j()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.P6, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Br brU = u();
        if (keyCode == 82 && brU != null && brU.S(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:51:? A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (!str2.equals("--translation") || Build.VERSION.SDK_INT < 31) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 100470631:
                    if (!str2.equals("--dump-dumpable")) {
                        z = false;
                    } else if (Build.VERSION.SDK_INT >= 33) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 472614934:
                    if (!str2.equals("--list-dumpables")) {
                        z = false;
                    } else if (Build.VERSION.SDK_INT >= 33) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 1159329357:
                    if (!str2.equals("--contentcapture") || Build.VERSION.SDK_INT < 29) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                case 1455016274:
                    if (!str2.equals("--autofill")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    break;
                default:
                    z = false;
                    break;
            }
        } else {
            z = false;
        }
        if (true ^ z) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str3 = str + "  ";
            printWriter.print(str3);
            printWriter.print("mCreated=");
            printWriter.print(this.u);
            printWriter.print(" mResumed=");
            printWriter.print(this.v);
            printWriter.print(" mStopped=");
            printWriter.print(this.w);
            if (getApplication() != null) {
                C0057bp c0057bp = ((C0234hh) new Vi(d(), C0234hh.c).e(C0234hh.class)).b;
                if (c0057bp.c > 0) {
                    printWriter.print(str3);
                    printWriter.println("Loaders:");
                    if (c0057bp.c > 0) {
                        Vo.l(c0057bp.b[0]);
                        printWriter.print(str3);
                        printWriter.print("  #");
                        printWriter.print(c0057bp.a[0]);
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            ((Bc) this.s.b).m.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        R1 r1 = (R1) t();
        r1.w();
        return r1.l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        R1 r1 = (R1) t();
        if (r1.p == null) {
            r1.A();
            Br br = r1.o;
            r1.p = new Sp(br != null ? br.C() : r1.k);
        }
        return r1.p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC0121ds.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        t().b();
    }

    @Override // defpackage.P6, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.s.y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.P6, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        R1 r1 = (R1) t();
        if (r1.G && r1.A) {
            r1.A();
            Br br = r1.o;
            if (br != null) {
                br.K();
            }
        }
        U1 u1A = U1.a();
        Context context = r1.k;
        synchronized (u1A) {
            Tm tm = u1A.a;
            synchronized (tm) {
                C0511qh c0511qh = (C0511qh) tm.b.get(context);
                if (c0511qh != null) {
                    c0511qh.a();
                }
            }
        }
        r1.S = new Configuration(r1.k.getResources().getConfiguration());
        r1.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.P6, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t.e(EnumC0602tg.ON_CREATE);
        Oc oc = ((Bc) this.s.b).m;
        oc.E = false;
        oc.F = false;
        oc.L.g = false;
        oc.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((Bc) this.s.b).m.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        y();
        t().e();
    }

    @Override // defpackage.P6, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentL;
        if (z(i, menuItem)) {
            return true;
        }
        Br brU = u();
        if (menuItem.getItemId() == 16908332 && brU != null && (brU.v() & 4) != 0 && (intentL = F4.L(this)) != null) {
            if (!shouldUpRecreateTask(intentL)) {
                navigateUpTo(intentL);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentL2 = F4.L(this);
            if (intentL2 == null) {
                intentL2 = F4.L(this);
            }
            if (intentL2 != null) {
                ComponentName component = intentL2.getComponent();
                if (component == null) {
                    component = intentL2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM = F4.M(this, component);
                    while (intentM != null) {
                        arrayList.add(size, intentM);
                        intentM = F4.M(this, intentM.getComponent());
                    }
                    arrayList.add(intentL2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.v = false;
        ((Bc) this.s.b).m.t(5);
        this.t.e(EnumC0602tg.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((R1) t()).w();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        A();
        R1 r1 = (R1) t();
        r1.A();
        Br br = r1.o;
        if (br != null) {
            br.l0(true);
        }
    }

    @Override // defpackage.P6, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.s.y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0308k0 c0308k0 = this.s;
        c0308k0.y();
        super.onResume();
        this.v = true;
        ((Bc) c0308k0.b).m.y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        B();
        ((R1) t()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.s.y();
    }

    @Override // android.app.Activity
    public final void onStop() {
        C();
        R1 r1 = (R1) t();
        r1.A();
        Br br = r1.o;
        if (br != null) {
            br.l0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        t().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        Br brU = u();
        if (getWindow().hasFeature(0)) {
            if (brU == null || !brU.U()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        w();
        t().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((R1) t()).U = i;
    }

    public final E1 t() {
        if (this.x == null) {
            C1 c1 = E1.a;
            this.x = new R1(this, null, this, this);
        }
        return this.x;
    }

    public final Br u() {
        R1 r1 = (R1) t();
        r1.A();
        return r1.o;
    }

    public final Oc v() {
        return ((Bc) this.s.b).m;
    }

    public final void w() {
        F4.X(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Tf.j("<this>", decorView);
        decorView.setTag(ru.zinovin.tankspeedometer.R.id.view_tree_view_model_store_owner, this);
        Ud.f0(getWindow().getDecorView(), this);
        Td.D(getWindow().getDecorView(), this);
    }

    public final void y() {
        super.onDestroy();
        ((Bc) this.s.b).m.k();
        this.t.e(EnumC0602tg.ON_DESTROY);
    }

    public final boolean z(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((Bc) this.s.b).m.i();
        }
        return false;
    }

    @Override // defpackage.P6, android.app.Activity
    public void setContentView(View view) {
        w();
        t().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        t().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((Bc) this.s.b).m.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
