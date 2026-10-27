package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class Oq extends AbstractC0787zf {
    public final Lf e;
    public SharedPreferences f;
    public U2 g;
    public ImageView h;
    public ImageView i;
    public ImageView j;
    public ImageView k;
    public float l;
    public int m;
    public int n;
    public String o;
    public String p;
    public final int q;

    public Oq(Context context, Dg dg, int i) {
        super(context, dg, i);
        this.e = Lf.a();
        this.l = 210.0f;
        this.m = -1;
        this.n = -9144711;
        this.o = "°C";
        this.p = "kPa";
        this.q = R.drawable.transparent_background;
        a();
    }

    public final void a() {
        String str;
        C0768yr.e("T500.FR", "TiresFragment.init()");
        Context context = this.b;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayout(), this);
        SharedPreferences sharedPreferencesL = AbstractC0390mk.l(getContext());
        this.f = sharedPreferencesL;
        this.l = Float.parseFloat(sharedPreferencesL.getString("tiresLowValue", "210"));
        Lf lf = this.e;
        int iIntValue = ((Integer) lf.A.d()).intValue();
        if (iIntValue != 1) {
            str = iIntValue != 3 ? "kPa" : "bar";
        } else {
            str = "psi";
        }
        this.p = str;
        this.o = ((Integer) lf.C.d()).intValue() == 1 ? "°F" : "°C";
        this.g = new U2(this, 9);
        this.h = (ImageView) findViewById(R.id.lf_tire_img);
        this.i = (ImageView) findViewById(R.id.lr_tire_img);
        this.j = (ImageView) findViewById(R.id.rf_tire_img);
        this.k = (ImageView) findViewById(R.id.rr_tire_img);
        ImageView imageView = (ImageView) findViewById(R.id.info_panel_background);
        if (imageView != null) {
            imageView.setImageDrawable(H7.b(context, this.q));
        }
        final int i = 0;
        Lf.f(lf.z, this, new Mj(this) { // from class: Nq
            public final /* synthetic */ Oq b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                String str2;
                switch (i) {
                    case 0:
                        this.b.e((String) obj);
                        break;
                    case 1:
                        Oq oq = this.b;
                        oq.getClass();
                        oq.o = ((Integer) obj).intValue() == 1 ? "°F" : "°C";
                        oq.d(R.id.tire_units, oq.gettColor(), "%s", oq.p + "/" + oq.o);
                        break;
                    default:
                        Oq oq2 = this.b;
                        oq2.getClass();
                        int iIntValue2 = ((Integer) obj).intValue();
                        if (iIntValue2 != 1) {
                            str2 = iIntValue2 != 3 ? "kPa" : "bar";
                        } else {
                            str2 = "psi";
                        }
                        oq2.p = str2;
                        oq2.d(R.id.tire_units, oq2.gettColor(), "%s", oq2.p + "/" + oq2.o);
                        break;
                }
            }
        });
        final int i2 = 1;
        Lf.f(lf.C, this, new Mj(this) { // from class: Nq
            public final /* synthetic */ Oq b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                String str2;
                switch (i2) {
                    case 0:
                        this.b.e((String) obj);
                        break;
                    case 1:
                        Oq oq = this.b;
                        oq.getClass();
                        oq.o = ((Integer) obj).intValue() == 1 ? "°F" : "°C";
                        oq.d(R.id.tire_units, oq.gettColor(), "%s", oq.p + "/" + oq.o);
                        break;
                    default:
                        Oq oq2 = this.b;
                        oq2.getClass();
                        int iIntValue2 = ((Integer) obj).intValue();
                        if (iIntValue2 != 1) {
                            str2 = iIntValue2 != 3 ? "kPa" : "bar";
                        } else {
                            str2 = "psi";
                        }
                        oq2.p = str2;
                        oq2.d(R.id.tire_units, oq2.gettColor(), "%s", oq2.p + "/" + oq2.o);
                        break;
                }
            }
        });
        final int i3 = 2;
        Lf.f(lf.A, this, new Mj(this) { // from class: Nq
            public final /* synthetic */ Oq b;

            {
                this.b = this;
            }

            @Override // defpackage.Mj
            public final void w(Object obj) {
                String str2;
                switch (i3) {
                    case 0:
                        this.b.e((String) obj);
                        break;
                    case 1:
                        Oq oq = this.b;
                        oq.getClass();
                        oq.o = ((Integer) obj).intValue() == 1 ? "°F" : "°C";
                        oq.d(R.id.tire_units, oq.gettColor(), "%s", oq.p + "/" + oq.o);
                        break;
                    default:
                        Oq oq2 = this.b;
                        oq2.getClass();
                        int iIntValue2 = ((Integer) obj).intValue();
                        if (iIntValue2 != 1) {
                            str2 = iIntValue2 != 3 ? "kPa" : "bar";
                        } else {
                            str2 = "psi";
                        }
                        oq2.p = str2;
                        oq2.d(R.id.tire_units, oq2.gettColor(), "%s", oq2.p + "/" + oq2.o);
                        break;
                }
            }
        });
    }

    public final boolean c(float f) {
        float f2 = this.l;
        int iIntValue = ((Integer) this.e.A.d()).intValue();
        if (iIntValue == 1) {
            f2 = this.l * 0.145038f;
        } else if (iIntValue == 3) {
            f2 = this.l / 100.0f;
        }
        return f < f2;
    }

    public final void d(int i, int i2, String str, Object... objArr) {
        TextView textView = (TextView) findViewById(i);
        if (textView != null) {
            String str2 = String.format(Locale.US, str, objArr);
            textView.setTextColor(i2);
            textView.setText(str2);
        }
    }

    public final void e(String str) {
        Matcher matcher = Pattern.compile("(-?\\d+\\.\\d+)").matcher(str);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i = 0;
        float f8 = 0.0f;
        while (matcher.find()) {
            float f9 = Float.parseFloat(matcher.group());
            switch (i) {
                case 0:
                    f = f9;
                    break;
                case 1:
                    f4 = f9;
                    break;
                case 2:
                    f2 = f9;
                    break;
                case 3:
                    f6 = f9;
                    break;
                case 4:
                    f8 = f9;
                    break;
                case 5:
                    f5 = f9;
                    break;
                case 6:
                    f3 = f9;
                    break;
                case 7:
                    f7 = f9;
                    break;
            }
            i++;
        }
        ImageView imageView = this.h;
        boolean zC = c(f);
        int i2 = R.drawable.tire_normal;
        imageView.setImageResource(zC ? R.drawable.tire_red : R.drawable.tire_normal);
        this.i.setImageResource(c(f8) ? R.drawable.tire_red : R.drawable.tire_normal);
        this.j.setImageResource(c(f2) ? R.drawable.tire_red : R.drawable.tire_normal);
        ImageView imageView2 = this.k;
        if (c(f3)) {
            i2 = R.drawable.tire_red;
        }
        imageView2.setImageResource(i2);
        String str2 = ((Integer) this.e.A.d()).intValue() == 2 ? "%.0f" : "%.1f";
        d(R.id.lf_tire_p, c(f) ? -289079039 : getpColor(), str2, Float.valueOf(f));
        d(R.id.lf_tire_t, gettColor(), "/%.0f", Float.valueOf(f4));
        d(R.id.lr_tire_p, c(f8) ? -289079039 : getpColor(), str2, Float.valueOf(f8));
        d(R.id.lr_tire_t, gettColor(), "/%.0f", Float.valueOf(f5));
        d(R.id.rf_tire_p, c(f2) ? -289079039 : getpColor(), str2, Float.valueOf(f2));
        d(R.id.rf_tire_t, gettColor(), "/%.0f", Float.valueOf(f6));
        d(R.id.rr_tire_p, c(f3) ? -289079039 : getpColor(), str2, Float.valueOf(f3));
        d(R.id.rr_tire_t, gettColor(), "/%.0f", Float.valueOf(f7));
        d(R.id.tire_units, gettColor(), "%s", this.p + "/" + this.o);
    }

    public int getpColor() {
        return this.m;
    }

    public int gettColor() {
        return this.n;
    }

    @Override // defpackage.AbstractC0787zf, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        U2 u2 = this.g;
        if (u2 != null) {
            this.f.registerOnSharedPreferenceChangeListener(u2);
        }
        C0768yr.e("T500.FR", "TiresFragment.onAttachedToWindow()-".concat(Oq.class.getName()));
    }

    @Override // defpackage.AbstractC0787zf, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        U2 u2 = this.g;
        if (u2 != null) {
            this.f.unregisterOnSharedPreferenceChangeListener(u2);
        }
        C0768yr.e("T500.FR", "TiresFragment.onDetachedFromWindow()-".concat(Oq.class.getName()));
    }

    public void setpColor(int i) {
        this.m = i;
    }

    public void settColor(int i) {
        this.n = i;
    }

    public Oq(Context context, Dg dg, int i, int i2) {
        super(context, dg, i);
        this.e = Lf.a();
        this.l = 210.0f;
        this.m = -1;
        this.n = -9144711;
        this.o = "°C";
        this.p = "kPa";
        this.q = i2;
        a();
    }
}
