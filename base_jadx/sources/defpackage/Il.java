package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Il {
    public int a;
    public final Dl b;
    public final List c;
    public final int d;
    public final C0566sb e;
    public final T1 f;
    public final int g;
    public final int h;
    public final int i;

    public Il(Dl dl, List list, int i, C0566sb c0566sb, T1 t1, int i2, int i3, int i4) {
        Tf.j("call", dl);
        Tf.j("interceptors", list);
        Tf.j("request", t1);
        this.b = dl;
        this.c = list;
        this.d = i;
        this.e = c0566sb;
        this.f = t1;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public static Il a(Il il, int i, C0566sb c0566sb, T1 t1, int i2) {
        if ((i2 & 1) != 0) {
            i = il.d;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c0566sb = il.e;
        }
        C0566sb c0566sb2 = c0566sb;
        if ((i2 & 4) != 0) {
            t1 = il.f;
        }
        T1 t2 = t1;
        int i4 = il.g;
        int i5 = il.h;
        int i6 = il.i;
        il.getClass();
        Tf.j("request", t2);
        return new Il(il.b, il.c, i3, c0566sb2, t2, i4, i5, i6);
    }

    public final C0117dn b(T1 t1) {
        Tf.j("request", t1);
        List list = this.c;
        int size = list.size();
        int i = this.d;
        if (i >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.a++;
        C0566sb c0566sb = this.e;
        if (c0566sb != null) {
            if (!c0566sb.e.b((C0201gf) t1.c)) {
                throw new IllegalStateException(("network interceptor " + ((Rf) list.get(i - 1)) + " must retain the same host and port").toString());
            }
            if (this.a != 1) {
                throw new IllegalStateException(("network interceptor " + ((Rf) list.get(i - 1)) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        Il ilA = a(this, i2, null, t1, 58);
        Rf rf = (Rf) list.get(i);
        C0117dn c0117dnA = rf.a(ilA);
        if (c0117dnA == null) {
            throw new NullPointerException("interceptor " + rf + " returned null");
        }
        if (c0566sb != null && i2 < list.size() && ilA.a != 1) {
            throw new IllegalStateException(("network interceptor " + rf + " must call proceed() exactly once").toString());
        }
        if (c0117dnA.g != null) {
            return c0117dnA;
        }
        throw new IllegalStateException(("interceptor " + rf + " returned a response with no body").toString());
    }
}
