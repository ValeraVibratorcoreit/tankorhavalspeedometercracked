package defpackage;

/* JADX INFO: renamed from: rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0546rm extends RuntimeException {
    public C0546rm(Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
    }
}
