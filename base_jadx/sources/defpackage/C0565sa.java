package defpackage;

import android.content.Context;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0565sa {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C0565sa(Context context) {
        boolean zS = Tf.S(context, R.attr.elevationOverlayEnabled, false);
        int i = AbstractC0390mk.i(context, R.attr.elevationOverlayColor, 0);
        int i2 = AbstractC0390mk.i(context, R.attr.elevationOverlayAccentColor, 0);
        int i3 = AbstractC0390mk.i(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zS;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f2;
    }
}
