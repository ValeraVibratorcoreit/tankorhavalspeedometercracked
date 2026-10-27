package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public final class Ko extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C0441o9 a;

    public Ko(C0441o9 c0441o9) {
        this.a = c0441o9;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Qr.f().post(new Jo(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Qr.f().post(new Jo(this, false));
    }
}
