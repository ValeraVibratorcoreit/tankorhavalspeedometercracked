package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0193g7 implements Fn {
    public final AtomicReference a;

    public C0193g7(Gd gd) {
        this.a = new AtomicReference(gd);
    }

    @Override // defpackage.Fn
    public final Iterator iterator() {
        Fn fn = (Fn) this.a.getAndSet(null);
        if (fn != null) {
            return fn.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
