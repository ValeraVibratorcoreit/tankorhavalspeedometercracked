package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218h1 implements Drawable.Callback {
    public final /* synthetic */ C0309k1 a;

    public C0218h1(C0309k1 c0309k1) {
        this.a = c0309k1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.a.unscheduleSelf(runnable);
    }
}
