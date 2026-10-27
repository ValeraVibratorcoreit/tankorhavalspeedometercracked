package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0427nq extends Tf {
    public final /* synthetic */ Context j;
    public final /* synthetic */ TextPaint k;
    public final /* synthetic */ Tf l;
    public final /* synthetic */ C0458oq m;

    public C0427nq(C0458oq c0458oq, Context context, TextPaint textPaint, Tf tf) {
        this.m = c0458oq;
        this.j = context;
        this.k = textPaint;
        this.l = tf;
    }

    @Override // defpackage.Tf
    public final void M(int i) {
        this.l.M(i);
    }

    @Override // defpackage.Tf
    public final void N(Typeface typeface, boolean z) {
        this.m.g(this.j, this.k, typeface);
        this.l.N(typeface, z);
    }
}
