package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class L implements InterfaceC0132e8 {
    public static L b;
    public Object a;

    public /* synthetic */ L(Object obj) {
        this.a = obj;
    }

    public J a(int i) {
        return null;
    }

    public J b(int i) {
        return null;
    }

    @Override // defpackage.InterfaceC0132e8
    public void c() {
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.InterfaceC0132e8
    public Object f() {
        return this.a;
    }

    public L(int i) {
        switch (i) {
            case 4:
                this.a = new Object();
                new Handler(Looper.getMainLooper(), new Od(this, 1));
                break;
            default:
                this.a = new K(this);
                break;
        }
    }
}
