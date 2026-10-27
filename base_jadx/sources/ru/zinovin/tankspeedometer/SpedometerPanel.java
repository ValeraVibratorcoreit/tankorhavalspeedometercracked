package ru.zinovin.tankspeedometer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.AbstractC0390mk;
import defpackage.AbstractC0402n1;
import defpackage.AbstractC0510qg;
import defpackage.AbstractC0787zf;
import defpackage.Af;
import defpackage.Bn;
import defpackage.Bq;
import defpackage.Br;
import defpackage.C0048bg;
import defpackage.C0096d2;
import defpackage.C0426np;
import defpackage.C0473pa;
import defpackage.C0605tj;
import defpackage.C0636uj;
import defpackage.C0768yr;
import defpackage.F4;
import defpackage.H7;
import defpackage.If;
import defpackage.K2;
import defpackage.Kf;
import defpackage.Lf;
import defpackage.Mf;
import defpackage.Mj;
import defpackage.O1;
import defpackage.Rb;
import defpackage.RunnableC0524r0;
import defpackage.Si;
import defpackage.Td;
import defpackage.Tf;
import defpackage.U2;
import defpackage.Ud;
import ipc.fdbus.Fdbus;
import ipc.fdbus.FdbusClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.HashMap;
import ru.zinovin.tankspeedometer.R;
import ru.zinovin.tankspeedometer.SpedometerPanel;
import ru.zinovin.tankspeedometer.view.GradientCircleView;
import ru.zinovin.tankspeedometer.view.speedometer.SpeedometerView;

/* JADX INFO: loaded from: classes.dex */
public class SpedometerPanel extends Kf {
    public static final /* synthetic */ int s0 = 0;
    public SpeedometerView A;
    public TextView B;
    public AbstractC0510qg C;
    public AbstractC0510qg D;
    public AbstractC0510qg E;
    public AbstractC0510qg F;
    public ImageView G;
    public ImageView H;
    public TextView I;
    public ImageView J;
    public TextView K;
    public ImageView L;
    public ImageView M;
    public GradientCircleView N;
    public GradientCircleView O;
    public U2 P;
    public Af Z;
    public C0048bg a0;
    public C0426np b0;
    public Rb n0;
    public SpeedometerView u;
    public SpeedometerView v;
    public SpeedometerView w;
    public SpeedometerView x;
    public SpeedometerView y;
    public SpeedometerView z;
    public float Q = 1.055f;
    public float R = 1.046f;
    public float S = 1.042f;
    public float T = 76.0f;
    public float U = 96.0f;
    public String V = "3";
    public int W = -1;
    public String X = "";
    public String Y = "BUILD_IN_NONE";
    public boolean c0 = false;
    public boolean d0 = true;
    public boolean e0 = false;
    public boolean f0 = false;
    public int g0 = 1;
    public int h0 = 1;
    public int i0 = 1;
    public int j0 = 1;
    public float k0 = 240.0f;
    public float l0 = 8.0f;
    public String m0 = "";
    public float o0 = 0.0f;
    public final Handler p0 = new Handler(Looper.getMainLooper());
    public final RunnableC0524r0 q0 = new RunnableC0524r0(this, 15);
    public final O1 r0 = new O1(this, 3);

    public static Bitmap B(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final void A(ImageView imageView, Drawable drawable) {
        if (drawable != null) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(B(drawable), 1920, 720, true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1920, 720, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
            Rect rect = this.l ? new Rect(1420, 200, 1820, 600) : new Rect(1320, 200, 1820, 600);
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawRect(rect, paint);
            imageView.setImageDrawable(new BitmapDrawable(getResources(), bitmapCreateBitmap));
        }
    }

    public final Uri C() {
        File fileD0;
        int i;
        String str = this.Y;
        if (str == null || str.equals("NONE") || this.Y.equals("BUILD_IN_NONE")) {
            return null;
        }
        if (!this.Y.startsWith("BUILD_IN")) {
            String str2 = this.Y;
            if (str2 == null || str2.isEmpty() || (fileD0 = Ud.d0(this, str2)) == null) {
                return null;
            }
            return Uri.fromFile(fileD0);
        }
        String str3 = this.Y;
        str3.getClass();
        switch (str3) {
            case "BUILD_IN_BRABUS":
                i = R.drawable.brabus_background;
                break;
            case "BUILD_IN_KIA":
                i = R.drawable.kia_background;
                break;
            case "BUILD_IN_TRX":
                i = R.drawable.trx_background_03;
                break;
            case "BUILD_IN_NIGHT":
                i = R.drawable.night_background;
                break;
            case "BUILD_IN_TRANSPARENT":
                i = R.drawable.transparent_ip_background;
                break;
            default:
                i = -1;
                break;
        }
        if (i == -1) {
            return null;
        }
        return Uri.parse("android.resource://" + getPackageName() + "/" + i);
    }

    public final C0636uj D() {
        if (Td.p("useSysNavi")) {
            return C0473pa.h;
        }
        if (F()) {
            return C0473pa.g;
        }
        C0473pa c0473paX = C0473pa.x();
        String str = this.X;
        c0473paX.getClass();
        AbstractC0402n1.a();
        return C0473pa.A(0, str);
    }

    public final float E(float f) {
        float f2 = this.Q;
        if (f > this.U) {
            return this.S;
        }
        return f > this.T ? this.R : f2;
    }

    public final boolean F() {
        return this.f0 && ((Mf) ((C0096d2) this.b0.c).b).z;
    }

    public final void G() {
        String[] strArr;
        String[] strArr2;
        long j;
        long j2;
        Handler handler = this.p0;
        RunnableC0524r0 runnableC0524r0 = this.q0;
        handler.removeCallbacks(runnableC0524r0);
        String strH = Ud.H("bgMode", "static");
        if ("static".equals(strH)) {
            j2 = -1;
        } else {
            Calendar calendar = Calendar.getInstance();
            int i = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
            if ("time".equals(strH)) {
                strArr = new String[]{"morning", "day", "evening", "night"};
                strArr2 = new String[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    strArr2[i2] = Ud.I(strArr[i2]);
                }
            } else {
                strArr = new String[]{"day", "night"};
                strArr2 = new String[]{Ud.G("day"), Ud.G("night")};
            }
            int i3 = 0;
            while (true) {
                if (i3 >= strArr.length) {
                    int i4 = 86400 - i;
                    String[] strArrSplit = strArr2[0].split(":");
                    j = (Integer.parseInt(strArrSplit[1]) * 60) + (Integer.parseInt(strArrSplit[0]) * 3600) + i4;
                    break;
                } else {
                    String[] strArrSplit2 = strArr2[i3].split(":");
                    int i5 = (Integer.parseInt(strArrSplit2[1]) * 60) + (Integer.parseInt(strArrSplit2[0]) * 3600);
                    if (i < i5) {
                        j = i5 - i;
                        break;
                    }
                    i3++;
                }
            }
            j2 = j * 1000;
        }
        if (j2 >= 0) {
            handler.postDelayed(runnableC0524r0, j2);
        }
    }

    public final void H() {
        String str;
        String string = this.b.getString("selectedTheme", "Audi Virtual Cockpit");
        C0768yr.e("T500.ACTIVITY", "setContentViewByTheme()-" + string);
        String string2 = this.b.getString("carModel", "tank_500");
        String str2 = F() ? ((Mf) ((C0096d2) this.b0.c).b).A : ((Mf) ((C0096d2) this.b0.c).b).a;
        C0768yr.e("T500.ACTIVITY", "layoutName=" + str2);
        C0768yr.e("T500.ACTIVITY", "microMode=" + this.f0);
        if (str2 == null || str2.isEmpty()) {
            n("speedometer_default");
        } else {
            n(str2);
        }
        Af af = this.Z;
        boolean z = this.k;
        boolean z2 = this.l;
        boolean zF = F();
        af.getClass();
        if (zF) {
            str = "_micro";
        } else {
            str = z ? "_big" : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(str);
        sb.append((z2 || string2.equals("haval_h3")) ? "" : "_oldfw");
        String string3 = sb.toString();
        C0768yr.e("T500.INFO_PANEL", "changeTheme()=" + string3);
        Bq bqA = af.a(string3, false);
        if (bqA != null) {
            Bq bqA2 = af.a(string3 + "_" + string2, false);
            if (bqA2 != null) {
                Br.X(string3 + "_" + string2);
                bqA = bqA2;
            } else {
                Br.X(string3);
            }
        } else {
            StringBuilder sb2 = new StringBuilder("speedometer_default");
            sb2.append(str);
            sb2.append(z2 ? "" : "_oldfw");
            String string4 = sb2.toString();
            bqA = af.a(string4, false);
            Bq bqA3 = af.a(string4 + "_" + string2, false);
            if (bqA3 != null) {
                Br.X(string4 + "_" + string2);
                bqA = bqA3;
            } else {
                Br.X(string4);
            }
        }
        K2 k2 = af.f ? bqA.b : bqA.a;
        if (af.b.equals(bqA)) {
            af.c = Math.min(k2.w().length - 1, Af.b("INFO_INDEX_L"));
            af.d = Math.min(k2.y().length - 1, Af.b("INFO_INDEX_R"));
            af.e = Math.min(k2.l().length - 1, Af.b("INFO_INDEX_C"));
        } else {
            af.c = Math.min(k2.w().length - 1, 0);
            af.d = Math.min(k2.y().length - 1, 0);
            af.e = Math.min(k2.l().length - 1, 0);
        }
        af.f();
        af.b = bqA;
        C0768yr.e("T500.INFO_PANEL", "centralMode=" + af.f);
        C0768yr.e("T500.INFO_PANEL", "indexL=" + af.c);
        C0768yr.e("T500.INFO_PANEL", "indexR=" + af.d);
        C0768yr.e("T500.INFO_PANEL", "indexC=" + af.e);
        C0768yr.e("T500.INFO_FR", "setContentViewByTheme");
        x(false);
    }

    public final void I() {
        if (!this.m) {
            Kf.p(this.M, 4);
            Kf.p(this.L, 4);
        } else {
            if (this.c.d().booleanValue()) {
                Kf.p(this.M, 0);
            }
            Kf.p(this.L, 0);
        }
    }

    public final void J() {
        if (this.w == null || this.x == null) {
            return;
        }
        AbstractC0787zf abstractC0787zfC = this.Z.c();
        AbstractC0787zf abstractC0787zfD = this.Z.d();
        int needleMode = this.g0;
        int needleMode2 = this.h0;
        if (abstractC0787zfC != null) {
            needleMode |= abstractC0787zfC.getNeedleMode();
        }
        if (abstractC0787zfD != null) {
            needleMode2 |= abstractC0787zfD.getNeedleMode();
        }
        C0096d2 c0096d2 = (C0096d2) this.b0.c;
        Mf mf = (Mf) c0096d2.b;
        Drawable drawableF = mf.b ? c0096d2.F(mf.n, false) : Tf.z(mf.i);
        C0096d2 c0096d3 = (C0096d2) this.b0.c;
        Mf mf2 = (Mf) c0096d3.b;
        Drawable drawableF2 = mf2.b ? c0096d3.F(mf2.o, false) : Tf.z(0);
        C0096d2 c0096d4 = (C0096d2) this.b0.c;
        Mf mf3 = (Mf) c0096d4.b;
        Drawable drawableF3 = mf3.b ? c0096d4.F(mf3.n, false) : Tf.z(mf3.i);
        C0096d2 c0096d5 = (C0096d2) this.b0.c;
        Mf mf4 = (Mf) c0096d5.b;
        Drawable drawableF4 = mf4.b ? c0096d5.F(mf4.o, false) : Tf.z(0);
        if (drawableF2 == null) {
            drawableF2 = drawableF;
            drawableF4 = drawableF3;
        }
        if ((needleMode & 2) > 0) {
            this.w.setNeedleDrawable(drawableF2);
        } else if ((needleMode & 1) > 0) {
            this.w.setNeedleDrawable(drawableF);
        }
        if ((needleMode2 & 2) > 0) {
            this.x.setNeedleDrawable(drawableF4);
        } else if ((needleMode2 & 1) > 0) {
            this.x.setNeedleDrawable(drawableF3);
        }
    }

    public final void K(Boolean bool) {
        if (this.x != null) {
            if (!bool.booleanValue()) {
                this.x.setVisibility(4);
                Kf.p(this.H, 4);
                Kf.p(this.I, 4);
                Kf.p(this.O, 4);
                Kf.p(this.M, 4);
                Kf.p(c(R.id.logoRight), 4);
                if (F()) {
                    Kf.p(c(R.id.coolant), 4);
                }
                C0426np c0426np = this.b0;
                ((C0096d2) c0426np.c).X(Boolean.FALSE);
                return;
            }
            this.x.setVisibility(0);
            this.x.setAlpha(0.0f);
            this.x.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            Kf.p(this.H, 0);
            Kf.p(this.I, 0);
            Kf.p(this.O, 0);
            if (this.e0) {
                Kf.p(c(R.id.logoRight), 0);
            }
            if (F()) {
                Kf.p(c(R.id.coolant), 0);
            }
            C0426np c0426np2 = this.b0;
            ((C0096d2) c0426np2.c).X(Boolean.TRUE);
            r();
        }
    }

    @Override // defpackage.Kf
    public final void d() {
        AbstractC0510qg abstractC0510qg = this.C;
        if (abstractC0510qg != null) {
            abstractC0510qg.a();
        }
        AbstractC0510qg abstractC0510qg2 = this.D;
        if (abstractC0510qg2 != null) {
            abstractC0510qg2.a();
        }
        AbstractC0510qg abstractC0510qg3 = this.E;
        if (abstractC0510qg3 != null) {
            abstractC0510qg3.a();
        }
        AbstractC0510qg abstractC0510qg4 = this.F;
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
        final int i = 0;
        Lf.f(lf.a, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i2;
                int i3 = 4;
                int i4 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i) {
                    case 0:
                        Float f = (Float) obj;
                        int i5 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i6 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i6, i6, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i7 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i8 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i8, i8, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i3 = 0;
                            }
                            textView.setVisibility(i3);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i9 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i2 = spedometerPanel.W) == 4 || i2 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i4 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i4 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i3 = 0;
                            }
                            textView2.setVisibility(i3);
                        }
                        break;
                    case 5:
                        int i10 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i11 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i12 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i13 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i14 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i4, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        Lf.f(lf.b, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i3;
                int i4 = 4;
                int i5 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i2) {
                    case 0:
                        Float f = (Float) obj;
                        int i6 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i7 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i7, i7, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i8 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i9 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i9, i9, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i4 = 0;
                            }
                            textView.setVisibility(i4);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i10 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i3 = spedometerPanel.W) == 4 || i3 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i5 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i5 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i4 = 0;
                            }
                            textView2.setVisibility(i4);
                        }
                        break;
                    case 5:
                        int i11 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i12 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i13 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i14 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i5, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        Lf.f(lf.d, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i4;
                int i5 = 4;
                int i6 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i3) {
                    case 0:
                        Float f = (Float) obj;
                        int i7 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i8 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i8, i8, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i9 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i10 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i10, i10, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i5 = 0;
                            }
                            textView.setVisibility(i5);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i11 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i4 = spedometerPanel.W) == 4 || i4 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i6 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i6 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i5 = 0;
                            }
                            textView2.setVisibility(i5);
                        }
                        break;
                    case 5:
                        int i12 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i13 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i14 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i6, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        Lf.f(lf.G, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i5;
                int i6 = 4;
                int i7 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i4) {
                    case 0:
                        Float f = (Float) obj;
                        int i8 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i9 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i9, i9, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i10 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i11 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i11, i11, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i6 = 0;
                            }
                            textView.setVisibility(i6);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i12 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i5 = spedometerPanel.W) == 4 || i5 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i7 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i7 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i6 = 0;
                            }
                            textView2.setVisibility(i6);
                        }
                        break;
                    case 5:
                        int i13 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i14 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i7, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 4;
        Lf.f(lf.c, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i6;
                int i7 = 4;
                int i8 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i5) {
                    case 0:
                        Float f = (Float) obj;
                        int i9 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i10 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i10, i10, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i11 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i12 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i12, i12, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i7 = 0;
                            }
                            textView.setVisibility(i7);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i13 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i6 = spedometerPanel.W) == 4 || i6 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i8 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i8 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i7 = 0;
                            }
                            textView2.setVisibility(i7);
                        }
                        break;
                    case 5:
                        int i14 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i8, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 5;
        Lf.f(lf.e, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i7;
                int i8 = 4;
                int i9 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i6) {
                    case 0:
                        Float f = (Float) obj;
                        int i10 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i11 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i11, i11, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i12 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i13 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i13, i13, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i8 = 0;
                            }
                            textView.setVisibility(i8);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i14 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i7 = spedometerPanel.W) == 4 || i7 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i9 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i9 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i8 = 0;
                            }
                            textView2.setVisibility(i8);
                        }
                        break;
                    case 5:
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i9, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i7 = 6;
        Lf.f(lf.f, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i8;
                int i9 = 4;
                int i10 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i7) {
                    case 0:
                        Float f = (Float) obj;
                        int i11 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i12 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i12, i12, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i13 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i14 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i14, i14, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i9 = 0;
                            }
                            textView.setVisibility(i9);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i15 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i8 = spedometerPanel.W) == 4 || i8 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i10 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i10 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i9 = 0;
                            }
                            textView2.setVisibility(i9);
                        }
                        break;
                    case 5:
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i10, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i8 = 7;
        Lf.f(lf.g, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i9;
                int i10 = 4;
                int i11 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i8) {
                    case 0:
                        Float f = (Float) obj;
                        int i12 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i13 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i13, i13, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i14 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i15 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i15, i15, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i16 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i9 = spedometerPanel.W) == 4 || i9 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i11 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i11 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i10 = 0;
                            }
                            textView2.setVisibility(i10);
                        }
                        break;
                    case 5:
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i11, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 8;
        Lf.f(lf.h, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i10;
                int i11 = 4;
                int i12 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i9) {
                    case 0:
                        Float f = (Float) obj;
                        int i13 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i14 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i14, i14, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i16 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i16, i16, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i11 = 0;
                            }
                            textView.setVisibility(i11);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i17 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i10 = spedometerPanel.W) == 4 || i10 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i12 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i12 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i11 = 0;
                            }
                            textView2.setVisibility(i11);
                        }
                        break;
                    case 5:
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i12, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 9;
        Lf.f(lf.F, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i11;
                int i12 = 4;
                int i13 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i10) {
                    case 0:
                        Float f = (Float) obj;
                        int i14 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i15 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i15, i15, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i17 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i17, i17, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i12 = 0;
                            }
                            textView.setVisibility(i12);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i18 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i11 = spedometerPanel.W) == 4 || i11 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i13 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i13 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i12 = 0;
                            }
                            textView2.setVisibility(i12);
                        }
                        break;
                    case 5:
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i13, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 10;
        Lf.f(lf.p, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i12;
                int i13 = 4;
                int i14 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i11) {
                    case 0:
                        Float f = (Float) obj;
                        int i15 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i16 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i16, i16, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i18 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i18, i18, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i13 = 0;
                            }
                            textView.setVisibility(i13);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i19 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i12 = spedometerPanel.W) == 4 || i12 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i14 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i14 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i13 = 0;
                            }
                            textView2.setVisibility(i13);
                        }
                        break;
                    case 5:
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i14, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i12 = 11;
        Lf.f(lf.i, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i13;
                int i14 = 4;
                int i15 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i12) {
                    case 0:
                        Float f = (Float) obj;
                        int i16 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i17 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i17, i17, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i19 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i19, i19, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i14 = 0;
                            }
                            textView.setVisibility(i14);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i110 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i13 = spedometerPanel.W) == 4 || i13 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i15 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i15 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i14 = 0;
                            }
                            textView2.setVisibility(i14);
                        }
                        break;
                    case 5:
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i15, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 12;
        Lf.f(lf.j, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i14;
                int i15 = 4;
                int i16 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i13) {
                    case 0:
                        Float f = (Float) obj;
                        int i17 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i18 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i18, i18, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i110 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i110, i110, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i15 = 0;
                            }
                            textView.setVisibility(i15);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i111 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i14 = spedometerPanel.W) == 4 || i14 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i16 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i16 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i15 = 0;
                            }
                            textView2.setVisibility(i15);
                        }
                        break;
                    case 5:
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i16, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 13;
        Lf.f(lf.s, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i15;
                int i16 = 4;
                int i17 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i14) {
                    case 0:
                        Float f = (Float) obj;
                        int i18 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i19 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i19, i19, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i111 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i111, i111, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i16 = 0;
                            }
                            textView.setVisibility(i16);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i112 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i15 = spedometerPanel.W) == 4 || i15 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i17 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i17 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i16 = 0;
                            }
                            textView2.setVisibility(i16);
                        }
                        break;
                    case 5:
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i1111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i17, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 14;
        Lf.f(lf.r, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i16;
                int i17 = 4;
                int i18 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i15) {
                    case 0:
                        Float f = (Float) obj;
                        int i19 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i110 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i110, i110, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i112 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i112, i112, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i17 = 0;
                            }
                            textView.setVisibility(i17);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i113 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i16 = spedometerPanel.W) == 4 || i16 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i18 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i18 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i17 = 0;
                            }
                            textView2.setVisibility(i17);
                        }
                        break;
                    case 5:
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i1111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i1112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i18, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i16 = 15;
        Lf.f(lf.x, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i17;
                int i18 = 4;
                int i19 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i16) {
                    case 0:
                        Float f = (Float) obj;
                        int i110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i111 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i111, i111, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i113 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i113, i113, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i18 = 0;
                            }
                            textView.setVisibility(i18);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i114 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i17 = spedometerPanel.W) == 4 || i17 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i19 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i19 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i18 = 0;
                            }
                            textView2.setVisibility(i18);
                        }
                        break;
                    case 5:
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i1111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i1112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i1113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i19, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i17 = 16;
        Lf.f(lf.B, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i18;
                int i19 = 4;
                int i110 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i17) {
                    case 0:
                        Float f = (Float) obj;
                        int i111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i112 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i112, i112, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i114 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i114, i114, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i19 = 0;
                            }
                            textView.setVisibility(i19);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i115 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i18 = spedometerPanel.W) == 4 || i18 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i110 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i110 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i19 = 0;
                            }
                            textView2.setVisibility(i19);
                        }
                        break;
                    case 5:
                        int i116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i1111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i1112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i1113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i1114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i110, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i18 = 17;
        Lf.f(lf.t, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i19;
                int i110 = 4;
                int i111 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i18) {
                    case 0:
                        Float f = (Float) obj;
                        int i112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i113 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i113, i113, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i115 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i115, i115, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i110 = 0;
                            }
                            textView.setVisibility(i110);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i116 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i19 = spedometerPanel.W) == 4 || i19 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i111 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i111 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i110 = 0;
                            }
                            textView2.setVisibility(i110);
                        }
                        break;
                    case 5:
                        int i117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i1111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i1112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i1113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i1114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i1115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i111, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        final int i19 = 18;
        Lf.f(lf.E, this, new Mj(this) { // from class: ep
            public final /* synthetic */ SpedometerPanel b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) throws Throwable {
                int i110;
                int i111 = 4;
                int i112 = 1;
                SpedometerPanel spedometerPanel = this.b;
                switch (i19) {
                    case 0:
                        Float f = (Float) obj;
                        int i113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel2 = this.b;
                        spedometerPanel2.getClass();
                        if (f.floatValue() >= 0.0f) {
                            if (spedometerPanel2.u != null) {
                                C0426np c0426np = spedometerPanel2.b0;
                                float fE = spedometerPanel2.E(f.floatValue()) * f.floatValue();
                                ((C0096d2) c0426np.c).getClass();
                                spedometerPanel2.u.c(fE);
                            }
                            Float fValueOf = Float.valueOf(spedometerPanel2.E(f.floatValue()) * f.floatValue());
                            int i114 = spedometerPanel2.e;
                            spedometerPanel2.k(R.id.speed, fValueOf, "", i114, i114, "%.0f");
                        }
                        break;
                    case 1:
                        Float f2 = (Float) obj;
                        int i115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel3 = this.b;
                        spedometerPanel3.getClass();
                        if (f2.floatValue() >= 0.0f) {
                            float fFloatValue = f2.floatValue() / 1000.0f;
                            ((C0096d2) spedometerPanel3.b0.c).getClass();
                            Math.ceil(10.0f * fFloatValue);
                            SpeedometerView speedometerView = spedometerPanel3.v;
                            if (speedometerView != null) {
                                speedometerView.c(fFloatValue);
                            }
                            if (Math.abs(fFloatValue - spedometerPanel3.o0) > 0.01d) {
                                Float fValueOf2 = Float.valueOf(fFloatValue);
                                int i116 = spedometerPanel3.e;
                                spedometerPanel3.k(R.id.rpm, fValueOf2, "", i116, i116, "%.1f");
                                spedometerPanel3.o0 = fFloatValue;
                            }
                        }
                        break;
                    case 2:
                        Integer num = (Integer) obj;
                        SpedometerPanel spedometerPanel4 = this.b;
                        TextView textView = spedometerPanel4.B;
                        if (textView != null) {
                            if (((Integer) spedometerPanel4.c.c.d()).intValue() == 2 && num.intValue() != 0) {
                                i111 = 0;
                            }
                            textView.setVisibility(i111);
                        }
                        spedometerPanel4.k(R.id.gear, num, "", spedometerPanel4.d, spedometerPanel4.e, "%d");
                        break;
                    case 3:
                        Integer num2 = (Integer) obj;
                        int i117 = SpedometerPanel.s0;
                        spedometerPanel.getClass();
                        if ((num2.intValue() == 4 || num2.intValue() == 2) && spedometerPanel.W == 3) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOff");
                            Ud.p0(false);
                            spedometerPanel.c(R.id.main).animate().alpha(0.0f).setDuration(1000L).setListener(new C0180fp());
                        } else if (num2.intValue() == 3 && ((i110 = spedometerPanel.W) == 4 || i110 == 2)) {
                            C0768yr.e("T500.ACTIVITY", "ignitionOn");
                            i112 = Ud.A() == -1 ? 0 : 1;
                            Lf lf2 = spedometerPanel.c;
                            boolean zBooleanValue = ((Boolean) lf2.v.d()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) lf2.w.d()).booleanValue();
                            if (i112 == 0 && zBooleanValue) {
                                Ud.n0(zBooleanValue2);
                            }
                            View viewC = spedometerPanel.c(R.id.main);
                            viewC.setAlpha(0.0f);
                            viewC.animate().alpha(1.0f).setDuration(1000L).setListener(new C0180fp());
                        }
                        spedometerPanel.W = num2.intValue();
                        break;
                    case 4:
                        Integer num3 = (Integer) obj;
                        TextView textView2 = spedometerPanel.B;
                        if (textView2 != null) {
                            if (num3.intValue() == 2 && ((Integer) spedometerPanel.c.d.d()).intValue() != 0) {
                                i111 = 0;
                            }
                            textView2.setVisibility(i111);
                        }
                        break;
                    case 5:
                        int i118 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel5 = this.b;
                        spedometerPanel5.k(R.id.battery, (Float) obj, "V", spedometerPanel5.d, spedometerPanel5.e, "%.1f");
                        break;
                    case 6:
                        Float f3 = (Float) obj;
                        SpedometerPanel spedometerPanel6 = this.b;
                        AbstractC0510qg abstractC0510qg = spedometerPanel6.F;
                        if (abstractC0510qg != null) {
                            abstractC0510qg.setLevelValue(f3.floatValue());
                        }
                        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
                        spedometerPanel6.k(R.id.evBattery, f3, "%", spedometerPanel6.d, spedometerPanel6.e, "%.1f");
                        break;
                    case 7:
                        Float f4 = (Float) obj;
                        int i119 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel7 = this.b;
                        spedometerPanel7.getClass();
                        float fU = f4.floatValue() < 100.0f ? Tf.u() * f4.floatValue() : Tf.t();
                        float fT = (fU / Tf.t()) * 100.0f;
                        AbstractC0510qg abstractC0510qg2 = spedometerPanel7.C;
                        if (abstractC0510qg2 != null) {
                            abstractC0510qg2.setLevelValue(fT);
                        }
                        SpeedometerView speedometerView2 = spedometerPanel7.y;
                        if (speedometerView2 != null) {
                            ((C0096d2) spedometerPanel7.b0.c).getClass();
                            speedometerView2.c(fT);
                        }
                        spedometerPanel7.k(R.id.fuel, Float.valueOf(fU), " L", spedometerPanel7.d, spedometerPanel7.e, "%.0f");
                        break;
                    case 8:
                        int i1110 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel8 = this.b;
                        spedometerPanel8.getClass();
                        float fFloatValue2 = ((Float) obj).floatValue() * 0.5f;
                        float f5 = fFloatValue2 / 0.5f;
                        AbstractC0510qg abstractC0510qg3 = spedometerPanel8.D;
                        if (abstractC0510qg3 != null) {
                            abstractC0510qg3.setLevelValue(f5);
                        }
                        SpeedometerView speedometerView3 = spedometerPanel8.z;
                        if (speedometerView3 != null) {
                            ((C0096d2) spedometerPanel8.b0.c).getClass();
                            speedometerView3.c(f5);
                        }
                        spedometerPanel8.k(R.id.fuel_sec, Float.valueOf(fFloatValue2), " L", spedometerPanel8.d, spedometerPanel8.e, "%.0f");
                        break;
                    case 9:
                        Float f6 = (Float) obj;
                        int i1111 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel9 = this.b;
                        spedometerPanel9.getClass();
                        if (f6.floatValue() <= 0.0f) {
                            spedometerPanel9.k(R.id.evRemainOdometer, "---", " km", spedometerPanel9.d, spedometerPanel9.e, "%s");
                        } else {
                            spedometerPanel9.k(R.id.evRemainOdometer, f6, " km", spedometerPanel9.d, spedometerPanel9.e, "%.0f");
                        }
                        break;
                    case 10:
                        int i1112 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel10 = this.b;
                        spedometerPanel10.k(R.id.odoTotal, (Float) obj, " km", spedometerPanel10.d, spedometerPanel10.e, "%.0f");
                        break;
                    case 11:
                        Float f7 = (Float) obj;
                        int i1113 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel11 = this.b;
                        spedometerPanel11.getClass();
                        if (f7.floatValue() <= 0.0f) {
                            spedometerPanel11.k(R.id.remainOdometer, "---", " km", spedometerPanel11.d, spedometerPanel11.e, "%s");
                        } else {
                            spedometerPanel11.k(R.id.remainOdometer, f7, " km", spedometerPanel11.d, spedometerPanel11.e, "%.0f");
                        }
                        break;
                    case 12:
                        Float f8 = (Float) obj;
                        int i1114 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel12 = this.b;
                        spedometerPanel12.getClass();
                        if (f8.floatValue() <= 0.0f) {
                            spedometerPanel12.k(R.id.remainSubOdometer, "---", " km", spedometerPanel12.d, spedometerPanel12.e, "%s");
                        } else {
                            spedometerPanel12.k(R.id.remainSubOdometer, f8, " km", spedometerPanel12.d, spedometerPanel12.e, "%.0f");
                        }
                        break;
                    case 13:
                        Float f9 = (Float) obj;
                        int i1115 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel13 = this.b;
                        if (spedometerPanel13.c.s.l) {
                            Kf.p(spedometerPanel13.c(R.id.outsideTemp), 0);
                            Kf.p(spedometerPanel13.c(R.id.outsideTempText), 0);
                            spedometerPanel13.k(R.id.outsideTemp, f9, "", spedometerPanel13.d, spedometerPanel13.e, "%.0f");
                        }
                        break;
                    case 14:
                        Float f10 = (Float) obj;
                        int i1116 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel14 = this.b;
                        spedometerPanel14.k(R.id.coolant, f10, " °C", spedometerPanel14.d, spedometerPanel14.e, "%.0f");
                        AbstractC0510qg abstractC0510qg4 = spedometerPanel14.E;
                        if (abstractC0510qg4 != null) {
                            abstractC0510qg4.setLevelValue(f10.floatValue());
                        }
                        SpeedometerView speedometerView4 = spedometerPanel14.A;
                        if (speedometerView4 != null) {
                            C0426np c0426np2 = spedometerPanel14.b0;
                            float fFloatValue3 = f10.floatValue();
                            ((C0096d2) c0426np2.c).getClass();
                            speedometerView4.c(fFloatValue3);
                        }
                        break;
                    case 15:
                        Boolean bool = (Boolean) obj;
                        ImageView imageView = spedometerPanel.G;
                        if (imageView != null) {
                            imageView.setImageDrawable(H7.b(spedometerPanel, bool.booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
                        }
                        break;
                    case 16:
                        int i1117 = SpedometerPanel.s0;
                        SpedometerPanel spedometerPanel15 = this.b;
                        spedometerPanel15.k(R.id.outsideTempText, spedometerPanel15.j, "", spedometerPanel15.d, spedometerPanel15.e, "%s");
                        break;
                    case 17:
                        int iIntValue = ((Integer) obj).intValue();
                        int i20 = SpedometerPanel.s0;
                        if (iIntValue == 1) {
                            if (!spedometerPanel.h) {
                                C0768yr.e("T500.INFO_FR", "onKeyEvent");
                                spedometerPanel.x(true);
                                spedometerPanel.J();
                            }
                            break;
                        } else {
                            Lf lf3 = spedometerPanel.c;
                            if (iIntValue == 2) {
                                if (!spedometerPanel.h) {
                                    if (Td.p("useSysNavi")) {
                                        boolean z = !spedometerPanel.c0;
                                        spedometerPanel.c0 = z;
                                        lf3.i(Boolean.valueOf(z));
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    } else if (!Ud.L()) {
                                        Ud.T();
                                    } else {
                                        if (Ud.A() != -1) {
                                            Ud.p0(false);
                                            spedometerPanel.c0 = false;
                                            lf3.i(Boolean.FALSE);
                                        } else {
                                            spedometerPanel.c0 = true;
                                            lf3.i(Boolean.TRUE);
                                            Ud.n0(spedometerPanel.d0);
                                        }
                                        spedometerPanel.t(false);
                                        spedometerPanel.r();
                                    }
                                }
                                break;
                            } else if (iIntValue == 3) {
                                if (!spedometerPanel.h && ((Mf) ((C0096d2) spedometerPanel.b0.c).b).z) {
                                    C0636uj c0636ujD = spedometerPanel.D();
                                    spedometerPanel.f0 = !spedometerPanel.f0;
                                    SharedPreferences.Editor editorEdit = spedometerPanel.b.edit();
                                    editorEdit.putBoolean("MICROMODE", spedometerPanel.f0);
                                    editorEdit.commit();
                                    spedometerPanel.v(c0636ujD);
                                    break;
                                }
                            } else if (iIntValue == 6) {
                                if (!spedometerPanel.h && !spedometerPanel.F() && Ud.A() != -1) {
                                    Ud.p0(false);
                                    boolean z2 = !Td.p("naviFullscreen");
                                    SharedPreferences.Editor editorEdit2 = spedometerPanel.b.edit();
                                    editorEdit2.putBoolean("usePreferences", false);
                                    editorEdit2.commit();
                                    Context contextA = AbstractC0402n1.a();
                                    SharedPreferences sharedPreferences = contextA.getSharedPreferences("prefs_" + AbstractC0390mk.l(contextA).getString("selectedTheme", "Audi Virtual Cockpit"), 0);
                                    if (sharedPreferences.getBoolean("useDefaultSwitchNavi", true)) {
                                        sharedPreferences = contextA.getSharedPreferences("prefs_Default", 0);
                                    }
                                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                                    editorEdit3.putBoolean("naviFullscreen", z2);
                                    editorEdit3.commit();
                                    lf3.w.f(Boolean.valueOf(z2));
                                    spedometerPanel.d0 = z2;
                                    Ud.n0(z2);
                                    new Handler().postDelayed(new RunnableC0744y3(i112, spedometerPanel, editorEdit2, z2), 1000L);
                                    break;
                                }
                            } else if (iIntValue == 9) {
                                if (!spedometerPanel.V.equals("0")) {
                                    spedometerPanel.V = "0";
                                    Ud.p0(false);
                                    spedometerPanel.w();
                                    spedometerPanel.f = R.layout.transparent;
                                    spedometerPanel.o(LayoutInflater.from(spedometerPanel).inflate(R.layout.transparent, (ViewGroup) null));
                                    spedometerPanel.u();
                                    spedometerPanel.h = true;
                                    spedometerPanel.c0 = false;
                                    lf3.i(Boolean.FALSE);
                                } else {
                                    spedometerPanel.V = (String) lf3.u.d();
                                    spedometerPanel.h = false;
                                    boolean zP = Td.p("naviFullscreen");
                                    boolean zP2 = Td.p("useNavi");
                                    lf3.i(Boolean.valueOf(zP2));
                                    spedometerPanel.c0 = zP2;
                                    if (zP2) {
                                        Ud.p0(!Ud.L());
                                        Ud.n0(zP);
                                    }
                                    spedometerPanel.m0 = "";
                                    spedometerPanel.t(true);
                                    spedometerPanel.r();
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        int i21 = SpedometerPanel.s0;
                        if (!spedometerPanel.h && spedometerPanel.V.equals("3")) {
                            C0768yr.e("T500.ACTIVITY", "RightFrameActive=" + bool2);
                            spedometerPanel.z(spedometerPanel.d0);
                            spedometerPanel.K(bool2);
                            C0768yr.e("T500.INFO_FR", "setRightFrameActiveObserver");
                            spedometerPanel.x(false);
                            break;
                        }
                        break;
                }
            }
        });
        G();
    }

    @Override // defpackage.Kf
    public final void f() {
        Rb rb = new Rb();
        this.n0 = rb;
        if (!rb.d) {
            rb.d = true;
            try {
                new Fdbus();
                rb.c = new FdbusClient("tankspeedometer_fdbus", rb);
                boolean zConnect = rb.c.connect("svc://fdbus_mcu_ipc");
                C0768yr.e("T500.FdbusReader", "Connect accepted=" + zConnect);
                if (!zConnect) {
                    rb.a();
                }
            } catch (Throwable th) {
                C0768yr.c("T500.FdbusReader", "FDBus source unavailable; Binder fallback remains active", th);
                rb.a();
            }
        }
        this.Z = new Af(getApplicationContext(), this);
        C0048bg c0048bg = new C0048bg();
        HashMap map = new HashMap();
        c0048bg.a = map;
        HashMap map2 = new HashMap();
        c0048bg.b = map2;
        map.put("speedometer_default", new Si(Color.argb(150, 0, 0, 0), 0.65f));
        Si si = new Si(Color.argb(0, 0, 0, 0), 1.0f);
        map.put("KIA", si);
        map.put("KIA_big", si);
        map2.put("speedometer_default", new Si(Color.argb(240, 0, 0, 0), 0.65f));
        map2.put("Moon Eclipse", new Si(Color.argb(240, 0, 0, 0), 0.5f));
        map2.put("Moon Eclipse_big", new Si(Color.argb(240, 0, 0, 0), 0.5f));
        Si si2 = new Si(Color.argb(255, 0, 0, 0), 0.5f);
        map2.put("KIA", si2);
        map2.put("KIA_big", si2);
        map2.put("KIA mini", si2);
        map2.put("KIA mini_big", si2);
        this.a0 = c0048bg;
        C0426np c0426np = new C0426np(2);
        c0426np.b = this;
        c0426np.b(AbstractC0390mk.l(AbstractC0402n1.a()).getString("selectedTheme", "Audi Virtual Cockpit"), Br.s("bigMeters", false));
        this.b0 = c0426np;
        U2 u2 = new U2(this, 7);
        this.P = u2;
        this.b.registerOnSharedPreferenceChangeListener(u2);
    }

    @Override // defpackage.Kf
    public final void g() {
        u();
        t(false);
    }

    @Override // defpackage.Kf
    public final void h() {
        super.h();
        Lf lf = this.c;
        this.V = (String) lf.u.d();
        this.Q = Float.parseFloat(this.b.getString("speedKDefault", "1.055"));
        this.R = Float.parseFloat(this.b.getString("ipSpeedK1", "1.046"));
        this.S = Float.parseFloat(this.b.getString("ipSpeedK2", "1.042"));
        this.T = Float.parseFloat(this.b.getString("ipSpeed1", "76"));
        this.U = Float.parseFloat(this.b.getString("ipSpeed2", "96"));
        this.X = this.b.getString("selectedTheme", "Audi Virtual Cockpit");
        this.Y = F4.O();
        this.c0 = ((Boolean) lf.v.d()).booleanValue();
        this.d0 = ((Boolean) lf.w.d()).booleanValue();
        this.m = Br.s("showLabelInMeter", true);
        D();
        this.f0 = this.b.getBoolean("MICROMODE", false);
    }

    @Override // defpackage.Kf
    public final void l() {
        super.l();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED");
        registerReceiver(this.r0, intentFilter);
    }

    @Override // defpackage.Kf
    public final void m() {
        String str = this.V;
        int iHashCode = str.hashCode();
        if (iHashCode == 48) {
            if (str.equals("0")) {
                o(LayoutInflater.from(this).inflate(R.layout.transparent, (ViewGroup) null));
            }
            r();
        } else if (iHashCode == 51) {
            str.equals("3");
        }
        H();
        r();
    }

    @Override // defpackage.Kf, android.app.Service
    public final void onDestroy() {
        this.n0.a();
        this.p0.removeCallbacks(this.q0);
        U2 u2 = this.P;
        if (u2 != null) {
            this.b.unregisterOnSharedPreferenceChangeListener(u2);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Lf lf = this.c;
        this.c0 = ((Boolean) lf.v.d()).booleanValue();
        this.d0 = ((Boolean) lf.w.d()).booleanValue();
        if (intent != null && intent.getAction() != null && intent.getAction().equals("ru.zinovin.tankspeedometer.T500_IP_RESTART")) {
            if (this.X.equals("Night center")) {
                t(false);
            }
            r();
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // defpackage.Kf
    public final void q() {
        super.q();
        unregisterReceiver(this.r0);
    }

    public final void r() {
        s(this.d0);
    }

    public final void s(boolean z) {
        ConstraintLayout constraintLayout = (ConstraintLayout) c(R.id.naviBorder);
        if (constraintLayout != null) {
            constraintLayout.removeAllViews();
        }
        boolean zP = Td.p("useSysNavi");
        boolean z2 = this.c0;
        z(z);
        boolean z3 = false;
        if (F()) {
            Kf.p(c(R.id.header_shadow), 0);
            Kf.p(c(R.id.micro_footer), z2 ? 4 : 0);
            Kf.p(c(R.id.imageFuel), z2 ? 4 : 0);
            Kf.p(c(R.id.remainOdometer), z2 ? 4 : 0);
            Kf.p(c(R.id.battery), z2 ? 4 : 0);
            Kf.p(c(R.id.evBattery), z2 ? 4 : 0);
            Kf.p(c(R.id.odoTotal), z2 ? 4 : 0);
            if (z2) {
                a(true, z);
            }
        } else {
            Kf.p(c(R.id.header_shadow), 4);
            ImageView imageView = (ImageView) c(R.id.line_top);
            C0768yr.e("T500.ACTIVITY", "applyScreenMode.fullScreen=" + z);
            C0768yr.e("T500.ACTIVITY", "applyScreenMode.useSysNavi=" + zP);
            C0768yr.e("T500.ACTIVITY", "applyScreenMode.naviStarted=" + z2);
            if (z2) {
                if (z || zP) {
                    Kf.p(imageView, 4);
                } else {
                    Kf.p(imageView, 0);
                }
                a(false, z);
            } else {
                Kf.p(imageView, 0);
            }
        }
        C0048bg c0048bg = this.a0;
        String str = this.X;
        boolean z4 = this.k;
        if (zP && z2) {
            z3 = true;
        }
        c0048bg.getClass();
        C0768yr.e("T500.SHADOW", "theme=" + str + ", big=" + z4 + ", systemNavi=" + z3);
        HashMap map = z3 ? c0048bg.b : c0048bg.a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z4 ? "_big" : "");
        Si si = (Si) map.get(sb.toString());
        if (si == null) {
            si = (Si) map.get("speedometer_default");
        }
        GradientCircleView gradientCircleView = this.N;
        if (gradientCircleView != null) {
            gradientCircleView.a(si.b, si.a);
        }
        GradientCircleView gradientCircleView2 = this.O;
        if (gradientCircleView2 != null) {
            gradientCircleView2.a(si.b, si.a);
        }
        if (this.c.d().booleanValue()) {
            I();
        } else {
            K(Boolean.FALSE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x018f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:106:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:119:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0210  */
    /* JADX WARN: Code duplicated, block: B:121:0x0214  */
    /* JADX WARN: Code duplicated, block: B:124:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x021d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0221  */
    /* JADX WARN: Code duplicated, block: B:137:0x0249  */
    /* JADX WARN: Code duplicated, block: B:139:0x024d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0254  */
    /* JADX WARN: Code duplicated, block: B:145:0x025b  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0130  */
    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x014f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x016d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0173  */
    /* JADX WARN: Code duplicated, block: B:93:0x0177  */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    public final void t(boolean z) {
        C0096d2 c0096d2;
        Mf mf;
        int i;
        Drawable drawableZ;
        boolean z2;
        Mf mf2;
        String str;
        int i2;
        Drawable drawableZ2;
        C0096d2 c0096d3;
        SpedometerPanel spedometerPanel;
        boolean z3;
        Mf mf3;
        String str2;
        int i3;
        Drawable drawableZ3;
        C0096d2 c0096d4;
        Mf mf4;
        boolean z4;
        SpedometerPanel spedometerPanel2;
        int i4;
        Drawable drawableZ4;
        SpeedometerView speedometerView;
        SpeedometerView speedometerView2;
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        TextView textView2;
        Drawable drawableZ5;
        SpeedometerView speedometerView3;
        SpeedometerView speedometerView4;
        SpeedometerView speedometerView5;
        String str3;
        String str4;
        String string = this.b.getString("selectedTheme", "Audi Virtual Cockpit");
        C0768yr.e("T500.ACTIVITY", "applyThemeParameters()-" + string);
        this.X = string;
        if (string.equals("Night center")) {
            Td.p("useSysNavi");
            if (this.c0) {
                this.i0 = 2;
                this.g0 = 2;
            } else {
                this.i0 = 1;
                this.g0 = 1;
            }
        } else {
            this.i0 = 1;
            this.g0 = 1;
        }
        this.j0 = 1;
        this.h0 = 1;
        if (z) {
            C0768yr.e("T500.INFO_FR", "applyThemeParameters");
            w();
            H();
            u();
        }
        this.e0 = ((Mf) ((C0096d2) this.b0.c).b).c;
        View viewC = c(R.id.logoRight);
        if (viewC != null) {
            viewC.setVisibility(this.e0 ? 0 : 4);
        }
        File fileD0 = Ud.d0(this, "dial_logo.png");
        ?? CreateFromStream = 0;
        CreateFromStream = 0;
        CreateFromStream = 0;
        Uri uriFromFile = fileD0 != null ? Uri.fromFile(fileD0) : null;
        ?? r13 = (ImageView) c(R.id.logoRight);
        if (r13 != 0) {
            try {
                try {
                    if (uriFromFile != null) {
                        try {
                            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uriFromFile);
                            try {
                                CreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                                r13.setImageDrawable(CreateFromStream);
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                    CreateFromStream = CreateFromStream;
                                }
                            } catch (FileNotFoundException e) {
                                e = e;
                                CreateFromStream = inputStreamOpenInputStream;
                                C0768yr.c("T500.ACTIVITY", "ERROR in setLogoImage()", e);
                                if (CreateFromStream != 0) {
                                    CreateFromStream.close();
                                    CreateFromStream = CreateFromStream;
                                }
                                c0096d2 = (C0096d2) this.b0.c;
                                mf = (Mf) c0096d2.b;
                                this.k0 = mf.p;
                                if (((SpedometerPanel) c0096d2.c).n) {
                                    i = mf.s;
                                } else {
                                    i = mf.x;
                                }
                                drawableZ = Tf.z(i);
                                C0096d2 c0096d5 = (C0096d2) this.b0.c;
                                z2 = ((SpedometerPanel) c0096d5.c).n;
                                mf2 = (Mf) c0096d5.b;
                                if (z2) {
                                    str = mf2.t;
                                } else {
                                    str = mf2.y;
                                }
                                this.l0 = mf2.u;
                                if (z2) {
                                    i2 = mf2.x;
                                } else {
                                    i2 = mf2.s;
                                }
                                drawableZ2 = Tf.z(i2);
                                c0096d3 = (C0096d2) this.b0.c;
                                spedometerPanel = (SpedometerPanel) c0096d3.c;
                                z3 = spedometerPanel.n;
                                mf3 = (Mf) c0096d3.b;
                                if (z3) {
                                    str2 = mf3.y;
                                } else {
                                    str2 = mf3.t;
                                }
                                if (mf3.b) {
                                    str4 = mf3.j;
                                    if (z3) {
                                        if (spedometerPanel.i0 == 2) {
                                            str4 = mf3.l;
                                        }
                                    } else if (spedometerPanel.j0 == 2) {
                                        str4 = mf3.l;
                                    }
                                    drawableZ3 = c0096d3.F(str4, true);
                                } else {
                                    i3 = mf3.g;
                                    if (z3) {
                                        if (spedometerPanel.i0 == 2) {
                                            mf3.getClass();
                                            i3 = 0;
                                        }
                                    } else if (spedometerPanel.j0 == 2) {
                                        mf3.getClass();
                                        i3 = 0;
                                    }
                                    drawableZ3 = Tf.z(i3);
                                }
                                c0096d4 = (C0096d2) this.b0.c;
                                mf4 = (Mf) c0096d4.b;
                                z4 = mf4.b;
                                spedometerPanel2 = (SpedometerPanel) c0096d4.c;
                                if (z4) {
                                    str3 = mf4.k;
                                    if (spedometerPanel2.n) {
                                        if (spedometerPanel2.j0 == 2) {
                                            str3 = mf4.m;
                                        }
                                    } else if (spedometerPanel2.i0 == 2) {
                                        str3 = mf4.m;
                                    }
                                    drawableZ4 = c0096d4.F(str3, true);
                                } else {
                                    i4 = mf4.h;
                                    if (spedometerPanel2.n) {
                                        if (spedometerPanel2.j0 == 2) {
                                            mf4.getClass();
                                            i4 = 0;
                                        }
                                    } else if (spedometerPanel2.i0 == 2) {
                                        mf4.getClass();
                                        i4 = 0;
                                    }
                                    drawableZ4 = Tf.z(i4);
                                }
                                speedometerView = this.u;
                                if (speedometerView != null) {
                                    speedometerView.setBackgroundDrawable(drawableZ3);
                                    SpeedometerView speedometerView6 = this.u;
                                    speedometerView6.e.clear();
                                    speedometerView6.e();
                                    speedometerView6.invalidate();
                                    SpeedometerView speedometerView7 = this.u;
                                    Mf mf5 = (Mf) ((C0096d2) this.b0.c).b;
                                    speedometerView7.a(new Bn(mf5.q, mf5.r, this.k0));
                                }
                                speedometerView2 = this.v;
                                if (speedometerView2 != null) {
                                    if (drawableZ4 != null) {
                                        drawableZ3 = drawableZ4;
                                    }
                                    speedometerView2.setBackgroundDrawable(drawableZ3);
                                    SpeedometerView speedometerView8 = this.v;
                                    speedometerView8.e.clear();
                                    speedometerView8.e();
                                    speedometerView8.invalidate();
                                    SpeedometerView speedometerView9 = this.v;
                                    Mf mf6 = (Mf) ((C0096d2) this.b0.c).b;
                                    speedometerView9.a(new Bn(mf6.v, mf6.w, this.l0));
                                }
                                J();
                                imageView = this.J;
                                if (imageView != null) {
                                    if (drawableZ != null) {
                                        imageView.setImageDrawable(drawableZ);
                                    } else {
                                        imageView.setImageResource(R.drawable.transparent_background);
                                    }
                                }
                                imageView2 = this.H;
                                if (imageView2 != null) {
                                    if (drawableZ2 != null) {
                                        imageView2.setImageDrawable(drawableZ2);
                                    } else {
                                        imageView2.setImageResource(R.drawable.transparent_background);
                                    }
                                }
                                textView = this.K;
                                if (textView != null) {
                                    textView.setText(str);
                                }
                                textView2 = this.I;
                                if (textView2 != null) {
                                    textView2.setText(str2);
                                }
                                ((Mf) ((C0096d2) this.b0.c).b).getClass();
                                drawableZ5 = Tf.z(0);
                                if (drawableZ5 != null) {
                                    speedometerView3 = this.y;
                                    if (speedometerView3 != null) {
                                        speedometerView3.setNeedleDrawable(drawableZ5);
                                    }
                                    speedometerView4 = this.z;
                                    if (speedometerView4 != null) {
                                        speedometerView4.setNeedleDrawable(drawableZ5);
                                    }
                                    speedometerView5 = this.A;
                                    if (speedometerView5 != null) {
                                        speedometerView5.setNeedleDrawable(drawableZ5);
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                CreateFromStream = inputStreamOpenInputStream;
                                if (CreateFromStream != 0) {
                                    try {
                                        CreateFromStream.close();
                                    } catch (IOException e2) {
                                        C0768yr.c("T500.ACTIVITY", "ERROR closing input stream", e2);
                                    }
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException e3) {
                            e = e3;
                        }
                    }
                } catch (IOException e4) {
                    C0768yr.c("T500.ACTIVITY", "ERROR closing input stream", e4);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        c0096d2 = (C0096d2) this.b0.c;
        mf = (Mf) c0096d2.b;
        this.k0 = mf.p;
        if (((SpedometerPanel) c0096d2.c).n) {
            i = mf.s;
        } else {
            i = mf.x;
        }
        drawableZ = Tf.z(i);
        C0096d2 c0096d6 = (C0096d2) this.b0.c;
        z2 = ((SpedometerPanel) c0096d6.c).n;
        mf2 = (Mf) c0096d6.b;
        if (z2) {
            str = mf2.t;
        } else {
            str = mf2.y;
        }
        this.l0 = mf2.u;
        if (z2) {
            i2 = mf2.x;
        } else {
            i2 = mf2.s;
        }
        drawableZ2 = Tf.z(i2);
        c0096d3 = (C0096d2) this.b0.c;
        spedometerPanel = (SpedometerPanel) c0096d3.c;
        z3 = spedometerPanel.n;
        mf3 = (Mf) c0096d3.b;
        if (z3) {
            str2 = mf3.y;
        } else {
            str2 = mf3.t;
        }
        if (mf3.b) {
            str4 = mf3.j;
            if (z3) {
                if (spedometerPanel.i0 == 2) {
                    str4 = mf3.l;
                }
            } else if (spedometerPanel.j0 == 2) {
                str4 = mf3.l;
            }
            drawableZ3 = c0096d3.F(str4, true);
        } else {
            i3 = mf3.g;
            if (z3) {
                if (spedometerPanel.i0 == 2) {
                    mf3.getClass();
                    i3 = 0;
                }
            } else if (spedometerPanel.j0 == 2) {
                mf3.getClass();
                i3 = 0;
            }
            drawableZ3 = Tf.z(i3);
        }
        c0096d4 = (C0096d2) this.b0.c;
        mf4 = (Mf) c0096d4.b;
        z4 = mf4.b;
        spedometerPanel2 = (SpedometerPanel) c0096d4.c;
        if (z4) {
            str3 = mf4.k;
            if (spedometerPanel2.n) {
                if (spedometerPanel2.j0 == 2) {
                    str3 = mf4.m;
                }
            } else if (spedometerPanel2.i0 == 2) {
                str3 = mf4.m;
            }
            drawableZ4 = c0096d4.F(str3, true);
        } else {
            i4 = mf4.h;
            if (spedometerPanel2.n) {
                if (spedometerPanel2.j0 == 2) {
                    mf4.getClass();
                    i4 = 0;
                }
            } else if (spedometerPanel2.i0 == 2) {
                mf4.getClass();
                i4 = 0;
            }
            drawableZ4 = Tf.z(i4);
        }
        speedometerView = this.u;
        if (speedometerView != null) {
            speedometerView.setBackgroundDrawable(drawableZ3);
            SpeedometerView speedometerView10 = this.u;
            speedometerView10.e.clear();
            speedometerView10.e();
            speedometerView10.invalidate();
            SpeedometerView speedometerView11 = this.u;
            Mf mf7 = (Mf) ((C0096d2) this.b0.c).b;
            speedometerView11.a(new Bn(mf7.q, mf7.r, this.k0));
        }
        speedometerView2 = this.v;
        if (speedometerView2 != null) {
            if (drawableZ4 != null) {
                drawableZ3 = drawableZ4;
            }
            speedometerView2.setBackgroundDrawable(drawableZ3);
            SpeedometerView speedometerView12 = this.v;
            speedometerView12.e.clear();
            speedometerView12.e();
            speedometerView12.invalidate();
            SpeedometerView speedometerView13 = this.v;
            Mf mf8 = (Mf) ((C0096d2) this.b0.c).b;
            speedometerView13.a(new Bn(mf8.v, mf8.w, this.l0));
        }
        J();
        imageView = this.J;
        if (imageView != null) {
            if (drawableZ != null) {
                imageView.setImageDrawable(drawableZ);
            } else {
                imageView.setImageResource(R.drawable.transparent_background);
            }
        }
        imageView2 = this.H;
        if (imageView2 != null) {
            if (drawableZ2 != null) {
                imageView2.setImageDrawable(drawableZ2);
            } else {
                imageView2.setImageResource(R.drawable.transparent_background);
            }
        }
        textView = this.K;
        if (textView != null && str != null) {
            textView.setText(str);
        }
        textView2 = this.I;
        if (textView2 != null && str2 != null) {
            textView2.setText(str2);
        }
        ((Mf) ((C0096d2) this.b0.c).b).getClass();
        drawableZ5 = Tf.z(0);
        if (drawableZ5 != null) {
            speedometerView3 = this.y;
            if (speedometerView3 != null) {
                speedometerView3.setNeedleDrawable(drawableZ5);
            }
            speedometerView4 = this.z;
            if (speedometerView4 != null) {
                speedometerView4.setNeedleDrawable(drawableZ5);
            }
            speedometerView5 = this.A;
            if (speedometerView5 != null) {
                speedometerView5.setNeedleDrawable(drawableZ5);
            }
        }
    }

    public final void u() {
        this.B = (TextView) c(R.id.gear);
        this.w = (SpeedometerView) c(R.id.imageLeftMeter);
        this.x = (SpeedometerView) c(R.id.imageRightMeter);
        this.y = (SpeedometerView) c(R.id.imageLeftSubmeter);
        this.z = (SpeedometerView) c(R.id.imageLeftSubmeter2);
        this.A = (SpeedometerView) c(R.id.imageRightSubmeter);
        if (this.n) {
            this.u = this.w;
            this.v = this.x;
        } else {
            this.u = this.x;
            this.v = this.w;
        }
        ((C0096d2) this.b0.c).o();
        this.F = (AbstractC0510qg) c(R.id.batteryIndicator);
        this.G = (ImageView) c(R.id.wifiImg);
        this.H = (ImageView) c(R.id.imageRightBottom);
        this.I = (TextView) c(R.id.rightMeterText);
        this.N = (GradientCircleView) c(R.id.leftMeterShadow);
        this.O = (GradientCircleView) c(R.id.rightMeterShadow);
        this.J = (ImageView) c(R.id.imageLeftBottom);
        this.K = (TextView) c(R.id.leftMeterText);
        this.L = (ImageView) c(R.id.left_label);
        this.M = (ImageView) c(R.id.right_label);
        Lf lf = this.c;
        Float f = (Float) lf.a.d();
        float fFloatValue = f.floatValue();
        if (fFloatValue >= 0.0f && this.u != null) {
            C0426np c0426np = this.b0;
            float fE = E(fFloatValue) * fFloatValue;
            ((C0096d2) c0426np.c).getClass();
            this.u.c(fE);
        }
        if (fFloatValue >= 0.0f) {
            Object objValueOf = Float.valueOf(E(fFloatValue) * fFloatValue);
            int i = this.e;
            k(R.id.speed, objValueOf, "", i, i, "%.0f");
        }
        lf.a.f(f);
        Float f2 = (Float) lf.b.d();
        float fFloatValue2 = f2.floatValue();
        if (fFloatValue2 >= 0.0f) {
            if (this.v != null) {
                ((C0096d2) this.b0.c).getClass();
                this.v.c(fFloatValue2 / 1000.0f);
            }
            Object objValueOf2 = Float.valueOf(fFloatValue2 / 1000.0f);
            int i2 = this.e;
            k(R.id.rpm, objValueOf2, "", i2, i2, "%.1f");
        }
        lf.b.f(f2);
        Integer num = (Integer) lf.d.d();
        int iIntValue = num.intValue();
        TextView textView = this.B;
        if (textView != null) {
            textView.setVisibility((((Integer) lf.c.d()).intValue() != 2 || iIntValue == 0) ? 4 : 0);
        }
        k(R.id.gear, num, "", this.d, this.e, "%d");
        k(R.id.battery, (Float) lf.e.d(), "V", this.d, this.e, "%.1f");
        Object obj = (Float) lf.f.d();
        Tf.F(null, "persist.vendor.gwm.cfg.project.code").getClass();
        k(R.id.evBattery, obj, "%", this.d, this.e, "%.1f");
        AbstractC0510qg abstractC0510qg = this.F;
        if (abstractC0510qg != null) {
            abstractC0510qg.setLevelValue(((Float) lf.f.d()).floatValue());
        }
        float fFloatValue3 = lf.c().floatValue();
        float fU = fFloatValue3 < 100.0f ? Tf.u() * fFloatValue3 : Tf.t();
        float fT = (fU / Tf.t()) * 100.0f;
        AbstractC0510qg abstractC0510qg2 = this.C;
        if (abstractC0510qg2 != null) {
            abstractC0510qg2.setLevelValue(fT);
        }
        SpeedometerView speedometerView = this.y;
        if (speedometerView != null) {
            ((C0096d2) this.b0.c).getClass();
            speedometerView.c(fT);
        }
        k(R.id.fuel, Float.valueOf(fU), " L", this.d, this.e, "%.0f");
        float fFloatValue4 = ((Float) lf.h.d()).floatValue() * 0.5f;
        float f3 = fFloatValue4 / 0.5f;
        AbstractC0510qg abstractC0510qg3 = this.D;
        if (abstractC0510qg3 != null) {
            abstractC0510qg3.setLevelValue(f3);
        }
        SpeedometerView speedometerView2 = this.z;
        if (speedometerView2 != null) {
            ((C0096d2) this.b0.c).getClass();
            speedometerView2.c(f3);
        }
        k(R.id.fuel_sec, Float.valueOf(fFloatValue4), " L", this.d, this.e, "%.0f");
        k(R.id.odoTotal, (Float) lf.p.d(), " km", this.d, this.e, "%.0f");
        if (((Float) lf.i.d()).floatValue() > 0.0f) {
            k(R.id.remainOdometer, (Float) lf.i.d(), " km", this.d, this.e, "%.0f");
        } else {
            k(R.id.remainOdometer, "---", " km", this.d, this.e, "%s");
        }
        if (((Float) lf.F.d()).floatValue() > 0.0f) {
            k(R.id.evRemainOdometer, (Float) lf.F.d(), " km", this.d, this.e, "%.0f");
        } else {
            k(R.id.evRemainOdometer, "---", " km", this.d, this.e, "%s");
        }
        if (((Float) lf.j.d()).floatValue() > 0.0f) {
            k(R.id.remainSubOdometer, (Float) lf.j.d(), " km", this.d, this.e, "%.0f");
        } else {
            k(R.id.remainSubOdometer, "---", " km", this.d, this.e, "%s");
        }
        C0768yr.e("T500.ACTIVITY", "assignViewValues(). outside temp=" + lf.b());
        if (lf.b().floatValue() > -1000.0f) {
            k(R.id.outsideTemp, lf.b(), "", this.d, this.e, "%.0f");
            lf.s.f(lf.b());
        }
        Float f4 = (Float) lf.r.d();
        float fFloatValue5 = f4.floatValue();
        k(R.id.coolant, f4, " °C", this.d, this.e, "%.0f");
        AbstractC0510qg abstractC0510qg4 = this.E;
        if (abstractC0510qg4 != null) {
            abstractC0510qg4.setLevelValue(fFloatValue5);
        }
        SpeedometerView speedometerView3 = this.A;
        if (speedometerView3 != null) {
            ((C0096d2) this.b0.c).getClass();
            speedometerView3.c(fFloatValue5);
        }
        ImageView imageView = this.G;
        if (imageView != null) {
            imageView.setImageDrawable(H7.b(this, ((Boolean) lf.x.d()).booleanValue() ? R.drawable.wifi_select : R.drawable.wifi));
        }
    }

    public final void v(C0636uj c0636uj) {
        boolean z = this.c0;
        boolean z2 = this.d0;
        C0605tj c0605tj = z2 ? c0636uj.b : c0636uj.a;
        this.X = this.b.getString("selectedTheme", "Audi Virtual Cockpit");
        this.Y = F4.O();
        this.n = Br.s("speedFromLeft", true);
        if (this.k != Br.s("bigMeters", false)) {
            this.m0 = "";
        }
        this.k = Br.s("bigMeters", false);
        w();
        this.Z = new Af(getApplicationContext(), this);
        boolean zP = Td.p("naviFullscreen");
        this.d0 = zP;
        Boolean boolValueOf = Boolean.valueOf(zP);
        Lf lf = this.c;
        lf.w.f(boolValueOf);
        this.c0 = Td.p("useNavi");
        boolean zP2 = Td.p("useSysNavi");
        lf.i(Boolean.valueOf(this.c0));
        this.b0.b(this.X, this.k);
        C0636uj c0636ujD = D();
        C0768yr.e("T500.ACTIVITY", "changeThemeAction.theme=" + this.X);
        C0768yr.e("T500.ACTIVITY", "changeThemeAction.prevFullscreen=" + z2);
        C0768yr.e("T500.ACTIVITY", "changeThemeAction.naviFullscreen=" + this.d0);
        C0768yr.e("T500.ACTIVITY", "changeThemeAction.useSysNavi=" + zP2);
        C0768yr.e("T500.ACTIVITY", "changeThemeAction.useNavi=" + this.c0);
        if (zP2) {
            Ud.p0(false);
        } else {
            if (!this.c0) {
                Ud.p0(false);
            }
            boolean zEquals = this.d0 ? c0636ujD.b.equals(c0605tj) : c0636ujD.a.equals(c0605tj);
            C0768yr.e("T500.ACTIVITY", "changeThemeAction.isEquals=" + zEquals);
            if ((!zEquals || Ud.A() == -1) && this.c0) {
                Ud.p0(true);
                Ud.n0(this.d0);
                z = true;
            }
            if (!z && this.c0) {
                Ud.n0(this.d0);
            }
        }
        t(true);
        r();
        G();
        this.m = Br.s("showLabelInMeter", true);
        if (this.h || !this.V.equals("3")) {
            return;
        }
        I();
    }

    public final void w() {
        FrameLayout frameLayout = (FrameLayout) c(R.id.left_info_container);
        FrameLayout frameLayout2 = (FrameLayout) c(R.id.right_info_container);
        FrameLayout frameLayout3 = (FrameLayout) c(R.id.center_info_container);
        while (frameLayout != null && frameLayout.getChildCount() > 0) {
            frameLayout.removeView(frameLayout.getChildAt(0));
        }
        int i = 1;
        while (frameLayout2 != null && frameLayout2.getChildCount() > 0) {
            C0768yr.e("T500.INFO_FR", "clearInfoFragments-" + i);
            frameLayout2.removeView(frameLayout2.getChildAt(0));
            i++;
        }
        while (frameLayout3 != null && frameLayout3.getChildCount() > 0) {
            frameLayout3.removeView(frameLayout3.getChildAt(0));
        }
    }

    public final void x(boolean z) {
        AbstractC0787zf abstractC0787zfC;
        boolean z2;
        AbstractC0787zf abstractC0787zfD;
        boolean z3;
        boolean z4;
        if (z) {
            try {
                this.Z.e();
            } catch (Exception e) {
                C0768yr.c("T500.ERROR", "ERROR in displayInfoFragments()", e);
                return;
            }
        }
        FrameLayout frameLayout = (FrameLayout) c(R.id.left_info_container);
        AbstractC0787zf abstractC0787zf = null;
        boolean zEquals = true;
        if (frameLayout != null) {
            abstractC0787zfC = this.n ? this.Z.c() : this.Z.d();
            z2 = true;
        } else {
            abstractC0787zfC = null;
            z2 = false;
        }
        FrameLayout frameLayout2 = (FrameLayout) c(R.id.right_info_container);
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(this.c.d().booleanValue() ? 0 : 4);
            abstractC0787zfD = this.n ? this.Z.d() : this.Z.c();
            z2 = true;
        } else {
            abstractC0787zfD = null;
        }
        FrameLayout frameLayout3 = (FrameLayout) c(R.id.center_info_container);
        if (frameLayout3 != null) {
            Af af = this.Z;
            K2 k2 = af.f ? af.b.b : af.b.a;
            if (af.e != -1) {
                abstractC0787zf = k2.l()[af.e];
            }
            z2 = true;
        }
        if (z2) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.slide_out_left);
            if (frameLayout != null) {
                if (frameLayout.getChildCount() > 0) {
                    View childAt = frameLayout.getChildAt(0);
                    z4 = !childAt.equals(abstractC0787zfC);
                    if (z4) {
                        childAt.startAnimation(animationLoadAnimation2);
                        frameLayout.removeView(childAt);
                    }
                } else {
                    z4 = true;
                }
                if (abstractC0787zfC != null && z4) {
                    abstractC0787zfC.startAnimation(animationLoadAnimation);
                    frameLayout.addView(abstractC0787zfC);
                }
            }
            if (frameLayout2 != null) {
                C0768yr.e("T500.INFO_FR", "1");
                if (frameLayout2.getChildCount() > 0) {
                    C0768yr.e("T500.INFO_FR", "2");
                    View childAt2 = frameLayout2.getChildAt(0);
                    z3 = !childAt2.equals(abstractC0787zfD);
                    C0768yr.e("T500.INFO_FR", "doReplace=" + z3);
                    if (z3) {
                        childAt2.startAnimation(animationLoadAnimation2);
                        frameLayout2.removeView(childAt2);
                        C0768yr.e("T500.INFO_FR", "3");
                    }
                } else {
                    z3 = true;
                }
                if (abstractC0787zfD != null && z3) {
                    abstractC0787zfD.startAnimation(animationLoadAnimation);
                    frameLayout2.addView(abstractC0787zfD);
                    C0768yr.e("T500.INFO_FR", "4");
                }
            }
            if (frameLayout3 != null) {
                if (frameLayout3.getChildCount() > 0) {
                    View childAt3 = frameLayout3.getChildAt(0);
                    zEquals = true ^ childAt3.equals(abstractC0787zf);
                    if (zEquals) {
                        childAt3.startAnimation(animationLoadAnimation2);
                        frameLayout3.removeView(childAt3);
                    }
                }
                if (abstractC0787zf == null || !zEquals) {
                    return;
                }
                abstractC0787zf.startAnimation(animationLoadAnimation);
                frameLayout3.addView(abstractC0787zf);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115  */
    /* JADX WARN: Code duplicated, block: B:84:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0177  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    public final void y(ImageView imageView, Drawable drawable, boolean z) throws Throwable {
        Drawable drawableB;
        Canvas canvas;
        Rect rect;
        InputStream inputStreamOpenInputStream;
        int i;
        Boolean bool = Boolean.TRUE;
        Uri uriC = C();
        if (uriC == null) {
            uriC = Uri.parse("android.resource://" + getPackageName() + "/2131231058");
        }
        if (bool.equals((Boolean) Tf.q("Gif.class", this.Y, imageView, drawable, uriC).a)) {
            return;
        }
        String str = this.Y;
        InputStream inputStream = null;
        if (str == null || str.equals("NONE") || this.Y.equals("BUILD_IN_NONE")) {
            drawableB = null;
        } else if (this.Y.startsWith("BUILD_IN")) {
            String str2 = this.Y;
            str2.getClass();
            switch (str2) {
                case "BUILD_IN_BRABUS":
                    i = R.drawable.brabus_background;
                    break;
                case "BUILD_IN_KIA":
                    i = R.drawable.kia_background;
                    break;
                case "BUILD_IN_TRX":
                    i = R.drawable.trx_background_03;
                    break;
                case "BUILD_IN_NIGHT":
                    i = R.drawable.night_background;
                    break;
                case "BUILD_IN_TRANSPARENT":
                    i = R.drawable.transparent_ip_background;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i == -1) {
                drawableB = null;
            } else {
                drawableB = H7.b(this, i);
            }
        } else {
            File fileD0 = Ud.d0(this, this.Y);
            if (fileD0 == null || !fileD0.exists()) {
                drawableB = null;
            } else {
                try {
                    inputStreamOpenInputStream = getContentResolver().openInputStream(Uri.fromFile(fileD0));
                    try {
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    inputStreamOpenInputStream.close();
                                } catch (IOException e) {
                                    C0768yr.c("T500.ACTIVITY", "ERROR closing input stream", e);
                                }
                            }
                            drawableB = drawableCreateFromStream;
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            C0768yr.c("T500.ACTIVITY", "ERROR in getBackgroundImage()", e);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    inputStreamOpenInputStream.close();
                                } catch (IOException e3) {
                                    C0768yr.c("T500.ACTIVITY", "ERROR closing input stream", e3);
                                }
                            }
                            drawableB = null;
                            if (drawableB != null) {
                                if (z) {
                                    A(imageView, drawable);
                                    return;
                                } else {
                                    imageView.setImageDrawable(drawable);
                                    return;
                                }
                            }
                            Bitmap bitmapB = B(drawable);
                            Bitmap bitmapB2 = B(drawableB);
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapB, 1920, 720, true);
                            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapB2, 1920, 720, true);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1920, 720, Bitmap.Config.ARGB_8888);
                            canvas = new Canvas(bitmapCreateBitmap);
                            canvas.drawBitmap(bitmapCreateScaledBitmap2, 0.0f, 0.0f, (Paint) null);
                            canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
                            if (z) {
                                if (this.l) {
                                    rect = new Rect(1420, 200, 1820, 600);
                                } else {
                                    rect = new Rect(1320, 200, 1820, 600);
                                }
                                Paint paint = new Paint();
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                canvas.drawRect(rect, paint);
                            }
                            imageView.setImageDrawable(new BitmapDrawable(getResources(), bitmapCreateBitmap));
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamOpenInputStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                C0768yr.c("T500.ACTIVITY", "ERROR closing input stream", e4);
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e5) {
                    e = e5;
                    inputStreamOpenInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }
        if (drawableB != null) {
            if (z) {
                A(imageView, drawable);
                return;
            } else {
                imageView.setImageDrawable(drawable);
                return;
            }
        }
        Bitmap bitmapB3 = B(drawable);
        Bitmap bitmapB4 = B(drawableB);
        Bitmap bitmapCreateScaledBitmap3 = Bitmap.createScaledBitmap(bitmapB3, 1920, 720, true);
        Bitmap bitmapCreateScaledBitmap4 = Bitmap.createScaledBitmap(bitmapB4, 1920, 720, true);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1920, 720, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmapCreateScaledBitmap4, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmapCreateScaledBitmap3, 0.0f, 0.0f, (Paint) null);
        if (z) {
            if (this.l) {
                rect = new Rect(1420, 200, 1820, 600);
            } else {
                rect = new Rect(1320, 200, 1820, 600);
            }
            Paint paint2 = new Paint();
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawRect(rect, paint2);
        }
        imageView.setImageDrawable(new BitmapDrawable(getResources(), bitmapCreateBitmap2));
    }

    public final void z(boolean z) throws Throwable {
        boolean zP = Td.p("useSysNavi");
        boolean zEndsWith = this.Y.toLowerCase().endsWith(".gif");
        boolean z2 = this.c0;
        StringBuilder sb = new StringBuilder();
        sb.append(this.X);
        sb.append(F());
        sb.append(z2);
        sb.append(z || zP);
        sb.append(this.Y);
        sb.append(this.l);
        Lf lf = this.c;
        sb.append(zEndsWith ? "" : lf.d());
        String string = sb.toString();
        ImageView imageView = (ImageView) c(R.id.background);
        if (string.equals(this.m0)) {
            C0768yr.e("T500.ACTIVITY", "backgroundHash equal");
            return;
        }
        this.m0 = string;
        if (F()) {
            int i = R.drawable.transparent_ip_background;
            if (!z2) {
                y(imageView, H7.b(this, R.drawable.transparent_ip_background), !lf.d().booleanValue());
                return;
            }
            if (lf.d().booleanValue()) {
                if (zP) {
                    i = R.drawable.sysnavi_background;
                }
                imageView.setImageResource(i);
                return;
            } else {
                if (zP) {
                    i = R.drawable.sysnavi_background;
                }
                A(imageView, H7.b(this, i));
                return;
            }
        }
        Drawable drawableZ = Tf.z(((Mf) ((C0096d2) this.b0.c).b).d);
        Drawable drawableZ2 = Tf.z(((Mf) ((C0096d2) this.b0.c).b).e);
        Drawable drawableZ3 = Tf.z(((Mf) ((C0096d2) this.b0.c).b).f);
        if (!z2) {
            if (C() != null) {
                drawableZ = drawableZ2;
            }
            y(imageView, drawableZ, !lf.d().booleanValue());
        } else {
            if (lf.d().booleanValue()) {
                if (!z && !zP) {
                    drawableZ2 = drawableZ3;
                }
                imageView.setImageDrawable(drawableZ2);
                return;
            }
            if (!z && !zP) {
                drawableZ2 = drawableZ3;
            }
            A(imageView, drawableZ2);
        }
    }
}
