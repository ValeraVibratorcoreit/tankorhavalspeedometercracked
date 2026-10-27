package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0191g5 implements Rf {
    public static final C0191g5 b = new C0191g5(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0191g5(int i) {
        this.a = i;
    }

    @Override // defpackage.Rf
    public final C0117dn a(Il il) throws IOException {
        C0569se c0569se;
        int i;
        int i2 = 6;
        Object obj = null;
        int i3 = 0;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                T1 t1 = il.f;
                Tf.j("request", t1);
                C0096d2 c0096d2 = new C0096d2(t1, i2, obj);
                C0160f5 c0160f5Z = (C0160f5) t1.b;
                if (c0160f5Z == null) {
                    int i4 = C0160f5.n;
                    c0160f5Z = Ud.Z((C0569se) t1.e);
                    t1.b = c0160f5Z;
                }
                if (c0160f5Z.j) {
                    c0096d2 = new C0096d2(obj, i2, obj);
                }
                Dl dl = il.b;
                Dl dl2 = !(dl instanceof Dl) ? null : dl;
                if (dl2 != null) {
                    C0473pa c0473pa = dl2.b;
                }
                T1 t2 = (T1) c0096d2.b;
                C0117dn c0117dn = (C0117dn) c0096d2.c;
                if (t2 == null && c0117dn == null) {
                    C0086cn c0086cn = new C0086cn();
                    c0086cn.a = t1;
                    c0086cn.b = EnumC0268il.HTTP_1_1;
                    c0086cn.c = 504;
                    c0086cn.d = "Unsatisfiable Request (only-if-cached)";
                    c0086cn.g = Rr.c;
                    c0086cn.k = -1L;
                    c0086cn.l = System.currentTimeMillis();
                    C0117dn c0117dnA = c0086cn.a();
                    Tf.j("call", dl);
                    return c0117dnA;
                }
                if (t2 == null) {
                    Tf.f(c0117dn);
                    C0086cn c0086cnX = c0117dn.x();
                    C0117dn c0117dnP = C0473pa.p(c0117dn);
                    C0086cn.b(c0117dnP, "cacheResponse");
                    c0086cnX.i = c0117dnP;
                    C0117dn c0117dnA2 = c0086cnX.a();
                    Tf.j("call", dl);
                    return c0117dnA2;
                }
                if (c0117dn != null) {
                    Tf.j("call", dl);
                }
                C0117dn c0117dnB = il.b(t2);
                if (c0117dn != null) {
                    if (c0117dnB.d == 304) {
                        C0086cn c0086cnX2 = c0117dn.x();
                        Ya ya = new Ya(1);
                        C0569se c0569se2 = c0117dn.f;
                        int size = c0569se2.size();
                        int i5 = 0;
                        while (true) {
                            C0569se c0569se3 = c0117dnB.f;
                            if (i5 >= size) {
                                int size2 = c0569se3.size();
                                for (int i6 = i3; i6 < size2; i6++) {
                                    String strB = c0569se3.b(i6);
                                    if (!"Content-Length".equalsIgnoreCase(strB) && !"Content-Encoding".equalsIgnoreCase(strB) && !"Content-Type".equalsIgnoreCase(strB) && C0473pa.z(strB)) {
                                        ya.a(strB, c0569se3.d(i6));
                                    }
                                }
                                c0086cnX2.f = ya.b().c();
                                c0086cnX2.k = c0117dnB.k;
                                c0086cnX2.l = c0117dnB.l;
                                C0117dn c0117dnP2 = C0473pa.p(c0117dn);
                                C0086cn.b(c0117dnP2, "cacheResponse");
                                c0086cnX2.i = c0117dnP2;
                                C0117dn c0117dnP3 = C0473pa.p(c0117dnB);
                                C0086cn.b(c0117dnP3, "networkResponse");
                                c0086cnX2.h = c0117dnP3;
                                c0086cnX2.a();
                                Jl jl = c0117dnB.g;
                                Tf.f(jl);
                                jl.close();
                                Tf.f(null);
                                throw null;
                            }
                            String strB2 = c0569se2.b(i5);
                            String strD = c0569se2.d(i5);
                            if ("Warning".equalsIgnoreCase(strB2)) {
                                c0569se = c0569se2;
                                i = 0;
                                if (!Mp.U0(strD, "1", false)) {
                                }
                                i5++;
                                i3 = i;
                                c0569se2 = c0569se;
                            } else {
                                c0569se = c0569se2;
                                i = 0;
                            }
                            if ("Content-Length".equalsIgnoreCase(strB2) || "Content-Encoding".equalsIgnoreCase(strB2) || "Content-Type".equalsIgnoreCase(strB2) || !C0473pa.z(strB2) || c0569se3.a(strB2) == null) {
                                ya.a(strB2, strD);
                            }
                            i5++;
                            i3 = i;
                            c0569se2 = c0569se;
                        }
                    } else {
                        Jl jl2 = c0117dn.g;
                        if (jl2 != null) {
                            Rr.d(jl2);
                        }
                    }
                }
                C0086cn c0086cnX3 = c0117dnB.x();
                C0117dn c0117dnP4 = C0473pa.p(c0117dn);
                C0086cn.b(c0117dnP4, "cacheResponse");
                c0086cnX3.i = c0117dnP4;
                C0117dn c0117dnP5 = C0473pa.p(c0117dnB);
                C0086cn.b(c0117dnP5, "networkResponse");
                c0086cnX3.h = c0117dnP5;
                return c0086cnX3.a();
            default:
                Dl dl3 = il.b;
                dl3.getClass();
                synchronized (dl3) {
                    try {
                        if (!dl3.l) {
                            throw new IllegalStateException("released".toString());
                        }
                        if (!(!dl3.k)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (!(!dl3.j)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0628ub c0628ub = dl3.f;
                Tf.f(c0628ub);
                Pj pj = dl3.p;
                Tf.j("client", pj);
                try {
                    C0566sb c0566sb = new C0566sb(dl3, c0628ub, c0628ub.a(il.g, il.h, il.i, pj.f, !Tf.b((String) il.f.d, "GET")).j(pj, il));
                    dl3.i = c0566sb;
                    dl3.n = c0566sb;
                    synchronized (dl3) {
                        dl3.j = true;
                        dl3.k = true;
                    }
                    if (dl3.m) {
                        throw new IOException("Canceled");
                    }
                    return Il.a(il, 0, c0566sb, null, 61).b(il.f);
                } catch (C0209gn e) {
                    c0628ub.c(e.a);
                    throw e;
                } catch (IOException e2) {
                    c0628ub.c(e2);
                    throw new C0209gn(e2);
                }
        }
    }
}
