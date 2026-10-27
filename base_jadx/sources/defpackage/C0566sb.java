package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0566sb {
    public boolean a;
    public final Gl b;
    public final Dl c;
    public final C0473pa d;
    public final C0628ub e;
    public final InterfaceC0597tb f;

    public C0566sb(Dl dl, C0628ub c0628ub, InterfaceC0597tb interfaceC0597tb) {
        C0473pa c0473pa = C0473pa.e;
        Tf.j("call", dl);
        Tf.j("finder", c0628ub);
        this.c = dl;
        this.d = c0473pa;
        this.e = c0628ub;
        this.f = interfaceC0597tb;
        this.b = interfaceC0597tb.h();
    }

    public final IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        C0473pa c0473pa = this.d;
        Dl dl = this.c;
        if (z2) {
            if (iOException != null) {
                c0473pa.getClass();
                Tf.j("call", dl);
            } else {
                c0473pa.getClass();
                Tf.j("call", dl);
            }
        }
        if (z) {
            if (iOException != null) {
                c0473pa.getClass();
                Tf.j("call", dl);
            } else {
                c0473pa.getClass();
                Tf.j("call", dl);
            }
        }
        return dl.f(this, z2, z, iOException);
    }

    public final C0086cn b(boolean z) throws IOException {
        try {
            C0086cn c0086cnF = this.f.f(z);
            if (c0086cnF != null) {
                c0086cnF.m = this;
            }
            return c0086cnF;
        } catch (IOException e) {
            this.d.getClass();
            Tf.j("call", this.c);
            c(e);
            throw e;
        }
    }

    public final void c(IOException iOException) {
        this.e.c(iOException);
        Gl glH = this.f.h();
        Dl dl = this.c;
        synchronized (glH) {
            try {
                Tf.j("call", dl);
                if (iOException instanceof Bp) {
                    if (((Bp) iOException).a == 8) {
                        int i = glH.m + 1;
                        glH.m = i;
                        if (i > 1) {
                            glH.i = true;
                            glH.k++;
                        }
                    } else if (((Bp) iOException).a != 9 || !dl.m) {
                        glH.i = true;
                        glH.k++;
                    }
                } else if (glH.f == null || (iOException instanceof V6)) {
                    glH.i = true;
                    if (glH.l == 0) {
                        Gl.d(dl.p, glH.q, iOException);
                        glH.k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
