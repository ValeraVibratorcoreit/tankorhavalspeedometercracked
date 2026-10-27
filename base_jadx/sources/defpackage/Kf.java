package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.StrictMode;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Locale;
import java.util.Objects;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.service.InternetMonitorService;
import ru.zinovin.tankspeedometer.service.TboxMonitorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class Kf extends Service implements Dg {
    public SharedPreferences b;
    public WindowManager o;
    public View p;
    public WindowManager.LayoutParams q;
    public final K2 a = new K2((Dg) this);
    public final Lf c = Lf.a();
    public int d = -7829368;
    public int e = -1;
    public int f = -1;
    public boolean g = true;
    public boolean h = false;
    public int i = 0;
    public String j = "°C";
    public boolean k = false;
    public boolean l = false;
    public boolean m = true;
    public boolean n = true;
    public final K2 r = new K2(17);
    public final O1 s = new O1(this, 2);
    public final C0291je t = new C0291je(this, new C0096d2(21));

    public static void p(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public final void a(boolean z, boolean z2) {
        C0636uj c0636ujA;
        ConstraintLayout constraintLayout = (ConstraintLayout) c(R.id.naviBorder);
        String string = this.b.getString("selectedTheme", "Audi Virtual Cockpit");
        if (this.b.getBoolean("showNaviBorder", true)) {
            if (z) {
                c0636ujA = C0473pa.g;
            } else {
                C0473pa.x().getClass();
                AbstractC0402n1.a();
                c0636ujA = C0473pa.A(0, string);
            }
            C0605tj c0605tj = z2 ? c0636ujA.b : c0636ujA.a;
            int i = c0605tj.c - c0605tj.a;
            int i2 = c0605tj.d - c0605tj.b;
            C0513qj c0513qj = new C0513qj(this);
            c0513qj.d = 60.0f;
            Paint paint = new Paint();
            c0513qj.a = paint;
            paint.setColor(-16777216);
            c0513qj.a.setStrokeWidth(60.0f);
            c0513qj.a.setStyle(Paint.Style.STROKE);
            c0513qj.b = new Path();
            c0513qj.c = new RectF();
            c0513qj.setId(View.generateViewId());
            c0513qj.setLayoutParams(new C0346l7(i, i2));
            constraintLayout.addView(c0513qj);
            C0624u7 c0624u7 = new C0624u7();
            c0624u7.b(constraintLayout);
            c0624u7.c(c0513qj.getId(), 3, constraintLayout.getId(), 3, c0605tj.b);
            c0624u7.c(c0513qj.getId(), 1, constraintLayout.getId(), 1, c0605tj.a);
            c0624u7.a(constraintLayout);
            constraintLayout.setConstraintSet(null);
            constraintLayout.requestLayout();
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String string = AbstractC0390mk.l(context).getString("language", "sys");
        Locale locale = context.getResources().getConfiguration().locale;
        if (string.equals("sys")) {
            string = locale.getLanguage();
        }
        super.attachBaseContext(F4.b0(context, string));
    }

    public final View c(int i) {
        View view = this.p;
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    @Override // defpackage.Dg
    public final AbstractC0695wg getLifecycle() {
        return (Fg) this.a.b;
    }

    public void h() {
        this.k = Br.s("bigMeters", false);
        this.l = this.b.getBoolean("extFirmware", true);
        this.n = Br.s("speedFromLeft", true);
        this.c.I.f(this.b.getString("naviPackage", "ru.yandex.yandexnavi"));
    }

    public final void i() {
        this.a.H(EnumC0602tg.ON_CREATE);
        super.onCreate();
    }

    public final void j() {
        EnumC0602tg enumC0602tg = EnumC0602tg.ON_STOP;
        K2 k2 = this.a;
        k2.H(enumC0602tg);
        k2.H(EnumC0602tg.ON_DESTROY);
        super.onDestroy();
    }

    public final void k(int i, Object obj, String str, int i2, int i3, String str2) {
        TextView textView = (TextView) c(i);
        if (textView != null) {
            String str3 = String.format(Locale.US, str2, obj);
            SpannableString spannableString = new SpannableString(str3.concat(str));
            textView.setTextColor(i2);
            spannableString.setSpan(new ForegroundColorSpan(i3), 0, str3.length(), 33);
            textView.setText(spannableString);
        }
    }

    public void l() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_IP_STOP");
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_INDICATOR_COLOR_CHANGED");
        registerReceiver(this.s, intentFilter, "ru.zinovin.tankspeedometer.RESTART_PERMISSION", null);
    }

    public abstract void m();

    public final void n(String str) {
        String strReplace = this.b.getString("carModel", "tank_500").replace("tank_300", "wey_07").replace("wey_80", "wey_07");
        int identifier = getResources().getIdentifier(str + "_" + strReplace, "layout", getPackageName());
        StringBuilder sb = new StringBuilder("layoutId=");
        sb.append(identifier);
        C0768yr.e("T500.ACTIVITY", sb.toString());
        C0768yr.e("T500.ACTIVITY", "curLayoutId=" + this.f);
        StringBuilder sb2 = new StringBuilder("curLayoutId=layoutId ");
        sb2.append(this.f == identifier);
        C0768yr.e("T500.ACTIVITY", sb2.toString());
        if (identifier == 0) {
            throw new RuntimeException(Vo.g("Макет ", str, " не найден"));
        }
        if (identifier == this.f) {
            C0768yr.e("T500.ACTIVITY", "Не меняем layout");
        } else {
            o(((LayoutInflater) getSystemService("layout_inflater")).inflate(identifier, (ViewGroup) null));
            this.f = identifier;
        }
    }

    public final void o(View view) {
        view.setLayoutDirection(0);
        View view2 = this.p;
        if (view2 != null) {
            view2.setVisibility(4);
            this.o.removeView(this.p);
        }
        this.o.addView(view, this.q);
        this.p = view;
        K2 k2 = this.r;
        RunnableC0524r0 runnableC0524r0 = (RunnableC0524r0) k2.c;
        Handler handler = (Handler) k2.b;
        if (runnableC0524r0 != null) {
            handler.removeCallbacks(runnableC0524r0);
        }
        k2.d = view;
        RunnableC0524r0 runnableC0524r1 = new RunnableC0524r0(k2, 10);
        k2.c = runnableC0524r1;
        handler.postDelayed(runnableC0524r1, 300000L);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Tf.j("intent", intent);
        this.a.H(EnumC0602tg.ON_START);
        return null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C0768yr.e("T500.ACTIVITY", "onConfigurationChanged() call");
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public final void onCreate() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        C0768yr.e("T500.ACTIVITY", "InstrumentalActivity.onCreate()");
        i();
        this.b = AbstractC0390mk.l(this);
        Typeface.createFromAsset(getAssets(), "fonts/frutiger.otf");
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putBoolean("usePreferences", true);
        editorEdit.commit();
        this.o = (WindowManager) getSystemService("window");
        Display[] displays = ((DisplayManager) getSystemService("display")).getDisplays();
        if (displays.length > 2) {
            this.o = (WindowManager) getApplicationContext().createDisplayContext(displays[2]).getSystemService("window");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.o.getDefaultDisplay().getMetrics(displayMetrics);
        C0768yr.e("T500.ACTIVITY", "density=" + displayMetrics.density);
        C0768yr.e("T500.ACTIVITY", "densityDpi=" + displayMetrics.densityDpi);
        Configuration configuration = getResources().getConfiguration();
        configuration.densityDpi = displayMetrics.densityDpi;
        C0768yr.e("T500.ACTIVITY", "fontScale=" + configuration.fontScale);
        configuration.fontScale = 1.0f;
        getResources().updateConfiguration(configuration, displayMetrics);
        displayMetrics.setTo(displayMetrics);
        configuration.setTo(configuration);
        this.q = new WindowManager.LayoutParams(1920, 720, 2038, 792, -3);
        C0291je c0291je = this.t;
        Objects.requireNonNull(c0291je);
        RunnableC0231he runnableC0231he = new RunnableC0231he(c0291je, 2);
        Handler handler = c0291je.f;
        if (handler != null) {
            handler.post(new RunnableC0591t5(runnableC0231he, 8));
        }
        f();
        h();
        m();
        g();
        e();
        C0768yr.e("T500.UTILS", "startService() called");
        Context contextA = AbstractC0402n1.a();
        Intent intent = new Intent(contextA, (Class<?>) InternetMonitorService.class);
        intent.setAction("ACTION_START_OR_RESUME_SERVICE");
        contextA.startService(intent);
        C0768yr.e("T500.UTILS", "startTboxService() called");
        Context contextA2 = AbstractC0402n1.a();
        Intent intent2 = new Intent(contextA2, (Class<?>) TboxMonitorService.class);
        intent2.setAction("ACTION_START_OR_RESUME_SERVICE");
        contextA2.startService(intent2);
        l();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C0768yr.e("T500.ACTIVITY", "onDestroy() call");
        C0291je c0291je = this.t;
        Objects.requireNonNull(c0291je);
        RunnableC0231he runnableC0231he = new RunnableC0231he(c0291je, 1);
        Handler handler = c0291je.f;
        if (handler != null) {
            handler.post(new RunnableC0591t5(runnableC0231he, 8));
        }
        q();
        ((Handler) this.r.b).removeCallbacksAndMessages(null);
        View view = this.p;
        if (view != null) {
            this.o.removeView(view);
        }
        j();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.H(EnumC0602tg.ON_START);
        super.onStart(intent, i);
    }

    public void q() {
        unregisterReceiver(this.s);
    }
}
