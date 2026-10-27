package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0021ak {
    public final Runnable a;
    public final Z2 b = new Z2();
    public Hc c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public C0021ak(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? Wj.a.a(new Sj(this, 0), new Sj(this, 1), new Tj(this, 0), new Tj(this, 1)) : Uj.a.a(new Tj(this, 2));
        }
    }

    public final void a() {
        Object objPrevious;
        if (this.c == null) {
            Z2 z2 = this.b;
            ListIterator<E> listIterator = z2.listIterator(z2.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((Hc) objPrevious).a);
        }
        this.c = null;
    }

    public final void b() {
        Object objPrevious;
        Hc hc = this.c;
        if (hc == null) {
            Z2 z2 = this.b;
            z2.getClass();
            ListIterator listIterator = z2.listIterator(z2.c);
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((Hc) objPrevious).a);
            hc = (Hc) objPrevious;
        }
        this.c = null;
        if (hc == null) {
            Runnable runnable = this.a;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Oc oc = hc.d;
        oc.y(true);
        if (oc.h.a) {
            oc.M();
        } else {
            oc.g.b();
        }
    }

    public final void c(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        Uj uj = Uj.a;
        if (z && !this.f) {
            uj.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            uj.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void d() {
        boolean z = this.g;
        Z2 z2 = this.b;
        boolean z3 = false;
        if (!(z2 instanceof Collection) || !z2.isEmpty()) {
            Iterator<E> it = z2.iterator();
            while (it.hasNext()) {
                if (((Hc) it.next()).a) {
                    z3 = true;
                    break;
                }
            }
        }
        this.g = z3;
        if (z3 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        c(z3);
    }
}
