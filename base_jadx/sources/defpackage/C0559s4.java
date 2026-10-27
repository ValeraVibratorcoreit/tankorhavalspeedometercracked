package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0559s4 implements Mm {
    public final /* synthetic */ int a;
    public final InterfaceC0621u4 b;

    public C0559s4() {
        this.a = 0;
        this.b = new C0473pa(17);
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                return c((ImageDecoder.Source) obj, i, i2, c0544rk);
            default:
                return C0652v4.b(this.b, ((C0580sp) obj).b());
        }
    }

    @Override // defpackage.Mm
    public final /* bridge */ /* synthetic */ boolean b(Object obj, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    public C0652v4 c(ImageDecoder.Source source, int i, int i2, C0544rk c0544rk) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new I8(i, i2, c0544rk));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C0652v4((C0473pa) this.b, bitmapDecodeBitmap);
    }

    public C0559s4(InterfaceC0621u4 interfaceC0621u4) {
        this.a = 1;
        this.b = interfaceC0621u4;
    }
}
