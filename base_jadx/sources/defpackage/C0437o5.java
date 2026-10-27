package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0437o5 extends Tf {
    public final Typeface j;
    public final C0308k0 k;
    public boolean l;

    public C0437o5(C0308k0 c0308k0, Typeface typeface) {
        this.j = typeface;
        this.k = c0308k0;
    }

    @Override // defpackage.Tf
    public final void M(int i) {
        if (this.l) {
            return;
        }
        C0283j6 c0283j6 = (C0283j6) this.k.b;
        if (c0283j6.j(this.j)) {
            c0283j6.h(false);
        }
    }

    @Override // defpackage.Tf
    public final void N(Typeface typeface, boolean z) {
        if (this.l) {
            return;
        }
        C0283j6 c0283j6 = (C0283j6) this.k.b;
        if (c0283j6.j(typeface)) {
            c0283j6.h(false);
        }
    }
}
