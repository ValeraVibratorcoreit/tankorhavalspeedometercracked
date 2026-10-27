package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228hb {
    public final Lm a;
    public final Executor b;

    public C0228hb(Lm lm, Executor executor) {
        this.a = lm;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0228hb) {
            return this.a.equals(((C0228hb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
