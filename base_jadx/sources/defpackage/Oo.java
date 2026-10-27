package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class Oo implements Mk {
    public final C0603th a;
    public int b;
    public Bitmap.Config c;

    public Oo(C0603th c0603th) {
        this.a = c0603th;
    }

    @Override // defpackage.Mk
    public final void a() {
        this.a.a(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oo)) {
            return false;
        }
        Oo oo = (Oo) obj;
        return this.b == oo.b && Qr.b(this.c, oo.c);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return Po.c(this.b, this.c);
    }
}
