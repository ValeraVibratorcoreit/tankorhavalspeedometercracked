package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0467p4 implements Mm {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C0467p4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        boolean z;
        Ll ll;
        C0474pb c0474pb;
        switch (this.a) {
            case 0:
                Im imA = ((Mm) this.b).a(obj, i, i2, c0544rk);
                if (imA == null) {
                    return null;
                }
                return new C0652v4((Resources) this.c, imA);
            case 1:
                Im imC = ((Pm) this.b).c((Uri) obj, c0544rk);
                if (imC == null) {
                    return null;
                }
                return Ud.n((InterfaceC0621u4) this.c, (Drawable) ((Jd) imC).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof Ll) {
                    ll = (Ll) inputStream;
                    z = false;
                } else {
                    z = true;
                    ll = new Ll(inputStream, (C0634uh) this.c);
                }
                ArrayDeque arrayDeque = C0474pb.c;
                synchronized (arrayDeque) {
                    c0474pb = (C0474pb) arrayDeque.poll();
                    break;
                }
                if (c0474pb == null) {
                    c0474pb = new C0474pb();
                }
                C0474pb c0474pb2 = c0474pb;
                c0474pb2.a = ll;
                Kh kh = new Kh(c0474pb2);
                C0426np c0426np = new C0426np(ll, 1, c0474pb2);
                try {
                    N9 n9 = (N9) this.b;
                    C0652v4 c0652v4A = n9.a(new K2(kh, (ArrayList) n9.d, n9.c), i, i2, c0544rk, c0426np);
                    c0474pb2.b = null;
                    c0474pb2.a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c0474pb2);
                        break;
                    }
                    return c0652v4A;
                } finally {
                    c0474pb2.b = null;
                    c0474pb2.a = null;
                    ArrayDeque arrayDeque2 = C0474pb.c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c0474pb2);
                        if (z) {
                            ll.w();
                        }
                    }
                }
        }
    }

    @Override // defpackage.Mm
    public final boolean b(Object obj, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                return ((Mm) this.b).b(obj, c0544rk);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((N9) this.b).getClass();
                return true;
        }
    }

    public C0467p4(Resources resources, Mm mm) {
        this.a = 0;
        this.c = resources;
        this.b = mm;
    }
}
