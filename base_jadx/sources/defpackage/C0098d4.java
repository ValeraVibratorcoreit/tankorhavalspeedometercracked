package defpackage;

import android.widget.TextView;
import java.util.Locale;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0098d4 implements InterfaceC0394mo, Mj, InterfaceC0322ke, Vn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0098d4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0394mo
    public void b(String str) {
        switch (this.a) {
            case 2:
                C0509qf c0509qf = (C0509qf) this.b;
                c0509qf.T.z = str;
                c0509qf.e0();
                break;
            case 3:
            default:
                Dq dq = (Dq) this.b;
                dq.T.z = str;
                dq.c0();
                break;
            case 4:
                C0574sj c0574sj = (C0574sj) this.b;
                c0574sj.T.z = str;
                c0574sj.c0();
                break;
        }
    }

    @Override // defpackage.Vn
    public void c(boolean z) {
        C0646ut c0646ut = (C0646ut) this.b;
        if (c0646ut.U == null || F4.j(c0646ut.I(), "android.permission.CHANGE_WIFI_STATE") != 0) {
            return;
        }
        c0646ut.U.setWifiEnabled(z);
    }

    @Override // defpackage.Mj
    public void w(Object obj) {
        Float f = (Float) obj;
        switch (this.a) {
            case 5:
                C0240hn c0240hn = (C0240hn) this.b;
                c0240hn.getClass();
                if (f.floatValue() >= 0.0f) {
                    float fFloatValue = f.floatValue() / 1000.0f;
                    if (Math.abs(c0240hn.g - fFloatValue) > 0.01d) {
                        Float fValueOf = Float.valueOf(fFloatValue);
                        int i = f.floatValue() < 6000.0f ? c0240hn.e : c0240hn.f;
                        TextView textView = (TextView) c0240hn.findViewById(R.id.rpmInfoBlock);
                        if (textView != null) {
                            String str = String.format(Locale.US, "%.1f", fValueOf);
                            textView.setTextColor(i);
                            textView.setText(str);
                        }
                        c0240hn.g = fFloatValue;
                    }
                }
                break;
            default:
                C0211gp c0211gp = (C0211gp) this.b;
                c0211gp.getClass();
                if (f.floatValue() >= 0.0f) {
                    float fFloatValue2 = f.floatValue();
                    float fFloatValue3 = f.floatValue();
                    float f2 = c0211gp.h;
                    if (fFloatValue3 > c0211gp.l) {
                        f2 = c0211gp.j;
                    } else if (fFloatValue3 > c0211gp.k) {
                        f2 = c0211gp.i;
                    }
                    Float fValueOf2 = Float.valueOf(fFloatValue2 * f2);
                    int i2 = c0211gp.o;
                    TextView textView2 = (TextView) c0211gp.findViewById(R.id.speedInfoBlock);
                    if (textView2 != null) {
                        String str2 = String.format(Locale.US, "%.0f", fValueOf2);
                        textView2.setTextColor(i2);
                        textView2.setText(str2);
                    }
                }
                break;
        }
    }
}
