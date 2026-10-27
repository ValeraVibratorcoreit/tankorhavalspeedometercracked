package defpackage;

import android.view.MenuItem;

/* JADX INFO: renamed from: y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0746y5 implements Runnable {
    public final /* synthetic */ C0777z5 a;
    public final /* synthetic */ MenuItem b;
    public final /* synthetic */ MenuC0604ti c;
    public final /* synthetic */ C0308k0 d;

    public RunnableC0746y5(C0308k0 c0308k0, C0777z5 c0777z5, C0759yi c0759yi, MenuC0604ti menuC0604ti) {
        this.d = c0308k0;
        this.a = c0777z5;
        this.b = c0759yi;
        this.c = menuC0604ti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0777z5 c0777z5 = this.a;
        if (c0777z5 != null) {
            C0308k0 c0308k0 = this.d;
            ((A5) c0308k0.b).A = true;
            c0777z5.b.c(false);
            ((A5) c0308k0.b).A = false;
        }
        MenuItem menuItem = this.b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.c.q(menuItem, null, 4);
        }
    }
}
