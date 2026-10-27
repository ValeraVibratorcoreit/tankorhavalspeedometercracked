package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Pd {
    public final C0580sp a;
    public final Handler b;
    public final ArrayList c;
    public final Em d;
    public final InterfaceC0621u4 e;
    public boolean f;
    public boolean g;
    public C0794zm h;
    public Md i;
    public boolean j;
    public Md k;
    public Bitmap l;
    public Md m;
    public int n;
    public int o;
    public int p;

    public Pd(a aVar, C0580sp c0580sp, int i, int i2, Bitmap bitmap) {
        Ir ir = Ir.b;
        InterfaceC0621u4 interfaceC0621u4 = aVar.a;
        Vd vd = aVar.c;
        Context baseContext = vd.getBaseContext();
        Ud.l("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", baseContext);
        Em emB = a.a(baseContext).e.b(baseContext);
        Context baseContext2 = vd.getBaseContext();
        Ud.l("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", baseContext2);
        Em emB2 = a.a(baseContext2).e.b(baseContext2);
        emB2.getClass();
        C0794zm c0794zmT = new C0794zm(emB2.a, emB2, Bitmap.class, emB2.b).a(Em.k).a(((Gm) ((Gm) ((Gm) new Gm().d(C0317k9.b)).r()).n()).h(i, i2));
        this.c = new ArrayList();
        this.d = emB;
        Handler handler = new Handler(Looper.getMainLooper(), new Od(this, 0));
        this.e = interfaceC0621u4;
        this.b = handler;
        this.h = c0794zmT;
        this.a = c0580sp;
        c(ir, bitmap);
    }

    public final void a() {
        int i;
        int i2;
        if (!this.f || this.g) {
            return;
        }
        Md md = this.m;
        if (md != null) {
            this.m = null;
            b(md);
            return;
        }
        this.g = true;
        C0580sp c0580sp = this.a;
        Qd qd = c0580sp.l;
        int i3 = qd.c;
        if (i3 <= 0 || (i2 = c0580sp.k) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((Ld) qd.e.get(i2)).i;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (c0580sp.k + 1) % c0580sp.l.c;
        c0580sp.k = i4;
        this.k = new Md(this.b, i4, jUptimeMillis);
        C0794zm c0794zmX = this.h.a((Gm) new Gm().m(new Lj(Double.valueOf(Math.random())))).x(c0580sp);
        c0794zmX.w(this.k, c0794zmX);
    }

    public final void b(Md md) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, md).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = md;
            return;
        }
        if (md.g != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.k(bitmap);
                this.l = null;
            }
            Md md2 = this.i;
            this.i = md;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Id id = (Id) ((Nd) arrayList.get(size));
                Object callback = id.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    id.stop();
                    id.invalidateSelf();
                } else {
                    id.invalidateSelf();
                    Pd pd = (Pd) id.a.b;
                    Md md3 = pd.i;
                    if ((md3 != null ? md3.e : -1) == pd.a.l.c - 1) {
                        id.f++;
                    }
                    int i = id.g;
                    if (i != -1 && id.f >= i) {
                        id.stop();
                    }
                }
            }
            if (md2 != null) {
                handler.obtainMessage(2, md2).sendToTarget();
            }
        }
        a();
    }

    public final void c(InterfaceC0182fr interfaceC0182fr, Bitmap bitmap) {
        Ud.l("Argument must not be null", interfaceC0182fr);
        Ud.l("Argument must not be null", bitmap);
        this.l = bitmap;
        this.h = this.h.a(new Gm().p(interfaceC0182fr, true));
        this.n = Qr.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
