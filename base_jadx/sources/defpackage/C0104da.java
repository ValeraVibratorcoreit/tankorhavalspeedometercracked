package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0104da implements Fn {
    public final Fn a;
    public final int b;

    public C0104da(Fn fn, int i) {
        this.a = fn;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.Fn
    public final Iterator iterator() {
        return new C0307k(this);
    }
}
