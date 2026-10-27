package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class Sb implements Mm {
    public final /* synthetic */ int a;

    public /* synthetic */ Sb(int i) {
        this.a = i;
    }

    @Override // defpackage.Mm
    public final Im a(Object obj, int i, int i2, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                return new C0156f1((File) obj);
            case 1:
                return new C0156f1((Bitmap) obj, 3);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new Jd(drawable, 1);
                }
                return null;
        }
    }

    @Override // defpackage.Mm
    public final /* bridge */ /* synthetic */ boolean b(Object obj, C0544rk c0544rk) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
