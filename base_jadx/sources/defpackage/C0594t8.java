package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: renamed from: t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0594t8 implements InterfaceC0008a7 {
    public final Context a;
    public final Z6 b;

    public C0594t8(Context context, Dm dm) {
        this.a = context.getApplicationContext();
        this.b = dm;
    }

    @Override // defpackage.Bg
    public final void f() {
        Lo loB = Lo.b(this.a);
        Z6 z6 = this.b;
        synchronized (loB) {
            ((HashSet) loB.d).remove(z6);
            if (loB.b && ((HashSet) loB.d).isEmpty()) {
                C0441o9 c0441o9 = (C0441o9) loB.c;
                ((ConnectivityManager) ((InterfaceC0015ae) c0441o9.c).get()).unregisterNetworkCallback((Ko) c0441o9.d);
                loB.b = false;
            }
        }
    }

    @Override // defpackage.Bg
    public final void j() {
        Lo loB = Lo.b(this.a);
        Z6 z6 = this.b;
        synchronized (loB) {
            ((HashSet) loB.d).add(z6);
            loB.c();
        }
    }

    @Override // defpackage.Bg
    public final void k() {
    }
}
