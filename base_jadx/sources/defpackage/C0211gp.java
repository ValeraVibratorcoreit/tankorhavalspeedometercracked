package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211gp extends AbstractC0787zf {
    public final Lf e;
    public SharedPreferences f;
    public U2 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public final int p;

    public C0211gp(Context context, Dg dg, float f, float f2) {
        super(context, dg, R.layout.speed_value_fragment);
        this.e = Lf.a();
        this.h = 1.055f;
        this.i = 1.046f;
        this.j = 1.042f;
        this.k = 76.0f;
        this.l = 96.0f;
        this.o = -1;
        this.p = R.drawable.transparent_background;
        this.m = f;
        this.n = f2;
        a();
    }

    public final void a() {
        C0768yr.e("T500.FR", "SpeedFragment.init()");
        ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(getLayout(), this);
        setBackgroundResource(this.p);
        this.f = AbstractC0390mk.l(getContext());
        TextView textView = (TextView) findViewById(R.id.speedInfoBlock);
        if (textView != null) {
            this.g = new U2(this, 8);
            this.h = Float.parseFloat(this.f.getString("ipSpeedKDefault", "1.055"));
            this.i = Float.parseFloat(this.f.getString("ipSpeedK1", "1.046"));
            this.j = Float.parseFloat(this.f.getString("ipSpeedK2", "1.042"));
            this.k = Float.parseFloat(this.f.getString("ipSpeed1", "76"));
            this.l = Float.parseFloat(this.f.getString("ipSpeedK2", "96"));
            textView.setTextSize(this.m);
            Lf.f(this.e.a, this, new C0098d4(this, 9));
        }
        TextView textView2 = (TextView) findViewById(R.id.speedText);
        if (textView2 != null) {
            textView2.setTextSize(this.n);
        }
    }

    @Override // defpackage.AbstractC0787zf, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        U2 u2 = this.g;
        if (u2 != null) {
            this.f.registerOnSharedPreferenceChangeListener(u2);
        }
        C0768yr.e("T500.INFO_FR", "onAttachedToWindow()-".concat(C0211gp.class.getName()));
    }

    @Override // defpackage.AbstractC0787zf, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        U2 u2 = this.g;
        if (u2 != null) {
            this.f.unregisterOnSharedPreferenceChangeListener(u2);
        }
        C0768yr.e("T500.INFO_FR", "onDetachedFromWindow()-".concat(C0211gp.class.getName()));
    }

    public void setSpeedColor(int i) {
        this.o = i;
    }

    public void setSpeedSize(float f) {
        this.m = f;
    }

    public void setSpeedTxtSize(float f) {
        this.n = f;
    }

    public C0211gp(Context context, Dg dg, int i) {
        super(context, dg, R.layout.speed_value_fragment);
        this.e = Lf.a();
        this.h = 1.055f;
        this.i = 1.046f;
        this.j = 1.042f;
        this.k = 76.0f;
        this.l = 96.0f;
        this.o = -1;
        this.m = 136.0f;
        this.n = 50.0f;
        this.p = i;
        a();
    }
}
