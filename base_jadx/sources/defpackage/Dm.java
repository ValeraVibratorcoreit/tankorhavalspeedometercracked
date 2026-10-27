package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Dm implements Z6 {
    public final Lo a;
    public final /* synthetic */ Em b;

    public Dm(Em em, Lo lo) {
        this.b = em;
        this.a = lo;
    }

    @Override // defpackage.Z6
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                this.a.g();
            }
        }
    }
}
