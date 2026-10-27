package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0586t0 extends WeakReference {
    public final InterfaceC0171fg a;
    public final boolean b;
    public Im c;

    public C0586t0(InterfaceC0171fg interfaceC0171fg, C0412nb c0412nb, ReferenceQueue referenceQueue) {
        super(c0412nb, referenceQueue);
        Ud.l("Argument must not be null", interfaceC0171fg);
        this.a = interfaceC0171fg;
        boolean z = c0412nb.a;
        this.c = null;
        this.b = z;
    }
}
