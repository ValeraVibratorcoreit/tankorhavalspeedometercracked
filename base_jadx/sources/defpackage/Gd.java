package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Gd implements Fn {
    public final InterfaceC0107dd a = C0.b;
    public final InterfaceC0445od b;

    public Gd(C0276j c0276j) {
        this.b = c0276j;
    }

    @Override // defpackage.Fn
    public final Iterator iterator() {
        return new Fd(this);
    }
}
