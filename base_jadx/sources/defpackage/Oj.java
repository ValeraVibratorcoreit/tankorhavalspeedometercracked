package defpackage;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class Oj {
    public final C0296jj a = new C0296jj(4);
    public final C0308k0 b = new C0308k0(5);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Vi e = new Vi(14);
    public final boolean f = true;
    public final C0473pa g;
    public final boolean h;
    public final boolean i;
    public final C0473pa j;
    public final C0473pa k;
    public final C0473pa l;
    public final SocketFactory m;
    public final List n;
    public final List o;
    public final Nj p;
    public final D5 q;
    public int r;
    public int s;
    public final int t;

    public Oj() {
        C0473pa c0473pa = C0473pa.b;
        this.g = c0473pa;
        this.h = true;
        this.i = true;
        this.j = C0473pa.c;
        this.k = C0473pa.d;
        this.l = c0473pa;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Tf.i("SocketFactory.getDefault()", socketFactory);
        this.m = socketFactory;
        this.n = Pj.A;
        this.o = Pj.z;
        this.p = Nj.a;
        this.q = D5.c;
        this.r = 10000;
        this.s = 10000;
        this.t = 10000;
    }
}
