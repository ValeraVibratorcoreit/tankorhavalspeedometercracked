package defpackage;

import android.window.BackEvent;

/* JADX INFO: renamed from: m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0371m1 {
    public static final C0371m1 a = new C0371m1();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        Tf.j("backEvent", backEvent);
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        Tf.j("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        Tf.j("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        Tf.j("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
