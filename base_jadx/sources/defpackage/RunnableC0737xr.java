package defpackage;

/* JADX INFO: renamed from: xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0737xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0768yr b;

    public /* synthetic */ RunnableC0737xr(C0768yr c0768yr, int i) {
        this.a = i;
        this.b = c0768yr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0768yr c0768yr = this.b;
                if (!c0768yr.b.isEmpty() && c0768yr.e.compareAndSet(false, true)) {
                    c0768yr.h();
                }
                c0768yr.d.postDelayed(new RunnableC0737xr(c0768yr, 0), 3000L);
                break;
            default:
                this.b.h();
                break;
        }
    }
}
