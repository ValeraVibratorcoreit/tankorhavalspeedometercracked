package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0396mq extends Br {
    public final /* synthetic */ Tf j;
    public final /* synthetic */ C0458oq k;

    public C0396mq(C0458oq c0458oq, Tf tf) {
        this.k = c0458oq;
        this.j = tf;
    }

    @Override // defpackage.Br
    public final void O(int i) {
        this.k.m = true;
        this.j.M(i);
    }

    @Override // defpackage.Br
    public final void P(Typeface typeface) {
        C0458oq c0458oq = this.k;
        c0458oq.n = Typeface.create(typeface, c0458oq.c);
        c0458oq.m = true;
        this.j.N(c0458oq.n, false);
    }
}
