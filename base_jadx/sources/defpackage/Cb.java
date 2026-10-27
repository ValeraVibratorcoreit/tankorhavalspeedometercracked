package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Cb implements InterfaceC0416nf {
    @Override // defpackage.InterfaceC0416nf
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.InterfaceC0416nf
    public final int b(InputStream inputStream, C0634uh c0634uh) throws Throwable {
        Bb bb = new Bb(inputStream);
        C0721xb c0721xbC = bb.c("Orientation");
        int iE = 1;
        if (c0721xbC != null) {
            try {
                iE = c0721xbC.e(bb.f);
            } catch (NumberFormatException unused) {
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // defpackage.InterfaceC0416nf
    public final int c(ByteBuffer byteBuffer, C0634uh c0634uh) {
        AtomicReference atomicReference = AbstractC0099d5.a;
        return b(new C0037b5(byteBuffer), c0634uh);
    }

    @Override // defpackage.InterfaceC0416nf
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
