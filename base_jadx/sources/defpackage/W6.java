package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class W6 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public X6 a() {
        return new X6(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(W5... w5Arr) throws CloneNotSupportedException {
        Tf.j("cipherSuites", w5Arr);
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(w5Arr.length);
        for (W5 w5 : w5Arr) {
            arrayList.add(w5.a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) throws CloneNotSupportedException {
        Tf.j("cipherSuites", strArr);
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.c = (String[]) objClone;
    }

    public void d() {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.b = true;
    }

    public void e(Pq... pqArr) throws CloneNotSupportedException {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(pqArr.length);
        for (Pq pq : pqArr) {
            arrayList.add(pq.a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Serializable, java.lang.String[]] */
    public void f(String... strArr) throws CloneNotSupportedException {
        Tf.j("tlsVersions", strArr);
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.d = (String[]) objClone;
    }
}
