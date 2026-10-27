package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class Jd implements Im, Bf {
    public final Drawable a;
    public final /* synthetic */ int b;

    public Jd(Drawable drawable, int i) {
        this.b = i;
        Ud.l("Argument must not be null", drawable);
        this.a = drawable;
    }

    private final void f() {
    }

    @Override // defpackage.Bf
    public void a() {
        switch (this.b) {
            case 0:
                ((Pd) ((Id) this.a).a.b).l.prepareToDraw();
                break;
            default:
                b();
                break;
        }
    }

    public final void b() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof Id) {
            ((Pd) ((Id) drawable).a.b).l.prepareToDraw();
        }
    }

    @Override // defpackage.Im
    public final int c() {
        switch (this.b) {
            case 0:
                Pd pd = (Pd) ((Id) this.a).a.b;
                C0580sp c0580sp = pd.a;
                return (c0580sp.j.length * 4) + c0580sp.d.limit() + c0580sp.i.length + pd.n;
            default:
                Drawable drawable = this.a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // defpackage.Im
    public final Class d() {
        switch (this.b) {
            case 0:
                return Id.class;
            default:
                return this.a.getClass();
        }
    }

    @Override // defpackage.Im
    public final void e() {
        C0634uh c0634uh;
        C0634uh c0634uh2;
        C0634uh c0634uh3;
        switch (this.b) {
            case 0:
                Id id = (Id) this.a;
                id.stop();
                id.d = true;
                Pd pd = (Pd) id.a.b;
                pd.c.clear();
                Bitmap bitmap = pd.l;
                if (bitmap != null) {
                    pd.e.k(bitmap);
                    pd.l = null;
                }
                pd.f = false;
                Md md = pd.i;
                Em em = pd.d;
                if (md != null) {
                    em.l(md);
                    pd.i = null;
                }
                Md md2 = pd.k;
                if (md2 != null) {
                    em.l(md2);
                    pd.k = null;
                }
                Md md3 = pd.m;
                if (md3 != null) {
                    em.l(md3);
                    pd.m = null;
                }
                C0580sp c0580sp = pd.a;
                c0580sp.l = null;
                byte[] bArr = c0580sp.i;
                C0096d2 c0096d2 = c0580sp.c;
                if (bArr != null && (c0634uh3 = (C0634uh) c0096d2.c) != null) {
                    c0634uh3.g(bArr);
                }
                int[] iArr = c0580sp.j;
                if (iArr != null && (c0634uh2 = (C0634uh) c0096d2.c) != null) {
                    c0634uh2.g(iArr);
                }
                Bitmap bitmap2 = c0580sp.m;
                if (bitmap2 != null) {
                    ((InterfaceC0621u4) c0096d2.b).k(bitmap2);
                }
                c0580sp.m = null;
                c0580sp.d = null;
                c0580sp.s = null;
                byte[] bArr2 = c0580sp.e;
                if (bArr2 != null && (c0634uh = (C0634uh) c0096d2.c) != null) {
                    c0634uh.g(bArr2);
                }
                pd.j = true;
                break;
        }
    }

    @Override // defpackage.Im
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
