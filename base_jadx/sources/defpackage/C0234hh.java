package defpackage;

/* JADX INFO: renamed from: hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0234hh extends Os {
    public static final Qc c = new Qc(1);
    public final C0057bp b = new C0057bp();

    @Override // defpackage.Os
    public final void b() {
        C0057bp c0057bp = this.b;
        int i = c0057bp.c;
        if (i > 0) {
            Vo.l(c0057bp.b[0]);
            throw null;
        }
        Object[] objArr = c0057bp.b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c0057bp.c = 0;
    }
}
