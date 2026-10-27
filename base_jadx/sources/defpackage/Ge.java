package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public final class Ge implements InterfaceC0597tb {
    public P4 a;
    public O4 b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public Ge(Pj pj, Gl gl, P4 p4, O4 o4) {
        Tf.j("connection", gl);
        Tf.j("source", p4);
        Tf.j("sink", o4);
        this.f = pj;
        this.g = gl;
        this.a = p4;
        this.b = o4;
        this.d = new O5(p4);
    }

    @Override // defpackage.InterfaceC0597tb
    public Mo a(T1 t1, long j) {
        Tf.j("request", t1);
        if ("chunked".equalsIgnoreCase(((C0569se) t1.e).a("Transfer-Encoding"))) {
            if (this.c == 1) {
                this.c = 2;
                return new Be(this);
            }
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.c == 1) {
            this.c = 2;
            return new Ee(this);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    @Override // defpackage.InterfaceC0597tb
    public void b(T1 t1) {
        Tf.j("request", t1);
        Proxy.Type type = ((Gl) this.g).q.b.type();
        Tf.i("connection.route().proxy.type()", type);
        StringBuilder sb = new StringBuilder();
        sb.append((String) t1.d);
        sb.append(' ');
        C0201gf c0201gf = (C0201gf) t1.c;
        if (c0201gf.a || type != Proxy.Type.HTTP) {
            String strB = c0201gf.b();
            String strD = c0201gf.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(c0201gf);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Tf.i("StringBuilder().apply(builderAction).toString()", string);
        j((C0569se) t1.e, string);
    }

    @Override // defpackage.InterfaceC0597tb
    public Xo c(C0117dn c0117dn) {
        if (!AbstractC0139ef.a(c0117dn)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(C0117dn.n(c0117dn, "Transfer-Encoding"))) {
            C0201gf c0201gf = (C0201gf) c0117dn.a.c;
            if (this.c == 4) {
                this.c = 5;
                return new Ce(this, c0201gf);
            }
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        long jK = Rr.k(c0117dn);
        if (jK != -1) {
            return i(jK);
        }
        if (this.c == 4) {
            this.c = 5;
            ((Gl) this.g).k();
            return new Fe(this);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    @Override // defpackage.InterfaceC0597tb
    public void cancel() {
        Socket socket = ((Gl) this.g).b;
        if (socket != null) {
            Rr.e(socket);
        }
    }

    @Override // defpackage.InterfaceC0597tb
    public void d() {
        this.b.flush();
    }

    @Override // defpackage.InterfaceC0597tb
    public void e() {
        this.b.flush();
    }

    @Override // defpackage.InterfaceC0597tb
    public C0086cn f(boolean z) throws IOException {
        O5 o5 = (O5) this.d;
        int i = this.c;
        if (i != 1 && i != 3) {
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        C0170ff c0170ff = null;
        try {
            String strH = ((P4) o5.c).h(o5.b);
            o5.b -= (long) strH.length();
            Z1 z1E = AbstractC0390mk.E(strH);
            int i2 = z1E.b;
            C0086cn c0086cn = new C0086cn();
            c0086cn.b = (EnumC0268il) z1E.c;
            c0086cn.c = i2;
            c0086cn.d = (String) z1E.d;
            c0086cn.f = o5.f().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.c = 3;
            } else {
                this.c = 4;
            }
            return c0086cn;
        } catch (EOFException e) {
            C0201gf c0201gf = ((Gl) this.g).q.a.a;
            c0201gf.getClass();
            try {
                C0170ff c0170ff2 = new C0170ff();
                c0170ff2.d(c0201gf, "/...");
                c0170ff = c0170ff2;
            } catch (IllegalArgumentException unused) {
            }
            Tf.f(c0170ff);
            c0170ff.e = C0225h8.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            c0170ff.f = C0225h8.g("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            throw new IOException("unexpected end of stream on " + c0170ff.a().i, e);
        }
    }

    @Override // defpackage.InterfaceC0597tb
    public long g(C0117dn c0117dn) {
        if (!AbstractC0139ef.a(c0117dn)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C0117dn.n(c0117dn, "Transfer-Encoding"))) {
            return -1L;
        }
        return Rr.k(c0117dn);
    }

    @Override // defpackage.InterfaceC0597tb
    public Gl h() {
        return (Gl) this.g;
    }

    public De i(long j) {
        if (this.c == 4) {
            this.c = 5;
            return new De(this, j);
        }
        throw new IllegalStateException(("state: " + this.c).toString());
    }

    public void j(C0569se c0569se, String str) {
        Tf.j("headers", c0569se);
        Tf.j("requestLine", str);
        if (this.c != 0) {
            throw new IllegalStateException(("state: " + this.c).toString());
        }
        O4 o4 = this.b;
        o4.m(str).m("\r\n");
        int size = c0569se.size();
        for (int i = 0; i < size; i++) {
            o4.m(c0569se.b(i)).m(": ").m(c0569se.d(i)).m("\r\n");
        }
        o4.m("\r\n");
        this.c = 1;
    }

    public Ge(C0334kq c0334kq) {
        Tf.j("taskRunner", c0334kq);
        this.g = c0334kq;
        this.f = Ke.a;
    }
}
