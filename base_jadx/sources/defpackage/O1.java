package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.HudActivity;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.SpedometerPanel;

/* JADX INFO: loaded from: classes.dex */
public final class O1 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:84:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x018c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0194  */
    /* JADX WARN: Code duplicated, block: B:96:0x0258  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Af af;
        boolean zS;
        K2 k2;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((AbstractC0093d) obj).i();
                break;
            case 1:
                if (intent != null) {
                    String action = intent.getAction();
                    action.getClass();
                    HudActivity hudActivity = (HudActivity) obj;
                    switch (action) {
                        case "ru.zinovin.tankspeedometer.T500_HUD_STOP":
                            hudActivity.finish();
                            break;
                        case "ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER":
                            hudActivity.findViewById(R.id.hud_main).setVisibility(0);
                            TextView textView = (TextView) hudActivity.findViewById(R.id.hud_distance);
                            TextView textView2 = (TextView) hudActivity.findViewById(R.id.hud_unit);
                            TextView textView3 = (TextView) hudActivity.findViewById(R.id.hud_street);
                            String stringExtra = intent.getStringExtra("distance");
                            String stringExtra2 = intent.getStringExtra("unit");
                            String stringExtra3 = intent.getStringExtra("imageId");
                            String stringExtra4 = intent.getStringExtra("street");
                            textView.setText(stringExtra);
                            textView2.setText(stringExtra2);
                            if (stringExtra4 != null) {
                                textView3.setVisibility(0);
                                textView3.setEllipsize(TextUtils.TruncateAt.END);
                                textView3.setMaxLines(1);
                                textView3.setText(stringExtra4);
                            } else {
                                textView3.setVisibility(8);
                            }
                            ((ImageView) hudActivity.findViewById(R.id.hud_image)).setImageResource(hudActivity.getResources().getIdentifier(stringExtra3, "drawable", hudActivity.getPackageName()));
                            break;
                        case "ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER_VISIBILITY":
                            hudActivity.findViewById(R.id.hud_main).setVisibility(intent.getBooleanExtra("visibility", false) ? 0 : 4);
                            break;
                    }
                }
                break;
            case 2:
                if (intent != null) {
                    String action2 = intent.getAction();
                    action2.getClass();
                    Kf kf = (Kf) obj;
                    if (!action2.equals("ru.zinovin.tankspeedometer.T500_IP_STOP")) {
                        if (action2.equals("ru.zinovin.tankspeedometer.T500_INDICATOR_COLOR_CHANGED")) {
                            kf.d();
                            break;
                        }
                    } else {
                        kf.stopSelf();
                        break;
                    }
                }
                break;
            default:
                if (intent != null) {
                    String action3 = intent.getAction();
                    action3.getClass();
                    if (action3.equals("ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED")) {
                        int i = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel = (SpedometerPanel) obj;
                        spedometerPanel.getClass();
                        if (intent.getStringExtra("pref_key") != null) {
                            C0768yr.e("T500.ACTIVITY", "Changed themed preference " + intent.getStringExtra("pref_key"));
                            String stringExtra5 = intent.getStringExtra("pref_key");
                            stringExtra5.getClass();
                            Lf lf = spedometerPanel.c;
                            switch (stringExtra5) {
                                case "selectedBackground":
                                    spedometerPanel.Y = F4.O();
                                    spedometerPanel.r();
                                    spedometerPanel.G();
                                    break;
                                case "naviFullscreen":
                                    boolean z = spedometerPanel.b.getBoolean("usePreferences", true);
                                    boolean zP = Td.p("naviFullscreen");
                                    spedometerPanel.d0 = zP;
                                    lf.w.f(Boolean.valueOf(zP));
                                    C0768yr.e("T500.ACTIVITY", "processSettingsChanges.naviFullscreen=" + spedometerPanel.d0);
                                    if (Ud.A() == -1 || !z) {
                                    }
                                    boolean zP2 = Td.p("useNavi");
                                    spedometerPanel.c0 = zP2;
                                    lf.i(Boolean.valueOf(zP2));
                                    Ud.p0(false);
                                    if (spedometerPanel.c0) {
                                        Ud.n0(spedometerPanel.d0);
                                    }
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                    break;
                                case "infoInCenter":
                                    af = spedometerPanel.Z;
                                    zS = Br.s("infoInCenter", false);
                                    if (zS) {
                                        k2 = af.b.b;
                                    } else {
                                        k2 = af.b.a;
                                    }
                                    if (zS != af.f) {
                                        af.c = Math.min(k2.w().length - 1, 0);
                                        af.d = Math.min(k2.y().length - 1, 0);
                                        af.e = Math.min(k2.l().length - 1, 0);
                                    }
                                    af.f();
                                    C0768yr.e("T500.INFO_PANEL", "changed centralMode=" + zS);
                                    C0768yr.e("T500.INFO_PANEL", "indexL=" + af.c);
                                    C0768yr.e("T500.INFO_PANEL", "indexR=" + af.d);
                                    C0768yr.e("T500.INFO_PANEL", "indexC=" + af.e);
                                    af.f = zS;
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                    break;
                                case "bgMode":
                                    spedometerPanel.Y = F4.O();
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.r();
                                    spedometerPanel.G();
                                    break;
                                case "useNavi":
                                    boolean zP3 = Td.p("useNavi");
                                    spedometerPanel.c0 = zP3;
                                    lf.i(Boolean.valueOf(zP3));
                                    Ud.p0(false);
                                    if (spedometerPanel.c0) {
                                        Ud.n0(spedometerPanel.d0);
                                    }
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                    break;
                                case "useDefaultSwitch":
                                case "ALL":
                                    spedometerPanel.v(spedometerPanel.D());
                                    break;
                                case "showLabelInMeter":
                                    spedometerPanel.m = Br.s("showLabelInMeter", true);
                                    if (!spedometerPanel.h) {
                                        spedometerPanel.I();
                                        break;
                                    }
                                    break;
                                case "transparentBackgroundInCenter":
                                case "speedInCenter":
                                    spedometerPanel.Z = new Af(spedometerPanel.getApplicationContext(), spedometerPanel);
                                    af = spedometerPanel.Z;
                                    zS = Br.s("infoInCenter", false);
                                    if (zS) {
                                        k2 = af.b.b;
                                    } else {
                                        k2 = af.b.a;
                                    }
                                    if (zS != af.f) {
                                        af.c = Math.min(k2.w().length - 1, 0);
                                        af.d = Math.min(k2.y().length - 1, 0);
                                        af.e = Math.min(k2.l().length - 1, 0);
                                    }
                                    af.f();
                                    C0768yr.e("T500.INFO_PANEL", "changed centralMode=" + zS);
                                    C0768yr.e("T500.INFO_PANEL", "indexL=" + af.c);
                                    C0768yr.e("T500.INFO_PANEL", "indexR=" + af.d);
                                    C0768yr.e("T500.INFO_PANEL", "indexC=" + af.e);
                                    af.f = zS;
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                    break;
                                case "bigMeters":
                                    boolean zS2 = Br.s("bigMeters", false);
                                    spedometerPanel.k = zS2;
                                    spedometerPanel.b0.b(spedometerPanel.X, zS2);
                                    C0768yr.e("T500.ACTIVITY", "bigMeters=" + spedometerPanel.k);
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                    break;
                                case "useSysNavi":
                                    if (Td.p("useSysNavi")) {
                                        Ud.p0(false);
                                    } else if (spedometerPanel.c0) {
                                        Ud.n0(spedometerPanel.d0);
                                    }
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                    break;
                                case "speedFromLeft":
                                    spedometerPanel.n = Br.s("speedFromLeft", true);
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                    break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
