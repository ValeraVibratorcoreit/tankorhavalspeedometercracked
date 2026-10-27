package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Ee implements Mo {
    public final C0629uc a;
    public boolean b;
    public final /* synthetic */ Ge c;

    public Ee(Ge ge) {
        this.c = ge;
        this.a = new C0629uc(ge.b.b());
    }

    @Override // defpackage.Mo
    public final Jq b() {
        return this.a;
    }

    @Override // defpackage.Mo, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        Ge ge = this.c;
        ge.getClass();
        C0629uc c0629uc = this.a;
        Jq jq = c0629uc.e;
        c0629uc.e = Jq.d;
        jq.a();
        jq.b();
        ge.c = 3;
    }

    @Override // defpackage.Mo
    public final void d(L4 l4, long j) {
        Tf.j("source", l4);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        Rr.c(l4.b, 0L, j);
        this.c.b.d(l4, j);
    }

    @Override // defpackage.Mo, java.io.Flushable
    public final void flush() {
        if (this.b) {
            return;
        }
        this.c.b.flush();
    }
}
