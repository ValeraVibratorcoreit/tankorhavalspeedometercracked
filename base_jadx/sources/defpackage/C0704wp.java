package defpackage;

/* JADX INFO: renamed from: wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704wp {
    public volatile boolean a;

    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
