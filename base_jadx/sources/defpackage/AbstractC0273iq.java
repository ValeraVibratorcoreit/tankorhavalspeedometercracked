package defpackage;

/* JADX INFO: renamed from: iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0273iq {
    public C0303jq a;
    public long b;
    public final String c;
    public final boolean d;

    public AbstractC0273iq(String str, boolean z) {
        Tf.j("name", str);
        this.c = str;
        this.d = z;
        this.b = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.c;
    }
}
