package ru.zinovin.tankspeedometer;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.AbstractC0510qg;
import defpackage.H7;
import defpackage.If;
import defpackage.Kf;
import defpackage.Lf;
import defpackage.Mj;
import defpackage.Tf;
import defpackage.U2;
import defpackage.Ud;
import ru.zinovin.tankspeedometer.BasicInstrumentalPanel;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class BasicInstrumentalPanel extends Kf {
    public static final /* synthetic */ int B = 0;
    public ImageView A;
    public U2 u;
    public TextView v;
    public AbstractC0510qg w;
    public AbstractC0510qg x;
    public AbstractC0510qg y;
    public AbstractC0510qg z;

    @Override // defpackage.Kf
    public final void d() {
        AbstractC0510qg abstractC0510qg = this.w;
        if (abstractC0510qg != null) {
            abstractC0510qg.a();
        }
        AbstractC0510qg abstractC0510qg2 = this.x;
        if (abstractC0510qg2 != null) {
            abstractC0510qg2.a();
        }
        AbstractC0510qg abstractC0510qg3 = this.y;
        if (abstractC0510qg3 != null) {
            abstractC0510qg3.a();
        }
        AbstractC0510qg abstractC0510qg4 = this.z;
        if (abstractC0510qg4 != null) {
            abstractC0510qg4.a();
        }
    }

    @Override // defpackage.Kf
    public final void e() {
        If r0 = new If(this, 0);
        Lf lf = this.c;
        Lf.f(lf.x, this, r0);
        Lf.f(lf.B, this, new If(this, 1));
        final int i = 6;
        Lf.f(lf.t, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i2 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i3 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i4 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i5 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i6 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i7 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i8 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i9 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i10 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i2 = 0;
                            }
                            textView.setVisibility(i2);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i2 = 0;
                            }
                            textView2.setVisibility(i2);
                        }
                        break;
                    default:
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i2 = 12;
        Lf.f(lf.d, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i3 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i2) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i4 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i5 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i6 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i7 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i8 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i9 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i10 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i3 = 0;
                            }
                            textView.setVisibility(i3);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i3 = 0;
                            }
                            textView2.setVisibility(i3);
                        }
                        break;
                    default:
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i3 = 13;
        Lf.f(lf.c, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i4 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i3) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i5 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i6 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i7 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i8 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i9 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i10 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i4 = 0;
                            }
                            textView.setVisibility(i4);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i4 = 0;
                            }
                            textView2.setVisibility(i4);
                        }
                        break;
                    default:
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i4 = 14;
        Lf.f(lf.p, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i5 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i4) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i6 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i7 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i8 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i9 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i10 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i11 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i5 = 0;
                            }
                            textView.setVisibility(i5);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i5 = 0;
                            }
                            textView2.setVisibility(i5);
                        }
                        break;
                    default:
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i5 = 0;
        Lf.f(lf.f, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i6 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i5) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i7 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i8 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i9 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i10 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i12 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i6 = 0;
                            }
                            textView.setVisibility(i6);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i6 = 0;
                            }
                            textView2.setVisibility(i6);
                        }
                        break;
                    default:
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i6 = 1;
        Lf.f(lf.g, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i7 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i6) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i8 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i9 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i10 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i13 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i7 = 0;
                            }
                            textView.setVisibility(i7);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i7 = 0;
                            }
                            textView2.setVisibility(i7);
                        }
                        break;
                    default:
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i7 = 2;
        Lf.f(lf.h, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i8 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i7) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i9 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i10 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i14 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i8 = 0;
                            }
                            textView.setVisibility(i8);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i8 = 0;
                            }
                            textView2.setVisibility(i8);
                        }
                        break;
                    default:
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i8 = 3;
        Lf.f(lf.e, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i9 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i8) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i10 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i15 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i9 = 0;
                            }
                            textView.setVisibility(i9);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i9 = 0;
                            }
                            textView2.setVisibility(i9);
                        }
                        break;
                    default:
                        int i110 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i9 = 4;
        Lf.f(lf.f, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i10 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i9) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i11 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i16 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i110 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i10 = 0;
                            }
                            textView2.setVisibility(i10);
                        }
                        break;
                    default:
                        int i111 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i10 = 5;
        Lf.f(lf.F, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i11 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i10) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i12 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i17 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i110 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i111 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i11 = 0;
                            }
                            textView.setVisibility(i11);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i11 = 0;
                            }
                            textView2.setVisibility(i11);
                        }
                        break;
                    default:
                        int i112 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i11 = 7;
        Lf.f(lf.i, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i12 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i11) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i13 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i18 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i110 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i111 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i112 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i12 = 0;
                            }
                            textView.setVisibility(i12);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i12 = 0;
                            }
                            textView2.setVisibility(i12);
                        }
                        break;
                    default:
                        int i113 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i12 = 8;
        Lf.f(lf.j, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i13 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i12) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i14 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i19 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i110 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i111 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i112 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i113 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i13 = 0;
                            }
                            textView.setVisibility(i13);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i13 = 0;
                            }
                            textView2.setVisibility(i13);
                        }
                        break;
                    default:
                        int i114 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i13 = 9;
        Lf.f(lf.r, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i14 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i13) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i15 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i110 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i111 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i112 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i113 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i114 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i14 = 0;
                            }
                            textView.setVisibility(i14);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i14 = 0;
                            }
                            textView2.setVisibility(i14);
                        }
                        break;
                    default:
                        int i115 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i14 = 10;
        Lf.f(lf.s, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i15 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i14) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i16 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i110 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i111 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i112 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i113 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i114 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i115 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i15 = 0;
                            }
                            textView.setVisibility(i15);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i15 = 0;
                            }
                            textView2.setVisibility(i15);
                        }
                        break;
                    default:
                        int i116 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
        final int i15 = 11;
        Lf.f(lf.x, this, new Mj(this) { // from class: k4
            public final /* synthetic */ BasicInstrumentalPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                int i16 = 4;
                BasicInstrumentalPanel basicInstrumentalPanel = this.b;
                switch (i15) {
                    case 0:
                        Float f = (Float) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel2 = this.b;
                        AbstractC0510qg abstractC0510qg = basicInstrumentalPanel2.z;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel2.k(R.id.evBattery, f, "%", basicInstrumentalPanel2.d, -1, "%.1f");
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i17 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel3 = this.b;
                        basicInstrumentalPanel3.getClass();
                        float fU = f2.floatValue() < 100.0f ? Tf.u() * f2.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = basicInstrumentalPanel3.w;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        basicInstrumentalPanel3.k(R.id.fuel, Float.valueOf(fU), " L", basicInstrumentalPanel3.d, -1, "%.0f");
                        break;
                    case 2:
                        int i18 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel4 = this.b;
                        basicInstrumentalPanel4.getClass();
                        float fFloatValue = ((Float) obj).floatValue() * 0.5f;
                        float f3 = fFloatValue / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = basicInstrumentalPanel4.x;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f3);
                        }
                        basicInstrumentalPanel4.k(R.id.fuel_sec, Float.valueOf(fFloatValue), " L", basicInstrumentalPanel4.d, -1, "%.0f");
                        break;
                    case 3:
                        int i19 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel5 = this.b;
                        basicInstrumentalPanel5.k(R.id.battery, (Float) obj, "V", basicInstrumentalPanel5.d, -1, "%.1f");
                        break;
                    case 4:
                        int i110 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel6 = this.b;
                        basicInstrumentalPanel6.getClass();
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        basicInstrumentalPanel6.k(R.id.evBattery, (Float) obj, "%", basicInstrumentalPanel6.d, -1, "%.1f");
                        break;
                    case 5:
                        Float f4 = (Float) obj;
                        int i111 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel7 = this.b;
                        basicInstrumentalPanel7.getClass();
                        if (f4.floatValue() <= 0.0f) {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, "---", " km", basicInstrumentalPanel7.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel7.k(R.id.evRemainOdometer, f4, " km", basicInstrumentalPanel7.d, -1, "%.0f");
                        }
                        break;
                    case 6:
                        int iIntValue = ((Integer) obj).intValue();
                        int i112 = BasicInstrumentalPanel.B;
                        if (!basicInstrumentalPanel.h && iIntValue == 2) {
                            Ud.T();
                        }
                        break;
                    case 7:
                        Float f5 = (Float) obj;
                        int i113 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel8 = this.b;
                        basicInstrumentalPanel8.getClass();
                        if (f5.floatValue() <= 0.0f) {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, "---", " km", basicInstrumentalPanel8.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel8.k(R.id.remainOdometer, f5, " km", basicInstrumentalPanel8.d, -1, "%.0f");
                        }
                        break;
                    case 8:
                        Float f6 = (Float) obj;
                        int i114 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel9 = this.b;
                        basicInstrumentalPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, "---", " km", basicInstrumentalPanel9.d, -1, "%s");
                        } else {
                            basicInstrumentalPanel9.k(R.id.remainSubOdometer, f6, " km", basicInstrumentalPanel9.d, -1, "%.0f");
                        }
                        break;
                    case 9:
                        Float f7 = (Float) obj;
                        int i115 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel10 = this.b;
                        basicInstrumentalPanel10.k(R.id.coolant, f7, " °C", basicInstrumentalPanel10.d, -1, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = basicInstrumentalPanel10.y;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f7.floatValue());
                        }
                        break;
                    case 10:
                        Float f8 = (Float) obj;
                        int i116 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel11 = this.b;
                        if (basicInstrumentalPanel11.c.s.l) {
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTemp), 0);
                            Kf.p(basicInstrumentalPanel11.c(R.id.outsideTempText), 0);
                            basicInstrumentalPanel11.k(R.id.outsideTemp, f8, "", basicInstrumentalPanel11.d, -1, "%.0f");
                        }
                        break;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = basicInstrumentalPanel.A;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(basicInstrumentalPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 12:
                        Integer num = (Integer) obj;
                        BasicInstrumentalPanel basicInstrumentalPanel12 = this.b;
                        TextView textView = basicInstrumentalPanel12.v;
                        if (textView != null) {
                            if (((Integer) basicInstrumentalPanel12.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i16 = 0;
                            }
                            textView.setVisibility(i16);
                        }
                        basicInstrumentalPanel12.k(R.id.gear, num, "", basicInstrumentalPanel12.d, -1, "%d");
                        break;
                    case 13:
                        Integer num2 = (Integer) obj;
                        TextView textView2 = basicInstrumentalPanel.v;
                        if (textView2 != null) {
                            if (num2.intValue() == 2 && ((Integer) basicInstrumentalPanel.c.d.d()).intValue() != 0) {
                                i16 = 0;
                            }
                            textView2.setVisibility(i16);
                        }
                        break;
                    default:
                        int i117 = BasicInstrumentalPanel.B;
                        BasicInstrumentalPanel basicInstrumentalPanel13 = this.b;
                        basicInstrumentalPanel13.k(R.id.odoTotal, (Float) obj, " km", basicInstrumentalPanel13.d, -1, "%.0f");
                        break;
                }
            }
        });
    }

    @Override // defpackage.Kf
    public final void f() {
        U2 u2 = new U2(this, 2);
        this.u = u2;
        this.b.registerOnSharedPreferenceChangeListener(u2);
    }

    @Override // defpackage.Kf
    public final void g() {
        this.w = (AbstractC0510qg) c(R.id.fuelLevelIndicator);
        this.x = (AbstractC0510qg) c(R.id.fuelLevelIndicator2);
        this.y = (AbstractC0510qg) c(R.id.coolantIndicator);
        this.z = (AbstractC0510qg) c(R.id.batteryIndicator);
        this.A = (ImageView) c(R.id.wifiImg);
        this.v = (TextView) c(R.id.gear);
        AbstractC0510qg abstractC0510qg = this.z;
        Lf lf = this.c;
        if (abstractC0510qg != null) {
            abstractC0510qg.setLevelValue(((Float) lf.f.d()).floatValue());
        }
        float fFloatValue = lf.c().floatValue();
        float fU = fFloatValue < 100.0f ? Tf.u() * fFloatValue : Tf.t();
        float fT = (fU / Tf.t()) * 100.0f;
        AbstractC0510qg abstractC0510qg2 = this.w;
        if (abstractC0510qg2 != null) {
            abstractC0510qg2.setLevelValue(fT);
        }
        k(R.id.fuel, Float.valueOf(fU), " L", this.d, -1, "%.0f");
        float fFloatValue2 = ((Float) lf.h.d()).floatValue() * 0.5f;
        float f = fFloatValue2 / 0.5f;
        AbstractC0510qg abstractC0510qg3 = this.x;
        if (abstractC0510qg3 != null) {
            abstractC0510qg3.setLevelValue(f);
        }
        k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", this.d, -1, "%.0f");
        k(R.id.odoTotal, (Float) lf.p.d(), " km", this.d, -1, "%.0f");
        if (((Float) lf.i.d()).floatValue() > 0.0f) {
            k(R.id.remainOdometer, (Float) lf.i.d(), " km", this.d, -1, "%.0f");
        } else {
            k(R.id.remainOdometer, "---", " km", this.d, -1, "%s");
        }
        if (((Float) lf.j.d()).floatValue() > 0.0f) {
            k(R.id.remainSubOdometer, (Float) lf.j.d(), " km", this.d, -1, "%.0f");
        } else {
            k(R.id.remainSubOdometer, "---", " km", this.d, -1, "%s");
        }
        if (((Float) lf.F.d()).floatValue() > 0.0f) {
            k(R.id.evRemainOdometer, (Float) lf.F.d(), " km", this.d, -1, "%.0f");
        } else {
            k(R.id.evRemainOdometer, "---", " km", this.d, -1, "%s");
        }
        if (lf.b().floatValue() > -1000.0f) {
            k(R.id.outsideTemp, lf.b(), "", this.d, this.e, "%.0f");
            lf.s.f(lf.b());
        }
        Float f2 = (Float) lf.r.d();
        float fFloatValue3 = f2.floatValue();
        k(R.id.coolant, f2, " °C", this.d, -1, "%.0f");
        AbstractC0510qg abstractC0510qg4 = this.y;
        if (abstractC0510qg4 != null) {
            abstractC0510qg4.setLevelValue(fFloatValue3);
        }
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setImageDrawable(H7.b(this, ((Boolean) lf.x.d()).booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
        }
    }

    @Override // defpackage.Kf
    public final void m() {
        n("basic_instrumental_panel");
        ConstraintLayout constraintLayout = (ConstraintLayout) c(R.id.naviBorder);
        if (constraintLayout != null) {
            constraintLayout.removeAllViews();
        }
        Lf lf = this.c;
        boolean zBooleanValue = ((Boolean) lf.w.d()).booleanValue();
        Ud.A();
        String string = this.b.getString("carModel", "tank_500");
        if (string.equals("tank_700") || string.equals("tank_700eo") || string.equals("tank_400") || string.equals("tank_500bt")) {
            c(R.id.main).setBackgroundResource(R.drawable.digital_background_navi_full);
        }
        if (this.b.getBoolean("extFirmware", true) && string.equals("tank_500")) {
            Kf.p(c(R.id.odoTotal), 4);
        }
        if (((Boolean) lf.v.d()).booleanValue()) {
            a(false, zBooleanValue);
        }
    }

    @Override // defpackage.Kf, android.app.Service
    public final void onDestroy() {
        U2 u2 = this.u;
        if (u2 != null) {
            this.b.unregisterOnSharedPreferenceChangeListener(u2);
        }
        super.onDestroy();
    }
}
