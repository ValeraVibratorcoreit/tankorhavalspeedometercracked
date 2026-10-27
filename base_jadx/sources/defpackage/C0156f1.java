package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0156f1 implements Im {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C0156f1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void f() {
    }

    @Override // defpackage.Im
    public final int c() {
        switch (this.a) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.b;
                return Qr.d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.b).length;
            case 2:
                return 1;
            default:
                return Qr.c((Bitmap) this.b);
        }
    }

    @Override // defpackage.Im
    public final Class d() {
        switch (this.a) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return this.b.getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.Im
    public final void e() {
        switch (this.a) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    @Override // defpackage.Im
    public final Object get() {
        switch (this.a) {
            case 0:
                return (AnimatedImageDrawable) this.b;
            case 1:
                return (byte[]) this.b;
            case 2:
                return this.b;
            default:
                return (Bitmap) this.b;
        }
    }

    public C0156f1(byte[] bArr) {
        this.a = 1;
        Ud.l("Argument must not be null", bArr);
        this.b = bArr;
    }

    public C0156f1(File file) {
        this.a = 2;
        Ud.l("Argument must not be null", file);
        this.b = file;
    }
}
