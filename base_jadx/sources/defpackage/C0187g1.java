package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187g1 implements Mm {
    public final /* synthetic */ int a;
    public final C0096d2 b;

    public /* synthetic */ C0187g1(C0096d2 c0096d2, int i) {
        this.a = i;
        this.b = c0096d2;
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource((ByteBuffer) obj);
                this.b.getClass();
                return C0096d2.p(sourceCreateSource, i, i2, c0544rk);
            default:
                ImageDecoder.Source sourceCreateSource2 = ImageDecoder.createSource(AbstractC0099d5.b((InputStream) obj));
                this.b.getClass();
                return C0096d2.p(sourceCreateSource2, i, i2, c0544rk);
        }
    }

    @Override // defpackage.Mm
    public final boolean b(Object obj, C0544rk c0544rk) throws IOException {
        switch (this.a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeU = Td.u((List) this.b.b, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeU == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeU == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                C0096d2 c0096d2 = this.b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeT = Td.t((List) c0096d2.b, (InputStream) obj, (C0634uh) c0096d2.c);
                return imageHeaderParser$ImageTypeT == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeT == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }
}
