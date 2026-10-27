package defpackage;

import android.content.SharedPreferences;
import android.graphics.Paint;
import android.widget.FrameLayout;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.SpedometerPanel;

/* JADX INFO: renamed from: ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0263ig extends C0096d2 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0263ig(Mf mf, SpedometerPanel spedometerPanel, int i) {
        super(mf, 11, spedometerPanel);
        this.e = i;
    }

    @Override // defpackage.C0096d2
    public final void X(Boolean bool) {
        switch (this.e) {
            case 0:
                Kf.p(((SpedometerPanel) this.c).c(R.id.rightLevelIndicator), bool.booleanValue() ? 0 : 4);
                break;
            default:
                SpedometerPanel spedometerPanel = (SpedometerPanel) this.c;
                Kf.p(spedometerPanel.c(R.id.battery), bool.booleanValue() ? 0 : 4);
                String string = AbstractC0390mk.l(AbstractC0402n1.a()).getString("carModel", "tank_500");
                if (string.equals("tank_700eo") || string.equals("wey_07") || string.equals("wey_80") || string.equals("tank_300")) {
                    Kf.p(spedometerPanel.c(R.id.coolant), bool.booleanValue() ? 0 : 4);
                } else {
                    Kf.p(spedometerPanel.c(R.id.evBattery), bool.booleanValue() ? 0 : 4);
                }
                break;
        }
    }

    @Override // defpackage.C0096d2
    public void o() {
        AbstractC0510qg abstractC0510qg;
        switch (this.e) {
            case 0:
                SpedometerPanel spedometerPanel = (SpedometerPanel) this.c;
                FrameLayout frameLayout = (FrameLayout) spedometerPanel.c(R.id.leftLevelIndicator);
                FrameLayout frameLayout2 = (FrameLayout) spedometerPanel.c(R.id.rightLevelIndicator);
                if (frameLayout == null || frameLayout2 == null) {
                    abstractC0510qg = null;
                    spedometerPanel.C = null;
                    spedometerPanel.E = null;
                } else {
                    frameLayout.removeAllViews();
                    frameLayout2.removeAllViews();
                    V2 v2 = new V2(spedometerPanel);
                    v2.c = 0.0f;
                    v2.d = 63.0f;
                    v2.e = 117.0f;
                    v2.f = 1.0f;
                    v2.g = 0.04f;
                    v2.h = 7;
                    v2.i = 20.0f;
                    v2.j = 12.5f;
                    v2.k = -10079251;
                    v2.l = -256;
                    v2.m = -65536;
                    U2 u2 = new U2(v2, 0);
                    v2.b = u2;
                    SharedPreferences sharedPreferences = v2.a;
                    sharedPreferences.registerOnSharedPreferenceChangeListener(u2);
                    v2.setColor(Tf.w("fuel_color"));
                    v2.setLowColor(Tf.w("fuel_low_color"));
                    v2.setCriticalColor(Tf.w("fuel_critical_color"));
                    v2.setNormalLevel(Float.parseFloat(sharedPreferences.getString("fuel_low_level", "20.0")));
                    v2.setWarnLevel(Float.parseFloat(sharedPreferences.getString("fuel_critical_level", "12.5")));
                    Paint paint = new Paint();
                    v2.n = paint;
                    paint.setColor(v2.k);
                    Paint paint2 = v2.n;
                    Paint.Style style = Paint.Style.STROKE;
                    paint2.setStyle(style);
                    v2.n.setStrokeWidth(v2.h);
                    Paint paint3 = new Paint();
                    v2.o = paint3;
                    paint3.setColor(v2.l);
                    v2.o.setStyle(style);
                    v2.o.setStrokeWidth(v2.h);
                    Paint paint4 = new Paint();
                    v2.p = paint4;
                    paint4.setColor(v2.m);
                    v2.p.setStyle(style);
                    v2.p.setStrokeWidth(v2.h);
                    W2 w2 = new W2(spedometerPanel);
                    w2.c = 0.0f;
                    w2.d = 130.0f;
                    w2.e = 50.0f;
                    w2.f = 55.0f;
                    w2.g = 70.0f;
                    w2.h = 0.04f;
                    w2.i = 7;
                    w2.j = -10079251;
                    w2.k = -256;
                    w2.l = -65536;
                    w2.m = 63.0f;
                    w2.n = 117.0f;
                    w2.o = 1.0f;
                    U2 u3 = new U2(w2, 1);
                    w2.b = u3;
                    SharedPreferences sharedPreferences2 = w2.a;
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(u3);
                    w2.setColor(Tf.w("coolant_color"));
                    w2.setWarnColor(Tf.w("coolant_warn_color"));
                    w2.setCriticalColor(Tf.w("coolant_critical_color"));
                    w2.setWarnLevel(Float.parseFloat(sharedPreferences2.getString("coolant_warn_level", "105.0")));
                    w2.setCriticalLevel(Float.parseFloat(sharedPreferences2.getString("coolant_critical_level", "120.0")));
                    Paint paint5 = new Paint();
                    w2.p = paint5;
                    paint5.setColor(w2.j);
                    w2.p.setStyle(style);
                    w2.p.setStrokeWidth(w2.i);
                    Paint paint6 = new Paint();
                    w2.q = paint6;
                    paint6.setColor(w2.k);
                    w2.q.setStyle(style);
                    w2.q.setStrokeWidth(w2.i);
                    Paint paint7 = new Paint();
                    w2.r = paint7;
                    paint7.setColor(w2.l);
                    w2.r.setStyle(style);
                    w2.r.setStrokeWidth(w2.i);
                    if (spedometerPanel.n) {
                        frameLayout.addView(v2);
                        frameLayout2.addView(w2);
                    } else {
                        frameLayout.addView(w2);
                        frameLayout2.addView(v2);
                    }
                    spedometerPanel.C = v2;
                    spedometerPanel.E = w2;
                    abstractC0510qg = null;
                }
                spedometerPanel.D = abstractC0510qg;
                break;
            default:
                super.o();
                break;
        }
    }
}
