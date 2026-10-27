package defpackage;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class Re extends AbstractC0273iq {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Re(int i, String str, Object obj) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.AbstractC0273iq
    public final long a() {
        switch (this.e) {
            case 0:
                Te te = (Te) this.f;
                te.getClass();
                try {
                    te.y.z(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    te.n(2, 2, e);
                    return -1L;
                }
            case 1:
                Hl hl = (Hl) this.f;
                long jNanoTime = System.nanoTime();
                int i = 0;
                long j = Long.MIN_VALUE;
                Gl gl = null;
                int i2 = 0;
                for (Gl gl2 : hl.d) {
                    Tf.i("connection", gl2);
                    synchronized (gl2) {
                        if (hl.b(gl2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - gl2.p;
                            if (j2 > j) {
                                gl = gl2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = hl.a;
                if (j < j3 && i <= hl.e) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                Tf.f(gl);
                synchronized (gl) {
                    if (!gl.o.isEmpty()) {
                        return 0L;
                    }
                    if (gl.p + j != jNanoTime) {
                        return 0L;
                    }
                    gl.i = true;
                    hl.d.remove(gl);
                    Socket socket = gl.c;
                    Tf.f(socket);
                    Rr.e(socket);
                    if (!hl.d.isEmpty()) {
                        return 0L;
                    }
                    hl.b.a();
                    return 0L;
                }
            default:
                ((InterfaceC0107dd) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Re(String str, Te te) {
        super(str, true);
        this.e = 0;
        this.f = te;
    }
}
