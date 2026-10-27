package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ae implements Xo {
    public final C0629uc a;
    public boolean b;
    public final /* synthetic */ Ge c;

    public Ae(Ge ge) {
        this.c = ge;
        this.a = new C0629uc(ge.a.b());
    }

    @Override // defpackage.Xo
    public final Jq b() {
        return this.a;
    }

    @Override // defpackage.Xo
    public long f(L4 l4, long j) throws IOException {
        Ge ge = this.c;
        Tf.j("sink", l4);
        try {
            return ge.a.f(l4, j);
        } catch (IOException e) {
            ((Gl) ge.g).k();
            n();
            throw e;
        }
    }

    public final void n() {
        Ge ge = this.c;
        int i = ge.c;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + ge.c);
        }
        C0629uc c0629uc = this.a;
        Jq jq = c0629uc.e;
        c0629uc.e = Jq.d;
        jq.a();
        jq.b();
        ge.c = 6;
    }
}
