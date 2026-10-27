package defpackage;

/* JADX INFO: renamed from: zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0783zb {
    public final long a;
    public final long b;

    public C0783zb(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
