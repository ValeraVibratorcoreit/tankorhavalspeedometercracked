package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class Ef implements InterfaceC0102d8 {
    public final C0634uh a;

    public Ef(C0634uh c0634uh) {
        this.a = c0634uh;
    }

    @Override // defpackage.InterfaceC0102d8
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC0102d8
    public final InterfaceC0132e8 b(Object obj) {
        return new C0308k0((InputStream) obj, this.a);
    }
}
