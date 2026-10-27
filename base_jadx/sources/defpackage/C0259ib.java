package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0259ib implements Iterable {
    public final List a;

    public C0259ib(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
