package defpackage;

import android.window.BackEvent;

/* JADX INFO: renamed from: r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0527r3 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public C0527r3(BackEvent backEvent) {
        Tf.j("backEvent", backEvent);
        C0371m1 c0371m1 = C0371m1.a;
        float fD = c0371m1.d(backEvent);
        float fE = c0371m1.e(backEvent);
        float fB = c0371m1.b(backEvent);
        int iC = c0371m1.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
