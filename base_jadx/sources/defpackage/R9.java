package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class R9 implements InterfaceC0182fr {
    public final InterfaceC0182fr b;
    public final boolean c;

    public R9(InterfaceC0182fr interfaceC0182fr, boolean z) {
        this.b = interfaceC0182fr;
        this.c = z;
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.InterfaceC0182fr
    public final Im b(Context context, Im im, int i, int i2) {
        InterfaceC0621u4 interfaceC0621u4 = a.a(context).a;
        Drawable drawable = (Drawable) im.get();
        C0652v4 c0652v4N = Ud.n(interfaceC0621u4, drawable, i, i2);
        if (c0652v4N != null) {
            Im imB = this.b.b(context, c0652v4N, i, i2);
            if (!imB.equals(c0652v4N)) {
                return new C0652v4(context.getResources(), imB);
            }
            imB.e();
            return im;
        }
        if (!this.c) {
            return im;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (obj instanceof R9) {
            return this.b.equals(((R9) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return this.b.hashCode();
    }
}
