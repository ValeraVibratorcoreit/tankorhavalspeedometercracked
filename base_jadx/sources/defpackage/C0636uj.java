package defpackage;

import java.util.Objects;

/* JADX INFO: renamed from: uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0636uj {
    public final C0605tj a;
    public final C0605tj b;

    public C0636uj(C0605tj c0605tj, C0605tj c0605tj2) {
        this.a = c0605tj;
        this.b = c0605tj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0636uj.class != obj.getClass()) {
            return false;
        }
        C0636uj c0636uj = (C0636uj) obj;
        return Objects.equals(this.a, c0636uj.a) && Objects.equals(this.b, c0636uj.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
