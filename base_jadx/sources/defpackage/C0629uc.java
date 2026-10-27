package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629uc extends Jq {
    public Jq e;

    public C0629uc(Jq jq) {
        Tf.j("delegate", jq);
        this.e = jq;
    }

    @Override // defpackage.Jq
    public final Jq a() {
        return this.e.a();
    }

    @Override // defpackage.Jq
    public final Jq b() {
        return this.e.b();
    }

    @Override // defpackage.Jq
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.Jq
    public final Jq d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.Jq
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.Jq
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.Jq
    public final Jq g(long j, TimeUnit timeUnit) {
        Tf.j("unit", timeUnit);
        return this.e.g(j, timeUnit);
    }
}
