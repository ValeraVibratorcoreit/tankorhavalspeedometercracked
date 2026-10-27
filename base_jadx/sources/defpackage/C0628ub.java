package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0628ub {
    public Q0 a;
    public C0170ff b;
    public int c;
    public int d;
    public int e;
    public C0178fn f;
    public final Hl g;
    public final I0 h;
    public final Dl i;
    public final C0473pa j;

    public C0628ub(Hl hl, I0 i0, Dl dl) {
        C0473pa c0473pa = C0473pa.e;
        Tf.j("connectionPool", hl);
        Tf.j("call", dl);
        this.g = hl;
        this.h = i0;
        this.i = dl;
        this.j = c0473pa;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0265  */
    /* JADX WARN: Code duplicated, block: B:113:0x027c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0288  */
    /* JADX WARN: Code duplicated, block: B:116:0x029d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:128:0x0308  */
    /* JADX WARN: Code duplicated, block: B:171:0x0309 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    public final Gl a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        C0178fn c0178fn;
        Q0 q0;
        C0170ff c0170ff;
        ArrayList arrayList;
        Q0 q1;
        boolean z3;
        I0 i0;
        Proxy proxy;
        String hostName;
        int port;
        boolean zContains;
        Vi vi;
        Socket socketH;
        while (!this.i.m) {
            Gl gl = this.i.g;
            if (gl != null) {
                synchronized (gl) {
                    try {
                        socketH = (gl.i || !b(gl.q.a.a)) ? this.i.h() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.i.g == null) {
                    if (socketH != null) {
                        Rr.e(socketH);
                    }
                    C0473pa c0473pa = this.j;
                    Dl dl = this.i;
                    c0473pa.getClass();
                    Tf.j("call", dl);
                    this.c = 0;
                    this.d = 0;
                    this.e = 0;
                    if (this.g.a(this.h, this.i, null, false)) {
                        gl = this.i.g;
                        Tf.f(gl);
                        C0473pa c0473pa2 = this.j;
                        Dl dl2 = this.i;
                        c0473pa2.getClass();
                        Tf.j("call", dl2);
                    } else {
                        c0178fn = this.f;
                        try {
                            if (c0178fn != null) {
                                this.f = null;
                            } else {
                                q0 = this.a;
                                if (q0 == null && q0.c()) {
                                    Q0 q2 = this.a;
                                    Tf.f(q2);
                                    if (!q2.c()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i4 = q2.a;
                                    q2.a = i4 + 1;
                                    c0178fn = (C0178fn) ((List) q2.b).get(i4);
                                } else {
                                    c0170ff = this.b;
                                    if (c0170ff == null) {
                                        I0 i1 = this.h;
                                        Dl dl3 = this.i;
                                        c0170ff = new C0170ff(i1, dl3.p.y, dl3, this.j);
                                        this.b = c0170ff;
                                    }
                                    if (c0170ff.c()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (c0170ff.b < ((List) c0170ff.d).size()) {
                                        if (c0170ff.b < ((List) c0170ff.d).size()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        i0 = (I0) c0170ff.f;
                                        if (z3) {
                                            throw new SocketException("No route to " + i0.a.e + "; exhausted proxy configurations: " + ((List) c0170ff.d));
                                        }
                                        List list = (List) c0170ff.d;
                                        int i5 = c0170ff.b;
                                        c0170ff.b = i5 + 1;
                                        proxy = (Proxy) list.get(i5);
                                        ArrayList arrayList2 = new ArrayList();
                                        c0170ff.e = arrayList2;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            C0201gf c0201gf = i0.a;
                                            hostName = c0201gf.e;
                                            port = c0201gf.f;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            Tf.j("$this$socketHost", inetSocketAddress);
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address != null) {
                                                hostName = address.getHostAddress();
                                                Tf.i("address.hostAddress", hostName);
                                            } else {
                                                hostName = inetSocketAddress.getHostName();
                                                Tf.i("hostName", hostName);
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || 65535 < port) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            ((C0473pa) c0170ff.i).getClass();
                                            Tf.j("call", (Dl) c0170ff.h);
                                            Tf.j("domainName", hostName);
                                            List listB = i0.d.B(hostName);
                                            if (listB.isEmpty()) {
                                                throw new UnknownHostException(i0.d + " returned no addresses for " + hostName);
                                            }
                                            Iterator it = listB.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = ((List) c0170ff.e).iterator();
                                        while (it2.hasNext()) {
                                            C0178fn c0178fn2 = new C0178fn((I0) c0170ff.f, proxy, (InetSocketAddress) it2.next());
                                            Vi vi2 = (Vi) c0170ff.g;
                                            synchronized (vi2) {
                                                zContains = ((LinkedHashSet) vi2.a).contains(c0178fn2);
                                            }
                                            if (zContains) {
                                                c0170ff.c.add(c0178fn2);
                                            } else {
                                                arrayList.add(c0178fn2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        AbstractC0500q6.v0(arrayList, c0170ff.c);
                                        c0170ff.c.clear();
                                    }
                                    q1 = new Q0(arrayList);
                                    this.a = q1;
                                    if (!this.i.m) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.g.a(this.h, this.i, arrayList, false)) {
                                        gl = this.i.g;
                                        Tf.f(gl);
                                        C0473pa c0473pa3 = this.j;
                                        Dl dl4 = this.i;
                                        c0473pa3.getClass();
                                        Tf.j("call", dl4);
                                    } else {
                                        if (q1.c()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i6 = q1.a;
                                        q1.a = i6 + 1;
                                        c0178fn = (C0178fn) arrayList.get(i6);
                                        gl = new Gl(this.g, c0178fn);
                                        this.i.o = gl;
                                        gl.c(i, i2, i3, z, this.i, this.j);
                                        this.i.o = null;
                                        vi = this.i.p.y;
                                        synchronized (vi) {
                                            ((LinkedHashSet) vi.a).remove(c0178fn);
                                        }
                                        if (this.g.a(this.h, this.i, arrayList, true)) {
                                            Gl gl2 = this.i.g;
                                            Tf.f(gl2);
                                            this.f = c0178fn;
                                            Socket socket = gl.c;
                                            Tf.f(socket);
                                            Rr.e(socket);
                                            C0473pa c0473pa4 = this.j;
                                            Dl dl5 = this.i;
                                            c0473pa4.getClass();
                                            Tf.j("call", dl5);
                                            gl = gl2;
                                        } else {
                                            synchronized (gl) {
                                                Hl hl = this.g;
                                                hl.getClass();
                                                byte[] bArr = Rr.a;
                                                hl.d.add(gl);
                                                hl.b.c(hl.c, 0L);
                                                this.i.a(gl);
                                            }
                                            C0473pa c0473pa5 = this.j;
                                            Dl dl6 = this.i;
                                            c0473pa5.getClass();
                                            Tf.j("call", dl6);
                                        }
                                    }
                                }
                            }
                            gl.c(i, i2, i3, z, this.i, this.j);
                            this.i.o = null;
                            vi = this.i.p.y;
                            synchronized (vi) {
                                ((LinkedHashSet) vi.a).remove(c0178fn);
                                if (this.g.a(this.h, this.i, arrayList, true)) {
                                    Gl gl3 = this.i.g;
                                    Tf.f(gl3);
                                    this.f = c0178fn;
                                    Socket socket2 = gl.c;
                                    Tf.f(socket2);
                                    Rr.e(socket2);
                                    C0473pa c0473pa6 = this.j;
                                    Dl dl7 = this.i;
                                    c0473pa6.getClass();
                                    Tf.j("call", dl7);
                                    gl = gl3;
                                } else {
                                    synchronized (gl) {
                                        Hl hl2 = this.g;
                                        hl2.getClass();
                                        byte[] bArr2 = Rr.a;
                                        hl2.d.add(gl);
                                        hl2.b.c(hl2.c, 0L);
                                        this.i.a(gl);
                                        C0473pa c0473pa7 = this.j;
                                        Dl dl8 = this.i;
                                        c0473pa7.getClass();
                                        Tf.j("call", dl8);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.i.o = null;
                            throw th2;
                        }
                        arrayList = null;
                        gl = new Gl(this.g, c0178fn);
                        this.i.o = gl;
                    }
                } else if (socketH != null) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                this.c = 0;
                this.d = 0;
                this.e = 0;
                if (this.g.a(this.h, this.i, null, false)) {
                    gl = this.i.g;
                    Tf.f(gl);
                    C0473pa c0473pa8 = this.j;
                    Dl dl9 = this.i;
                    c0473pa8.getClass();
                    Tf.j("call", dl9);
                } else {
                    c0178fn = this.f;
                    if (c0178fn != null) {
                        this.f = null;
                    } else {
                        q0 = this.a;
                        if (q0 == null) {
                        }
                        c0170ff = this.b;
                        if (c0170ff == null) {
                            I0 i7 = this.h;
                            Dl dl10 = this.i;
                            c0170ff = new C0170ff(i7, dl10.p.y, dl10, this.j);
                            this.b = c0170ff;
                        }
                        if (c0170ff.c()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (c0170ff.b < ((List) c0170ff.d).size()) {
                            if (c0170ff.b < ((List) c0170ff.d).size()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            i0 = (I0) c0170ff.f;
                            if (z3) {
                                throw new SocketException("No route to " + i0.a.e + "; exhausted proxy configurations: " + ((List) c0170ff.d));
                            }
                            List list2 = (List) c0170ff.d;
                            int i8 = c0170ff.b;
                            c0170ff.b = i8 + 1;
                            proxy = (Proxy) list2.get(i8);
                            ArrayList arrayList3 = new ArrayList();
                            c0170ff.e = arrayList3;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                C0201gf c0201gf2 = i0.a;
                                hostName = c0201gf2.e;
                                port = c0201gf2.f;
                            } else {
                                C0201gf c0201gf3 = i0.a;
                                hostName = c0201gf3.e;
                                port = c0201gf3.f;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            AbstractC0500q6.v0(arrayList, c0170ff.c);
                            c0170ff.c.clear();
                        }
                        q1 = new Q0(arrayList);
                        this.a = q1;
                        if (!this.i.m) {
                            throw new IOException("Canceled");
                        }
                        if (this.g.a(this.h, this.i, arrayList, false)) {
                            gl = this.i.g;
                            Tf.f(gl);
                            C0473pa c0473pa9 = this.j;
                            Dl dl11 = this.i;
                            c0473pa9.getClass();
                            Tf.j("call", dl11);
                        } else {
                            if (q1.c()) {
                                throw new NoSuchElementException();
                            }
                            int i9 = q1.a;
                            q1.a = i9 + 1;
                            c0178fn = (C0178fn) arrayList.get(i9);
                            gl = new Gl(this.g, c0178fn);
                            this.i.o = gl;
                            gl.c(i, i2, i3, z, this.i, this.j);
                            this.i.o = null;
                            vi = this.i.p.y;
                            synchronized (vi) {
                                ((LinkedHashSet) vi.a).remove(c0178fn);
                                if (this.g.a(this.h, this.i, arrayList, true)) {
                                    Gl gl4 = this.i.g;
                                    Tf.f(gl4);
                                    this.f = c0178fn;
                                    Socket socket3 = gl.c;
                                    Tf.f(socket3);
                                    Rr.e(socket3);
                                    C0473pa c0473pa10 = this.j;
                                    Dl dl12 = this.i;
                                    c0473pa10.getClass();
                                    Tf.j("call", dl12);
                                    gl = gl4;
                                } else {
                                    synchronized (gl) {
                                        Hl hl3 = this.g;
                                        hl3.getClass();
                                        byte[] bArr3 = Rr.a;
                                        hl3.d.add(gl);
                                        hl3.b.c(hl3.c, 0L);
                                        this.i.a(gl);
                                        C0473pa c0473pa11 = this.j;
                                        Dl dl13 = this.i;
                                        c0473pa11.getClass();
                                        Tf.j("call", dl13);
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    gl = new Gl(this.g, c0178fn);
                    this.i.o = gl;
                    gl.c(i, i2, i3, z, this.i, this.j);
                    this.i.o = null;
                    vi = this.i.p.y;
                    synchronized (vi) {
                        ((LinkedHashSet) vi.a).remove(c0178fn);
                        if (this.g.a(this.h, this.i, arrayList, true)) {
                            Gl gl5 = this.i.g;
                            Tf.f(gl5);
                            this.f = c0178fn;
                            Socket socket4 = gl.c;
                            Tf.f(socket4);
                            Rr.e(socket4);
                            C0473pa c0473pa12 = this.j;
                            Dl dl14 = this.i;
                            c0473pa12.getClass();
                            Tf.j("call", dl14);
                            gl = gl5;
                        } else {
                            synchronized (gl) {
                                Hl hl4 = this.g;
                                hl4.getClass();
                                byte[] bArr4 = Rr.a;
                                hl4.d.add(gl);
                                hl4.b.c(hl4.c, 0L);
                                this.i.a(gl);
                                C0473pa c0473pa13 = this.j;
                                Dl dl15 = this.i;
                                c0473pa13.getClass();
                                Tf.j("call", dl15);
                            }
                        }
                    }
                }
            }
            if (gl.i(z2)) {
                return gl;
            }
            gl.k();
            if (this.f == null) {
                Q0 q3 = this.a;
                if (q3 != null ? q3.c() : true) {
                    continue;
                } else {
                    C0170ff c0170ff2 = this.b;
                    if (!(c0170ff2 != null ? c0170ff2.c() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(C0201gf c0201gf) {
        Tf.j("url", c0201gf);
        C0201gf c0201gf2 = this.h.a;
        return c0201gf.f == c0201gf2.f && Tf.b(c0201gf.e, c0201gf2.e);
    }

    public final void c(IOException iOException) {
        Tf.j("e", iOException);
        this.f = null;
        if ((iOException instanceof Bp) && ((Bp) iOException).a == 8) {
            this.c++;
        } else if (iOException instanceof V6) {
            this.d++;
        } else {
            this.e++;
        }
    }
}
