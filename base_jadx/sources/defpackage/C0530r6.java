package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0530r6 implements Fn {
    public final /* synthetic */ Iterable a;

    public C0530r6(List list) {
        this.a = list;
    }

    @Override // defpackage.Fn
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
