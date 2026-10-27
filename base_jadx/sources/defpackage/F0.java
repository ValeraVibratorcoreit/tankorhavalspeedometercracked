package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.service.YnActivatingService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ F0(E3 e3, boolean z) {
        this.a = 1;
        this.c = e3;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0636uj c0636ujA;
        Zt zt;
        Object obj = this.c;
        boolean z = this.b;
        switch (this.a) {
            case 0:
                Intent launchIntentForPackage = AbstractC0402n1.a().getPackageManager().getLaunchIntentForPackage("ru.zinovin.navionip");
                if (launchIntentForPackage != null) {
                    SharedPreferences sharedPreferencesL = AbstractC0390mk.l(AbstractC0402n1.a());
                    String string = sharedPreferencesL.getString("ipType", "1");
                    boolean z2 = !string.equals("1") && sharedPreferencesL.getBoolean("MICROMODE", false);
                    String string2 = sharedPreferencesL.getString("selectedTheme", "Audi Virtual Cockpit");
                    Mf mfG = C0426np.g(string2);
                    if (z2 && mfG.z) {
                        c0636ujA = C0473pa.g;
                    } else {
                        C0473pa c0473paX = C0473pa.x();
                        if (!string.equals("3")) {
                            string2 = "Default";
                        }
                        c0473paX.getClass();
                        AbstractC0402n1.a();
                        c0636ujA = C0473pa.A(0, string2);
                    }
                    C0605tj c0605tj = c0636ujA.b;
                    if (!z) {
                        c0605tj = c0636ujA.a;
                    }
                    launchIntentForPackage.putExtra("left", c0605tj.a);
                    launchIntentForPackage.putExtra("top", c0605tj.b);
                    launchIntentForPackage.putExtra("right", c0605tj.c);
                    launchIntentForPackage.putExtra("bottom", c0605tj.d);
                    launchIntentForPackage.putExtra("display", 2);
                }
                Context context = (Context) obj;
                if (launchIntentForPackage == null) {
                    Toast.makeText(context, context.getString(R.string.text_no_navionip_msg), 1).show();
                } else {
                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                    try {
                        ActivityOptions.class.getMethod("setLaunchWindowingMode", Integer.TYPE).invoke(activityOptionsMakeBasic, 6);
                    } catch (Exception e) {
                        C0768yr.c("T500.ERROR", "ERROR in startNaviAppOnIP()", e);
                    }
                    activityOptionsMakeBasic.setLaunchDisplayId(2);
                    context.startActivity(launchIntentForPackage, activityOptionsMakeBasic.toBundle());
                    context.startActivity(launchIntentForPackage);
                    Lf lfA = Lf.a();
                    if (!Ud.L() || ((String) lfA.I.d()).equals("userapp")) {
                        C0768yr.e("T500.UTILS", "startYnService() called");
                        Context contextA = AbstractC0402n1.a();
                        Intent intent = new Intent(contextA, (Class<?>) YnActivatingService.class);
                        intent.setAction("ACTION_START_OR_RESUME_SERVICE");
                        contextA.startService(intent);
                    }
                }
                break;
            case 1:
                E3 e3 = (E3) obj;
                e3.i0();
                e3.l0(e3.b0, false);
                e3.k0();
                Toast.makeText(e3.I(), z ? R.string.bg_download_complete : R.string.bg_download_failed, 0).show();
                break;
            default:
                View view = (View) obj;
                if (z) {
                    WeakHashMap weakHashMap = Gs.a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        zt = Cs.c(view);
                    } else {
                        Context context2 = view.getContext();
                        while (true) {
                            if (context2 instanceof ContextWrapper) {
                                if (context2 instanceof Activity) {
                                    Window window = ((Activity) context2).getWindow();
                                    if (window != null) {
                                        zt = new Zt(window, view);
                                    }
                                } else {
                                    context2 = ((ContextWrapper) context2).getBaseContext();
                                }
                            }
                            zt = null;
                        }
                    }
                    if (zt != null) {
                        zt.a.H();
                    }
                }
                ((InputMethodManager) I7.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }

    public /* synthetic */ F0(Context context, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = context;
    }

    public /* synthetic */ F0(View view) {
        this.a = 2;
        this.c = view;
        this.b = false;
    }
}
