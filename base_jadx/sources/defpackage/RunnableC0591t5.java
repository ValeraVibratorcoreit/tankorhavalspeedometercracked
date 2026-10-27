package defpackage;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.nio.MappedByteBuffer;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import ru.zinovin.tankspeedometer.DownloadActivity2;
import ru.zinovin.tankspeedometer.MainActivity;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.service.InternetMonitorService;
import ru.zinovin.tankspeedometer.service.LogcatService;
import ru.zinovin.tankspeedometer.service.TboxMonitorService;
import ru.zinovin.tankspeedometer.service.YnActivatingService;

/* JADX INFO: renamed from: t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0591t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ RunnableC0591t5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vn vn;
        int iIntValue;
        String str;
        switch (this.a) {
            case 0:
                ((CarouselLayoutManager) this.b).g0();
                return;
            case 1:
                ((C0192g6) this.b).t(true);
                return;
            case 2:
                L6 l6 = (L6) this.b;
                Tf.j("this$0", l6);
                Runnable runnable = l6.b;
                if (runnable != null) {
                    runnable.run();
                    l6.b = null;
                    return;
                }
                return;
            case 3:
                Q6.a((Q6) this.b);
                return;
            case 4:
                C0388mi c0388mi = DownloadActivity2.G;
                ((DownloadActivity2) this.b).E();
                return;
            case 5:
                C0388mi c0388mi2 = K9.d0;
                ((K9) this.b).O();
                return;
            case 6:
                C0227ha c0227ha = (C0227ha) this.b;
                boolean zIsPopupShowing = c0227ha.h.isPopupShowing();
                c0227ha.t(zIsPopupShowing);
                c0227ha.m = zIsPopupShowing;
                return;
            case 7:
                C0167fc c0167fc = (C0167fc) this.b;
                synchronized (c0167fc.d) {
                    try {
                        if (c0167fc.h == null) {
                            return;
                        }
                        try {
                            C0506qc c0506qcD = c0167fc.d();
                            int i = c0506qcD.e;
                            if (i == 2) {
                                synchronized (c0167fc.d) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                int i2 = AbstractC0090cr.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0225h8 c0225h8 = c0167fc.c;
                                Context context = c0167fc.a;
                                c0225h8.getClass();
                                Typeface typefaceR = Cr.a.r(context, new C0506qc[]{c0506qcD}, 0);
                                MappedByteBuffer mappedByteBufferW = Td.w(c0167fc.a, c0506qcD.a);
                                if (mappedByteBufferW == null || typefaceR == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0296jj c0296jj = new C0296jj(typefaceR, AbstractC0390mk.G(mappedByteBufferW));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0167fc.d) {
                                        try {
                                            Ud ud = c0167fc.h;
                                            if (ud != null) {
                                                ud.Y(c0296jj);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    c0167fc.b();
                                    return;
                                } catch (Throwable th2) {
                                    int i3 = AbstractC0090cr.a;
                                    Trace.endSection();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                int i4 = AbstractC0090cr.a;
                                Trace.endSection();
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (c0167fc.d) {
                                try {
                                    Ud ud2 = c0167fc.h;
                                    if (ud2 != null) {
                                        ud2.X(th4);
                                    }
                                    c0167fc.b();
                                    return;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 8:
                ((Runnable) this.b).run();
                return;
            case 9:
                C0353le c0353le = (C0353le) this.b;
                InterfaceC0322ke interfaceC0322ke = c0353le.g;
                boolean z = c0353le.e;
                Wn wn = (Wn) ((C0098d4) interfaceC0322ke).b;
                if (wn.i || (vn = wn.h) == null) {
                    return;
                }
                vn.c(z);
                return;
            case 10:
                C0509qf c0509qf = (C0509qf) this.b;
                String str2 = c0509qf.T.z;
                SharedPreferences sharedPreferencesT = c0509qf.T();
                if (!sharedPreferencesT.getBoolean("useDefaultSwitch", false) || str2.equals("Default")) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesT.edit();
                    String[] strArr = C0509qf.W;
                    for (int i5 = 0; i5 < 4; i5++) {
                        String str3 = strArr[i5];
                        editorEdit.putInt(str3, Tf.y(str3, str2));
                    }
                    String[] strArr2 = C0509qf.Y;
                    for (int i6 = 0; i6 < 4; i6++) {
                        String str4 = strArr2[i6];
                        editorEdit.putInt(str4, Tf.y(str4, str2));
                    }
                    String[] strArr3 = C0509qf.a0;
                    for (int i7 = 0; i7 < 4; i7++) {
                        String str5 = strArr3[i7];
                        editorEdit.putInt(str5, Tf.y(str5, str2));
                    }
                    editorEdit.apply();
                    c0509qf.e0();
                    c0509qf.d0();
                    Toast.makeText(c0509qf.I(), c0509qf.m(R.string.text_color_settings_restore_msg, str2), 1).show();
                    return;
                }
                return;
            case 11:
                int i8 = InternetMonitorService.d;
                InternetMonitorService internetMonitorService = (InternetMonitorService) this.b;
                internetMonitorService.getClass();
                internetMonitorService.a.x.f(Boolean.valueOf(Ud.N()));
                return;
            case 12:
                int i9 = LogcatService.e;
                ((LogcatService) this.b).l();
                return;
            case 13:
                int i10 = MainActivity.M;
                ((MainActivity) this.b).getClass();
                Ud.o0();
                return;
            case 14:
                Eh eh = (Eh) this.b;
                eh.getClass();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings"));
                intent.addFlags(268435456);
                eh.M(intent);
                return;
            case 15:
                C0574sj c0574sj = (C0574sj) this.b;
                String str6 = c0574sj.T.z;
                SharedPreferences sharedPreferencesT2 = c0574sj.T();
                if (!sharedPreferencesT2.getBoolean("useDefaultSwitchNavi", true) || str6.equals("Default")) {
                    SharedPreferences.Editor editorEdit2 = sharedPreferencesT2.edit();
                    editorEdit2.putBoolean("useSysNavi", false);
                    editorEdit2.putBoolean("useNavi", false);
                    editorEdit2.putBoolean("naviFullscreen", false);
                    editorEdit2.apply();
                    c0574sj.c0();
                    if (c0574sj.d0()) {
                        c0574sj.X("ALL");
                        return;
                    }
                    return;
                }
                return;
            case 16:
                Zk zk = (Zk) this.b;
                Tf.j("this$0", zk);
                int i11 = zk.b;
                Fg fg = zk.f;
                if (i11 == 0) {
                    zk.c = true;
                    fg.e(EnumC0602tg.ON_PAUSE);
                }
                if (zk.a == 0 && zk.c) {
                    fg.e(EnumC0602tg.ON_STOP);
                    zk.d = true;
                    return;
                }
                return;
            case 17:
                ((AbstractC0731xl) this.b).l();
                return;
            case 18:
                Mn mn = (Mn) this.b;
                InputMethodManager inputMethodManager = (InputMethodManager) mn.I().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(mn.Y, 1);
                    return;
                }
                return;
            case 19:
                E4 e4 = (E4) this.b;
                e4.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) e4.e;
                Ks ks = sideSheetBehavior.i;
                if (ks != null && ks.f()) {
                    e4.a(e4.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(e4.b);
                        return;
                    }
                    return;
                }
            case 20:
                View view = (View) this.b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 21:
                final TboxMonitorService tboxMonitorService = (TboxMonitorService) this.b;
                if (tboxMonitorService.b.getBoolean("tboxSwitch", false)) {
                    CompletableFuture.supplyAsync(new C0272ip("iptables -S FORWARD | grep ccinet")).thenAccept(new Consumer() { // from class: lq
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) throws Throwable {
                            C0302jp c0302jp = (C0302jp) obj;
                            int i12 = TboxMonitorService.d;
                            TboxMonitorService tboxMonitorService2 = tboxMonitorService;
                            tboxMonitorService2.getClass();
                            if (c0302jp.c.isEmpty()) {
                                if (c0302jp.b.contains("REJECT")) {
                                    C0768yr.e("T500.TBOX", "TBOX правило существует");
                                    return;
                                }
                                C0768yr.e("T500.TBOX", "TBOX правило отсутствует. Включаем блокировку");
                                new Handler(tboxMonitorService2.getMainLooper()).post(new RunnableC0248i0(tboxMonitorService2));
                                Tf.U("iptables -I FORWARD -o ccinet+ -j REJECT");
                            }
                        }
                    });
                    return;
                }
                return;
            case 22:
                ((TextInputLayout) this.b).d.requestLayout();
                return;
            case 23:
                Dq dq = (Dq) this.b;
                String str7 = dq.T.z;
                SharedPreferences sharedPreferencesT3 = dq.T();
                if (!sharedPreferencesT3.getBoolean("useDefaultSwitchCommon", true) || str7.equals("Default")) {
                    SharedPreferences.Editor editorEdit3 = sharedPreferencesT3.edit();
                    editorEdit3.putBoolean("speedFromLeft", true);
                    editorEdit3.putBoolean("bigMeters", false);
                    editorEdit3.putBoolean("infoInCenter", false);
                    editorEdit3.putBoolean("speedInCenter", false);
                    editorEdit3.putBoolean("transparentBackgroundInCenter", false);
                    editorEdit3.putBoolean("showLabelInMeter", true);
                    editorEdit3.apply();
                    dq.c0();
                    if (dq.d0()) {
                        dq.X("ALL");
                        return;
                    }
                    return;
                }
                return;
            default:
                int i12 = YnActivatingService.d;
                YnActivatingService ynActivatingService = (YnActivatingService) this.b;
                ynActivatingService.getClass();
                String strZ = Ud.z();
                try {
                    Class<?> cls = Class.forName("android.app.ActivityManager");
                    Object objInvoke = cls.getMethod("getService", null).invoke(cls, null);
                    iIntValue = ((Integer) objInvoke.getClass().getMethod("getStackIdOnDisplay", String.class, Integer.TYPE).invoke(objInvoke, strZ, 2)).intValue();
                    break;
                } catch (Exception e) {
                    Toast.makeText(ynActivatingService, "ERROR" + e, 1).show();
                    iIntValue = -1;
                }
                C0768yr.e("T500.YN_ACTIVATE", "display=2, navi stackid=" + iIntValue);
                if (ynActivatingService.b || !ynActivatingService.a.getBoolean("useNaviActivation", true) || iIntValue == -1) {
                    return;
                }
                UsageStatsManager usageStatsManager = (UsageStatsManager) ynActivatingService.getSystemService("usagestats");
                long jCurrentTimeMillis = System.currentTimeMillis();
                UsageEvents usageEventsQueryEvents = usageStatsManager.queryEvents(jCurrentTimeMillis - 60000, jCurrentTimeMillis);
                UsageEvents.Event event = new UsageEvents.Event();
                boolean z2 = false;
                while (usageEventsQueryEvents.hasNextEvent()) {
                    usageEventsQueryEvents.getNextEvent(event);
                    String packageName = event.getPackageName();
                    C0768yr.e("T500.YN_ACTIVATE", "packageName=" + packageName);
                    if (packageName.equals(Ud.z())) {
                        int eventType = event.getEventType();
                        if (eventType == 1) {
                            str = "Moved to foreground";
                            z2 = false;
                        } else if (eventType != 2) {
                            str = "Unknown event";
                        } else {
                            str = "Moved to background";
                            z2 = true;
                        }
                        C0768yr.e("T500.YN_ACTIVATE", "Navigation App eventDescription=".concat(str));
                    }
                }
                if (z2) {
                    C0768yr.e("T500.YN_ACTIVATE", "Navigation App is NOT TOP");
                    Intent launchIntentForPackage = ynActivatingService.getPackageManager().getLaunchIntentForPackage(Ud.z());
                    if (launchIntentForPackage != null) {
                        ynActivatingService.startActivity(launchIntentForPackage);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
