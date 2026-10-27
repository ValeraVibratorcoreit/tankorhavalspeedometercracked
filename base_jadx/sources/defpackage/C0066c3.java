package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0066c3 extends Fo implements Map {
    public C0035b3 h;

    public C0066c3(C0066c3 c0066c3) {
        i(c0066c3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new C0035b3(this, 0);
        }
        C0035b3 c0035b3 = this.h;
        if (c0035b3.a == null) {
            c0035b3.a = new Gh(c0035b3, 0);
        }
        return c0035b3.a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new C0035b3(this, 0);
        }
        C0035b3 c0035b3 = this.h;
        if (c0035b3.b == null) {
            c0035b3.b = new Gh(c0035b3, 1);
        }
        return c0035b3.b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new C0035b3(this, 0);
        }
        C0035b3 c0035b3 = this.h;
        if (c0035b3.c == null) {
            c0035b3.c = new Ih(c0035b3);
        }
        return c0035b3.c;
    }
}
