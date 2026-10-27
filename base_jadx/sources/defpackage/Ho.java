package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Ho implements InterfaceC0732xm, Qo, Lm {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;
    public final String a;
    public final C0704wp b;
    public final Object c;
    public final Am d;
    public final Context e;
    public final Vd f;
    public final Object g;
    public final Class h;
    public final Z3 i;
    public final int j;
    public final int k;
    public final Uk l;
    public final InterfaceC0212gq m;
    public final List n;
    public final C0387mh o;
    public final Executor p;
    public Im q;
    public K2 r;
    public long s;
    public volatile C0166fb t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    public Ho(Context context, Vd vd, Object obj, Object obj2, Class cls, Z3 z3, int i, int i2, Uk uk, InterfaceC0212gq interfaceC0212gq, List list, Am am, C0166fb c0166fb, C0387mh c0387mh) {
        D1 d1 = AbstractC0390mk.e;
        this.a = C ? String.valueOf(hashCode()) : null;
        this.b = new C0704wp();
        this.c = obj;
        this.e = context;
        this.f = vd;
        this.g = obj2;
        this.h = cls;
        this.i = z3;
        this.j = i;
        this.k = i2;
        this.l = uk;
        this.m = interfaceC0212gq;
        this.n = list;
        this.d = am;
        this.t = c0166fb;
        this.o = c0387mh;
        this.p = d1;
        this.B = 1;
        if (this.A == null && ((Map) vd.h.b).containsKey(Ud.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean b(InterfaceC0732xm interfaceC0732xm) {
        int i;
        int i2;
        Object obj;
        Class cls;
        Z3 z3;
        Uk uk;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        Z3 z4;
        Uk uk2;
        int size2;
        boolean zEquals;
        boolean zE;
        if (!(interfaceC0732xm instanceof Ho)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                z3 = this.i;
                uk = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        Ho ho = (Ho) interfaceC0732xm;
        synchronized (ho.c) {
            try {
                i3 = ho.j;
                i4 = ho.k;
                obj2 = ho.g;
                cls2 = ho.h;
                z4 = ho.i;
                uk2 = ho.l;
                List list2 = ho.n;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = Qr.a;
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (z3 == null) {
                    zE = z4 == null;
                } else {
                    zE = z3.e(z4);
                }
                if (zE && uk == uk2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        if (this.z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.b.a();
        this.m.d(this);
        K2 k2 = this.r;
        if (k2 != null) {
            synchronized (((C0166fb) k2.d)) {
                ((C0288jb) k2.b).h((Lm) k2.c);
            }
            this.r = null;
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                if (this.B == 6) {
                    return;
                }
                c();
                Im im = this.q;
                if (im != null) {
                    this.q = null;
                } else {
                    im = null;
                }
                Am am = this.d;
                if (am == null || am.e(this)) {
                    this.m.h(e());
                }
                this.B = 6;
                if (im != null) {
                    this.t.getClass();
                    C0166fb.f(im);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final void d() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable e() {
        int i;
        if (this.v == null) {
            Z3 z3 = this.i;
            Drawable drawable = z3.g;
            this.v = drawable;
            if (drawable == null && (i = z3.h) > 0) {
                Resources.Theme theme = z3.u;
                Context context = this.e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.v = Tf.A(context, context, i, theme);
            }
        }
        return this.v;
    }

    @Override // defpackage.InterfaceC0732xm
    public final void f() {
        Am am;
        int i;
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i2 = AbstractC0449oh.b;
                this.s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (Qr.i(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        Z3 z3 = this.i;
                        Drawable drawable = z3.o;
                        this.w = drawable;
                        if (drawable == null && (i = z3.p) > 0) {
                            Resources.Theme theme = z3.u;
                            Context context = this.e;
                            if (theme == null) {
                                theme = context.getTheme();
                            }
                            this.w = Tf.A(context, context, i, theme);
                        }
                    }
                    h(new Xd("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                int i3 = this.B;
                if (i3 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i3 == 4) {
                    i(this.q, 5, false);
                    return;
                }
                List list = this.n;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Vo.l(it.next());
                    }
                }
                this.B = 3;
                if (Qr.i(this.j, this.k)) {
                    m(this.j, this.k);
                } else {
                    this.m.a(this);
                }
                int i4 = this.B;
                if ((i4 == 2 || i4 == 3) && ((am = this.d) == null || am.g(this))) {
                    this.m.c(e());
                }
                if (C) {
                    g("finished run method in " + AbstractC0449oh.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str) {
        Log.v("GlideRequest", str + " this: " + this.a);
    }

    public final void h(Xd xd, int i) {
        int i2;
        int i3;
        this.b.a();
        synchronized (this.c) {
            try {
                xd.getClass();
                int i4 = this.f.i;
                if (i4 <= i) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.x + "x" + this.y + "]", xd);
                    if (i4 <= 4) {
                        xd.d();
                    }
                }
                Drawable drawableE = null;
                this.r = null;
                this.B = 5;
                Am am = this.d;
                if (am != null) {
                    am.h(this);
                }
                this.z = true;
                try {
                    List list = this.n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            Vo.l(it.next());
                            Am am2 = this.d;
                            if (am2 == null) {
                                throw null;
                            }
                            am2.c().a();
                            throw null;
                        }
                    }
                    Am am3 = this.d;
                    if (am3 == null || am3.g(this)) {
                        if (this.g == null) {
                            if (this.w == null) {
                                Z3 z3 = this.i;
                                Drawable drawable = z3.o;
                                this.w = drawable;
                                if (drawable == null && (i3 = z3.p) > 0) {
                                    Resources.Theme theme = z3.u;
                                    Context context = this.e;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.w = Tf.A(context, context, i3, theme);
                                }
                            }
                            drawableE = this.w;
                        }
                        if (drawableE == null) {
                            if (this.u == null) {
                                Z3 z4 = this.i;
                                Drawable drawable2 = z4.e;
                                this.u = drawable2;
                                if (drawable2 == null && (i2 = z4.f) > 0) {
                                    Resources.Theme theme2 = z4.u;
                                    Context context2 = this.e;
                                    if (theme2 == null) {
                                        theme2 = context2.getTheme();
                                    }
                                    this.u = Tf.A(context2, context2, i2, theme2);
                                }
                            }
                            drawableE = this.u;
                        }
                        if (drawableE == null) {
                            drawableE = e();
                        }
                        this.m.e(drawableE);
                    }
                    this.z = false;
                } catch (Throwable th) {
                    this.z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(Im im, int i, boolean z) {
        this.b.a();
        Im im2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (im == null) {
                        h(new Xd("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = im.get();
                    try {
                        if (obj != null && this.h.isAssignableFrom(obj.getClass())) {
                            Am am = this.d;
                            if (am == null || am.i(this)) {
                                k(im, obj, i);
                                return;
                            }
                            this.q = null;
                            this.B = 4;
                            this.t.getClass();
                            C0166fb.f(im);
                            return;
                        }
                        this.q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(im);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        h(new Xd(sb.toString()), 5);
                        this.t.getClass();
                        C0166fb.f(im);
                    } catch (Throwable th) {
                        im2 = im;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (im2 != null) {
                this.t.getClass();
                C0166fb.f(im2);
            }
            throw th3;
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            int i = this.B;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    public final void k(Im im, Object obj, int i) {
        Am am = this.d;
        if (am != null) {
            am.c().a();
        }
        this.B = 4;
        this.q = im;
        if (this.f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + Vo.p(i) + " for " + this.g + " with size [" + this.x + "x" + this.y + "] in " + AbstractC0449oh.a(this.s) + " ms");
        }
        if (am != null) {
            am.k(this);
        }
        this.z = true;
        try {
            List list = this.n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    Vo.l(it.next());
                    throw null;
                }
            }
            this.o.getClass();
            this.m.i(obj);
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0732xm
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 6;
        }
        return z;
    }

    public final void m(int i, int i2) {
        Object obj;
        int iRound = i;
        this.b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                try {
                    boolean z = C;
                    if (z) {
                        g("Got onSizeReady in " + AbstractC0449oh.a(this.s));
                    }
                    if (this.B == 3) {
                        this.B = 2;
                        float f = this.i.b;
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * f);
                        }
                        this.x = iRound;
                        this.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                        if (z) {
                            g("finished setup for calling load in " + AbstractC0449oh.a(this.s));
                        }
                        C0166fb c0166fb = this.t;
                        Vd vd = this.f;
                        Object obj3 = this.g;
                        Z3 z3 = this.i;
                        try {
                            obj = obj2;
                            try {
                                this.r = c0166fb.a(vd, obj3, z3.l, this.x, this.y, z3.s, this.h, this.l, z3.c, z3.r, z3.m, z3.y, z3.q, z3.i, z3.w, z3.z, z3.x, this, this.p);
                                if (this.B != 2) {
                                    this.r = null;
                                }
                                if (z) {
                                    g("finished onSizeReady in " + AbstractC0449oh.a(this.s));
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
