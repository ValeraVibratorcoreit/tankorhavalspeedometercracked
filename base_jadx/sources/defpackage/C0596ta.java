package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0596ta extends Ud {
    public final /* synthetic */ C0627ua h;

    public C0596ta(C0627ua c0627ua) {
        this.h = c0627ua;
    }

    @Override // defpackage.Ud
    public final void X(Throwable th) {
        this.h.a.d(th);
    }

    @Override // defpackage.Ud
    public final void Y(C0296jj c0296jj) {
        C0627ua c0627ua = this.h;
        c0627ua.c = c0296jj;
        C0296jj c0296jj2 = c0627ua.c;
        C0782za c0782za = c0627ua.a;
        c0627ua.b = new K2(c0296jj2, c0782za.g, c0782za.i, Build.VERSION.SDK_INT >= 34 ? Ea.a() : Tf.B());
        c0627ua.a.e();
    }
}
