package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0007a6 {
    public final int a;
    public final Method b;

    public C0007a6(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0007a6)) {
            return false;
        }
        C0007a6 c0007a6 = (C0007a6) obj;
        return this.a == c0007a6.a && this.b.getName().equals(c0007a6.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
