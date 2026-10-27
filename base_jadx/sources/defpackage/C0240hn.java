package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0240hn extends AbstractC0787zf {
    public int e;
    public int f;
    public float g;

    public C0240hn(Context context, Dg dg, float f, float f2) {
        super(context, dg, R.layout.rpm_value_fragment);
        Lf lfA = Lf.a();
        this.e = -1;
        this.f = -65536;
        this.g = 0.0f;
        ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(getLayout(), this);
        TextView textView = (TextView) findViewById(R.id.rpmInfoBlock);
        if (textView != null) {
            textView.setTextSize(f);
            Lf.f(lfA.b, this, new C0098d4(this, 5));
        }
        TextView textView2 = (TextView) findViewById(R.id.rpmText);
        if (textView2 != null) {
            textView2.setTextSize(f2);
        }
    }

    public void setRpmColor(int i) {
        this.e = i;
    }

    public void setRpmCriticalColor(int i) {
        this.f = i;
    }
}
