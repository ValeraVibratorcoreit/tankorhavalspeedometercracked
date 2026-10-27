package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Kd implements InterfaceC0182fr {
    public final InterfaceC0182fr b;

    public Kd(InterfaceC0182fr interfaceC0182fr) {
        Ud.l("Argument must not be null", interfaceC0182fr);
        this.b = interfaceC0182fr;
    }

    @Override // defpackage.InterfaceC0171fg
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.InterfaceC0182fr
    public final Im b(Context context, Im im, int i, int i2) {
        Id id = (Id) im.get();
        Im c0652v4 = new C0652v4(a.a(context).a, ((Pd) id.a.b).l);
        InterfaceC0182fr interfaceC0182fr = this.b;
        Im imB = interfaceC0182fr.b(context, c0652v4, i, i2);
        if (!c0652v4.equals(imB)) {
            c0652v4.e();
        }
        ((Pd) id.a.b).c(interfaceC0182fr, (Bitmap) imB.get());
        return im;
    }

    @Override // defpackage.InterfaceC0171fg
    public final boolean equals(Object obj) {
        if (obj instanceof Kd) {
            return this.b.equals(((Kd) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0171fg
    public final int hashCode() {
        return this.b.hashCode();
    }
}
