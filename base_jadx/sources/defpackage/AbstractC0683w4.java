package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: renamed from: w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0683w4 implements InterfaceC0182fr {
    @Override // defpackage.InterfaceC0182fr
    public final Im b(Context context, Im im, int i, int i2) {
        if (!Qr.i(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0621u4 interfaceC0621u4 = a.a(context).a;
        Bitmap bitmap = (Bitmap) im.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(interfaceC0621u4, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? im : C0652v4.b(interfaceC0621u4, bitmapC);
    }

    public abstract Bitmap c(InterfaceC0621u4 interfaceC0621u4, Bitmap bitmap, int i, int i2);
}
