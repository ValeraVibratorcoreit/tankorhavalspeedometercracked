package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0652v4 implements Im, Bf {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public C0652v4(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap) {
        Ud.l("Bitmap must not be null", bitmap);
        this.b = bitmap;
        Ud.l("BitmapPool must not be null", interfaceC0621u4);
        this.c = interfaceC0621u4;
    }

    public static C0652v4 b(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0652v4(interfaceC0621u4, bitmap);
    }

    @Override // defpackage.Bf
    public final void a() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                Im im = (Im) this.c;
                if (im instanceof Bf) {
                    ((Bf) im).a();
                }
                break;
        }
    }

    @Override // defpackage.Im
    public final int c() {
        switch (this.a) {
            case 0:
                return Qr.c((Bitmap) this.b);
            default:
                return ((Im) this.c).c();
        }
    }

    @Override // defpackage.Im
    public final Class d() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.Im
    public final void e() {
        switch (this.a) {
            case 0:
                ((InterfaceC0621u4) this.c).k((Bitmap) this.b);
                break;
            default:
                ((Im) this.c).e();
                break;
        }
    }

    @Override // defpackage.Im
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((Im) this.c).get());
        }
    }

    public C0652v4(Resources resources, Im im) {
        Ud.l("Argument must not be null", resources);
        this.b = resources;
        Ud.l("Argument must not be null", im);
        this.c = im;
    }
}
