package defpackage;

/* JADX INFO: renamed from: il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0268il {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public final String a;

    EnumC0268il(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
