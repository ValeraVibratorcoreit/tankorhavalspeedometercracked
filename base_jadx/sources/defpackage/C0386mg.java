package defpackage;

/* JADX INFO: renamed from: mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0386mg {
    public final String a;

    public C0386mg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0386mg) {
            return this.a.equals(((C0386mg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return Vo.h(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
