package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Be implements Mo {
    public final C0629uc a;
    public boolean b;
    public final /* synthetic */ Ge c;

    public Be(Ge ge) {
        this.c = ge;
        this.a = new C0629uc(ge.b.b());
    }

    @Override // defpackage.Mo
    public final Jq b() {
        return this.a;
    }

    @Override // defpackage.Mo, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.b.m("0\r\n\r\n");
        Ge ge = this.c;
        C0629uc c0629uc = this.a;
        ge.getClass();
        Jq jq = c0629uc.e;
        c0629uc.e = Jq.d;
        jq.a();
        jq.b();
        this.c.c = 3;
    }

    @Override // defpackage.Mo
    public final void d(L4 l4, long j) {
        Tf.j("source", l4);
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return;
        }
        Ge ge = this.c;
        ge.b.e(j);
        O4 o4 = ge.b;
        o4.m("\r\n");
        o4.d(l4, j);
        o4.m("\r\n");
    }

    @Override // defpackage.Mo, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        this.c.b.flush();
    }
}
