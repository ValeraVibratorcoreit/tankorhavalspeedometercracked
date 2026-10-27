package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Hl {
    public final long a;
    public final C0303jq b;
    public final Re c;
    public final ConcurrentLinkedQueue d;
    public final int e;

    public Hl(C0334kq c0334kq, TimeUnit timeUnit) {
        Tf.j("taskRunner", c0334kq);
        this.e = 5;
        this.a = timeUnit.toNanos(5L);
        this.b = c0334kq.f();
        this.c = new Re(1, Vo.h(new StringBuilder(), Rr.g, " ConnectionPool"), this);
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(I0 i0, Dl dl, ArrayList arrayList, boolean z) {
        Tf.j("address", i0);
        Tf.j("call", dl);
        for (Gl gl : this.d) {
            Tf.i("connection", gl);
            synchronized (gl) {
                if (z) {
                    if (gl.f == null) {
                        continue;
                    }
                }
                if (gl.h(i0, arrayList)) {
                    dl.a(gl);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(Gl gl, long j) {
        byte[] bArr = Rr.a;
        ArrayList arrayList = gl.o;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + gl.q.a.a + " was leaked. Did you forget to close a response body?";
                Gk gk = Gk.a;
                Gk.a.j(str, ((Cl) reference).a);
                arrayList.remove(i);
                gl.i = true;
                if (arrayList.isEmpty()) {
                    gl.p = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
