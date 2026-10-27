package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0451oj {
    public static final Object k = new Object();
    public final Object a;
    public final C0455on b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final RunnableC0524r0 j;

    public C0451oj(Object obj) {
        this.a = new Object();
        this.b = new C0455on();
        this.c = 0;
        this.f = k;
        this.j = new RunnableC0524r0(this, 11);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        X2.R().h.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(Vo.g("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(AbstractC0141eh abstractC0141eh) {
        if (abstractC0141eh.b) {
            if (!abstractC0141eh.d()) {
                abstractC0141eh.a(false);
                return;
            }
            int i = abstractC0141eh.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            abstractC0141eh.c = i2;
            abstractC0141eh.a.w(this.e);
        }
    }

    public final void c(AbstractC0141eh abstractC0141eh) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (abstractC0141eh != null) {
                b(abstractC0141eh);
                abstractC0141eh = null;
            } else {
                C0455on c0455on = this.b;
                c0455on.getClass();
                C0393mn c0393mn = new C0393mn(c0455on);
                c0455on.c.put(c0393mn, Boolean.FALSE);
                while (c0393mn.hasNext()) {
                    b((AbstractC0141eh) ((Map.Entry) c0393mn.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public void e(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public C0451oj() {
        this.a = new Object();
        this.b = new C0455on();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new RunnableC0524r0(this, 11);
        this.e = obj;
        this.g = -1;
    }
}
