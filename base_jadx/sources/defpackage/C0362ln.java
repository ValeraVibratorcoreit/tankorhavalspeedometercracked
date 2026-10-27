package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0362ln implements Map.Entry {
    public final Object a;
    public final Object b;
    public C0362ln c;
    public C0362ln d;

    public C0362ln(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0362ln)) {
            return false;
        }
        C0362ln c0362ln = (C0362ln) obj;
        return this.a.equals(c0362ln.a) && this.b.equals(c0362ln.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
