package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class R1 extends E1 implements InterfaceC0542ri, LayoutInflater.Factory2 {
    public static final Fo i0 = new Fo();
    public static final int[] j0 = {R.attr.windowBackground};
    public static final boolean k0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public Q1[] M;
    public Q1 N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public N1 X;
    public N1 Y;
    public boolean Z;
    public int a0;
    public boolean c0;
    public Rect d0;
    public Rect e0;
    public J2 f0;
    public OnBackInvokedDispatcher g0;
    public OnBackInvokedCallback h0;
    public final Object j;
    public final Context k;
    public Window l;
    public M1 m;
    public final InterfaceC0618u1 n;
    public Br o;
    public Sp p;
    public CharSequence q;
    public InterfaceC0532r8 r;
    public G1 s;
    public G1 t;
    public AbstractC0494q0 u;
    public ActionBarContextView v;
    public PopupWindow w;
    public F1 x;
    public Ws y = null;
    public final boolean z = true;
    public final F1 b0 = new F1(this, 0);

    public R1(Context context, Window window, InterfaceC0618u1 interfaceC0618u1, Object obj) {
        AbstractActivityC0495q1 abstractActivityC0495q1;
        this.T = -100;
        this.k = context;
        this.n = interfaceC0618u1;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AbstractActivityC0495q1) {
                        abstractActivityC0495q1 = (AbstractActivityC0495q1) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                abstractActivityC0495q1 = null;
                break;
            }
            if (abstractActivityC0495q1 != null) {
                this.T = ((R1) abstractActivityC0495q1.t()).T;
            }
        }
        if (this.T == -100) {
            Fo fo = i0;
            Integer num = (Integer) fo.getOrDefault(this.j.getClass().getName(), null);
            if (num != null) {
                this.T = num.intValue();
                fo.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        U1.c();
    }

    public static C0325kh p(Context context) {
        C0325kh c0325kh;
        C0325kh c0325kh2;
        if (Build.VERSION.SDK_INT >= 33 || (c0325kh = E1.c) == null) {
            return null;
        }
        C0325kh c0325khB = J1.b(context.getApplicationContext().getResources().getConfiguration());
        C0356lh c0356lh = c0325kh.a;
        if (c0356lh.a.isEmpty()) {
            c0325kh2 = C0325kh.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c0325khB.a.a.size() + c0356lh.a.size()) {
                Locale locale = i < c0356lh.a.size() ? c0356lh.a.get(i) : c0325khB.a.a.get(i - c0356lh.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c0325kh2 = new C0325kh(new C0356lh(AbstractC0294jh.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c0325kh2.a.a.isEmpty() ? c0325khB : c0325kh2;
    }

    public static Configuration t(Context context, int i, C0325kh c0325kh, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0325kh != null) {
            J1.d(configuration2, c0325kh);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.G && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new Bt((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new Bt((Dialog) obj);
            }
            Br br = this.o;
            if (br != null) {
                br.j0(this.c0);
            }
        }
    }

    public final void B(int i) {
        this.a0 = (1 << i) | this.a0;
        if (this.Z) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = Gs.a;
        decorView.postOnAnimation(this.b0);
        this.Z = true;
    }

    public final int C(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return y(context).g();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.Y == null) {
                    this.Y = new N1(this, context);
                }
                return this.Y.g();
            }
        }
        return i;
    }

    public final boolean D() {
        boolean z = this.O;
        this.O = false;
        Q1 q1Z = z(0);
        if (q1Z.m) {
            if (!z) {
                s(q1Z, true);
            }
            return true;
        }
        AbstractC0494q0 abstractC0494q0 = this.u;
        if (abstractC0494q0 != null) {
            abstractC0494q0.a();
            return true;
        }
        A();
        Br br = this.o;
        return br != null && br.k();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0173, code lost:
    
        if (r3.f.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.Q1 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R1.E(Q1, android.view.KeyEvent):void");
    }

    public final boolean F(Q1 q1, int i, KeyEvent keyEvent) {
        MenuC0604ti menuC0604ti;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((q1.k || G(q1, keyEvent)) && (menuC0604ti = q1.h) != null) {
            return menuC0604ti.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean G(Q1 q1, KeyEvent keyEvent) {
        InterfaceC0532r8 interfaceC0532r8;
        InterfaceC0532r8 interfaceC0532r9;
        Resources.Theme themeNewTheme;
        InterfaceC0532r8 interfaceC0532r10;
        InterfaceC0532r8 interfaceC0532r11;
        if (this.R) {
            return false;
        }
        if (q1.k) {
            return true;
        }
        Q1 q2 = this.N;
        if (q2 != null && q2 != q1) {
            s(q2, false);
        }
        Window.Callback callback = this.l.getCallback();
        int i = q1.a;
        if (callback != null) {
            q1.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0532r11 = this.r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0532r11;
            actionBarOverlayLayout.k();
            ((C0028ar) actionBarOverlayLayout.e).l = true;
        }
        if (q1.g == null && (!z || !(this.o instanceof Yq))) {
            MenuC0604ti menuC0604ti = q1.h;
            if (menuC0604ti == null || q1.o) {
                if (menuC0604ti == null) {
                    Context context = this.k;
                    if ((i == 0 || i == 108) && this.r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(ru.zinovin.tankspeedometer.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(ru.zinovin.tankspeedometer.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(ru.zinovin.tankspeedometer.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            J7 j7 = new J7(context, 0);
                            j7.getTheme().setTo(themeNewTheme);
                            context = j7;
                        }
                    }
                    MenuC0604ti menuC0604ti2 = new MenuC0604ti(context);
                    menuC0604ti2.e = this;
                    MenuC0604ti menuC0604ti3 = q1.h;
                    if (menuC0604ti2 != menuC0604ti3) {
                        if (menuC0604ti3 != null) {
                            menuC0604ti3.r(q1.i);
                        }
                        q1.h = menuC0604ti2;
                        Sg sg = q1.i;
                        if (sg != null) {
                            menuC0604ti2.b(sg, menuC0604ti2.a);
                        }
                    }
                    if (q1.h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0532r9 = this.r) != null) {
                    if (this.s == null) {
                        this.s = new G1(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0532r9).l(q1.h, this.s);
                }
                q1.h.w();
                if (!callback.onCreatePanelMenu(i, q1.h)) {
                    MenuC0604ti menuC0604ti4 = q1.h;
                    if (menuC0604ti4 != null) {
                        if (menuC0604ti4 != null) {
                            menuC0604ti4.r(q1.i);
                        }
                        q1.h = null;
                    }
                    if (z && (interfaceC0532r8 = this.r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0532r8).l(null, this.s);
                    }
                    return false;
                }
                q1.o = false;
            }
            q1.h.w();
            Bundle bundle = q1.p;
            if (bundle != null) {
                q1.h.s(bundle);
                q1.p = null;
            }
            if (!callback.onPreparePanel(0, q1.g, q1.h)) {
                if (z && (interfaceC0532r10 = this.r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0532r10).l(null, this.s);
                }
                q1.h.v();
                return false;
            }
            q1.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            q1.h.v();
        }
        q1.k = true;
        q1.l = false;
        this.N = q1;
        return true;
    }

    public final void H() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.g0 != null && (z(0).m || this.u != null)) {
                z = true;
            }
            if (z && this.h0 == null) {
                this.h0 = L1.b(this.g0, this);
            } else {
                if (z || (onBackInvokedCallback = this.h0) == null) {
                    return;
                }
                L1.c(this.g0, onBackInvokedCallback);
                this.h0 = null;
            }
        }
    }

    @Override // defpackage.E1
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof R1) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.E1
    public final void b() {
        if (this.o != null) {
            A();
            if (this.o.F()) {
                return;
            }
            B(0);
        }
    }

    @Override // defpackage.E1
    public final void d() {
        String strN;
        this.P = true;
        m(false, true);
        x();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strN = F4.N(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strN = null;
            }
            if (strN != null) {
                Br br = this.o;
                if (br == null) {
                    this.c0 = true;
                } else {
                    br.j0(true);
                }
            }
            synchronized (E1.h) {
                E1.f(this);
                E1.g.add(new WeakReference(this));
            }
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.E1
    public final void e() {
        if (this.j instanceof Activity) {
            synchronized (E1.h) {
                E1.f(this);
            }
        }
        if (this.Z) {
            this.l.getDecorView().removeCallbacks(this.b0);
        }
        this.R = true;
        if (this.T != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                i0.put(this.j.getClass().getName(), Integer.valueOf(this.T));
            } else {
                i0.remove(this.j.getClass().getName());
            }
        } else {
            i0.remove(this.j.getClass().getName());
        }
        Br br = this.o;
        if (br != null) {
            br.M();
        }
        N1 n1 = this.X;
        if (n1 != null) {
            n1.d();
        }
        N1 n2 = this.Y;
        if (n2 != null) {
            n2.d();
        }
    }

    @Override // defpackage.E1
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.K && i == 108) {
            return false;
        }
        if (this.G && i == 1) {
            this.G = false;
        }
        if (i == 1) {
            H();
            this.K = true;
            return true;
        }
        if (i == 2) {
            H();
            this.E = true;
            return true;
        }
        if (i == 5) {
            H();
            this.F = true;
            return true;
        }
        if (i == 10) {
            H();
            this.I = true;
            return true;
        }
        if (i == 108) {
            H();
            this.G = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        H();
        this.H = true;
        return true;
    }

    @Override // defpackage.E1
    public final void h(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.E1
    public final void i(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.E1
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // defpackage.InterfaceC0542ri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.MenuC0604ti r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R1.k(ti):void");
    }

    @Override // defpackage.E1
    public final void l(CharSequence charSequence) {
        this.q = charSequence;
        InterfaceC0532r8 interfaceC0532r8 = this.r;
        if (interfaceC0532r8 != null) {
            interfaceC0532r8.setWindowTitle(charSequence);
            return;
        }
        Br br = this.o;
        if (br != null) {
            br.p0(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.R) {
            return false;
        }
        int i2 = this.T;
        if (i2 == -100) {
            i2 = E1.b;
        }
        Context context = this.k;
        int iC = C(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        C0325kh c0325khP = i3 < 33 ? p(context) : null;
        if (!z2 && c0325khP != null) {
            c0325khP = J1.b(context.getResources().getConfiguration());
        }
        Configuration configurationT = t(context, iC, c0325khP, null, false);
        boolean z4 = this.W;
        boolean z5 = true;
        Object obj = this.j;
        if (z4 || !(obj instanceof Activity)) {
            this.W = true;
            i = this.V;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.V = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.V = 0;
                }
                this.W = true;
                i = this.V;
            }
        }
        Configuration configuration = this.S;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationT.uiMode & 48;
        C0325kh c0325khB = J1.b(configuration);
        C0325kh c0325khB2 = c0325khP == null ? null : J1.b(configurationT);
        int i6 = i4 != i5 ? 512 : 0;
        if (c0325khB2 != null && !c0325khB.equals(c0325khB2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.P && ((k0 || this.Q) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationT.getLayoutDirection());
                }
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (c0325khB2 != null) {
                J1.d(configuration2, c0325khB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = this.U;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.U, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof Dg) {
                    if (((Fg) ((Dg) activity2).getLifecycle()).c.compareTo(EnumC0633ug.c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.Q && !this.R) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof AbstractActivityC0495q1)) {
            if ((i6 & 512) != 0) {
                ((AbstractActivityC0495q1) obj).getClass();
            }
            if ((i6 & 4) != 0) {
                ((AbstractActivityC0495q1) obj).getClass();
            }
        }
        if (c0325khB2 != null) {
            J1.c(J1.b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            y(context).j();
        } else {
            N1 n1 = this.X;
            if (n1 != null) {
                n1.d();
            }
        }
        if (i2 == 3) {
            if (this.Y == null) {
                this.Y = new N1(this, context);
            }
            this.Y.j();
        } else {
            N1 n2 = this.Y;
            if (n2 != null) {
                n2.d();
            }
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.InterfaceC0542ri
    public final boolean n(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        Q1 q1;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.R) {
            MenuC0604ti menuC0604tiK = menuC0604ti.k();
            Q1[] q1Arr = this.M;
            int length = q1Arr != null ? q1Arr.length : 0;
            for (int i = 0; i < length; i++) {
                q1 = q1Arr[i];
                if (q1 != null && q1.h == menuC0604tiK) {
                    if (q1 != null) {
                        return callback.onMenuItemSelected(q1.a, menuItem);
                    }
                }
            }
            q1 = null;
            if (q1 != null) {
                return callback.onMenuItemSelected(q1.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public final void o(Window window) {
        Drawable drawableF;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof M1) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        M1 m1 = new M1(this, callback);
        this.m = m1;
        window.setCallback(m1);
        int[] iArr = j0;
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableF = null;
        } else {
            U1 u1A = U1.a();
            synchronized (u1A) {
                drawableF = u1A.a.f(context, resourceId, true);
            }
        }
        if (drawableF != null) {
            window.setBackgroundDrawable(drawableF);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.g0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.h0) != null) {
            L1.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.h0 = null;
        }
        Object obj = this.j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.g0 = L1.a(activity);
            } else {
                this.g0 = null;
            }
        } else {
            this.g0 = null;
        }
        I();
    }

    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: J2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: J2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: android.content.res.TypedArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: android.content.res.TypedArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: android.content.Context
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.R1.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void q(int i, Q1 q1, MenuC0604ti menuC0604ti) {
        if (menuC0604ti == null) {
            if (q1 == null && i >= 0) {
                Q1[] q1Arr = this.M;
                if (i < q1Arr.length) {
                    q1 = q1Arr[i];
                }
            }
            if (q1 != null) {
                menuC0604ti = q1.h;
            }
        }
        if ((q1 == null || q1.m) && !this.R) {
            M1 m1 = this.m;
            Window.Callback callback = this.l.getCallback();
            m1.getClass();
            try {
                m1.e = true;
                callback.onPanelClosed(i, menuC0604ti);
            } finally {
                m1.e = false;
            }
        }
    }

    public final void r(MenuC0604ti menuC0604ti) {
        C0339l0 c0339l0;
        if (this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((C0028ar) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (c0339l0 = actionMenuView.t) != null) {
            c0339l0.e();
            C0186g0 c0186g0 = c0339l0.t;
            if (c0186g0 != null && c0186g0.b()) {
                c0186g0.j.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.R) {
            callback.onPanelClosed(108, menuC0604ti);
        }
        this.L = false;
    }

    public final void s(Q1 q1, boolean z) {
        P1 p1;
        InterfaceC0532r8 interfaceC0532r8;
        if (z && q1.a == 0 && (interfaceC0532r8 = this.r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0532r8;
            actionBarOverlayLayout.k();
            if (((C0028ar) actionBarOverlayLayout.e).a.p()) {
                r(q1.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && q1.m && (p1 = q1.e) != null) {
            windowManager.removeView(p1);
            if (z) {
                q(q1.a, q1, null);
            }
        }
        q1.k = false;
        q1.l = false;
        q1.m = false;
        q1.f = null;
        q1.n = true;
        if (this.N == q1) {
            this.N = null;
        }
        if (q1.a == 0) {
            I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    public final boolean u(KeyEvent keyEvent) {
        boolean z;
        boolean zV;
        boolean zG;
        ActionMenuView actionMenuView;
        C0339l0 c0339l0;
        Object obj = this.j;
        if (((obj instanceof InterfaceC0202gg) || (obj instanceof R0)) && this.l.getDecorView() != null) {
            WeakHashMap weakHashMap = Gs.a;
        }
        if (keyEvent.getKeyCode() == 82) {
            M1 m1 = this.m;
            Window.Callback callback = this.l.getCallback();
            m1.getClass();
            try {
                m1.d = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                m1.d = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                m1.d = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.O = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                Q1 q1Z = z(0);
                if (q1Z.m) {
                    return true;
                }
                G(q1Z, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.u != null) {
                    return true;
                }
                Q1 q1Z2 = z(0);
                InterfaceC0532r8 interfaceC0532r8 = this.r;
                Context context = this.k;
                if (interfaceC0532r8 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0532r8;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((C0028ar) actionBarOverlayLayout.e).a;
                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.a) == null || !actionMenuView.s || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        z = q1Z2.m;
                        if (!z || q1Z2.l) {
                            s(q1Z2, true);
                            zV = z;
                        } else {
                            if (q1Z2.k) {
                                if (q1Z2.o) {
                                    q1Z2.k = false;
                                    zG = G(q1Z2, keyEvent);
                                } else {
                                    zG = true;
                                }
                                if (zG) {
                                    E(q1Z2, keyEvent);
                                    zV = true;
                                }
                            }
                            zV = false;
                        }
                    } else {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.r;
                        actionBarOverlayLayout2.k();
                        if (((C0028ar) actionBarOverlayLayout2.e).a.p()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.r;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView2 = ((C0028ar) actionBarOverlayLayout3.e).a.a;
                            if (actionMenuView2 != null && (c0339l0 = actionMenuView2.t) != null && c0339l0.e()) {
                                zV = true;
                            }
                        } else if (!this.R && G(q1Z2, keyEvent)) {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.r;
                            actionBarOverlayLayout4.k();
                            zV = ((C0028ar) actionBarOverlayLayout4.e).a.v();
                        }
                        zV = false;
                    }
                } else {
                    z = q1Z2.m;
                    if (z) {
                    }
                    s(q1Z2, true);
                    zV = z;
                }
                if (!zV) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (D()) {
            return true;
        }
        return false;
    }

    public final void v(int i) {
        Q1 q1Z = z(i);
        if (q1Z.h != null) {
            Bundle bundle = new Bundle();
            q1Z.h.t(bundle);
            if (bundle.size() > 0) {
                q1Z.p = bundle;
            }
            q1Z.h.w();
            q1Z.h.clear();
        }
        q1Z.o = true;
        q1Z.n = true;
        if ((i == 108 || i == 0) && this.r != null) {
            Q1 q1Z2 = z(0);
            q1Z2.k = false;
            G(q1Z2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.A) {
            return;
        }
        int[] iArr = AbstractC0700wl.j;
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(ru.zinovin.tankspeedometer.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ru.zinovin.tankspeedometer.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ru.zinovin.tankspeedometer.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ru.zinovin.tankspeedometer.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new J7(context, typedValue.resourceId) : context).inflate(ru.zinovin.tankspeedometer.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0532r8 interfaceC0532r8 = (InterfaceC0532r8) viewGroup.findViewById(ru.zinovin.tankspeedometer.R.id.decor_content_parent);
            this.r = interfaceC0532r8;
            interfaceC0532r8.setWindowCallback(this.l.getCallback());
            if (this.H) {
                ((ActionBarOverlayLayout) this.r).j(109);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.r).j(2);
            }
            if (this.F) {
                ((ActionBarOverlayLayout) this.r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        G1 g1 = new G1(this, i2);
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0676vs.u(viewGroup, g1);
        if (this.r == null) {
            this.C = (TextView) viewGroup.findViewById(ru.zinovin.tankspeedometer.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ru.zinovin.tankspeedometer.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new G1(this, i));
        this.B = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0532r8 interfaceC0532r9 = this.r;
            if (interfaceC0532r9 != null) {
                interfaceC0532r9.setWindowTitle(title);
            } else {
                Br br = this.o;
                if (br != null) {
                    br.p0(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A = true;
        Q1 q1Z = z(0);
        if (this.R || q1Z.h != null) {
            return;
        }
        B(108);
    }

    public final void x() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0093d y(Context context) {
        if (this.X == null) {
            if (K2.g == null) {
                Context applicationContext = context.getApplicationContext();
                K2.g = new K2(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new N1(this, K2.g);
        }
        return this.X;
    }

    public final Q1 z(int i) {
        Q1[] q1Arr = this.M;
        if (q1Arr == null || q1Arr.length <= i) {
            Q1[] q1Arr2 = new Q1[i + 1];
            if (q1Arr != null) {
                System.arraycopy(q1Arr, 0, q1Arr2, 0, q1Arr.length);
            }
            this.M = q1Arr2;
            q1Arr = q1Arr2;
        }
        Q1 q1 = q1Arr[i];
        if (q1 != null) {
            return q1;
        }
        Q1 q2 = new Q1();
        q2.a = i;
        q2.n = false;
        q1Arr[i] = q2;
        return q2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
