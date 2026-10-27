package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class V4 implements Mm {
    public final /* synthetic */ int a;
    public final C0559s4 b;

    public V4(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new C0559s4();
                break;
            default:
                this.b = new C0559s4();
                break;
        }
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                return this.b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, c0544rk);
            default:
                return this.b.c(ImageDecoder.createSource(AbstractC0099d5.b((InputStream) obj)), i, i2, c0544rk);
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
}
