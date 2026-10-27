package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0502q8 {
    public final Class a;
    public final List b;
    public final Um c;
    public final Nk d;
    public final String e;

    public C0502q8(Class cls, Class cls2, Class cls3, List list, Um um, K2 k2) {
        this.a = cls;
        this.b = list;
        this.c = um;
        this.d = k2;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Im a(int i, int i2, Q0 q0, InterfaceC0132e8 interfaceC0132e8, C0544rk c0544rk) {
        Im imB;
        InterfaceC0182fr interfaceC0182fr;
        int i3;
        boolean z;
        boolean z2;
        Object y7;
        String str;
        Nk nk = this.d;
        Object objB = nk.b();
        Ud.l("Argument must not be null", objB);
        List list = (List) objB;
        try {
            Im imB2 = b(interfaceC0132e8, i, i2, c0544rk, list);
            nk.a(list);
            RunnableC0471p8 runnableC0471p8 = (RunnableC0471p8) q0.b;
            runnableC0471p8.getClass();
            Class<?> cls = imB2.get().getClass();
            int i4 = q0.a;
            C0409n8 c0409n8 = runnableC0471p8.a;
            Qm qmC = null;
            if (i4 != 4) {
                InterfaceC0182fr interfaceC0182frF = c0409n8.f(cls);
                imB = interfaceC0182frF.b(runnableC0471p8.h, imB2, runnableC0471p8.l, runnableC0471p8.m);
                interfaceC0182fr = interfaceC0182frF;
            } else {
                imB = imB2;
                interfaceC0182fr = null;
            }
            if (!imB2.equals(imB)) {
                imB2.e();
            }
            if (c0409n8.c.a().d.c(imB.d()) != null) {
                C0577sm c0577smA = c0409n8.c.a();
                c0577smA.getClass();
                qmC = c0577smA.d.c(imB.d());
                if (qmC == null) {
                    throw new C0546rm(imB.d());
                }
                i3 = qmC.i(runnableC0471p8.o);
            } else {
                i3 = 3;
            }
            InterfaceC0171fg interfaceC0171fg = runnableC0471p8.v;
            ArrayList arrayListB = c0409n8.b();
            int size = arrayListB.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                if (((Wi) arrayListB.get(i5)).a.equals(interfaceC0171fg)) {
                    z = true;
                    break;
                }
                i5++;
            }
            if (runnableC0471p8.n.d(i4, i3, !z)) {
                if (qmC == null) {
                    throw new C0546rm(imB.get().getClass());
                }
                int iO = Vo.o(i3);
                if (iO == 0) {
                    z2 = false;
                    y7 = new Y7(runnableC0471p8.v, runnableC0471p8.i);
                } else {
                    if (iO != 1) {
                        if (i3 == 1) {
                            str = "SOURCE";
                        } else if (i3 != 2) {
                            str = i3 != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        throw new IllegalArgumentException("Unknown strategy: ".concat(str));
                    }
                    z2 = false;
                    y7 = new Km(c0409n8.c.a, runnableC0471p8.v, runnableC0471p8.i, runnableC0471p8.l, runnableC0471p8.m, interfaceC0182fr, cls, runnableC0471p8.o);
                }
                C0418nh c0418nh = (C0418nh) C0418nh.e.b();
                c0418nh.d = z2;
                c0418nh.c = 1;
                c0418nh.b = imB;
                K2 k2 = runnableC0471p8.f;
                k2.b = y7;
                k2.c = qmC;
                k2.d = c0418nh;
                imB = c0418nh;
            }
            return this.c.m(imB, c0544rk);
        } catch (Throwable th) {
            nk.a(list);
            throw th;
        }
    }

    public final Im b(InterfaceC0132e8 interfaceC0132e8, int i, int i2, C0544rk c0544rk, List list) throws Xd {
        List list2 = this.b;
        int size = list2.size();
        Im imA = null;
        for (int i3 = 0; i3 < size; i3++) {
            Mm mm = (Mm) list2.get(i3);
            try {
                if (mm.b(interfaceC0132e8.f(), c0544rk)) {
                    imA = mm.a(interfaceC0132e8.f(), i, i2, c0544rk);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + mm, e);
                }
                list.add(e);
            }
            if (imA != null) {
                break;
            }
        }
        if (imA != null) {
            return imA;
        }
        throw new Xd(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
