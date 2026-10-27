package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0360ll implements Xi {
    public final Context a;
    public final Xi b;
    public final Xi c;
    public final Class d;

    public C0360ll(Context context, Xi xi, Xi xi2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = xi;
        this.c = xi2;
        this.d = cls;
    }

    @Override // defpackage.Xi
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && Ud.O((Uri) obj);
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        Uri uri = (Uri) obj;
        return new Wi(new Lj(uri), new C0329kl(this.a, this.b, this.c, uri, i, i2, c0544rk, this.d));
    }
}
