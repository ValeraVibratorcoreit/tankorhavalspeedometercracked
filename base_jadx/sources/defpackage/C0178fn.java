package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0178fn {
    public final I0 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public C0178fn(I0 i0, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Tf.j("address", i0);
        Tf.j("socketAddress", inetSocketAddress);
        this.a = i0;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0178fn) {
            C0178fn c0178fn = (C0178fn) obj;
            if (Tf.b(c0178fn.a, this.a) && Tf.b(c0178fn.b, this.b) && Tf.b(c0178fn.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
