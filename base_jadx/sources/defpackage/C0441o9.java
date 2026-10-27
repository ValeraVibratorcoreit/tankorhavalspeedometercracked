package defpackage;

import java.io.File;

/* JADX INFO: renamed from: o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0441o9 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public C0441o9(G7 g7, Io io) {
        this.d = new Ko(this);
        this.c = g7;
        this.b = io;
    }

    public void a() {
        C0503q9.n((C0503q9) this.d, this, false);
    }

    public File b() {
        File file;
        synchronized (((C0503q9) this.d)) {
            try {
                C0472p9 c0472p9 = (C0472p9) this.b;
                if (c0472p9.f != this) {
                    throw new IllegalStateException();
                }
                if (!c0472p9.e) {
                    ((boolean[]) this.c)[0] = true;
                }
                file = c0472p9.d[0];
                ((C0503q9) this.d).a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C0441o9(C0503q9 c0503q9, C0472p9 c0472p9) {
        this.d = c0503q9;
        this.b = c0472p9;
        this.c = c0472p9.e ? null : new boolean[c0503q9.g];
    }
}
