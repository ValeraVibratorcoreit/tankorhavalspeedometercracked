package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Jo implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Ko b;

    public Jo(Ko ko, boolean z) {
        this.b = ko;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Ko ko = this.b;
        ko.getClass();
        Qr.a();
        C0441o9 c0441o9 = ko.a;
        boolean z = c0441o9.a;
        boolean z2 = this.a;
        c0441o9.a = z2;
        if (z != z2) {
            ((Z6) c0441o9.b).a(z2);
        }
    }
}
