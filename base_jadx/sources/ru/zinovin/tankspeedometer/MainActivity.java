package ru.zinovin.tankspeedometer;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import defpackage.AbstractActivityC0495q1;
import defpackage.AbstractC0318ka;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0402n1;
import defpackage.AbstractC0617u0;
import defpackage.AbstractC0648v0;
import defpackage.AbstractC0676vs;
import defpackage.AbstractC0679w0;
import defpackage.AbstractComponentCallbacksC0784zc;
import defpackage.Ak;
import defpackage.Bh;
import defpackage.C0031b;
import defpackage.C0089cq;
import defpackage.C0098d4;
import defpackage.C0148eo;
import defpackage.C0164f9;
import defpackage.C0210go;
import defpackage.C0271io;
import defpackage.C0389mj;
import defpackage.C0509qf;
import defpackage.C0558s3;
import defpackage.C0574sj;
import defpackage.C0626u9;
import defpackage.C0632uf;
import defpackage.C0646ut;
import defpackage.C0729xj;
import defpackage.C0768yr;
import defpackage.D6;
import defpackage.Dq;
import defpackage.E3;
import defpackage.Eh;
import defpackage.F4;
import defpackage.Gs;
import defpackage.H7;
import defpackage.InterfaceC0323kf;
import defpackage.K9;
import defpackage.Lf;
import defpackage.M0;
import defpackage.Oc;
import defpackage.Q0;
import defpackage.Q2;
import defpackage.Q3;
import defpackage.R2;
import defpackage.S2;
import defpackage.Tf;
import defpackage.U2;
import defpackage.Ud;
import defpackage.Vo;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.preferences.widget.SettingsTopBar;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0495q1 implements InterfaceC0323kf {
    public static final /* synthetic */ int M = 0;
    public SettingsTopBar A;
    public RecyclerView B;
    public C0210go C;
    public ArrayList D;
    public String E;
    public AbstractComponentCallbacksC0784zc F;
    public U2 H;
    public SharedPreferences I;
    public SharedPreferences y;
    public String z = "Audi Virtual Cockpit";
    public boolean G = false;
    public boolean J = false;
    public boolean K = true;
    public final Lf L = Lf.a();

    public final void E() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(intent, 65536);
        if (!"com.gwm.app.settings".equals((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? "" : activityInfo.packageName)) {
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", getPackageName(), null));
            startActivity(intent2);
        } else {
            Intent intent3 = new Intent("android.intent.action.MAIN");
            intent3.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings"));
            intent3.addFlags(268435456);
            startActivity(intent3);
        }
    }

    public final void F() {
        View viewFindViewById = findViewById(R.id.ts_fragment_content_second);
        if (viewFindViewById == null) {
            return;
        }
        AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcB = v().B(R.id.ts_fragment_content_second);
        if (abstractComponentCallbacksC0784zcB != null) {
            Oc ocV = v();
            ocV.getClass();
            C0558s3 c0558s3 = new C0558s3(ocV);
            c0558s3.g(abstractComponentCallbacksC0784zcB);
            c0558s3.d(false);
        }
        viewFindViewById.setVisibility(8);
    }

    public final SharedPreferences G(String str) {
        return getSharedPreferences("prefs_" + str, 0);
    }

    public final void H(Intent intent, boolean z) {
        String stringExtra = intent != null ? intent.getStringExtra("ts_target_section") : null;
        int intExtra = intent != null ? intent.getIntExtra("ts_target_tab", 0) : 0;
        if (stringExtra != null) {
            K(intExtra, stringExtra);
        } else if (z) {
            K(0, "setting_panel");
        }
    }

    public final void I() {
        int i = 1;
        setContentView(R.layout.settings_host);
        SharedPreferences sharedPreferencesL = AbstractC0390mk.l(this);
        this.y = sharedPreferencesL;
        this.z = sharedPreferencesL.getString("selectedTheme", "Audi Virtual Cockpit");
        this.A = (SettingsTopBar) findViewById(R.id.ts_top_bar);
        this.B = (RecyclerView) findViewById(R.id.ts_item_list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0148eo.a("setting_panel", R.string.nav_section_panel, R.drawable.ts_ic_panel, Ak.class));
        arrayList.add(C0148eo.a("setting_theme_view", R.string.nav_section_theme_view, R.drawable.ts_ic_appearance, Dq.class));
        arrayList.add(C0148eo.a("setting_background", R.string.nav_section_background, R.drawable.ts_ic_background, E3.class));
        arrayList.add(C0148eo.a("setting_common", R.string.nav_section_common, R.drawable.ts_ic_common, D6.class));
        arrayList.add(new C0148eo("setting_navi", R.string.nav_section_navi, R.drawable.ts_ic_navi, null, new int[]{R.string.tab_navi_params, R.string.tab_navi_windows}, new String[]{C0574sj.class.getName(), C0729xj.class.getName()}));
        arrayList.add(C0148eo.a("setting_music", R.string.nav_section_music, R.drawable.ts_ic_music, C0389mj.class));
        arrayList.add(new C0148eo("setting_indicators", R.string.nav_section_indicators, R.drawable.ts_ic_indicators, null, new int[]{R.string.tab_indicators_params, R.string.tab_indicators_colors}, new String[]{C0632uf.class.getName(), C0509qf.class.getName()}));
        arrayList.add(new C0148eo("setting_manage", R.string.nav_section_manage, R.drawable.ts_ic_manage, null, new int[]{R.string.tab_manage_actions, R.string.tab_network_wifi, R.string.tab_manage_backup}, new String[]{Eh.class.getName(), C0646ut.class.getName(), Q3.class.getName()}));
        arrayList.add(new C0148eo("setting_update", R.string.nav_section_update, R.drawable.ts_ic_update, null, new int[]{R.string.text_download2_btn}, new String[]{K9.class.getName()}));
        arrayList.add(C0148eo.a("setting_about", R.string.text_about_title, R.drawable.ts_ic_about, C0031b.class));
        this.D = arrayList;
        this.C = new C0210go(arrayList, new C0098d4(this, 0));
        this.B.setLayoutManager(new LinearLayoutManager(1));
        C0626u9 c0626u9 = new C0626u9(this);
        Drawable drawableB = H7.b(this, R.drawable.ts_divider_inset);
        if (drawableB == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        c0626u9.a = drawableB;
        this.B.g(c0626u9);
        this.B.setAdapter(this.C);
        this.G = true;
        H(getIntent(), true);
        View viewFindViewById = findViewById(R.id.ts_root);
        C0164f9 c0164f9 = new C0164f9(i);
        WeakHashMap weakHashMap = Gs.a;
        AbstractC0676vs.u(viewFindViewById, c0164f9);
        if (Tf.H("SHOW_ABOUT").equals("false")) {
            return;
        }
        String string = this.I.getString("language", "sys");
        Locale locale = getResources().getConfiguration().locale;
        if (string.equals("sys")) {
            string = locale.getLanguage();
        }
        File file = new File(getFilesDir(), Vo.g("about_", string, ".txt"));
        if (file.isFile() && file.exists()) {
            try {
                M(getString(R.string.text_about_title), String.join("\n", Files.readAllLines(file.toPath())));
            } catch (Exception e) {
                C0768yr.c("T500.ERROR", "ERROR in normalStart()", e);
            }
        }
    }

    public final void J(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        View viewFindViewById = findViewById(R.id.ts_fragment_content_second);
        if (viewFindViewById == null) {
            return;
        }
        Oc ocV = v();
        ocV.getClass();
        C0558s3 c0558s3 = new C0558s3(ocV);
        c0558s3.h(R.id.ts_fragment_content_second, abstractComponentCallbacksC0784zc, "ts_overlay");
        c0558s3.d(false);
        viewFindViewById.setVisibility(0);
    }

    public final void K(int i, String str) {
        ArrayList arrayList = this.D;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (((C0148eo) arrayList.get(i2)).a.equals(str)) {
                break;
            } else {
                i2++;
            }
        }
        L(i2 >= 0 ? i2 : 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    public final void L(int i, int i2) {
        AbstractComponentCallbacksC0784zc c0271io;
        C0089cq c0089cq;
        if (this.G) {
            C0148eo c0148eo = (C0148eo) this.D.get(i);
            boolean zEquals = c0148eo.a.equals(this.E);
            String[] strArr = c0148eo.f;
            if (zEquals && strArr != null) {
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = this.F;
                if (abstractComponentCallbacksC0784zc instanceof C0271io) {
                    C0271io c0271io2 = (C0271io) abstractComponentCallbacksC0784zc;
                    c0271io2.V = i2;
                    View view = c0271io2.E;
                    if (view != null) {
                        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.ts_tab_layout);
                        if (i2 >= 0) {
                            if (i2 < tabLayout.getTabCount()) {
                                c0089cq = (C0089cq) tabLayout.b.get(i2);
                            }
                            if (c0089cq != null) {
                                c0089cq.a();
                            }
                        } else {
                            tabLayout.getClass();
                        }
                        c0089cq = null;
                        if (c0089cq != null) {
                            c0089cq.a();
                        }
                    }
                    C0210go c0210go = this.C;
                    c0210go.e = i;
                    c0210go.a.b();
                    return;
                }
            }
            this.E = c0148eo.a;
            C0210go c0210go2 = this.C;
            c0210go2.e = i;
            c0210go2.a.b();
            if (i2 < 0) {
                i2 = 0;
            }
            if (strArr != null) {
                c0271io = new C0271io();
                Bundle bundle = new Bundle();
                bundle.putIntArray("ts_labels", c0148eo.e);
                bundle.putStringArray("ts_classes", strArr);
                bundle.putInt("ts_initial_tab", i2);
                c0271io.L(bundle);
            } else {
                try {
                    c0271io = (AbstractComponentCallbacksC0784zc) c0148eo.d.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            this.F = c0271io;
            Oc ocV = v();
            ocV.getClass();
            C0558s3 c0558s3 = new C0558s3(ocV);
            c0558s3.h(R.id.ts_item_detail_container, c0271io, "ts_section");
            if (c0558s3.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0558s3.p.z(c0558s3, false);
        }
    }

    public final void M(String str, String str2) {
        Spanned spannedFromHtml = Html.fromHtml(str2, 0);
        NestedScrollView nestedScrollView = new NestedScrollView(this, null);
        nestedScrollView.setFillViewport(true);
        TextView textView = new TextView(this);
        textView.setText(spannedFromHtml);
        textView.setPadding(20, 20, 20, 20);
        int i = getResources().getDisplayMetrics().heightPixels;
        nestedScrollView.setLayoutParams(new ViewGroup.LayoutParams(20, 20));
        nestedScrollView.addView(textView);
        Q0 q0 = new Q0(this);
        M0 m0 = (M0) q0.b;
        m0.d = str;
        m0.r = nestedScrollView;
        q0.e(android.R.string.ok, new Bh(this, 5));
        q0.g();
    }

    public final void N(String str, DialogInterface.OnClickListener onClickListener) {
        Q0 q0 = new Q0(this);
        String string = getString(R.string.text_perm_title);
        M0 m0 = (M0) q0.b;
        m0.d = string;
        m0.f = str;
        m0.g = getString(R.string.text_ok_btn_text);
        m0.h = onClickListener;
        String string2 = getString(R.string.text_cancel_btn_text);
        Bh bh = new Bh(this, 4);
        m0.i = string2;
        m0.j = bh;
        q0.b().show();
    }

    @Override // defpackage.AbstractActivityC0495q1, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String string = AbstractC0390mk.l(context).getString("language", "sys");
        Locale locale = context.getResources().getConfiguration().locale;
        if (string.equals("sys")) {
            string = locale.getLanguage();
        }
        super.attachBaseContext(F4.b0(context, string));
    }

    @Override // defpackage.P6, android.app.Activity
    public final void onBackPressed() {
        View viewFindViewById = findViewById(R.id.ts_fragment_content_second);
        if (viewFindViewById == null || viewFindViewById.getVisibility() != 0) {
            super.onBackPressed();
        } else {
            F();
        }
    }

    @Override // defpackage.AbstractActivityC0495q1, defpackage.P6, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0768yr.e("T500.MAIN", "MainActivity.onCreate()");
        SharedPreferences sharedPreferencesL = AbstractC0390mk.l(this);
        this.I = sharedPreferencesL;
        this.H = new U2(this, 6);
        this.L.I.f(sharedPreferencesL.getString("naviPackage", "ru.yandex.yandexnavi"));
        this.I.registerOnSharedPreferenceChangeListener(this.H);
        AbstractC0318ka.a(this);
        setContentView(R.layout.start_activity);
    }

    @Override // defpackage.AbstractActivityC0495q1, android.app.Activity
    public final void onDestroy() {
        U2 u2 = this.H;
        if (u2 != null) {
            this.I.unregisterOnSharedPreferenceChangeListener(u2);
        }
        super.onDestroy();
    }

    @Override // defpackage.P6, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (this.G) {
            H(intent, false);
        }
    }

    @Override // defpackage.AbstractActivityC0495q1, android.app.Activity
    public final void onResume() {
        super.onResume();
        C0768yr.e("T500.MAIN", "onResume()");
        StringBuilder sb = new StringBuilder("permission.WRITE_EXTERNAL_STORAGE granted=");
        boolean zB = false;
        sb.append(F4.j(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0);
        C0768yr.e("T500.MAIN", sb.toString());
        if (F4.j(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            StringBuilder sb2 = new StringBuilder("shouldShowRequestPermissionRationale(WRITE_EXTERNAL_STORAGE)=");
            int i = Build.VERSION.SDK_INT;
            if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (i >= 32) {
                    zB = AbstractC0679w0.a(this, "android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    zB = i == 31 ? AbstractC0648v0.b(this, "android.permission.WRITE_EXTERNAL_STORAGE") : AbstractC0617u0.c(this, "android.permission.WRITE_EXTERNAL_STORAGE");
                }
            }
            sb2.append(zB);
            C0768yr.e("T500.MAIN", sb2.toString());
            N(getString(R.string.text_write_storage_perm_msg), new Bh(this, 0));
            return;
        }
        if (F4.j(this, "android.permission.ACCESS_FINE_LOCATION") != 0 && F4.j(this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            N(getString(R.string.text_location_perm_msg), new Bh(this, 1));
            return;
        }
        if (!Settings.canDrawOverlays(this)) {
            N(getString(R.string.text_overlay_perm_msg_2), new Bh(this, 2));
            return;
        }
        if (!Ud.J()) {
            N(getString(R.string.text_usage_access_perm_msg_2), new Bh(this, 3));
            return;
        }
        if (this.J) {
            return;
        }
        this.J = true;
        String strS = Tf.s();
        C0768yr.e("T500.MAIN", "Version in settings " + strS);
        String[] strArr = (String[]) Ud.D().stream().filter(new Q2()).map(new R2()).toArray(new S2());
        SharedPreferences.Editor editorEdit = AbstractC0390mk.l(AbstractC0402n1.a()).edit();
        editorEdit.putBoolean("DEMO", true);
        editorEdit.apply();
        String strH = Tf.H("LALALA");
        if (!strS.startsWith("0.0") && Tf.l(strS, Tf.x()) >= 0 && !strH.isEmpty()) {
            I();
            return;
        }
        if (strArr.length <= 0) {
            Tf.W("VERSION", Tf.x());
            I();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) DownloadActivity.class);
        intent.putExtra("DOWNLOAD_MODE", "DOWNLOAD");
        intent.putExtra("MANUAL_DOWNLOAD", false);
        startActivity(intent);
        finish();
    }
}
