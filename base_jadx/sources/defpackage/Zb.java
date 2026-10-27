package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Zb extends AbstractC0683w4 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC0171fg.a);

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC0683w4
    public final Bitmap c(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap, int i, int i2) {
        return AbstractC0244hr.b(interfaceC0621u4, bitmap, i, i2);
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        return obj instanceof Zb;
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return 1572326941;
    }
}
