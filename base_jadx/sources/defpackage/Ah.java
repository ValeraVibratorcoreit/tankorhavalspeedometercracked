package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Ah extends C0727xh {
    public InterfaceC0419ni d;

    @Override // defpackage.C0727xh
    public final int b(Object obj) {
        Im im = (Im) obj;
        if (im == null) {
            return 1;
        }
        return im.c();
    }

    @Override // defpackage.C0727xh
    public final void c(Object obj, Object obj2) {
        Im im = (Im) obj2;
        InterfaceC0419ni interfaceC0419ni = this.d;
        if (interfaceC0419ni == null || im == null) {
            return;
        }
        ((C0166fb) interfaceC0419ni).e.d(im, true);
    }
}
