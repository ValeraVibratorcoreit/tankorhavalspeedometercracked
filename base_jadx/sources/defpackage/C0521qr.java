package defpackage;

/* JADX INFO: renamed from: qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0521qr extends AbstractC0397mr {
    public final /* synthetic */ int a = 1;
    public AbstractC0366lr b;

    public /* synthetic */ C0521qr() {
    }

    @Override // defpackage.AbstractC0397mr, defpackage.InterfaceC0335kr
    public void b(AbstractC0366lr abstractC0366lr) {
        switch (this.a) {
            case 1:
                C0466p3 c0466p3 = (C0466p3) this.b;
                if (!c0466p3.D) {
                    c0466p3.G();
                    c0466p3.D = true;
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC0335kr
    public final void f(AbstractC0366lr abstractC0366lr) {
        switch (this.a) {
            case 0:
                this.b.z();
                abstractC0366lr.x(this);
                break;
            default:
                C0466p3 c0466p3 = (C0466p3) this.b;
                int i = c0466p3.C - 1;
                c0466p3.C = i;
                if (i == 0) {
                    c0466p3.D = false;
                    c0466p3.m();
                }
                abstractC0366lr.x(this);
                break;
        }
    }

    public C0521qr(AbstractC0366lr abstractC0366lr) {
        this.b = abstractC0366lr;
    }
}
