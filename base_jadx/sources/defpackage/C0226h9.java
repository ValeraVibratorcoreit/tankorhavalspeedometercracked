package defpackage;

/* JADX INFO: renamed from: h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0226h9 extends X8 {
    public int m;

    public C0226h9(AbstractC0615tt abstractC0615tt) {
        super(abstractC0615tt);
        if (abstractC0615tt instanceof C0693we) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.X8
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (V8 v8 : this.k) {
            v8.a(v8);
        }
    }
}
