package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: ej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0143ej {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0340l1.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0143ej)) {
            return false;
        }
        C0143ej c0143ej = (C0143ej) obj;
        if (this.a == c0143ej.a && this.b == c0143ej.b && this.d == c0143ej.d && this.e == c0143ej.e) {
            return a().getClass().equals(c0143ej.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "\n" + C0143ej.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.a + " duration: " + this.b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.e + "}\n";
    }
}
