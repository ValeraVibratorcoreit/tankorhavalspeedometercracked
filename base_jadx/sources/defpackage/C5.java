package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class C5 extends AbstractC0683w4 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC0171fg.a);

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC0683w4
    public final Bitmap c(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap, int i, int i2) {
        Paint paint = AbstractC0244hr.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC0244hr.b(interfaceC0621u4, bitmap, i, i2);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        return obj instanceof C5;
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return -670243078;
    }
}
