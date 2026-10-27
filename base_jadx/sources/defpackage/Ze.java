package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class Ze extends C0404n3 {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ Ze(Object obj, int i) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.C0404n3
    public IOException j(IOException iOException) {
        switch (this.k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 1:
            default:
                return super.j(iOException);
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    @Override // defpackage.C0404n3
    public final void k() {
        Socket socket;
        switch (this.k) {
            case 0:
                ((C0016af) this.l).e(9);
                Te te = ((C0016af) this.l).n;
                synchronized (te) {
                    long j = te.p;
                    long j2 = te.o;
                    if (j < j2) {
                        return;
                    }
                    te.o = j2 + 1;
                    te.q = System.nanoTime() + ((long) 1000000000);
                    te.i.c(new Re(Vo.h(new StringBuilder(), te.d, " ping"), te), 0L);
                    return;
                }
            case 1:
                Dl dl = (Dl) this.l;
                if (dl.m) {
                    return;
                }
                dl.m = true;
                C0566sb c0566sb = dl.n;
                if (c0566sb != null) {
                    c0566sb.f.cancel();
                }
                Gl gl = dl.o;
                if (gl != null && (socket = gl.b) != null) {
                    Rr.e(socket);
                }
                dl.b.getClass();
                return;
            default:
                Socket socket2 = (Socket) this.l;
                try {
                    socket2.close();
                    return;
                } catch (AssertionError e) {
                    if (!Tf.I(e)) {
                        throw e;
                    }
                    Qj.a.log(Level.WARNING, "Failed to close timed out socket " + socket2, (Throwable) e);
                    return;
                } catch (Exception e2) {
                    Qj.a.log(Level.WARNING, "Failed to close timed out socket " + socket2, (Throwable) e2);
                    return;
                }
        }
    }

    public void l() {
        if (i()) {
            throw j(null);
        }
    }
}
