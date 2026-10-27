package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Vp implements Serializable {
    public InterfaceC0107dd a;
    public volatile Object b = C0473pa.l;
    public final Object c = this;

    public Vp(InterfaceC0107dd interfaceC0107dd) {
        this.a = interfaceC0107dd;
    }

    public final Object a() {
        Object objA;
        Object obj = this.b;
        C0473pa c0473pa = C0473pa.l;
        if (obj != c0473pa) {
            return obj;
        }
        synchronized (this.c) {
            objA = this.b;
            if (objA == c0473pa) {
                InterfaceC0107dd interfaceC0107dd = this.a;
                Tf.f(interfaceC0107dd);
                objA = interfaceC0107dd.a();
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.b != C0473pa.l ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
