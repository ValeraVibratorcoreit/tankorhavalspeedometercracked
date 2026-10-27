package defpackage;

import android.text.TextUtils;

/* JADX INFO: renamed from: pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0483pk {
    public static final C0387mh e = new C0387mh(4);
    public final Object a;
    public final InterfaceC0452ok b;
    public final String c;
    public volatile byte[] d;

    public C0483pk(String str, Object obj, InterfaceC0452ok interfaceC0452ok) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.a = obj;
        this.b = interfaceC0452ok;
    }

    public static C0483pk a(String str, Object obj) {
        return new C0483pk(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0483pk) {
            return this.c.equals(((C0483pk) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return Vo.h(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
