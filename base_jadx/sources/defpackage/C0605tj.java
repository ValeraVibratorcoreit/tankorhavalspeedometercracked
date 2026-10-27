package defpackage;

import java.util.Objects;

/* JADX INFO: renamed from: tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0605tj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C0605tj(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0605tj.class != obj.getClass()) {
            return false;
        }
        C0605tj c0605tj = (C0605tj) obj;
        return this.a == c0605tj.a && this.b == c0605tj.b && this.c == c0605tj.c && this.d == c0605tj.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
