package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class B5 extends AbstractC0683w4 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC0171fg.a);

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC0683w4
    public final Bitmap c(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = AbstractC0244hr.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapJ = interfaceC0621u4.j(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapJ.setHasAlpha(bitmap.hasAlpha());
        AbstractC0244hr.a(bitmap, bitmapJ, matrix);
        return bitmapJ;
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        return obj instanceof B5;
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return -599754482;
    }
}
